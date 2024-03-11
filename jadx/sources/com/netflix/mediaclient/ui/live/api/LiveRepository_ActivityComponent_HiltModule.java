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
import o.bZB;
import o.bZJ;

@OriginatingElement(topLevelClass = bZB.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public final class LiveRepository_ActivityComponent_HiltModule {
    @Provides
    public final bZB c(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return ((bZJ) C1642aIw.b((NetflixActivityBase) activity, bZJ.class)).A();
    }
}
