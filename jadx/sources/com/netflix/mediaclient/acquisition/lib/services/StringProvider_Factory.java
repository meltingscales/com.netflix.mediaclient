package com.netflix.mediaclient.acquisition.lib.services;

import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Map;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes6.dex */
public final class StringProvider_Factory implements Factory<StringProvider> {
    private final Provider<SignupErrorReporter> signupErrorReporterProvider;
    private final Provider<Map<String, Integer>> stringKeyMappingProvider;

    public StringProvider_Factory(Provider<Map<String, Integer>> provider, Provider<SignupErrorReporter> provider2) {
        this.stringKeyMappingProvider = provider;
        this.signupErrorReporterProvider = provider2;
    }

    @Override // javax.inject.Provider
    public StringProvider get() {
        return newInstance(this.stringKeyMappingProvider.get(), this.signupErrorReporterProvider.get());
    }

    public static StringProvider_Factory create(Provider<Map<String, Integer>> provider, Provider<SignupErrorReporter> provider2) {
        return new StringProvider_Factory(provider, provider2);
    }

    public static StringProvider newInstance(Map<String, Integer> map, SignupErrorReporter signupErrorReporter) {
        return new StringProvider(map, signupErrorReporter);
    }
}
