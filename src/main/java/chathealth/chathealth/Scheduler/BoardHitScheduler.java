package chathealth.chathealth.Scheduler;

import chathealth.chathealth.service.BoardHitService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Set;

@Slf4j
@Service
@RequiredArgsConstructor
public class BoardHitScheduler {

    private final StringRedisTemplate redisTemplate;
    private final BoardHitService boardHitService;

    @Scheduled(fixedRate = 60000) // 1분마다 실행
    public void syncHitsToDB() {
        log.info("조회수 동기화 작업 시작");
        Set<String> keys = redisTemplate.keys("boardHit:*");
        if (keys != null && !keys.isEmpty()) {
            for (String key : keys) {
                try {
                    // boardId 추출
                    Long boardId = Long.parseLong(key.split(":")[1]);

                    // 조회수 값 가져오기 (null일 경우 기본값 0으로 설정)
                    String hitValue = redisTemplate.opsForValue().get(key);

                    Long hit = (hitValue != null) ? Long.parseLong(hitValue) : 0L;

                    // DB 업데이트
                    boardHitService.updateHitCount(boardId, hit);

                    // Redis 키 삭제
                    log.info("조회수 동기화 작업 boardId: " + boardId + " 조회수: " + hit + " 동기화 완료");
                    redisTemplate.delete(key);
                } catch (Exception e) {
                    // 특정 키 처리 실패 시 로그 출력
                    log.error("조회수 동기화 실패 key: " + key + " - " + e.getMessage());
                }
            }
        }
    }

}
