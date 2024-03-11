package com.netflix.mediaclient.acquisition.screens.verifyCard;

import com.netflix.mediaclient.acquisition.components.form.FormDataObserverFactory;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import com.netflix.mediaclient.acquisition.lib.screens.SignupFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.verifyCard.VerifyCardFragment;
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
public final class VerifyCardFragment_MembersInjector implements MembersInjector<VerifyCardFragment> {
    private final Provider<FormDataObserverFactory> formDataObserverFactoryProvider;
    private final Provider<SignupMoneyballEntryPoint> moneyballEntryPointProvider;
    private final Provider<InterfaceC1573aGh> uiLatencyTrackerProvider;
    private final Provider<VerifyCardFragment.VerifyCard3dsEventListener> verifyCard3dsEventListenerProvider;

    public VerifyCardFragment_MembersInjector(Provider<InterfaceC1573aGh> provider, Provider<SignupMoneyballEntryPoint> provider2, Provider<VerifyCardFragment.VerifyCard3dsEventListener> provider3, Provider<FormDataObserverFactory> provider4) {
        this.uiLatencyTrackerProvider = provider;
        this.moneyballEntryPointProvider = provider2;
        this.verifyCard3dsEventListenerProvider = provider3;
        this.formDataObserverFactoryProvider = provider4;
    }

    public static MembersInjector<VerifyCardFragment> create(Provider<InterfaceC1573aGh> provider, Provider<SignupMoneyballEntryPoint> provider2, Provider<VerifyCardFragment.VerifyCard3dsEventListener> provider3, Provider<FormDataObserverFactory> provider4) {
        return new VerifyCardFragment_MembersInjector(provider, provider2, provider3, provider4);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(VerifyCardFragment verifyCardFragment) {
        SignupFragment_MembersInjector.injectUiLatencyTracker(verifyCardFragment, DoubleCheck.lazy(this.uiLatencyTrackerProvider));
        injectMoneyballEntryPoint(verifyCardFragment, this.moneyballEntryPointProvider.get());
        injectVerifyCard3dsEventListener(verifyCardFragment, this.verifyCard3dsEventListenerProvider.get());
        injectFormDataObserverFactory(verifyCardFragment, this.formDataObserverFactoryProvider.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.verifyCard.VerifyCardFragment.moneyballEntryPoint")
    public static void injectMoneyballEntryPoint(VerifyCardFragment verifyCardFragment, SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        verifyCardFragment.moneyballEntryPoint = signupMoneyballEntryPoint;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.verifyCard.VerifyCardFragment.verifyCard3dsEventListener")
    public static void injectVerifyCard3dsEventListener(VerifyCardFragment verifyCardFragment, VerifyCardFragment.VerifyCard3dsEventListener verifyCard3dsEventListener) {
        verifyCardFragment.verifyCard3dsEventListener = verifyCard3dsEventListener;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.verifyCard.VerifyCardFragment.formDataObserverFactory")
    public static void injectFormDataObserverFactory(VerifyCardFragment verifyCardFragment, FormDataObserverFactory formDataObserverFactory) {
        verifyCardFragment.formDataObserverFactory = formDataObserverFactory;
    }
}
