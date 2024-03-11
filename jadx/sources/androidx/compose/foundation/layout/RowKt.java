package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasurePolicy;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class RowKt {
    private static final MeasurePolicy DefaultRowMeasurePolicy;

    static {
        LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
        Arrangement arrangement = Arrangement.INSTANCE;
        DefaultRowMeasurePolicy = new RowColumnMeasurePolicy(layoutOrientation, arrangement.getStart(), null, arrangement.getStart().mo233getSpacingD9Ej5fM(), SizeMode.Wrap, CrossAxisAlignment.Companion.vertical$foundation_layout_release(Alignment.Companion.getTop()), null);
    }

    public static final MeasurePolicy rowMeasurePolicy(Arrangement.Horizontal horizontal, Alignment.Vertical vertical, Composer composer, int i) {
        MeasurePolicy measurePolicy;
        composer.startReplaceableGroup(-837807694);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-837807694, i, -1, "androidx.compose.foundation.layout.rowMeasurePolicy (Row.kt:117)");
        }
        if (C8632dsu.c(horizontal, Arrangement.INSTANCE.getStart()) && C8632dsu.c(vertical, Alignment.Companion.getTop())) {
            measurePolicy = DefaultRowMeasurePolicy;
        } else {
            composer.startReplaceableGroup(511388516);
            boolean changed = composer.changed(horizontal);
            boolean changed2 = composer.changed(vertical);
            Object rememberedValue = composer.rememberedValue();
            if ((changed | changed2) || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new RowColumnMeasurePolicy(LayoutOrientation.Horizontal, horizontal, null, horizontal.mo233getSpacingD9Ej5fM(), SizeMode.Wrap, CrossAxisAlignment.Companion.vertical$foundation_layout_release(vertical), null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            measurePolicy = (MeasurePolicy) rememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return measurePolicy;
    }
}
