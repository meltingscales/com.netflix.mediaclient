package com.netflix.mediaclient.ui.player;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import o.bDL;
import o.bDO;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes6.dex */
public abstract class AppScopedPlaybackLauncher {
    @Binds
    public abstract bDL a(bDO bdo);
}
