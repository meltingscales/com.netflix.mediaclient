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
import o.bNL;
import o.bNQ;

@OriginatingElement(topLevelClass = bNL.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes4.dex */
public final class GamesAssetFetcher_ActivityComponent_HiltModule {
    @Provides
    public final bNL c(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return ((bNQ) C1642aIw.b((NetflixActivityBase) activity, bNQ.class)).w();
    }
}
