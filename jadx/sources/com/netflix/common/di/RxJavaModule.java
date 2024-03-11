package com.netflix.common.di;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import o.C8632dsu;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes3.dex */
public final class RxJavaModule {
    @Provides
    public final Scheduler d() {
        Scheduler io2 = Schedulers.io();
        C8632dsu.a(io2, "");
        return io2;
    }

    @Provides
    public final Scheduler e() {
        return AndroidSchedulers.mainThread();
    }

    @Provides
    public final Scheduler c() {
        Scheduler computation = Schedulers.computation();
        C8632dsu.a(computation, "");
        return computation;
    }

    @Provides
    public final Scheduler a() {
        Scheduler single = Schedulers.single();
        C8632dsu.a(single, "");
        return single;
    }
}
