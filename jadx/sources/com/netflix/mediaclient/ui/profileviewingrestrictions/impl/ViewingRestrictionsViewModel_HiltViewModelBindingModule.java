package com.netflix.mediaclient.ui.profileviewingrestrictions.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import o.InterfaceC1633aIn;
import o.InterfaceC8985gz;
import o.cPN;
import o.cPO;

@OriginatingElement(topLevelClass = cPN.class)
@Module
@InstallIn({InterfaceC1633aIn.class})
/* loaded from: classes6.dex */
public abstract class ViewingRestrictionsViewModel_HiltViewModelBindingModule {
    @Binds
    @IntoMap
    public abstract InterfaceC8985gz<?, ?> c(cPO cpo);
}
