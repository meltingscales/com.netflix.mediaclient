package com.netflix.mediaclient.playintegrity.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import o.C1693aKt;
import o.InterfaceC1692aKs;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes6.dex */
public interface PlayIntegrityModule {
    @Binds
    InterfaceC1692aKs c(C1693aKt c1693aKt);
}
