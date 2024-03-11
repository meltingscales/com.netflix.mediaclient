package com.netflix.mediaclient.acquisition.lib;

import android.app.Activity;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
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
public final class SignupLibModule_ProvidesLoggedErrorListenerFactory implements Factory<SignupErrorReporter.LoggedErrorListener> {
    private final Provider<Activity> activityProvider;
    private final SignupLibModule module;

    public SignupLibModule_ProvidesLoggedErrorListenerFactory(SignupLibModule signupLibModule, Provider<Activity> provider) {
        this.module = signupLibModule;
        this.activityProvider = provider;
    }

    @Override // javax.inject.Provider
    public SignupErrorReporter.LoggedErrorListener get() {
        return providesLoggedErrorListener(this.module, this.activityProvider.get());
    }

    public static SignupLibModule_ProvidesLoggedErrorListenerFactory create(SignupLibModule signupLibModule, Provider<Activity> provider) {
        return new SignupLibModule_ProvidesLoggedErrorListenerFactory(signupLibModule, provider);
    }

    public static SignupErrorReporter.LoggedErrorListener providesLoggedErrorListener(SignupLibModule signupLibModule, Activity activity) {
        return (SignupErrorReporter.LoggedErrorListener) Preconditions.checkNotNullFromProvides(signupLibModule.providesLoggedErrorListener(activity));
    }
}
