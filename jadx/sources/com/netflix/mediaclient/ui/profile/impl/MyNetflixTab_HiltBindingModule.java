package com.netflix.mediaclient.ui.profile.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoSet;
import o.C5845cKm;
import o.InterfaceC9934zO;

@OriginatingElement(topLevelClass = C5845cKm.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public interface MyNetflixTab_HiltBindingModule {
    @Binds
    @IntoSet
    InterfaceC9934zO c(C5845cKm c5845cKm);
}
