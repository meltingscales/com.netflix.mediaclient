package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;

/* loaded from: classes5.dex */
public final class DrawerDefaults {
    public static final DrawerDefaults INSTANCE = new DrawerDefaults();
    private static final float Elevation = Dp.m2492constructorimpl(16);

    /* renamed from: getElevation-D9Ej5fM  reason: not valid java name */
    public final float m587getElevationD9Ej5fM() {
        return Elevation;
    }

    private DrawerDefaults() {
    }

    public final long getScrimColor(Composer composer, int i) {
        composer.startReplaceableGroup(617225966);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(617225966, i, -1, "androidx.compose.material.DrawerDefaults.<get-scrimColor> (Drawer.kt:775)");
        }
        long m1292copywmQWz5c$default = Color.m1292copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m564getOnSurface0d7_KjU(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1292copywmQWz5c$default;
    }
}
