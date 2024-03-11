package androidx.compose.ui.text.android;

import android.text.Layout;

/* loaded from: classes.dex */
public final class LayoutCompatKt {
    public static final int getLineForOffset(Layout layout, int i, boolean z) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        return (lineStart == i || layout.getLineEnd(lineForOffset) == i) ? lineStart == i ? z ? lineForOffset - 1 : lineForOffset : z ? lineForOffset : lineForOffset + 1 : lineForOffset;
    }
}
