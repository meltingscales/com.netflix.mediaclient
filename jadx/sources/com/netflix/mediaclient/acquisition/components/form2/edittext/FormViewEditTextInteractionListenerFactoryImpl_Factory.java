package com.netflix.mediaclient.acquisition.components.form2.edittext;

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
public final class FormViewEditTextInteractionListenerFactoryImpl_Factory implements Factory<FormViewEditTextInteractionListenerFactoryImpl> {
    private final Provider<SignupLogger> signupLoggerProvider;

    public FormViewEditTextInteractionListenerFactoryImpl_Factory(Provider<SignupLogger> provider) {
        this.signupLoggerProvider = provider;
    }

    @Override // javax.inject.Provider
    public FormViewEditTextInteractionListenerFactoryImpl get() {
        return newInstance(this.signupLoggerProvider.get());
    }

    public static FormViewEditTextInteractionListenerFactoryImpl_Factory create(Provider<SignupLogger> provider) {
        return new FormViewEditTextInteractionListenerFactoryImpl_Factory(provider);
    }

    public static FormViewEditTextInteractionListenerFactoryImpl newInstance(SignupLogger signupLogger) {
        return new FormViewEditTextInteractionListenerFactoryImpl(signupLogger);
    }
}
