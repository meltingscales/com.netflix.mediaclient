package com.netflix.mediaclient.acquisition.screens.welcomefuji.ab44926;

import com.netflix.mediaclient.acquisition.screens.welcomefuji.FujiCardFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.services.logging.TtrImageObserver;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;
import o.C9867yA;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class FujiCardFragmentAb44926_MembersInjector implements MembersInjector<FujiCardFragmentAb44926> {
    private final Provider<C9867yA> keyboardStateProvider;
    private final Provider<TtrImageObserver> ttrImageObserverProvider;

    public FujiCardFragmentAb44926_MembersInjector(Provider<TtrImageObserver> provider, Provider<C9867yA> provider2) {
        this.ttrImageObserverProvider = provider;
        this.keyboardStateProvider = provider2;
    }

    public static MembersInjector<FujiCardFragmentAb44926> create(Provider<TtrImageObserver> provider, Provider<C9867yA> provider2) {
        return new FujiCardFragmentAb44926_MembersInjector(provider, provider2);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(FujiCardFragmentAb44926 fujiCardFragmentAb44926) {
        FujiCardFragment_MembersInjector.injectTtrImageObserver(fujiCardFragmentAb44926, this.ttrImageObserverProvider.get());
        injectKeyboardState(fujiCardFragmentAb44926, this.keyboardStateProvider.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.welcomefuji.ab44926.FujiCardFragmentAb44926.keyboardState")
    public static void injectKeyboardState(FujiCardFragmentAb44926 fujiCardFragmentAb44926, C9867yA c9867yA) {
        fujiCardFragmentAb44926.keyboardState = c9867yA;
    }
}
