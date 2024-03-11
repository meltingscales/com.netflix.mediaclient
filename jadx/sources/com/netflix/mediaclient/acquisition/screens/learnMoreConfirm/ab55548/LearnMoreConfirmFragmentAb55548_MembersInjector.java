package com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab55548;

import com.netflix.mediaclient.acquisition.components.KeyboardController;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import com.netflix.mediaclient.acquisition.lib.screens.SignupFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2_MembersInjector;
import com.netflix.mediaclient.acquisition.services.logging.TtrEventListener;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;
import o.InterfaceC1570aGe;
import o.InterfaceC1573aGh;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class LearnMoreConfirmFragmentAb55548_MembersInjector implements MembersInjector<LearnMoreConfirmFragmentAb55548> {
    private final Provider<InterfaceC1570aGe> imageLoaderComposeProvider;
    private final Provider<KeyboardController> keyboardControllerProvider;
    private final Provider<SignupMoneyballEntryPoint> moneyballEntryPointProvider;
    private final Provider<TtrEventListener> ttrEventListenerProvider;
    private final Provider<InterfaceC1573aGh> uiLatencyTrackerProvider;

    public LearnMoreConfirmFragmentAb55548_MembersInjector(Provider<InterfaceC1573aGh> provider, Provider<KeyboardController> provider2, Provider<SignupMoneyballEntryPoint> provider3, Provider<TtrEventListener> provider4, Provider<InterfaceC1570aGe> provider5) {
        this.uiLatencyTrackerProvider = provider;
        this.keyboardControllerProvider = provider2;
        this.moneyballEntryPointProvider = provider3;
        this.ttrEventListenerProvider = provider4;
        this.imageLoaderComposeProvider = provider5;
    }

    public static MembersInjector<LearnMoreConfirmFragmentAb55548> create(Provider<InterfaceC1573aGh> provider, Provider<KeyboardController> provider2, Provider<SignupMoneyballEntryPoint> provider3, Provider<TtrEventListener> provider4, Provider<InterfaceC1570aGe> provider5) {
        return new LearnMoreConfirmFragmentAb55548_MembersInjector(provider, provider2, provider3, provider4, provider5);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(LearnMoreConfirmFragmentAb55548 learnMoreConfirmFragmentAb55548) {
        SignupFragment_MembersInjector.injectUiLatencyTracker(learnMoreConfirmFragmentAb55548, DoubleCheck.lazy(this.uiLatencyTrackerProvider));
        AbstractNetworkFragment2_MembersInjector.injectKeyboardController(learnMoreConfirmFragmentAb55548, this.keyboardControllerProvider.get());
        injectMoneyballEntryPoint(learnMoreConfirmFragmentAb55548, this.moneyballEntryPointProvider.get());
        injectTtrEventListener(learnMoreConfirmFragmentAb55548, this.ttrEventListenerProvider.get());
        injectImageLoaderCompose(learnMoreConfirmFragmentAb55548, this.imageLoaderComposeProvider.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab55548.LearnMoreConfirmFragmentAb55548.moneyballEntryPoint")
    public static void injectMoneyballEntryPoint(LearnMoreConfirmFragmentAb55548 learnMoreConfirmFragmentAb55548, SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        learnMoreConfirmFragmentAb55548.moneyballEntryPoint = signupMoneyballEntryPoint;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab55548.LearnMoreConfirmFragmentAb55548.ttrEventListener")
    public static void injectTtrEventListener(LearnMoreConfirmFragmentAb55548 learnMoreConfirmFragmentAb55548, TtrEventListener ttrEventListener) {
        learnMoreConfirmFragmentAb55548.ttrEventListener = ttrEventListener;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab55548.LearnMoreConfirmFragmentAb55548.imageLoaderCompose")
    public static void injectImageLoaderCompose(LearnMoreConfirmFragmentAb55548 learnMoreConfirmFragmentAb55548, InterfaceC1570aGe interfaceC1570aGe) {
        learnMoreConfirmFragmentAb55548.imageLoaderCompose = interfaceC1570aGe;
    }
}
