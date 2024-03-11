package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidedValue;
import java.util.List;

/* renamed from: o.dmx  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8473dmx implements dmD {
    private final List<dmD> b;

    /* JADX WARN: Multi-variable type inference failed */
    public C8473dmx(List<? extends dmD> list) {
        C8632dsu.c((Object) list, "");
        this.b = list;
    }

    @Override // o.dmD
    public duS<ProvidedValue<?>> b(Composer composer, int i) {
        List a;
        List o2;
        composer.startReplaceableGroup(-790275016);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-790275016, i, -1, "com.slack.circuit.backstack.CompositeProvidedValues.provideValues (BackStackRecordLocalProvider.kt:38)");
        }
        a = C8566dqi.a();
        for (dmD dmd : this.b) {
            composer.startMovableGroup(-132196424, dmd);
            duS<ProvidedValue<?>> b = dmd.b(composer, 0);
            composer.endMovableGroup();
            a.addAll(b);
        }
        o2 = C8566dqi.o(a);
        duS<ProvidedValue<?>> a2 = duO.a(o2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return a2;
    }
}
