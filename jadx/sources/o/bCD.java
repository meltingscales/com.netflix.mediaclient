package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen;
import com.netflix.mediaclient.ui.commander.impl.ui.modes.browse.ExpandedBrowseKt$DeviceSheetOverlayLaunchedEffect$1$1;
import o.bCD;
import o.dpR;

/* loaded from: classes4.dex */
public final class bCD {
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final java.lang.String r30, final o.drO<o.dpR> r31, final com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen.c r32, androidx.compose.ui.Modifier r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 757
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bCD.c(java.lang.String, o.drO, com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen$c, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final java.lang.String r28, final com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen.c r29, final o.drO<o.dpR> r30, final o.drM<? super com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen.e, o.dpR> r31, androidx.compose.ui.Modifier r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 673
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bCD.b(java.lang.String, com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen$c, o.drO, o.drM, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void a(final ControllerScreen.c.e eVar, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        C8632dsu.c((Object) eVar, "");
        Composer startRestartGroup = composer.startRestartGroup(-1887372567);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(eVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1887372567, i3, -1, "com.netflix.mediaclient.ui.commander.impl.ui.modes.browse.DeviceSheetOverlayLaunchedEffect (ExpandedBrowse.kt:185)");
            }
            dmW dmw = (dmW) startRestartGroup.consume(dmZ.c());
            boolean a = eVar.b().a();
            startRestartGroup.startReplaceableGroup(69461752);
            boolean z = (i3 & 14) == 4;
            boolean changed = startRestartGroup.changed(dmw);
            boolean z2 = (i3 & 112) == 32;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if ((z | changed | z2) || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new ExpandedBrowseKt$DeviceSheetOverlayLaunchedEffect$1$1(eVar, dmw, modifier, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(Boolean.valueOf(a), (drX) rememberedValue, startRestartGroup, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.browse.ExpandedBrowseKt$DeviceSheetOverlayLaunchedEffect$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void d(Composer composer2, int i5) {
                    bCD.a(ControllerScreen.c.e.this, modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    d(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    private static final String a(MutableState<String> mutableState) {
        return mutableState.getValue();
    }
}
