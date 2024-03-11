package com.netflix.mediaclient.acquisition.lib.services.logging;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class RequestResponseLogger_Factory implements Factory<RequestResponseLogger> {
    private final Provider<ClientNetworkDetails> clientNetworkDetailsProvider;
    private final Provider<SignupLogger> signupLoggerProvider;

    public RequestResponseLogger_Factory(Provider<ClientNetworkDetails> provider, Provider<SignupLogger> provider2) {
        this.clientNetworkDetailsProvider = provider;
        this.signupLoggerProvider = provider2;
    }

    @Override // javax.inject.Provider
    public RequestResponseLogger get() {
        return newInstance(this.clientNetworkDetailsProvider.get(), this.signupLoggerProvider.get());
    }

    public static RequestResponseLogger_Factory create(Provider<ClientNetworkDetails> provider, Provider<SignupLogger> provider2) {
        return new RequestResponseLogger_Factory(provider, provider2);
    }

    public static RequestResponseLogger newInstance(ClientNetworkDetails clientNetworkDetails, SignupLogger signupLogger) {
        return new RequestResponseLogger(clientNetworkDetails, signupLogger);
    }
}
