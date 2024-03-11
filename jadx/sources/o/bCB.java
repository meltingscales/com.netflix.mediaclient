package o;

/* loaded from: classes4.dex */
public final class bCB {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012e  */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen.c r32, final java.lang.String r33, final java.lang.String r34, final java.lang.String r35, final o.drO<o.dpR> r36, androidx.compose.ui.Modifier r37, com.netflix.hawkins.consumer.tokens.Theme r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 1411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bCB.a(com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen$c, java.lang.String, java.lang.String, java.lang.String, o.drO, androidx.compose.ui.Modifier, com.netflix.hawkins.consumer.tokens.Theme, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
        if (r5 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final boolean r11, final com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen.c r12, androidx.compose.runtime.Composer r13, final int r14) {
        /*
            java.lang.String r0 = ""
            o.C8632dsu.c(r12, r0)
            r0 = -1050202286(0xffffffffc1672f52, float:-14.449053)
            androidx.compose.runtime.Composer r13 = r13.startRestartGroup(r0)
            r1 = r14 & 14
            r2 = 4
            if (r1 != 0) goto L1c
            boolean r1 = r13.changed(r11)
            if (r1 == 0) goto L19
            r1 = r2
            goto L1a
        L19:
            r1 = 2
        L1a:
            r1 = r1 | r14
            goto L1d
        L1c:
            r1 = r14
        L1d:
            r3 = r14 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L2d
            boolean r3 = r13.changed(r12)
            if (r3 == 0) goto L2a
            r3 = 32
            goto L2c
        L2a:
            r3 = 16
        L2c:
            r1 = r1 | r3
        L2d:
            r3 = r1 & 91
            r4 = 18
            if (r3 != r4) goto L3e
            boolean r3 = r13.getSkipping()
            if (r3 != 0) goto L3a
            goto L3e
        L3a:
            r13.skipToGroupEnd()
            goto La4
        L3e:
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L4a
            r3 = -1
            java.lang.String r4 = "com.netflix.mediaclient.ui.commander.impl.ui.modes.browse.ClLaunchedEffect (CollapsedBrowse.kt:121)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r3, r4)
        L4a:
            com.netflix.mediaclient.commanderinfra.api.util.TargetDeviceUiState r8 = o.C3596bDs.a(r12)
            o.drM r6 = r12.d()
            o.Wd r0 = r12.b()
            boolean r9 = r0.n()
            o.dpR r0 = o.dpR.c
            r3 = -624791156(0xffffffffdac2718c, float:-2.73654958E16)
            r13.startReplaceableGroup(r3)
            boolean r3 = r13.changedInstance(r6)
            r1 = r1 & 14
            if (r1 != r2) goto L6c
            r1 = 1
            goto L6d
        L6c:
            r1 = 0
        L6d:
            boolean r2 = r13.changed(r8)
            boolean r4 = r13.changed(r9)
            java.lang.Object r5 = r13.rememberedValue()
            r1 = r1 | r3
            r1 = r1 | r2
            r1 = r1 | r4
            if (r1 != 0) goto L86
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r5 != r1) goto L91
        L86:
            com.netflix.mediaclient.ui.commander.impl.ui.modes.browse.CollapsedBrowseKt$ClLaunchedEffect$1$1 r1 = new com.netflix.mediaclient.ui.commander.impl.ui.modes.browse.CollapsedBrowseKt$ClLaunchedEffect$1$1
            r10 = 0
            r5 = r1
            r7 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            r13.updateRememberedValue(r1)
        L91:
            o.drX r5 = (o.drX) r5
            r13.endReplaceableGroup()
            r1 = 70
            androidx.compose.runtime.EffectsKt.LaunchedEffect(r0, r5, r13, r1)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto La4
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        La4:
            androidx.compose.runtime.ScopeUpdateScope r13 = r13.endRestartGroup()
            if (r13 == 0) goto Lb2
            com.netflix.mediaclient.ui.commander.impl.ui.modes.browse.CollapsedBrowseKt$ClLaunchedEffect$2 r0 = new com.netflix.mediaclient.ui.commander.impl.ui.modes.browse.CollapsedBrowseKt$ClLaunchedEffect$2
            r0.<init>()
            r13.updateScope(r0)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bCB.b(boolean, com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen$c, androidx.compose.runtime.Composer, int):void");
    }
}
