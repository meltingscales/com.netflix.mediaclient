package com.netflix.mediaclient.acquisition.screens.onRamp;

import android.app.Activity;
import com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment;
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
public final class OnRampModule_ProvidesOnRampNavigatedListenerFactory implements Factory<OnRampFragment.OnRampNavigationListener> {
    private final Provider<Activity> activityProvider;
    private final OnRampModule module;

    public OnRampModule_ProvidesOnRampNavigatedListenerFactory(OnRampModule onRampModule, Provider<Activity> provider) {
        this.module = onRampModule;
        this.activityProvider = provider;
    }

    @Override // javax.inject.Provider
    public OnRampFragment.OnRampNavigationListener get() {
        return providesOnRampNavigatedListener(this.module, this.activityProvider.get());
    }

    public static OnRampModule_ProvidesOnRampNavigatedListenerFactory create(OnRampModule onRampModule, Provider<Activity> provider) {
        return new OnRampModule_ProvidesOnRampNavigatedListenerFactory(onRampModule, provider);
    }

    public static OnRampFragment.OnRampNavigationListener providesOnRampNavigatedListener(OnRampModule onRampModule, Activity activity) {
        return (OnRampFragment.OnRampNavigationListener) Preconditions.checkNotNullFromProvides(onRampModule.providesOnRampNavigatedListener(activity));
    }
}
