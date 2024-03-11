package com.netflix.mediaclient.acquisition.screens.maturityPin;

import androidx.lifecycle.ViewModelProvider;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.mediaclient.acquisition.components.form2.maturityPinEntry.MaturityPinEntryViewModelInitializer;
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
public final class MaturityPinViewModelInitializer_Factory implements Factory<MaturityPinViewModelInitializer> {
    private final Provider<ErrorMessageViewModelInitializer> errorMessageViewModelInitializerProvider;
    private final Provider<FlowMode> flowModeProvider;
    private final Provider<MaturityPinEntryViewModelInitializer> maturityPinEntryViewModelInitializerProvider;
    private final Provider<SignupErrorReporter> signupErrorReporterProvider;
    private final Provider<SignupNetworkManager> signupNetworkManagerProvider;
    private final Provider<StringProvider> stringProvider;
    private final Provider<ViewModelProvider.Factory> viewModelProviderFactoryProvider;

    public MaturityPinViewModelInitializer_Factory(Provider<FlowMode> provider, Provider<SignupErrorReporter> provider2, Provider<StringProvider> provider3, Provider<SignupNetworkManager> provider4, Provider<ErrorMessageViewModelInitializer> provider5, Provider<ViewModelProvider.Factory> provider6, Provider<MaturityPinEntryViewModelInitializer> provider7) {
        this.flowModeProvider = provider;
        this.signupErrorReporterProvider = provider2;
        this.stringProvider = provider3;
        this.signupNetworkManagerProvider = provider4;
        this.errorMessageViewModelInitializerProvider = provider5;
        this.viewModelProviderFactoryProvider = provider6;
        this.maturityPinEntryViewModelInitializerProvider = provider7;
    }

    @Override // javax.inject.Provider
    public MaturityPinViewModelInitializer get() {
        return newInstance(this.flowModeProvider.get(), this.signupErrorReporterProvider.get(), this.stringProvider.get(), this.signupNetworkManagerProvider.get(), this.errorMessageViewModelInitializerProvider.get(), this.viewModelProviderFactoryProvider.get(), this.maturityPinEntryViewModelInitializerProvider.get());
    }

    public static MaturityPinViewModelInitializer_Factory create(Provider<FlowMode> provider, Provider<SignupErrorReporter> provider2, Provider<StringProvider> provider3, Provider<SignupNetworkManager> provider4, Provider<ErrorMessageViewModelInitializer> provider5, Provider<ViewModelProvider.Factory> provider6, Provider<MaturityPinEntryViewModelInitializer> provider7) {
        return new MaturityPinViewModelInitializer_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static MaturityPinViewModelInitializer newInstance(FlowMode flowMode, SignupErrorReporter signupErrorReporter, StringProvider stringProvider, SignupNetworkManager signupNetworkManager, ErrorMessageViewModelInitializer errorMessageViewModelInitializer, ViewModelProvider.Factory factory, MaturityPinEntryViewModelInitializer maturityPinEntryViewModelInitializer) {
        return new MaturityPinViewModelInitializer(flowMode, signupErrorReporter, stringProvider, signupNetworkManager, errorMessageViewModelInitializer, factory, maturityPinEntryViewModelInitializer);
    }
}
