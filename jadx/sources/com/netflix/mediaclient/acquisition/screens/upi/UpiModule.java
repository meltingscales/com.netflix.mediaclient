package com.netflix.mediaclient.acquisition.screens.upi;

import com.netflix.mediaclient.acquisition.screens.upi.UpiWaitingFragment;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import o.C8632dsu;

@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes3.dex */
public final class UpiModule {
    public static final int $stable = 0;

    @Provides
    public final UpiWaitingFragment.InteractionListener providesUpiWaitingInteractionListener(UpiWaitingLogger upiWaitingLogger) {
        C8632dsu.c((Object) upiWaitingLogger, "");
        return upiWaitingLogger;
    }
}
