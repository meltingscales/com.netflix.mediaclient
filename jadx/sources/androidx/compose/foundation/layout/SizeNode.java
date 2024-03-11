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
final class SizeNode extends Modifier.Node implements LayoutModifierNode {
    private boolean enforceIncoming;
    private float maxHeight;
    private float maxWidth;
    private float minHeight;
    private float minWidth;

    public /* synthetic */ SizeNode(float f, float f2, float f3, float f4, boolean z, C8627dsp c8627dsp) {
        this(f, f2, f3, f4, z);
    }

    public final void setEnforceIncoming(boolean z) {
        this.enforceIncoming = z;
    }

    /* renamed from: setMaxHeight-0680j_4  reason: not valid java name */
    public final void m304setMaxHeight0680j_4(float f) {
        this.maxHeight = f;
    }

    /* renamed from: setMaxWidth-0680j_4  reason: not valid java name */
    public final void m305setMaxWidth0680j_4(float f) {
        this.maxWidth = f;
    }

    /* renamed from: setMinHeight-0680j_4  reason: not valid java name */
    public final void m306setMinHeight0680j_4(float f) {
        this.minHeight = f;
    }

    /* renamed from: setMinWidth-0680j_4  reason: not valid java name */
    public final void m307setMinWidth0680j_4(float f) {
        this.minWidth = f;
    }

