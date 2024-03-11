package o;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import o.C8632dsu;
import o.PT;
import o.dpR;

/* renamed from: o.Pz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1134Pz {
    public static final C1134Pz d = new C1134Pz();
    public static InterfaceC8612dsa<BoxScope, Composer, Integer, dpR> a = ComposableLambdaKt.composableLambdaInstance(259256242, false, new InterfaceC8612dsa<BoxScope, Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.android.sharing.impl.ComposableSingletons$ShareSheetContentPreviewRowKt$lambda-1$1
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
                ComposerKt.traceEventStart(259256242, i, -1, "com.netflix.mediaclient.android.sharing.impl.ComposableSingletons$ShareSheetContentPreviewRowKt.lambda-1.<anonymous> (ShareSheetContentPreviewRow.kt:68)");
            }
            PT.d(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final InterfaceC8612dsa<BoxScope, Composer, Integer, dpR> a() {
        return a;
    }
}
