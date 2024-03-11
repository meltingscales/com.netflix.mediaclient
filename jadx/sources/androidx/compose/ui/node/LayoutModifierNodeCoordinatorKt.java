package androidx.compose.ui.node;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.unit.IntOffset;

/* loaded from: classes.dex */
public final class LayoutModifierNodeCoordinatorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int calculateAlignmentAndPlaceChildAsNeeded(LookaheadCapablePlaceable lookaheadCapablePlaceable, AlignmentLine alignmentLine) {
        int m2533getXimpl;
        LookaheadCapablePlaceable child = lookaheadCapablePlaceable.getChild();
        if (child == null) {
            throw new IllegalStateException(("Child of " + lookaheadCapablePlaceable + " cannot be null when calculating alignment line").toString());
        } else if (lookaheadCapablePlaceable.getMeasureResult$ui_release().getAlignmentLines().containsKey(alignmentLine)) {
            Integer num = lookaheadCapablePlaceable.getMeasureResult$ui_release().getAlignmentLines().get(alignmentLine);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        } else {
            int i = child.get(alignmentLine);
            if (i == Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            child.setShallowPlacing$ui_release(true);
            lookaheadCapablePlaceable.setPlacingForAlignment$ui_release(true);
            lookaheadCapablePlaceable.replace$ui_release();
            child.setShallowPlacing$ui_release(false);
            lookaheadCapablePlaceable.setPlacingForAlignment$ui_release(false);
            if (alignmentLine instanceof HorizontalAlignmentLine) {
                m2533getXimpl = IntOffset.m2534getYimpl(child.mo1892getPositionnOccac());
            } else {
                m2533getXimpl = IntOffset.m2533getXimpl(child.mo1892getPositionnOccac());
            }
            return i + m2533getXimpl;
        }
    }
}
