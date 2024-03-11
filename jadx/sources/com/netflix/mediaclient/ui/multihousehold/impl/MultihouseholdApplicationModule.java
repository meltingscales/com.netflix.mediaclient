package com.netflix.mediaclient.ui.multihousehold.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;
import o.C6753cjJ;
import o.InterfaceC6748cjE;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes6.dex */
public interface MultihouseholdApplicationModule {
    @Singleton
    @Binds
    InterfaceC6748cjE a(C6753cjJ c6753cjJ);
}
