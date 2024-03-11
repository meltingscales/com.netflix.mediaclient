package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.LayoutModifierNode;
import o.C8627dsp;

/* loaded from: classes5.dex */
final class AlignmentLineOffsetDpNode extends Modifier.Node implements LayoutModifierNode {
    private float after;
    private AlignmentLine alignmentLine;
    private float before;

    public /* synthetic */ AlignmentLineOffsetDpNode(AlignmentLine alignmentLine, float f, float f2, C8627dsp c8627dsp) {
        this(alignmentLine, f, f2);
    }

    /* renamed from: setAfter-0680j_4  reason: not valid java name */
    public final void m228setAfter0680j_4(float f) {
        this.after = f;
    }

    public final void setAlignmentLine(AlignmentLine alignmentLine) {
        this.alignmentLine = alignmentLine;
    }

    /* renamed from: setBefore-0680j_4  reason: not valid java name */
    public final void m229setBefore0680j_4(float f) {
        this.before = f;
    }

    private AlignmentLineOffsetDpNode(AlignmentLine alignmentLine, float f, float f2) {
        this.alignmentLine = alignmentLine;
        this.before = f;
        this.after = f2;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo37measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        MeasureResult m224alignmentLineOffsetMeasuretjqqzMA;
        m224alignmentLineOffsetMeasuretjqqzMA = AlignmentLineKt.m224alignmentLineOffsetMeasuretjqqzMA(measureScope, this.alignmentLine, this.before, this.after, measurable, j);
        return m224alignmentLineOffsetMeasuretjqqzMA;
    }
}
