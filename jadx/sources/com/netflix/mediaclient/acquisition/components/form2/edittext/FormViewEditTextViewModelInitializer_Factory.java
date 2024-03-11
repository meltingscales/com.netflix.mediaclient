package com.netflix.mediaclient.acquisition.components.form2.edittext;

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
public final class FormViewEditTextViewModelInitializer_Factory implements Factory<FormViewEditTextViewModelInitializer> {
    private final Provider<FlowMode> flowModeProvider;
    private final Provider<FormCacheSynchronizerFactory> formCacheSynchronizerFactoryProvider;
    private final Provider<SignupErrorReporter> signupErrorReporterProvider;

    public FormViewEditTextViewModelInitializer_Factory(Provider<FlowMode> provider, Provider<FormCacheSynchronizerFactory> provider2, Provider<SignupErrorReporter> provider3) {
        this.flowModeProvider = provider;
        this.formCacheSynchronizerFactoryProvider = provider2;
        this.signupErrorReporterProvider = provider3;
    }

    @Override // javax.inject.Provider
    public FormViewEditTextViewModelInitializer get() {
        return newInstance(this.flowModeProvider.get(), this.formCacheSynchronizerFactoryProvider.get(), this.signupErrorReporterProvider.get());
    }

    public static FormViewEditTextViewModelInitializer_Factory create(Provider<FlowMode> provider, Provider<FormCacheSynchronizerFactory> provider2, Provider<SignupErrorReporter> provider3) {
        return new FormViewEditTextViewModelInitializer_Factory(provider, provider2, provider3);
    }

    public static FormViewEditTextViewModelInitializer newInstance(FlowMode flowMode, FormCacheSynchronizerFactory formCacheSynchronizerFactory, SignupErrorReporter signupErrorReporter) {
        return new FormViewEditTextViewModelInitializer(flowMode, formCacheSynchronizerFactory, signupErrorReporter);
    }
}
