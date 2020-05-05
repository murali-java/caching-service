package com.example.caching;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.Cache;
import org.springframework.cache.interceptor.*;

public class RedisCacheErrorHandler implements CacheErrorHandler {

    private static Logger logger = LoggerFactory.getLogger(RedisCacheErrorHandler.class);

    @Override
    public void handleCacheGetError(RuntimeException var1, Cache var2, Object var3){
        logger.info("====== Cache Get Error =====");
    }

    @Override
    public void handleCachePutError(RuntimeException var1, Cache var2, Object var3, Object var4){
        logger.info("====== Cache Put Error =====");
    }

    @Override
    public void handleCacheEvictError(RuntimeException var1, Cache var2, Object var3){
        logger.info("====== Cache Evict Error =====");
    }

    @Override
    public void handleCacheClearError(RuntimeException var1, Cache var2){
        logger.info("====== Cache Clear Error =====");
    }
}
