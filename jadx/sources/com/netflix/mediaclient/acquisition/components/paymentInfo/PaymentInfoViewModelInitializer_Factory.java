package com.netflix.mediaclient.acquisition.components.paymentInfo;

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
public final class PaymentInfoViewModelInitializer_Factory implements Factory<PaymentInfoViewModelInitializer> {
    private final Provider<MoneyballDataSource> moneyballDataSourceProvider;
    private final Provider<SignupErrorReporter> signupErrorReporterProvider;
    private final Provider<StringProvider> stringProvider;

    public PaymentInfoViewModelInitializer_Factory(Provider<MoneyballDataSource> provider, Provider<SignupErrorReporter> provider2, Provider<StringProvider> provider3) {
        this.moneyballDataSourceProvider = provider;
        this.signupErrorReporterProvider = provider2;
        this.stringProvider = provider3;
    }

    @Override // javax.inject.Provider
    public PaymentInfoViewModelInitializer get() {
        return newInstance(this.moneyballDataSourceProvider.get(), this.signupErrorReporterProvider.get(), this.stringProvider.get());
    }

    public static PaymentInfoViewModelInitializer_Factory create(Provider<MoneyballDataSource> provider, Provider<SignupErrorReporter> provider2, Provider<StringProvider> provider3) {
        return new PaymentInfoViewModelInitializer_Factory(provider, provider2, provider3);
    }

    public static PaymentInfoViewModelInitializer newInstance(MoneyballDataSource moneyballDataSource, SignupErrorReporter signupErrorReporter, StringProvider stringProvider) {
        return new PaymentInfoViewModelInitializer(moneyballDataSource, signupErrorReporter, stringProvider);
    }
}
