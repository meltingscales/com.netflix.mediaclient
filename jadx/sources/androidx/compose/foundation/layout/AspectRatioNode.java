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
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import o.dpR;
import o.drM;
import o.dsT;

/* loaded from: classes.dex */
final class AspectRatioNode extends Modifier.Node implements LayoutModifierNode {
    private float aspectRatio;
    private boolean matchHeightConstraintsFirst;

    public final void setAspectRatio(float f) {
        this.aspectRatio = f;
    }

    public final void setMatchHeightConstraintsFirst(boolean z) {
        this.matchHeightConstraintsFirst = z;
    }

    public AspectRatioNode(float f, boolean z) {
        this.aspectRatio = f;
        this.matchHeightConstraintsFirst = z;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo37measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        long m234findSizeToXhtMw = m234findSizeToXhtMw(j);
        if (!IntSize.m2545equalsimpl0(m234findSizeToXhtMw, IntSize.Companion.m2551getZeroYbymL2g())) {
            j = Constraints.Companion.m2480fixedJhjzzOo(IntSize.m2547getWidthimpl(m234findSizeToXhtMw), IntSize.m2546getHeightimpl(m234findSizeToXhtMw));
        }
        final Placeable mo1803measureBRTryo0 = measurable.mo1803measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, mo1803measureBRTryo0.getWidth(), mo1803measureBRTryo0.getHeight(), null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.foundation.layout.AspectRatioNode$measure$1
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
        int e;
        if (i != Integer.MAX_VALUE) {
            e = dsT.e(i * this.aspectRatio);
            return e;
        }
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        int e;
        if (i != Integer.MAX_VALUE) {
            e = dsT.e(i * this.aspectRatio);
            return e;
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        int e;
        if (i != Integer.MAX_VALUE) {
            e = dsT.e(i / this.aspectRatio);
            return e;
        }
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        int e;
        if (i != Integer.MAX_VALUE) {
            e = dsT.e(i / this.aspectRatio);
            return e;
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    /* renamed from: findSize-ToXhtMw  reason: not valid java name */
    private final long m234findSizeToXhtMw(long j) {
        if (!this.matchHeightConstraintsFirst) {
            long m238tryMaxWidthJN0ABg$default = m238tryMaxWidthJN0ABg$default(this, j, false, 1, null);
            IntSize.Companion companion = IntSize.Companion;
            if (!IntSize.m2545equalsimpl0(m238tryMaxWidthJN0ABg$default, companion.m2551getZeroYbymL2g())) {
                return m238tryMaxWidthJN0ABg$default;
            }
            long m236tryMaxHeightJN0ABg$default = m236tryMaxHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m2545equalsimpl0(m236tryMaxHeightJN0ABg$default, companion.m2551getZeroYbymL2g())) {
                return m236tryMaxHeightJN0ABg$default;
            }
            long m242tryMinWidthJN0ABg$default = m242tryMinWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m2545equalsimpl0(m242tryMinWidthJN0ABg$default, companion.m2551getZeroYbymL2g())) {
                return m242tryMinWidthJN0ABg$default;
            }
            long m240tryMinHeightJN0ABg$default = m240tryMinHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m2545equalsimpl0(m240tryMinHeightJN0ABg$default, companion.m2551getZeroYbymL2g())) {
                return m240tryMinHeightJN0ABg$default;
            }
            long m237tryMaxWidthJN0ABg = m237tryMaxWidthJN0ABg(j, false);
            if (!IntSize.m2545equalsimpl0(m237tryMaxWidthJN0ABg, companion.m2551getZeroYbymL2g())) {
                return m237tryMaxWidthJN0ABg;
            }
            long m235tryMaxHeightJN0ABg = m235tryMaxHeightJN0ABg(j, false);
            if (!IntSize.m2545equalsimpl0(m235tryMaxHeightJN0ABg, companion.m2551getZeroYbymL2g())) {
                return m235tryMaxHeightJN0ABg;
            }
            long m241tryMinWidthJN0ABg = m241tryMinWidthJN0ABg(j, false);
            if (!IntSize.m2545equalsimpl0(m241tryMinWidthJN0ABg, companion.m2551getZeroYbymL2g())) {
                return m241tryMinWidthJN0ABg;
            }
            long m239tryMinHeightJN0ABg = m239tryMinHeightJN0ABg(j, false);
            if (!IntSize.m2545equalsimpl0(m239tryMinHeightJN0ABg, companion.m2551getZeroYbymL2g())) {
                return m239tryMinHeightJN0ABg;
            }
        } else {
            long m236tryMaxHeightJN0ABg$default2 = m236tryMaxHeightJN0ABg$default(this, j, false, 1, null);
            IntSize.Companion companion2 = IntSize.Companion;
            if (!IntSize.m2545equalsimpl0(m236tryMaxHeightJN0ABg$default2, companion2.m2551getZeroYbymL2g())) {
                return m236tryMaxHeightJN0ABg$default2;
            }
            long m238tryMaxWidthJN0ABg$default2 = m238tryMaxWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m2545equalsimpl0(m238tryMaxWidthJN0ABg$default2, companion2.m2551getZeroYbymL2g())) {
                return m238tryMaxWidthJN0ABg$default2;
            }
            long m240tryMinHeightJN0ABg$default2 = m240tryMinHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m2545equalsimpl0(m240tryMinHeightJN0ABg$default2, companion2.m2551getZeroYbymL2g())) {
                return m240tryMinHeightJN0ABg$default2;
            }
            long m242tryMinWidthJN0ABg$default2 = m242tryMinWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m2545equalsimpl0(m242tryMinWidthJN0ABg$default2, companion2.m2551getZeroYbymL2g())) {
                return m242tryMinWidthJN0ABg$default2;
            }
            long m235tryMaxHeightJN0ABg2 = m235tryMaxHeightJN0ABg(j, false);
            if (!IntSize.m2545equalsimpl0(m235tryMaxHeightJN0ABg2, companion2.m2551getZeroYbymL2g())) {
                return m235tryMaxHeightJN0ABg2;
            }
            long m237tryMaxWidthJN0ABg2 = m237tryMaxWidthJN0ABg(j, false);
            if (!IntSize.m2545equalsimpl0(m237tryMaxWidthJN0ABg2, companion2.m2551getZeroYbymL2g())) {
                return m237tryMaxWidthJN0ABg2;
            }
            long m239tryMinHeightJN0ABg2 = m239tryMinHeightJN0ABg(j, false);
            if (!IntSize.m2545equalsimpl0(m239tryMinHeightJN0ABg2, companion2.m2551getZeroYbymL2g())) {
                return m239tryMinHeightJN0ABg2;
            }
            long m241tryMinWidthJN0ABg2 = m241tryMinWidthJN0ABg(j, false);
            if (!IntSize.m2545equalsimpl0(m241tryMinWidthJN0ABg2, companion2.m2551getZeroYbymL2g())) {
                return m241tryMinWidthJN0ABg2;
            }
        }
        return IntSize.Companion.m2551getZeroYbymL2g();
    }

    /* renamed from: tryMaxWidth-JN-0ABg$default  reason: not valid java name */
    static /* synthetic */ long m238tryMaxWidthJN0ABg$default(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m237tryMaxWidthJN0ABg(j, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
        r1 = o.dsT.e(r0 / r3.aspectRatio);
     */
    /* renamed from: tryMaxWidth-JN-0ABg  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long m237tryMaxWidthJN0ABg(long r4, boolean r6) {
        /*
            r3 = this;
            int r0 = androidx.compose.ui.unit.Constraints.m2473getMaxWidthimpl(r4)
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L20
            float r1 = (float) r0
            float r2 = r3.aspectRatio
            float r1 = r1 / r2
            int r1 = o.dsN.d(r1)
            if (r1 <= 0) goto L20
            long r0 = androidx.compose.ui.unit.IntSizeKt.IntSize(r0, r1)
            if (r6 == 0) goto L1f
            boolean r4 = androidx.compose.ui.unit.ConstraintsKt.m2487isSatisfiedBy4WqzIAM(r4, r0)
            if (r4 == 0) goto L20
        L1f:
            return r0
        L20:
            androidx.compose.ui.unit.IntSize$Companion r4 = androidx.compose.ui.unit.IntSize.Companion
            long r4 = r4.m2551getZeroYbymL2g()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.AspectRatioNode.m237tryMaxWidthJN0ABg(long, boolean):long");
    }

    /* renamed from: tryMaxHeight-JN-0ABg$default  reason: not valid java name */
    static /* synthetic */ long m236tryMaxHeightJN0ABg$default(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m235tryMaxHeightJN0ABg(j, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
        r1 = o.dsT.e(r0 * r3.aspectRatio);
     */
    /* renamed from: tryMaxHeight-JN-0ABg  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long m235tryMaxHeightJN0ABg(long r4, boolean r6) {
        /*
            r3 = this;
            int r0 = androidx.compose.ui.unit.Constraints.m2472getMaxHeightimpl(r4)
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L20
            float r1 = (float) r0
            float r2 = r3.aspectRatio
            float r1 = r1 * r2
            int r1 = o.dsN.d(r1)
            if (r1 <= 0) goto L20
            long r0 = androidx.compose.ui.unit.IntSizeKt.IntSize(r1, r0)
            if (r6 == 0) goto L1f
            boolean r4 = androidx.compose.ui.unit.ConstraintsKt.m2487isSatisfiedBy4WqzIAM(r4, r0)
            if (r4 == 0) goto L20
        L1f:
            return r0
        L20:
            androidx.compose.ui.unit.IntSize$Companion r4 = androidx.compose.ui.unit.IntSize.Companion
            long r4 = r4.m2551getZeroYbymL2g()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.AspectRatioNode.m235tryMaxHeightJN0ABg(long, boolean):long");
    }

    /* renamed from: tryMinWidth-JN-0ABg$default  reason: not valid java name */
    static /* synthetic */ long m242tryMinWidthJN0ABg$default(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m241tryMinWidthJN0ABg(j, z);
    }

    /* renamed from: tryMinWidth-JN-0ABg  reason: not valid java name */
    private final long m241tryMinWidthJN0ABg(long j, boolean z) {
        int e;
        int m2475getMinWidthimpl = Constraints.m2475getMinWidthimpl(j);
        e = dsT.e(m2475getMinWidthimpl / this.aspectRatio);
        if (e > 0) {
            long IntSize = IntSizeKt.IntSize(m2475getMinWidthimpl, e);
            if (!z || ConstraintsKt.m2487isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.Companion.m2551getZeroYbymL2g();
    }

    /* renamed from: tryMinHeight-JN-0ABg$default  reason: not valid java name */
    static /* synthetic */ long m240tryMinHeightJN0ABg$default(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m239tryMinHeightJN0ABg(j, z);
    }

    /* renamed from: tryMinHeight-JN-0ABg  reason: not valid java name */
    private final long m239tryMinHeightJN0ABg(long j, boolean z) {
        int e;
        int m2474getMinHeightimpl = Constraints.m2474getMinHeightimpl(j);
        e = dsT.e(m2474getMinHeightimpl * this.aspectRatio);
        if (e > 0) {
            long IntSize = IntSizeKt.IntSize(e, m2474getMinHeightimpl);
            if (!z || ConstraintsKt.m2487isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.Companion.m2551getZeroYbymL2g();
    }
}
