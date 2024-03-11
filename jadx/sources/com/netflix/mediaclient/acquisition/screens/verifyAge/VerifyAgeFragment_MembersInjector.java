package com.netflix.mediaclient.acquisition.screens.verifyAge;

import com.netflix.mediaclient.acquisition.components.KeyboardController;
import com.netflix.mediaclient.acquisition.components.form.FormDataObserverFactory;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import com.netflix.mediaclient.acquisition.lib.screens.SignupFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2_MembersInjector;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;
import o.InterfaceC1573aGh;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class VerifyAgeFragment_MembersInjector implements MembersInjector<VerifyAgeFragment> {
    private final Provider<FormDataObserverFactory> formDataObserverFactoryProvider;
    private final Provider<KeyboardController> keyboardControllerProvider;
    private final Provider<SignupMoneyballEntryPoint> moneyballEntryPointProvider;
    private final Provider<InterfaceC1573aGh> uiLatencyTrackerProvider;

    public VerifyAgeFragment_MembersInjector(Provider<InterfaceC1573aGh> provider, Provider<KeyboardController> provider2, Provider<FormDataObserverFactory> provider3, Provider<SignupMoneyballEntryPoint> provider4) {
        this.uiLatencyTrackerProvider = provider;
        this.keyboardControllerProvider = provider2;
        this.formDataObserverFactoryProvider = provider3;
        this.moneyballEntryPointProvider = provider4;
    }

    public static MembersInjector<VerifyAgeFragment> create(Provider<InterfaceC1573aGh> provider, Provider<KeyboardController> provider2, Provider<FormDataObserverFactory> provider3, Provider<SignupMoneyballEntryPoint> provider4) {
        return new VerifyAgeFragment_MembersInjector(provider, provider2, provider3, provider4);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(VerifyAgeFragment verifyAgeFragment) {
        SignupFragment_MembersInjector.injectUiLatencyTracker(verifyAgeFragment, DoubleCheck.lazy(this.uiLatencyTrackerProvider));
        AbstractNetworkFragment2_MembersInjector.injectKeyboardController(verifyAgeFragment, this.keyboardControllerProvider.get());
        injectFormDataObserverFactory(verifyAgeFragment, this.formDataObserverFactoryProvider.get());
        injectMoneyballEntryPoint(verifyAgeFragment, this.moneyballEntryPointProvider.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.verifyAge.VerifyAgeFragment.formDataObserverFactory")
    public static void injectFormDataObserverFactory(VerifyAgeFragment verifyAgeFragment, FormDataObserverFactory formDataObserverFactory) {
        verifyAgeFragment.formDataObserverFactory = formDataObserverFactory;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.verifyAge.VerifyAgeFragment.moneyballEntryPoint")
    public static void injectMoneyballEntryPoint(VerifyAgeFragment verifyAgeFragment, SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        verifyAgeFragment.moneyballEntryPoint = signupMoneyballEntryPoint;
    }
}
