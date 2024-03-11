package com.netflix.mediaclient.autologin.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import o.InterfaceC1239Ua;
import o.TX;

@OriginatingElement(topLevelClass = TX.class)
@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes6.dex */
public interface AutoLoginTokenProviderImpl_HiltBindingModule {
    @Binds
    InterfaceC1239Ua a(TX tx);
}
