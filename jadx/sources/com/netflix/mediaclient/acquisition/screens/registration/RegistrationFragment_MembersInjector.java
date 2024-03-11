package com.netflix.mediaclient.acquisition.screens.registration;

import com.netflix.mediaclient.acquisition.components.KeyboardController;
import com.netflix.mediaclient.acquisition.components.form.FormDataObserverFactory;
import com.netflix.mediaclient.acquisition.components.form2.edittext.LastFormViewEditTextBinding;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import com.netflix.mediaclient.acquisition.lib.screens.SignupFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2_MembersInjector;
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
public final class RegistrationFragment_MembersInjector implements MembersInjector<RegistrationFragment> {
    private final Provider<FormDataObserverFactory> formDataObserverFactoryProvider;
    private final Provider<KeyboardController> keyboardControllerProvider;
    private final Provider<LastFormViewEditTextBinding> lastFormViewEditTextBindingProvider;
    private final Provider<SignupMoneyballEntryPoint> moneyballEntryPointProvider;
    private final Provider<InterfaceC1573aGh> uiLatencyTrackerProvider;

    public RegistrationFragment_MembersInjector(Provider<InterfaceC1573aGh> provider, Provider<KeyboardController> provider2, Provider<FormDataObserverFactory> provider3, Provider<SignupMoneyballEntryPoint> provider4, Provider<LastFormViewEditTextBinding> provider5) {
        this.uiLatencyTrackerProvider = provider;
        this.keyboardControllerProvider = provider2;
        this.formDataObserverFactoryProvider = provider3;
        this.moneyballEntryPointProvider = provider4;
        this.lastFormViewEditTextBindingProvider = provider5;
    }

    public static MembersInjector<RegistrationFragment> create(Provider<InterfaceC1573aGh> provider, Provider<KeyboardController> provider2, Provider<FormDataObserverFactory> provider3, Provider<SignupMoneyballEntryPoint> provider4, Provider<LastFormViewEditTextBinding> provider5) {
        return new RegistrationFragment_MembersInjector(provider, provider2, provider3, provider4, provider5);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RegistrationFragment registrationFragment) {
        SignupFragment_MembersInjector.injectUiLatencyTracker(registrationFragment, DoubleCheck.lazy(this.uiLatencyTrackerProvider));
        AbstractNetworkFragment2_MembersInjector.injectKeyboardController(registrationFragment, this.keyboardControllerProvider.get());
        injectFormDataObserverFactory(registrationFragment, this.formDataObserverFactoryProvider.get());
        injectMoneyballEntryPoint(registrationFragment, this.moneyballEntryPointProvider.get());
        injectLastFormViewEditTextBinding(registrationFragment, this.lastFormViewEditTextBindingProvider.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.registration.RegistrationFragment.formDataObserverFactory")
    public static void injectFormDataObserverFactory(RegistrationFragment registrationFragment, FormDataObserverFactory formDataObserverFactory) {
        registrationFragment.formDataObserverFactory = formDataObserverFactory;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.registration.RegistrationFragment.moneyballEntryPoint")
    public static void injectMoneyballEntryPoint(RegistrationFragment registrationFragment, SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        registrationFragment.moneyballEntryPoint = signupMoneyballEntryPoint;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.registration.RegistrationFragment.lastFormViewEditTextBinding")
    public static void injectLastFormViewEditTextBinding(RegistrationFragment registrationFragment, LastFormViewEditTextBinding lastFormViewEditTextBinding) {
        registrationFragment.lastFormViewEditTextBinding = lastFormViewEditTextBinding;
    }
}
