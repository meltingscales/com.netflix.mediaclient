package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import o.dpR;

/* loaded from: classes4.dex */
public final class bCS {
    public static final bCS c = new bCS();
    public static drX<Composer, Integer, dpR> a = ComposableLambdaKt.composableLambdaInstance(-195123361, false, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.language.ComposableSingletons$AudioSubtitlesSheetKt$lambda-1$1
        public final void e(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-195123361, i, -1, "com.netflix.mediaclient.ui.commander.impl.ui.modes.language.ComposableSingletons$AudioSubtitlesSheetKt.lambda-1.<anonymous> (AudioSubtitlesSheet.kt:198)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // o.drX
        public /* synthetic */ dpR invoke(Composer composer, Integer num) {
            e(composer, num.intValue());
            return dpR.c;
        }
    });

    public final drX<Composer, Integer, dpR> e() {
        return a;
    }
}
