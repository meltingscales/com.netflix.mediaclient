package com.netflix.mediaclient.commanderinfra.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;
import o.C1304Wn;
import o.InterfaceC1300Wj;

@OriginatingElement(topLevelClass = C1304Wn.class)
@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes6.dex */
public interface EpisodeSelectorRepositoryImpl_HiltBindingModule {
    @Singleton
    @Binds
    InterfaceC1300Wj b(C1304Wn c1304Wn);
}
