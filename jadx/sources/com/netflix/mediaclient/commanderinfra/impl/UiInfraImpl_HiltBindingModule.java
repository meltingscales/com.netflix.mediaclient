package com.netflix.mediaclient.commanderinfra.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.codegen.OriginatingElement;
import o.C1312Wv;
import o.VD;

@OriginatingElement(topLevelClass = C1312Wv.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public interface UiInfraImpl_HiltBindingModule {
    @ActivityScoped
    @Binds
    VD b(C1312Wv c1312Wv);
}
