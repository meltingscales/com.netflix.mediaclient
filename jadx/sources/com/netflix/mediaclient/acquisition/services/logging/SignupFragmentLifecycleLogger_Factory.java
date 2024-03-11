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
public final class SignupFragmentLifecycleLogger_Factory implements Factory<SignupFragmentLifecycleLogger> {
    private final Provider<SignupLogger> signupLoggerProvider;

    public SignupFragmentLifecycleLogger_Factory(Provider<SignupLogger> provider) {
        this.signupLoggerProvider = provider;
    }

    @Override // javax.inject.Provider
    public SignupFragmentLifecycleLogger get() {
        return newInstance(this.signupLoggerProvider.get());
    }

    public static SignupFragmentLifecycleLogger_Factory create(Provider<SignupLogger> provider) {
        return new SignupFragmentLifecycleLogger_Factory(provider);
    }

    public static SignupFragmentLifecycleLogger newInstance(SignupLogger signupLogger) {
        return new SignupFragmentLifecycleLogger(signupLogger);
    }
}
