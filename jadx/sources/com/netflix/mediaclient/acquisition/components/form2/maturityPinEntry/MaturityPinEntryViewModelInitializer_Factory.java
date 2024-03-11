package com.netflix.mediaclient.acquisition.components.form2.maturityPinEntry;

import com.netflix.android.moneyball.FlowMode;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.services.cache.FormCacheSynchronizerFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class MaturityPinEntryViewModelInitializer_Factory implements Factory<MaturityPinEntryViewModelInitializer> {
    private final Provider<FlowMode> flowModeProvider;
    private final Provider<FormCacheSynchronizerFactory> formCacheSynchronizerFactoryProvider;
    private final Provider<SignupErrorReporter> signupErrorReporterProvider;

    public MaturityPinEntryViewModelInitializer_Factory(Provider<FlowMode> provider, Provider<SignupErrorReporter> provider2, Provider<FormCacheSynchronizerFactory> provider3) {
        this.flowModeProvider = provider;
        this.signupErrorReporterProvider = provider2;
        this.formCacheSynchronizerFactoryProvider = provider3;
    }

    @Override // javax.inject.Provider
    public MaturityPinEntryViewModelInitializer get() {
        return newInstance(this.flowModeProvider.get(), this.signupErrorReporterProvider.get(), this.formCacheSynchronizerFactoryProvider.get());
    }

    public static MaturityPinEntryViewModelInitializer_Factory create(Provider<FlowMode> provider, Provider<SignupErrorReporter> provider2, Provider<FormCacheSynchronizerFactory> provider3) {
        return new MaturityPinEntryViewModelInitializer_Factory(provider, provider2, provider3);
    }

    public static MaturityPinEntryViewModelInitializer newInstance(FlowMode flowMode, SignupErrorReporter signupErrorReporter, FormCacheSynchronizerFactory formCacheSynchronizerFactory) {
        return new MaturityPinEntryViewModelInitializer(flowMode, signupErrorReporter, formCacheSynchronizerFactory);
    }
}
