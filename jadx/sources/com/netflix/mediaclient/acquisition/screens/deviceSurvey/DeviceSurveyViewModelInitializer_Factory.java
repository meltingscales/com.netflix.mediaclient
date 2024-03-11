package com.netflix.mediaclient.acquisition.screens.deviceSurvey;

import androidx.lifecycle.ViewModelProvider;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
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
public final class DeviceSurveyViewModelInitializer_Factory implements Factory<DeviceSurveyViewModelInitializer> {
    private final Provider<ErrorMessageViewModelInitializer> errorMessageViewModelInitializerProvider;
    private final Provider<FlowMode> flowModeProvider;
    private final Provider<FormCacheSynchronizerFactory> formCacheSynchronizerFactoryProvider;
    private final Provider<SignupErrorReporter> signupErrorReporterProvider;
    private final Provider<SignupNetworkManager> signupNetworkManagerProvider;
    private final Provider<StringProvider> stringProvider;
    private final Provider<ViewModelProvider.Factory> viewModelProviderFactoryProvider;

    public DeviceSurveyViewModelInitializer_Factory(Provider<FlowMode> provider, Provider<SignupErrorReporter> provider2, Provider<FormCacheSynchronizerFactory> provider3, Provider<StringProvider> provider4, Provider<SignupNetworkManager> provider5, Provider<ErrorMessageViewModelInitializer> provider6, Provider<ViewModelProvider.Factory> provider7) {
        this.flowModeProvider = provider;
        this.signupErrorReporterProvider = provider2;
        this.formCacheSynchronizerFactoryProvider = provider3;
        this.stringProvider = provider4;
        this.signupNetworkManagerProvider = provider5;
        this.errorMessageViewModelInitializerProvider = provider6;
        this.viewModelProviderFactoryProvider = provider7;
    }

    @Override // javax.inject.Provider
    public DeviceSurveyViewModelInitializer get() {
        return newInstance(this.flowModeProvider.get(), this.signupErrorReporterProvider.get(), this.formCacheSynchronizerFactoryProvider.get(), this.stringProvider.get(), this.signupNetworkManagerProvider.get(), this.errorMessageViewModelInitializerProvider.get(), this.viewModelProviderFactoryProvider.get());
    }

    public static DeviceSurveyViewModelInitializer_Factory create(Provider<FlowMode> provider, Provider<SignupErrorReporter> provider2, Provider<FormCacheSynchronizerFactory> provider3, Provider<StringProvider> provider4, Provider<SignupNetworkManager> provider5, Provider<ErrorMessageViewModelInitializer> provider6, Provider<ViewModelProvider.Factory> provider7) {
        return new DeviceSurveyViewModelInitializer_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static DeviceSurveyViewModelInitializer newInstance(FlowMode flowMode, SignupErrorReporter signupErrorReporter, FormCacheSynchronizerFactory formCacheSynchronizerFactory, StringProvider stringProvider, SignupNetworkManager signupNetworkManager, ErrorMessageViewModelInitializer errorMessageViewModelInitializer, ViewModelProvider.Factory factory) {
        return new DeviceSurveyViewModelInitializer(flowMode, signupErrorReporter, formCacheSynchronizerFactory, stringProvider, signupNetworkManager, errorMessageViewModelInitializer, factory);
    }
}
