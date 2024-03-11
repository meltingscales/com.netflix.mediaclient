package o;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import java.util.List;
import o.C8569dql;
import o.InterfaceC8466dmq;
import o.InterfaceC8470dmu;
import o.dmB;
import o.dmJ;

/* renamed from: o.dmy  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8474dmy {
    private static final ProvidableCompositionLocal<List<InterfaceC8470dmu<InterfaceC8466dmq.a>>> b = CompositionLocalKt.compositionLocalOf$default(null, new drO<List<? extends InterfaceC8470dmu<? super InterfaceC8466dmq.a>>>() { // from class: com.slack.circuit.backstack.BackStackRecordLocalProvider_androidKt$LocalBackStackRecordLocalProviders$1
        @Override // o.drO
        /* renamed from: a */
        public final List<InterfaceC8470dmu<InterfaceC8466dmq.a>> invoke() {
            List<InterfaceC8470dmu<InterfaceC8466dmq.a>> j;
            j = C8569dql.j(dmB.c, dmJ.a);
            return j;
        }
    }, 1, null);

    public static final ProvidableCompositionLocal<List<InterfaceC8470dmu<InterfaceC8466dmq.a>>> d() {
        return b;
    }
}
