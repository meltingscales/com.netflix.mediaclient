package com.netflix.mediaclient.clock.impl;

import android.os.SystemClock;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import j$.time.Instant;
import javax.inject.Singleton;
import o.C8632dsu;
import o.InterfaceC1270Vf;

@Singleton
/* loaded from: classes3.dex */
public final class ClockImpl implements InterfaceC1270Vf {

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface ClockModule {
        @Binds
        InterfaceC1270Vf d(ClockImpl clockImpl);
    }

    @Override // o.InterfaceC1270Vf
    public long c() {
        return System.currentTimeMillis();
    }

    @Override // o.InterfaceC1270Vf
    public long d() {
        return System.nanoTime();
    }

    @Override // o.InterfaceC1270Vf
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // o.InterfaceC1270Vf
    public Instant e() {
        Instant a = Instant.a();
        C8632dsu.a(a, "");
        return a;
    }
}
