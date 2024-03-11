package com.netflix.mediaclient.acquisition.lib.rdid;

import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import o.C8057ddG;
import o.InterfaceC5323bwb;
import o.XH;
import o.aCI;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class RdidConsentStateRepoImpl_Factory implements Factory<RdidConsentStateRepoImpl> {
    private final Provider<C8057ddG> advertisingIdClientProvider;
    private final Provider<InterfaceC5323bwb> consentStateDaoProvider;
    private final Provider<XH> featureRepoProvider;
    private final Provider<aCI> graphQLRepoProvider;

    public RdidConsentStateRepoImpl_Factory(Provider<aCI> provider, Provider<InterfaceC5323bwb> provider2, Provider<C8057ddG> provider3, Provider<XH> provider4) {
        this.graphQLRepoProvider = provider;
        this.consentStateDaoProvider = provider2;
        this.advertisingIdClientProvider = provider3;
        this.featureRepoProvider = provider4;
    }

    @Override // javax.inject.Provider
    public RdidConsentStateRepoImpl get() {
        return newInstance(DoubleCheck.lazy(this.graphQLRepoProvider), this.consentStateDaoProvider.get(), this.advertisingIdClientProvider.get(), this.featureRepoProvider.get());
    }

    public static RdidConsentStateRepoImpl_Factory create(Provider<aCI> provider, Provider<InterfaceC5323bwb> provider2, Provider<C8057ddG> provider3, Provider<XH> provider4) {
        return new RdidConsentStateRepoImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static RdidConsentStateRepoImpl newInstance(Lazy<aCI> lazy, InterfaceC5323bwb interfaceC5323bwb, C8057ddG c8057ddG, XH xh) {
        return new RdidConsentStateRepoImpl(lazy, interfaceC5323bwb, c8057ddG, xh);
    }
}
