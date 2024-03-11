package com.netflix.mediaclient.commanderinfra.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.codegen.OriginatingElement;
import o.C1297Wg;
import o.InterfaceC1288Vx;

@OriginatingElement(topLevelClass = C1297Wg.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public interface AudioSubtitlesHandlerInfraImpl_HiltBindingModule {
    @ActivityScoped
    @Binds
    InterfaceC1288Vx b(C1297Wg c1297Wg);
}
