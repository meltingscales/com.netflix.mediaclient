package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.compose.ui.semantics.SemanticsNode;

/* loaded from: classes.dex */
public final class SemanticsNodeWithAdjustedBounds {
    private final Rect adjustedBounds;
    private final SemanticsNode semanticsNode;

    public final Rect getAdjustedBounds() {
        return this.adjustedBounds;
    }

    public final SemanticsNode getSemanticsNode() {
        return this.semanticsNode;
    }

    public SemanticsNodeWithAdjustedBounds(SemanticsNode semanticsNode, Rect rect) {
        this.semanticsNode = semanticsNode;
        this.adjustedBounds = rect;
    }
}
