package com.example.caching;

import org.springframework.cache.support.NoOpCache;
import org.springframework.lang.Nullable;

public class ErrorCache extends NoOpCache {

    public ErrorCache(String name){
        super(name);
    }

    @Override
    public ValueWrapper get(Object key){
        throw new RuntimeException();
    }

    @Override
    public void put(Object key, @Nullable Object value) {
        throw new RuntimeException();
    }

    @Override
    public void evict(Object key) {
        throw new RuntimeException();
    }
}
