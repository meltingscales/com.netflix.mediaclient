package com.netflix.mediaclient.acquisition.screens.orderFinal;

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

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class OrderFinalViewModelInitializer_Factory implements Factory<OrderFinalViewModelInitializer> {
    private final Provider<ErrorMessageViewModelInitializer> errorMessageViewModelInitializerProvider;
    private final Provider<FlowMode> flowModeProvider;
    private final Provider<SignupErrorReporter> signupErrorReporterProvider;
    private final Provider<SignupNetworkManager> signupNetworkManagerProvider;
    private final Provider<StringProvider> stringProvider;
    private final Provider<ViewModelProvider.Factory> viewModelProviderFactoryProvider;

    public OrderFinalViewModelInitializer_Factory(Provider<FlowMode> provider, Provider<SignupErrorReporter> provider2, Provider<StringProvider> provider3, Provider<SignupNetworkManager> provider4, Provider<ErrorMessageViewModelInitializer> provider5, Provider<ViewModelProvider.Factory> provider6) {
        this.flowModeProvider = provider;
        this.signupErrorReporterProvider = provider2;
        this.stringProvider = provider3;
        this.signupNetworkManagerProvider = provider4;
        this.errorMessageViewModelInitializerProvider = provider5;
        this.viewModelProviderFactoryProvider = provider6;
    }

    @Override // javax.inject.Provider
    public OrderFinalViewModelInitializer get() {
        return newInstance(this.flowModeProvider.get(), this.signupErrorReporterProvider.get(), this.stringProvider.get(), this.signupNetworkManagerProvider.get(), this.errorMessageViewModelInitializerProvider.get(), this.viewModelProviderFactoryProvider.get());
    }

    public static OrderFinalViewModelInitializer_Factory create(Provider<FlowMode> provider, Provider<SignupErrorReporter> provider2, Provider<StringProvider> provider3, Provider<SignupNetworkManager> provider4, Provider<ErrorMessageViewModelInitializer> provider5, Provider<ViewModelProvider.Factory> provider6) {
        return new OrderFinalViewModelInitializer_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static OrderFinalViewModelInitializer newInstance(FlowMode flowMode, SignupErrorReporter signupErrorReporter, StringProvider stringProvider, SignupNetworkManager signupNetworkManager, ErrorMessageViewModelInitializer errorMessageViewModelInitializer, ViewModelProvider.Factory factory) {
        return new OrderFinalViewModelInitializer(flowMode, signupErrorReporter, stringProvider, signupNetworkManager, errorMessageViewModelInitializer, factory);
    }
}
