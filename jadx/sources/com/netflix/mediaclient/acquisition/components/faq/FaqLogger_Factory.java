package com.netflix.mediaclient.acquisition.components.faq;

import com.netflix.mediaclient.acquisition.lib.services.logging.SignupLogger;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class FaqLogger_Factory implements Factory<FaqLogger> {
    private final Provider<SignupLogger> signupLoggerProvider;

    public FaqLogger_Factory(Provider<SignupLogger> provider) {
        this.signupLoggerProvider = provider;
    }

    @Override // javax.inject.Provider
    public FaqLogger get() {
        return newInstance(this.signupLoggerProvider.get());
    }

    public static FaqLogger_Factory create(Provider<SignupLogger> provider) {
        return new FaqLogger_Factory(provider);
    }

    public static FaqLogger newInstance(SignupLogger signupLogger) {
        return new FaqLogger(signupLogger);
    }
}
