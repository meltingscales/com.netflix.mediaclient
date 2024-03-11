package com.netflix.mediaclient.commanderinfra.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.codegen.OriginatingElement;
import o.C1302Wl;
import o.InterfaceC1285Vu;

@OriginatingElement(topLevelClass = C1302Wl.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public interface BifInfraImpl_HiltBindingModule {
    @ActivityScoped
    @Binds
    InterfaceC1285Vu d(C1302Wl c1302Wl);
}
