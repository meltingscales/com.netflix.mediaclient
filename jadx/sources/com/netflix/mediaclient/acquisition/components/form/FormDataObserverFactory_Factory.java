package com.netflix.mediaclient.acquisition.components.form;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class FormDataObserverFactory_Factory implements Factory<FormDataObserverFactory> {
    @Override // javax.inject.Provider
    public FormDataObserverFactory get() {
        return newInstance();
    }

    public static FormDataObserverFactory_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static FormDataObserverFactory newInstance() {
        return new FormDataObserverFactory();
    }

    /* loaded from: classes5.dex */
    static final class InstanceHolder {
        private static final FormDataObserverFactory_Factory INSTANCE = new FormDataObserverFactory_Factory();

        private InstanceHolder() {
        }
    }
}
