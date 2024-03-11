package com.netflix.mediaclient.acquisition.screens.welcomefuji;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class WelcomeFujiLifecycleData_Factory implements Factory<WelcomeFujiLifecycleData> {
    @Override // javax.inject.Provider
    public WelcomeFujiLifecycleData get() {
        return newInstance();
    }

    public static WelcomeFujiLifecycleData_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static WelcomeFujiLifecycleData newInstance() {
        return new WelcomeFujiLifecycleData();
    }

    /* loaded from: classes6.dex */
    static final class InstanceHolder {
        private static final WelcomeFujiLifecycleData_Factory INSTANCE = new WelcomeFujiLifecycleData_Factory();

        private InstanceHolder() {
        }
    }
}
