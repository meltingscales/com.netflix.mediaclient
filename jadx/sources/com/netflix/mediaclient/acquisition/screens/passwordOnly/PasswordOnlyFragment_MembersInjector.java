package com.netflix.mediaclient.acquisition.screens.passwordOnly;

import com.netflix.mediaclient.acquisition.components.KeyboardController;
import com.netflix.mediaclient.acquisition.components.form.FormDataObserverFactory;
import com.netflix.mediaclient.acquisition.components.form2.edittext.LastFormViewEditTextBinding;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import com.netflix.mediaclient.acquisition.lib.screens.SignupFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.passwordOnly.PasswordOnlyFragment;
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
public final class PasswordOnlyFragment_MembersInjector implements MembersInjector<PasswordOnlyFragment> {
    private final Provider<FormDataObserverFactory> formDataObserverFactoryProvider;
    private final Provider<KeyboardController> keyboardControllerProvider;
    private final Provider<LastFormViewEditTextBinding> lastFormViewEditTextBindingProvider;
    private final Provider<SignupMoneyballEntryPoint> moneyballEntryPointProvider;
    private final Provider<PasswordOnlyFragment.PasswordOnlyInteractionListener> passwordOnlyInteractionListenerProvider;
    private final Provider<InterfaceC1573aGh> uiLatencyTrackerProvider;

    public PasswordOnlyFragment_MembersInjector(Provider<InterfaceC1573aGh> provider, Provider<KeyboardController> provider2, Provider<FormDataObserverFactory> provider3, Provider<SignupMoneyballEntryPoint> provider4, Provider<LastFormViewEditTextBinding> provider5, Provider<PasswordOnlyFragment.PasswordOnlyInteractionListener> provider6) {
        this.uiLatencyTrackerProvider = provider;
        this.keyboardControllerProvider = provider2;
        this.formDataObserverFactoryProvider = provider3;
        this.moneyballEntryPointProvider = provider4;
        this.lastFormViewEditTextBindingProvider = provider5;
        this.passwordOnlyInteractionListenerProvider = provider6;
    }

    public static MembersInjector<PasswordOnlyFragment> create(Provider<InterfaceC1573aGh> provider, Provider<KeyboardController> provider2, Provider<FormDataObserverFactory> provider3, Provider<SignupMoneyballEntryPoint> provider4, Provider<LastFormViewEditTextBinding> provider5, Provider<PasswordOnlyFragment.PasswordOnlyInteractionListener> provider6) {
        return new PasswordOnlyFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PasswordOnlyFragment passwordOnlyFragment) {
        SignupFragment_MembersInjector.injectUiLatencyTracker(passwordOnlyFragment, DoubleCheck.lazy(this.uiLatencyTrackerProvider));
        AbstractNetworkFragment2_MembersInjector.injectKeyboardController(passwordOnlyFragment, this.keyboardControllerProvider.get());
        injectFormDataObserverFactory(passwordOnlyFragment, this.formDataObserverFactoryProvider.get());
        injectMoneyballEntryPoint(passwordOnlyFragment, this.moneyballEntryPointProvider.get());
        injectLastFormViewEditTextBinding(passwordOnlyFragment, this.lastFormViewEditTextBindingProvider.get());
        injectPasswordOnlyInteractionListener(passwordOnlyFragment, this.passwordOnlyInteractionListenerProvider.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.passwordOnly.PasswordOnlyFragment.formDataObserverFactory")
    public static void injectFormDataObserverFactory(PasswordOnlyFragment passwordOnlyFragment, FormDataObserverFactory formDataObserverFactory) {
        passwordOnlyFragment.formDataObserverFactory = formDataObserverFactory;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.passwordOnly.PasswordOnlyFragment.moneyballEntryPoint")
    public static void injectMoneyballEntryPoint(PasswordOnlyFragment passwordOnlyFragment, SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        passwordOnlyFragment.moneyballEntryPoint = signupMoneyballEntryPoint;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.passwordOnly.PasswordOnlyFragment.lastFormViewEditTextBinding")
    public static void injectLastFormViewEditTextBinding(PasswordOnlyFragment passwordOnlyFragment, LastFormViewEditTextBinding lastFormViewEditTextBinding) {
        passwordOnlyFragment.lastFormViewEditTextBinding = lastFormViewEditTextBinding;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.passwordOnly.PasswordOnlyFragment.passwordOnlyInteractionListener")
    public static void injectPasswordOnlyInteractionListener(PasswordOnlyFragment passwordOnlyFragment, PasswordOnlyFragment.PasswordOnlyInteractionListener passwordOnlyInteractionListener) {
        passwordOnlyFragment.passwordOnlyInteractionListener = passwordOnlyInteractionListener;
    }
}
