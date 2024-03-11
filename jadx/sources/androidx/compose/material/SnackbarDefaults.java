package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;

/* loaded from: classes5.dex */
public final class SnackbarDefaults {
    public static final SnackbarDefaults INSTANCE = new SnackbarDefaults();

    private SnackbarDefaults() {
    }

    public final long getBackgroundColor(Composer composer, int i) {
        composer.startReplaceableGroup(1630911716);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1630911716, i, -1, "androidx.compose.material.SnackbarDefaults.<get-backgroundColor> (Snackbar.kt:202)");
        }
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        long m1314compositeOverOWjLjI = ColorKt.m1314compositeOverOWjLjI(Color.m1292copywmQWz5c$default(materialTheme.getColors(composer, 6).m564getOnSurface0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m569getSurface0d7_KjU());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1314compositeOverOWjLjI;
    }

    public final long getPrimaryActionColor(Composer composer, int i) {
        long m566getPrimaryVariant0d7_KjU;
        composer.startReplaceableGroup(-810329402);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-810329402, i, -1, "androidx.compose.material.SnackbarDefaults.<get-primaryActionColor> (Snackbar.kt:222)");
        }
        Colors colors = MaterialTheme.INSTANCE.getColors(composer, 6);
        if (colors.isLight()) {
            m566getPrimaryVariant0d7_KjU = ColorKt.m1314compositeOverOWjLjI(Color.m1292copywmQWz5c$default(colors.m569getSurface0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), colors.m565getPrimary0d7_KjU());
        } else {
            m566getPrimaryVariant0d7_KjU = colors.m566getPrimaryVariant0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m566getPrimaryVariant0d7_KjU;
    }
}
