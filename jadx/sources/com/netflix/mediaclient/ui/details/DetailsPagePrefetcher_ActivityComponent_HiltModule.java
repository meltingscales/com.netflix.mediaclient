package com.netflix.mediaclient.ui.details;

import android.app.Activity;
import com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.codegen.OriginatingElement;
import o.C1642aIw;
import o.C8632dsu;
import o.InterfaceC3645bFn;
import o.InterfaceC3649bFr;

@OriginatingElement(topLevelClass = InterfaceC3645bFn.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes4.dex */
public final class DetailsPagePrefetcher_ActivityComponent_HiltModule {
    @Provides
    public final InterfaceC3645bFn a(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return ((InterfaceC3649bFr) C1642aIw.b((NetflixActivityBase) activity, InterfaceC3649bFr.class)).x();
    }
}
