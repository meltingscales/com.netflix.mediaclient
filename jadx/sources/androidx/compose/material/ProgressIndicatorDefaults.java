package androidx.compose.material;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class ProgressIndicatorDefaults {
    public static final ProgressIndicatorDefaults INSTANCE = new ProgressIndicatorDefaults();
    private static final float StrokeWidth = Dp.m2492constructorimpl(4);
    private static final SpringSpec<Float> ProgressAnimationSpec = new SpringSpec<>(1.0f, 50.0f, Float.valueOf(0.001f));

    /* renamed from: getStrokeWidth-D9Ej5fM  reason: not valid java name */
    public final float m620getStrokeWidthD9Ej5fM() {
        return StrokeWidth;
    }

    private ProgressIndicatorDefaults() {
    }
}
