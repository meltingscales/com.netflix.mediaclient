package com.netflix.mediaclient.ui.mssi.impl;

import android.content.Context;
import com.netflix.mediaclient.service.user.UserAgent;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import o.AbstractApplicationC1040Mh;
import o.C8632dsu;
import o.InterfaceC5283bvo;
import o.aCE;
import o.aCG;
import o.aCI;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes4.dex */
public final class GameControllerModule {
    @Provides
    public final aCE d(@ApplicationContext Context context, aCI aci) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) aci, "");
        UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
        InterfaceC5283bvo j = k != null ? k.j() : null;
        return j != null ? aCG.b.e(context, j) : aci;
    }
}
