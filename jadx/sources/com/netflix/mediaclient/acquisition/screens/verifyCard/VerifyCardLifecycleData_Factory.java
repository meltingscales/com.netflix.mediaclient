package com.netflix.mediaclient.acquisition.screens.verifyCard;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class VerifyCardLifecycleData_Factory implements Factory<VerifyCardLifecycleData> {
    @Override // javax.inject.Provider
    public VerifyCardLifecycleData get() {
        return newInstance();
    }

    public static VerifyCardLifecycleData_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static VerifyCardLifecycleData newInstance() {
        return new VerifyCardLifecycleData();
    }

    /* loaded from: classes6.dex */
    static final class InstanceHolder {
        private static final VerifyCardLifecycleData_Factory INSTANCE = new VerifyCardLifecycleData_Factory();

        private InstanceHolder() {
        }
    }
}
