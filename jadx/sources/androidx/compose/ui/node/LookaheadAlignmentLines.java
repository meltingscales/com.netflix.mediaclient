package androidx.compose.ui.node;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.unit.IntOffset;
import java.util.Map;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class LookaheadAlignmentLines extends AlignmentLines {
    public LookaheadAlignmentLines(AlignmentLinesOwner alignmentLinesOwner) {
        super(alignmentLinesOwner, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.node.AlignmentLines
    public Map<AlignmentLine, Integer> getAlignmentLinesMap(NodeCoordinator nodeCoordinator) {
        LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        C8632dsu.d(lookaheadDelegate);
        return lookaheadDelegate.getMeasureResult$ui_release().getAlignmentLines();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.node.AlignmentLines
    public int getPositionFor(NodeCoordinator nodeCoordinator, AlignmentLine alignmentLine) {
        LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        C8632dsu.d(lookaheadDelegate);
        return lookaheadDelegate.get(alignmentLine);
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    /* renamed from: calculatePositionInParent-R5De75A */
    protected long mo1843calculatePositionInParentR5De75A(NodeCoordinator nodeCoordinator, long j) {
        LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        C8632dsu.d(lookaheadDelegate);
        long mo1892getPositionnOccac = lookaheadDelegate.mo1892getPositionnOccac();
        return Offset.m1142plusMKHz9U(OffsetKt.Offset(IntOffset.m2533getXimpl(mo1892getPositionnOccac), IntOffset.m2534getYimpl(mo1892getPositionnOccac)), j);
    }
}
