package com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1;

import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class AddProfilesEEContextViewModelInitializer_Ab31697_Factory implements Factory<AddProfilesEEContextViewModelInitializer_Ab31697> {
    private final Provider<SignupErrorReporter> signupErrorReporterProvider;
    private final Provider<StringProvider> stringProvider;

    public AddProfilesEEContextViewModelInitializer_Ab31697_Factory(Provider<StringProvider> provider, Provider<SignupErrorReporter> provider2) {
        this.stringProvider = provider;
        this.signupErrorReporterProvider = provider2;
    }

    @Override // javax.inject.Provider
    public AddProfilesEEContextViewModelInitializer_Ab31697 get() {
        return newInstance(this.stringProvider.get(), this.signupErrorReporterProvider.get());
    }

    public static AddProfilesEEContextViewModelInitializer_Ab31697_Factory create(Provider<StringProvider> provider, Provider<SignupErrorReporter> provider2) {
        return new AddProfilesEEContextViewModelInitializer_Ab31697_Factory(provider, provider2);
    }

    public static AddProfilesEEContextViewModelInitializer_Ab31697 newInstance(StringProvider stringProvider, SignupErrorReporter signupErrorReporter) {
        return new AddProfilesEEContextViewModelInitializer_Ab31697(stringProvider, signupErrorReporter);
    }
}
