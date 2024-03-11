package com.netflix.mediaclient.acquisition.components.form2.profileEntryEditText;

import com.netflix.android.moneyball.FlowMode;
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
public final class ProfileEntryEditTextCheckboxViewModelInitializer_Factory implements Factory<ProfileEntryEditTextCheckboxViewModelInitializer> {
    private final Provider<FlowMode> flowModeProvider;
    private final Provider<SignupErrorReporter> signupErrorReporterProvider;
    private final Provider<StringProvider> stringProvider;

    public ProfileEntryEditTextCheckboxViewModelInitializer_Factory(Provider<FlowMode> provider, Provider<SignupErrorReporter> provider2, Provider<StringProvider> provider3) {
        this.flowModeProvider = provider;
        this.signupErrorReporterProvider = provider2;
        this.stringProvider = provider3;
    }

    @Override // javax.inject.Provider
    public ProfileEntryEditTextCheckboxViewModelInitializer get() {
        return newInstance(this.flowModeProvider.get(), this.signupErrorReporterProvider.get(), this.stringProvider.get());
    }

    public static ProfileEntryEditTextCheckboxViewModelInitializer_Factory create(Provider<FlowMode> provider, Provider<SignupErrorReporter> provider2, Provider<StringProvider> provider3) {
        return new ProfileEntryEditTextCheckboxViewModelInitializer_Factory(provider, provider2, provider3);
    }

    public static ProfileEntryEditTextCheckboxViewModelInitializer newInstance(FlowMode flowMode, SignupErrorReporter signupErrorReporter, StringProvider stringProvider) {
        return new ProfileEntryEditTextCheckboxViewModelInitializer(flowMode, signupErrorReporter, stringProvider);
    }
}
