package com.netflix.mediaclient.acquisition.screens.verifyCard;

import com.netflix.mediaclient.acquisition.screens.verifyCard.VerifyCardFragment;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import o.C8632dsu;

@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes3.dex */
public final class VerifyCardModule {
    public static final int $stable = 0;

    @Provides
    public final VerifyCardFragment.VerifyCard3dsEventListener providesThreeDsEventListener(VerifyCard3dsEventLogger verifyCard3dsEventLogger) {
        C8632dsu.c((Object) verifyCard3dsEventLogger, "");
        return verifyCard3dsEventLogger;
    }
}
