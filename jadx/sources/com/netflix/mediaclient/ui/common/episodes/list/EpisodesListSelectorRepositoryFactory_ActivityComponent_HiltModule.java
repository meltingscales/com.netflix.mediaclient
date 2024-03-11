package com.netflix.mediaclient.ui.common.episodes.list;

import android.app.Activity;
import com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.codegen.OriginatingElement;
import o.C1642aIw;
import o.C8632dsu;
import o.InterfaceC3619bEo;
import o.InterfaceC3623bEs;

@OriginatingElement(topLevelClass = InterfaceC3619bEo.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes4.dex */
public final class EpisodesListSelectorRepositoryFactory_ActivityComponent_HiltModule {
    @Provides
    public final InterfaceC3619bEo a(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return ((InterfaceC3623bEs) C1642aIw.b((NetflixActivityBase) activity, InterfaceC3623bEs.class)).y();
    }
}
