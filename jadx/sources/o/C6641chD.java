package o;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.style.TextAlign;
import o.C8632dsu;
import o.dpR;

/* renamed from: o.chD  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6641chD {
    public static final C6641chD c = new C6641chD();
    public static InterfaceC8612dsa<RowScope, Composer, Integer, dpR> b = ComposableLambdaKt.composableLambdaInstance(-19708384, false, new InterfaceC8612dsa<RowScope, Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.messaging.impl.example.ComposableSingletons$ExampleMessagingComposeScreenKt$lambda-1$1
        @Override // o.InterfaceC8612dsa
        public /* synthetic */ dpR invoke(RowScope rowScope, Composer composer, Integer num) {
            c(rowScope, composer, num.intValue());
            return dpR.c;
        }

        public final void c(RowScope rowScope, Composer composer, int i) {
            C8632dsu.c((Object) rowScope, "");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-19708384, i, -1, "com.netflix.mediaclient.ui.messaging.impl.example.ComposableSingletons$ExampleMessagingComposeScreenKt.lambda-1.<anonymous> (ExampleMessagingComposeScreen.kt:94)");
                }
                TextKt.m696Text4IGK_g("OK", null, Color.Companion.m1310getWhite0d7_KjU(), 0L, null, null, null, 0L, null, TextAlign.m2410boximpl(TextAlign.Companion.m2417getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, composer, 390, 0, 130554);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    public final InterfaceC8612dsa<RowScope, Composer, Integer, dpR> b() {
        return b;
    }
}
