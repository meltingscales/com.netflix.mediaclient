package o;

import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import com.netflix.hawkins.consumer.tokens.Theme;
import com.netflix.hawkins.consumer.tokens.Token;
import o.AbstractC1010Ld;
import o.C1008Lb;
import o.dpR;

/* renamed from: o.Lb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1008Lb {
    public static final void a(final Modifier modifier, final AbstractC1010Ld abstractC1010Ld, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(829119053);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(abstractC1010Ld) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (i5 != 0) {
                abstractC1010Ld = AbstractC1010Ld.e.a;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(829119053, i3, -1, "com.netflix.hawkins.consumer.component.progress.HawkinsProgress (HawkinsProgress.kt:41)");
            }
            Theme theme = (Theme) startRestartGroup.consume(LC.e());
            startRestartGroup.startReplaceableGroup(382922254);
            boolean changed = startRestartGroup.changed(theme);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = Color.m1284boximpl(LA.d(Token.Color.C0596gw.e, theme));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            long m1302unboximpl = ((Color) rememberedValue).m1302unboximpl();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(382922374);
            boolean changed2 = startRestartGroup.changed(theme);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = Color.m1284boximpl(LA.d(Token.Color.C0590gq.d, theme));
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            long m1302unboximpl2 = ((Color) rememberedValue2).m1302unboximpl();
            startRestartGroup.endReplaceableGroup();
            if (abstractC1010Ld instanceof AbstractC1010Ld.d) {
                startRestartGroup.startReplaceableGroup(382922519);
                ProgressIndicatorKt.m809LinearProgressIndicator_5eSRE(((AbstractC1010Ld.d) abstractC1010Ld).c() / 100.0f, modifier, m1302unboximpl, m1302unboximpl2, 0, startRestartGroup, (i3 << 3) & 112, 16);
                startRestartGroup.endReplaceableGroup();
            } else if (C8632dsu.c(abstractC1010Ld, AbstractC1010Ld.e.a)) {
                startRestartGroup.startReplaceableGroup(382922818);
                ProgressIndicatorKt.m808LinearProgressIndicator2cYBFYY(modifier, m1302unboximpl, m1302unboximpl2, 0, startRestartGroup, i3 & 14, 8);
                startRestartGroup.endReplaceableGroup();
            } else {
                startRestartGroup.startReplaceableGroup(382923016);
                startRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.hawkins.consumer.component.progress.HawkinsProgressKt$HawkinsProgress$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void d(Composer composer2, int i6) {
                    C1008Lb.a(Modifier.this, abstractC1010Ld, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    d(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }
}
