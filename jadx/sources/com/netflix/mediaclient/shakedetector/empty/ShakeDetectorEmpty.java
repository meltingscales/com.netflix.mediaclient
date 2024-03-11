package com.netflix.mediaclient.shakedetector.empty;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import o.C8632dsu;
import o.InterfaceC5285bvq;

/* loaded from: classes4.dex */
public final class ShakeDetectorEmpty implements InterfaceC5285bvq {

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface ShakeDetectorModule {
        @Binds
        InterfaceC5285bvq a(ShakeDetectorEmpty shakeDetectorEmpty);
    }

    @Override // o.InterfaceC5285bvq
    public void c() {
    }

    @Override // o.InterfaceC5285bvq
    public void c(Activity activity) {
        C8632dsu.c((Object) activity, "");
    }
}
