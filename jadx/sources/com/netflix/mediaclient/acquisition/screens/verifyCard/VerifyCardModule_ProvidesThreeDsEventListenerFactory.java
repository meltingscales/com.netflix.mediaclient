package com.netflix.mediaclient.acquisition.screens.verifyCard;

import com.netflix.mediaclient.acquisition.screens.verifyCard.VerifyCardFragment;
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
public final class VerifyCardModule_ProvidesThreeDsEventListenerFactory implements Factory<VerifyCardFragment.VerifyCard3dsEventListener> {
    private final VerifyCardModule module;
    private final Provider<VerifyCard3dsEventLogger> threeDSEventLoggerProvider;

    public VerifyCardModule_ProvidesThreeDsEventListenerFactory(VerifyCardModule verifyCardModule, Provider<VerifyCard3dsEventLogger> provider) {
        this.module = verifyCardModule;
        this.threeDSEventLoggerProvider = provider;
    }

    @Override // javax.inject.Provider
    public VerifyCardFragment.VerifyCard3dsEventListener get() {
        return providesThreeDsEventListener(this.module, this.threeDSEventLoggerProvider.get());
    }

    public static VerifyCardModule_ProvidesThreeDsEventListenerFactory create(VerifyCardModule verifyCardModule, Provider<VerifyCard3dsEventLogger> provider) {
        return new VerifyCardModule_ProvidesThreeDsEventListenerFactory(verifyCardModule, provider);
    }

    public static VerifyCardFragment.VerifyCard3dsEventListener providesThreeDsEventListener(VerifyCardModule verifyCardModule, VerifyCard3dsEventLogger verifyCard3dsEventLogger) {
        return (VerifyCardFragment.VerifyCard3dsEventListener) Preconditions.checkNotNullFromProvides(verifyCardModule.providesThreeDsEventListener(verifyCard3dsEventLogger));
    }
}
