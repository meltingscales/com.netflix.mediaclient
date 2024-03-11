package com.netflix.mediaclient.acquisition.lib;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Map;
import javax.inject.Provider;

@ScopeMetadata("dagger.Reusable")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named", "com.netflix.mediaclient.acquisition.lib.AcquisitionLibStringMapping", "com.netflix.mediaclient.acquisition.lib.AcquisitionStringMapping", "com.netflix.mediaclient.acquisition.lib.CfourStringMapping"})
/* loaded from: classes3.dex */
public final class SignupLibSingletonModule_ProvidesMultiModuleStringMappingFactory implements Factory<Map<String, Integer>> {
    private final Provider<Map<String, Integer>> acquisitionMappingProvider;
    private final Provider<Map<String, Integer>> cfourStringMappingProvider;
    private final Provider<Map<String, Integer>> libStringMappingProvider;
    private final SignupLibSingletonModule module;

    public SignupLibSingletonModule_ProvidesMultiModuleStringMappingFactory(SignupLibSingletonModule signupLibSingletonModule, Provider<Map<String, Integer>> provider, Provider<Map<String, Integer>> provider2, Provider<Map<String, Integer>> provider3) {
        this.module = signupLibSingletonModule;
        this.libStringMappingProvider = provider;
        this.acquisitionMappingProvider = provider2;
        this.cfourStringMappingProvider = provider3;
    }

    @Override // javax.inject.Provider
    public Map<String, Integer> get() {
        return providesMultiModuleStringMapping(this.module, this.libStringMappingProvider.get(), this.acquisitionMappingProvider.get(), this.cfourStringMappingProvider.get());
    }

    public static SignupLibSingletonModule_ProvidesMultiModuleStringMappingFactory create(SignupLibSingletonModule signupLibSingletonModule, Provider<Map<String, Integer>> provider, Provider<Map<String, Integer>> provider2, Provider<Map<String, Integer>> provider3) {
        return new SignupLibSingletonModule_ProvidesMultiModuleStringMappingFactory(signupLibSingletonModule, provider, provider2, provider3);
    }

    public static Map<String, Integer> providesMultiModuleStringMapping(SignupLibSingletonModule signupLibSingletonModule, Map<String, Integer> map, Map<String, Integer> map2, Map<String, Integer> map3) {
        return (Map) Preconditions.checkNotNullFromProvides(signupLibSingletonModule.providesMultiModuleStringMapping(map, map2, map3));
    }
}
