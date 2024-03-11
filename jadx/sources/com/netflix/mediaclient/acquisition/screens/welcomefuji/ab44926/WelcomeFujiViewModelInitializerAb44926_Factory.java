package com.netflix.mediaclient.acquisition.screens.welcomefuji.ab44926;

import androidx.lifecycle.ViewModelProvider;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModelInitializer;
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
public final class WelcomeFujiViewModelInitializerAb44926_Factory implements Factory<WelcomeFujiViewModelInitializerAb44926> {
    private final Provider<ErrorMessageViewModelInitializer> errorMessageViewModelInitializerProvider;
    private final Provider<FlowMode> flowModeProvider;
    private final Provider<FormViewEditTextViewModelInitializer> formViewEditTextViewModelInitializerProvider;
    private final Provider<SignupErrorReporter> signupErrorReporterProvider;
    private final Provider<SignupNetworkManager> signupNetworkManagerProvider;
    private final Provider<StringProvider> stringProvider;
    private final Provider<ViewModelProvider.Factory> viewModelProviderFactoryProvider;

    public WelcomeFujiViewModelInitializerAb44926_Factory(Provider<FlowMode> provider, Provider<SignupErrorReporter> provider2, Provider<SignupNetworkManager> provider3, Provider<StringProvider> provider4, Provider<ViewModelProvider.Factory> provider5, Provider<ErrorMessageViewModelInitializer> provider6, Provider<FormViewEditTextViewModelInitializer> provider7) {
        this.flowModeProvider = provider;
        this.signupErrorReporterProvider = provider2;
        this.signupNetworkManagerProvider = provider3;
        this.stringProvider = provider4;
        this.viewModelProviderFactoryProvider = provider5;
        this.errorMessageViewModelInitializerProvider = provider6;
        this.formViewEditTextViewModelInitializerProvider = provider7;
    }

    @Override // javax.inject.Provider
    public WelcomeFujiViewModelInitializerAb44926 get() {
        return newInstance(this.flowModeProvider.get(), this.signupErrorReporterProvider.get(), this.signupNetworkManagerProvider.get(), this.stringProvider.get(), this.viewModelProviderFactoryProvider.get(), this.errorMessageViewModelInitializerProvider.get(), this.formViewEditTextViewModelInitializerProvider.get());
    }

    public static WelcomeFujiViewModelInitializerAb44926_Factory create(Provider<FlowMode> provider, Provider<SignupErrorReporter> provider2, Provider<SignupNetworkManager> provider3, Provider<StringProvider> provider4, Provider<ViewModelProvider.Factory> provider5, Provider<ErrorMessageViewModelInitializer> provider6, Provider<FormViewEditTextViewModelInitializer> provider7) {
        return new WelcomeFujiViewModelInitializerAb44926_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static WelcomeFujiViewModelInitializerAb44926 newInstance(FlowMode flowMode, SignupErrorReporter signupErrorReporter, SignupNetworkManager signupNetworkManager, StringProvider stringProvider, ViewModelProvider.Factory factory, ErrorMessageViewModelInitializer errorMessageViewModelInitializer, FormViewEditTextViewModelInitializer formViewEditTextViewModelInitializer) {
        return new WelcomeFujiViewModelInitializerAb44926(flowMode, signupErrorReporter, signupNetworkManager, stringProvider, factory, errorMessageViewModelInitializer, formViewEditTextViewModelInitializer);
    }
}
