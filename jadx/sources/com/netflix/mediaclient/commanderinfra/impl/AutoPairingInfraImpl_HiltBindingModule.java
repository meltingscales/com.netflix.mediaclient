package com.netflix.mediaclient.commanderinfra.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.codegen.OriginatingElement;
import o.C1296Wf;
import o.InterfaceC1286Vv;

@OriginatingElement(topLevelClass = C1296Wf.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public interface AutoPairingInfraImpl_HiltBindingModule {
    @ActivityScoped
    @Binds
    InterfaceC1286Vv a(C1296Wf c1296Wf);
}
