package com.netflix.mediaclient.buildconfig.fields.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;
import o.C1254Up;
import o.InterfaceC1248Uj;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes6.dex */
public interface BuildPropertiesModule {
    @Singleton
    @Binds
    InterfaceC1248Uj c(C1254Up c1254Up);
}
