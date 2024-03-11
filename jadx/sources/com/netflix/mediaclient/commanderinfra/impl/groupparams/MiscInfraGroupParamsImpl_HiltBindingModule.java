package com.netflix.mediaclient.commanderinfra.impl.groupparams;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.codegen.OriginatingElement;
import o.C1315Wy;
import o.VK;

@OriginatingElement(topLevelClass = C1315Wy.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public interface MiscInfraGroupParamsImpl_HiltBindingModule {
    @ActivityScoped
    @Binds
    VK a(C1315Wy c1315Wy);
}
