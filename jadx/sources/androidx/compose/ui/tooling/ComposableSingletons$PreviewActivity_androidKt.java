package androidx.compose.ui.tooling;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import o.dpR;
import o.drX;

/* loaded from: classes5.dex */
public final class ComposableSingletons$PreviewActivity_androidKt {
    public static final ComposableSingletons$PreviewActivity_androidKt INSTANCE = new ComposableSingletons$PreviewActivity_androidKt();

    /* renamed from: lambda-1  reason: not valid java name */
    public static drX<Composer, Integer, dpR> f22lambda1 = ComposableLambdaKt.composableLambdaInstance(-426398407, false, new drX<Composer, Integer, dpR>() { // from class: androidx.compose.ui.tooling.ComposableSingletons$PreviewActivity_androidKt$lambda-1$1
        @Override // o.drX
        public /* synthetic */ dpR invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return dpR.c;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-426398407, i, -1, "androidx.compose.ui.tooling.ComposableSingletons$PreviewActivity_androidKt.lambda-1.<anonymous> (PreviewActivity.android.kt:124)");
            }
            TextKt.m698TextfLXpl1I("Next", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$ui_tooling_release  reason: not valid java name */
    public final drX<Composer, Integer, dpR> m2460getLambda1$ui_tooling_release() {
        return f22lambda1;
    }
}
