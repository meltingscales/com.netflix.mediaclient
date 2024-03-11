package com.netflix.mediaclient.acquisition.screens.addProfiles;

import androidx.lifecycle.ViewModelProvider;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.mediaclient.acquisition.components.form2.profileEntryEditText.ProfileEntryEditTextCheckboxViewModelInitializer;
import com.netflix.mediaclient.acquisition.components.steps.StepsViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class AddProfilesViewModelInitializer_Factory implements Factory<AddProfilesViewModelInitializer> {
    private final Provider<ErrorMessageViewModelInitializer> errorMessageViewModelInitializerProvider;
    private final Provider<FlowMode> flowModeProvider;
    private final Provider<ProfileEntryEditTextCheckboxViewModelInitializer> profileEntryEditTextCheckboxViewModelInitializerProvider;
    private final Provider<SignupErrorReporter> signupErrorReporterProvider;
    private final Provider<SignupNetworkManager> signupNetworkManagerProvider;
    private final Provider<StepsViewModelInitializer> stepsViewModelInitializerProvider;
    private final Provider<StringProvider> stringProvider;
    private final Provider<ViewModelProvider.Factory> viewModelProviderFactoryProvider;

    public AddProfilesViewModelInitializer_Factory(Provider<FlowMode> provider, Provider<SignupErrorReporter> provider2, Provider<SignupNetworkManager> provider3, Provider<StringProvider> provider4, Provider<ViewModelProvider.Factory> provider5, Provider<StepsViewModelInitializer> provider6, Provider<ErrorMessageViewModelInitializer> provider7, Provider<ProfileEntryEditTextCheckboxViewModelInitializer> provider8) {
        this.flowModeProvider = provider;
        this.signupErrorReporterProvider = provider2;
        this.signupNetworkManagerProvider = provider3;
        this.stringProvider = provider4;
        this.viewModelProviderFactoryProvider = provider5;
        this.stepsViewModelInitializerProvider = provider6;
        this.errorMessageViewModelInitializerProvider = provider7;
        this.profileEntryEditTextCheckboxViewModelInitializerProvider = provider8;
    }

    @Override // javax.inject.Provider
    public AddProfilesViewModelInitializer get() {
        return newInstance(this.flowModeProvider.get(), this.signupErrorReporterProvider.get(), this.signupNetworkManagerProvider.get(), this.stringProvider.get(), this.viewModelProviderFactoryProvider.get(), this.stepsViewModelInitializerProvider.get(), this.errorMessageViewModelInitializerProvider.get(), this.profileEntryEditTextCheckboxViewModelInitializerProvider.get());
    }

    public static AddProfilesViewModelInitializer_Factory create(Provider<FlowMode> provider, Provider<SignupErrorReporter> provider2, Provider<SignupNetworkManager> provider3, Provider<StringProvider> provider4, Provider<ViewModelProvider.Factory> provider5, Provider<StepsViewModelInitializer> provider6, Provider<ErrorMessageViewModelInitializer> provider7, Provider<ProfileEntryEditTextCheckboxViewModelInitializer> provider8) {
        return new AddProfilesViewModelInitializer_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static AddProfilesViewModelInitializer newInstance(FlowMode flowMode, SignupErrorReporter signupErrorReporter, SignupNetworkManager signupNetworkManager, StringProvider stringProvider, ViewModelProvider.Factory factory, StepsViewModelInitializer stepsViewModelInitializer, ErrorMessageViewModelInitializer errorMessageViewModelInitializer, ProfileEntryEditTextCheckboxViewModelInitializer profileEntryEditTextCheckboxViewModelInitializer) {
        return new AddProfilesViewModelInitializer(flowMode, signupErrorReporter, signupNetworkManager, stringProvider, factory, stepsViewModelInitializer, errorMessageViewModelInitializer, profileEntryEditTextCheckboxViewModelInitializer);
    }
}
