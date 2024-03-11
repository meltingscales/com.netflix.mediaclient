package com.netflix.mediaclient.acquisition.screens.passwordOnly;

import com.netflix.mediaclient.acquisition.screens.passwordOnly.PasswordOnlyFragment;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import o.C8632dsu;

@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes3.dex */
public final class PasswordOnlyModule {
    public static final int $stable = 0;

    @Provides
    public final PasswordOnlyFragment.PasswordOnlyInteractionListener providesPasswordOnlyInteractionListener(PasswordOnlyLogger passwordOnlyLogger) {
        C8632dsu.c((Object) passwordOnlyLogger, "");
        return passwordOnlyLogger;
    }
}
