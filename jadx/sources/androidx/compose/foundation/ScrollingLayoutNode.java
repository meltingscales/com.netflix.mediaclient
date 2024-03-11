package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import o.C8657dts;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class ScrollingLayoutNode extends Modifier.Node implements LayoutModifierNode {
    private boolean isReversed;
    private boolean isVertical;
    private ScrollState scrollerState;

    public final ScrollState getScrollerState() {
        return this.scrollerState;
    }

    public final boolean isReversed() {
        return this.isReversed;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    public final void setReversed(boolean z) {
        this.isReversed = z;
    }

    public final void setScrollerState(ScrollState scrollState) {
        this.scrollerState = scrollState;
    }

    public final void setVertical(boolean z) {
        this.isVertical = z;
    }

    public ScrollingLayoutNode(ScrollState scrollState, boolean z, boolean z2) {
        this.scrollerState = scrollState;
        this.isReversed = z;
        this.isVertical = z2;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo37measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        int i;
        int i2;
        CheckScrollableContainerConstraintsKt.m125checkScrollableContainerConstraintsK40F9xA(j, this.isVertical ? Orientation.Vertical : Orientation.Horizontal);
        final Placeable mo1803measureBRTryo0 = measurable.mo1803measureBRTryo0(Constraints.m2464copyZbe2FdA$default(j, 0, this.isVertical ? Constraints.m2473getMaxWidthimpl(j) : Integer.MAX_VALUE, 0, this.isVertical ? Integer.MAX_VALUE : Constraints.m2472getMaxHeightimpl(j), 5, null));
        i = C8657dts.i(mo1803measureBRTryo0.getWidth(), Constraints.m2473getMaxWidthimpl(j));
        i2 = C8657dts.i(mo1803measureBRTryo0.getHeight(), Constraints.m2472getMaxHeightimpl(j));
        final int height = mo1803measureBRTryo0.getHeight() - i2;
        int width = mo1803measureBRTryo0.getWidth();
        if (!this.isVertical) {
            height = width - i;
        }
        this.scrollerState.setMaxValue$foundation_release(height);
        this.scrollerState.setViewportSize$foundation_release(this.isVertical ? i2 : i);
        return MeasureScope.layout$default(measureScope, i, i2, null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.foundation.ScrollingLayoutNode$measure$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                int c;
                c = C8657dts.c(ScrollingLayoutNode.this.getScrollerState().getValue(), 0, height);
                int i3 = ScrollingLayoutNode.this.isReversed() ? c - height : -c;
                Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, mo1803measureBRTryo0, ScrollingLayoutNode.this.isVertical() ? 0 : i3, ScrollingLayoutNode.this.isVertical() ? i3 : 0, 0.0f, null, 12, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.isVertical) {
            return intrinsicMeasurable.minIntrinsicWidth(Integer.MAX_VALUE);
        }
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.isVertical) {
            return intrinsicMeasurable.minIntrinsicHeight(i);
        }
        return intrinsicMeasurable.minIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.isVertical) {
            return intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE);
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.isVertical) {
            return intrinsicMeasurable.maxIntrinsicHeight(i);
        }
        return intrinsicMeasurable.maxIntrinsicHeight(Integer.MAX_VALUE);
    }
}
