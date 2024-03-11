package com.netflix.mediaclient.acquisition.screens.registration;

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
public final class EmailPreferenceViewModelInitializer_Factory implements Factory<EmailPreferenceViewModelInitializer> {
    private final Provider<FlowMode> flowModeProvider;
    private final Provider<SignupErrorReporter> signupErrorReporterProvider;
    private final Provider<StringProvider> stringProvider;

    public EmailPreferenceViewModelInitializer_Factory(Provider<FlowMode> provider, Provider<SignupErrorReporter> provider2, Provider<StringProvider> provider3) {
        this.flowModeProvider = provider;
        this.signupErrorReporterProvider = provider2;
        this.stringProvider = provider3;
    }

    @Override // javax.inject.Provider
    public EmailPreferenceViewModelInitializer get() {
        return newInstance(this.flowModeProvider.get(), this.signupErrorReporterProvider.get(), this.stringProvider.get());
    }

    public static EmailPreferenceViewModelInitializer_Factory create(Provider<FlowMode> provider, Provider<SignupErrorReporter> provider2, Provider<StringProvider> provider3) {
        return new EmailPreferenceViewModelInitializer_Factory(provider, provider2, provider3);
    }

    public static EmailPreferenceViewModelInitializer newInstance(FlowMode flowMode, SignupErrorReporter signupErrorReporter, StringProvider stringProvider) {
        return new EmailPreferenceViewModelInitializer(flowMode, signupErrorReporter, stringProvider);
    }
}
