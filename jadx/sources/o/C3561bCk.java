package o;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.TestTagKt;
import java.util.List;
import o.C3561bCk;
import o.dpR;

/* renamed from: o.bCk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3561bCk {
    public static final void b(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(1952960403);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1952960403, i3, -1, "com.netflix.mediaclient.ui.commander.impl.ui.components.FeatureEducationFallbackAsset (FeatureEducationFallbackAsset.kt:16)");
            }
            BoxKt.Box(BackgroundKt.background$default(AspectRatioKt.aspectRatio$default(SizeKt.fillMaxWidth$default(TestTagKt.testTag(modifier, "commander_feature_education_image"), 0.0f, 1, null), 1.77f, false, 2, null), a(startRestartGroup, 0), null, 0.0f, 6, null), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.components.FeatureEducationFallbackAssetKt$FeatureEducationFallbackAsset$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void c(Composer composer2, int i5) {
                    C3561bCk.b(Modifier.this, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    c(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    public static final Brush a(Composer composer, int i) {
        List j;
        composer.startReplaceableGroup(-646769706);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-646769706, i, -1, "com.netflix.mediaclient.ui.commander.impl.ui.components.createGradient (FeatureEducationFallbackAsset.kt:28)");
        }
        Brush.Companion companion = Brush.Companion;
        j = C8569dql.j(Color.m1284boximpl(ColorKt.Color(android.graphics.Color.parseColor("#1D1247"))), Color.m1284boximpl(ColorKt.Color(android.graphics.Color.parseColor("#280D36"))));
        Brush m1266linearGradientmHitzGk$default = Brush.Companion.m1266linearGradientmHitzGk$default(companion, j, OffsetKt.Offset(0.0f, 0.0f), OffsetKt.Offset(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), 0, 8, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1266linearGradientmHitzGk$default;
    }
}
