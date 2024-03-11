package com.netflix.mediaclient.acquisition.screens.upi;

import androidx.lifecycle.ViewModelProvider;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import o.InterfaceC1270Vf;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class UpiWaitingViewModelInitializer_Factory implements Factory<UpiWaitingViewModelInitializer> {
    private final Provider<InterfaceC1270Vf> clockProvider;
    private final Provider<ErrorMessageViewModelInitializer> errorMessageViewModelInitializerProvider;
    private final Provider<FlowMode> initialFlowModeProvider;
    private final Provider<SignupErrorReporter> signupErrorReporterProvider;
    private final Provider<SignupNetworkManager> signupNetworkManagerProvider;
    private final Provider<StringProvider> stringProvider;
    private final Provider<ViewModelProvider.Factory> viewModelProviderFactoryProvider;

    public UpiWaitingViewModelInitializer_Factory(Provider<FlowMode> provider, Provider<SignupNetworkManager> provider2, Provider<StringProvider> provider3, Provider<ErrorMessageViewModelInitializer> provider4, Provider<ViewModelProvider.Factory> provider5, Provider<InterfaceC1270Vf> provider6, Provider<SignupErrorReporter> provider7) {
        this.initialFlowModeProvider = provider;
        this.signupNetworkManagerProvider = provider2;
        this.stringProvider = provider3;
        this.errorMessageViewModelInitializerProvider = provider4;
        this.viewModelProviderFactoryProvider = provider5;
        this.clockProvider = provider6;
        this.signupErrorReporterProvider = provider7;
    }

    @Override // javax.inject.Provider
    public UpiWaitingViewModelInitializer get() {
        return newInstance(this.initialFlowModeProvider.get(), this.signupNetworkManagerProvider.get(), this.stringProvider.get(), this.errorMessageViewModelInitializerProvider.get(), this.viewModelProviderFactoryProvider.get(), this.clockProvider.get(), this.signupErrorReporterProvider.get());
    }

    public static UpiWaitingViewModelInitializer_Factory create(Provider<FlowMode> provider, Provider<SignupNetworkManager> provider2, Provider<StringProvider> provider3, Provider<ErrorMessageViewModelInitializer> provider4, Provider<ViewModelProvider.Factory> provider5, Provider<InterfaceC1270Vf> provider6, Provider<SignupErrorReporter> provider7) {
        return new UpiWaitingViewModelInitializer_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static UpiWaitingViewModelInitializer newInstance(FlowMode flowMode, SignupNetworkManager signupNetworkManager, StringProvider stringProvider, ErrorMessageViewModelInitializer errorMessageViewModelInitializer, ViewModelProvider.Factory factory, InterfaceC1270Vf interfaceC1270Vf, SignupErrorReporter signupErrorReporter) {
        return new UpiWaitingViewModelInitializer(flowMode, signupNetworkManager, stringProvider, errorMessageViewModelInitializer, factory, interfaceC1270Vf, signupErrorReporter);
    }
}
