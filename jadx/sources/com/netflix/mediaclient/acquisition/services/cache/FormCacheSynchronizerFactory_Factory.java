package com.netflix.mediaclient.acquisition.services.cache;

import com.netflix.mediaclient.acquisition.lib.FormCache;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class FormCacheSynchronizerFactory_Factory implements Factory<FormCacheSynchronizerFactory> {
    private final Provider<FormCache> formCacheProvider;

    public FormCacheSynchronizerFactory_Factory(Provider<FormCache> provider) {
        this.formCacheProvider = provider;
    }

    @Override // javax.inject.Provider
    public FormCacheSynchronizerFactory get() {
        return newInstance(this.formCacheProvider.get());
    }

    public static FormCacheSynchronizerFactory_Factory create(Provider<FormCache> provider) {
        return new FormCacheSynchronizerFactory_Factory(provider);
    }

    public static FormCacheSynchronizerFactory newInstance(FormCache formCache) {
        return new FormCacheSynchronizerFactory(formCache);
    }
}
