package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import o.dpR;

/* renamed from: o.bCg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3557bCg {
    public static final C3557bCg b = new C3557bCg();
    public static drX<Composer, Integer, dpR> c = ComposableLambdaKt.composableLambdaInstance(-485345180, false, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.components.ComposableSingletons$PlaybackWithLrudKt$lambda-1$1
        public final void a(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-485345180, i, -1, "com.netflix.mediaclient.ui.commander.impl.ui.components.ComposableSingletons$PlaybackWithLrudKt.lambda-1.<anonymous> (PlaybackWithLrud.kt:85)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // o.drX
        public /* synthetic */ dpR invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return dpR.c;
        }
    });

    public final drX<Composer, Integer, dpR> e() {
        return c;
    }
}
