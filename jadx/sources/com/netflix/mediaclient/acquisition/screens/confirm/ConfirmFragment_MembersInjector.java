package com.netflix.mediaclient.acquisition.screens.confirm;

import com.netflix.mediaclient.acquisition.components.KeyboardController;
import com.netflix.mediaclient.acquisition.components.form.FormDataObserverFactory;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import com.netflix.mediaclient.acquisition.lib.screens.SignupFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.creditDebit.EmvcoEventLogger;
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
public final class ConfirmFragment_MembersInjector implements MembersInjector<ConfirmFragment> {
    private final Provider<EmvcoEventLogger> emvcoEventLoggerProvider;
    private final Provider<FormDataObserverFactory> formDataObserverFactoryProvider;
    private final Provider<KeyboardController> keyboardControllerProvider;
    private final Provider<SignupMoneyballEntryPoint> moneyballEntryPointProvider;
    private final Provider<InterfaceC1573aGh> uiLatencyTrackerProvider;

    public ConfirmFragment_MembersInjector(Provider<InterfaceC1573aGh> provider, Provider<KeyboardController> provider2, Provider<SignupMoneyballEntryPoint> provider3, Provider<FormDataObserverFactory> provider4, Provider<EmvcoEventLogger> provider5) {
        this.uiLatencyTrackerProvider = provider;
        this.keyboardControllerProvider = provider2;
        this.moneyballEntryPointProvider = provider3;
        this.formDataObserverFactoryProvider = provider4;
        this.emvcoEventLoggerProvider = provider5;
    }

    public static MembersInjector<ConfirmFragment> create(Provider<InterfaceC1573aGh> provider, Provider<KeyboardController> provider2, Provider<SignupMoneyballEntryPoint> provider3, Provider<FormDataObserverFactory> provider4, Provider<EmvcoEventLogger> provider5) {
        return new ConfirmFragment_MembersInjector(provider, provider2, provider3, provider4, provider5);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ConfirmFragment confirmFragment) {
        SignupFragment_MembersInjector.injectUiLatencyTracker(confirmFragment, DoubleCheck.lazy(this.uiLatencyTrackerProvider));
        AbstractNetworkFragment2_MembersInjector.injectKeyboardController(confirmFragment, this.keyboardControllerProvider.get());
        injectMoneyballEntryPoint(confirmFragment, this.moneyballEntryPointProvider.get());
        injectFormDataObserverFactory(confirmFragment, this.formDataObserverFactoryProvider.get());
        injectEmvcoEventLogger(confirmFragment, this.emvcoEventLoggerProvider.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.confirm.ConfirmFragment.moneyballEntryPoint")
    public static void injectMoneyballEntryPoint(ConfirmFragment confirmFragment, SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        confirmFragment.moneyballEntryPoint = signupMoneyballEntryPoint;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.confirm.ConfirmFragment.formDataObserverFactory")
    public static void injectFormDataObserverFactory(ConfirmFragment confirmFragment, FormDataObserverFactory formDataObserverFactory) {
        confirmFragment.formDataObserverFactory = formDataObserverFactory;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.confirm.ConfirmFragment.emvcoEventLogger")
    public static void injectEmvcoEventLogger(ConfirmFragment confirmFragment, EmvcoEventLogger emvcoEventLogger) {
        confirmFragment.emvcoEventLogger = emvcoEventLogger;
    }
}
