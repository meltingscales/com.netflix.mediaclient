package com.netflix.mediaclient.netflixui.module;

import com.netflix.mediaclient.android.activity.UiServices;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import o.C5101bsR;
import o.InterfaceC1738aMk;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes6.dex */
public interface NetflixUiModule {
    @Binds
    InterfaceC1738aMk b(UiServices uiServices);

    @Binds
    ServiceManager c(C5101bsR c5101bsR);
}
