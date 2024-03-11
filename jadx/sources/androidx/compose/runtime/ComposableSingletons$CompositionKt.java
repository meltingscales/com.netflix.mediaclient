package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import o.dpR;
import o.drX;

/* loaded from: classes.dex */
public final class ComposableSingletons$CompositionKt {
    public static final ComposableSingletons$CompositionKt INSTANCE = new ComposableSingletons$CompositionKt();

    /* renamed from: lambda-1  reason: not valid java name */
    public static drX<Composer, Integer, dpR> f18lambda1 = ComposableLambdaKt.composableLambdaInstance(954879418, false, new drX<Composer, Integer, dpR>() { // from class: androidx.compose.runtime.ComposableSingletons$CompositionKt$lambda-1$1
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
                ComposerKt.traceEventStart(954879418, i, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda-1.<anonymous> (Composition.kt:607)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2  reason: not valid java name */
    public static drX<Composer, Integer, dpR> f19lambda2 = ComposableLambdaKt.composableLambdaInstance(1918065384, false, new drX<Composer, Integer, dpR>() { // from class: androidx.compose.runtime.ComposableSingletons$CompositionKt$lambda-2$1
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
                ComposerKt.traceEventStart(1918065384, i, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda-2.<anonymous> (Composition.kt:739)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$runtime_release  reason: not valid java name */
    public final drX<Composer, Integer, dpR> m991getLambda1$runtime_release() {
        return f18lambda1;
    }

    /* renamed from: getLambda-2$runtime_release  reason: not valid java name */
    public final drX<Composer, Integer, dpR> m992getLambda2$runtime_release() {
        return f19lambda2;
    }
}
