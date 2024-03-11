package com.netflix.mediaclient.acquisition.lib;

import com.netflix.cl.Logger;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class SignupLibSingletonModule_ProvidesClLoggerFactory implements Factory<Logger> {
    private final SignupLibSingletonModule module;

    public SignupLibSingletonModule_ProvidesClLoggerFactory(SignupLibSingletonModule signupLibSingletonModule) {
        this.module = signupLibSingletonModule;
    }

    @Override // javax.inject.Provider
    public Logger get() {
        return providesClLogger(this.module);
    }

    public static SignupLibSingletonModule_ProvidesClLoggerFactory create(SignupLibSingletonModule signupLibSingletonModule) {
        return new SignupLibSingletonModule_ProvidesClLoggerFactory(signupLibSingletonModule);
    }

    public static Logger providesClLogger(SignupLibSingletonModule signupLibSingletonModule) {
        return (Logger) Preconditions.checkNotNullFromProvides(signupLibSingletonModule.providesClLogger());
    }
}
