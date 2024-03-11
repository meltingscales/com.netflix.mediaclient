package com.netflix.mediaclient.ui.upnextfeed.impl.data;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import o.C7975dbe;
import o.InterfaceC1633aIn;
import o.InterfaceC7980dbj;
import o.InterfaceC8985gz;

@OriginatingElement(topLevelClass = C7975dbe.class)
@Module
@InstallIn({InterfaceC1633aIn.class})
/* loaded from: classes6.dex */
public abstract class UpNextFeedViewModel_HiltViewModelBindingModule {
    @Binds
    @IntoMap
    public abstract InterfaceC8985gz<?, ?> e(InterfaceC7980dbj interfaceC7980dbj);
}
