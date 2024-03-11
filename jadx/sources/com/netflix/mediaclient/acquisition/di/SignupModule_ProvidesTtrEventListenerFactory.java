package com.netflix.mediaclient.acquisition.di;

import android.app.Activity;
import com.netflix.mediaclient.acquisition.services.logging.TtrEventListener;
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
public final class SignupModule_ProvidesTtrEventListenerFactory implements Factory<TtrEventListener> {
    private final Provider<Activity> activityProvider;
    private final SignupModule module;

    public SignupModule_ProvidesTtrEventListenerFactory(SignupModule signupModule, Provider<Activity> provider) {
        this.module = signupModule;
        this.activityProvider = provider;
    }

    @Override // javax.inject.Provider
    public TtrEventListener get() {
        return providesTtrEventListener(this.module, this.activityProvider.get());
    }

    public static SignupModule_ProvidesTtrEventListenerFactory create(SignupModule signupModule, Provider<Activity> provider) {
        return new SignupModule_ProvidesTtrEventListenerFactory(signupModule, provider);
    }

    public static TtrEventListener providesTtrEventListener(SignupModule signupModule, Activity activity) {
        return (TtrEventListener) Preconditions.checkNotNullFromProvides(signupModule.providesTtrEventListener(activity));
    }
}
