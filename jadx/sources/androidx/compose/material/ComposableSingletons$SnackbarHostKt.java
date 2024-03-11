package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import o.InterfaceC8612dsa;
import o.dpR;

/* loaded from: classes5.dex */
public final class ComposableSingletons$SnackbarHostKt {
    public static final ComposableSingletons$SnackbarHostKt INSTANCE = new ComposableSingletons$SnackbarHostKt();

    /* renamed from: lambda-1  reason: not valid java name */
    public static InterfaceC8612dsa<SnackbarData, Composer, Integer, dpR> f13lambda1 = ComposableLambdaKt.composableLambdaInstance(996639038, false, new InterfaceC8612dsa<SnackbarData, Composer, Integer, dpR>() { // from class: androidx.compose.material.ComposableSingletons$SnackbarHostKt$lambda-1$1
        @Override // o.InterfaceC8612dsa
        public /* synthetic */ dpR invoke(SnackbarData snackbarData, Composer composer, Integer num) {
            invoke(snackbarData, composer, num.intValue());
            return dpR.c;
        }

        public final void invoke(SnackbarData snackbarData, Composer composer, int i) {
            int i2;
            if ((i & 14) == 0) {
                i2 = i | (composer.changed(snackbarData) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(996639038, i2, -1, "androidx.compose.material.ComposableSingletons$SnackbarHostKt.lambda-1.<anonymous> (SnackbarHost.kt:156)");
            }
            SnackbarKt.m643SnackbarsPrSdHI(snackbarData, null, false, null, 0L, 0L, 0L, 0.0f, composer, i2 & 14, 254);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$material_release  reason: not valid java name */
    public final InterfaceC8612dsa<SnackbarData, Composer, Integer, dpR> m582getLambda1$material_release() {
        return f13lambda1;
    }
}
