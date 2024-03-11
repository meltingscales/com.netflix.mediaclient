package com.netflix.mediaclient.commanderinfra.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.codegen.OriginatingElement;
import o.C1301Wk;
import o.InterfaceC1290Vz;

@OriginatingElement(topLevelClass = C1301Wk.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public interface CommanderUiInfraImpl_HiltBindingModule {
    @ActivityScoped
    @Binds
    InterfaceC1290Vz d(C1301Wk c1301Wk);
}
