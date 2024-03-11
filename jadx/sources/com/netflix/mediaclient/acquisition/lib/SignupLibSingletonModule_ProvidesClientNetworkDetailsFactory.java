package com.netflix.mediaclient.acquisition.lib;

import android.content.Context;
import com.netflix.mediaclient.acquisition.lib.services.logging.ClientNetworkDetails;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.qualifiers.ApplicationContext"})
/* loaded from: classes3.dex */
public final class SignupLibSingletonModule_ProvidesClientNetworkDetailsFactory implements Factory<ClientNetworkDetails> {
    private final Provider<Context> contextProvider;
    private final SignupLibSingletonModule module;

    public SignupLibSingletonModule_ProvidesClientNetworkDetailsFactory(SignupLibSingletonModule signupLibSingletonModule, Provider<Context> provider) {
        this.module = signupLibSingletonModule;
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public ClientNetworkDetails get() {
        return providesClientNetworkDetails(this.module, this.contextProvider.get());
    }

    public static SignupLibSingletonModule_ProvidesClientNetworkDetailsFactory create(SignupLibSingletonModule signupLibSingletonModule, Provider<Context> provider) {
        return new SignupLibSingletonModule_ProvidesClientNetworkDetailsFactory(signupLibSingletonModule, provider);
    }

    public static ClientNetworkDetails providesClientNetworkDetails(SignupLibSingletonModule signupLibSingletonModule, Context context) {
        return (ClientNetworkDetails) Preconditions.checkNotNullFromProvides(signupLibSingletonModule.providesClientNetworkDetails(context));
    }
}
