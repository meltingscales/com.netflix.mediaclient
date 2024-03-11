package com.netflix.mediaclient.acquisition.screens.addProfiles;

import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextInteractionListenerFactory;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupLogger;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class AddProfilesLogger_Factory implements Factory<AddProfilesLogger> {
    private final Provider<FormViewEditTextInteractionListenerFactory> formViewEditTextInteractionListenerFactoryProvider;
    private final Provider<SignupLogger> signupLoggerProvider;

    public AddProfilesLogger_Factory(Provider<FormViewEditTextInteractionListenerFactory> provider, Provider<SignupLogger> provider2) {
        this.formViewEditTextInteractionListenerFactoryProvider = provider;
        this.signupLoggerProvider = provider2;
    }

    @Override // javax.inject.Provider
    public AddProfilesLogger get() {
        return newInstance(this.formViewEditTextInteractionListenerFactoryProvider.get(), this.signupLoggerProvider.get());
    }

    public static AddProfilesLogger_Factory create(Provider<FormViewEditTextInteractionListenerFactory> provider, Provider<SignupLogger> provider2) {
        return new AddProfilesLogger_Factory(provider, provider2);
    }

    public static AddProfilesLogger newInstance(FormViewEditTextInteractionListenerFactory formViewEditTextInteractionListenerFactory, SignupLogger signupLogger) {
        return new AddProfilesLogger(formViewEditTextInteractionListenerFactory, signupLogger);
    }
}
