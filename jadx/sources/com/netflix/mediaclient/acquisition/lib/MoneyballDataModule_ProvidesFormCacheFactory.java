package com.netflix.mediaclient.acquisition.lib;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class MoneyballDataModule_ProvidesFormCacheFactory implements Factory<FormCache> {
    private final MoneyballDataModule module;
    private final Provider<MoneyballDataSource> moneyballDataSourceProvider;

    public MoneyballDataModule_ProvidesFormCacheFactory(MoneyballDataModule moneyballDataModule, Provider<MoneyballDataSource> provider) {
        this.module = moneyballDataModule;
        this.moneyballDataSourceProvider = provider;
    }

    @Override // javax.inject.Provider
    public FormCache get() {
        return providesFormCache(this.module, this.moneyballDataSourceProvider.get());
    }

    public static MoneyballDataModule_ProvidesFormCacheFactory create(MoneyballDataModule moneyballDataModule, Provider<MoneyballDataSource> provider) {
        return new MoneyballDataModule_ProvidesFormCacheFactory(moneyballDataModule, provider);
    }

    public static FormCache providesFormCache(MoneyballDataModule moneyballDataModule, MoneyballDataSource moneyballDataSource) {
        return (FormCache) Preconditions.checkNotNullFromProvides(moneyballDataModule.providesFormCache(moneyballDataSource));
    }
}
