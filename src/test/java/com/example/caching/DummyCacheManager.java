package com.example.caching;

import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;

import java.util.Collection;

public class DummyCacheManager implements CacheManager {

    @Override
    public Cache getCache(String var1) {
        return new ErrorCache("test");
    }

    public Collection<String> getCacheNames(){
        return null;
    }
}
