package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import com.netflix.android.org.json.zip.JSONzip;
import o.dpR;
import o.drX;

/* loaded from: classes.dex */
public final class ProvideContentColorTextStyleKt {
    /* renamed from: ProvideContentColorTextStyle-3J-VO9M  reason: not valid java name */
    public static final void m823ProvideContentColorTextStyle3JVO9M(final long j, final TextStyle textStyle, final drX<? super Composer, ? super Integer, dpR> drx, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1479790536);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(textStyle) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(drx) ? JSONzip.end : 128;
        }
        if ((i2 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1479790536, i2, -1, "androidx.compose.material3.ProvideContentColorTextStyle (ProvideContentColorTextStyle.kt:36)");
            }
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1284boximpl(j)), TextKt.getLocalTextStyle().provides(((TextStyle) startRestartGroup.consume(TextKt.getLocalTextStyle())).merge(textStyle))}, drx, startRestartGroup, (i2 >> 3) & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.material3.ProvideContentColorTextStyleKt$ProvideContentColorTextStyle$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer2, int i3) {
                    ProvideContentColorTextStyleKt.m823ProvideContentColorTextStyle3JVO9M(j, textStyle, drx, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
