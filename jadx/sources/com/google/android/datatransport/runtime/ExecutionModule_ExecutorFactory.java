package com.google.android.datatransport.runtime;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class ExecutionModule_ExecutorFactory implements Factory<Executor> {
    private static final ExecutionModule_ExecutorFactory INSTANCE = new ExecutionModule_ExecutorFactory();

    public static ExecutionModule_ExecutorFactory create() {
        return INSTANCE;
    }

    @Override // javax.inject.Provider
    public Executor get() {
        return executor();
    }

    public static Executor executor() {
        return (Executor) Preconditions.checkNotNull(ExecutionModule.executor(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
