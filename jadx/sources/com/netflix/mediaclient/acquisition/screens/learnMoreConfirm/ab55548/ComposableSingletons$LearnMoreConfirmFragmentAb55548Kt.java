package com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab55548;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import o.KM;
import o.dpR;
import o.drX;

/* loaded from: classes3.dex */
public final class ComposableSingletons$LearnMoreConfirmFragmentAb55548Kt {
    public static final ComposableSingletons$LearnMoreConfirmFragmentAb55548Kt INSTANCE = new ComposableSingletons$LearnMoreConfirmFragmentAb55548Kt();

    /* renamed from: lambda-1  reason: not valid java name */
    public static drX<Composer, Integer, dpR> f27lambda1 = ComposableLambdaKt.composableLambdaInstance(521949795, false, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab55548.ComposableSingletons$LearnMoreConfirmFragmentAb55548Kt$lambda-1$1
        @Override // o.drX
        public /* synthetic */ dpR invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return dpR.c;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(521949795, i, -1, "com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab55548.ComposableSingletons$LearnMoreConfirmFragmentAb55548Kt.lambda-1.<anonymous> (LearnMoreConfirmFragmentAb55548.kt:125)");
                }
                KM.d("https://assets.nflxext.com/ffe/siteui/acquisition/androidSignup/clcs_mobile_gradient_background.webp", null, SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, null, null, null, ContentScale.Companion.getFillBounds(), 0.0f, null, 0, composer, 12583350, 0, 1912);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$NetflixAcquisition_impl_release  reason: not valid java name */
    public final drX<Composer, Integer, dpR> m2877getLambda1$NetflixAcquisition_impl_release() {
        return f27lambda1;
    }
}
