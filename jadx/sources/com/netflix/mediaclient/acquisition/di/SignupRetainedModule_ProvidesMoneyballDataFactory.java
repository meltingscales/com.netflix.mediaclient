package com.netflix.mediaclient.acquisition.di;

import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("dagger.hilt.android.scopes.ActivityRetainedScoped")
@DaggerGenerated
@QualifierMetadata({"com.netflix.mediaclient.acquisition.services.networking.SignupMoneyballData"})
/* loaded from: classes3.dex */
public final class SignupRetainedModule_ProvidesMoneyballDataFactory implements Factory<MoneyballDataSource> {
    private final SignupRetainedModule module;

    public SignupRetainedModule_ProvidesMoneyballDataFactory(SignupRetainedModule signupRetainedModule) {
        this.module = signupRetainedModule;
    }

    @Override // javax.inject.Provider
    public MoneyballDataSource get() {
        return providesMoneyballData(this.module);
    }

    public static SignupRetainedModule_ProvidesMoneyballDataFactory create(SignupRetainedModule signupRetainedModule) {
        return new SignupRetainedModule_ProvidesMoneyballDataFactory(signupRetainedModule);
    }

    public static MoneyballDataSource providesMoneyballData(SignupRetainedModule signupRetainedModule) {
        return (MoneyballDataSource) Preconditions.checkNotNullFromProvides(signupRetainedModule.providesMoneyballData());
    }
}
