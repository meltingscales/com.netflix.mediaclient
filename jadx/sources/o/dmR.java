package o;

/* loaded from: classes5.dex */
public final class dmR {
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0075, code lost:
        if ((r12 & 2) != 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final androidx.compose.ui.Modifier r7, final o.dmW r8, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r9, androidx.compose.runtime.Composer r10, final int r11, final int r12) {
        /*
            java.lang.String r0 = ""
            o.C8632dsu.c(r9, r0)
            r0 = -117000047(0xfffffffff906b891, float:-4.371945E34)
            androidx.compose.runtime.Composer r10 = r10.startRestartGroup(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L13
            r2 = r11 | 6
            goto L23
        L13:
            r2 = r11 & 14
            if (r2 != 0) goto L22
            boolean r2 = r10.changed(r7)
            if (r2 == 0) goto L1f
            r2 = 4
            goto L20
        L1f:
            r2 = 2
        L20:
            r2 = r2 | r11
            goto L23
        L22:
            r2 = r11
        L23:
            r3 = r11 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L37
            r3 = r12 & 2
            if (r3 != 0) goto L34
            boolean r3 = r10.changed(r8)
            if (r3 == 0) goto L34
            r3 = 32
            goto L36
        L34:
            r3 = 16
        L36:
            r2 = r2 | r3
        L37:
            r3 = r12 & 4
            if (r3 == 0) goto L3e
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L4e
        L3e:
            r3 = r11 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L4e
            boolean r3 = r10.changedInstance(r9)
            if (r3 == 0) goto L4b
            r3 = 256(0x100, float:3.59E-43)
            goto L4d
        L4b:
            r3 = 128(0x80, float:1.794E-43)
        L4d:
            r2 = r2 | r3
        L4e:
            r3 = r2 & 731(0x2db, float:1.024E-42)
            r4 = 146(0x92, float:2.05E-43)
            if (r3 != r4) goto L61
            boolean r3 = r10.getSkipping()
            if (r3 != 0) goto L5b
            goto L61
        L5b:
            r10.skipToGroupEnd()
        L5e:
            r2 = r7
            r3 = r8
            goto Lbd
        L61:
            r10.startDefaults()
            r3 = r11 & 1
            r4 = 0
            if (r3 == 0) goto L78
            boolean r3 = r10.getDefaultsInvalid()
            if (r3 == 0) goto L70
            goto L78
        L70:
            r10.skipToGroupEnd()
            r1 = r12 & 2
            if (r1 == 0) goto L86
            goto L84
        L78:
            if (r1 == 0) goto L7c
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.ui.Modifier.Companion
        L7c:
            r1 = r12 & 2
            if (r1 == 0) goto L86
            o.dmW r8 = o.dmZ.d(r10, r4)
        L84:
            r2 = r2 & (-113(0xffffffffffffff8f, float:NaN))
        L86:
            r10.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L95
            r1 = -1
            java.lang.String r3 = "com.slack.circuit.overlay.ContentWithOverlays (ContentWithOverlays.kt:25)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r2, r1, r3)
        L95:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = o.dmZ.c()
            androidx.compose.runtime.ProvidedValue r0 = r0.provides(r8)
            r1 = 1
            androidx.compose.runtime.ProvidedValue[] r2 = new androidx.compose.runtime.ProvidedValue[r1]
            r2[r4] = r0
            com.slack.circuit.overlay.ContentWithOverlaysKt$ContentWithOverlays$1 r0 = new com.slack.circuit.overlay.ContentWithOverlaysKt$ContentWithOverlays$1
            r0.<init>()
            r3 = 1215302993(0x48700d51, float:245813.27)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r10, r3, r1, r0)
            r1 = 56
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(r2, r0, r10, r1)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L5e
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            goto L5e
        Lbd:
            androidx.compose.runtime.ScopeUpdateScope r7 = r10.endRestartGroup()
            if (r7 == 0) goto Lcf
            com.slack.circuit.overlay.ContentWithOverlaysKt$ContentWithOverlays$2 r8 = new com.slack.circuit.overlay.ContentWithOverlaysKt$ContentWithOverlays$2
            r1 = r8
            r4 = r9
            r5 = r11
            r6 = r12
            r1.<init>()
            r7.updateScope(r8)
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dmR.c(androidx.compose.ui.Modifier, o.dmW, o.drX, androidx.compose.runtime.Composer, int, int):void");
    }
}
