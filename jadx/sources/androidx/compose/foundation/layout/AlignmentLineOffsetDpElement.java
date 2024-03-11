package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class AlignmentLineOffsetDpElement extends ModifierNodeElement<AlignmentLineOffsetDpNode> {
    private final float after;
    private final AlignmentLine alignmentLine;
    private final float before;
    private final drM<InspectorInfo, dpR> inspectorInfo;

    public /* synthetic */ AlignmentLineOffsetDpElement(AlignmentLine alignmentLine, float f, float f2, drM drm, C8627dsp c8627dsp) {
        this(alignmentLine, f, f2, drm);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AlignmentLineOffsetDpElement(AlignmentLine alignmentLine, float f, float f2, drM<? super InspectorInfo, dpR> drm) {
        this.alignmentLine = alignmentLine;
        this.before = f;
        this.after = f2;
        this.inspectorInfo = drm;
        if ((f < 0.0f && !Dp.m2494equalsimpl0(f, Dp.Companion.m2501getUnspecifiedD9Ej5fM())) || (f2 < 0.0f && !Dp.m2494equalsimpl0(f2, Dp.Companion.m2501getUnspecifiedD9Ej5fM()))) {
            throw new IllegalArgumentException("Padding from alignment line must be a non-negative number".toString());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public AlignmentLineOffsetDpNode create() {
        return new AlignmentLineOffsetDpNode(this.alignmentLine, this.before, this.after, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(AlignmentLineOffsetDpNode alignmentLineOffsetDpNode) {
        alignmentLineOffsetDpNode.setAlignmentLine(this.alignmentLine);
        alignmentLineOffsetDpNode.m229setBefore0680j_4(this.before);
        alignmentLineOffsetDpNode.m228setAfter0680j_4(this.after);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement = obj instanceof AlignmentLineOffsetDpElement ? (AlignmentLineOffsetDpElement) obj : null;
        if (alignmentLineOffsetDpElement == null) {
            return false;
        }
        return C8632dsu.c(this.alignmentLine, alignmentLineOffsetDpElement.alignmentLine) && Dp.m2494equalsimpl0(this.before, alignmentLineOffsetDpElement.before) && Dp.m2494equalsimpl0(this.after, alignmentLineOffsetDpElement.after);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = this.alignmentLine.hashCode();
        return (((hashCode * 31) + Dp.m2495hashCodeimpl(this.before)) * 31) + Dp.m2495hashCodeimpl(this.after);
    }
}
