package com.netflix.mediaclient.acquisition.components;

import android.app.Activity;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class KeyboardController_Factory implements Factory<KeyboardController> {
    private final Provider<Activity> activityProvider;

    public KeyboardController_Factory(Provider<Activity> provider) {
        this.activityProvider = provider;
    }

    @Override // javax.inject.Provider
    public KeyboardController get() {
        return newInstance(this.activityProvider.get());
    }

    public static KeyboardController_Factory create(Provider<Activity> provider) {
        return new KeyboardController_Factory(provider);
    }

    public static KeyboardController newInstance(Activity activity) {
        return new KeyboardController(activity);
    }
}
