package com.netflix.mediaclient.acquisition.components.faq;

import com.netflix.mediaclient.acquisition.components.faq.FaqFragment;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class FaqModule_ProvidesFaqInteractionListenerFactory implements Factory<FaqFragment.FaqInteractionListener> {
    private final Provider<FaqLogger> faqLoggerProvider;
    private final FaqModule module;

    public FaqModule_ProvidesFaqInteractionListenerFactory(FaqModule faqModule, Provider<FaqLogger> provider) {
        this.module = faqModule;
        this.faqLoggerProvider = provider;
    }

    @Override // javax.inject.Provider
    public FaqFragment.FaqInteractionListener get() {
        return providesFaqInteractionListener(this.module, this.faqLoggerProvider.get());
    }

    public static FaqModule_ProvidesFaqInteractionListenerFactory create(FaqModule faqModule, Provider<FaqLogger> provider) {
        return new FaqModule_ProvidesFaqInteractionListenerFactory(faqModule, provider);
    }

    public static FaqFragment.FaqInteractionListener providesFaqInteractionListener(FaqModule faqModule, FaqLogger faqLogger) {
        return (FaqFragment.FaqInteractionListener) Preconditions.checkNotNullFromProvides(faqModule.providesFaqInteractionListener(faqLogger));
    }
}
