package com.netflix.mediaclient.acquisition.screens.orderFinal;

import com.netflix.mediaclient.acquisition.components.KeyboardController;
import com.netflix.mediaclient.acquisition.components.form.FormDataObserverFactory;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import com.netflix.mediaclient.acquisition.lib.screens.SignupFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2_MembersInjector;
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
public final class OrderFinalFragment_MembersInjector implements MembersInjector<OrderFinalFragment> {
    private final Provider<FormDataObserverFactory> formDataObserverFactoryProvider;
    private final Provider<KeyboardController> keyboardControllerProvider;
    private final Provider<SignupMoneyballEntryPoint> moneyballEntryPointProvider;
    private final Provider<OrderFinalLogger> orderFinalLoggerProvider;
    private final Provider<InterfaceC1573aGh> uiLatencyTrackerProvider;

    public OrderFinalFragment_MembersInjector(Provider<InterfaceC1573aGh> provider, Provider<KeyboardController> provider2, Provider<SignupMoneyballEntryPoint> provider3, Provider<FormDataObserverFactory> provider4, Provider<OrderFinalLogger> provider5) {
        this.uiLatencyTrackerProvider = provider;
        this.keyboardControllerProvider = provider2;
        this.moneyballEntryPointProvider = provider3;
        this.formDataObserverFactoryProvider = provider4;
        this.orderFinalLoggerProvider = provider5;
    }

    public static MembersInjector<OrderFinalFragment> create(Provider<InterfaceC1573aGh> provider, Provider<KeyboardController> provider2, Provider<SignupMoneyballEntryPoint> provider3, Provider<FormDataObserverFactory> provider4, Provider<OrderFinalLogger> provider5) {
        return new OrderFinalFragment_MembersInjector(provider, provider2, provider3, provider4, provider5);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OrderFinalFragment orderFinalFragment) {
        SignupFragment_MembersInjector.injectUiLatencyTracker(orderFinalFragment, DoubleCheck.lazy(this.uiLatencyTrackerProvider));
        AbstractNetworkFragment2_MembersInjector.injectKeyboardController(orderFinalFragment, this.keyboardControllerProvider.get());
        injectMoneyballEntryPoint(orderFinalFragment, this.moneyballEntryPointProvider.get());
        injectFormDataObserverFactory(orderFinalFragment, this.formDataObserverFactoryProvider.get());
        injectOrderFinalLogger(orderFinalFragment, this.orderFinalLoggerProvider.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.orderFinal.OrderFinalFragment.moneyballEntryPoint")
    public static void injectMoneyballEntryPoint(OrderFinalFragment orderFinalFragment, SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        orderFinalFragment.moneyballEntryPoint = signupMoneyballEntryPoint;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.orderFinal.OrderFinalFragment.formDataObserverFactory")
    public static void injectFormDataObserverFactory(OrderFinalFragment orderFinalFragment, FormDataObserverFactory formDataObserverFactory) {
        orderFinalFragment.formDataObserverFactory = formDataObserverFactory;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.orderFinal.OrderFinalFragment.orderFinalLogger")
    public static void injectOrderFinalLogger(OrderFinalFragment orderFinalFragment, OrderFinalLogger orderFinalLogger) {
        orderFinalFragment.orderFinalLogger = orderFinalLogger;
    }
}
