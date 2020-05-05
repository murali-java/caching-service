package com.example.caching;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CachingApi {

    @GetMapping("/hello")
    public String hello(){
        return "Hello MicroService";
    }

    @Cacheable(cacheNames = "test")
    @GetMapping("/testCaching1")
    public String testCaching(){
        return "test";
    }

    @CacheEvict(cacheNames = "test")
    @GetMapping("/testCaching2")
    public String testEvictCache(){
        return "test";
    }

    @CachePut(cacheNames = "test")
    @GetMapping("/testCaching3")
    public String testPutCache(){
        return "test";
    }
}
