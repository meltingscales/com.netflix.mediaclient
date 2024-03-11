package com.netflix.mediaclient.acquisition.lib.services.logging;

import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class SignupLogger_Factory implements Factory<SignupLogger> {
    private final Provider<ExtLogger> extloggerProvider;
    private final Provider<Logger> loggerProvider;

    public SignupLogger_Factory(Provider<Logger> provider, Provider<ExtLogger> provider2) {
        this.loggerProvider = provider;
        this.extloggerProvider = provider2;
    }

    @Override // javax.inject.Provider
    public SignupLogger get() {
        return newInstance(this.loggerProvider.get(), this.extloggerProvider.get());
    }

    public static SignupLogger_Factory create(Provider<Logger> provider, Provider<ExtLogger> provider2) {
        return new SignupLogger_Factory(provider, provider2);
    }

    public static SignupLogger newInstance(Logger logger, ExtLogger extLogger) {
        return new SignupLogger(logger, extLogger);
    }
}
