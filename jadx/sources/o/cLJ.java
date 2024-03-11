package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import o.dpR;

/* loaded from: classes4.dex */
public final class cLJ {
    public static final cLJ b = new cLJ();
    public static drX<Composer, Integer, dpR> c = ComposableLambdaKt.composableLambdaInstance(-1898799976, false, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.ComposableSingletons$SwitchProfileSheetKt$lambda-1$1
        public final void c(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1898799976, i, -1, "com.netflix.mediaclient.ui.profiles.ComposableSingletons$SwitchProfileSheetKt.lambda-1.<anonymous> (SwitchProfileSheet.kt:123)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // o.drX
        public /* synthetic */ dpR invoke(Composer composer, Integer num) {
            c(composer, num.intValue());
            return dpR.c;
        }
    });

    public final drX<Composer, Integer, dpR> a() {
        return c;
    }
}
