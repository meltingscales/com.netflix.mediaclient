package com.netflix.mediaclient.commanderinfra.impl.groupparams;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.codegen.OriginatingElement;
import o.C1316Wz;
import o.VJ;

@OriginatingElement(topLevelClass = C1316Wz.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public interface UiInfraGroupParamsImpl_HiltBindingModule {
    @ActivityScoped
    @Binds
    VJ d(C1316Wz c1316Wz);
}
