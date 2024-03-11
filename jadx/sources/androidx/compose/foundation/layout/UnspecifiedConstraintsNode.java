package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import o.C8627dsp;
import o.C8657dts;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
final class UnspecifiedConstraintsNode extends Modifier.Node implements LayoutModifierNode {
    private float minHeight;
    private float minWidth;

    public /* synthetic */ UnspecifiedConstraintsNode(float f, float f2, C8627dsp c8627dsp) {
        this(f, f2);
    }

    /* renamed from: setMinHeight-0680j_4  reason: not valid java name */
    public final void m308setMinHeight0680j_4(float f) {
        this.minHeight = f;
    }

    /* renamed from: setMinWidth-0680j_4  reason: not valid java name */
    public final void m309setMinWidth0680j_4(float f) {
        this.minWidth = f;
    }

    private UnspecifiedConstraintsNode(float f, float f2) {
        this.minWidth = f;
        this.minHeight = f2;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo37measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        int m2475getMinWidthimpl;
        int m2474getMinHeightimpl;
        int i;
        int i2;
        float f = this.minWidth;
        Dp.Companion companion = Dp.Companion;
        if (!Dp.m2494equalsimpl0(f, companion.m2501getUnspecifiedD9Ej5fM()) && Constraints.m2475getMinWidthimpl(j) == 0) {
            i2 = C8657dts.i(measureScope.mo187roundToPx0680j_4(this.minWidth), Constraints.m2473getMaxWidthimpl(j));
            m2475getMinWidthimpl = C8657dts.b(i2, 0);
        } else {
            m2475getMinWidthimpl = Constraints.m2475getMinWidthimpl(j);
        }
        int m2473getMaxWidthimpl = Constraints.m2473getMaxWidthimpl(j);
        if (!Dp.m2494equalsimpl0(this.minHeight, companion.m2501getUnspecifiedD9Ej5fM()) && Constraints.m2474getMinHeightimpl(j) == 0) {
            i = C8657dts.i(measureScope.mo187roundToPx0680j_4(this.minHeight), Constraints.m2472getMaxHeightimpl(j));
            m2474getMinHeightimpl = C8657dts.b(i, 0);
        } else {
            m2474getMinHeightimpl = Constraints.m2474getMinHeightimpl(j);
        }
        final Placeable mo1803measureBRTryo0 = measurable.mo1803measureBRTryo0(ConstraintsKt.Constraints(m2475getMinWidthimpl, m2473getMaxWidthimpl, m2474getMinHeightimpl, Constraints.m2472getMaxHeightimpl(j)));
        return MeasureScope.layout$default(measureScope, mo1803measureBRTryo0.getWidth(), mo1803measureBRTryo0.getHeight(), null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.foundation.layout.UnspecifiedConstraintsNode$measure$1
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

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        int b;
        b = C8657dts.b(intrinsicMeasurable.minIntrinsicWidth(i), !Dp.m2494equalsimpl0(this.minWidth, Dp.Companion.m2501getUnspecifiedD9Ej5fM()) ? intrinsicMeasureScope.mo187roundToPx0680j_4(this.minWidth) : 0);
        return b;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        int b;
        b = C8657dts.b(intrinsicMeasurable.maxIntrinsicWidth(i), !Dp.m2494equalsimpl0(this.minWidth, Dp.Companion.m2501getUnspecifiedD9Ej5fM()) ? intrinsicMeasureScope.mo187roundToPx0680j_4(this.minWidth) : 0);
        return b;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        int b;
        b = C8657dts.b(intrinsicMeasurable.minIntrinsicHeight(i), !Dp.m2494equalsimpl0(this.minHeight, Dp.Companion.m2501getUnspecifiedD9Ej5fM()) ? intrinsicMeasureScope.mo187roundToPx0680j_4(this.minHeight) : 0);
        return b;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        int b;
        b = C8657dts.b(intrinsicMeasurable.maxIntrinsicHeight(i), !Dp.m2494equalsimpl0(this.minHeight, Dp.Companion.m2501getUnspecifiedD9Ej5fM()) ? intrinsicMeasureScope.mo187roundToPx0680j_4(this.minHeight) : 0);
        return b;
    }
}
