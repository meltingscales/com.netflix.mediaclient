package com.netflix.mediaclient.ui.home.api;

import android.app.Activity;
import com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.codegen.OriginatingElement;
import o.C1642aIw;
import o.C8632dsu;
import o.InterfaceC3993bSg;
import o.InterfaceC3999bSm;

@OriginatingElement(topLevelClass = InterfaceC3993bSg.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes4.dex */
public final class Home_ActivityComponent_HiltModule {
    @Provides
    public final InterfaceC3993bSg d(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return ((InterfaceC3999bSm) C1642aIw.b((NetflixActivityBase) activity, InterfaceC3999bSm.class)).z();
    }
}
