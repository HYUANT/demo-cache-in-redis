package com.yuan.democacheinredis.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: mac
 * @Date: 2019-03-05 16:29
 * @Version: 0.1
 **/
@Slf4j
@Service
public class CacheTestService {

    @Cacheable(value = "myCache", key = "1")
    public List<String> cacheCacheable() {
        log.info("将数据存放在myCache缓存中");
        // 下面数据一般从数据库获取，这里只是演示说明，就不使用数据库了
        List<String> data = new ArrayList<>();
        data.add("hello");
        data.add("SpringBoot");
        return data;
    }

    @CachePut(value = "myCache", key = "1")
    public List<String> cacheCachePut(String newStr) {
        log.info("添加newStr至myCache中，并更新myCache缓存");
        // 如果使用数据库的话，更新数据时，需要同步更新数据库，这里只是演示说明，就不使用数据库了
        List<String> data = new ArrayList<>();
        data.add("hello");
        data.add("SpringBoot");
        data.add(newStr);
        return data;
    }

    @CacheEvict(value = "myCache", key = "1")
    public String cacheCacheEvict() {
        log.info("清空myCache缓存");
        // 清空在Redis或内存中的缓存数据
        return "清空myCache缓存";
    }

}
