package o;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import o.C6976cnU;
import o.C8632dsu;
import o.InterfaceC9877yK;
import o.dpR;
import o.drO;

/* renamed from: o.cok  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7044cok {
    public static final C7044cok c = new C7044cok();
    public static InterfaceC8613dsb<BoxScope, InterfaceC9877yK, Composer, Integer, dpR> e = ComposableLambdaKt.composableLambdaInstance(-1829033016, false, new InterfaceC8613dsb<BoxScope, InterfaceC9877yK, Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.tab.ComposableSingletons$MyListFragmentTabKt$lambda-1$1
        @Override // o.InterfaceC8613dsb
        public /* synthetic */ dpR invoke(BoxScope boxScope, InterfaceC9877yK interfaceC9877yK, Composer composer, Integer num) {
            c(boxScope, interfaceC9877yK, composer, num.intValue());
            return dpR.c;
        }

        public final void c(BoxScope boxScope, final InterfaceC9877yK interfaceC9877yK, Composer composer, int i) {
            C8632dsu.c((Object) boxScope, "");
            C8632dsu.c((Object) interfaceC9877yK, "");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1829033016, i, -1, "com.netflix.mediaclient.ui.mylist.impl.tab.ComposableSingletons$MyListFragmentTabKt.lambda-1.<anonymous> (MyListFragmentTab.kt:135)");
            }
            C6976cnU.d(boxScope, null, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.tab.ComposableSingletons$MyListFragmentTabKt$lambda-1$1.1
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    b();
                    return dpR.c;
                }

                public final void b() {
                    InterfaceC9877yK.this.e();
                }
            }, composer, i & 14, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final InterfaceC8613dsb<BoxScope, InterfaceC9877yK, Composer, Integer, dpR> a() {
        return e;
    }
}
