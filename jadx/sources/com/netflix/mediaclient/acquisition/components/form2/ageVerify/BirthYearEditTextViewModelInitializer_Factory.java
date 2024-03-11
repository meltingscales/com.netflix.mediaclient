package com.netflix.mediaclient.acquisition.components.form2.ageVerify;

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
/* loaded from: classes5.dex */
public final class BirthYearEditTextViewModelInitializer_Factory implements Factory<BirthYearEditTextViewModelInitializer> {
    private final Provider<FlowMode> flowModeProvider;
    private final Provider<FormCacheSynchronizerFactory> formCacheSynchronizerFactoryProvider;
    private final Provider<SignupErrorReporter> signupErrorReporterProvider;

    public BirthYearEditTextViewModelInitializer_Factory(Provider<FlowMode> provider, Provider<SignupErrorReporter> provider2, Provider<FormCacheSynchronizerFactory> provider3) {
        this.flowModeProvider = provider;
        this.signupErrorReporterProvider = provider2;
        this.formCacheSynchronizerFactoryProvider = provider3;
    }

    @Override // javax.inject.Provider
    public BirthYearEditTextViewModelInitializer get() {
        return newInstance(this.flowModeProvider.get(), this.signupErrorReporterProvider.get(), this.formCacheSynchronizerFactoryProvider.get());
    }

    public static BirthYearEditTextViewModelInitializer_Factory create(Provider<FlowMode> provider, Provider<SignupErrorReporter> provider2, Provider<FormCacheSynchronizerFactory> provider3) {
        return new BirthYearEditTextViewModelInitializer_Factory(provider, provider2, provider3);
    }

    public static BirthYearEditTextViewModelInitializer newInstance(FlowMode flowMode, SignupErrorReporter signupErrorReporter, FormCacheSynchronizerFactory formCacheSynchronizerFactory) {
        return new BirthYearEditTextViewModelInitializer(flowMode, signupErrorReporter, formCacheSynchronizerFactory);
    }
}
