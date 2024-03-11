package com.netflix.mediaclient.ui.player;

import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import o.bDH;

@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public abstract class PlaybackLauncherModule {
    @ActivityScoped
    @Binds
    public abstract PlaybackLauncher c(bDH bdh);
}
