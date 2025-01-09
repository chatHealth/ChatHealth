package chathealth.chathealth.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.time.Duration;

@Service
@RequiredArgsConstructor
public class RedisService {

    private final RedisTemplate<String, Object> redisTemplate;

    public boolean isAlreadyViewed(Long memberId, Long boardId) {
        String key = "viewed:" + memberId + ":" + boardId;

        Boolean isViewed = redisTemplate.hasKey(key);
        if (Boolean.FALSE.equals(isViewed)) {
            redisTemplate.opsForValue().set(key, "1", Duration.ofHours(24));
            return false;
        }

        return true;
    }
}
