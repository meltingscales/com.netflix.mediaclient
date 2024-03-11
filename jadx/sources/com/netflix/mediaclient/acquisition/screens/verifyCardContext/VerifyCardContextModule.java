package com.netflix.mediaclient.acquisition.screens.verifyCardContext;

import android.app.Activity;
import com.netflix.mediaclient.acquisition.screens.verifyCardContext.VerifyCardContextFragment;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import o.C8632dsu;

@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes3.dex */
public final class VerifyCardContextModule {
    public static final int $stable = 0;

    @Provides
    public final VerifyCardContextFragment.EventListener verifyCardContextEventListener(VerifyCardContextEventLogger verifyCardContextEventLogger) {
        C8632dsu.c((Object) verifyCardContextEventLogger, "");
        return verifyCardContextEventLogger;
    }

    @Provides
    public final VerifyCardContextFragment.VerifyCardContextClickListener verifyCardContextClickListener(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return (VerifyCardContextFragment.VerifyCardContextClickListener) activity;
    }
}
