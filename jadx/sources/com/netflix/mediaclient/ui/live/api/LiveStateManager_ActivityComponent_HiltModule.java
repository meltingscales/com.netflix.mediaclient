package com.netflix.mediaclient.ui.live.api;

import android.app.Activity;
import com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.codegen.OriginatingElement;
import o.C1642aIw;
import o.C8632dsu;
import o.bZH;
import o.bZI;

@OriginatingElement(topLevelClass = bZI.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes4.dex */
public final class LiveStateManager_ActivityComponent_HiltModule {
    @Provides
    public final bZI c(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return ((bZH) C1642aIw.b((NetflixActivityBase) activity, bZH.class)).D();
    }
}
