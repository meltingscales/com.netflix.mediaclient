package com.netflix.mediaclient.acquisition.services.sms;

import android.app.Activity;
import com.netflix.mediaclient.acquisition.api.sms.SMSRetriever;
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
public final class SMSRetrieverManager_SMSRetrieverModule_ProvidesSMSRetrieverFactory implements Factory<SMSRetriever> {
    private final Provider<Activity> activityProvider;
    private final SMSRetrieverManager.SMSRetrieverModule module;

    public SMSRetrieverManager_SMSRetrieverModule_ProvidesSMSRetrieverFactory(SMSRetrieverManager.SMSRetrieverModule sMSRetrieverModule, Provider<Activity> provider) {
        this.module = sMSRetrieverModule;
        this.activityProvider = provider;
    }

    @Override // javax.inject.Provider
    public SMSRetriever get() {
        return providesSMSRetriever(this.module, this.activityProvider.get());
    }

    public static SMSRetrieverManager_SMSRetrieverModule_ProvidesSMSRetrieverFactory create(SMSRetrieverManager.SMSRetrieverModule sMSRetrieverModule, Provider<Activity> provider) {
        return new SMSRetrieverManager_SMSRetrieverModule_ProvidesSMSRetrieverFactory(sMSRetrieverModule, provider);
    }

    public static SMSRetriever providesSMSRetriever(SMSRetrieverManager.SMSRetrieverModule sMSRetrieverModule, Activity activity) {
        return (SMSRetriever) Preconditions.checkNotNullFromProvides(sMSRetrieverModule.providesSMSRetriever(activity));
    }
}
