package com.netflix.mediaclient.commanderinfra.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.codegen.OriginatingElement;
import o.C1307Wq;
import o.VB;

@OriginatingElement(topLevelClass = C1307Wq.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public interface PrefetchInfraImpl_HiltBindingModule {
    @ActivityScoped
    @Binds
    VB d(C1307Wq c1307Wq);
}
