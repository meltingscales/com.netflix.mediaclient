package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import o.C8657dts;
import o.dpR;
import o.drM;
import o.dsT;

/* loaded from: classes.dex */
final class FillNode extends Modifier.Node implements LayoutModifierNode {
    private Direction direction;
    private float fraction;

    public final void setDirection(Direction direction) {
        this.direction = direction;
    }

    public final void setFraction(float f) {
        this.fraction = f;
    }

    public FillNode(Direction direction, float f) {
        this.direction = direction;
        this.fraction = f;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo37measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        int m2475getMinWidthimpl;
        int m2473getMaxWidthimpl;
        int m2472getMaxHeightimpl;
        int i;
        int e;
        int e2;
        if (Constraints.m2469getHasBoundedWidthimpl(j) && this.direction != Direction.Vertical) {
            e2 = dsT.e(Constraints.m2473getMaxWidthimpl(j) * this.fraction);
            m2475getMinWidthimpl = C8657dts.c(e2, Constraints.m2475getMinWidthimpl(j), Constraints.m2473getMaxWidthimpl(j));
            m2473getMaxWidthimpl = m2475getMinWidthimpl;
        } else {
            m2475getMinWidthimpl = Constraints.m2475getMinWidthimpl(j);
            m2473getMaxWidthimpl = Constraints.m2473getMaxWidthimpl(j);
        }
        if (Constraints.m2468getHasBoundedHeightimpl(j) && this.direction != Direction.Horizontal) {
            e = dsT.e(Constraints.m2472getMaxHeightimpl(j) * this.fraction);
            i = C8657dts.c(e, Constraints.m2474getMinHeightimpl(j), Constraints.m2472getMaxHeightimpl(j));
            m2472getMaxHeightimpl = i;
        } else {
            int m2474getMinHeightimpl = Constraints.m2474getMinHeightimpl(j);
            m2472getMaxHeightimpl = Constraints.m2472getMaxHeightimpl(j);
            i = m2474getMinHeightimpl;
        }
        final Placeable mo1803measureBRTryo0 = measurable.mo1803measureBRTryo0(ConstraintsKt.Constraints(m2475getMinWidthimpl, m2473getMaxWidthimpl, i, m2472getMaxHeightimpl));
        return MeasureScope.layout$default(measureScope, mo1803measureBRTryo0.getWidth(), mo1803measureBRTryo0.getHeight(), null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.foundation.layout.FillNode$measure$1
            /* JADX INFO: Access modifiers changed from: package-private */
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
                Placeable.PlacementScope.placeRelative$default(placementScope, Placeable.this, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }
}
