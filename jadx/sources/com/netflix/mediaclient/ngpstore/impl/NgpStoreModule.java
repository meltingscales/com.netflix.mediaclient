package com.netflix.mediaclient.ngpstore.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import o.aIR;
import o.aIS;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes6.dex */
public interface NgpStoreModule {
    @Binds
    aIR c(aIS ais);
}
