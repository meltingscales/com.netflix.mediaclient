package com.netflix.mediaclient.acquisition.lib.rdid;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import o.InterfaceC1270Vf;
import o.dwQ;
import o.dwU;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.netflix.common.di.App", "com.netflix.common.di.IO", "dagger.hilt.android.qualifiers.ApplicationContext"})
/* loaded from: classes6.dex */
public final class RecordRdidManager_Factory implements Factory<RecordRdidManager> {
    private final Provider<InterfaceC1270Vf> clockProvider;
    private final Provider<Context> contextProvider;
    private final Provider<dwU> coroutineScopeProvider;
    private final Provider<dwQ> dispatcherProvider;
    private final Provider<RdidConsentStateRepo> rdidConsentStateRepoProvider;

    public RecordRdidManager_Factory(Provider<dwU> provider, Provider<dwQ> provider2, Provider<Context> provider3, Provider<InterfaceC1270Vf> provider4, Provider<RdidConsentStateRepo> provider5) {
        this.coroutineScopeProvider = provider;
        this.dispatcherProvider = provider2;
        this.contextProvider = provider3;
        this.clockProvider = provider4;
        this.rdidConsentStateRepoProvider = provider5;
    }

    @Override // javax.inject.Provider
    public RecordRdidManager get() {
        return newInstance(this.coroutineScopeProvider.get(), this.dispatcherProvider.get(), this.contextProvider.get(), this.clockProvider.get(), this.rdidConsentStateRepoProvider.get());
    }

    public static RecordRdidManager_Factory create(Provider<dwU> provider, Provider<dwQ> provider2, Provider<Context> provider3, Provider<InterfaceC1270Vf> provider4, Provider<RdidConsentStateRepo> provider5) {
        return new RecordRdidManager_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static RecordRdidManager newInstance(dwU dwu, dwQ dwq, Context context, InterfaceC1270Vf interfaceC1270Vf, RdidConsentStateRepo rdidConsentStateRepo) {
        return new RecordRdidManager(dwu, dwq, context, interfaceC1270Vf, rdidConsentStateRepo);
    }
}
