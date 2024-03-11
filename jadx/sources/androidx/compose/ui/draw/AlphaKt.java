package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;

/* loaded from: classes.dex */
public final class AlphaKt {
    public static final Modifier alpha(Modifier modifier, float f) {
        return f == 1.0f ? modifier : GraphicsLayerModifierKt.m1346graphicsLayerAp8cVGQ$default(modifier, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, true, null, 0L, 0L, 0, 126971, null);
    }
}
