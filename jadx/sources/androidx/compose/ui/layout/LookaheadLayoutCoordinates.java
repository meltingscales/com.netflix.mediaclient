package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import o.C8632dsu;
import o.dsT;

/* loaded from: classes.dex */
public final class LookaheadLayoutCoordinates implements LayoutCoordinates {
    private final LookaheadDelegate lookaheadDelegate;

    public LookaheadLayoutCoordinates(LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    public final NodeCoordinator getCoordinator() {
        return this.lookaheadDelegate.getCoordinator();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: getSize-YbymL2g */
    public long mo1809getSizeYbymL2g() {
        LookaheadDelegate lookaheadDelegate = this.lookaheadDelegate;
        return IntSizeKt.IntSize(lookaheadDelegate.getWidth(), lookaheadDelegate.getHeight());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public LayoutCoordinates getParentLayoutCoordinates() {
        LookaheadDelegate lookaheadDelegate;
        if (!isAttached()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        }
        NodeCoordinator wrappedBy$ui_release = getCoordinator().getLayoutNode().getOuterCoordinator$ui_release().getWrappedBy$ui_release();
        if (wrappedBy$ui_release == null || (lookaheadDelegate = wrappedBy$ui_release.getLookaheadDelegate()) == null) {
            return null;
        }
        return lookaheadDelegate.getCoordinates();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return getCoordinator().isAttached();
    }

    /* renamed from: getLookaheadOffset-F1C5BW0  reason: not valid java name */
    private final long m1818getLookaheadOffsetF1C5BW0() {
        LookaheadDelegate rootLookaheadDelegate = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
        LayoutCoordinates coordinates = rootLookaheadDelegate.getCoordinates();
        Offset.Companion companion = Offset.Companion;
        return Offset.m1141minusMKHz9U(mo1810localPositionOfR5De75A(coordinates, companion.m1149getZeroF1C5BW0()), getCoordinator().mo1810localPositionOfR5De75A(rootLookaheadDelegate.getCoordinator(), companion.m1149getZeroF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: windowToLocal-MK-Hz9U */
    public long mo1814windowToLocalMKHz9U(long j) {
        return Offset.m1142plusMKHz9U(getCoordinator().mo1814windowToLocalMKHz9U(j), m1818getLookaheadOffsetF1C5BW0());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToWindow-MK-Hz9U */
    public long mo1812localToWindowMKHz9U(long j) {
        return getCoordinator().mo1812localToWindowMKHz9U(Offset.m1142plusMKHz9U(j, m1818getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToRoot-MK-Hz9U */
    public long mo1811localToRootMKHz9U(long j) {
        return getCoordinator().mo1811localToRootMKHz9U(Offset.m1142plusMKHz9U(j, m1818getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-R5De75A */
    public long mo1810localPositionOfR5De75A(LayoutCoordinates layoutCoordinates, long j) {
        int e;
        int e2;
        int e3;
        int e4;
        if (layoutCoordinates instanceof LookaheadLayoutCoordinates) {
            LookaheadDelegate lookaheadDelegate = ((LookaheadLayoutCoordinates) layoutCoordinates).lookaheadDelegate;
            lookaheadDelegate.getCoordinator().onCoordinatesUsed$ui_release();
            LookaheadDelegate lookaheadDelegate2 = getCoordinator().findCommonAncestor$ui_release(lookaheadDelegate.getCoordinator()).getLookaheadDelegate();
            if (lookaheadDelegate2 != null) {
                long m1896positionInBjo55l4$ui_release = lookaheadDelegate.m1896positionInBjo55l4$ui_release(lookaheadDelegate2);
                e3 = dsT.e(Offset.m1137getXimpl(j));
                e4 = dsT.e(Offset.m1138getYimpl(j));
                long IntOffset = IntOffsetKt.IntOffset(e3, e4);
                long IntOffset2 = IntOffsetKt.IntOffset(IntOffset.m2533getXimpl(m1896positionInBjo55l4$ui_release) + IntOffset.m2533getXimpl(IntOffset), IntOffset.m2534getYimpl(m1896positionInBjo55l4$ui_release) + IntOffset.m2534getYimpl(IntOffset));
                long m1896positionInBjo55l4$ui_release2 = this.lookaheadDelegate.m1896positionInBjo55l4$ui_release(lookaheadDelegate2);
                long IntOffset3 = IntOffsetKt.IntOffset(IntOffset.m2533getXimpl(IntOffset2) - IntOffset.m2533getXimpl(m1896positionInBjo55l4$ui_release2), IntOffset.m2534getYimpl(IntOffset2) - IntOffset.m2534getYimpl(m1896positionInBjo55l4$ui_release2));
                return OffsetKt.Offset(IntOffset.m2533getXimpl(IntOffset3), IntOffset.m2534getYimpl(IntOffset3));
            }
            LookaheadDelegate rootLookaheadDelegate = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate);
            long m1896positionInBjo55l4$ui_release3 = lookaheadDelegate.m1896positionInBjo55l4$ui_release(rootLookaheadDelegate);
            long mo1892getPositionnOccac = rootLookaheadDelegate.mo1892getPositionnOccac();
            long IntOffset4 = IntOffsetKt.IntOffset(IntOffset.m2533getXimpl(m1896positionInBjo55l4$ui_release3) + IntOffset.m2533getXimpl(mo1892getPositionnOccac), IntOffset.m2534getYimpl(m1896positionInBjo55l4$ui_release3) + IntOffset.m2534getYimpl(mo1892getPositionnOccac));
            e = dsT.e(Offset.m1137getXimpl(j));
            e2 = dsT.e(Offset.m1138getYimpl(j));
            long IntOffset5 = IntOffsetKt.IntOffset(e, e2);
            long IntOffset6 = IntOffsetKt.IntOffset(IntOffset.m2533getXimpl(IntOffset4) + IntOffset.m2533getXimpl(IntOffset5), IntOffset.m2534getYimpl(IntOffset4) + IntOffset.m2534getYimpl(IntOffset5));
            LookaheadDelegate lookaheadDelegate3 = this.lookaheadDelegate;
            long m1896positionInBjo55l4$ui_release4 = lookaheadDelegate3.m1896positionInBjo55l4$ui_release(LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate3));
            long mo1892getPositionnOccac2 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate3).mo1892getPositionnOccac();
            long IntOffset7 = IntOffsetKt.IntOffset(IntOffset.m2533getXimpl(m1896positionInBjo55l4$ui_release4) + IntOffset.m2533getXimpl(mo1892getPositionnOccac2), IntOffset.m2534getYimpl(m1896positionInBjo55l4$ui_release4) + IntOffset.m2534getYimpl(mo1892getPositionnOccac2));
            long IntOffset8 = IntOffsetKt.IntOffset(IntOffset.m2533getXimpl(IntOffset6) - IntOffset.m2533getXimpl(IntOffset7), IntOffset.m2534getYimpl(IntOffset6) - IntOffset.m2534getYimpl(IntOffset7));
            NodeCoordinator wrappedBy$ui_release = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate).getCoordinator().getWrappedBy$ui_release();
            C8632dsu.d(wrappedBy$ui_release);
            NodeCoordinator wrappedBy$ui_release2 = rootLookaheadDelegate.getCoordinator().getWrappedBy$ui_release();
            C8632dsu.d(wrappedBy$ui_release2);
            return wrappedBy$ui_release.mo1810localPositionOfR5De75A(wrappedBy$ui_release2, OffsetKt.Offset(IntOffset.m2533getXimpl(IntOffset8), IntOffset.m2534getYimpl(IntOffset8)));
        }
        LookaheadDelegate rootLookaheadDelegate2 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
        return Offset.m1142plusMKHz9U(mo1810localPositionOfR5De75A(rootLookaheadDelegate2.getLookaheadLayoutCoordinates(), j), rootLookaheadDelegate2.getCoordinator().getCoordinates().mo1810localPositionOfR5De75A(layoutCoordinates, Offset.Companion.m1149getZeroF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Rect localBoundingBoxOf(LayoutCoordinates layoutCoordinates, boolean z) {
        return getCoordinator().localBoundingBoxOf(layoutCoordinates, z);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: transformFrom-EL8BTi8 */
    public void mo1813transformFromEL8BTi8(LayoutCoordinates layoutCoordinates, float[] fArr) {
        getCoordinator().mo1813transformFromEL8BTi8(layoutCoordinates, fArr);
    }
}
