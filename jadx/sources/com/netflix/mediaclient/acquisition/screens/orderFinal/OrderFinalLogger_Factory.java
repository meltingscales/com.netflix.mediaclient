package com.netflix.mediaclient.acquisition.screens.orderFinal;

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
public final class OrderFinalLogger_Factory implements Factory<OrderFinalLogger> {
    private final Provider<FormViewEditTextInteractionListenerFactory> formViewEditTextInteractionListenerFactoryProvider;
    private final Provider<SignupLogger> signupLoggerProvider;

    public OrderFinalLogger_Factory(Provider<FormViewEditTextInteractionListenerFactory> provider, Provider<SignupLogger> provider2) {
        this.formViewEditTextInteractionListenerFactoryProvider = provider;
        this.signupLoggerProvider = provider2;
    }

    @Override // javax.inject.Provider
    public OrderFinalLogger get() {
        return newInstance(this.formViewEditTextInteractionListenerFactoryProvider.get(), this.signupLoggerProvider.get());
    }

    public static OrderFinalLogger_Factory create(Provider<FormViewEditTextInteractionListenerFactory> provider, Provider<SignupLogger> provider2) {
        return new OrderFinalLogger_Factory(provider, provider2);
    }

    public static OrderFinalLogger newInstance(FormViewEditTextInteractionListenerFactory formViewEditTextInteractionListenerFactory, SignupLogger signupLogger) {
        return new OrderFinalLogger(formViewEditTextInteractionListenerFactory, signupLogger);
    }
}
