package com.netflix.mediaclient.acquisition.lib.services.networking;

import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.lib.services.logging.RequestResponseLogger;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import o.aIB;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.netflix.mediaclient.acquisition.lib.MoneyballUpdater"})
/* loaded from: classes6.dex */
public final class SignupNetworkManager_Factory implements Factory<SignupNetworkManager> {
    private final Provider<MoneyballDataSource> moneyballDataSourceProvider;
    private final Provider<NetworkRequestResponseListener> moneyballUpdaterProvider;
    private final Provider<RequestResponseLogger> requestResponseLoggerProvider;
    private final Provider<aIB> serviceManagerRunnerProvider;
    private final Provider<SignupErrorReporter> signupErrorReporterProvider;

    public SignupNetworkManager_Factory(Provider<aIB> provider, Provider<SignupErrorReporter> provider2, Provider<RequestResponseLogger> provider3, Provider<NetworkRequestResponseListener> provider4, Provider<MoneyballDataSource> provider5) {
        this.serviceManagerRunnerProvider = provider;
        this.signupErrorReporterProvider = provider2;
        this.requestResponseLoggerProvider = provider3;
        this.moneyballUpdaterProvider = provider4;
        this.moneyballDataSourceProvider = provider5;
    }

    @Override // javax.inject.Provider
    public SignupNetworkManager get() {
        return newInstance(this.serviceManagerRunnerProvider.get(), this.signupErrorReporterProvider.get(), this.requestResponseLoggerProvider.get(), this.moneyballUpdaterProvider.get(), this.moneyballDataSourceProvider.get());
    }

    public static SignupNetworkManager_Factory create(Provider<aIB> provider, Provider<SignupErrorReporter> provider2, Provider<RequestResponseLogger> provider3, Provider<NetworkRequestResponseListener> provider4, Provider<MoneyballDataSource> provider5) {
        return new SignupNetworkManager_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static SignupNetworkManager newInstance(aIB aib, SignupErrorReporter signupErrorReporter, RequestResponseLogger requestResponseLogger, NetworkRequestResponseListener networkRequestResponseListener, MoneyballDataSource moneyballDataSource) {
        return new SignupNetworkManager(aib, signupErrorReporter, requestResponseLogger, networkRequestResponseListener, moneyballDataSource);
    }
}
