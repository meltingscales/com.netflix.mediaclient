package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import o.C8632dsu;
import o.dpR;

/* renamed from: o.Lm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1019Lm {
    public static final C1019Lm e = new C1019Lm();
    public static InterfaceC8612dsa<ConstraintLayoutScope, Composer, Integer, dpR> d = ComposableLambdaKt.composableLambdaInstance(-1207980681, false, new InterfaceC8612dsa<ConstraintLayoutScope, Composer, Integer, dpR>() { // from class: com.netflix.hawkins.consumer.component.toast.ComposableSingletons$HawkinsToastKt$lambda-1$1
        public final void b(ConstraintLayoutScope constraintLayoutScope, Composer composer, int i) {
            C8632dsu.c((Object) constraintLayoutScope, "");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1207980681, i, -1, "com.netflix.hawkins.consumer.component.toast.ComposableSingletons$HawkinsToastKt.lambda-1.<anonymous> (HawkinsToast.kt:51)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // o.InterfaceC8612dsa
        public /* synthetic */ dpR invoke(ConstraintLayoutScope constraintLayoutScope, Composer composer, Integer num) {
            b(constraintLayoutScope, composer, num.intValue());
            return dpR.c;
        }
    });

    public final InterfaceC8612dsa<ConstraintLayoutScope, Composer, Integer, dpR> c() {
        return d;
    }
}
