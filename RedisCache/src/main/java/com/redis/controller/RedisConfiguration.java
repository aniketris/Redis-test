package com.redis.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.lettuce.core.RedisClient;
import io.lettuce.core.RedisURI;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.pubsub.StatefulRedisPubSubConnection;
import io.lettuce.core.resource.ClientResources;
import io.lettuce.core.resource.DefaultClientResources;

@Configuration
public class RedisConfiguration {
	
//
//    @Bean(destroyMethod = "shutdown")
//    ClientResources clientResources() {
//        return DefaultClientResources.create();
//    }
//
//    @Bean(destroyMethod = "shutdown")
//    RedisClient redisClient(ClientResources clientResources) {
//        return RedisClient.create(clientResources, RedisURI.create("localhost", 6379));
//    }

//    @Bean(destroyMethod = "close")
//    StatefulRedisConnection<String, String> connection(RedisClient redisClient) {
//    	
//    	
//        return redisClient.connect();
//    }

	

}