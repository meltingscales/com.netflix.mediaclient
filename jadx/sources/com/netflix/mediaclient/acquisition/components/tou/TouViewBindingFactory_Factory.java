package com.netflix.mediaclient.acquisition.components.tou;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class TouViewBindingFactory_Factory implements Factory<TouViewBindingFactory> {
    @Override // javax.inject.Provider
    public TouViewBindingFactory get() {
        return newInstance();
    }

    public static TouViewBindingFactory_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static TouViewBindingFactory newInstance() {
        return new TouViewBindingFactory();
    }

    /* loaded from: classes6.dex */
    static final class InstanceHolder {
        private static final TouViewBindingFactory_Factory INSTANCE = new TouViewBindingFactory_Factory();

        private InstanceHolder() {
        }
    }
}
