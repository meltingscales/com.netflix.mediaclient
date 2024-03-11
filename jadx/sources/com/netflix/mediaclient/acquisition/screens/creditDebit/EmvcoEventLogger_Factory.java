package com.netflix.mediaclient.acquisition.screens.creditDebit;

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
public final class EmvcoEventLogger_Factory implements Factory<EmvcoEventLogger> {
    private final Provider<SignupLogger> signupLoggerProvider;

    public EmvcoEventLogger_Factory(Provider<SignupLogger> provider) {
        this.signupLoggerProvider = provider;
    }

    @Override // javax.inject.Provider
    public EmvcoEventLogger get() {
        return newInstance(this.signupLoggerProvider.get());
    }

    public static EmvcoEventLogger_Factory create(Provider<SignupLogger> provider) {
        return new EmvcoEventLogger_Factory(provider);
    }

    public static EmvcoEventLogger newInstance(SignupLogger signupLogger) {
        return new EmvcoEventLogger(signupLogger);
    }
}
