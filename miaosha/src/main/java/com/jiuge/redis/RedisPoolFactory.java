package com.jiuge.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisPool;
@Service
public class RedisPoolFactory {
    @Autowired
    RedisConfig redisConfig;
    @Bean
    public JedisPool jedisPoolFactory(){
        return new JedisPool();
    }
}
