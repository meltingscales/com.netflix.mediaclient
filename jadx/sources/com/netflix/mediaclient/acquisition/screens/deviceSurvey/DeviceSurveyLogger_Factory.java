package com.netflix.mediaclient.acquisition.screens.deviceSurvey;

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
public final class DeviceSurveyLogger_Factory implements Factory<DeviceSurveyLogger> {
    private final Provider<SignupLogger> signupLoggerProvider;

    public DeviceSurveyLogger_Factory(Provider<SignupLogger> provider) {
        this.signupLoggerProvider = provider;
    }

    @Override // javax.inject.Provider
    public DeviceSurveyLogger get() {
        return newInstance(this.signupLoggerProvider.get());
    }

    public static DeviceSurveyLogger_Factory create(Provider<SignupLogger> provider) {
        return new DeviceSurveyLogger_Factory(provider);
    }

    public static DeviceSurveyLogger newInstance(SignupLogger signupLogger) {
        return new DeviceSurveyLogger(signupLogger);
    }
}
