package com.netflix.mediaclient.ui.mylist.api;

import android.app.Activity;
import com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.codegen.OriginatingElement;
import o.C1642aIw;
import o.C8632dsu;
import o.InterfaceC6908cmF;
import o.InterfaceC6910cmH;

@OriginatingElement(topLevelClass = InterfaceC6910cmH.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public final class MyListWatcher_ActivityComponent_HiltModule {
    @Provides
    public final InterfaceC6910cmH c(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return ((InterfaceC6908cmF) C1642aIw.b((NetflixActivityBase) activity, InterfaceC6908cmF.class)).F();
    }
}
