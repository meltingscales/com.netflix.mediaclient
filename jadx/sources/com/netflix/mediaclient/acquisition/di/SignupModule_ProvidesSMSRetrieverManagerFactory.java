package com.netflix.mediaclient.acquisition.di;

import android.app.Activity;
import com.netflix.mediaclient.acquisition.services.sms.SMSRetrieverManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class SignupModule_ProvidesSMSRetrieverManagerFactory implements Factory<SMSRetrieverManager> {
    private final Provider<Activity> activityProvider;
    private final SignupModule module;

    public SignupModule_ProvidesSMSRetrieverManagerFactory(SignupModule signupModule, Provider<Activity> provider) {
        this.module = signupModule;
        this.activityProvider = provider;
    }

    @Override // javax.inject.Provider
    public SMSRetrieverManager get() {
        return providesSMSRetrieverManager(this.module, this.activityProvider.get());
    }

    public static SignupModule_ProvidesSMSRetrieverManagerFactory create(SignupModule signupModule, Provider<Activity> provider) {
        return new SignupModule_ProvidesSMSRetrieverManagerFactory(signupModule, provider);
    }

    public static SMSRetrieverManager providesSMSRetrieverManager(SignupModule signupModule, Activity activity) {
        return (SMSRetrieverManager) Preconditions.checkNotNullFromProvides(signupModule.providesSMSRetrieverManager(activity));
    }
}
