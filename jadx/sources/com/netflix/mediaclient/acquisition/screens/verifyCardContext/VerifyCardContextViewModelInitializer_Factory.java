package com.netflix.mediaclient.acquisition.screens.verifyCardContext;

import androidx.lifecycle.ViewModelProvider;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
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
public final class VerifyCardContextViewModelInitializer_Factory implements Factory<VerifyCardContextViewModelInitializer> {
    private final Provider<InterfaceC1270Vf> clockProvider;
    private final Provider<FlowMode> flowModeProvider;
    private final Provider<SignupErrorReporter> signupErrorReporterProvider;
    private final Provider<StringProvider> stringProvider;
    private final Provider<ViewModelProvider.Factory> viewModelProviderFactoryProvider;

    public VerifyCardContextViewModelInitializer_Factory(Provider<FlowMode> provider, Provider<SignupErrorReporter> provider2, Provider<StringProvider> provider3, Provider<ViewModelProvider.Factory> provider4, Provider<InterfaceC1270Vf> provider5) {
        this.flowModeProvider = provider;
        this.signupErrorReporterProvider = provider2;
        this.stringProvider = provider3;
        this.viewModelProviderFactoryProvider = provider4;
        this.clockProvider = provider5;
    }

    @Override // javax.inject.Provider
    public VerifyCardContextViewModelInitializer get() {
        return newInstance(this.flowModeProvider.get(), this.signupErrorReporterProvider.get(), this.stringProvider.get(), this.viewModelProviderFactoryProvider.get(), this.clockProvider.get());
    }

    public static VerifyCardContextViewModelInitializer_Factory create(Provider<FlowMode> provider, Provider<SignupErrorReporter> provider2, Provider<StringProvider> provider3, Provider<ViewModelProvider.Factory> provider4, Provider<InterfaceC1270Vf> provider5) {
        return new VerifyCardContextViewModelInitializer_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static VerifyCardContextViewModelInitializer newInstance(FlowMode flowMode, SignupErrorReporter signupErrorReporter, StringProvider stringProvider, ViewModelProvider.Factory factory, InterfaceC1270Vf interfaceC1270Vf) {
        return new VerifyCardContextViewModelInitializer(flowMode, signupErrorReporter, stringProvider, factory, interfaceC1270Vf);
    }
}
