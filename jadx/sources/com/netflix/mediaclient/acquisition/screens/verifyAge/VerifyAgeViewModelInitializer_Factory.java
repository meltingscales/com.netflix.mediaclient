package com.netflix.mediaclient.acquisition.screens.verifyAge;

import androidx.lifecycle.ViewModelProvider;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.mediaclient.acquisition.components.form2.ageVerify.BirthYearEditTextViewModelInitializer;
import com.netflix.mediaclient.acquisition.components.form2.maturityPinEntry.MaturityPinEntryViewModelInitializer;
import com.netflix.mediaclient.acquisition.components.form2.popupEditText.BirthDateViewModelInitializer;
import com.netflix.mediaclient.acquisition.components.form2.popupEditText.BirthMonthViewModelInitializer;
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
public final class VerifyAgeViewModelInitializer_Factory implements Factory<VerifyAgeViewModelInitializer> {
    private final Provider<BirthDateViewModelInitializer> birthDateViewModelInitializerProvider;
    private final Provider<BirthMonthViewModelInitializer> birthMonthViewModelInitializerProvider;
    private final Provider<BirthYearEditTextViewModelInitializer> birthYearEditTextViewModelInitializerProvider;
    private final Provider<ErrorMessageViewModelInitializer> errorMessageViewModelInitializerProvider;
    private final Provider<FlowMode> flowModeProvider;
    private final Provider<MaturityPinEntryViewModelInitializer> maturityPinEntryViewModelInitializerProvider;
    private final Provider<SignupErrorReporter> signupErrorReporterProvider;
    private final Provider<SignupNetworkManager> signupNetworkManagerProvider;
    private final Provider<StringProvider> stringProvider;
    private final Provider<ViewModelProvider.Factory> viewModelProviderFactoryProvider;

    public VerifyAgeViewModelInitializer_Factory(Provider<FlowMode> provider, Provider<SignupErrorReporter> provider2, Provider<StringProvider> provider3, Provider<SignupNetworkManager> provider4, Provider<ErrorMessageViewModelInitializer> provider5, Provider<ViewModelProvider.Factory> provider6, Provider<BirthMonthViewModelInitializer> provider7, Provider<BirthDateViewModelInitializer> provider8, Provider<BirthYearEditTextViewModelInitializer> provider9, Provider<MaturityPinEntryViewModelInitializer> provider10) {
        this.flowModeProvider = provider;
        this.signupErrorReporterProvider = provider2;
        this.stringProvider = provider3;
        this.signupNetworkManagerProvider = provider4;
        this.errorMessageViewModelInitializerProvider = provider5;
        this.viewModelProviderFactoryProvider = provider6;
        this.birthMonthViewModelInitializerProvider = provider7;
        this.birthDateViewModelInitializerProvider = provider8;
        this.birthYearEditTextViewModelInitializerProvider = provider9;
        this.maturityPinEntryViewModelInitializerProvider = provider10;
    }

    @Override // javax.inject.Provider
    public VerifyAgeViewModelInitializer get() {
        return newInstance(this.flowModeProvider.get(), this.signupErrorReporterProvider.get(), this.stringProvider.get(), this.signupNetworkManagerProvider.get(), this.errorMessageViewModelInitializerProvider.get(), this.viewModelProviderFactoryProvider.get(), this.birthMonthViewModelInitializerProvider.get(), this.birthDateViewModelInitializerProvider.get(), this.birthYearEditTextViewModelInitializerProvider.get(), this.maturityPinEntryViewModelInitializerProvider.get());
    }

    public static VerifyAgeViewModelInitializer_Factory create(Provider<FlowMode> provider, Provider<SignupErrorReporter> provider2, Provider<StringProvider> provider3, Provider<SignupNetworkManager> provider4, Provider<ErrorMessageViewModelInitializer> provider5, Provider<ViewModelProvider.Factory> provider6, Provider<BirthMonthViewModelInitializer> provider7, Provider<BirthDateViewModelInitializer> provider8, Provider<BirthYearEditTextViewModelInitializer> provider9, Provider<MaturityPinEntryViewModelInitializer> provider10) {
        return new VerifyAgeViewModelInitializer_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static VerifyAgeViewModelInitializer newInstance(FlowMode flowMode, SignupErrorReporter signupErrorReporter, StringProvider stringProvider, SignupNetworkManager signupNetworkManager, ErrorMessageViewModelInitializer errorMessageViewModelInitializer, ViewModelProvider.Factory factory, BirthMonthViewModelInitializer birthMonthViewModelInitializer, BirthDateViewModelInitializer birthDateViewModelInitializer, BirthYearEditTextViewModelInitializer birthYearEditTextViewModelInitializer, MaturityPinEntryViewModelInitializer maturityPinEntryViewModelInitializer) {
        return new VerifyAgeViewModelInitializer(flowMode, signupErrorReporter, stringProvider, signupNetworkManager, errorMessageViewModelInitializer, factory, birthMonthViewModelInitializer, birthDateViewModelInitializer, birthYearEditTextViewModelInitializer, maturityPinEntryViewModelInitializer);
    }
}
