package com.netflix.mediaclient.acquisition.screens.verifyCardContext;

import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import com.netflix.mediaclient.acquisition.lib.screens.SignupFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.verifyCardContext.VerifyCardContextFragment;
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
public final class VerifyCardContextFragment_MembersInjector implements MembersInjector<VerifyCardContextFragment> {
    private final Provider<VerifyCardContextFragment.EventListener> eventListenerProvider;
    private final Provider<SignupMoneyballEntryPoint> moneyballEntryPointProvider;
    private final Provider<InterfaceC1573aGh> uiLatencyTrackerProvider;
    private final Provider<VerifyCardContextFragment.VerifyCardContextClickListener> verifyCardContextClickListenerProvider;

    public VerifyCardContextFragment_MembersInjector(Provider<InterfaceC1573aGh> provider, Provider<SignupMoneyballEntryPoint> provider2, Provider<VerifyCardContextFragment.VerifyCardContextClickListener> provider3, Provider<VerifyCardContextFragment.EventListener> provider4) {
        this.uiLatencyTrackerProvider = provider;
        this.moneyballEntryPointProvider = provider2;
        this.verifyCardContextClickListenerProvider = provider3;
        this.eventListenerProvider = provider4;
    }

    public static MembersInjector<VerifyCardContextFragment> create(Provider<InterfaceC1573aGh> provider, Provider<SignupMoneyballEntryPoint> provider2, Provider<VerifyCardContextFragment.VerifyCardContextClickListener> provider3, Provider<VerifyCardContextFragment.EventListener> provider4) {
        return new VerifyCardContextFragment_MembersInjector(provider, provider2, provider3, provider4);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(VerifyCardContextFragment verifyCardContextFragment) {
        SignupFragment_MembersInjector.injectUiLatencyTracker(verifyCardContextFragment, DoubleCheck.lazy(this.uiLatencyTrackerProvider));
        injectMoneyballEntryPoint(verifyCardContextFragment, this.moneyballEntryPointProvider.get());
        injectVerifyCardContextClickListener(verifyCardContextFragment, this.verifyCardContextClickListenerProvider.get());
        injectEventListener(verifyCardContextFragment, this.eventListenerProvider.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.verifyCardContext.VerifyCardContextFragment.moneyballEntryPoint")
    public static void injectMoneyballEntryPoint(VerifyCardContextFragment verifyCardContextFragment, SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        verifyCardContextFragment.moneyballEntryPoint = signupMoneyballEntryPoint;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.verifyCardContext.VerifyCardContextFragment.verifyCardContextClickListener")
    public static void injectVerifyCardContextClickListener(VerifyCardContextFragment verifyCardContextFragment, VerifyCardContextFragment.VerifyCardContextClickListener verifyCardContextClickListener) {
        verifyCardContextFragment.verifyCardContextClickListener = verifyCardContextClickListener;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.verifyCardContext.VerifyCardContextFragment.eventListener")
    public static void injectEventListener(VerifyCardContextFragment verifyCardContextFragment, VerifyCardContextFragment.EventListener eventListener) {
        verifyCardContextFragment.eventListener = eventListener;
    }
}
