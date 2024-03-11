package com.netflix.mediaclient.ui.detailspage.impl.fulldp;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import o.C3726bIj;
import o.InterfaceC1633aIn;
import o.InterfaceC3724bIh;
import o.InterfaceC8985gz;

@OriginatingElement(topLevelClass = C3726bIj.class)
@Module
@InstallIn({InterfaceC1633aIn.class})
/* loaded from: classes6.dex */
public abstract class FullDpViewModel_HiltViewModelBindingModule {
    @Binds
    @IntoMap
    public abstract InterfaceC8985gz<?, ?> d(InterfaceC3724bIh interfaceC3724bIh);
}
