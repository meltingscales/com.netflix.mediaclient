package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import o.C8657dts;
import o.dpR;
import o.drM;
import o.drX;

/* loaded from: classes.dex */
final class WrapContentNode extends Modifier.Node implements LayoutModifierNode {
    private drX<? super IntSize, ? super LayoutDirection, IntOffset> alignmentCallback;
    private Direction direction;
    private boolean unbounded;

    public final drX<IntSize, LayoutDirection, IntOffset> getAlignmentCallback() {
        return this.alignmentCallback;
    }

    public final void setAlignmentCallback(drX<? super IntSize, ? super LayoutDirection, IntOffset> drx) {
        this.alignmentCallback = drx;
    }

    public final void setDirection(Direction direction) {
        this.direction = direction;
    }

    public final void setUnbounded(boolean z) {
        this.unbounded = z;
    }

    public WrapContentNode(Direction direction, boolean z, drX<? super IntSize, ? super LayoutDirection, IntOffset> drx) {
        this.direction = direction;
        this.unbounded = z;
        this.alignmentCallback = drx;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo37measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j) {
        final int c;
        final int c2;
        Direction direction = this.direction;
        Direction direction2 = Direction.Vertical;
        int m2475getMinWidthimpl = direction != direction2 ? 0 : Constraints.m2475getMinWidthimpl(j);
        Direction direction3 = this.direction;
        Direction direction4 = Direction.Horizontal;
        int m2474getMinHeightimpl = direction3 == direction4 ? Constraints.m2474getMinHeightimpl(j) : 0;
        int i = Integer.MAX_VALUE;
        int m2473getMaxWidthimpl = (this.direction == direction2 || !this.unbounded) ? Constraints.m2473getMaxWidthimpl(j) : Integer.MAX_VALUE;
        if (this.direction == direction4 || !this.unbounded) {
            i = Constraints.m2472getMaxHeightimpl(j);
        }
        final Placeable mo1803measureBRTryo0 = measurable.mo1803measureBRTryo0(ConstraintsKt.Constraints(m2475getMinWidthimpl, m2473getMaxWidthimpl, m2474getMinHeightimpl, i));
        c = C8657dts.c(mo1803measureBRTryo0.getWidth(), Constraints.m2475getMinWidthimpl(j), Constraints.m2473getMaxWidthimpl(j));
        c2 = C8657dts.c(mo1803measureBRTryo0.getHeight(), Constraints.m2474getMinHeightimpl(j), Constraints.m2472getMaxHeightimpl(j));
        return MeasureScope.layout$default(measureScope, c, c2, null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.foundation.layout.WrapContentNode$measure$1
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
                Placeable.PlacementScope.m1827place70tqf50$default(placementScope, mo1803measureBRTryo0, WrapContentNode.this.getAlignmentCallback().invoke(IntSize.m2542boximpl(IntSizeKt.IntSize(c - mo1803measureBRTryo0.getWidth(), c2 - mo1803measureBRTryo0.getHeight())), measureScope.getLayoutDirection()).m2537unboximpl(), 0.0f, 2, null);
            }
        }, 4, null);
    }
}
