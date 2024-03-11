package com.netflix.mediaclient.acquisition.screens.secondaryLanguages;

import androidx.lifecycle.ViewModelProvider;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.mediaclient.acquisition.components.steps.StepsViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class SecondaryLanguageViewModelInitializer_Factory implements Factory<SecondaryLanguageViewModelInitializer> {
    private final Provider<ErrorMessageViewModelInitializer> errorMessageViewModelInitializerProvider;
    private final Provider<FlowMode> flowModeProvider;
    private final Provider<SignupErrorReporter> signupErrorReporterProvider;
    private final Provider<SignupNetworkManager> signupNetworkManagerProvider;
    private final Provider<StepsViewModelInitializer> stepsViewModelInitializerProvider;
    private final Provider<StringProvider> stringProvider;
    private final Provider<ViewModelProvider.Factory> viewModelProviderFactoryProvider;

    public SecondaryLanguageViewModelInitializer_Factory(Provider<FlowMode> provider, Provider<SignupErrorReporter> provider2, Provider<StringProvider> provider3, Provider<SignupNetworkManager> provider4, Provider<StepsViewModelInitializer> provider5, Provider<ErrorMessageViewModelInitializer> provider6, Provider<ViewModelProvider.Factory> provider7) {
        this.flowModeProvider = provider;
        this.signupErrorReporterProvider = provider2;
        this.stringProvider = provider3;
        this.signupNetworkManagerProvider = provider4;
        this.stepsViewModelInitializerProvider = provider5;
        this.errorMessageViewModelInitializerProvider = provider6;
        this.viewModelProviderFactoryProvider = provider7;
    }

    @Override // javax.inject.Provider
    public SecondaryLanguageViewModelInitializer get() {
        return newInstance(this.flowModeProvider.get(), this.signupErrorReporterProvider.get(), this.stringProvider.get(), this.signupNetworkManagerProvider.get(), this.stepsViewModelInitializerProvider.get(), this.errorMessageViewModelInitializerProvider.get(), this.viewModelProviderFactoryProvider.get());
    }

    public static SecondaryLanguageViewModelInitializer_Factory create(Provider<FlowMode> provider, Provider<SignupErrorReporter> provider2, Provider<StringProvider> provider3, Provider<SignupNetworkManager> provider4, Provider<StepsViewModelInitializer> provider5, Provider<ErrorMessageViewModelInitializer> provider6, Provider<ViewModelProvider.Factory> provider7) {
        return new SecondaryLanguageViewModelInitializer_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static SecondaryLanguageViewModelInitializer newInstance(FlowMode flowMode, SignupErrorReporter signupErrorReporter, StringProvider stringProvider, SignupNetworkManager signupNetworkManager, StepsViewModelInitializer stepsViewModelInitializer, ErrorMessageViewModelInitializer errorMessageViewModelInitializer, ViewModelProvider.Factory factory) {
        return new SecondaryLanguageViewModelInitializer(flowMode, signupErrorReporter, stringProvider, signupNetworkManager, stepsViewModelInitializer, errorMessageViewModelInitializer, factory);
    }
}
