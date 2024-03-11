package com.netflix.mediaclient.acquisition.screens.welcomefuji;

import android.app.Activity;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiFragment;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class WelcomeFujiModule_ProvidesWelcomeFujiNavigationListenerFactory implements Factory<WelcomeFujiFragment.WelcomeFujiNavigationListener> {
    private final Provider<Activity> activityProvider;
    private final WelcomeFujiModule module;

    public WelcomeFujiModule_ProvidesWelcomeFujiNavigationListenerFactory(WelcomeFujiModule welcomeFujiModule, Provider<Activity> provider) {
        this.module = welcomeFujiModule;
        this.activityProvider = provider;
    }

    @Override // javax.inject.Provider
    public WelcomeFujiFragment.WelcomeFujiNavigationListener get() {
        return providesWelcomeFujiNavigationListener(this.module, this.activityProvider.get());
    }

    public static WelcomeFujiModule_ProvidesWelcomeFujiNavigationListenerFactory create(WelcomeFujiModule welcomeFujiModule, Provider<Activity> provider) {
        return new WelcomeFujiModule_ProvidesWelcomeFujiNavigationListenerFactory(welcomeFujiModule, provider);
    }

    public static WelcomeFujiFragment.WelcomeFujiNavigationListener providesWelcomeFujiNavigationListener(WelcomeFujiModule welcomeFujiModule, Activity activity) {
        return (WelcomeFujiFragment.WelcomeFujiNavigationListener) Preconditions.checkNotNullFromProvides(welcomeFujiModule.providesWelcomeFujiNavigationListener(activity));
    }
}
