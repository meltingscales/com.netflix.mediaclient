package com.netflix.mediaclient.ui.offline;

import android.app.Activity;
import com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.codegen.OriginatingElement;
import o.C1642aIw;
import o.C7296ctY;
import o.C8632dsu;
import o.InterfaceC7354cud;

@OriginatingElement(topLevelClass = C7296ctY.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes4.dex */
public final class OfflineTab_ActivityComponent_HiltModule {
    @Provides
    public final C7296ctY b(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return ((InterfaceC7354cud) C1642aIw.b((NetflixActivityBase) activity, InterfaceC7354cud.class)).E();
    }
}
