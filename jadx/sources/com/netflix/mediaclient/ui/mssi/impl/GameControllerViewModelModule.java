package com.netflix.mediaclient.ui.mssi.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.multibindings.IntoMap;
import o.C6784cjo;
import o.InterfaceC8936gC;
import o.InterfaceC8985gz;

@Module
@InstallIn({InterfaceC8936gC.class})
/* loaded from: classes6.dex */
public interface GameControllerViewModelModule {
    @Binds
    @IntoMap
    InterfaceC8985gz<?, ?> d(C6784cjo.b bVar);
}
