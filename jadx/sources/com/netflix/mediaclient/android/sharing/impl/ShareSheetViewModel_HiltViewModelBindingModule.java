package com.netflix.mediaclient.android.sharing.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import o.C1135Qa;
import o.InterfaceC1138Qd;
import o.InterfaceC1633aIn;
import o.InterfaceC8985gz;

@OriginatingElement(topLevelClass = C1135Qa.class)
@Module
@InstallIn({InterfaceC1633aIn.class})
/* loaded from: classes6.dex */
public abstract class ShareSheetViewModel_HiltViewModelBindingModule {
    @Binds
    @IntoMap
    public abstract InterfaceC8985gz<?, ?> b(InterfaceC1138Qd interfaceC1138Qd);
}
