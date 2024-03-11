package com.netflix.mediaclient.acquisition.screens.welcomefuji;

import com.netflix.mediaclient.acquisition.components.KeyboardController;
import com.netflix.mediaclient.acquisition.components.form.FormDataObserverFactory;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import com.netflix.mediaclient.acquisition.lib.screens.SignupFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiFragment;
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
public final class WelcomeFujiFragment_MembersInjector implements MembersInjector<WelcomeFujiFragment> {
    private final Provider<WelcomeFujiLogger.Factory> factoryProvider;
    private final Provider<FormDataObserverFactory> formDataObserverFactoryProvider;
    private final Provider<WelcomeFujiFragment.WelcomeFujiNavigationListener> fujiNavigationListenerProvider;
    private final Provider<KeyboardController> keyboardControllerProvider;
    private final Provider<LoginApi> loginApiProvider;
    private final Provider<SignupMoneyballEntryPoint> moneyballEntryPointProvider;
    private final Provider<TtrEventListener> ttrEventListenerProvider;
    private final Provider<InterfaceC1573aGh> uiLatencyTrackerProvider;

    public WelcomeFujiFragment_MembersInjector(Provider<InterfaceC1573aGh> provider, Provider<KeyboardController> provider2, Provider<WelcomeFujiFragment.WelcomeFujiNavigationListener> provider3, Provider<FormDataObserverFactory> provider4, Provider<SignupMoneyballEntryPoint> provider5, Provider<WelcomeFujiLogger.Factory> provider6, Provider<TtrEventListener> provider7, Provider<LoginApi> provider8) {
        this.uiLatencyTrackerProvider = provider;
        this.keyboardControllerProvider = provider2;
        this.fujiNavigationListenerProvider = provider3;
        this.formDataObserverFactoryProvider = provider4;
        this.moneyballEntryPointProvider = provider5;
        this.factoryProvider = provider6;
        this.ttrEventListenerProvider = provider7;
        this.loginApiProvider = provider8;
    }

    public static MembersInjector<WelcomeFujiFragment> create(Provider<InterfaceC1573aGh> provider, Provider<KeyboardController> provider2, Provider<WelcomeFujiFragment.WelcomeFujiNavigationListener> provider3, Provider<FormDataObserverFactory> provider4, Provider<SignupMoneyballEntryPoint> provider5, Provider<WelcomeFujiLogger.Factory> provider6, Provider<TtrEventListener> provider7, Provider<LoginApi> provider8) {
        return new WelcomeFujiFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(WelcomeFujiFragment welcomeFujiFragment) {
        SignupFragment_MembersInjector.injectUiLatencyTracker(welcomeFujiFragment, DoubleCheck.lazy(this.uiLatencyTrackerProvider));
        AbstractNetworkFragment2_MembersInjector.injectKeyboardController(welcomeFujiFragment, this.keyboardControllerProvider.get());
        injectFujiNavigationListener(welcomeFujiFragment, this.fujiNavigationListenerProvider.get());
        injectFormDataObserverFactory(welcomeFujiFragment, this.formDataObserverFactoryProvider.get());
        injectMoneyballEntryPoint(welcomeFujiFragment, this.moneyballEntryPointProvider.get());
        injectFactory(welcomeFujiFragment, this.factoryProvider.get());
        injectTtrEventListener(welcomeFujiFragment, this.ttrEventListenerProvider.get());
        injectLoginApi(welcomeFujiFragment, this.loginApiProvider.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiFragment.fujiNavigationListener")
    public static void injectFujiNavigationListener(WelcomeFujiFragment welcomeFujiFragment, WelcomeFujiFragment.WelcomeFujiNavigationListener welcomeFujiNavigationListener) {
        welcomeFujiFragment.fujiNavigationListener = welcomeFujiNavigationListener;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiFragment.formDataObserverFactory")
    public static void injectFormDataObserverFactory(WelcomeFujiFragment welcomeFujiFragment, FormDataObserverFactory formDataObserverFactory) {
        welcomeFujiFragment.formDataObserverFactory = formDataObserverFactory;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiFragment.moneyballEntryPoint")
    public static void injectMoneyballEntryPoint(WelcomeFujiFragment welcomeFujiFragment, SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        welcomeFujiFragment.moneyballEntryPoint = signupMoneyballEntryPoint;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiFragment.factory")
    public static void injectFactory(WelcomeFujiFragment welcomeFujiFragment, WelcomeFujiLogger.Factory factory) {
        welcomeFujiFragment.factory = factory;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiFragment.ttrEventListener")
    public static void injectTtrEventListener(WelcomeFujiFragment welcomeFujiFragment, TtrEventListener ttrEventListener) {
        welcomeFujiFragment.ttrEventListener = ttrEventListener;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiFragment.loginApi")
    public static void injectLoginApi(WelcomeFujiFragment welcomeFujiFragment, LoginApi loginApi) {
        welcomeFujiFragment.loginApi = loginApi;
    }
}
