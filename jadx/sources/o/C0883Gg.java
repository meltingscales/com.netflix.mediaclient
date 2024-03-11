package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import o.C0883Gg;
import o.FF;
import o.dpR;

/* renamed from: o.Gg  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0883Gg {
    public static final void d(final FF ff, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        C8632dsu.c((Object) ff, "");
        Composer startRestartGroup = composer.startRestartGroup(-86715022);
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 = i | 48;
        } else if ((i & 112) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 81) != 16 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-86715022, i3, -1, "com.netflix.clcs.ui.ClcsHorizontalDivider (ClcsHorizontalDivider.kt:11)");
            }
            KH.e(modifier, null, null, null, startRestartGroup, (i3 >> 3) & 14, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.clcs.ui.ClcsHorizontalDividerKt$ClcsHorizontalDivider$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(Composer composer2, int i5) {
                    C0883Gg.d(FF.this, modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    b(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }
}
