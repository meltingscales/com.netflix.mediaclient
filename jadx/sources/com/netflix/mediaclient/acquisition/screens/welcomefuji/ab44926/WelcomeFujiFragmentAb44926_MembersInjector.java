package com.netflix.mediaclient.acquisition.screens.welcomefuji.ab44926;

import com.netflix.mediaclient.acquisition.components.KeyboardController;
import com.netflix.mediaclient.acquisition.components.form.FormDataObserverFactory;
import com.netflix.mediaclient.acquisition.components.form2.edittext.LastFormViewEditTextBinding;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import com.netflix.mediaclient.acquisition.lib.screens.SignupFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiFragment;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiLogger;
import com.netflix.mediaclient.acquisition.services.logging.TtrEventListener;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;
import o.InterfaceC1573aGh;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class WelcomeFujiFragmentAb44926_MembersInjector implements MembersInjector<WelcomeFujiFragmentAb44926> {
    private final Provider<WelcomeFujiLogger.Factory> factoryProvider;
    private final Provider<FormDataObserverFactory> formDataObserverFactoryProvider;
    private final Provider<WelcomeFujiFragment.WelcomeFujiNavigationListener> fujiNavigationListenerProvider;
    private final Provider<KeyboardController> keyboardControllerProvider;
    private final Provider<LastFormViewEditTextBinding> lastFormViewEditTextBindingProvider;
    private final Provider<LoginApi> loginApiProvider;
    private final Provider<SignupMoneyballEntryPoint> moneyballEntryPointProvider;
    private final Provider<TtrEventListener> ttrEventListenerProvider;
    private final Provider<InterfaceC1573aGh> uiLatencyTrackerProvider;

    public WelcomeFujiFragmentAb44926_MembersInjector(Provider<InterfaceC1573aGh> provider, Provider<KeyboardController> provider2, Provider<WelcomeFujiFragment.WelcomeFujiNavigationListener> provider3, Provider<FormDataObserverFactory> provider4, Provider<SignupMoneyballEntryPoint> provider5, Provider<WelcomeFujiLogger.Factory> provider6, Provider<TtrEventListener> provider7, Provider<LoginApi> provider8, Provider<LastFormViewEditTextBinding> provider9) {
        this.uiLatencyTrackerProvider = provider;
        this.keyboardControllerProvider = provider2;
        this.fujiNavigationListenerProvider = provider3;
        this.formDataObserverFactoryProvider = provider4;
        this.moneyballEntryPointProvider = provider5;
        this.factoryProvider = provider6;
        this.ttrEventListenerProvider = provider7;
        this.loginApiProvider = provider8;
        this.lastFormViewEditTextBindingProvider = provider9;
    }

    public static MembersInjector<WelcomeFujiFragmentAb44926> create(Provider<InterfaceC1573aGh> provider, Provider<KeyboardController> provider2, Provider<WelcomeFujiFragment.WelcomeFujiNavigationListener> provider3, Provider<FormDataObserverFactory> provider4, Provider<SignupMoneyballEntryPoint> provider5, Provider<WelcomeFujiLogger.Factory> provider6, Provider<TtrEventListener> provider7, Provider<LoginApi> provider8, Provider<LastFormViewEditTextBinding> provider9) {
        return new WelcomeFujiFragmentAb44926_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(WelcomeFujiFragmentAb44926 welcomeFujiFragmentAb44926) {
        SignupFragment_MembersInjector.injectUiLatencyTracker(welcomeFujiFragmentAb44926, DoubleCheck.lazy(this.uiLatencyTrackerProvider));
        AbstractNetworkFragment2_MembersInjector.injectKeyboardController(welcomeFujiFragmentAb44926, this.keyboardControllerProvider.get());
        WelcomeFujiFragment_MembersInjector.injectFujiNavigationListener(welcomeFujiFragmentAb44926, this.fujiNavigationListenerProvider.get());
        WelcomeFujiFragment_MembersInjector.injectFormDataObserverFactory(welcomeFujiFragmentAb44926, this.formDataObserverFactoryProvider.get());
        WelcomeFujiFragment_MembersInjector.injectMoneyballEntryPoint(welcomeFujiFragmentAb44926, this.moneyballEntryPointProvider.get());
        WelcomeFujiFragment_MembersInjector.injectFactory(welcomeFujiFragmentAb44926, this.factoryProvider.get());
        WelcomeFujiFragment_MembersInjector.injectTtrEventListener(welcomeFujiFragmentAb44926, this.ttrEventListenerProvider.get());
        WelcomeFujiFragment_MembersInjector.injectLoginApi(welcomeFujiFragmentAb44926, this.loginApiProvider.get());
        injectLastFormViewEditTextBinding(welcomeFujiFragmentAb44926, this.lastFormViewEditTextBindingProvider.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.welcomefuji.ab44926.WelcomeFujiFragmentAb44926.lastFormViewEditTextBinding")
    public static void injectLastFormViewEditTextBinding(WelcomeFujiFragmentAb44926 welcomeFujiFragmentAb44926, LastFormViewEditTextBinding lastFormViewEditTextBinding) {
        welcomeFujiFragmentAb44926.lastFormViewEditTextBinding = lastFormViewEditTextBinding;
    }
}
