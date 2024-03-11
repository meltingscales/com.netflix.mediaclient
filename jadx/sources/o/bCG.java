package o;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import o.C3564bCn;
import o.C8632dsu;
import o.dpR;

/* loaded from: classes4.dex */
public final class bCG {
    public static final bCG b = new bCG();
    public static InterfaceC8612dsa<BoxScope, Composer, Integer, dpR> e = ComposableLambdaKt.composableLambdaInstance(-1855582937, false, new InterfaceC8612dsa<BoxScope, Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.ComposableSingletons$EpisodeImageContainerKt$lambda-1$1
        @Override // o.InterfaceC8612dsa
        public /* synthetic */ dpR invoke(BoxScope boxScope, Composer composer, Integer num) {
            a(boxScope, composer, num.intValue());
            return dpR.c;
        }

        public final void a(BoxScope boxScope, Composer composer, int i) {
            C8632dsu.c((Object) boxScope, "");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1855582937, i, -1, "com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.ComposableSingletons$EpisodeImageContainerKt.lambda-1.<anonymous> (EpisodeImageContainer.kt:63)");
            }
            C3564bCn.a(1.77f, null, composer, 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    public static InterfaceC8613dsb<BoxScope, Throwable, Composer, Integer, dpR> a = ComposableLambdaKt.composableLambdaInstance(-1306318128, false, new InterfaceC8613dsb<BoxScope, Throwable, Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.ComposableSingletons$EpisodeImageContainerKt$lambda-2$1
        @Override // o.InterfaceC8613dsb
        public /* synthetic */ dpR invoke(BoxScope boxScope, Throwable th, Composer composer, Integer num) {
            d(boxScope, th, composer, num.intValue());
            return dpR.c;
        }

        public final void d(BoxScope boxScope, Throwable th, Composer composer, int i) {
            C8632dsu.c((Object) boxScope, "");
            C8632dsu.c((Object) th, "");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1306318128, i, -1, "com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.ComposableSingletons$EpisodeImageContainerKt.lambda-2.<anonymous> (EpisodeImageContainer.kt:66)");
            }
            C3564bCn.a(1.77f, null, composer, 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final InterfaceC8613dsb<BoxScope, Throwable, Composer, Integer, dpR> a() {
        return a;
    }

    public final InterfaceC8612dsa<BoxScope, Composer, Integer, dpR> b() {
        return e;
    }
}
