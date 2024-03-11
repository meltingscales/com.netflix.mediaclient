package com.netflix.mediaclient.acquisition.screens.verifyCardContext;

import com.netflix.mediaclient.acquisition.screens.verifyCardContext.VerifyCardContextFragment;
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
public final class VerifyCardContextModule_VerifyCardContextEventListenerFactory implements Factory<VerifyCardContextFragment.EventListener> {
    private final Provider<VerifyCardContextEventLogger> eventLoggerProvider;
    private final VerifyCardContextModule module;

    public VerifyCardContextModule_VerifyCardContextEventListenerFactory(VerifyCardContextModule verifyCardContextModule, Provider<VerifyCardContextEventLogger> provider) {
        this.module = verifyCardContextModule;
        this.eventLoggerProvider = provider;
    }

    @Override // javax.inject.Provider
    public VerifyCardContextFragment.EventListener get() {
        return verifyCardContextEventListener(this.module, this.eventLoggerProvider.get());
    }

    public static VerifyCardContextModule_VerifyCardContextEventListenerFactory create(VerifyCardContextModule verifyCardContextModule, Provider<VerifyCardContextEventLogger> provider) {
        return new VerifyCardContextModule_VerifyCardContextEventListenerFactory(verifyCardContextModule, provider);
    }

    public static VerifyCardContextFragment.EventListener verifyCardContextEventListener(VerifyCardContextModule verifyCardContextModule, VerifyCardContextEventLogger verifyCardContextEventLogger) {
        return (VerifyCardContextFragment.EventListener) Preconditions.checkNotNullFromProvides(verifyCardContextModule.verifyCardContextEventListener(verifyCardContextEventLogger));
    }
}
