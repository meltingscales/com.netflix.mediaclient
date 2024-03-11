package com.netflix.mediaclient.uxconfigclientcapabilities.api;

import android.app.Activity;
import com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.codegen.OriginatingElement;
import o.C1642aIw;
import o.C8632dsu;
import o.InterfaceC8351dij;
import o.InterfaceC8355din;

@OriginatingElement(topLevelClass = InterfaceC8351dij.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes5.dex */
public final class UxConfigClientCapabilities_ActivityComponent_HiltModule {
    @Provides
    public final InterfaceC8351dij d(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return ((InterfaceC8355din) C1642aIw.b((NetflixActivityBase) activity, InterfaceC8355din.class)).O();
    }
}
