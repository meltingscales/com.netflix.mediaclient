package com.netflix.mediaclient.acquisition.components.regenold;

import com.netflix.mediaclient.acquisition.components.regenold.RegenoldFragment;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import o.C8632dsu;

@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes3.dex */
public final class RegenoldModule {
    public static final int $stable = 0;

    @Provides
    public final RegenoldFragment.RegenoldInteractionListener providesRegenoldInteractionListener(RegenoldLogger regenoldLogger) {
        C8632dsu.c((Object) regenoldLogger, "");
        return regenoldLogger;
    }
}
