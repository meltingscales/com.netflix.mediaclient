package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;

/* loaded from: classes.dex */
public final class ScaleKt {
    public static final Modifier scale(Modifier modifier, float f, float f2) {
        return (f == 1.0f && f2 == 1.0f) ? modifier : GraphicsLayerModifierKt.m1346graphicsLayerAp8cVGQ$default(modifier, f, f2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131068, null);
    }

    public static final Modifier scale(Modifier modifier, float f) {
        return scale(modifier, f, f);
    }
}
