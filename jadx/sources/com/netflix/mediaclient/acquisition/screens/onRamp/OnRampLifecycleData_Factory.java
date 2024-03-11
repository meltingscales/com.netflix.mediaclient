package com.netflix.mediaclient.acquisition.screens.onRamp;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class OnRampLifecycleData_Factory implements Factory<OnRampLifecycleData> {
    @Override // javax.inject.Provider
    public OnRampLifecycleData get() {
        return newInstance();
    }

    public static OnRampLifecycleData_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static OnRampLifecycleData newInstance() {
        return new OnRampLifecycleData();
    }

    /* loaded from: classes6.dex */
    static final class InstanceHolder {
        private static final OnRampLifecycleData_Factory INSTANCE = new OnRampLifecycleData_Factory();

        private InstanceHolder() {
        }
    }
}
