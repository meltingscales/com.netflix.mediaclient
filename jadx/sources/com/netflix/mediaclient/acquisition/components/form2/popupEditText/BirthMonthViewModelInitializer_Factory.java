package com.netflix.mediaclient.acquisition.components.form2.popupEditText;

import com.netflix.android.moneyball.FlowMode;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
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
public final class BirthMonthViewModelInitializer_Factory implements Factory<BirthMonthViewModelInitializer> {
    private final Provider<FlowMode> flowModeProvider;
    private final Provider<FormCacheSynchronizerFactory> formCacheSynchronizerFactoryProvider;
    private final Provider<SignupErrorReporter> signupErrorReporterProvider;
    private final Provider<StringProvider> stringProvider;

    public BirthMonthViewModelInitializer_Factory(Provider<FlowMode> provider, Provider<SignupErrorReporter> provider2, Provider<StringProvider> provider3, Provider<FormCacheSynchronizerFactory> provider4) {
        this.flowModeProvider = provider;
        this.signupErrorReporterProvider = provider2;
        this.stringProvider = provider3;
        this.formCacheSynchronizerFactoryProvider = provider4;
    }

    @Override // javax.inject.Provider
    public BirthMonthViewModelInitializer get() {
        return newInstance(this.flowModeProvider.get(), this.signupErrorReporterProvider.get(), this.stringProvider.get(), this.formCacheSynchronizerFactoryProvider.get());
    }

    public static BirthMonthViewModelInitializer_Factory create(Provider<FlowMode> provider, Provider<SignupErrorReporter> provider2, Provider<StringProvider> provider3, Provider<FormCacheSynchronizerFactory> provider4) {
        return new BirthMonthViewModelInitializer_Factory(provider, provider2, provider3, provider4);
    }

    public static BirthMonthViewModelInitializer newInstance(FlowMode flowMode, SignupErrorReporter signupErrorReporter, StringProvider stringProvider, FormCacheSynchronizerFactory formCacheSynchronizerFactory) {
        return new BirthMonthViewModelInitializer(flowMode, signupErrorReporter, stringProvider, formCacheSynchronizerFactory);
    }
}
