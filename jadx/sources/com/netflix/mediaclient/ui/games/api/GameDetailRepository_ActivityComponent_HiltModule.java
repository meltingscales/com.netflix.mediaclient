package com.netflix.mediaclient.ui.games.api;

import android.app.Activity;
import com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.codegen.OriginatingElement;
import o.C1642aIw;
import o.C8632dsu;
import o.bNF;
import o.bNO;

@OriginatingElement(topLevelClass = bNF.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public final class GameDetailRepository_ActivityComponent_HiltModule {
    @Provides
    public final bNF d(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return ((bNO) C1642aIw.b((NetflixActivityBase) activity, bNO.class)).u();
    }
}
