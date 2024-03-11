package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import o.C3872bNu;
import o.dpR;

/* renamed from: o.bNi  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3860bNi {
    public static final C3860bNi e = new C3860bNi();
    public static drX<Composer, Integer, dpR> c = ComposableLambdaKt.composableLambdaInstance(1139574324, false, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.gamecontrollermagicpath.impl.ComposableSingletons$MagicPathFragmentKt$lambda-1$1
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
                ComposerKt.traceEventStart(1139574324, i, -1, "com.netflix.mediaclient.ui.gamecontrollermagicpath.impl.ComposableSingletons$MagicPathFragmentKt.lambda-1.<anonymous> (MagicPathFragment.kt:44)");
            }
            C3872bNu.c(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final drX<Composer, Integer, dpR> b() {
        return c;
    }
}
