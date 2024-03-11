package com.netflix.mediaclient.commanderinfra.impl.groupparams;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.codegen.OriginatingElement;
import o.C1313Ww;
import o.VL;

@OriginatingElement(topLevelClass = C1313Ww.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public interface PairingInfraGroupParamsImpl_HiltBindingModule {
    @ActivityScoped
    @Binds
    VL c(C1313Ww c1313Ww);
}
