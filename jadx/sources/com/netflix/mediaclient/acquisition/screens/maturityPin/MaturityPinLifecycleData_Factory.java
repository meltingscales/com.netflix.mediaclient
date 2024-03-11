package com.netflix.mediaclient.acquisition.screens.maturityPin;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class MaturityPinLifecycleData_Factory implements Factory<MaturityPinLifecycleData> {
    @Override // javax.inject.Provider
    public MaturityPinLifecycleData get() {
        return newInstance();
    }

    public static MaturityPinLifecycleData_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MaturityPinLifecycleData newInstance() {
        return new MaturityPinLifecycleData();
    }

    /* loaded from: classes6.dex */
    static final class InstanceHolder {
        private static final MaturityPinLifecycleData_Factory INSTANCE = new MaturityPinLifecycleData_Factory();

        private InstanceHolder() {
        }
    }
}
