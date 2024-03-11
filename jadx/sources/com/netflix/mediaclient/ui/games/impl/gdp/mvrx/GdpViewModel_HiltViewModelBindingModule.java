package com.netflix.mediaclient.ui.games.impl.gdp.mvrx;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import o.C3952bQt;
import o.InterfaceC1633aIn;
import o.InterfaceC3954bQv;
import o.InterfaceC8985gz;

@OriginatingElement(topLevelClass = C3952bQt.class)
@Module
@InstallIn({InterfaceC1633aIn.class})
/* loaded from: classes6.dex */
public abstract class GdpViewModel_HiltViewModelBindingModule {
    @Binds
    @IntoMap
    public abstract InterfaceC8985gz<?, ?> e(InterfaceC3954bQv interfaceC3954bQv);
}
