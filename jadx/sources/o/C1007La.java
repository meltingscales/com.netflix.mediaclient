package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import o.dpR;

/* renamed from: o.La  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1007La {
    public static final C1007La b = new C1007La();
    public static drX<Composer, Integer, dpR> e = ComposableLambdaKt.composableLambdaInstance(987678946, false, new drX<Composer, Integer, dpR>() { // from class: com.netflix.hawkins.consumer.component.sheet.ComposableSingletons$HawkinsSheetKt$lambda-1$1
        public final void a(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(987678946, i, -1, "com.netflix.hawkins.consumer.component.sheet.ComposableSingletons$HawkinsSheetKt.lambda-1.<anonymous> (HawkinsSheet.kt:57)");
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

    public final drX<Composer, Integer, dpR> d() {
        return e;
    }
}
