package com.netflix.mediaclient.acquisition.lib;

import com.netflix.android.moneyball.FlowMode;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class MoneyballDataModule_ProvidesFlowModeFactory implements Factory<FlowMode> {
    private final MoneyballDataModule module;
    private final Provider<MoneyballDataSource> moneyballDataSourceProvider;

    public MoneyballDataModule_ProvidesFlowModeFactory(MoneyballDataModule moneyballDataModule, Provider<MoneyballDataSource> provider) {
        this.module = moneyballDataModule;
        this.moneyballDataSourceProvider = provider;
    }

    @Override // javax.inject.Provider
    public FlowMode get() {
        return providesFlowMode(this.module, this.moneyballDataSourceProvider.get());
    }

    public static MoneyballDataModule_ProvidesFlowModeFactory create(MoneyballDataModule moneyballDataModule, Provider<MoneyballDataSource> provider) {
        return new MoneyballDataModule_ProvidesFlowModeFactory(moneyballDataModule, provider);
    }

    public static FlowMode providesFlowMode(MoneyballDataModule moneyballDataModule, MoneyballDataSource moneyballDataSource) {
        return moneyballDataModule.providesFlowMode(moneyballDataSource);
    }
}
