package com.netflix.mediaclient.acquisition.screens.learnMoreConfirm;

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
import o.InterfaceC1573aGh;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class LearnMoreConfirmFragment_MembersInjector implements MembersInjector<LearnMoreConfirmFragment> {
    private final Provider<KeyboardController> keyboardControllerProvider;
    private final Provider<SignupMoneyballEntryPoint> moneyballEntryPointProvider;
    private final Provider<TtrEventListener> ttrEventListenerProvider;
    private final Provider<InterfaceC1573aGh> uiLatencyTrackerProvider;

    public LearnMoreConfirmFragment_MembersInjector(Provider<InterfaceC1573aGh> provider, Provider<KeyboardController> provider2, Provider<SignupMoneyballEntryPoint> provider3, Provider<TtrEventListener> provider4) {
        this.uiLatencyTrackerProvider = provider;
        this.keyboardControllerProvider = provider2;
        this.moneyballEntryPointProvider = provider3;
        this.ttrEventListenerProvider = provider4;
    }

    public static MembersInjector<LearnMoreConfirmFragment> create(Provider<InterfaceC1573aGh> provider, Provider<KeyboardController> provider2, Provider<SignupMoneyballEntryPoint> provider3, Provider<TtrEventListener> provider4) {
        return new LearnMoreConfirmFragment_MembersInjector(provider, provider2, provider3, provider4);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(LearnMoreConfirmFragment learnMoreConfirmFragment) {
        SignupFragment_MembersInjector.injectUiLatencyTracker(learnMoreConfirmFragment, DoubleCheck.lazy(this.uiLatencyTrackerProvider));
        AbstractNetworkFragment2_MembersInjector.injectKeyboardController(learnMoreConfirmFragment, this.keyboardControllerProvider.get());
        injectMoneyballEntryPoint(learnMoreConfirmFragment, this.moneyballEntryPointProvider.get());
        injectTtrEventListener(learnMoreConfirmFragment, this.ttrEventListenerProvider.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.LearnMoreConfirmFragment.moneyballEntryPoint")
    public static void injectMoneyballEntryPoint(LearnMoreConfirmFragment learnMoreConfirmFragment, SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        learnMoreConfirmFragment.moneyballEntryPoint = signupMoneyballEntryPoint;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.LearnMoreConfirmFragment.ttrEventListener")
    public static void injectTtrEventListener(LearnMoreConfirmFragment learnMoreConfirmFragment, TtrEventListener ttrEventListener) {
        learnMoreConfirmFragment.ttrEventListener = ttrEventListener;
    }
}
