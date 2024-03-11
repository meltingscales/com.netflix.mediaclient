package o;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import o.C8632dsu;
import o.K;
import o.M;
import o.dpR;
import o.drO;

/* loaded from: classes5.dex */
public final class K {
    public static final void e(final String str, final drO<dpR> dro, Composer composer, final int i) {
        final int i2;
        Composer composer2;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) dro, "");
        Composer startRestartGroup = composer.startRestartGroup(-680203232);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(dro) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-680203232, i2, -1, "com.airbnb.android.showkase.ui.SimpleTextCard (CommonComponents.kt:21)");
            }
            composer2 = startRestartGroup;
            CardKt.m557CardLPr_se0(dro, PaddingKt.m276paddingqDBjuR0(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), M.e(), M.a(), M.e(), M.a()), false, null, 0L, 0L, null, 0.0f, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1930578310, true, new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.CommonComponentsKt$SimpleTextCard$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer3, Integer num) {
                    d(composer3, num.intValue());
                    return dpR.c;
                }

                public final void d(Composer composer3, int i3) {
                    if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1930578310, i3, -1, "com.airbnb.android.showkase.ui.SimpleTextCard.<anonymous> (CommonComponents.kt:30)");
                        }
                        TextKt.m698TextfLXpl1I(str, PaddingKt.m273padding3ABfNKs(Modifier.Companion, M.e()), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, new TextStyle(0L, TextUnitKt.getSp(20), FontWeight.Companion.getBold(), null, null, FontFamily.Companion.getSerif(), null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262105, null), composer3, (i2 & 14) | 48, 0, 32764);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), startRestartGroup, ((i2 >> 3) & 14) | 805306368, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.CommonComponentsKt$SimpleTextCard$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void e(Composer composer3, int i3) {
                K.e(str, dro, composer3, i | 1);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer3, Integer num) {
                e(composer3, num.intValue());
                return dpR.c;
            }
        });
    }

    public static final void c(final String str, Composer composer, final int i) {
        int i2;
        Composer composer2;
        C8632dsu.c((Object) str, "");
        Composer startRestartGroup = composer.startRestartGroup(828359720);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(828359720, i2, -1, "com.airbnb.android.showkase.ui.ComponentCardTitle (CommonComponents.kt:44)");
            }
            composer2 = startRestartGroup;
            TextKt.m698TextfLXpl1I(str, PaddingKt.m276paddingqDBjuR0(Modifier.Companion, M.e(), M.c(), M.e(), M.d()), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, new TextStyle(0L, TextUnitKt.getSp(16), FontWeight.Companion.getBold(), null, null, FontFamily.Companion.getSerif(), null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262105, null), composer2, i2 & 14, 0, 32764);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.CommonComponentsKt$ComponentCardTitle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(Composer composer3, int i3) {
                K.c(str, composer3, i | 1);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer3, Integer num) {
                a(composer3, num.intValue());
                return dpR.c;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final o.C r18, o.drO<o.dpR> r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            r0 = r18
            r1 = r21
            r2 = r22
            java.lang.String r3 = ""
            o.C8632dsu.c(r0, r3)
            r3 = 2105977529(0x7d86aab9, float:2.2375374E37)
            r4 = r20
            androidx.compose.runtime.Composer r15 = r4.startRestartGroup(r3)
            r4 = r2 & 1
            if (r4 == 0) goto L1b
            r4 = r1 | 6
            goto L2b
        L1b:
            r4 = r1 & 14
            if (r4 != 0) goto L2a
            boolean r4 = r15.changed(r0)
            if (r4 == 0) goto L27
            r4 = 4
            goto L28
        L27:
            r4 = 2
        L28:
            r4 = r4 | r1
            goto L2b
        L2a:
            r4 = r1
        L2b:
            r5 = r2 & 2
            if (r5 == 0) goto L32
            r4 = r4 | 48
            goto L45
        L32:
            r6 = r1 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L45
            r6 = r19
            boolean r7 = r15.changed(r6)
            if (r7 == 0) goto L41
            r7 = 32
            goto L43
        L41:
            r7 = 16
        L43:
            r4 = r4 | r7
            goto L47
        L45:
            r6 = r19
        L47:
            r4 = r4 & 91
            r7 = 18
            if (r4 != r7) goto L59
            boolean r4 = r15.getSkipping()
            if (r4 != 0) goto L54
            goto L59
        L54:
            r15.skipToGroupEnd()
            r3 = r15
            goto La3
        L59:
            if (r5 == 0) goto L5e
            r4 = 0
            r14 = r4
            goto L5f
        L5e:
            r14 = r6
        L5f:
            boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r4 == 0) goto L6b
            r4 = -1
            java.lang.String r5 = "com.airbnb.android.showkase.ui.ComponentCard (CommonComponents.kt:58)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r4, r5)
        L6b:
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r4 = o.R.a(r3, r0)
            androidx.compose.ui.Modifier r3 = a(r3, r14)
            com.airbnb.android.showkase.ui.CommonComponentsKt$ComponentCard$1 r5 = new com.airbnb.android.showkase.ui.CommonComponentsKt$ComponentCard$1
            r5.<init>()
            r3 = -209203300(0xfffffffff387cf9c, float:-2.1520108E31)
            r4 = 1
            androidx.compose.runtime.internal.ComposableLambda r12 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r15, r3, r4, r5)
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r3 = 1572864(0x180000, float:2.204052E-39)
            r16 = 63
            r13 = r15
            r17 = r14
            r14 = r3
            r3 = r15
            r15 = r16
            androidx.compose.material.CardKt.m556CardFjzlyU(r4, r5, r6, r8, r10, r11, r12, r13, r14, r15)
            boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r4 == 0) goto La1
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        La1:
            r6 = r17
        La3:
            androidx.compose.runtime.ScopeUpdateScope r3 = r3.endRestartGroup()
            if (r3 != 0) goto Laa
            goto Lb2
        Laa:
            com.airbnb.android.showkase.ui.CommonComponentsKt$ComponentCard$2 r4 = new com.airbnb.android.showkase.ui.CommonComponentsKt$ComponentCard$2
            r4.<init>()
            r3.updateScope(r4)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.K.d(o.C, o.drO, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final Modifier a(Modifier modifier, final drO<dpR> dro) {
        return ComposedModifierKt.composed$default(modifier, null, new InterfaceC8612dsa<Modifier, Composer, Integer, Modifier>() { // from class: com.airbnb.android.showkase.ui.CommonComponentsKt$generateContainerModifier$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final Modifier c(Modifier modifier2, Composer composer, int i) {
                Modifier fillMaxWidth$default;
                C8632dsu.c((Object) modifier2, "");
                composer.startReplaceableGroup(-1123557271);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1123557271, i, -1, "com.airbnb.android.showkase.ui.generateContainerModifier.<anonymous> (CommonComponents.kt:84)");
                }
                drO<dpR> dro2 = dro;
                if (dro2 == null || (fillMaxWidth$default = ClickableKt.m130clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), false, null, null, dro2, 7, null)) == null) {
                    fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return fillMaxWidth$default;
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return c(modifier2, composer, num.intValue());
            }
        }, 1, null);
    }
}
