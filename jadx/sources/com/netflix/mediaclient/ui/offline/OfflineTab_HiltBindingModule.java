package com.netflix.mediaclient.ui.offline;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoSet;
import o.C7296ctY;
import o.InterfaceC9934zO;

@OriginatingElement(topLevelClass = C7296ctY.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public interface OfflineTab_HiltBindingModule {
    @Binds
    @IntoSet
    InterfaceC9934zO e(C7296ctY c7296ctY);
}
