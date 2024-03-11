package com.google.android.gms.internal.tflite_java;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
enum zzf implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
