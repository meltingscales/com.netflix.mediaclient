package com.netflix.mediaclient.acquisition.lib.services.networking;

import androidx.lifecycle.MutableLiveData;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.mediaclient.acquisition.lib.FormCache;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.acquisition.lib.services.cache.FormCacheImpl;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballData;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class MoneyballDataSourceImpl implements MoneyballDataSource {
    private MutableLiveData<MoneyballData> liveMoneyballData = new MutableLiveData<>();
    private FormCache formCache = new FormCacheImpl();

    @Override // com.netflix.mediaclient.acquisition.lib.MoneyballDataSource
    public FormCache getFormCache() {
        return this.formCache;
    }

    @Override // com.netflix.mediaclient.acquisition.lib.MoneyballDataSource
    public MutableLiveData<MoneyballData> getLiveMoneyballData() {
        return this.liveMoneyballData;
    }

    @Override // com.netflix.mediaclient.acquisition.lib.MoneyballDataSource
    public void setFormCache(FormCache formCache) {
        C8632dsu.c((Object) formCache, "");
        this.formCache = formCache;
    }

    @Override // com.netflix.mediaclient.acquisition.lib.MoneyballDataSource
    public void setLiveMoneyballData(MutableLiveData<MoneyballData> mutableLiveData) {
        C8632dsu.c((Object) mutableLiveData, "");
        this.liveMoneyballData = mutableLiveData;
    }

    @Override // com.netflix.mediaclient.acquisition.lib.MoneyballDataSource
    public FlowMode getFlowMode() {
        return MoneyballDataSource.DefaultImpls.getFlowMode(this);
    }
}
