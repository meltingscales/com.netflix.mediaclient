package com.netflix.mediaclient.acquisition.screens.verifyCardContext;

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
public final class VerifyCardContextEventLogger_Factory implements Factory<VerifyCardContextEventLogger> {
    private final Provider<SignupLogger> signupLoggerProvider;

    public VerifyCardContextEventLogger_Factory(Provider<SignupLogger> provider) {
        this.signupLoggerProvider = provider;
    }

    @Override // javax.inject.Provider
    public VerifyCardContextEventLogger get() {
        return newInstance(this.signupLoggerProvider.get());
    }

    public static VerifyCardContextEventLogger_Factory create(Provider<SignupLogger> provider) {
        return new VerifyCardContextEventLogger_Factory(provider);
    }

    public static VerifyCardContextEventLogger newInstance(SignupLogger signupLogger) {
        return new VerifyCardContextEventLogger(signupLogger);
    }
}
