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

    public boolean isUniqueView(Long boardId, Long memberId) {
        String key = "boardViewed:" + boardId + ":" + memberId;
        Boolean isNewView = redisTemplate.opsForValue().setIfAbsent(key, "1", 24, TimeUnit.HOURS);
        return Boolean.TRUE.equals(isNewView);
    }

    public void increaseHit(Long boardId, Long memberId){
        if (isUniqueView(boardId, memberId)) {
            String key = "boardHit:" + boardId;
            redisTemplate.opsForValue().increment(key);
        }
    }

    @Transactional
    public void updateHitCount(Long boardId, Long hit) {
        boardRepository.updateHitCount(boardId, hit);
    }
}
