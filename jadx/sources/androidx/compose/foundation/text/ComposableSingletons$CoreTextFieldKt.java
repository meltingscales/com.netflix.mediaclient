package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drX;

/* loaded from: classes.dex */
public final class ComposableSingletons$CoreTextFieldKt {
    public static final ComposableSingletons$CoreTextFieldKt INSTANCE = new ComposableSingletons$CoreTextFieldKt();

    /* renamed from: lambda-1  reason: not valid java name */
    public static InterfaceC8612dsa<drX<? super Composer, ? super Integer, dpR>, Composer, Integer, dpR> f4lambda1 = ComposableLambdaKt.composableLambdaInstance(671295101, false, new InterfaceC8612dsa<drX<? super Composer, ? super Integer, ? extends dpR>, Composer, Integer, dpR>() { // from class: androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt$lambda-1$1
        @Override // o.InterfaceC8612dsa
        public /* synthetic */ dpR invoke(drX<? super Composer, ? super Integer, ? extends dpR> drx, Composer composer, Integer num) {
            invoke((drX<? super Composer, ? super Integer, dpR>) drx, composer, num.intValue());
            return dpR.c;
        }

        public final void invoke(drX<? super Composer, ? super Integer, dpR> drx, Composer composer, int i) {
            if ((i & 14) == 0) {
                i |= composer.changedInstance(drx) ? 4 : 2;
            }
            if ((i & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(671295101, i, -1, "androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.lambda-1.<anonymous> (CoreTextField.kt:212)");
            }
            drx.invoke(composer, Integer.valueOf(i & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$foundation_release  reason: not valid java name */
    public final InterfaceC8612dsa<drX<? super Composer, ? super Integer, dpR>, Composer, Integer, dpR> m409getLambda1$foundation_release() {
        return f4lambda1;
    }
}
