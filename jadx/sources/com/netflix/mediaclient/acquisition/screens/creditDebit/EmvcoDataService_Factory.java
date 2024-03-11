package com.netflix.mediaclient.acquisition.screens.creditDebit;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Locale;
import javax.inject.Provider;
import o.InterfaceC8554dpx;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes6.dex */
public final class EmvcoDataService_Factory implements Factory<EmvcoDataService> {
    private final Provider<InterfaceC8554dpx<Locale>> localeProvider;
    private final Provider<String> webViewBaseUrlProvider;

    public EmvcoDataService_Factory(Provider<String> provider, Provider<InterfaceC8554dpx<Locale>> provider2) {
        this.webViewBaseUrlProvider = provider;
        this.localeProvider = provider2;
    }

    @Override // javax.inject.Provider
    public EmvcoDataService get() {
        return newInstance(this.webViewBaseUrlProvider.get(), this.localeProvider.get());
    }

    public static EmvcoDataService_Factory create(Provider<String> provider, Provider<InterfaceC8554dpx<Locale>> provider2) {
        return new EmvcoDataService_Factory(provider, provider2);
    }

    public static EmvcoDataService newInstance(String str, InterfaceC8554dpx<Locale> interfaceC8554dpx) {
        return new EmvcoDataService(str, interfaceC8554dpx);
    }
}
