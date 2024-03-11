package com.netflix.mediaclient.acquisition.di;

import android.app.Activity;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataComponent;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("dagger.hilt.android.scopes.ActivityScoped")
@DaggerGenerated
@QualifierMetadata({"com.netflix.mediaclient.acquisition.services.networking.SignupMoneyballData"})
/* loaded from: classes3.dex */
public final class SignupModule_ProvidesMoneyballEntrypointFactory implements Factory<SignupMoneyballEntryPoint> {
    private final Provider<Activity> activityProvider;
    private final Provider<MoneyballDataComponent.Builder> builderProvider;
    private final SignupModule module;
    private final Provider<MoneyballDataSource> moneyballDataSourceProvider;

    public SignupModule_ProvidesMoneyballEntrypointFactory(SignupModule signupModule, Provider<MoneyballDataComponent.Builder> provider, Provider<MoneyballDataSource> provider2, Provider<Activity> provider3) {
        this.module = signupModule;
        this.builderProvider = provider;
        this.moneyballDataSourceProvider = provider2;
        this.activityProvider = provider3;
    }

    @Override // javax.inject.Provider
    public SignupMoneyballEntryPoint get() {
        return providesMoneyballEntrypoint(this.module, this.builderProvider, this.moneyballDataSourceProvider.get(), this.activityProvider.get());
    }

    public static SignupModule_ProvidesMoneyballEntrypointFactory create(SignupModule signupModule, Provider<MoneyballDataComponent.Builder> provider, Provider<MoneyballDataSource> provider2, Provider<Activity> provider3) {
        return new SignupModule_ProvidesMoneyballEntrypointFactory(signupModule, provider, provider2, provider3);
    }

    public static SignupMoneyballEntryPoint providesMoneyballEntrypoint(SignupModule signupModule, Provider<MoneyballDataComponent.Builder> provider, MoneyballDataSource moneyballDataSource, Activity activity) {
        return (SignupMoneyballEntryPoint) Preconditions.checkNotNullFromProvides(signupModule.providesMoneyballEntrypoint(provider, moneyballDataSource, activity));
    }
}
