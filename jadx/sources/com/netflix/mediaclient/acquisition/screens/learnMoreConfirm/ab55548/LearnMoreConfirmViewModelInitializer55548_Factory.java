package com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab55548;

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
public final class LearnMoreConfirmViewModelInitializer55548_Factory implements Factory<LearnMoreConfirmViewModelInitializer55548> {
    private final Provider<ErrorMessageViewModelInitializer> errorMessageViewModelInitializerProvider;
    private final Provider<FlowMode> flowModeProvider;
    private final Provider<SignupErrorReporter> signupErrorReporterProvider;
    private final Provider<SignupNetworkManager> signupNetworkManagerProvider;
    private final Provider<StringProvider> stringProvider;

    public LearnMoreConfirmViewModelInitializer55548_Factory(Provider<FlowMode> provider, Provider<SignupErrorReporter> provider2, Provider<SignupNetworkManager> provider3, Provider<StringProvider> provider4, Provider<ErrorMessageViewModelInitializer> provider5) {
        this.flowModeProvider = provider;
        this.signupErrorReporterProvider = provider2;
        this.signupNetworkManagerProvider = provider3;
        this.stringProvider = provider4;
        this.errorMessageViewModelInitializerProvider = provider5;
    }

    @Override // javax.inject.Provider
    public LearnMoreConfirmViewModelInitializer55548 get() {
        return newInstance(this.flowModeProvider.get(), this.signupErrorReporterProvider.get(), this.signupNetworkManagerProvider.get(), this.stringProvider.get(), this.errorMessageViewModelInitializerProvider.get());
    }

    public static LearnMoreConfirmViewModelInitializer55548_Factory create(Provider<FlowMode> provider, Provider<SignupErrorReporter> provider2, Provider<SignupNetworkManager> provider3, Provider<StringProvider> provider4, Provider<ErrorMessageViewModelInitializer> provider5) {
        return new LearnMoreConfirmViewModelInitializer55548_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static LearnMoreConfirmViewModelInitializer55548 newInstance(FlowMode flowMode, SignupErrorReporter signupErrorReporter, SignupNetworkManager signupNetworkManager, StringProvider stringProvider, ErrorMessageViewModelInitializer errorMessageViewModelInitializer) {
        return new LearnMoreConfirmViewModelInitializer55548(flowMode, signupErrorReporter, signupNetworkManager, stringProvider, errorMessageViewModelInitializer);
    }
}
