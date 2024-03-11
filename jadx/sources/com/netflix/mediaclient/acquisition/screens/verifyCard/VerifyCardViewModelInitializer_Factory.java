package com.netflix.mediaclient.acquisition.screens.verifyCard;

import androidx.lifecycle.ViewModelProvider;
import com.netflix.android.moneyball.FlowMode;
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
public final class VerifyCardViewModelInitializer_Factory implements Factory<VerifyCardViewModelInitializer> {
    private final Provider<ErrorMessageViewModelInitializer> errorMessageViewModelInitializerProvider;
    private final Provider<FlowMode> flowModeProvider;
    private final Provider<SignupErrorReporter> signupErrorReporterProvider;
    private final Provider<SignupLogger> signupLoggerProvider;
    private final Provider<SignupNetworkManager> signupNetworkManagerProvider;
    private final Provider<StringProvider> stringProvider;
    private final Provider<ViewModelProvider.Factory> viewModelProviderFactoryProvider;

    public VerifyCardViewModelInitializer_Factory(Provider<FlowMode> provider, Provider<SignupErrorReporter> provider2, Provider<SignupNetworkManager> provider3, Provider<SignupLogger> provider4, Provider<StringProvider> provider5, Provider<ViewModelProvider.Factory> provider6, Provider<ErrorMessageViewModelInitializer> provider7) {
        this.flowModeProvider = provider;
        this.signupErrorReporterProvider = provider2;
        this.signupNetworkManagerProvider = provider3;
        this.signupLoggerProvider = provider4;
        this.stringProvider = provider5;
        this.viewModelProviderFactoryProvider = provider6;
        this.errorMessageViewModelInitializerProvider = provider7;
    }

    @Override // javax.inject.Provider
    public VerifyCardViewModelInitializer get() {
        return newInstance(this.flowModeProvider.get(), this.signupErrorReporterProvider.get(), this.signupNetworkManagerProvider.get(), this.signupLoggerProvider.get(), this.stringProvider.get(), this.viewModelProviderFactoryProvider.get(), this.errorMessageViewModelInitializerProvider.get());
    }

    public static VerifyCardViewModelInitializer_Factory create(Provider<FlowMode> provider, Provider<SignupErrorReporter> provider2, Provider<SignupNetworkManager> provider3, Provider<SignupLogger> provider4, Provider<StringProvider> provider5, Provider<ViewModelProvider.Factory> provider6, Provider<ErrorMessageViewModelInitializer> provider7) {
        return new VerifyCardViewModelInitializer_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static VerifyCardViewModelInitializer newInstance(FlowMode flowMode, SignupErrorReporter signupErrorReporter, SignupNetworkManager signupNetworkManager, SignupLogger signupLogger, StringProvider stringProvider, ViewModelProvider.Factory factory, ErrorMessageViewModelInitializer errorMessageViewModelInitializer) {
        return new VerifyCardViewModelInitializer(flowMode, signupErrorReporter, signupNetworkManager, signupLogger, stringProvider, factory, errorMessageViewModelInitializer);
    }
}
