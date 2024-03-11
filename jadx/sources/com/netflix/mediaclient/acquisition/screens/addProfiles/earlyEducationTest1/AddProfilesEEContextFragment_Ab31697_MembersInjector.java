package com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1;

import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import com.netflix.mediaclient.acquisition.lib.screens.SignupFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1.AddProfilesEEContextFragment_Ab31697;
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
public final class AddProfilesEEContextFragment_Ab31697_MembersInjector implements MembersInjector<AddProfilesEEContextFragment_Ab31697> {
    private final Provider<AddProfilesEEContextFragment_Ab31697.AddProfilesEEContextClickListener> addProfilesEEContextClickListenerProvider;
    private final Provider<SignupMoneyballEntryPoint> moneyballEntryPointProvider;
    private final Provider<InterfaceC1573aGh> uiLatencyTrackerProvider;

    public AddProfilesEEContextFragment_Ab31697_MembersInjector(Provider<InterfaceC1573aGh> provider, Provider<AddProfilesEEContextFragment_Ab31697.AddProfilesEEContextClickListener> provider2, Provider<SignupMoneyballEntryPoint> provider3) {
        this.uiLatencyTrackerProvider = provider;
        this.addProfilesEEContextClickListenerProvider = provider2;
        this.moneyballEntryPointProvider = provider3;
    }

    public static MembersInjector<AddProfilesEEContextFragment_Ab31697> create(Provider<InterfaceC1573aGh> provider, Provider<AddProfilesEEContextFragment_Ab31697.AddProfilesEEContextClickListener> provider2, Provider<SignupMoneyballEntryPoint> provider3) {
        return new AddProfilesEEContextFragment_Ab31697_MembersInjector(provider, provider2, provider3);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(AddProfilesEEContextFragment_Ab31697 addProfilesEEContextFragment_Ab31697) {
        SignupFragment_MembersInjector.injectUiLatencyTracker(addProfilesEEContextFragment_Ab31697, DoubleCheck.lazy(this.uiLatencyTrackerProvider));
        injectAddProfilesEEContextClickListener(addProfilesEEContextFragment_Ab31697, this.addProfilesEEContextClickListenerProvider.get());
        injectMoneyballEntryPoint(addProfilesEEContextFragment_Ab31697, this.moneyballEntryPointProvider.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1.AddProfilesEEContextFragment_Ab31697.addProfilesEEContextClickListener")
    public static void injectAddProfilesEEContextClickListener(AddProfilesEEContextFragment_Ab31697 addProfilesEEContextFragment_Ab31697, AddProfilesEEContextFragment_Ab31697.AddProfilesEEContextClickListener addProfilesEEContextClickListener) {
        addProfilesEEContextFragment_Ab31697.addProfilesEEContextClickListener = addProfilesEEContextClickListener;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1.AddProfilesEEContextFragment_Ab31697.moneyballEntryPoint")
    public static void injectMoneyballEntryPoint(AddProfilesEEContextFragment_Ab31697 addProfilesEEContextFragment_Ab31697, SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        addProfilesEEContextFragment_Ab31697.moneyballEntryPoint = signupMoneyballEntryPoint;
    }
}
