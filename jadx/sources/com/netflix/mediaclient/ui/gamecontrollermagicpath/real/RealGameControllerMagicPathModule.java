package com.netflix.mediaclient.ui.gamecontrollermagicpath.real;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import o.C3858bNg;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes4.dex */
public final class RealGameControllerMagicPathModule {
    @Provides
    public final C3858bNg b() {
        return new C3858bNg(true);
    }
}
