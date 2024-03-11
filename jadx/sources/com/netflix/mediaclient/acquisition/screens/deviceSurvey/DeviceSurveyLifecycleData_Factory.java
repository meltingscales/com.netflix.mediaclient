package com.netflix.mediaclient.acquisition.screens.deviceSurvey;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class DeviceSurveyLifecycleData_Factory implements Factory<DeviceSurveyLifecycleData> {
    @Override // javax.inject.Provider
    public DeviceSurveyLifecycleData get() {
        return newInstance();
    }

    public static DeviceSurveyLifecycleData_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DeviceSurveyLifecycleData newInstance() {
        return new DeviceSurveyLifecycleData();
    }

    /* loaded from: classes6.dex */
    static final class InstanceHolder {
        private static final DeviceSurveyLifecycleData_Factory INSTANCE = new DeviceSurveyLifecycleData_Factory();

        private InstanceHolder() {
        }
    }
}
