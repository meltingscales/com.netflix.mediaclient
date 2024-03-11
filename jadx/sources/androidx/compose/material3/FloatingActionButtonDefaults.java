package androidx.compose.material3;

import androidx.compose.material3.tokens.ExtendedFabPrimaryTokens;
import androidx.compose.material3.tokens.FabPrimaryLargeTokens;
import androidx.compose.material3.tokens.FabPrimaryTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Shape;

/* loaded from: classes.dex */
public final class FloatingActionButtonDefaults {
    public static final FloatingActionButtonDefaults INSTANCE = new FloatingActionButtonDefaults();
    private static final float LargeIconSize = FabPrimaryLargeTokens.INSTANCE.m884getIconSizeD9Ej5fM();

    private FloatingActionButtonDefaults() {
    }

    public final Shape getShape(Composer composer, int i) {
        composer.startReplaceableGroup(-53247565);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-53247565, i, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-shape> (FloatingActionButton.kt:389)");
        }
        Shape value = ShapesKt.getValue(FabPrimaryTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    public final Shape getExtendedFabShape(Composer composer, int i) {
        composer.startReplaceableGroup(-536021915);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-536021915, i, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-extendedFabShape> (FloatingActionButton.kt:399)");
        }
        Shape value = ShapesKt.getValue(ExtendedFabPrimaryTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    public final long getContainerColor(Composer composer, int i) {
        composer.startReplaceableGroup(1855656391);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1855656391, i, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-containerColor> (FloatingActionButton.kt:402)");
        }
        long value = ColorSchemeKt.getValue(FabPrimaryTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    /* renamed from: elevation-xZ9-QkE  reason: not valid java name */
    public final FloatingActionButtonElevation m786elevationxZ9QkE(float f, float f2, float f3, float f4, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-241106249);
        if ((i2 & 1) != 0) {
            f = FabPrimaryTokens.INSTANCE.m885getContainerElevationD9Ej5fM();
        }
        float f5 = f;
        if ((i2 & 2) != 0) {
            f2 = FabPrimaryTokens.INSTANCE.m890getPressedContainerElevationD9Ej5fM();
        }
        float f6 = f2;
        if ((i2 & 4) != 0) {
            f3 = FabPrimaryTokens.INSTANCE.m888getFocusContainerElevationD9Ej5fM();
        }
        float f7 = f3;
        if ((i2 & 8) != 0) {
            f4 = FabPrimaryTokens.INSTANCE.m889getHoverContainerElevationD9Ej5fM();
        }
        float f8 = f4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-241106249, i, -1, "androidx.compose.material3.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:421)");
        }
        FloatingActionButtonElevation floatingActionButtonElevation = new FloatingActionButtonElevation(f5, f6, f7, f8, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return floatingActionButtonElevation;
    }
}
