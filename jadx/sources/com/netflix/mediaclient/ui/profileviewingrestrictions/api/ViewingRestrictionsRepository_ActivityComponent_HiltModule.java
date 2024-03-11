package com.netflix.mediaclient.ui.profileviewingrestrictions.api;

import android.app.Activity;
import com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.codegen.OriginatingElement;
import o.C1642aIw;
import o.C8632dsu;
import o.InterfaceC5984cPr;
import o.InterfaceC5988cPv;

@OriginatingElement(topLevelClass = InterfaceC5984cPr.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes4.dex */
public final class ViewingRestrictionsRepository_ActivityComponent_HiltModule {
    @Provides
    public final InterfaceC5984cPr c(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return ((InterfaceC5988cPv) C1642aIw.b((NetflixActivityBase) activity, InterfaceC5988cPv.class)).R();
    }
}
