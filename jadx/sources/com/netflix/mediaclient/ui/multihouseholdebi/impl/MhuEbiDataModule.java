package com.netflix.mediaclient.ui.multihouseholdebi.impl;

import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.acquisition.lib.services.networking.MoneyballDataSourceImpl;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.scopes.ActivityRetainedScoped;

@Module
@InstallIn({ActivityRetainedComponent.class})
/* loaded from: classes4.dex */
public final class MhuEbiDataModule {
    @Provides
    @ActivityRetainedScoped
    public final MoneyballDataSource b() {
        return new MoneyballDataSourceImpl();
    }
}
