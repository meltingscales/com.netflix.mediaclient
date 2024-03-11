package com.netflix.mediaclient.ui.profileviewingrestrictions.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import o.C5989cPw;
import o.InterfaceC1633aIn;
import o.InterfaceC5990cPx;
import o.InterfaceC8985gz;

@OriginatingElement(topLevelClass = C5989cPw.class)
@Module
@InstallIn({InterfaceC1633aIn.class})
/* loaded from: classes6.dex */
public abstract class BlockedTitlesViewModel_HiltViewModelBindingModule {
    @Binds
    @IntoMap
    public abstract InterfaceC8985gz<?, ?> c(InterfaceC5990cPx interfaceC5990cPx);
}
