package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import o.dpR;
import o.drM;
import o.dsT;

/* loaded from: classes.dex */
final class PainterNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode {
    private Alignment alignment;
    private float alpha;
    private ColorFilter colorFilter;
    private ContentScale contentScale;
    private Painter painter;
    private boolean sizeToIntrinsics;

    public final Painter getPainter() {
        return this.painter;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    public final void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public final void setAlpha(float f) {
        this.alpha = f;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    public final void setContentScale(ContentScale contentScale) {
        this.contentScale = contentScale;
    }

    public final void setPainter(Painter painter) {
        this.painter = painter;
    }

    public final void setSizeToIntrinsics(boolean z) {
        this.sizeToIntrinsics = z;
    }

    public PainterNode(Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter) {
        this.painter = painter;
        this.sizeToIntrinsics = z;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f;
        this.colorFilter = colorFilter;
    }

    private final boolean getUseIntrinsicSize() {
        return this.sizeToIntrinsics && this.painter.mo1570getIntrinsicSizeNHjbRc() != Size.Companion.m1181getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo37measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        final Placeable mo1803measureBRTryo0 = measurable.mo1803measureBRTryo0(m1071modifyConstraintsZezNO4M(j));
        return MeasureScope.layout$default(measureScope, mo1803measureBRTryo0.getWidth(), mo1803measureBRTryo0.getHeight(), null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.ui.draw.PainterNode$measure$1
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
        if (getUseIntrinsicSize()) {
            long m1071modifyConstraintsZezNO4M = m1071modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
            return Math.max(Constraints.m2475getMinWidthimpl(m1071modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicWidth(i));
        }
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (getUseIntrinsicSize()) {
            long m1071modifyConstraintsZezNO4M = m1071modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
            return Math.max(Constraints.m2475getMinWidthimpl(m1071modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicWidth(i));
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (getUseIntrinsicSize()) {
            long m1071modifyConstraintsZezNO4M = m1071modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
            return Math.max(Constraints.m2474getMinHeightimpl(m1071modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicHeight(i));
        }
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (getUseIntrinsicSize()) {
            long m1071modifyConstraintsZezNO4M = m1071modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
            return Math.max(Constraints.m2474getMinHeightimpl(m1071modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicHeight(i));
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    /* renamed from: calculateScaledSize-E7KxVPU  reason: not valid java name */
    private final long m1068calculateScaledSizeE7KxVPU(long j) {
        float m1176getWidthimpl;
        float m1174getHeightimpl;
        if (getUseIntrinsicSize()) {
            if (!m1070hasSpecifiedAndFiniteWidthuvyYCjk(this.painter.mo1570getIntrinsicSizeNHjbRc())) {
                m1176getWidthimpl = Size.m1176getWidthimpl(j);
            } else {
                m1176getWidthimpl = Size.m1176getWidthimpl(this.painter.mo1570getIntrinsicSizeNHjbRc());
            }
            if (!m1069hasSpecifiedAndFiniteHeightuvyYCjk(this.painter.mo1570getIntrinsicSizeNHjbRc())) {
                m1174getHeightimpl = Size.m1174getHeightimpl(j);
            } else {
                m1174getHeightimpl = Size.m1174getHeightimpl(this.painter.mo1570getIntrinsicSizeNHjbRc());
            }
            long Size = SizeKt.Size(m1176getWidthimpl, m1174getHeightimpl);
            if (Size.m1176getWidthimpl(j) != 0.0f && Size.m1174getHeightimpl(j) != 0.0f) {
                return ScaleFactorKt.m1842timesUQTWf7w(Size, this.contentScale.mo1794computeScaleFactorH7hwNQA(Size, j));
            }
            return Size.Companion.m1182getZeroNHjbRc();
        }
        return j;
    }

    /* renamed from: modifyConstraints-ZezNO4M  reason: not valid java name */
    private final long m1071modifyConstraintsZezNO4M(long j) {
        int m2475getMinWidthimpl;
        int m2474getMinHeightimpl;
        int e;
        int e2;
        boolean z = true;
        boolean z2 = Constraints.m2469getHasBoundedWidthimpl(j) && Constraints.m2468getHasBoundedHeightimpl(j);
        if (!Constraints.m2471getHasFixedWidthimpl(j) || !Constraints.m2470getHasFixedHeightimpl(j)) {
            z = false;
        }
        if ((!getUseIntrinsicSize() && z2) || z) {
            return Constraints.m2464copyZbe2FdA$default(j, Constraints.m2473getMaxWidthimpl(j), 0, Constraints.m2472getMaxHeightimpl(j), 0, 10, null);
        }
        long mo1570getIntrinsicSizeNHjbRc = this.painter.mo1570getIntrinsicSizeNHjbRc();
        if (m1070hasSpecifiedAndFiniteWidthuvyYCjk(mo1570getIntrinsicSizeNHjbRc)) {
            m2475getMinWidthimpl = dsT.e(Size.m1176getWidthimpl(mo1570getIntrinsicSizeNHjbRc));
        } else {
            m2475getMinWidthimpl = Constraints.m2475getMinWidthimpl(j);
        }
        if (m1069hasSpecifiedAndFiniteHeightuvyYCjk(mo1570getIntrinsicSizeNHjbRc)) {
            m2474getMinHeightimpl = dsT.e(Size.m1174getHeightimpl(mo1570getIntrinsicSizeNHjbRc));
        } else {
            m2474getMinHeightimpl = Constraints.m2474getMinHeightimpl(j);
        }
        long m1068calculateScaledSizeE7KxVPU = m1068calculateScaledSizeE7KxVPU(SizeKt.Size(ConstraintsKt.m2486constrainWidthK40F9xA(j, m2475getMinWidthimpl), ConstraintsKt.m2485constrainHeightK40F9xA(j, m2474getMinHeightimpl)));
        e = dsT.e(Size.m1176getWidthimpl(m1068calculateScaledSizeE7KxVPU));
        int m2486constrainWidthK40F9xA = ConstraintsKt.m2486constrainWidthK40F9xA(j, e);
        e2 = dsT.e(Size.m1174getHeightimpl(m1068calculateScaledSizeE7KxVPU));
        return Constraints.m2464copyZbe2FdA$default(j, m2486constrainWidthK40F9xA, 0, ConstraintsKt.m2485constrainHeightK40F9xA(j, e2), 0, 10, null);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        float m1176getWidthimpl;
        float m1174getHeightimpl;
        long m1182getZeroNHjbRc;
        int e;
        int e2;
        int e3;
        int e4;
        long mo1570getIntrinsicSizeNHjbRc = this.painter.mo1570getIntrinsicSizeNHjbRc();
        if (m1070hasSpecifiedAndFiniteWidthuvyYCjk(mo1570getIntrinsicSizeNHjbRc)) {
            m1176getWidthimpl = Size.m1176getWidthimpl(mo1570getIntrinsicSizeNHjbRc);
        } else {
            m1176getWidthimpl = Size.m1176getWidthimpl(contentDrawScope.mo1562getSizeNHjbRc());
        }
        if (m1069hasSpecifiedAndFiniteHeightuvyYCjk(mo1570getIntrinsicSizeNHjbRc)) {
            m1174getHeightimpl = Size.m1174getHeightimpl(mo1570getIntrinsicSizeNHjbRc);
        } else {
            m1174getHeightimpl = Size.m1174getHeightimpl(contentDrawScope.mo1562getSizeNHjbRc());
        }
        long Size = SizeKt.Size(m1176getWidthimpl, m1174getHeightimpl);
        if (Size.m1176getWidthimpl(contentDrawScope.mo1562getSizeNHjbRc()) != 0.0f && Size.m1174getHeightimpl(contentDrawScope.mo1562getSizeNHjbRc()) != 0.0f) {
            m1182getZeroNHjbRc = ScaleFactorKt.m1842timesUQTWf7w(Size, this.contentScale.mo1794computeScaleFactorH7hwNQA(Size, contentDrawScope.mo1562getSizeNHjbRc()));
        } else {
            m1182getZeroNHjbRc = Size.Companion.m1182getZeroNHjbRc();
        }
        long j = m1182getZeroNHjbRc;
        Alignment alignment = this.alignment;
        e = dsT.e(Size.m1176getWidthimpl(j));
        e2 = dsT.e(Size.m1174getHeightimpl(j));
        long IntSize = IntSizeKt.IntSize(e, e2);
        e3 = dsT.e(Size.m1176getWidthimpl(contentDrawScope.mo1562getSizeNHjbRc()));
        e4 = dsT.e(Size.m1174getHeightimpl(contentDrawScope.mo1562getSizeNHjbRc()));
        long mo1056alignKFBX0sM = alignment.mo1056alignKFBX0sM(IntSize, IntSizeKt.IntSize(e3, e4), contentDrawScope.getLayoutDirection());
        float m2533getXimpl = IntOffset.m2533getXimpl(mo1056alignKFBX0sM);
        float m2534getYimpl = IntOffset.m2534getYimpl(mo1056alignKFBX0sM);
        contentDrawScope.getDrawContext().getTransform().translate(m2533getXimpl, m2534getYimpl);
        this.painter.m1574drawx_KDEd0(contentDrawScope, j, this.alpha, this.colorFilter);
        contentDrawScope.getDrawContext().getTransform().translate(-m2533getXimpl, -m2534getYimpl);
        contentDrawScope.drawContent();
    }

    /* renamed from: hasSpecifiedAndFiniteWidth-uvyYCjk  reason: not valid java name */
    private final boolean m1070hasSpecifiedAndFiniteWidthuvyYCjk(long j) {
        if (!Size.m1173equalsimpl0(j, Size.Companion.m1181getUnspecifiedNHjbRc())) {
            float m1176getWidthimpl = Size.m1176getWidthimpl(j);
            if (!Float.isInfinite(m1176getWidthimpl) && !Float.isNaN(m1176getWidthimpl)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hasSpecifiedAndFiniteHeight-uvyYCjk  reason: not valid java name */
    private final boolean m1069hasSpecifiedAndFiniteHeightuvyYCjk(long j) {
        if (!Size.m1173equalsimpl0(j, Size.Companion.m1181getUnspecifiedNHjbRc())) {
            float m1174getHeightimpl = Size.m1174getHeightimpl(j);
            if (!Float.isInfinite(m1174getHeightimpl) && !Float.isNaN(m1174getHeightimpl)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }
}
