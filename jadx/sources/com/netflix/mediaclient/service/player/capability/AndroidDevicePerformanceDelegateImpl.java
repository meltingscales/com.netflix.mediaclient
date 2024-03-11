package com.netflix.mediaclient.service.player.capability;

import android.content.Context;
import androidx.core.performance.play.services.PlayServicesDevicePerformance;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.C8632dsu;
import o.TU;

@Singleton
/* loaded from: classes3.dex */
public final class AndroidDevicePerformanceDelegateImpl implements TU {
    private final PlayServicesDevicePerformance a;
    private final Context b;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface AndroidDevicePerformanceModule {
        @Binds
        TU e(AndroidDevicePerformanceDelegateImpl androidDevicePerformanceDelegateImpl);
    }

    @Inject
    public AndroidDevicePerformanceDelegateImpl(@ApplicationContext Context context) {
        C8632dsu.c((Object) context, "");
        this.b = context;
        this.a = new PlayServicesDevicePerformance(context);
    }

    @Override // o.TU
    public boolean b() {
        return TU.d.e(this);
    }

    @Override // o.TU
    public int e() {
        return this.a.getMediaPerformanceClass();
    }
}
