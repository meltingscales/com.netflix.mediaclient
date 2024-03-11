package com.netflix.mediaclient.ui.detailspage.api;

import android.app.Activity;
import com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.codegen.OriginatingElement;
import o.C1642aIw;
import o.C8632dsu;
import o.InterfaceC3660bGb;
import o.InterfaceC3663bGe;

@OriginatingElement(topLevelClass = InterfaceC3663bGe.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes4.dex */
public final class DetailsPageRepository_ActivityComponent_HiltModule {
    @Provides
    public final InterfaceC3663bGe c(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return ((InterfaceC3660bGb) C1642aIw.b((NetflixActivityBase) activity, InterfaceC3660bGb.class)).v();
    }
}
