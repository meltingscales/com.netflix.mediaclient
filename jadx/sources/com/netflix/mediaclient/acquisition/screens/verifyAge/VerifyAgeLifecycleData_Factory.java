package com.netflix.mediaclient.acquisition.screens.verifyAge;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class VerifyAgeLifecycleData_Factory implements Factory<VerifyAgeLifecycleData> {
    @Override // javax.inject.Provider
    public VerifyAgeLifecycleData get() {
        return newInstance();
    }

    public static VerifyAgeLifecycleData_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static VerifyAgeLifecycleData newInstance() {
        return new VerifyAgeLifecycleData();
    }

    /* loaded from: classes6.dex */
    static final class InstanceHolder {
        private static final VerifyAgeLifecycleData_Factory INSTANCE = new VerifyAgeLifecycleData_Factory();

        private InstanceHolder() {
        }
    }
}
