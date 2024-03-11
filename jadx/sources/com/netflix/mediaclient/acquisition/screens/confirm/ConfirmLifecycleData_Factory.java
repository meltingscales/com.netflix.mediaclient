package com.netflix.mediaclient.acquisition.screens.confirm;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class ConfirmLifecycleData_Factory implements Factory<ConfirmLifecycleData> {
    @Override // javax.inject.Provider
    public ConfirmLifecycleData get() {
        return newInstance();
    }

    public static ConfirmLifecycleData_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ConfirmLifecycleData newInstance() {
        return new ConfirmLifecycleData();
    }

    /* loaded from: classes6.dex */
    static final class InstanceHolder {
        private static final ConfirmLifecycleData_Factory INSTANCE = new ConfirmLifecycleData_Factory();

        private InstanceHolder() {
        }
    }
}
