package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public interface ListeningExecutorService extends ExecutorService {
    @Override // java.util.concurrent.ExecutorService
    ListenableFuture<?> submit(Runnable runnable);

    @Override // java.util.concurrent.ExecutorService
    <T> ListenableFuture<T> submit(Runnable runnable, T t);

    @Override // java.util.concurrent.ExecutorService
    <T> ListenableFuture<T> submit(Callable<T> callable);

    @Override // java.util.concurrent.ExecutorService
    /* bridge */ /* synthetic */ default Future submit(Runnable runnable, Object obj) {
        return submit(runnable, (Runnable) obj);
    }
}
