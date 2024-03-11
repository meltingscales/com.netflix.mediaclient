package com.netflix.mediaclient.acquisition.screens;

import com.netflix.mediaclient.acquisition.components.KeyboardController;
import com.netflix.mediaclient.acquisition.lib.screens.SignupFragment_MembersInjector;
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
public final class AbstractNetworkFragment2_MembersInjector implements MembersInjector<AbstractNetworkFragment2> {
    private final Provider<KeyboardController> keyboardControllerProvider;
    private final Provider<InterfaceC1573aGh> uiLatencyTrackerProvider;

    public AbstractNetworkFragment2_MembersInjector(Provider<InterfaceC1573aGh> provider, Provider<KeyboardController> provider2) {
        this.uiLatencyTrackerProvider = provider;
        this.keyboardControllerProvider = provider2;
    }

    public static MembersInjector<AbstractNetworkFragment2> create(Provider<InterfaceC1573aGh> provider, Provider<KeyboardController> provider2) {
        return new AbstractNetworkFragment2_MembersInjector(provider, provider2);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(AbstractNetworkFragment2 abstractNetworkFragment2) {
        SignupFragment_MembersInjector.injectUiLatencyTracker(abstractNetworkFragment2, DoubleCheck.lazy(this.uiLatencyTrackerProvider));
        injectKeyboardController(abstractNetworkFragment2, this.keyboardControllerProvider.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2.keyboardController")
    public static void injectKeyboardController(AbstractNetworkFragment2 abstractNetworkFragment2, KeyboardController keyboardController) {
        abstractNetworkFragment2.keyboardController = keyboardController;
    }
}
