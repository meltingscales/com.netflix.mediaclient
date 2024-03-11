package com.netflix.mediaclient.acquisition.components.faq;

import com.netflix.mediaclient.acquisition.components.faq.FaqFragment;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;
import o.C1095Om;
import o.InterfaceC1573aGh;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class FaqFragment_MembersInjector implements MembersInjector<FaqFragment> {
    private final Provider<FaqFragment.FaqInteractionListener> faqInteractionListenerProvider;
    private final Provider<SignupMoneyballEntryPoint> moneyballEntryPointProvider;
    private final Provider<InterfaceC1573aGh> uiLatencyTrackerProvider;

    public FaqFragment_MembersInjector(Provider<InterfaceC1573aGh> provider, Provider<FaqFragment.FaqInteractionListener> provider2, Provider<SignupMoneyballEntryPoint> provider3) {
        this.uiLatencyTrackerProvider = provider;
        this.faqInteractionListenerProvider = provider2;
        this.moneyballEntryPointProvider = provider3;
    }

    public static MembersInjector<FaqFragment> create(Provider<InterfaceC1573aGh> provider, Provider<FaqFragment.FaqInteractionListener> provider2, Provider<SignupMoneyballEntryPoint> provider3) {
        return new FaqFragment_MembersInjector(provider, provider2, provider3);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(FaqFragment faqFragment) {
        C1095Om.d(faqFragment, DoubleCheck.lazy(this.uiLatencyTrackerProvider));
        injectFaqInteractionListener(faqFragment, this.faqInteractionListenerProvider.get());
        injectMoneyballEntryPoint(faqFragment, this.moneyballEntryPointProvider.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.components.faq.FaqFragment.faqInteractionListener")
    public static void injectFaqInteractionListener(FaqFragment faqFragment, FaqFragment.FaqInteractionListener faqInteractionListener) {
        faqFragment.faqInteractionListener = faqInteractionListener;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.components.faq.FaqFragment.moneyballEntryPoint")
    public static void injectMoneyballEntryPoint(FaqFragment faqFragment, SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        faqFragment.moneyballEntryPoint = signupMoneyballEntryPoint;
    }
}
