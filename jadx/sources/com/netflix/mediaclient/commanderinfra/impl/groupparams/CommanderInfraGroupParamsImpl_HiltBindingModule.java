package com.netflix.mediaclient.commanderinfra.impl.groupparams;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.codegen.OriginatingElement;
import o.C1310Wt;
import o.VE;

@OriginatingElement(topLevelClass = C1310Wt.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public interface CommanderInfraGroupParamsImpl_HiltBindingModule {
    @ActivityScoped
    @Binds
    VE b(C1310Wt c1310Wt);
}
