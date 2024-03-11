package com.netflix.mediaclient.acquisition.screens.welcomefuji;

import android.app.Activity;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiFragment;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import o.C8632dsu;

@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes3.dex */
public final class WelcomeFujiModule {
    public static final int $stable = 0;

    @Provides
    public final WelcomeFujiFragment.WelcomeFujiNavigationListener providesWelcomeFujiNavigationListener(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return (WelcomeFujiFragment.WelcomeFujiNavigationListener) activity;
    }
}
