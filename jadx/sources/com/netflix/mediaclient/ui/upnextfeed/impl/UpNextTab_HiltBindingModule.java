package com.netflix.mediaclient.ui.upnextfeed.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoSet;
import o.C7904daM;
import o.InterfaceC9934zO;

@OriginatingElement(topLevelClass = C7904daM.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public interface UpNextTab_HiltBindingModule {
    @Binds
    @IntoSet
    InterfaceC9934zO a(C7904daM c7904daM);
}
