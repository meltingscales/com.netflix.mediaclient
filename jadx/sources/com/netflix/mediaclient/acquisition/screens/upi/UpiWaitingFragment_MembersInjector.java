package com.netflix.mediaclient.acquisition.screens.upi;

import com.netflix.mediaclient.acquisition.components.KeyboardController;
import com.netflix.mediaclient.acquisition.components.form.FormDataObserverFactory;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import com.netflix.mediaclient.acquisition.lib.screens.SignupFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.upi.UpiWaitingFragment;
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
public final class UpiWaitingFragment_MembersInjector implements MembersInjector<UpiWaitingFragment> {
    private final Provider<FormDataObserverFactory> formDataObserverFactoryProvider;
    private final Provider<UpiWaitingFragment.InteractionListener> interactionListenerProvider;
    private final Provider<KeyboardController> keyboardControllerProvider;
    private final Provider<SignupMoneyballEntryPoint> moneyballEntryPointProvider;
    private final Provider<InterfaceC1573aGh> uiLatencyTrackerProvider;

    public UpiWaitingFragment_MembersInjector(Provider<InterfaceC1573aGh> provider, Provider<KeyboardController> provider2, Provider<SignupMoneyballEntryPoint> provider3, Provider<FormDataObserverFactory> provider4, Provider<UpiWaitingFragment.InteractionListener> provider5) {
        this.uiLatencyTrackerProvider = provider;
        this.keyboardControllerProvider = provider2;
        this.moneyballEntryPointProvider = provider3;
        this.formDataObserverFactoryProvider = provider4;
        this.interactionListenerProvider = provider5;
    }

    public static MembersInjector<UpiWaitingFragment> create(Provider<InterfaceC1573aGh> provider, Provider<KeyboardController> provider2, Provider<SignupMoneyballEntryPoint> provider3, Provider<FormDataObserverFactory> provider4, Provider<UpiWaitingFragment.InteractionListener> provider5) {
        return new UpiWaitingFragment_MembersInjector(provider, provider2, provider3, provider4, provider5);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(UpiWaitingFragment upiWaitingFragment) {
        SignupFragment_MembersInjector.injectUiLatencyTracker(upiWaitingFragment, DoubleCheck.lazy(this.uiLatencyTrackerProvider));
        AbstractNetworkFragment2_MembersInjector.injectKeyboardController(upiWaitingFragment, this.keyboardControllerProvider.get());
        injectMoneyballEntryPoint(upiWaitingFragment, this.moneyballEntryPointProvider.get());
        injectFormDataObserverFactory(upiWaitingFragment, this.formDataObserverFactoryProvider.get());
        injectInteractionListener(upiWaitingFragment, this.interactionListenerProvider.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.upi.UpiWaitingFragment.moneyballEntryPoint")
    public static void injectMoneyballEntryPoint(UpiWaitingFragment upiWaitingFragment, SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        upiWaitingFragment.moneyballEntryPoint = signupMoneyballEntryPoint;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.upi.UpiWaitingFragment.formDataObserverFactory")
    public static void injectFormDataObserverFactory(UpiWaitingFragment upiWaitingFragment, FormDataObserverFactory formDataObserverFactory) {
        upiWaitingFragment.formDataObserverFactory = formDataObserverFactory;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.upi.UpiWaitingFragment.interactionListener")
    public static void injectInteractionListener(UpiWaitingFragment upiWaitingFragment, UpiWaitingFragment.InteractionListener interactionListener) {
        upiWaitingFragment.interactionListener = interactionListener;
    }
}
