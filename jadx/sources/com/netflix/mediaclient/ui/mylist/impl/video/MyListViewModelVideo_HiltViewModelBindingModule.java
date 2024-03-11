package com.netflix.mediaclient.ui.mylist.impl.video;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import o.C7052cot;
import o.InterfaceC1633aIn;
import o.InterfaceC7054cov;
import o.InterfaceC8985gz;

@OriginatingElement(topLevelClass = C7052cot.class)
@Module
@InstallIn({InterfaceC1633aIn.class})
/* loaded from: classes6.dex */
public abstract class MyListViewModelVideo_HiltViewModelBindingModule {
    @Binds
    @IntoMap
    public abstract InterfaceC8985gz<?, ?> c(InterfaceC7054cov interfaceC7054cov);
}
