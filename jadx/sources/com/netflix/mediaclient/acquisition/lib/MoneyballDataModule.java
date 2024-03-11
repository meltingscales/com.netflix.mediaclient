package com.netflix.mediaclient.acquisition.lib;

import com.netflix.android.moneyball.FlowMode;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballData;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import o.C8632dsu;

@Module
@InstallIn({MoneyballDataComponent.class})
/* loaded from: classes3.dex */
public final class MoneyballDataModule {
    @Provides
    public final FormCache providesFormCache(MoneyballDataSource moneyballDataSource) {
        C8632dsu.c((Object) moneyballDataSource, "");
        return moneyballDataSource.getFormCache();
    }

    @Provides
    public final FlowMode providesFlowMode(MoneyballDataSource moneyballDataSource) {
        C8632dsu.c((Object) moneyballDataSource, "");
        MoneyballData value = moneyballDataSource.getLiveMoneyballData().getValue();
        if (value != null) {
            return value.getFlowMode();
        }
        return null;
    }
}