    private SizeNode(float f, float f2, float f3, float f4, boolean z) {
        this.minWidth = f;
        this.minHeight = f2;
        this.maxWidth = f3;
        this.maxHeight = f4;
        this.enforceIncoming = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
        if (r5 != Integer.MAX_VALUE) goto L11;
     */
    /* renamed from: getTargetConstraints-OenEA2s  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long m303getTargetConstraintsOenEA2s(androidx.compose.ui.unit.Density r8) {
        /*
            r7 = this;
            float r0 = r7.maxWidth
            androidx.compose.ui.unit.Dp$Companion r1 = androidx.compose.ui.unit.Dp.Companion
            float r2 = r1.m2501getUnspecifiedD9Ej5fM()
            boolean r0 = androidx.compose.ui.unit.Dp.m2494equalsimpl0(r0, r2)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            if (r0 != 0) goto L1d
            float r0 = r7.maxWidth
            int r0 = r8.mo187roundToPx0680j_4(r0)
            int r0 = o.C8653dto.e(r0, r3)
            goto L1e
        L1d:
            r0 = r2
        L1e:
            float r4 = r7.maxHeight
            float r5 = r1.m2501getUnspecifiedD9Ej5fM()
            boolean r4 = androidx.compose.ui.unit.Dp.m2494equalsimpl0(r4, r5)
            if (r4 != 0) goto L35
            float r4 = r7.maxHeight
            int r4 = r8.mo187roundToPx0680j_4(r4)
            int r4 = o.C8653dto.e(r4, r3)
            goto L36
        L35:
            r4 = r2
        L36:
            float r5 = r7.minWidth
            float r6 = r1.m2501getUnspecifiedD9Ej5fM()
            boolean r5 = androidx.compose.ui.unit.Dp.m2494equalsimpl0(r5, r6)
            if (r5 != 0) goto L53
            float r5 = r7.minWidth
            int r5 = r8.mo187roundToPx0680j_4(r5)
            int r5 = o.C8653dto.c(r5, r0)
            int r5 = o.C8653dto.e(r5, r3)
            if (r5 == r2) goto L53
            goto L54
        L53:
            r5 = r3
        L54:
            float r6 = r7.minHeight
            float r1 = r1.m2501getUnspecifiedD9Ej5fM()
            boolean r1 = androidx.compose.ui.unit.Dp.m2494equalsimpl0(r6, r1)
            if (r1 != 0) goto L71
            float r1 = r7.minHeight
            int r8 = r8.mo187roundToPx0680j_4(r1)
            int r8 = o.C8653dto.c(r8, r4)
            int r8 = o.C8653dto.e(r8, r3)
            if (r8 == r2) goto L71
            r3 = r8
        L71:
            long r0 = androidx.compose.ui.unit.ConstraintsKt.Constraints(r5, r0, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.SizeNode.m303getTargetConstraintsOenEA2s(androidx.compose.ui.unit.Density):long");
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo37measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        int i;
        int b;
        int i2;
        int b2;
        long Constraints;
        long m303getTargetConstraintsOenEA2s = m303getTargetConstraintsOenEA2s(measureScope);
        if (this.enforceIncoming) {
            Constraints = ConstraintsKt.m2484constrainN9IONVI(j, m303getTargetConstraintsOenEA2s);
        } else {
            float f = this.minWidth;
            Dp.Companion companion = Dp.Companion;
            if (!Dp.m2494equalsimpl0(f, companion.m2501getUnspecifiedD9Ej5fM())) {
                i = Constraints.m2475getMinWidthimpl(m303getTargetConstraintsOenEA2s);
            } else {
                i = C8657dts.i(Constraints.m2475getMinWidthimpl(j), Constraints.m2473getMaxWidthimpl(m303getTargetConstraintsOenEA2s));
            }
            if (!Dp.m2494equalsimpl0(this.maxWidth, companion.m2501getUnspecifiedD9Ej5fM())) {
                b = Constraints.m2473getMaxWidthimpl(m303getTargetConstraintsOenEA2s);
            } else {
                b = C8657dts.b(Constraints.m2473getMaxWidthimpl(j), Constraints.m2475getMinWidthimpl(m303getTargetConstraintsOenEA2s));
            }
            if (!Dp.m2494equalsimpl0(this.minHeight, companion.m2501getUnspecifiedD9Ej5fM())) {
                i2 = Constraints.m2474getMinHeightimpl(m303getTargetConstraintsOenEA2s);
            } else {
                i2 = C8657dts.i(Constraints.m2474getMinHeightimpl(j), Constraints.m2472getMaxHeightimpl(m303getTargetConstraintsOenEA2s));
            }
            if (!Dp.m2494equalsimpl0(this.maxHeight, companion.m2501getUnspecifiedD9Ej5fM())) {
                b2 = Constraints.m2472getMaxHeightimpl(m303getTargetConstraintsOenEA2s);
            } else {
                b2 = C8657dts.b(Constraints.m2472getMaxHeightimpl(j), Constraints.m2474getMinHeightimpl(m303getTargetConstraintsOenEA2s));
            }
            Constraints = ConstraintsKt.Constraints(i, b, i2, b2);
        }
        final Placeable mo1803measureBRTryo0 = measurable.mo1803measureBRTryo0(Constraints);
        return MeasureScope.layout$default(measureScope, mo1803measureBRTryo0.getWidth(), mo1803measureBRTryo0.getHeight(), null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.foundation.layout.SizeNode$measure$1
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
        long m303getTargetConstraintsOenEA2s = m303getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m2471getHasFixedWidthimpl(m303getTargetConstraintsOenEA2s)) {
            return Constraints.m2473getMaxWidthimpl(m303getTargetConstraintsOenEA2s);
        }
        return ConstraintsKt.m2486constrainWidthK40F9xA(m303getTargetConstraintsOenEA2s, intrinsicMeasurable.minIntrinsicWidth(i));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long m303getTargetConstraintsOenEA2s = m303getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m2470getHasFixedHeightimpl(m303getTargetConstraintsOenEA2s)) {
            return Constraints.m2472getMaxHeightimpl(m303getTargetConstraintsOenEA2s);
        }
        return ConstraintsKt.m2485constrainHeightK40F9xA(m303getTargetConstraintsOenEA2s, intrinsicMeasurable.minIntrinsicHeight(i));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long m303getTargetConstraintsOenEA2s = m303getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m2471getHasFixedWidthimpl(m303getTargetConstraintsOenEA2s)) {
            return Constraints.m2473getMaxWidthimpl(m303getTargetConstraintsOenEA2s);
        }
        return ConstraintsKt.m2486constrainWidthK40F9xA(m303getTargetConstraintsOenEA2s, intrinsicMeasurable.maxIntrinsicWidth(i));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long m303getTargetConstraintsOenEA2s = m303getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m2470getHasFixedHeightimpl(m303getTargetConstraintsOenEA2s)) {
            return Constraints.m2472getMaxHeightimpl(m303getTargetConstraintsOenEA2s);
        }
        return ConstraintsKt.m2485constrainHeightK40F9xA(m303getTargetConstraintsOenEA2s, intrinsicMeasurable.maxIntrinsicHeight(i));
    }
}
