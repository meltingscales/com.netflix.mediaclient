package com.netflix.mediaclient.commanderinfra.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.codegen.OriginatingElement;
import o.C1306Wp;
import o.InterfaceC1289Vy;

@OriginatingElement(topLevelClass = C1306Wp.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public interface KeyHandlerInfraImpl_HiltBindingModule {
    @ActivityScoped
    @Binds
    InterfaceC1289Vy a(C1306Wp c1306Wp);
}
