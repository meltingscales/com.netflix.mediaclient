package com.netflix.mediaclient.acquisition.screens.deviceSurvey;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class DeviceSurveyDeviceContainerViewFactory_Factory implements Factory<DeviceSurveyDeviceContainerViewFactory> {
    @Override // javax.inject.Provider
    public DeviceSurveyDeviceContainerViewFactory get() {
        return newInstance();
    }

    public static DeviceSurveyDeviceContainerViewFactory_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DeviceSurveyDeviceContainerViewFactory newInstance() {
        return new DeviceSurveyDeviceContainerViewFactory();
    }

    /* loaded from: classes6.dex */
    static final class InstanceHolder {
        private static final DeviceSurveyDeviceContainerViewFactory_Factory INSTANCE = new DeviceSurveyDeviceContainerViewFactory_Factory();

        private InstanceHolder() {
        }
    }
}
