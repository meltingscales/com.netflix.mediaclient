package com.netflix.mediaclient.ui.home.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoSet;
import o.InterfaceC9934zO;
import o.bSZ;

@OriginatingElement(topLevelClass = bSZ.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public interface HomeTab_HiltBindingModule {
    @Binds
    @IntoSet
    InterfaceC9934zO d(bSZ bsz);
}
