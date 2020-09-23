package com.zoomride.config;

import com.zoomride.serialzer.MyStringRedisSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @Project : elite-tour
 * @Author : Bohan Xiao
 * @Create : 2020-09-23
 **/

@Configuration
public class RedisConfig {

    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory){

        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(redisConnectionFactory);

        StringRedisSerializer stringSerializer = new StringRedisSerializer();
        MyStringRedisSerializer myStringRedisSerializer = new MyStringRedisSerializer();

        template.setKeySerializer(stringSerializer);
        template.setValueSerializer(myStringRedisSerializer);
        template.setHashKeySerializer(stringSerializer);
        template.setHashValueSerializer(myStringRedisSerializer);

        return template;
    }
}
