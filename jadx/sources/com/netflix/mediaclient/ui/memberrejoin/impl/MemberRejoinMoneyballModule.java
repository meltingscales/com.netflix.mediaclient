package com.netflix.mediaclient.ui.memberrejoin.impl;

import android.app.Activity;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataComponent;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import javax.inject.Provider;
import o.C8632dsu;
import o.InterfaceC6590cgF;

@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes4.dex */
public final class MemberRejoinMoneyballModule {
    @Provides
    @ActivityScoped
    public final InterfaceC6590cgF d(Provider<MoneyballDataComponent.Builder> provider, MoneyballDataSource moneyballDataSource, Activity activity) {
        C8632dsu.c((Object) provider, "");
        C8632dsu.c((Object) moneyballDataSource, "");
        C8632dsu.c((Object) activity, "");
        Object obj = EntryPoints.get(provider.get().moneyballDataSource(moneyballDataSource).moneyballUpdater((NetworkRequestResponseListener) activity).build(), InterfaceC6590cgF.class);
        C8632dsu.a(obj, "");
        return (InterfaceC6590cgF) obj;
    }
}
