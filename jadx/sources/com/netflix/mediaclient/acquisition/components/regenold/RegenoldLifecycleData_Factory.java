package com.netflix.mediaclient.acquisition.components.regenold;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class RegenoldLifecycleData_Factory implements Factory<RegenoldLifecycleData> {
    @Override // javax.inject.Provider
    public RegenoldLifecycleData get() {
        return newInstance();
    }

    public static RegenoldLifecycleData_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static RegenoldLifecycleData newInstance() {
        return new RegenoldLifecycleData();
    }

    /* loaded from: classes6.dex */
    static final class InstanceHolder {
        private static final RegenoldLifecycleData_Factory INSTANCE = new RegenoldLifecycleData_Factory();

        private InstanceHolder() {
        }
    }
}
