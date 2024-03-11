package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.TextOverflow;
import o.C8627dsp;

/* loaded from: classes.dex */
public class StaticTextSelectionParams {
    private final LayoutCoordinates layoutCoordinates;
    private final TextLayoutResult textLayoutResult;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final StaticTextSelectionParams Empty = new StaticTextSelectionParams(null, null);

    public final LayoutCoordinates getLayoutCoordinates() {
        return this.layoutCoordinates;
    }

    public final TextLayoutResult getTextLayoutResult() {
        return this.textLayoutResult;
    }

    public StaticTextSelectionParams(LayoutCoordinates layoutCoordinates, TextLayoutResult textLayoutResult) {
        this.layoutCoordinates = layoutCoordinates;
        this.textLayoutResult = textLayoutResult;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final StaticTextSelectionParams getEmpty() {
            return StaticTextSelectionParams.Empty;
        }
    }

    public Path getPathForRange(int i, int i2) {
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        if (textLayoutResult != null) {
            return textLayoutResult.getPathForRange(i, i2);
        }
        return null;
    }

    public boolean getShouldClip() {
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        return (textLayoutResult == null || TextOverflow.m2453equalsimpl0(textLayoutResult.getLayoutInput().m2139getOverflowgIe3tQ8(), TextOverflow.Companion.m2459getVisiblegIe3tQ8()) || !textLayoutResult.getHasVisualOverflow()) ? false : true;
    }

    public static /* synthetic */ StaticTextSelectionParams copy$default(StaticTextSelectionParams staticTextSelectionParams, LayoutCoordinates layoutCoordinates, TextLayoutResult textLayoutResult, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                layoutCoordinates = staticTextSelectionParams.layoutCoordinates;
            }
            if ((i & 2) != 0) {
                textLayoutResult = staticTextSelectionParams.textLayoutResult;
            }
            return staticTextSelectionParams.copy(layoutCoordinates, textLayoutResult);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
    }

    public final StaticTextSelectionParams copy(LayoutCoordinates layoutCoordinates, TextLayoutResult textLayoutResult) {
        return new StaticTextSelectionParams(layoutCoordinates, textLayoutResult);
    }
}
