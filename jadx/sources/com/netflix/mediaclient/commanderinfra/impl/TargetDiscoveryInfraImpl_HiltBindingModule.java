package com.netflix.mediaclient.commanderinfra.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.codegen.OriginatingElement;
import o.C1309Ws;
import o.VF;

@OriginatingElement(topLevelClass = C1309Ws.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public interface TargetDiscoveryInfraImpl_HiltBindingModule {
    @ActivityScoped
    @Binds
    VF a(C1309Ws c1309Ws);
}
