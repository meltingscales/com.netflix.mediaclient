package com.netflix.mediaclient.acquisition.services.logging;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class TtrImageObserver_Factory implements Factory<TtrImageObserver> {
    private final Provider<TtrEventListener> ttrEventListenerProvider;

    public TtrImageObserver_Factory(Provider<TtrEventListener> provider) {
        this.ttrEventListenerProvider = provider;
    }

    @Override // javax.inject.Provider
    public TtrImageObserver get() {
        return newInstance(this.ttrEventListenerProvider.get());
    }

    public static TtrImageObserver_Factory create(Provider<TtrEventListener> provider) {
        return new TtrImageObserver_Factory(provider);
    }

    public static TtrImageObserver newInstance(TtrEventListener ttrEventListener) {
        return new TtrImageObserver(ttrEventListener);
    }
}
