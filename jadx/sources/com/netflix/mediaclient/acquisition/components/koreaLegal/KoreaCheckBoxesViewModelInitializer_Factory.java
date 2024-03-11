package com.netflix.mediaclient.acquisition.components.koreaLegal;

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
public final class KoreaCheckBoxesViewModelInitializer_Factory implements Factory<KoreaCheckBoxesViewModelInitializer> {
    private final Provider<FlowMode> flowModeProvider;
    private final Provider<FormCacheSynchronizerFactory> formCacheSynchronizerFactoryProvider;
    private final Provider<SignupErrorReporter> signupErrorReporterProvider;
    private final Provider<StringProvider> stringProvider;

    public KoreaCheckBoxesViewModelInitializer_Factory(Provider<FlowMode> provider, Provider<StringProvider> provider2, Provider<FormCacheSynchronizerFactory> provider3, Provider<SignupErrorReporter> provider4) {
        this.flowModeProvider = provider;
        this.stringProvider = provider2;
        this.formCacheSynchronizerFactoryProvider = provider3;
        this.signupErrorReporterProvider = provider4;
    }

    @Override // javax.inject.Provider
    public KoreaCheckBoxesViewModelInitializer get() {
        return newInstance(this.flowModeProvider.get(), this.stringProvider.get(), this.formCacheSynchronizerFactoryProvider.get(), this.signupErrorReporterProvider.get());
    }

    public static KoreaCheckBoxesViewModelInitializer_Factory create(Provider<FlowMode> provider, Provider<StringProvider> provider2, Provider<FormCacheSynchronizerFactory> provider3, Provider<SignupErrorReporter> provider4) {
        return new KoreaCheckBoxesViewModelInitializer_Factory(provider, provider2, provider3, provider4);
    }

    public static KoreaCheckBoxesViewModelInitializer newInstance(FlowMode flowMode, StringProvider stringProvider, FormCacheSynchronizerFactory formCacheSynchronizerFactory, SignupErrorReporter signupErrorReporter) {
        return new KoreaCheckBoxesViewModelInitializer(flowMode, stringProvider, formCacheSynchronizerFactory, signupErrorReporter);
    }
}
