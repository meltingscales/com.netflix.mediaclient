package com.netflix.mediaclient.ui.gamecontrollermagicpath.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.multibindings.IntoMap;
import o.C3869bNr;
import o.InterfaceC8936gC;
import o.InterfaceC8985gz;

@Module
@InstallIn({InterfaceC8936gC.class})
/* loaded from: classes6.dex */
public interface ViewModelsModule {
    @Binds
    @IntoMap
    InterfaceC8985gz<?, ?> b(C3869bNr.c cVar);
}
