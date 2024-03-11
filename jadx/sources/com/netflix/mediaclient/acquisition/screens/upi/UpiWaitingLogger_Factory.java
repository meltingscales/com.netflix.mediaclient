package com.netflix.mediaclient.acquisition.screens.upi;

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
public final class UpiWaitingLogger_Factory implements Factory<UpiWaitingLogger> {
    private final Provider<SignupLogger> signupLoggerProvider;

    public UpiWaitingLogger_Factory(Provider<SignupLogger> provider) {
        this.signupLoggerProvider = provider;
    }

    @Override // javax.inject.Provider
    public UpiWaitingLogger get() {
        return newInstance(this.signupLoggerProvider.get());
    }

    public static UpiWaitingLogger_Factory create(Provider<SignupLogger> provider) {
        return new UpiWaitingLogger_Factory(provider);
    }

    public static UpiWaitingLogger newInstance(SignupLogger signupLogger) {
        return new UpiWaitingLogger(signupLogger);
    }
}
