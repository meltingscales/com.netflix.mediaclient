package com.netflix.mediaclient.acquisition.services.networking;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class ShowImageRequestFactory_Factory implements Factory<ShowImageRequestFactory> {
    @Override // javax.inject.Provider
    public ShowImageRequestFactory get() {
        return newInstance();
    }

    public static ShowImageRequestFactory_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ShowImageRequestFactory newInstance() {
        return new ShowImageRequestFactory();
    }

    /* loaded from: classes6.dex */
    static final class InstanceHolder {
        private static final ShowImageRequestFactory_Factory INSTANCE = new ShowImageRequestFactory_Factory();

        private InstanceHolder() {
        }
    }
}
