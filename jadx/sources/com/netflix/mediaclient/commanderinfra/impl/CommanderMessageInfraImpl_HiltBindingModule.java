package com.netflix.mediaclient.commanderinfra.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.codegen.OriginatingElement;
import o.C1299Wi;
import o.VC;

@OriginatingElement(topLevelClass = C1299Wi.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public interface CommanderMessageInfraImpl_HiltBindingModule {
    @ActivityScoped
    @Binds
    VC d(C1299Wi c1299Wi);
}
