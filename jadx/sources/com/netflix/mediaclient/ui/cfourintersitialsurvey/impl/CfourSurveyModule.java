package com.netflix.mediaclient.ui.cfourintersitialsurvey.impl;

import com.netflix.mediaclient.acquisition.lib.MoneyballDataComponent;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import javax.inject.Provider;
import o.C5424byW;
import o.C8632dsu;
import o.InterfaceC5425byX;
import o.InterfaceC5427byZ;

@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes4.dex */
public final class CfourSurveyModule {
    @Provides
    @ActivityScoped
    public final InterfaceC5425byX d(C5424byW c5424byW) {
        C8632dsu.c((Object) c5424byW, "");
        return c5424byW;
    }

    @Provides
    @ActivityScoped
    public final InterfaceC5427byZ b(Provider<MoneyballDataComponent.Builder> provider, MoneyballDataSource moneyballDataSource) {
        C8632dsu.c((Object) provider, "");
        C8632dsu.c((Object) moneyballDataSource, "");
        Object obj = EntryPoints.get(provider.get().moneyballDataSource(moneyballDataSource).build(), InterfaceC5427byZ.class);
        C8632dsu.a(obj, "");
        return (InterfaceC5427byZ) obj;
    }
}
