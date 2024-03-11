package com.netflix.mediaclient.commanderinfra.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.codegen.OriginatingElement;
import o.C1305Wo;
import o.VG;

@OriginatingElement(topLevelClass = C1305Wo.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public interface ProfileSwitchInfraImpl_HiltBindingModule {
    @ActivityScoped
    @Binds
    VG e(C1305Wo c1305Wo);
}
