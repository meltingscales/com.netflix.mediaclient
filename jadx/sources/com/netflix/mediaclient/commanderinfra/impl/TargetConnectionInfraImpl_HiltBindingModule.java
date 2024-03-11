package com.netflix.mediaclient.commanderinfra.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.codegen.OriginatingElement;
import o.C1311Wu;
import o.VH;

@OriginatingElement(topLevelClass = C1311Wu.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public interface TargetConnectionInfraImpl_HiltBindingModule {
    @ActivityScoped
    @Binds
    VH b(C1311Wu c1311Wu);
}
