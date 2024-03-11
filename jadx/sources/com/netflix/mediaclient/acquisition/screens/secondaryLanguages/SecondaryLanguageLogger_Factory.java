package com.netflix.mediaclient.acquisition.screens.secondaryLanguages;

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
public final class SecondaryLanguageLogger_Factory implements Factory<SecondaryLanguageLogger> {
    private final Provider<SignupLogger> signupLoggerProvider;

    public SecondaryLanguageLogger_Factory(Provider<SignupLogger> provider) {
        this.signupLoggerProvider = provider;
    }

    @Override // javax.inject.Provider
    public SecondaryLanguageLogger get() {
        return newInstance(this.signupLoggerProvider.get());
    }

    public static SecondaryLanguageLogger_Factory create(Provider<SignupLogger> provider) {
        return new SecondaryLanguageLogger_Factory(provider);
    }

    public static SecondaryLanguageLogger newInstance(SignupLogger signupLogger) {
        return new SecondaryLanguageLogger(signupLogger);
    }
}
