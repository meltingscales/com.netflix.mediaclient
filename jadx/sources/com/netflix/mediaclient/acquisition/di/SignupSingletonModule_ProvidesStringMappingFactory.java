package com.netflix.mediaclient.acquisition.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Map;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.netflix.mediaclient.acquisition.lib.AcquisitionStringMapping"})
/* loaded from: classes3.dex */
public final class SignupSingletonModule_ProvidesStringMappingFactory implements Factory<Map<String, Integer>> {
    private final SignupSingletonModule module;

    public SignupSingletonModule_ProvidesStringMappingFactory(SignupSingletonModule signupSingletonModule) {
        this.module = signupSingletonModule;
    }

    @Override // javax.inject.Provider
    public Map<String, Integer> get() {
        return providesStringMapping(this.module);
    }

    public static SignupSingletonModule_ProvidesStringMappingFactory create(SignupSingletonModule signupSingletonModule) {
        return new SignupSingletonModule_ProvidesStringMappingFactory(signupSingletonModule);
    }

    public static Map<String, Integer> providesStringMapping(SignupSingletonModule signupSingletonModule) {
        return (Map) Preconditions.checkNotNullFromProvides(signupSingletonModule.providesStringMapping());
    }
}
