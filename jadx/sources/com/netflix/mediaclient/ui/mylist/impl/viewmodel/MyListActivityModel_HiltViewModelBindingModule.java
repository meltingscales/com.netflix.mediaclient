package com.netflix.mediaclient.ui.mylist.impl.viewmodel;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import o.C7010coB;
import o.InterfaceC1633aIn;
import o.InterfaceC7009coA;
import o.InterfaceC8985gz;

@OriginatingElement(topLevelClass = C7010coB.class)
@Module
@InstallIn({InterfaceC1633aIn.class})
/* loaded from: classes6.dex */
public abstract class MyListActivityModel_HiltViewModelBindingModule {
    @Binds
    @IntoMap
    public abstract InterfaceC8985gz<?, ?> c(InterfaceC7009coA interfaceC7009coA);
}
