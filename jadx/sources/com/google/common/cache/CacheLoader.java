package com.google.common.cache;

/* loaded from: classes5.dex */
public abstract class CacheLoader<K, V> {

    /* loaded from: classes5.dex */
    public static final class InvalidCacheLoadException extends RuntimeException {
    }

    protected CacheLoader() {
    }

    /* loaded from: classes5.dex */
    public static final class UnsupportedLoadingOperationException extends UnsupportedOperationException {
        UnsupportedLoadingOperationException() {
        }
    }
}
