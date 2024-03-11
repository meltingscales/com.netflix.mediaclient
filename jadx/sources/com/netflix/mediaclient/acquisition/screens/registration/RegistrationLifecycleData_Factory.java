package com.netflix.mediaclient.acquisition.screens.registration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class RegistrationLifecycleData_Factory implements Factory<RegistrationLifecycleData> {
    @Override // javax.inject.Provider
    public RegistrationLifecycleData get() {
        return newInstance();
    }

    public static RegistrationLifecycleData_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static RegistrationLifecycleData newInstance() {
        return new RegistrationLifecycleData();
    }

    /* loaded from: classes6.dex */
    static final class InstanceHolder {
        private static final RegistrationLifecycleData_Factory INSTANCE = new RegistrationLifecycleData_Factory();

        private InstanceHolder() {
        }
    }
}
