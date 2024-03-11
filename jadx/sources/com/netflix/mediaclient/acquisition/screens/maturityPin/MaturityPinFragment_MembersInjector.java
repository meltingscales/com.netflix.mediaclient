package com.netflix.mediaclient.acquisition.screens.maturityPin;

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
public final class MaturityPinFragment_MembersInjector implements MembersInjector<MaturityPinFragment> {
    private final Provider<FormDataObserverFactory> formDataObserverFactoryProvider;
    private final Provider<KeyboardController> keyboardControllerProvider;
    private final Provider<SignupMoneyballEntryPoint> moneyballEntryPointProvider;
    private final Provider<InterfaceC1573aGh> uiLatencyTrackerProvider;

    public MaturityPinFragment_MembersInjector(Provider<InterfaceC1573aGh> provider, Provider<KeyboardController> provider2, Provider<FormDataObserverFactory> provider3, Provider<SignupMoneyballEntryPoint> provider4) {
        this.uiLatencyTrackerProvider = provider;
        this.keyboardControllerProvider = provider2;
        this.formDataObserverFactoryProvider = provider3;
        this.moneyballEntryPointProvider = provider4;
    }

    public static MembersInjector<MaturityPinFragment> create(Provider<InterfaceC1573aGh> provider, Provider<KeyboardController> provider2, Provider<FormDataObserverFactory> provider3, Provider<SignupMoneyballEntryPoint> provider4) {
        return new MaturityPinFragment_MembersInjector(provider, provider2, provider3, provider4);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MaturityPinFragment maturityPinFragment) {
        SignupFragment_MembersInjector.injectUiLatencyTracker(maturityPinFragment, DoubleCheck.lazy(this.uiLatencyTrackerProvider));
        AbstractNetworkFragment2_MembersInjector.injectKeyboardController(maturityPinFragment, this.keyboardControllerProvider.get());
        injectFormDataObserverFactory(maturityPinFragment, this.formDataObserverFactoryProvider.get());
        injectMoneyballEntryPoint(maturityPinFragment, this.moneyballEntryPointProvider.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.maturityPin.MaturityPinFragment.formDataObserverFactory")
    public static void injectFormDataObserverFactory(MaturityPinFragment maturityPinFragment, FormDataObserverFactory formDataObserverFactory) {
        maturityPinFragment.formDataObserverFactory = formDataObserverFactory;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.maturityPin.MaturityPinFragment.moneyballEntryPoint")
    public static void injectMoneyballEntryPoint(MaturityPinFragment maturityPinFragment, SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        maturityPinFragment.moneyballEntryPoint = signupMoneyballEntryPoint;
    }
}
