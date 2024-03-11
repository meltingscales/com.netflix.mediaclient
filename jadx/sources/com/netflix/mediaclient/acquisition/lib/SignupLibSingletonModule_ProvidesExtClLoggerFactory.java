package com.netflix.mediaclient.acquisition.lib;

import com.netflix.cl.ExtLogger;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class SignupLibSingletonModule_ProvidesExtClLoggerFactory implements Factory<ExtLogger> {
    private final SignupLibSingletonModule module;

    public SignupLibSingletonModule_ProvidesExtClLoggerFactory(SignupLibSingletonModule signupLibSingletonModule) {
        this.module = signupLibSingletonModule;
    }

    @Override // javax.inject.Provider
    public ExtLogger get() {
        return providesExtClLogger(this.module);
    }

    public static SignupLibSingletonModule_ProvidesExtClLoggerFactory create(SignupLibSingletonModule signupLibSingletonModule) {
        return new SignupLibSingletonModule_ProvidesExtClLoggerFactory(signupLibSingletonModule);
    }

    public static ExtLogger providesExtClLogger(SignupLibSingletonModule signupLibSingletonModule) {
        return (ExtLogger) Preconditions.checkNotNullFromProvides(signupLibSingletonModule.providesExtClLogger());
    }
}
