package com.netflix.mediaclient.ui.games.impl.games;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoSet;
import o.InterfaceC9934zO;
import o.bOT;

@OriginatingElement(topLevelClass = bOT.class)
@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public interface GamesBottomTab_HiltBindingModule {
    @Binds
    @IntoSet
    InterfaceC9934zO c(bOT bot);
}
