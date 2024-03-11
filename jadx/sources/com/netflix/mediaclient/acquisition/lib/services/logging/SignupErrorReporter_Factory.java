package com.netflix.mediaclient.acquisition.lib.services.logging;

import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
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
public final class SignupErrorReporter_Factory implements Factory<SignupErrorReporter> {
    private final Provider<SignupErrorReporter.LoggedErrorListener> loggedErrorListenerProvider;
    private final Provider<MoneyballDataSource> moneyballDataSourceProvider;
    private final Provider<SignupLogger> signupLoggerProvider;

    public SignupErrorReporter_Factory(Provider<SignupLogger> provider, Provider<MoneyballDataSource> provider2, Provider<SignupErrorReporter.LoggedErrorListener> provider3) {
        this.signupLoggerProvider = provider;
        this.moneyballDataSourceProvider = provider2;
        this.loggedErrorListenerProvider = provider3;
    }

    @Override // javax.inject.Provider
    public SignupErrorReporter get() {
        return newInstance(this.signupLoggerProvider.get(), this.moneyballDataSourceProvider.get(), this.loggedErrorListenerProvider.get());
    }

    public static SignupErrorReporter_Factory create(Provider<SignupLogger> provider, Provider<MoneyballDataSource> provider2, Provider<SignupErrorReporter.LoggedErrorListener> provider3) {
        return new SignupErrorReporter_Factory(provider, provider2, provider3);
    }

    public static SignupErrorReporter newInstance(SignupLogger signupLogger, MoneyballDataSource moneyballDataSource, SignupErrorReporter.LoggedErrorListener loggedErrorListener) {
        return new SignupErrorReporter(signupLogger, moneyballDataSource, loggedErrorListener);
    }
}
