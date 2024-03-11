package com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1;

import com.netflix.mediaclient.acquisition.components.KeyboardController;
import com.netflix.mediaclient.acquisition.components.form.FormDataObserverFactory;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import com.netflix.mediaclient.acquisition.lib.screens.SignupFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.addProfiles.AddProfilesFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.addProfiles.AddProfilesLogger;
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
public final class AddProfilesEEFragment_Ab31697_MembersInjector implements MembersInjector<AddProfilesEEFragment_Ab31697> {
    private final Provider<AddProfilesLogger> addProfilesLoggerProvider;
    private final Provider<AddProfilesEEDialogPresenter_Ab31697> earlyEducationDialogPresenterProvider;
    private final Provider<FormDataObserverFactory> formDataObserverFactoryProvider;
    private final Provider<KeyboardController> keyboardControllerProvider;
    private final Provider<SignupMoneyballEntryPoint> moneyballEntryPointProvider;
    private final Provider<InterfaceC1573aGh> uiLatencyTrackerProvider;

    public AddProfilesEEFragment_Ab31697_MembersInjector(Provider<InterfaceC1573aGh> provider, Provider<KeyboardController> provider2, Provider<SignupMoneyballEntryPoint> provider3, Provider<FormDataObserverFactory> provider4, Provider<AddProfilesLogger> provider5, Provider<AddProfilesEEDialogPresenter_Ab31697> provider6) {
        this.uiLatencyTrackerProvider = provider;
        this.keyboardControllerProvider = provider2;
        this.moneyballEntryPointProvider = provider3;
        this.formDataObserverFactoryProvider = provider4;
        this.addProfilesLoggerProvider = provider5;
        this.earlyEducationDialogPresenterProvider = provider6;
    }

    public static MembersInjector<AddProfilesEEFragment_Ab31697> create(Provider<InterfaceC1573aGh> provider, Provider<KeyboardController> provider2, Provider<SignupMoneyballEntryPoint> provider3, Provider<FormDataObserverFactory> provider4, Provider<AddProfilesLogger> provider5, Provider<AddProfilesEEDialogPresenter_Ab31697> provider6) {
        return new AddProfilesEEFragment_Ab31697_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(AddProfilesEEFragment_Ab31697 addProfilesEEFragment_Ab31697) {
        SignupFragment_MembersInjector.injectUiLatencyTracker(addProfilesEEFragment_Ab31697, DoubleCheck.lazy(this.uiLatencyTrackerProvider));
        AbstractNetworkFragment2_MembersInjector.injectKeyboardController(addProfilesEEFragment_Ab31697, this.keyboardControllerProvider.get());
        AddProfilesFragment_MembersInjector.injectMoneyballEntryPoint(addProfilesEEFragment_Ab31697, this.moneyballEntryPointProvider.get());
        AddProfilesFragment_MembersInjector.injectFormDataObserverFactory(addProfilesEEFragment_Ab31697, this.formDataObserverFactoryProvider.get());
        AddProfilesFragment_MembersInjector.injectAddProfilesLogger(addProfilesEEFragment_Ab31697, this.addProfilesLoggerProvider.get());
        injectEarlyEducationDialogPresenter(addProfilesEEFragment_Ab31697, this.earlyEducationDialogPresenterProvider.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1.AddProfilesEEFragment_Ab31697.earlyEducationDialogPresenter")
    public static void injectEarlyEducationDialogPresenter(AddProfilesEEFragment_Ab31697 addProfilesEEFragment_Ab31697, AddProfilesEEDialogPresenter_Ab31697 addProfilesEEDialogPresenter_Ab31697) {
        addProfilesEEFragment_Ab31697.earlyEducationDialogPresenter = addProfilesEEDialogPresenter_Ab31697;
    }
}
