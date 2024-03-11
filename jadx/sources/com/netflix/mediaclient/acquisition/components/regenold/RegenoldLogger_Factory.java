package com.netflix.mediaclient.acquisition.components.regenold;

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
public final class RegenoldLogger_Factory implements Factory<RegenoldLogger> {
    private final Provider<SignupLogger> signupLoggerProvider;

    public RegenoldLogger_Factory(Provider<SignupLogger> provider) {
        this.signupLoggerProvider = provider;
    }

    @Override // javax.inject.Provider
    public RegenoldLogger get() {
        return newInstance(this.signupLoggerProvider.get());
    }

    public static RegenoldLogger_Factory create(Provider<SignupLogger> provider) {
        return new RegenoldLogger_Factory(provider);
    }

    public static RegenoldLogger newInstance(SignupLogger signupLogger) {
        return new RegenoldLogger(signupLogger);
    }
}
