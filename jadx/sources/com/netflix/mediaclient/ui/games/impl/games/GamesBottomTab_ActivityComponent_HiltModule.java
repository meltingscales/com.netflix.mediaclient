package com.netflix.mediaclient.ui.games.impl.games;

import android.app.Activity;
import com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.codegen.OriginatingElement;
import o.C1642aIw;
import o.bOS;
import o.bOT;

@OriginatingElement(topLevelClass = bOT.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes4.dex */
public class GamesBottomTab_ActivityComponent_HiltModule {
    @Provides
    public bOT a(Activity activity) {
        return ((bOS) C1642aIw.b((NetflixActivityBase) activity, bOS.class)).B();
    }
}
