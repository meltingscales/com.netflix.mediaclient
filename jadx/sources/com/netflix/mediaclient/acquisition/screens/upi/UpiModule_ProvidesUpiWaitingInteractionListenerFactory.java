package com.netflix.mediaclient.acquisition.screens.upi;

import com.netflix.mediaclient.acquisition.screens.upi.UpiWaitingFragment;
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
public final class UpiModule_ProvidesUpiWaitingInteractionListenerFactory implements Factory<UpiWaitingFragment.InteractionListener> {
    private final UpiModule module;
    private final Provider<UpiWaitingLogger> upiWaitingLoggerProvider;

    public UpiModule_ProvidesUpiWaitingInteractionListenerFactory(UpiModule upiModule, Provider<UpiWaitingLogger> provider) {
        this.module = upiModule;
        this.upiWaitingLoggerProvider = provider;
    }

    @Override // javax.inject.Provider
    public UpiWaitingFragment.InteractionListener get() {
        return providesUpiWaitingInteractionListener(this.module, this.upiWaitingLoggerProvider.get());
    }

    public static UpiModule_ProvidesUpiWaitingInteractionListenerFactory create(UpiModule upiModule, Provider<UpiWaitingLogger> provider) {
        return new UpiModule_ProvidesUpiWaitingInteractionListenerFactory(upiModule, provider);
    }

    public static UpiWaitingFragment.InteractionListener providesUpiWaitingInteractionListener(UpiModule upiModule, UpiWaitingLogger upiWaitingLogger) {
        return (UpiWaitingFragment.InteractionListener) Preconditions.checkNotNullFromProvides(upiModule.providesUpiWaitingInteractionListener(upiWaitingLogger));
    }
}
