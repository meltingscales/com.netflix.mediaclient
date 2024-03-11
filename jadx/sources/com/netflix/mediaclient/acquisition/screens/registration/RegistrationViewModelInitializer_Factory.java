package com.netflix.mediaclient.acquisition.screens.registration;

import androidx.lifecycle.ViewModelProvider;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupLogger;
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
public final class RegistrationViewModelInitializer_Factory implements Factory<RegistrationViewModelInitializer> {
    private final Provider<EmailPreferenceViewModelInitializer> emailPreferenceViewModelInitializerProvider;
    private final Provider<ErrorMessageViewModelInitializer> errorMessageViewModelInitializerProvider;
    private final Provider<FlowMode> flowModeProvider;
    private final Provider<FormViewEditTextViewModelInitializer> formViewEditTextViewModelInitializerProvider;
    private final Provider<SignupErrorReporter> signupErrorReporterProvider;
    private final Provider<SignupLogger> signupLoggerProvider;
    private final Provider<SignupNetworkManager> signupNetworkManagerProvider;
    private final Provider<StringProvider> stringProvider;
    private final Provider<ViewModelProvider.Factory> viewModelProviderFactoryProvider;

    public RegistrationViewModelInitializer_Factory(Provider<FlowMode> provider, Provider<SignupErrorReporter> provider2, Provider<SignupNetworkManager> provider3, Provider<SignupLogger> provider4, Provider<StringProvider> provider5, Provider<ViewModelProvider.Factory> provider6, Provider<ErrorMessageViewModelInitializer> provider7, Provider<EmailPreferenceViewModelInitializer> provider8, Provider<FormViewEditTextViewModelInitializer> provider9) {
        this.flowModeProvider = provider;
        this.signupErrorReporterProvider = provider2;
        this.signupNetworkManagerProvider = provider3;
        this.signupLoggerProvider = provider4;
        this.stringProvider = provider5;
        this.viewModelProviderFactoryProvider = provider6;
        this.errorMessageViewModelInitializerProvider = provider7;
        this.emailPreferenceViewModelInitializerProvider = provider8;
        this.formViewEditTextViewModelInitializerProvider = provider9;
    }

    @Override // javax.inject.Provider
    public RegistrationViewModelInitializer get() {
        return newInstance(this.flowModeProvider.get(), this.signupErrorReporterProvider.get(), this.signupNetworkManagerProvider.get(), this.signupLoggerProvider.get(), this.stringProvider.get(), this.viewModelProviderFactoryProvider.get(), this.errorMessageViewModelInitializerProvider.get(), this.emailPreferenceViewModelInitializerProvider.get(), this.formViewEditTextViewModelInitializerProvider.get());
    }

    public static RegistrationViewModelInitializer_Factory create(Provider<FlowMode> provider, Provider<SignupErrorReporter> provider2, Provider<SignupNetworkManager> provider3, Provider<SignupLogger> provider4, Provider<StringProvider> provider5, Provider<ViewModelProvider.Factory> provider6, Provider<ErrorMessageViewModelInitializer> provider7, Provider<EmailPreferenceViewModelInitializer> provider8, Provider<FormViewEditTextViewModelInitializer> provider9) {
        return new RegistrationViewModelInitializer_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static RegistrationViewModelInitializer newInstance(FlowMode flowMode, SignupErrorReporter signupErrorReporter, SignupNetworkManager signupNetworkManager, SignupLogger signupLogger, StringProvider stringProvider, ViewModelProvider.Factory factory, ErrorMessageViewModelInitializer errorMessageViewModelInitializer, EmailPreferenceViewModelInitializer emailPreferenceViewModelInitializer, FormViewEditTextViewModelInitializer formViewEditTextViewModelInitializer) {
        return new RegistrationViewModelInitializer(flowMode, signupErrorReporter, signupNetworkManager, signupLogger, stringProvider, factory, errorMessageViewModelInitializer, emailPreferenceViewModelInitializer, formViewEditTextViewModelInitializer);
    }
}
