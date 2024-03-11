package com.netflix.mediaclient.acquisition.services.logging;

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
public final class PresentationListener_Factory implements Factory<PresentationListener> {
    private final Provider<SignupLogger> signupLoggerProvider;

    public PresentationListener_Factory(Provider<SignupLogger> provider) {
        this.signupLoggerProvider = provider;
    }

    @Override // javax.inject.Provider
    public PresentationListener get() {
        return newInstance(this.signupLoggerProvider.get());
    }

    public static PresentationListener_Factory create(Provider<SignupLogger> provider) {
        return new PresentationListener_Factory(provider);
    }

    public static PresentationListener newInstance(SignupLogger signupLogger) {
        return new PresentationListener(signupLogger);
    }
}
