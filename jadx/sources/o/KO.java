package o;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import o.C8632dsu;
import o.dpR;

/* loaded from: classes3.dex */
public final class KO {
    public static final KO e = new KO();
    public static InterfaceC8612dsa<BoxScope, Composer, Integer, dpR> b = ComposableLambdaKt.composableLambdaInstance(-2075389470, false, new InterfaceC8612dsa<BoxScope, Composer, Integer, dpR>() { // from class: com.netflix.hawkins.consumer.component.image.ComposableSingletons$HawkinsImageKt$lambda-1$1
        public final void a(BoxScope boxScope, Composer composer, int i) {
            C8632dsu.c((Object) boxScope, "");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2075389470, i, -1, "com.netflix.hawkins.consumer.component.image.ComposableSingletons$HawkinsImageKt.lambda-1.<anonymous> (HawkinsImage.kt:84)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // o.InterfaceC8612dsa
        public /* synthetic */ dpR invoke(BoxScope boxScope, Composer composer, Integer num) {
            a(boxScope, composer, num.intValue());
            return dpR.c;
        }
    });
    public static InterfaceC8613dsb<BoxScope, Throwable, Composer, Integer, dpR> d = ComposableLambdaKt.composableLambdaInstance(1619442264, false, new InterfaceC8613dsb<BoxScope, Throwable, Composer, Integer, dpR>() { // from class: com.netflix.hawkins.consumer.component.image.ComposableSingletons$HawkinsImageKt$lambda-2$1
        public final void c(BoxScope boxScope, Throwable th, Composer composer, int i) {
            C8632dsu.c((Object) boxScope, "");
            C8632dsu.c((Object) th, "");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1619442264, i, -1, "com.netflix.hawkins.consumer.component.image.ComposableSingletons$HawkinsImageKt.lambda-2.<anonymous> (HawkinsImage.kt:85)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // o.InterfaceC8613dsb
        public /* synthetic */ dpR invoke(BoxScope boxScope, Throwable th, Composer composer, Integer num) {
            c(boxScope, th, composer, num.intValue());
            return dpR.c;
        }
    });

    public final InterfaceC8612dsa<BoxScope, Composer, Integer, dpR> c() {
        return b;
    }

    public final InterfaceC8613dsb<BoxScope, Throwable, Composer, Integer, dpR> d() {
        return d;
    }
}
