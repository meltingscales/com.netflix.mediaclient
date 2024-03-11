package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.List;
import java.util.Map;
import o.InterfaceC8466dmq;

/* renamed from: o.dmw  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8472dmw {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <R extends InterfaceC8466dmq.a> duU<R, dmD> a(InterfaceC8466dmq<R> interfaceC8466dmq, duS<? extends InterfaceC8470dmu<? super R>> dus, boolean z, Composer composer, int i, int i2) {
        Map b;
        Map h;
        List e;
        List o2;
        C8632dsu.c((Object) interfaceC8466dmq, "");
        composer.startReplaceableGroup(1392546107);
        if ((i2 & 2) != 0) {
            dus = duO.e();
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1392546107, i, -1, "com.slack.circuit.backstack.providedValuesForBackStack (BackStackRecordLocalProvider.kt:47)");
        }
        b = dqD.b(interfaceC8466dmq.c());
        for (R r : interfaceC8466dmq) {
            composer.startMovableGroup(-739967763, r);
            e = C8566dqi.e(dus.size() + 1);
            if (z) {
                for (InterfaceC8470dmu interfaceC8470dmu : (Iterable) composer.consume(C8474dmy.d())) {
                    composer.startMovableGroup(-1045707804, interfaceC8470dmu);
                    dmD d = interfaceC8470dmu.d(r, composer, 0);
                    composer.endMovableGroup();
                    e.add(d);
                }
            }
            for (InterfaceC8470dmu<? super R> interfaceC8470dmu2 : dus) {
                composer.startMovableGroup(-1045707674, interfaceC8470dmu2);
                dmD d2 = interfaceC8470dmu2.d(r, composer, 0);
                composer.endMovableGroup();
                e.add(d2);
            }
            dpR dpr = dpR.c;
            o2 = C8566dqi.o(e);
            b.put(r, new C8473dmx(o2));
            composer.endMovableGroup();
        }
        h = dqD.h(b);
        duU<R, dmD> e2 = duO.e(h);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return e2;
    }
}
