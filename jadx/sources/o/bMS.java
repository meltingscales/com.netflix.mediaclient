package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import o.bMU;
import o.dpR;

/* loaded from: classes4.dex */
public final class bMS implements bMT {
    public static final e c = new e(null);

    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("FeatureEducationVideoExperienceImpl");
        }
    }

    @Override // o.bMT
    public drX<Composer, Integer, dpR> a(final long j, final String str, final drX<? super Composer, ? super Integer, dpR> drx, Composer composer, int i) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) drx, "");
        composer.startReplaceableGroup(670837607);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(670837607, i, -1, "com.netflix.mediaclient.ui.featureeducationvideoexperience.impl.FeatureEducationVideoExperienceImpl.getFeatureEducationVideo (FeatureEducationVideoExperienceImpl.kt:19)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, 1415727236, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.featureeducationvideoexperience.impl.FeatureEducationVideoExperienceImpl$getFeatureEducationVideo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                a(composer2, num.intValue());
                return dpR.c;
            }

            public final void a(Composer composer2, int i2) {
                if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1415727236, i2, -1, "com.netflix.mediaclient.ui.featureeducationvideoexperience.impl.FeatureEducationVideoExperienceImpl.getFeatureEducationVideo.<anonymous> (FeatureEducationVideoExperienceImpl.kt:20)");
                    }
                    bMU.b(j, str, drx, null, composer2, 0, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        });
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }
}
