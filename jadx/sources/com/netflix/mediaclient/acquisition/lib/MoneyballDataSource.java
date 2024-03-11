package com.netflix.mediaclient.acquisition.lib;

import androidx.lifecycle.MutableLiveData;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballData;

/* loaded from: classes3.dex */
public interface MoneyballDataSource {
    FlowMode getFlowMode();

    FormCache getFormCache();

    MutableLiveData<MoneyballData> getLiveMoneyballData();

    void setFormCache(FormCache formCache);

    void setLiveMoneyballData(MutableLiveData<MoneyballData> mutableLiveData);

    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static FlowMode getFlowMode(MoneyballDataSource moneyballDataSource) {
            MoneyballData value = moneyballDataSource.getLiveMoneyballData().getValue();
            if (value != null) {
                return value.getFlowMode();
            }
            return null;
        }
    }
}
