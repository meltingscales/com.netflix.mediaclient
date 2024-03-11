package com.netflix.mediaclient.ui.profile.impl;

import android.app.Activity;
import com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.codegen.OriginatingElement;
import o.C1642aIw;
import o.C5845cKm;
import o.C8632dsu;
import o.InterfaceC5853cKu;

@OriginatingElement(topLevelClass = C5845cKm.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes4.dex */
public final class MyNetflixTab_ActivityComponent_HiltModule {
    @Provides
    public final C5845cKm d(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return ((InterfaceC5853cKu) C1642aIw.b((NetflixActivityBase) activity, InterfaceC5853cKu.class)).H();
    }
}
