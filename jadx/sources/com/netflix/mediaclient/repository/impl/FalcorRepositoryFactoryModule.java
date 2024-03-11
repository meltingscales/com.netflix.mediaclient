package com.netflix.mediaclient.repository.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import o.aLN;
import o.aLY;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes6.dex */
public interface FalcorRepositoryFactoryModule {
    @Binds
    aLN d(aLY aly);
}
