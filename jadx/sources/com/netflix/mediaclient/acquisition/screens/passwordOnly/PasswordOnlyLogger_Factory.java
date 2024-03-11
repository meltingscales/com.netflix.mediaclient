package com.netflix.mediaclient.acquisition.screens.passwordOnly;

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
public final class PasswordOnlyLogger_Factory implements Factory<PasswordOnlyLogger> {
    private final Provider<SignupLogger> signupLoggerProvider;

    public PasswordOnlyLogger_Factory(Provider<SignupLogger> provider) {
        this.signupLoggerProvider = provider;
    }

    @Override // javax.inject.Provider
    public PasswordOnlyLogger get() {
        return newInstance(this.signupLoggerProvider.get());
    }

    public static PasswordOnlyLogger_Factory create(Provider<SignupLogger> provider) {
        return new PasswordOnlyLogger_Factory(provider);
    }

    public static PasswordOnlyLogger newInstance(SignupLogger signupLogger) {
        return new PasswordOnlyLogger(signupLogger);
    }
}
