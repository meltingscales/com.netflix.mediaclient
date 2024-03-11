package com.netflix.mediaclient.ui.collecttaste.impl.rating;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import o.C3533bBj;
import o.InterfaceC1633aIn;
import o.InterfaceC3531bBh;
import o.InterfaceC8985gz;

@OriginatingElement(topLevelClass = C3533bBj.class)
@Module
@InstallIn({InterfaceC1633aIn.class})
/* loaded from: classes6.dex */
public abstract class CollectTasteViewModel_HiltViewModelBindingModule {
    @Binds
    @IntoMap
    public abstract InterfaceC8985gz<?, ?> b(InterfaceC3531bBh interfaceC3531bBh);
}
