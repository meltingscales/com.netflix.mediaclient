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
import o.InterfaceC6909cmG;
import o.InterfaceC6912cmJ;

@OriginatingElement(topLevelClass = InterfaceC6909cmG.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public final class RemindMeWatcher_ActivityComponent_HiltModule {
    @Provides
    public final InterfaceC6909cmG d(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return ((InterfaceC6912cmJ) C1642aIw.b((NetflixActivityBase) activity, InterfaceC6912cmJ.class)).L();
    }
}
