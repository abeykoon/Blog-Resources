package org.wso2.carbon.sample.util;

import javax.cache.Cache;
import javax.cache.CacheConfiguration;
import javax.cache.CacheManager;
import javax.cache.Caching;
import java.util.concurrent.TimeUnit;

public class HazelcastCache {

    private static final String cacheName = "HAZELCAST_MEMORY_CACHE";
    private static final String cacheManagerName = "WSO2_CACHE_MANAGER";
    private static Cache<String, String> cache = null;

    public static void init() {

        CacheManager cacheManager = Caching.getCacheManagerFactory().getCacheManager(
                cacheManagerName);
        cache = cacheManager.getCache(cacheName);
        if (null == cache) {
            cache = cacheManager
                    .<String, String>createCacheBuilder(cacheName)
                    .setExpiry(
                            CacheConfiguration.ExpiryType.MODIFIED,
                            new CacheConfiguration.Duration(TimeUnit.MINUTES,
                                    10)).setStoreByValue(false).build();
        }
    }

    public static void write(String key, String value) {
        cache.put(key, value);
    }

    public static String read(String key) {
        String value = cache.get(key);
        return value;
    }
}
