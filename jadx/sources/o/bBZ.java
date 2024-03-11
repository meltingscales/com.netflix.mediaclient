package o;

import androidx.compose.runtime.MutableState;

/* loaded from: classes4.dex */
public final class bBZ {
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final com.netflix.mediaclient.ui.commander.impl.ui.menu.NavigationMenuAction r27, final o.drM<? super com.netflix.mediaclient.ui.commander.impl.ui.menu.NavigationMenuAction, o.dpR> r28, androidx.compose.ui.Modifier r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bBZ.d(com.netflix.mediaclient.ui.commander.impl.ui.menu.NavigationMenuAction, o.drM, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0056, code lost:
        if ((r9 & 2) != 0) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final androidx.compose.ui.Modifier r5, final com.netflix.hawkins.consumer.tokens.Theme r6, androidx.compose.runtime.Composer r7, final int r8, final int r9) {
        /*
            r0 = 1257325818(0x4af144fa, float:7905917.0)
            androidx.compose.runtime.Composer r7 = r7.startRestartGroup(r0)
            r1 = r9 & 1
            if (r1 == 0) goto Le
            r2 = r8 | 6
            goto L1e
        Le:
            r2 = r8 & 14
            if (r2 != 0) goto L1d
            boolean r2 = r7.changed(r5)
            if (r2 == 0) goto L1a
            r2 = 4
            goto L1b
        L1a:
            r2 = 2
        L1b:
            r2 = r2 | r8
            goto L1e
        L1d:
            r2 = r8
        L1e:
            r3 = r8 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L32
            r3 = r9 & 2
            if (r3 != 0) goto L2f
            boolean r3 = r7.changed(r6)
            if (r3 == 0) goto L2f
            r3 = 32
            goto L31
        L2f:
            r3 = 16
        L31:
            r2 = r2 | r3
        L32:
            r3 = r2 & 91
            r4 = 18
            if (r3 != r4) goto L43
            boolean r3 = r7.getSkipping()
            if (r3 != 0) goto L3f
            goto L43
        L3f:
            r7.skipToGroupEnd()
            goto La9
        L43:
            r7.startDefaults()
            r3 = r8 & 1
            if (r3 == 0) goto L59
            boolean r3 = r7.getDefaultsInvalid()
            if (r3 == 0) goto L51
            goto L59
        L51:
            r7.skipToGroupEnd()
            r1 = r9 & 2
            if (r1 == 0) goto L6d
            goto L6b
        L59:
            if (r1 == 0) goto L5d
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.Companion
        L5d:
            r1 = r9 & 2
            if (r1 == 0) goto L6d
            androidx.compose.runtime.ProvidableCompositionLocal r6 = o.LC.e()
            java.lang.Object r6 = r7.consume(r6)
            com.netflix.hawkins.consumer.tokens.Theme r6 = (com.netflix.hawkins.consumer.tokens.Theme) r6
        L6b:
            r2 = r2 & (-113(0xffffffffffffff8f, float:NaN))
        L6d:
            r7.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L7c
            r1 = -1
            java.lang.String r3 = "com.netflix.mediaclient.ui.commander.impl.ui.buttons.OuterBackground (NeumorphicNavigationButton.kt:135)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r2, r1, r3)
        L7c:
            r0 = 0
            r1 = 0
            r2 = 1
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(r5, r0, r2, r1)
            r1 = 10
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m2492constructorimpl(r1)
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.PaddingKt.m273padding3ABfNKs(r0, r1)
            com.netflix.hawkins.consumer.tokens.Token$Color$ho r1 = com.netflix.hawkins.consumer.tokens.Token.Color.C0615ho.b
            long r1 = o.LA.d(r1, r6)
            androidx.compose.foundation.shape.RoundedCornerShape r3 = androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape()
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.BackgroundKt.m109backgroundbw27NRU(r0, r1, r3)
            r1 = 0
            androidx.compose.foundation.layout.BoxKt.Box(r0, r7, r1)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto La9
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        La9:
            androidx.compose.runtime.ScopeUpdateScope r7 = r7.endRestartGroup()
            if (r7 == 0) goto Lb7
            com.netflix.mediaclient.ui.commander.impl.ui.buttons.NeumorphicNavigationButtonKt$OuterBackground$1 r0 = new com.netflix.mediaclient.ui.commander.impl.ui.buttons.NeumorphicNavigationButtonKt$OuterBackground$1
            r0.<init>()
            r7.updateScope(r0)
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bBZ.b(androidx.compose.ui.Modifier, com.netflix.hawkins.consumer.tokens.Theme, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0087, code lost:
        if ((r14 & 8) != 0) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final float r8, final boolean r9, androidx.compose.ui.Modifier r10, com.netflix.hawkins.consumer.tokens.Theme r11, androidx.compose.runtime.Composer r12, final int r13, final int r14) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bBZ.c(float, boolean, androidx.compose.ui.Modifier, com.netflix.hawkins.consumer.tokens.Theme, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }
}
