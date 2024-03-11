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
import o.InterfaceC5605cBp;
import o.InterfaceC5606cBq;

@OriginatingElement(topLevelClass = InterfaceC5606cBq.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public final class PlayerPrefetcher_ActivityComponent_HiltModule {
    @Provides
    public final InterfaceC5606cBq c(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return ((InterfaceC5605cBp) C1642aIw.b((NetflixActivityBase) activity, InterfaceC5605cBp.class)).M();
    }
}
