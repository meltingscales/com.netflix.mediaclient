package o;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import o.C8632dsu;
import o.bBZ;
import o.dpR;

/* renamed from: o.bCc  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3553bCc {
    public static final C3553bCc a = new C3553bCc();
    public static InterfaceC8612dsa<BoxScope, Composer, Integer, dpR> e = ComposableLambdaKt.composableLambdaInstance(-830604794, false, new InterfaceC8612dsa<BoxScope, Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.buttons.ComposableSingletons$NeumorphicNavigationButtonKt$lambda-1$1
        @Override // o.InterfaceC8612dsa
        public /* synthetic */ dpR invoke(BoxScope boxScope, Composer composer, Integer num) {
            e(boxScope, composer, num.intValue());
            return dpR.c;
        }

        public final void e(BoxScope boxScope, Composer composer, int i) {
            C8632dsu.c((Object) boxScope, "");
            if ((i & 14) == 0) {
                i |= composer.changed(boxScope) ? 4 : 2;
            }
            if ((i & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-830604794, i, -1, "com.netflix.mediaclient.ui.commander.impl.ui.buttons.ComposableSingletons$NeumorphicNavigationButtonKt.lambda-1.<anonymous> (NeumorphicNavigationButton.kt:88)");
            }
            bBZ.b(boxScope.align(Modifier.Companion, Alignment.Companion.getCenter()), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    public static InterfaceC8613dsb<BoxScope, Throwable, Composer, Integer, dpR> c = ComposableLambdaKt.composableLambdaInstance(-602670161, false, new InterfaceC8613dsb<BoxScope, Throwable, Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.buttons.ComposableSingletons$NeumorphicNavigationButtonKt$lambda-2$1
        @Override // o.InterfaceC8613dsb
        public /* synthetic */ dpR invoke(BoxScope boxScope, Throwable th, Composer composer, Integer num) {
            e(boxScope, th, composer, num.intValue());
            return dpR.c;
        }

        public final void e(BoxScope boxScope, Throwable th, Composer composer, int i) {
            C8632dsu.c((Object) boxScope, "");
            C8632dsu.c((Object) th, "");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-602670161, i, -1, "com.netflix.mediaclient.ui.commander.impl.ui.buttons.ComposableSingletons$NeumorphicNavigationButtonKt.lambda-2.<anonymous> (NeumorphicNavigationButton.kt:91)");
            }
            bBZ.b(boxScope.align(Modifier.Companion, Alignment.Companion.getCenter()), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final InterfaceC8612dsa<BoxScope, Composer, Integer, dpR> a() {
        return e;
    }

    public final InterfaceC8613dsb<BoxScope, Throwable, Composer, Integer, dpR> b() {
        return c;
    }
}
