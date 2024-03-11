package com.netflix.mediaclient.acquisition.components.tou;

import com.netflix.mediaclient.acquisition.components.startMembershipButton.StartMembershipButtonViewModelInitializer;
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
public final class TouViewModelInitializer_Factory implements Factory<TouViewModelInitializer> {
    private final Provider<MoneyballDataSource> moneyballDataSourceProvider;
    private final Provider<SignupErrorReporter> signupErrorReporterProvider;
    private final Provider<StartMembershipButtonViewModelInitializer> startMembershipButtonViewModelInitializerProvider;
    private final Provider<StringProvider> stringProvider;

    public TouViewModelInitializer_Factory(Provider<MoneyballDataSource> provider, Provider<SignupErrorReporter> provider2, Provider<StringProvider> provider3, Provider<StartMembershipButtonViewModelInitializer> provider4) {
        this.moneyballDataSourceProvider = provider;
        this.signupErrorReporterProvider = provider2;
        this.stringProvider = provider3;
        this.startMembershipButtonViewModelInitializerProvider = provider4;
    }

    @Override // javax.inject.Provider
    public TouViewModelInitializer get() {
        return newInstance(this.moneyballDataSourceProvider.get(), this.signupErrorReporterProvider.get(), this.stringProvider.get(), this.startMembershipButtonViewModelInitializerProvider.get());
    }

    public static TouViewModelInitializer_Factory create(Provider<MoneyballDataSource> provider, Provider<SignupErrorReporter> provider2, Provider<StringProvider> provider3, Provider<StartMembershipButtonViewModelInitializer> provider4) {
        return new TouViewModelInitializer_Factory(provider, provider2, provider3, provider4);
    }

    public static TouViewModelInitializer newInstance(MoneyballDataSource moneyballDataSource, SignupErrorReporter signupErrorReporter, StringProvider stringProvider, StartMembershipButtonViewModelInitializer startMembershipButtonViewModelInitializer) {
        return new TouViewModelInitializer(moneyballDataSource, signupErrorReporter, stringProvider, startMembershipButtonViewModelInitializer);
    }
}
