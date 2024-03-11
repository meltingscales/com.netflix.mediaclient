package com.netflix.mediaclient.ui.player.v2;

import android.app.Activity;
import com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.codegen.OriginatingElement;
import o.C1642aIw;
import o.C8632dsu;
import o.InterfaceC5598cBi;
import o.InterfaceC5602cBm;

@OriginatingElement(topLevelClass = InterfaceC5602cBm.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes4.dex */
public final class PlayerPrefetchRepository_ActivityComponent_HiltModule {
    @Provides
    public final InterfaceC5602cBm a(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return ((InterfaceC5598cBi) C1642aIw.b((NetflixActivityBase) activity, InterfaceC5598cBi.class)).N();
    }
}
