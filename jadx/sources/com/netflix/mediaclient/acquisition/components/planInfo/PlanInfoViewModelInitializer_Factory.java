package com.netflix.mediaclient.acquisition.components.planInfo;

import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class PlanInfoViewModelInitializer_Factory implements Factory<PlanInfoViewModelInitializer> {
    private final Provider<MoneyballDataSource> moneyballDataSourceProvider;
    private final Provider<SignupErrorReporter> signupErrorReporterProvider;
    private final Provider<StringProvider> stringProvider;

    public PlanInfoViewModelInitializer_Factory(Provider<MoneyballDataSource> provider, Provider<SignupErrorReporter> provider2, Provider<StringProvider> provider3) {
        this.moneyballDataSourceProvider = provider;
        this.signupErrorReporterProvider = provider2;
        this.stringProvider = provider3;
    }

    @Override // javax.inject.Provider
    public PlanInfoViewModelInitializer get() {
        return newInstance(this.moneyballDataSourceProvider.get(), this.signupErrorReporterProvider.get(), this.stringProvider.get());
    }

    public static PlanInfoViewModelInitializer_Factory create(Provider<MoneyballDataSource> provider, Provider<SignupErrorReporter> provider2, Provider<StringProvider> provider3) {
        return new PlanInfoViewModelInitializer_Factory(provider, provider2, provider3);
    }

    public static PlanInfoViewModelInitializer newInstance(MoneyballDataSource moneyballDataSource, SignupErrorReporter signupErrorReporter, StringProvider stringProvider) {
        return new PlanInfoViewModelInitializer(moneyballDataSource, signupErrorReporter, stringProvider);
    }
}
