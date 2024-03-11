package com.netflix.mediaclient.acquisition.lib.screens;

import dagger.Lazy;
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
public final class SignupFragment_MembersInjector implements MembersInjector<SignupFragment> {
    private final Provider<InterfaceC1573aGh> uiLatencyTrackerProvider;

    public SignupFragment_MembersInjector(Provider<InterfaceC1573aGh> provider) {
        this.uiLatencyTrackerProvider = provider;
    }

    public static MembersInjector<SignupFragment> create(Provider<InterfaceC1573aGh> provider) {
        return new SignupFragment_MembersInjector(provider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SignupFragment signupFragment) {
        injectUiLatencyTracker(signupFragment, DoubleCheck.lazy(this.uiLatencyTrackerProvider));
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.lib.screens.SignupFragment.uiLatencyTracker")
    public static void injectUiLatencyTracker(SignupFragment signupFragment, Lazy<InterfaceC1573aGh> lazy) {
        signupFragment.uiLatencyTracker = lazy;
    }
}
