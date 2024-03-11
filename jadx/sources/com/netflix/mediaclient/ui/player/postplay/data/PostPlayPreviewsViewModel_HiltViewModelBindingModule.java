package com.netflix.mediaclient.ui.player.postplay.data;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import o.C5533cAy;
import o.InterfaceC1633aIn;
import o.InterfaceC5532cAx;
import o.InterfaceC8985gz;

@OriginatingElement(topLevelClass = C5533cAy.class)
@Module
@InstallIn({InterfaceC1633aIn.class})
/* loaded from: classes6.dex */
public abstract class PostPlayPreviewsViewModel_HiltViewModelBindingModule {
    @Binds
    @IntoMap
    public abstract InterfaceC8985gz<?, ?> d(InterfaceC5532cAx interfaceC5532cAx);
}
