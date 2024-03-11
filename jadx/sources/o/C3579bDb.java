package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen;
import o.C3579bDb;
import o.dpR;

/* renamed from: o.bDb  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3579bDb {
    public static final void e(final String str, final ControllerScreen.c cVar, final drO<dpR> dro, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) cVar, "");
        C8632dsu.c((Object) dro, "");
        Composer startRestartGroup = composer.startRestartGroup(1514178393);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(cVar) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(dro) ? JSONzip.end : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if ((i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1514178393, i3, -1, "com.netflix.mediaclient.ui.commander.impl.ui.modes.postplay.ExpandedPostPlay (ExpandedPostPlay.kt:27)");
            }
            int i5 = i3 & 112;
            bCB.b(true, cVar, startRestartGroup, i5 | 6);
            C3566bCp.e(str, cVar, dro, modifier, startRestartGroup, i5 | (i3 & 14) | (i3 & 896) | (i3 & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.postplay.ExpandedPostPlayKt$ExpandedPostPlay$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(Composer composer2, int i6) {
                    C3579bDb.e(str, cVar, dro, modifier2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    a(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }
}
