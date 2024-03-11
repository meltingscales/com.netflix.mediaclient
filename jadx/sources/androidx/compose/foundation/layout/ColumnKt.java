package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasurePolicy;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class ColumnKt {
    private static final MeasurePolicy DefaultColumnMeasurePolicy;

    static {
        LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
        Arrangement arrangement = Arrangement.INSTANCE;
        DefaultColumnMeasurePolicy = new RowColumnMeasurePolicy(layoutOrientation, null, arrangement.getTop(), arrangement.getTop().mo233getSpacingD9Ej5fM(), SizeMode.Wrap, CrossAxisAlignment.Companion.horizontal$foundation_layout_release(Alignment.Companion.getStart()), null);
    }

    public static final MeasurePolicy columnMeasurePolicy(Arrangement.Vertical vertical, Alignment.Horizontal horizontal, Composer composer, int i) {
        MeasurePolicy measurePolicy;
        composer.startReplaceableGroup(1089876336);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1089876336, i, -1, "androidx.compose.foundation.layout.columnMeasurePolicy (Column.kt:101)");
        }
        if (C8632dsu.c(vertical, Arrangement.INSTANCE.getTop()) && C8632dsu.c(horizontal, Alignment.Companion.getStart())) {
            measurePolicy = DefaultColumnMeasurePolicy;
        } else {
            composer.startReplaceableGroup(511388516);
            boolean changed = composer.changed(vertical);
            boolean changed2 = composer.changed(horizontal);
            Object rememberedValue = composer.rememberedValue();
            if ((changed | changed2) || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new RowColumnMeasurePolicy(LayoutOrientation.Vertical, null, vertical, vertical.mo233getSpacingD9Ej5fM(), SizeMode.Wrap, CrossAxisAlignment.Companion.horizontal$foundation_layout_release(horizontal), null);
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
