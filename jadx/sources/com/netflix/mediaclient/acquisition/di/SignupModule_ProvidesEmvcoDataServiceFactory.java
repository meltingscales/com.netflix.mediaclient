package com.netflix.mediaclient.acquisition.di;

import android.app.Activity;
import com.netflix.mediaclient.acquisition.screens.creditDebit.EmvcoDataService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes3.dex */
public final class SignupModule_ProvidesEmvcoDataServiceFactory implements Factory<EmvcoDataService> {
    private final Provider<Activity> activityProvider;
    private final SignupModule module;
    private final Provider<String> webViewBaseUrlProvider;

    public SignupModule_ProvidesEmvcoDataServiceFactory(SignupModule signupModule, Provider<Activity> provider, Provider<String> provider2) {
        this.module = signupModule;
        this.activityProvider = provider;
        this.webViewBaseUrlProvider = provider2;
    }

    @Override // javax.inject.Provider
    public EmvcoDataService get() {
        return providesEmvcoDataService(this.module, this.activityProvider.get(), this.webViewBaseUrlProvider.get());
    }

    public static SignupModule_ProvidesEmvcoDataServiceFactory create(SignupModule signupModule, Provider<Activity> provider, Provider<String> provider2) {
        return new SignupModule_ProvidesEmvcoDataServiceFactory(signupModule, provider, provider2);
    }

    public static EmvcoDataService providesEmvcoDataService(SignupModule signupModule, Activity activity, String str) {
        return (EmvcoDataService) Preconditions.checkNotNullFromProvides(signupModule.providesEmvcoDataService(activity, str));
    }
}
