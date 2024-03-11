package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import com.netflix.android.org.json.zip.JSONzip;
import com.slack.circuit.runtime.screen.Screen;
import o.C8632dsu;
import o.dmF;
import o.dmO;
import o.dpR;

/* loaded from: classes5.dex */
public final class dmF {
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0147, code lost:
        if (r1 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0131 A[LOOP:0: B:93:0x012f->B:94:0x0131, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final com.slack.circuit.runtime.screen.Screen r16, final o.InterfaceC8499dnw r17, androidx.compose.ui.Modifier r18, o.dmH r19, o.InterfaceC8613dsb<? super com.slack.circuit.runtime.screen.Screen, ? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dmF.d(com.slack.circuit.runtime.screen.Screen, o.dnw, androidx.compose.ui.Modifier, o.dmH, o.dsb, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cf, code lost:
        if (r3 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0133, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016a, code lost:
        if (r4 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L80;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final com.slack.circuit.runtime.screen.Screen r18, final androidx.compose.ui.Modifier r19, final o.InterfaceC8499dnw r20, final o.dmH r21, final o.InterfaceC8613dsb<? super com.slack.circuit.runtime.screen.Screen, ? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r22, final o.C8495dns r23, androidx.compose.runtime.Composer r24, final int r25) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dmF.d(com.slack.circuit.runtime.screen.Screen, androidx.compose.ui.Modifier, o.dnw, o.dmH, o.dsb, o.dns, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <UiState extends InterfaceC8491dno> void b(final Screen screen, final Modifier modifier, final dmO dmo, final InterfaceC8496dnt<UiState> interfaceC8496dnt, final InterfaceC8498dnv<UiState> interfaceC8498dnv, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1039775062);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(screen) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(dmo) ? JSONzip.end : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(interfaceC8496dnt) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changed(interfaceC8498dnv) ? 16384 : 8192;
        }
        if ((46811 & i2) != 9362 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1039775062, i2, -1, "com.slack.circuit.foundation.CircuitContent (CircuitContent.kt:128)");
            }
            int i3 = i2 & 14;
            EffectsKt.DisposableEffect(screen, new drM<DisposableEffectScope, DisposableEffectResult>() { // from class: com.slack.circuit.foundation.CircuitContentKt$CircuitContent$7
                {
                    super(1);
                }

                /* loaded from: classes5.dex */
                public static final class d implements DisposableEffectResult {
                    final /* synthetic */ dmO b;

                    public d(dmO dmo) {
                        this.b = dmo;
                    }

                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        this.b.a();
                    }
                }

                @Override // o.drM
                /* renamed from: c */
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    C8632dsu.c((Object) disposableEffectScope, "");
                    dmO.this.e();
                    return new d(dmO.this);
                }
            }, startRestartGroup, i3);
            startRestartGroup.startMovableGroup(686149356, screen);
            final UiState e = interfaceC8496dnt.e(startRestartGroup, (i2 >> 9) & 14);
            startRestartGroup.endMovableGroup();
            EffectsKt.SideEffect(new drO<dpR>() { // from class: com.slack.circuit.foundation.CircuitContentKt$CircuitContent$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Incorrect types in method signature: (Lo/dmO;TUiState;)V */
                {
                    super(0);
                }

                public final void e() {
                    dmO.this.a(e);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    e();
                    return dpR.c;
                }
            }, startRestartGroup, 0);
            EffectsKt.DisposableEffect(screen, new drM<DisposableEffectScope, DisposableEffectResult>() { // from class: com.slack.circuit.foundation.CircuitContentKt$CircuitContent$9
                {
                    super(1);
                }

                /* loaded from: classes5.dex */
                public static final class a implements DisposableEffectResult {
                    final /* synthetic */ dmO a;

                    public a(dmO dmo) {
                        this.a = dmo;
                    }

                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        this.a.c();
                    }
                }

                @Override // o.drM
                /* renamed from: b */
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    C8632dsu.c((Object) disposableEffectScope, "");
                    dmO.this.d();
                    return new a(dmO.this);
                }
            }, startRestartGroup, i3);
            interfaceC8498dnv.a(e, modifier, startRestartGroup, (i2 & 112) | ((i2 >> 6) & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.slack.circuit.foundation.CircuitContentKt$CircuitContent$10
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void e(Composer composer2, int i4) {
                    dmF.b(Screen.this, modifier, dmo, interfaceC8496dnt, interfaceC8498dnv, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    e(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }
}
