package com.netflix.mediaclient.ui.home.impl;

import android.app.Activity;
import com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.codegen.OriginatingElement;
import o.C1642aIw;
import o.C8632dsu;
import o.InterfaceC4014bTa;
import o.bSZ;

@OriginatingElement(topLevelClass = bSZ.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes4.dex */
public final class HomeTab_ActivityComponent_HiltModule {
    @Provides
    public final bSZ b(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return ((InterfaceC4014bTa) C1642aIw.b((NetflixActivityBase) activity, InterfaceC4014bTa.class)).C();
    }
}
