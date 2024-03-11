package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import o.C3561bCk;
import o.dpR;

/* renamed from: o.bDf  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3583bDf {
    public static final C3583bDf a = new C3583bDf();
    public static drX<Composer, Integer, dpR> b = ComposableLambdaKt.composableLambdaInstance(-413024894, false, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.screens.ComposableSingletons$FeatureEducationSheetKt$lambda-1$1
        @Override // o.drX
        public /* synthetic */ dpR invoke(Composer composer, Integer num) {
            c(composer, num.intValue());
            return dpR.c;
        }

        public final void c(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-413024894, i, -1, "com.netflix.mediaclient.ui.commander.impl.ui.screens.ComposableSingletons$FeatureEducationSheetKt.lambda-1.<anonymous> (FeatureEducationSheet.kt:158)");
            }
            C3561bCk.b(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final drX<Composer, Integer, dpR> e() {
        return b;
    }
}
