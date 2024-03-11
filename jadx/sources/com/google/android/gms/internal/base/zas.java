package com.google.android.gms.internal.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class zas implements zaq {
    private zas() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zas(zar zarVar) {
    }

    @Override // com.google.android.gms.internal.base.zaq
    public final ExecutorService zaa(ThreadFactory threadFactory, int i) {
        return zac(1, threadFactory, 1);
    }

    public final ExecutorService zac(int i, ThreadFactory threadFactory, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
