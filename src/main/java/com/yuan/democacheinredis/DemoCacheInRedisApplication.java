package com.yuan.democacheinredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class DemoCacheInRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoCacheInRedisApplication.class, args);
    }

}
