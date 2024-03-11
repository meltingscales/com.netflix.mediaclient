package com.netflix.mediaclient.acquisition.screens.passwordOnly;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class PasswordOnlyLifecycleData_Factory implements Factory<PasswordOnlyLifecycleData> {
    @Override // javax.inject.Provider
    public PasswordOnlyLifecycleData get() {
        return newInstance();
    }

    public static PasswordOnlyLifecycleData_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static PasswordOnlyLifecycleData newInstance() {
        return new PasswordOnlyLifecycleData();
    }

    /* loaded from: classes6.dex */
    static final class InstanceHolder {
        private static final PasswordOnlyLifecycleData_Factory INSTANCE = new PasswordOnlyLifecycleData_Factory();

        private InstanceHolder() {
        }
    }
}
