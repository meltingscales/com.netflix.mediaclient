package o;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import o.C8495dns;
import o.dmH;

/* loaded from: classes5.dex */
public final class dmG {
    private static final ProvidableCompositionLocal<C8495dns> e = CompositionLocalKt.compositionLocalOf$default(null, new drO<C8495dns>() { // from class: com.slack.circuit.foundation.CircuitCompositionLocalsKt$LocalCircuitContext$1
        @Override // o.drO
        /* renamed from: c */
        public final C8495dns invoke() {
            return null;
        }
    }, 1, null);
    private static final ProvidableCompositionLocal<dmH> d = CompositionLocalKt.staticCompositionLocalOf(new drO<dmH>() { // from class: com.slack.circuit.foundation.CircuitCompositionLocalsKt$LocalCircuit$1
        @Override // o.drO
        /* renamed from: b */
        public final dmH invoke() {
            return null;
        }
    });

    public static final ProvidableCompositionLocal<C8495dns> c() {
        return e;
    }

    public static final ProvidableCompositionLocal<dmH> e() {
        return d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x006a, code lost:
        if (r3 != 0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final o.dmH r7, o.InterfaceC8488dnl r8, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r9, androidx.compose.runtime.Composer r10, final int r11, final int r12) {
        /*
            java.lang.String r0 = ""
            o.C8632dsu.c(r7, r0)
            o.C8632dsu.c(r9, r0)
            r0 = -1569054844(0xffffffffa27a1f84, float:-3.3898002E-18)
            androidx.compose.runtime.Composer r10 = r10.startRestartGroup(r0)
            r1 = r12 & 1
            r2 = 2
            if (r1 == 0) goto L17
            r1 = r11 | 6
            goto L27
        L17:
            r1 = r11 & 14
            if (r1 != 0) goto L26
            boolean r1 = r10.changed(r7)
            if (r1 == 0) goto L23
            r1 = 4
            goto L24
        L23:
            r1 = r2
        L24:
            r1 = r1 | r11
            goto L27
        L26:
            r1 = r11
        L27:
            r3 = r12 & 2
            if (r3 == 0) goto L2d
            r1 = r1 | 16
        L2d:
            r4 = r12 & 4
            if (r4 == 0) goto L34
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L44
        L34:
            r4 = r11 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L44
            boolean r4 = r10.changedInstance(r9)
            if (r4 == 0) goto L41
            r4 = 256(0x100, float:3.59E-43)
            goto L43
        L41:
            r4 = 128(0x80, float:1.794E-43)
        L43:
            r1 = r1 | r4
        L44:
            if (r3 != r2) goto L58
            r4 = r1 & 731(0x2db, float:1.024E-42)
            r5 = 146(0x92, float:2.05E-43)
            if (r4 != r5) goto L58
            boolean r4 = r10.getSkipping()
            if (r4 != 0) goto L53
            goto L58
        L53:
            r10.skipToGroupEnd()
        L56:
            r3 = r8
            goto Lb6
        L58:
            r10.startDefaults()
            r4 = r11 & 1
            r5 = 0
            if (r4 == 0) goto L6d
            boolean r4 = r10.getDefaultsInvalid()
            if (r4 == 0) goto L67
            goto L6d
        L67:
            r10.skipToGroupEnd()
            if (r3 == 0) goto L77
            goto L75
        L6d:
            if (r3 == 0) goto L77
            r8 = 3
            r3 = 0
            o.dnl r8 = o.C8480dnd.a(r3, r3, r10, r5, r8)
        L75:
            r1 = r1 & (-113(0xffffffffffffff8f, float:NaN))
        L77:
            r10.endDefaults()
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L86
            r3 = -1
            java.lang.String r4 = "com.slack.circuit.foundation.CircuitCompositionLocals (CircuitCompositionLocals.kt:24)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r3, r4)
        L86:
            androidx.compose.runtime.ProvidableCompositionLocal<o.dmH> r0 = o.dmG.d
            androidx.compose.runtime.ProvidedValue r0 = r0.provides(r7)
            androidx.compose.runtime.ProvidableCompositionLocal r1 = o.C8492dnp.d()
            androidx.compose.runtime.ProvidedValue r1 = r1.provides(r8)
            androidx.compose.runtime.ProvidedValue[] r2 = new androidx.compose.runtime.ProvidedValue[r2]
            r2[r5] = r0
            r0 = 1
            r2[r0] = r1
            com.slack.circuit.foundation.CircuitCompositionLocalsKt$CircuitCompositionLocals$1 r1 = new com.slack.circuit.foundation.CircuitCompositionLocalsKt$CircuitCompositionLocals$1
            r1.<init>()
            r3 = 2023711812(0x789f6444, float:2.5862776E34)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r10, r3, r0, r1)
            r1 = 56
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(r2, r0, r10, r1)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L56
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            goto L56
        Lb6:
            androidx.compose.runtime.ScopeUpdateScope r8 = r10.endRestartGroup()
            if (r8 == 0) goto Lc9
            com.slack.circuit.foundation.CircuitCompositionLocalsKt$CircuitCompositionLocals$2 r10 = new com.slack.circuit.foundation.CircuitCompositionLocalsKt$CircuitCompositionLocals$2
            r1 = r10
            r2 = r7
            r4 = r9
            r5 = r11
            r6 = r12
            r1.<init>()
            r8.updateScope(r10)
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dmG.b(o.dmH, o.dnl, o.drX, androidx.compose.runtime.Composer, int, int):void");
    }
}
