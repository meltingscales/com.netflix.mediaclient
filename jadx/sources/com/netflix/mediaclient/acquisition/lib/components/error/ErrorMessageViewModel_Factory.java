package com.netflix.mediaclient.acquisition.lib.components.error;

import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class ErrorMessageViewModel_Factory implements Factory<ErrorMessageViewModel> {
    private final Provider<ErrorMessageViewModelInitializer> initializerProvider;
    private final Provider<StringProvider> stringProvider;

    public ErrorMessageViewModel_Factory(Provider<StringProvider> provider, Provider<ErrorMessageViewModelInitializer> provider2) {
        this.stringProvider = provider;
        this.initializerProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ErrorMessageViewModel get() {
        return newInstance(this.stringProvider.get(), this.initializerProvider.get());
    }

    public static ErrorMessageViewModel_Factory create(Provider<StringProvider> provider, Provider<ErrorMessageViewModelInitializer> provider2) {
        return new ErrorMessageViewModel_Factory(provider, provider2);
    }

    public static ErrorMessageViewModel newInstance(StringProvider stringProvider, ErrorMessageViewModelInitializer errorMessageViewModelInitializer) {
        return new ErrorMessageViewModel(stringProvider, errorMessageViewModelInitializer);
    }
}
