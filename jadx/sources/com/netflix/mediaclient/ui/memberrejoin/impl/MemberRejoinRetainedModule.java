package com.netflix.mediaclient.ui.memberrejoin.impl;

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
public final class MemberRejoinRetainedModule {
    @Provides
    @ActivityRetainedScoped
    public final MoneyballDataSource a() {
        return new MoneyballDataSourceImpl();
    }
}
