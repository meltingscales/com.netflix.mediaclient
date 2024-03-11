package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import o.dpR;

/* loaded from: classes4.dex */
public final class cIO {
    public static final cIO a = new cIO();
    public static drX<Composer, Integer, dpR> b = ComposableLambdaKt.composableLambdaInstance(-577462198, false, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.ComposableSingletons$PlayerTappableContainerKt$lambda-1$1
        public final void b(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-577462198, i, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.components.ComposableSingletons$PlayerTappableContainerKt.lambda-1.<anonymous> (PlayerTappableContainer.kt:154)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // o.drX
        public /* synthetic */ dpR invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return dpR.c;
        }
    });

    public final drX<Composer, Integer, dpR> e() {
        return b;
    }
}
