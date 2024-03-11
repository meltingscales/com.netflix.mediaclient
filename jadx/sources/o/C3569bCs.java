package o;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import o.C3571bCu;
import o.C8632dsu;
import o.dpR;

/* renamed from: o.bCs  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3569bCs {
    public static final C3569bCs e = new C3569bCs();
    public static InterfaceC8612dsa<BoxScope, Composer, Integer, dpR> a = ComposableLambdaKt.composableLambdaInstance(1438768914, false, new InterfaceC8612dsa<BoxScope, Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.menu.ComposableSingletons$MenuGridKt$lambda-1$1
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
                ComposerKt.traceEventStart(1438768914, i, -1, "com.netflix.mediaclient.ui.commander.impl.ui.menu.ComposableSingletons$MenuGridKt.lambda-1.<anonymous> (MenuGrid.kt:57)");
            }
            C3571bCu.c(boxScope.matchParentSize(Modifier.Companion), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    public static InterfaceC8613dsb<BoxScope, Throwable, Composer, Integer, dpR> c = ComposableLambdaKt.composableLambdaInstance(460107643, false, new InterfaceC8613dsb<BoxScope, Throwable, Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.menu.ComposableSingletons$MenuGridKt$lambda-2$1
        @Override // o.InterfaceC8613dsb
        public /* synthetic */ dpR invoke(BoxScope boxScope, Throwable th, Composer composer, Integer num) {
            c(boxScope, th, composer, num.intValue());
            return dpR.c;
        }

        public final void c(BoxScope boxScope, Throwable th, Composer composer, int i) {
            C8632dsu.c((Object) boxScope, "");
            C8632dsu.c((Object) th, "");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(460107643, i, -1, "com.netflix.mediaclient.ui.commander.impl.ui.menu.ComposableSingletons$MenuGridKt.lambda-2.<anonymous> (MenuGrid.kt:60)");
            }
            C3571bCu.c(boxScope.matchParentSize(Modifier.Companion), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final InterfaceC8613dsb<BoxScope, Throwable, Composer, Integer, dpR> d() {
        return c;
    }

    public final InterfaceC8612dsa<BoxScope, Composer, Integer, dpR> e() {
        return a;
    }
}
