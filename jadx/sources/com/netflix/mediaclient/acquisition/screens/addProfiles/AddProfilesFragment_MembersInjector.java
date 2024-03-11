package com.netflix.mediaclient.acquisition.screens.addProfiles;

import com.netflix.mediaclient.acquisition.components.KeyboardController;
import com.netflix.mediaclient.acquisition.components.form.FormDataObserverFactory;
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
public final class AddProfilesFragment_MembersInjector implements MembersInjector<AddProfilesFragment> {
    private final Provider<AddProfilesLogger> addProfilesLoggerProvider;
    private final Provider<FormDataObserverFactory> formDataObserverFactoryProvider;
    private final Provider<KeyboardController> keyboardControllerProvider;
    private final Provider<SignupMoneyballEntryPoint> moneyballEntryPointProvider;
    private final Provider<InterfaceC1573aGh> uiLatencyTrackerProvider;

    public AddProfilesFragment_MembersInjector(Provider<InterfaceC1573aGh> provider, Provider<KeyboardController> provider2, Provider<SignupMoneyballEntryPoint> provider3, Provider<FormDataObserverFactory> provider4, Provider<AddProfilesLogger> provider5) {
        this.uiLatencyTrackerProvider = provider;
        this.keyboardControllerProvider = provider2;
        this.moneyballEntryPointProvider = provider3;
        this.formDataObserverFactoryProvider = provider4;
        this.addProfilesLoggerProvider = provider5;
    }

    public static MembersInjector<AddProfilesFragment> create(Provider<InterfaceC1573aGh> provider, Provider<KeyboardController> provider2, Provider<SignupMoneyballEntryPoint> provider3, Provider<FormDataObserverFactory> provider4, Provider<AddProfilesLogger> provider5) {
        return new AddProfilesFragment_MembersInjector(provider, provider2, provider3, provider4, provider5);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(AddProfilesFragment addProfilesFragment) {
        SignupFragment_MembersInjector.injectUiLatencyTracker(addProfilesFragment, DoubleCheck.lazy(this.uiLatencyTrackerProvider));
        AbstractNetworkFragment2_MembersInjector.injectKeyboardController(addProfilesFragment, this.keyboardControllerProvider.get());
        injectMoneyballEntryPoint(addProfilesFragment, this.moneyballEntryPointProvider.get());
        injectFormDataObserverFactory(addProfilesFragment, this.formDataObserverFactoryProvider.get());
        injectAddProfilesLogger(addProfilesFragment, this.addProfilesLoggerProvider.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.addProfiles.AddProfilesFragment.moneyballEntryPoint")
    public static void injectMoneyballEntryPoint(AddProfilesFragment addProfilesFragment, SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        addProfilesFragment.moneyballEntryPoint = signupMoneyballEntryPoint;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.addProfiles.AddProfilesFragment.formDataObserverFactory")
    public static void injectFormDataObserverFactory(AddProfilesFragment addProfilesFragment, FormDataObserverFactory formDataObserverFactory) {
        addProfilesFragment.formDataObserverFactory = formDataObserverFactory;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.addProfiles.AddProfilesFragment.addProfilesLogger")
    public static void injectAddProfilesLogger(AddProfilesFragment addProfilesFragment, AddProfilesLogger addProfilesLogger) {
        addProfilesFragment.addProfilesLogger = addProfilesLogger;
    }
}
