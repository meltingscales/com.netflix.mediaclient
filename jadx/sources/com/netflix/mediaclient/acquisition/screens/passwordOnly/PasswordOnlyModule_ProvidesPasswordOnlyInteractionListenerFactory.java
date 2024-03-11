package com.netflix.mediaclient.acquisition.screens.passwordOnly;

import com.netflix.mediaclient.acquisition.screens.passwordOnly.PasswordOnlyFragment;
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
public final class PasswordOnlyModule_ProvidesPasswordOnlyInteractionListenerFactory implements Factory<PasswordOnlyFragment.PasswordOnlyInteractionListener> {
    private final PasswordOnlyModule module;
    private final Provider<PasswordOnlyLogger> passwordOnlyLoggerProvider;

    public PasswordOnlyModule_ProvidesPasswordOnlyInteractionListenerFactory(PasswordOnlyModule passwordOnlyModule, Provider<PasswordOnlyLogger> provider) {
        this.module = passwordOnlyModule;
        this.passwordOnlyLoggerProvider = provider;
    }

    @Override // javax.inject.Provider
    public PasswordOnlyFragment.PasswordOnlyInteractionListener get() {
        return providesPasswordOnlyInteractionListener(this.module, this.passwordOnlyLoggerProvider.get());
    }

    public static PasswordOnlyModule_ProvidesPasswordOnlyInteractionListenerFactory create(PasswordOnlyModule passwordOnlyModule, Provider<PasswordOnlyLogger> provider) {
        return new PasswordOnlyModule_ProvidesPasswordOnlyInteractionListenerFactory(passwordOnlyModule, provider);
    }

    public static PasswordOnlyFragment.PasswordOnlyInteractionListener providesPasswordOnlyInteractionListener(PasswordOnlyModule passwordOnlyModule, PasswordOnlyLogger passwordOnlyLogger) {
        return (PasswordOnlyFragment.PasswordOnlyInteractionListener) Preconditions.checkNotNullFromProvides(passwordOnlyModule.providesPasswordOnlyInteractionListener(passwordOnlyLogger));
    }
}
