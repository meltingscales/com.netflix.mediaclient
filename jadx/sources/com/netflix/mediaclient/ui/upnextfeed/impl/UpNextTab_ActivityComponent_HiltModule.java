package com.netflix.mediaclient.ui.upnextfeed.impl;

import android.app.Activity;
import com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.codegen.OriginatingElement;
import o.C1642aIw;
import o.C7904daM;
import o.C8632dsu;
import o.InterfaceC7908daQ;

@OriginatingElement(topLevelClass = C7904daM.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes5.dex */
public final class UpNextTab_ActivityComponent_HiltModule {
    @Provides
    public final C7904daM e(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return ((InterfaceC7908daQ) C1642aIw.b((NetflixActivityBase) activity, InterfaceC7908daQ.class)).Q();
    }
}
