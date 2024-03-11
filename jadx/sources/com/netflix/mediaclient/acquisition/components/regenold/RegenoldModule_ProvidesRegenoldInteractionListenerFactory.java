package com.netflix.mediaclient.acquisition.components.regenold;

import com.netflix.mediaclient.acquisition.components.regenold.RegenoldFragment;
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
public final class RegenoldModule_ProvidesRegenoldInteractionListenerFactory implements Factory<RegenoldFragment.RegenoldInteractionListener> {
    private final RegenoldModule module;
    private final Provider<RegenoldLogger> regenoldLoggerProvider;

    public RegenoldModule_ProvidesRegenoldInteractionListenerFactory(RegenoldModule regenoldModule, Provider<RegenoldLogger> provider) {
        this.module = regenoldModule;
        this.regenoldLoggerProvider = provider;
    }

    @Override // javax.inject.Provider
    public RegenoldFragment.RegenoldInteractionListener get() {
        return providesRegenoldInteractionListener(this.module, this.regenoldLoggerProvider.get());
    }

    public static RegenoldModule_ProvidesRegenoldInteractionListenerFactory create(RegenoldModule regenoldModule, Provider<RegenoldLogger> provider) {
        return new RegenoldModule_ProvidesRegenoldInteractionListenerFactory(regenoldModule, provider);
    }

    public static RegenoldFragment.RegenoldInteractionListener providesRegenoldInteractionListener(RegenoldModule regenoldModule, RegenoldLogger regenoldLogger) {
        return (RegenoldFragment.RegenoldInteractionListener) Preconditions.checkNotNullFromProvides(regenoldModule.providesRegenoldInteractionListener(regenoldLogger));
    }
}
