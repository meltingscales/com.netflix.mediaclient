package com.netflix.mediaclient.acquisition.screens.welcomefuji;

import com.netflix.mediaclient.acquisition.services.logging.TtrImageObserver;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class FujiCardFragment_MembersInjector implements MembersInjector<FujiCardFragment> {
    private final Provider<TtrImageObserver> ttrImageObserverProvider;

    public FujiCardFragment_MembersInjector(Provider<TtrImageObserver> provider) {
        this.ttrImageObserverProvider = provider;
    }

    public static MembersInjector<FujiCardFragment> create(Provider<TtrImageObserver> provider) {
        return new FujiCardFragment_MembersInjector(provider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(FujiCardFragment fujiCardFragment) {
        injectTtrImageObserver(fujiCardFragment, this.ttrImageObserverProvider.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.welcomefuji.FujiCardFragment.ttrImageObserver")
    public static void injectTtrImageObserver(FujiCardFragment fujiCardFragment, TtrImageObserver ttrImageObserver) {
        fujiCardFragment.ttrImageObserver = ttrImageObserver;
    }
}
