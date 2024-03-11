package com.netflix.mediaclient.acquisition.components.faq;

import com.netflix.mediaclient.acquisition.components.faq.FaqFragment;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import o.C8632dsu;

@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes3.dex */
public final class FaqModule {
    public static final int $stable = 0;

    @Provides
    public final FaqFragment.FaqInteractionListener providesFaqInteractionListener(FaqLogger faqLogger) {
        C8632dsu.c((Object) faqLogger, "");
        return faqLogger;
    }
}
