package com.netflix.mediaclient.acquisition.screens.onRamp;

import com.netflix.mediaclient.acquisition.components.KeyboardController;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import com.netflix.mediaclient.acquisition.lib.screens.SignupFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment;
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
public final class OnRampFragment_MembersInjector implements MembersInjector<OnRampFragment> {
    private final Provider<KeyboardController> keyboardControllerProvider;
    private final Provider<SignupMoneyballEntryPoint> moneyballEntryPointProvider;
    private final Provider<OnRampLogger> onRampLoggerProvider;
    private final Provider<OnRampFragment.OnRampNavigationListener> onRampNavigationListenerProvider;
    private final Provider<InterfaceC1573aGh> uiLatencyTrackerProvider;

    public OnRampFragment_MembersInjector(Provider<InterfaceC1573aGh> provider, Provider<KeyboardController> provider2, Provider<SignupMoneyballEntryPoint> provider3, Provider<OnRampFragment.OnRampNavigationListener> provider4, Provider<OnRampLogger> provider5) {
        this.uiLatencyTrackerProvider = provider;
        this.keyboardControllerProvider = provider2;
        this.moneyballEntryPointProvider = provider3;
        this.onRampNavigationListenerProvider = provider4;
        this.onRampLoggerProvider = provider5;
    }

    public static MembersInjector<OnRampFragment> create(Provider<InterfaceC1573aGh> provider, Provider<KeyboardController> provider2, Provider<SignupMoneyballEntryPoint> provider3, Provider<OnRampFragment.OnRampNavigationListener> provider4, Provider<OnRampLogger> provider5) {
        return new OnRampFragment_MembersInjector(provider, provider2, provider3, provider4, provider5);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OnRampFragment onRampFragment) {
        SignupFragment_MembersInjector.injectUiLatencyTracker(onRampFragment, DoubleCheck.lazy(this.uiLatencyTrackerProvider));
        AbstractNetworkFragment2_MembersInjector.injectKeyboardController(onRampFragment, this.keyboardControllerProvider.get());
        injectMoneyballEntryPoint(onRampFragment, this.moneyballEntryPointProvider.get());
        injectOnRampNavigationListener(onRampFragment, this.onRampNavigationListenerProvider.get());
        injectOnRampLogger(onRampFragment, this.onRampLoggerProvider.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment.moneyballEntryPoint")
    public static void injectMoneyballEntryPoint(OnRampFragment onRampFragment, SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        onRampFragment.moneyballEntryPoint = signupMoneyballEntryPoint;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment.onRampNavigationListener")
    public static void injectOnRampNavigationListener(OnRampFragment onRampFragment, OnRampFragment.OnRampNavigationListener onRampNavigationListener) {
        onRampFragment.onRampNavigationListener = onRampNavigationListener;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment.onRampLogger")
    public static void injectOnRampLogger(OnRampFragment onRampFragment, OnRampLogger onRampLogger) {
        onRampFragment.onRampLogger = onRampLogger;
    }
}
