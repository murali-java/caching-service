package com.example.caching;

import org.mockito.Mockito;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.CacheErrorHandler;
import org.springframework.context.annotation.Bean;

@EnableCaching
@TestConfiguration
public class TestCacheConfig extends CachingConfigurerSupport {

    @Bean
    public CacheManager cacheManager(){
        return new DummyCacheManager();
    }
    @Bean
    public CacheErrorHandler errorCacheHandler(){
        return Mockito.spy(new RedisCacheErrorHandler());
    }


    @Override
    public CacheErrorHandler errorHandler() {
        return errorCacheHandler();
    }
}
