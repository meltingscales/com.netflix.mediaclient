package com.netflix.mediaclient.cllogger.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import o.C1266Vb;
import o.InterfaceC1267Vc;

@OriginatingElement(topLevelClass = C1266Vb.class)
@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes6.dex */
public interface RealCLLogger_HiltBindingModule {
    @Binds
    InterfaceC1267Vc b(C1266Vb c1266Vb);
}
