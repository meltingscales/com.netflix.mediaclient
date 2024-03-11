package com.netflix.mediaclient.ui.adsplan.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;
import o.InterfaceC5304bwI;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes6.dex */
public interface AdsPlanApplicationModule {
    @Singleton
    @Binds
    InterfaceC5304bwI a(AdsPlanApplicationImpl adsPlanApplicationImpl);
}
