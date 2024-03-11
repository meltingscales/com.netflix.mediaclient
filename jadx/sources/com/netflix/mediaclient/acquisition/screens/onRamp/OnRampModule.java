package com.netflix.mediaclient.acquisition.screens.onRamp;

import android.app.Activity;
import com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import o.C8632dsu;

@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes3.dex */
public final class OnRampModule {
    public static final int $stable = 0;

    @Provides
    public final OnRampFragment.OnRampNavigationListener providesOnRampNavigatedListener(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return (OnRampFragment.OnRampNavigationListener) activity;
    }
}
