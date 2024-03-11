package com.netflix.mediaclient.sampling.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import o.C1728aMa;
import o.InterfaceC1730aMc;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes6.dex */
public interface SamplingModule {
    @Binds
    InterfaceC1730aMc c(C1728aMa c1728aMa);
}
