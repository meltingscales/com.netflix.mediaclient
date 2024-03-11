package com.netflix.mediaclient.acquisition.screens.addProfiles;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class AddProfilesLifecycleData_Factory implements Factory<AddProfilesLifecycleData> {
    @Override // javax.inject.Provider
    public AddProfilesLifecycleData get() {
        return newInstance();
    }

    public static AddProfilesLifecycleData_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AddProfilesLifecycleData newInstance() {
        return new AddProfilesLifecycleData();
    }

    /* loaded from: classes6.dex */
    static final class InstanceHolder {
        private static final AddProfilesLifecycleData_Factory INSTANCE = new AddProfilesLifecycleData_Factory();

        private InstanceHolder() {
        }
    }
}
