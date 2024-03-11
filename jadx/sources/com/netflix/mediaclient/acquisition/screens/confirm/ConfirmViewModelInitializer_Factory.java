package com.netflix.mediaclient.acquisition.screens.confirm;

import androidx.lifecycle.ViewModelProvider;
import com.netflix.mediaclient.acquisition.components.koreaLegal.KoreaCheckBoxesViewModelInitializer;
import com.netflix.mediaclient.acquisition.components.paymentInfo.PaymentInfoViewModelInitializer;
import com.netflix.mediaclient.acquisition.components.planInfo.PlanInfoViewModelInitializer;
import com.netflix.mediaclient.acquisition.components.startMembershipButton.StartMembershipButtonViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.FormCache;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import com.netflix.mediaclient.acquisition.screens.creditDebit.EmvcoDataService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class ConfirmViewModelInitializer_Factory implements Factory<ConfirmViewModelInitializer> {
    private final Provider<EmvcoDataService> emvcoDataServiceProvider;
    private final Provider<ErrorMessageViewModelInitializer> errorMessageViewModelInitializerProvider;
    private final Provider<FormCache> formCacheProvider;
    private final Provider<KoreaCheckBoxesViewModelInitializer> koreaCheckBoxesViewModelInitializerProvider;
    private final Provider<MoneyballDataSource> moneyballDataSourceProvider;
    private final Provider<PaymentInfoViewModelInitializer> paymentInfoViewModelInitializerProvider;
    private final Provider<PlanInfoViewModelInitializer> planInfoViewModelInitializerProvider;
    private final Provider<SignupErrorReporter> signupErrorReporterProvider;
    private final Provider<SignupNetworkManager> signupNetworkManagerProvider;
    private final Provider<StartMembershipButtonViewModelInitializer> startMembershipButtonViewModelInitializerProvider;
    private final Provider<StringProvider> stringProvider;
    private final Provider<ViewModelProvider.Factory> viewModelProviderFactoryProvider;

    public ConfirmViewModelInitializer_Factory(Provider<MoneyballDataSource> provider, Provider<SignupErrorReporter> provider2, Provider<SignupNetworkManager> provider3, Provider<StringProvider> provider4, Provider<ViewModelProvider.Factory> provider5, Provider<ErrorMessageViewModelInitializer> provider6, Provider<StartMembershipButtonViewModelInitializer> provider7, Provider<KoreaCheckBoxesViewModelInitializer> provider8, Provider<FormCache> provider9, Provider<EmvcoDataService> provider10, Provider<PlanInfoViewModelInitializer> provider11, Provider<PaymentInfoViewModelInitializer> provider12) {
        this.moneyballDataSourceProvider = provider;
        this.signupErrorReporterProvider = provider2;
        this.signupNetworkManagerProvider = provider3;
        this.stringProvider = provider4;
        this.viewModelProviderFactoryProvider = provider5;
        this.errorMessageViewModelInitializerProvider = provider6;
        this.startMembershipButtonViewModelInitializerProvider = provider7;
        this.koreaCheckBoxesViewModelInitializerProvider = provider8;
        this.formCacheProvider = provider9;
        this.emvcoDataServiceProvider = provider10;
        this.planInfoViewModelInitializerProvider = provider11;
        this.paymentInfoViewModelInitializerProvider = provider12;
    }

    @Override // javax.inject.Provider
    public ConfirmViewModelInitializer get() {
        return newInstance(this.moneyballDataSourceProvider.get(), this.signupErrorReporterProvider.get(), this.signupNetworkManagerProvider.get(), this.stringProvider.get(), this.viewModelProviderFactoryProvider.get(), this.errorMessageViewModelInitializerProvider.get(), this.startMembershipButtonViewModelInitializerProvider.get(), this.koreaCheckBoxesViewModelInitializerProvider.get(), this.formCacheProvider.get(), this.emvcoDataServiceProvider.get(), this.planInfoViewModelInitializerProvider.get(), this.paymentInfoViewModelInitializerProvider.get());
    }

    public static ConfirmViewModelInitializer_Factory create(Provider<MoneyballDataSource> provider, Provider<SignupErrorReporter> provider2, Provider<SignupNetworkManager> provider3, Provider<StringProvider> provider4, Provider<ViewModelProvider.Factory> provider5, Provider<ErrorMessageViewModelInitializer> provider6, Provider<StartMembershipButtonViewModelInitializer> provider7, Provider<KoreaCheckBoxesViewModelInitializer> provider8, Provider<FormCache> provider9, Provider<EmvcoDataService> provider10, Provider<PlanInfoViewModelInitializer> provider11, Provider<PaymentInfoViewModelInitializer> provider12) {
        return new ConfirmViewModelInitializer_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static ConfirmViewModelInitializer newInstance(MoneyballDataSource moneyballDataSource, SignupErrorReporter signupErrorReporter, SignupNetworkManager signupNetworkManager, StringProvider stringProvider, ViewModelProvider.Factory factory, ErrorMessageViewModelInitializer errorMessageViewModelInitializer, StartMembershipButtonViewModelInitializer startMembershipButtonViewModelInitializer, KoreaCheckBoxesViewModelInitializer koreaCheckBoxesViewModelInitializer, FormCache formCache, EmvcoDataService emvcoDataService, PlanInfoViewModelInitializer planInfoViewModelInitializer, PaymentInfoViewModelInitializer paymentInfoViewModelInitializer) {
        return new ConfirmViewModelInitializer(moneyballDataSource, signupErrorReporter, signupNetworkManager, stringProvider, factory, errorMessageViewModelInitializer, startMembershipButtonViewModelInitializer, koreaCheckBoxesViewModelInitializer, formCache, emvcoDataService, planInfoViewModelInitializer, paymentInfoViewModelInitializer);
    }
}
