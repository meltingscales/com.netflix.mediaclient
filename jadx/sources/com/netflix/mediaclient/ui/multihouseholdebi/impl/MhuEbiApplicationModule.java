package com.netflix.mediaclient.ui.multihouseholdebi.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;
import o.C6769cjZ;
import o.InterfaceC6767cjX;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes6.dex */
public interface MhuEbiApplicationModule {
    @Singleton
    @Binds
    InterfaceC6767cjX d(C6769cjZ c6769cjZ);
}
