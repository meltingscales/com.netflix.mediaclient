package com.netflix.mediaclient.commanderinfra.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.codegen.OriginatingElement;
import o.C1298Wh;
import o.InterfaceC1284Vt;

@OriginatingElement(topLevelClass = C1298Wh.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public interface CLEventHandlerInfraImpl_HiltBindingModule {
    @ActivityScoped
    @Binds
    InterfaceC1284Vt e(C1298Wh c1298Wh);
}
