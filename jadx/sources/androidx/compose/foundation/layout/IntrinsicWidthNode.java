package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;

/* loaded from: classes.dex */
final class IntrinsicWidthNode extends IntrinsicSizeModifier {
    private boolean enforceIncoming;
    private IntrinsicSize width;

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }

    public void setEnforceIncoming(boolean z) {
        this.enforceIncoming = z;
    }

    public final void setWidth(IntrinsicSize intrinsicSize) {
        this.width = intrinsicSize;
    }

    public IntrinsicWidthNode(IntrinsicSize intrinsicSize, boolean z) {
        this.width = intrinsicSize;
        this.enforceIncoming = z;
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    /* renamed from: calculateContentConstraints-l58MMJ0 */
    public long mo252calculateContentConstraintsl58MMJ0(MeasureScope measureScope, Measurable measurable, long j) {
        int maxIntrinsicWidth;
        if (this.width == IntrinsicSize.Min) {
            maxIntrinsicWidth = measurable.minIntrinsicWidth(Constraints.m2472getMaxHeightimpl(j));
        } else {
            maxIntrinsicWidth = measurable.maxIntrinsicWidth(Constraints.m2472getMaxHeightimpl(j));
        }
        if (maxIntrinsicWidth < 0) {
            maxIntrinsicWidth = 0;
        }
        return Constraints.Companion.m2482fixedWidthOenEA2s(maxIntrinsicWidth);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return this.width == IntrinsicSize.Min ? intrinsicMeasurable.minIntrinsicWidth(i) : intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return this.width == IntrinsicSize.Min ? intrinsicMeasurable.minIntrinsicWidth(i) : intrinsicMeasurable.maxIntrinsicWidth(i);
    }
}
