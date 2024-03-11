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
import o.InterfaceC5603cBn;
import o.InterfaceC5609cBt;

@OriginatingElement(topLevelClass = InterfaceC5603cBn.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes4.dex */
public final class PlayerRepositoryFactory_ActivityComponent_HiltModule {
    @Provides
    public final InterfaceC5603cBn b(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return ((InterfaceC5609cBt) C1642aIw.b((NetflixActivityBase) activity, InterfaceC5609cBt.class)).K();
    }
}
