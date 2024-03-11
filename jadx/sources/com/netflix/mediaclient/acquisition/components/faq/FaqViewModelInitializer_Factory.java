package com.netflix.mediaclient.acquisition.components.faq;

import com.netflix.android.moneyball.FlowMode;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import o.InterfaceC5417byP;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class FaqViewModelInitializer_Factory implements Factory<FaqViewModelInitializer> {
    private final Provider<InterfaceC5417byP> cfourAcquisitionProvider;
    private final Provider<FlowMode> flowModeProvider;
    private final Provider<SignupErrorReporter> signupErrorReporterProvider;
    private final Provider<StringProvider> stringProvider;

    public FaqViewModelInitializer_Factory(Provider<FlowMode> provider, Provider<SignupErrorReporter> provider2, Provider<StringProvider> provider3, Provider<InterfaceC5417byP> provider4) {
        this.flowModeProvider = provider;
        this.signupErrorReporterProvider = provider2;
        this.stringProvider = provider3;
        this.cfourAcquisitionProvider = provider4;
    }

    @Override // javax.inject.Provider
    public FaqViewModelInitializer get() {
        return newInstance(this.flowModeProvider.get(), this.signupErrorReporterProvider.get(), this.stringProvider.get(), this.cfourAcquisitionProvider.get());
    }

    public static FaqViewModelInitializer_Factory create(Provider<FlowMode> provider, Provider<SignupErrorReporter> provider2, Provider<StringProvider> provider3, Provider<InterfaceC5417byP> provider4) {
        return new FaqViewModelInitializer_Factory(provider, provider2, provider3, provider4);
    }

    public static FaqViewModelInitializer newInstance(FlowMode flowMode, SignupErrorReporter signupErrorReporter, StringProvider stringProvider, InterfaceC5417byP interfaceC5417byP) {
        return new FaqViewModelInitializer(flowMode, signupErrorReporter, stringProvider, interfaceC5417byP);
    }
}
