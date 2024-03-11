package com.netflix.mediaclient.ui.offline;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import o.C7239csU;
import o.InterfaceC1633aIn;
import o.InterfaceC7242csX;
import o.InterfaceC8985gz;

@OriginatingElement(topLevelClass = C7239csU.class)
@Module
@InstallIn({InterfaceC1633aIn.class})
/* loaded from: classes6.dex */
public abstract class ErrorDownloadSheetViewModel_HiltViewModelBindingModule {
    @Binds
    @IntoMap
    public abstract InterfaceC8985gz<?, ?> a(InterfaceC7242csX interfaceC7242csX);
}
