package com.netflix.mediaclient.acquisition.di;

import androidx.lifecycle.ViewModel;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Map;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class DependencyInjectionLifecycleDataFactory_Factory implements Factory<DependencyInjectionLifecycleDataFactory> {
    private final Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> lifecycleDatasMapProvider;

    public DependencyInjectionLifecycleDataFactory_Factory(Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> provider) {
        this.lifecycleDatasMapProvider = provider;
    }

    @Override // javax.inject.Provider
    public DependencyInjectionLifecycleDataFactory get() {
        return newInstance(this.lifecycleDatasMapProvider.get());
    }

    public static DependencyInjectionLifecycleDataFactory_Factory create(Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> provider) {
        return new DependencyInjectionLifecycleDataFactory_Factory(provider);
    }

    public static DependencyInjectionLifecycleDataFactory newInstance(Map<Class<? extends ViewModel>, Provider<ViewModel>> map) {
        return new DependencyInjectionLifecycleDataFactory(map);
    }
}
