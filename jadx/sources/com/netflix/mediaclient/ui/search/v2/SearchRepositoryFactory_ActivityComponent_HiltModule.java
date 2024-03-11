package com.netflix.mediaclient.ui.search.v2;

import android.app.Activity;
import com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.codegen.OriginatingElement;
import o.C1642aIw;
import o.C8632dsu;
import o.InterfaceC6083cTf;
import o.InterfaceC6088cTk;

@OriginatingElement(topLevelClass = InterfaceC6083cTf.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes4.dex */
public final class SearchRepositoryFactory_ActivityComponent_HiltModule {
    @Provides
    public final InterfaceC6083cTf d(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return ((InterfaceC6088cTk) C1642aIw.b((NetflixActivityBase) activity, InterfaceC6088cTk.class)).J();
    }
}
