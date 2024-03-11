package com.netflix.mediaclient.ui.multihouseholdebi.impl;

import com.netflix.mediaclient.acquisition.lib.MoneyballDataComponent;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import javax.inject.Provider;
import o.C8632dsu;
import o.InterfaceC6829ckg;

@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes4.dex */
public final class MhuEbiEntryPointModule {
    @Provides
    @ActivityScoped
    public final InterfaceC6829ckg a(Provider<MoneyballDataComponent.Builder> provider, MoneyballDataSource moneyballDataSource) {
        C8632dsu.c((Object) provider, "");
        C8632dsu.c((Object) moneyballDataSource, "");
        Object obj = EntryPoints.get(provider.get().moneyballDataSource(moneyballDataSource).build(), InterfaceC6829ckg.class);
        C8632dsu.a(obj, "");
        return (InterfaceC6829ckg) obj;
    }
}
