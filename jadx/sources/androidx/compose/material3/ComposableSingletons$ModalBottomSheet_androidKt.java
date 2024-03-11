package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import o.dpR;
import o.drX;

/* loaded from: classes.dex */
public final class ComposableSingletons$ModalBottomSheet_androidKt {
    public static final ComposableSingletons$ModalBottomSheet_androidKt INSTANCE = new ComposableSingletons$ModalBottomSheet_androidKt();

    /* renamed from: lambda-1  reason: not valid java name */
    public static drX<Composer, Integer, dpR> f16lambda1 = ComposableLambdaKt.composableLambdaInstance(-1187811352, false, new drX<Composer, Integer, dpR>() { // from class: androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt$lambda-1$1
        @Override // o.drX
        public /* synthetic */ dpR invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return dpR.c;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1187811352, i, -1, "androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt.lambda-1.<anonymous> (ModalBottomSheet.android.kt:146)");
            }
            BottomSheetDefaults.INSTANCE.m716DragHandlelgZ2HuY(null, 0.0f, 0.0f, null, 0L, composer, 196608, 31);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2  reason: not valid java name */
    public static drX<Composer, Integer, dpR> f17lambda2 = ComposableLambdaKt.composableLambdaInstance(163832305, false, new drX<Composer, Integer, dpR>() { // from class: androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt$lambda-2$1
        @Override // o.drX
        public /* synthetic */ dpR invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return dpR.c;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(163832305, i, -1, "androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt.lambda-2.<anonymous> (ModalBottomSheet.android.kt:556)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$material3_release  reason: not valid java name */
    public final drX<Composer, Integer, dpR> m782getLambda1$material3_release() {
        return f16lambda1;
    }

    /* renamed from: getLambda-2$material3_release  reason: not valid java name */
    public final drX<Composer, Integer, dpR> m783getLambda2$material3_release() {
        return f17lambda2;
    }
}
