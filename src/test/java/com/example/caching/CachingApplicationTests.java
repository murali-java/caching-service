package com.example.caching;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.interceptor.CacheErrorHandler;
import org.springframework.context.annotation.Import;

@Import(TestCacheConfig.class)
@SpringBootTest
class CachingApplicationTests {

	@Autowired
	private CachingApi api;

	@Autowired
	private CacheErrorHandler errorHandler;

	@Test
	void contextLoadsAndTestCacheGetError() {
		api.testCaching();
		Mockito.verify(errorHandler, Mockito.times(1)).handleCacheGetError(Mockito.any(), Mockito.any(), Mockito.any());
	}

	@Test
	void contextLoadsAndTestCachePutError() {
		api.testPutCache();
		Mockito.verify(errorHandler, Mockito.times(1)).handleCachePutError(Mockito.any(), Mockito.any(), Mockito.any(), Mockito.any());
	}

	@Test
	void contextLoadsAndTestCacheEvictError() {
		api.testEvictCache();
		Mockito.verify(errorHandler, Mockito.times(1)).handleCacheEvictError(Mockito.any(), Mockito.any(), Mockito.any());
	}

}
