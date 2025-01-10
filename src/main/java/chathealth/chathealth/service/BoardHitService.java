package chathealth.chathealth.service;

import chathealth.chathealth.repository.board.BoardRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

@Service
@RequiredArgsConstructor
@Slf4j
public class BoardHitService {

    private final StringRedisTemplate redisTemplate;
    private final BoardRepository boardRepository;

    // 로그인 사용자
    public boolean isUniqueView(Long boardId, Long memberId) {
        String key = "boardViewed:" + boardId + ":" + memberId;
        Boolean isNewView = redisTemplate.opsForValue().setIfAbsent(key, "1", 24, TimeUnit.HOURS);
        return Boolean.TRUE.equals(isNewView);
    }

    // 비로그인 사용자
    public boolean isUniqueView(Long boardId, String ipAddr){
        String key = "boardViewed:" + boardId + ":" + ipAddr;
        Boolean isNewView = redisTemplate.opsForValue().setIfAbsent(key, "1", 24, TimeUnit.HOURS);
        return Boolean.TRUE.equals(isNewView);
    }

    public void increaseHit(Long boardId, Long memberId, String ipAddr){
        boolean isUnique;
        if (memberId != 0) {
            isUnique = isUniqueView(boardId, memberId);
        } else {
            isUnique = isUniqueView(boardId, ipAddr);
        }

        if(isUnique){
            String key = "boardHit:" + boardId;
            redisTemplate.opsForValue().increment(key);
        }
    }

    @Transactional
    public void updateHitCount(Long boardId, Long hit) {
        boardRepository.updateHitCount(boardId, hit);
    }
}
