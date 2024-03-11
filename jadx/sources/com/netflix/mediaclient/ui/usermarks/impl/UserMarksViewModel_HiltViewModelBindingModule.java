package com.netflix.mediaclient.ui.usermarks.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import o.C8002dcE;
import o.InterfaceC1633aIn;
import o.InterfaceC7998dcA;
import o.InterfaceC8985gz;

@OriginatingElement(topLevelClass = C8002dcE.class)
@Module
@InstallIn({InterfaceC1633aIn.class})
/* loaded from: classes6.dex */
public abstract class UserMarksViewModel_HiltViewModelBindingModule {
    @Binds
    @IntoMap
    public abstract InterfaceC8985gz<?, ?> e(InterfaceC7998dcA interfaceC7998dcA);
}
