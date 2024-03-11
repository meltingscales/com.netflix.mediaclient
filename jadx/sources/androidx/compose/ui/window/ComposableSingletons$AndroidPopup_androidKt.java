package androidx.compose.ui.window;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import o.dpR;
import o.drX;

/* loaded from: classes.dex */
public final class ComposableSingletons$AndroidPopup_androidKt {
    public static final ComposableSingletons$AndroidPopup_androidKt INSTANCE = new ComposableSingletons$AndroidPopup_androidKt();

    /* renamed from: lambda-1  reason: not valid java name */
    public static drX<Composer, Integer, dpR> f24lambda1 = ComposableLambdaKt.composableLambdaInstance(-1131826196, false, new drX<Composer, Integer, dpR>() { // from class: androidx.compose.ui.window.ComposableSingletons$AndroidPopup_androidKt$lambda-1$1
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
                ComposerKt.traceEventStart(-1131826196, i, -1, "androidx.compose.ui.window.ComposableSingletons$AndroidPopup_androidKt.lambda-1.<anonymous> (AndroidPopup.android.kt:458)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$ui_release  reason: not valid java name */
    public final drX<Composer, Integer, dpR> m2599getLambda1$ui_release() {
        return f24lambda1;
    }
}
