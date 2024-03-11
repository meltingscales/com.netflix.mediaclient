package com.netflix.mediaclient.acquisition.di;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named", "dagger.hilt.android.qualifiers.ApplicationContext"})
/* loaded from: classes3.dex */
public final class SignupSingletonModule_ProvidesWebViewBaseUrlFactory implements Factory<String> {
    private final Provider<Context> contextProvider;
    private final SignupSingletonModule module;

    public SignupSingletonModule_ProvidesWebViewBaseUrlFactory(SignupSingletonModule signupSingletonModule, Provider<Context> provider) {
        this.module = signupSingletonModule;
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public String get() {
        return providesWebViewBaseUrl(this.module, this.contextProvider.get());
    }

    public static SignupSingletonModule_ProvidesWebViewBaseUrlFactory create(SignupSingletonModule signupSingletonModule, Provider<Context> provider) {
        return new SignupSingletonModule_ProvidesWebViewBaseUrlFactory(signupSingletonModule, provider);
    }

    public static String providesWebViewBaseUrl(SignupSingletonModule signupSingletonModule, Context context) {
        return (String) Preconditions.checkNotNullFromProvides(signupSingletonModule.providesWebViewBaseUrl(context));
    }
}
