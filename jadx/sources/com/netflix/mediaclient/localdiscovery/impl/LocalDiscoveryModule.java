package com.netflix.mediaclient.localdiscovery.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import o.aGT;
import o.aGW;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes6.dex */
public interface LocalDiscoveryModule {
    @Binds
    aGT d(aGW agw);
}
