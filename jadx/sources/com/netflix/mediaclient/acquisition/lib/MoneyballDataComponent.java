package com.netflix.mediaclient.acquisition.lib;

import dagger.BindsInstance;
import dagger.hilt.DefineComponent;
import dagger.hilt.android.components.ActivityComponent;

@DefineComponent(parent = ActivityComponent.class)
/* loaded from: classes3.dex */
public interface MoneyballDataComponent {

    @DefineComponent.Builder
    /* loaded from: classes3.dex */
    public interface Builder {
        MoneyballDataComponent build();

        Builder moneyballDataSource(@BindsInstance MoneyballDataSource moneyballDataSource);

        Builder moneyballUpdater(@MoneyballUpdater @BindsInstance NetworkRequestResponseListener networkRequestResponseListener);
    }
}
