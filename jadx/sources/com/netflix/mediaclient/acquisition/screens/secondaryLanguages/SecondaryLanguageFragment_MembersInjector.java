package com.netflix.mediaclient.acquisition.screens.secondaryLanguages;

import com.netflix.mediaclient.acquisition.components.KeyboardController;
import com.netflix.mediaclient.acquisition.components.form.FormDataObserverFactory;
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
public final class SecondaryLanguageFragment_MembersInjector implements MembersInjector<SecondaryLanguageFragment> {
    private final Provider<FormDataObserverFactory> formDataObserverFactoryProvider;
    private final Provider<KeyboardController> keyboardControllerProvider;
    private final Provider<SignupMoneyballEntryPoint> moneyballEntryPointProvider;
    private final Provider<SecondaryLanguageLogger> secondaryLanguageLoggerProvider;
    private final Provider<TtrEventListener> ttrEventListenerProvider;
    private final Provider<InterfaceC1573aGh> uiLatencyTrackerProvider;

    public SecondaryLanguageFragment_MembersInjector(Provider<InterfaceC1573aGh> provider, Provider<KeyboardController> provider2, Provider<TtrEventListener> provider3, Provider<SignupMoneyballEntryPoint> provider4, Provider<FormDataObserverFactory> provider5, Provider<SecondaryLanguageLogger> provider6) {
        this.uiLatencyTrackerProvider = provider;
        this.keyboardControllerProvider = provider2;
        this.ttrEventListenerProvider = provider3;
        this.moneyballEntryPointProvider = provider4;
        this.formDataObserverFactoryProvider = provider5;
        this.secondaryLanguageLoggerProvider = provider6;
    }

    public static MembersInjector<SecondaryLanguageFragment> create(Provider<InterfaceC1573aGh> provider, Provider<KeyboardController> provider2, Provider<TtrEventListener> provider3, Provider<SignupMoneyballEntryPoint> provider4, Provider<FormDataObserverFactory> provider5, Provider<SecondaryLanguageLogger> provider6) {
        return new SecondaryLanguageFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SecondaryLanguageFragment secondaryLanguageFragment) {
        SignupFragment_MembersInjector.injectUiLatencyTracker(secondaryLanguageFragment, DoubleCheck.lazy(this.uiLatencyTrackerProvider));
        AbstractNetworkFragment2_MembersInjector.injectKeyboardController(secondaryLanguageFragment, this.keyboardControllerProvider.get());
        injectTtrEventListener(secondaryLanguageFragment, this.ttrEventListenerProvider.get());
        injectMoneyballEntryPoint(secondaryLanguageFragment, this.moneyballEntryPointProvider.get());
        injectFormDataObserverFactory(secondaryLanguageFragment, this.formDataObserverFactoryProvider.get());
        injectSecondaryLanguageLogger(secondaryLanguageFragment, this.secondaryLanguageLoggerProvider.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageFragment.ttrEventListener")
    public static void injectTtrEventListener(SecondaryLanguageFragment secondaryLanguageFragment, TtrEventListener ttrEventListener) {
        secondaryLanguageFragment.ttrEventListener = ttrEventListener;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageFragment.moneyballEntryPoint")
    public static void injectMoneyballEntryPoint(SecondaryLanguageFragment secondaryLanguageFragment, SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        secondaryLanguageFragment.moneyballEntryPoint = signupMoneyballEntryPoint;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageFragment.formDataObserverFactory")
    public static void injectFormDataObserverFactory(SecondaryLanguageFragment secondaryLanguageFragment, FormDataObserverFactory formDataObserverFactory) {
        secondaryLanguageFragment.formDataObserverFactory = formDataObserverFactory;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageFragment.secondaryLanguageLogger")
    public static void injectSecondaryLanguageLogger(SecondaryLanguageFragment secondaryLanguageFragment, SecondaryLanguageLogger secondaryLanguageLogger) {
        secondaryLanguageFragment.secondaryLanguageLogger = secondaryLanguageLogger;
    }
}
