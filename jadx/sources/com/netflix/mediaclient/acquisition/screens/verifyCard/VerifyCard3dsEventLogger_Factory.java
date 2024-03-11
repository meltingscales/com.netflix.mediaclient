package com.netflix.mediaclient.acquisition.screens.verifyCard;

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
public final class VerifyCard3dsEventLogger_Factory implements Factory<VerifyCard3dsEventLogger> {
    private final Provider<SignupLogger> signupLoggerProvider;

    public VerifyCard3dsEventLogger_Factory(Provider<SignupLogger> provider) {
        this.signupLoggerProvider = provider;
    }

    @Override // javax.inject.Provider
    public VerifyCard3dsEventLogger get() {
        return newInstance(this.signupLoggerProvider.get());
    }

    public static VerifyCard3dsEventLogger_Factory create(Provider<SignupLogger> provider) {
        return new VerifyCard3dsEventLogger_Factory(provider);
    }

    public static VerifyCard3dsEventLogger newInstance(SignupLogger signupLogger) {
        return new VerifyCard3dsEventLogger(signupLogger);
    }
}
