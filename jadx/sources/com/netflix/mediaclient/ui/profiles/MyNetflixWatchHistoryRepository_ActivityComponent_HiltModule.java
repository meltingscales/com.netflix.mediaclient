package com.netflix.mediaclient.ui.profiles;

import android.app.Activity;
import com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.codegen.OriginatingElement;
import o.C1642aIw;
import o.C8632dsu;
import o.cMK;
import o.cMM;

@OriginatingElement(topLevelClass = cMK.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes4.dex */
public final class MyNetflixWatchHistoryRepository_ActivityComponent_HiltModule {
    @Provides
    public final cMK e(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return ((cMM) C1642aIw.b((NetflixActivityBase) activity, cMM.class)).I();
    }
}
