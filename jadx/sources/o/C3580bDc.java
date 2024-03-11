package o;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import o.C3592bDo;
import o.C8632dsu;
import o.dpR;

/* renamed from: o.bDc  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3580bDc {
    public static final C3580bDc c = new C3580bDc();
    public static InterfaceC8612dsa<BoxScope, Composer, Integer, dpR> e = ComposableLambdaKt.composableLambdaInstance(353241850, false, new InterfaceC8612dsa<BoxScope, Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.screens.ComposableSingletons$PairingSheetKt$lambda-1$1
        @Override // o.InterfaceC8612dsa
        public /* synthetic */ dpR invoke(BoxScope boxScope, Composer composer, Integer num) {
            b(boxScope, composer, num.intValue());
            return dpR.c;
        }

        public final void b(BoxScope boxScope, Composer composer, int i) {
            C8632dsu.c((Object) boxScope, "");
            if ((i & 14) == 0) {
                i |= composer.changed(boxScope) ? 4 : 2;
            }
            if ((i & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(353241850, i, -1, "com.netflix.mediaclient.ui.commander.impl.ui.screens.ComposableSingletons$PairingSheetKt.lambda-1.<anonymous> (PairingSheet.kt:154)");
            }
            C3592bDo.e(boxScope.align(Modifier.Companion, Alignment.Companion.getCenter()), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    public static InterfaceC8613dsb<BoxScope, Throwable, Composer, Integer, dpR> b = ComposableLambdaKt.composableLambdaInstance(63340195, false, new InterfaceC8613dsb<BoxScope, Throwable, Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.screens.ComposableSingletons$PairingSheetKt$lambda-2$1
        @Override // o.InterfaceC8613dsb
        public /* synthetic */ dpR invoke(BoxScope boxScope, Throwable th, Composer composer, Integer num) {
            a(boxScope, th, composer, num.intValue());
            return dpR.c;
        }

        public final void a(BoxScope boxScope, Throwable th, Composer composer, int i) {
            C8632dsu.c((Object) boxScope, "");
            C8632dsu.c((Object) th, "");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(63340195, i, -1, "com.netflix.mediaclient.ui.commander.impl.ui.screens.ComposableSingletons$PairingSheetKt.lambda-2.<anonymous> (PairingSheet.kt:157)");
            }
            C3592bDo.e(boxScope.align(Modifier.Companion, Alignment.Companion.getCenter()), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final InterfaceC8613dsb<BoxScope, Throwable, Composer, Integer, dpR> a() {
        return b;
    }

    public final InterfaceC8612dsa<BoxScope, Composer, Integer, dpR> b() {
        return e;
    }
}
