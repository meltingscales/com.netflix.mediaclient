package com.netflix.mediaclient.acquisition.components.regenold;

import com.netflix.mediaclient.acquisition.components.KeyboardController;
import com.netflix.mediaclient.acquisition.components.form.FormDataObserverFactory;
import com.netflix.mediaclient.acquisition.components.form2.edittext.LastFormViewEditTextBinding;
import com.netflix.mediaclient.acquisition.components.regenold.RegenoldFragment;
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
public final class RegenoldFragment_MembersInjector implements MembersInjector<RegenoldFragment> {
    private final Provider<FormDataObserverFactory> formDataObserverFactoryProvider;
    private final Provider<KeyboardController> keyboardControllerProvider;
    private final Provider<LastFormViewEditTextBinding> lastFormViewEditTextBindingProvider;
    private final Provider<SignupMoneyballEntryPoint> moneyballEntryPointProvider;
    private final Provider<RegenoldFragment.RegenoldInteractionListener> regenoldInteractionListenerProvider;
    private final Provider<InterfaceC1573aGh> uiLatencyTrackerProvider;

    public RegenoldFragment_MembersInjector(Provider<InterfaceC1573aGh> provider, Provider<FormDataObserverFactory> provider2, Provider<SignupMoneyballEntryPoint> provider3, Provider<KeyboardController> provider4, Provider<LastFormViewEditTextBinding> provider5, Provider<RegenoldFragment.RegenoldInteractionListener> provider6) {
        this.uiLatencyTrackerProvider = provider;
        this.formDataObserverFactoryProvider = provider2;
        this.moneyballEntryPointProvider = provider3;
        this.keyboardControllerProvider = provider4;
        this.lastFormViewEditTextBindingProvider = provider5;
        this.regenoldInteractionListenerProvider = provider6;
    }

    public static MembersInjector<RegenoldFragment> create(Provider<InterfaceC1573aGh> provider, Provider<FormDataObserverFactory> provider2, Provider<SignupMoneyballEntryPoint> provider3, Provider<KeyboardController> provider4, Provider<LastFormViewEditTextBinding> provider5, Provider<RegenoldFragment.RegenoldInteractionListener> provider6) {
        return new RegenoldFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RegenoldFragment regenoldFragment) {
        C1095Om.d(regenoldFragment, DoubleCheck.lazy(this.uiLatencyTrackerProvider));
        injectFormDataObserverFactory(regenoldFragment, this.formDataObserverFactoryProvider.get());
        injectMoneyballEntryPoint(regenoldFragment, this.moneyballEntryPointProvider.get());
        injectKeyboardController(regenoldFragment, this.keyboardControllerProvider.get());
        injectLastFormViewEditTextBinding(regenoldFragment, this.lastFormViewEditTextBindingProvider.get());
        injectRegenoldInteractionListener(regenoldFragment, this.regenoldInteractionListenerProvider.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.components.regenold.RegenoldFragment.formDataObserverFactory")
    public static void injectFormDataObserverFactory(RegenoldFragment regenoldFragment, FormDataObserverFactory formDataObserverFactory) {
        regenoldFragment.formDataObserverFactory = formDataObserverFactory;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.components.regenold.RegenoldFragment.moneyballEntryPoint")
    public static void injectMoneyballEntryPoint(RegenoldFragment regenoldFragment, SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        regenoldFragment.moneyballEntryPoint = signupMoneyballEntryPoint;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.components.regenold.RegenoldFragment.keyboardController")
    public static void injectKeyboardController(RegenoldFragment regenoldFragment, KeyboardController keyboardController) {
        regenoldFragment.keyboardController = keyboardController;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.components.regenold.RegenoldFragment.lastFormViewEditTextBinding")
    public static void injectLastFormViewEditTextBinding(RegenoldFragment regenoldFragment, LastFormViewEditTextBinding lastFormViewEditTextBinding) {
        regenoldFragment.lastFormViewEditTextBinding = lastFormViewEditTextBinding;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.components.regenold.RegenoldFragment.regenoldInteractionListener")
    public static void injectRegenoldInteractionListener(RegenoldFragment regenoldFragment, RegenoldFragment.RegenoldInteractionListener regenoldInteractionListener) {
        regenoldFragment.regenoldInteractionListener = regenoldInteractionListener;
    }
}
