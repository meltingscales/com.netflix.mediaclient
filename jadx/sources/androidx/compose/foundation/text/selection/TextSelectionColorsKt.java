package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import o.drO;

/* loaded from: classes.dex */
public final class TextSelectionColorsKt {
    private static final long DefaultSelectionColor;
    private static final TextSelectionColors DefaultTextSelectionColors;
    private static final ProvidableCompositionLocal<TextSelectionColors> LocalTextSelectionColors = CompositionLocalKt.compositionLocalOf$default(null, new drO<TextSelectionColors>() { // from class: androidx.compose.foundation.text.selection.TextSelectionColorsKt$LocalTextSelectionColors$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.drO
        public final TextSelectionColors invoke() {
            TextSelectionColors textSelectionColors;
            textSelectionColors = TextSelectionColorsKt.DefaultTextSelectionColors;
            return textSelectionColors;
        }
    }, 1, null);

    public static final ProvidableCompositionLocal<TextSelectionColors> getLocalTextSelectionColors() {
        return LocalTextSelectionColors;
    }

    static {
        long Color = ColorKt.Color(4282550004L);
        DefaultSelectionColor = Color;
        DefaultTextSelectionColors = new TextSelectionColors(Color, Color.m1292copywmQWz5c$default(Color, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }
}
