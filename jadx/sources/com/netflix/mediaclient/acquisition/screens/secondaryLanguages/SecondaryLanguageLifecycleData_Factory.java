package com.netflix.mediaclient.acquisition.screens.secondaryLanguages;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class SecondaryLanguageLifecycleData_Factory implements Factory<SecondaryLanguageLifecycleData> {
    @Override // javax.inject.Provider
    public SecondaryLanguageLifecycleData get() {
        return newInstance();
    }

    public static SecondaryLanguageLifecycleData_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SecondaryLanguageLifecycleData newInstance() {
        return new SecondaryLanguageLifecycleData();
    }

    /* loaded from: classes6.dex */
    static final class InstanceHolder {
        private static final SecondaryLanguageLifecycleData_Factory INSTANCE = new SecondaryLanguageLifecycleData_Factory();

        private InstanceHolder() {
        }
    }
}
