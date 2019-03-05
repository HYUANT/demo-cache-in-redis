package com.yuan.democacheinredis.controller;

import com.yuan.democacheinredis.service.CacheTestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description:
 * @Author: mac
 * @Date: 2019-03-05 16:27
 * @Version: 0.1
 **/
@Slf4j
@RestController
public class CacheTestController {

    @Autowired
    private CacheTestService cacheTestService;

    @GetMapping("/cache")
    public Object cacheGet() {
        return cacheTestService.cacheCacheable();
    }

    @PutMapping("/cache/{newStr}")
    public Object cachePut(@PathVariable("newStr") String newStr) {
        return cacheTestService.cacheCachePut(newStr);
    }

    @DeleteMapping("/cache")
    public Object cacheDel() {
        return cacheTestService.cacheCacheEvict();
    }

}
