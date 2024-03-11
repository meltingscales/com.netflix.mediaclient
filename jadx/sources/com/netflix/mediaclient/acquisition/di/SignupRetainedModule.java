package com.netflix.mediaclient.acquisition.di;

import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.acquisition.lib.services.networking.MoneyballDataSourceImpl;
import com.netflix.mediaclient.acquisition.services.networking.SignupMoneyballData;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.scopes.ActivityRetainedScoped;

@Module
@InstallIn({ActivityRetainedComponent.class})
/* loaded from: classes3.dex */
public final class SignupRetainedModule {
    public static final int $stable = 0;

    @Provides
    @SignupMoneyballData
    @ActivityRetainedScoped
    public final MoneyballDataSource providesMoneyballData() {
        return new MoneyballDataSourceImpl();
    }
}
