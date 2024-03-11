package com.netflix.mediaclient.acquisition.screens.onRamp;

import com.netflix.mediaclient.acquisition.lib.services.logging.SignupLogger;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class OnRampLogger_Factory implements Factory<OnRampLogger> {
    private final Provider<SignupLogger> signupLoggerProvider;

    public OnRampLogger_Factory(Provider<SignupLogger> provider) {
        this.signupLoggerProvider = provider;
    }

    @Override // javax.inject.Provider
    public OnRampLogger get() {
        return newInstance(this.signupLoggerProvider.get());
    }

    public static OnRampLogger_Factory create(Provider<SignupLogger> provider) {
        return new OnRampLogger_Factory(provider);
    }

    public static OnRampLogger newInstance(SignupLogger signupLogger) {
        return new OnRampLogger(signupLogger);
    }
}
