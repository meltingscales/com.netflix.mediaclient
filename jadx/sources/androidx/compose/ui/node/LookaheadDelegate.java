package androidx.compose.ui.node;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.LinkedHashMap;
import java.util.Map;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public abstract class LookaheadDelegate extends LookaheadCapablePlaceable implements Measurable {
    private MeasureResult _measureResult;
    private final NodeCoordinator coordinator;
    private Map<AlignmentLine, Integer> oldAlignmentLines;
    private long position = IntOffset.Companion.m2538getZeronOccac();
    private final LookaheadLayoutCoordinates lookaheadLayoutCoordinates = new LookaheadLayoutCoordinates(this);
    private final Map<AlignmentLine, Integer> cachedAlignmentLinesMap = new LinkedHashMap();

    public final Map<AlignmentLine, Integer> getCachedAlignmentLinesMap() {
        return this.cachedAlignmentLinesMap;
    }

    public LayoutCoordinates getCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    public final NodeCoordinator getCoordinator() {
        return this.coordinator;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    public final LookaheadLayoutCoordinates getLookaheadLayoutCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* renamed from: getPosition-nOcc-ac */
    public long mo1892getPositionnOccac() {
        return this.position;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return true;
    }

    /* renamed from: setPosition--gyyYBs */
    public void m1897setPositiongyyYBs(long j) {
        this.position = j;
    }

    /* renamed from: access$setMeasurementConstraints-BRTryo0 */
    public static final /* synthetic */ void m1893access$setMeasurementConstraintsBRTryo0(LookaheadDelegate lookaheadDelegate, long j) {
        lookaheadDelegate.m1826setMeasurementConstraintsBRTryo0(j);
    }

    public static final /* synthetic */ void access$set_measureResult(LookaheadDelegate lookaheadDelegate, MeasureResult measureResult) {
        lookaheadDelegate.set_measureResult(measureResult);
    }

    public LookaheadDelegate(NodeCoordinator nodeCoordinator) {
        this.coordinator = nodeCoordinator;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getChild() {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        if (wrapped$ui_release != null) {
            return wrapped$ui_release.getLookaheadDelegate();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public MeasureResult getMeasureResult$ui_release() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.".toString());
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.coordinator.getFontScale();
    }

    public LayoutNode getLayoutNode() {
        return this.coordinator.getLayoutNode();
    }

    public AlignmentLinesOwner getAlignmentLinesOwner() {
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = this.coordinator.getLayoutNode().getLayoutDelegate$ui_release().getLookaheadAlignmentLinesOwner$ui_release();
        C8632dsu.d(lookaheadAlignmentLinesOwner$ui_release);
        return lookaheadAlignmentLinesOwner$ui_release;
    }

    public final void set_measureResult(MeasureResult measureResult) {
        dpR dpr;
        Map<AlignmentLine, Integer> map;
        if (measureResult != null) {
            m1825setMeasuredSizeozmzZPI(IntSizeKt.IntSize(measureResult.getWidth(), measureResult.getHeight()));
            dpr = dpR.c;
        } else {
            dpr = null;
        }
        if (dpr == null) {
            m1825setMeasuredSizeozmzZPI(IntSize.Companion.m2551getZeroYbymL2g());
        }
        if (!C8632dsu.c(this._measureResult, measureResult) && measureResult != null && ((((map = this.oldAlignmentLines) != null && !map.isEmpty()) || (!measureResult.getAlignmentLines().isEmpty())) && !C8632dsu.c(measureResult.getAlignmentLines(), this.oldAlignmentLines))) {
            getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            Map map2 = this.oldAlignmentLines;
            if (map2 == null) {
                map2 = new LinkedHashMap();
                this.oldAlignmentLines = map2;
            }
            map2.clear();
            map2.putAll(measureResult.getAlignmentLines());
        }
        this._measureResult = measureResult;
    }

    public final int getCachedAlignmentLine$ui_release(AlignmentLine alignmentLine) {
        Integer num = this.cachedAlignmentLinesMap.get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void replace$ui_release() {
        mo1804placeAtf8xVGno(mo1892getPositionnOccac(), 0.0f, null);
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public final void mo1804placeAtf8xVGno(long j, float f, drM<? super GraphicsLayerScope, dpR> drm) {
        m1894placeSelfgyyYBs(j);
        if (isShallowPlacing$ui_release()) {
            return;
        }
        placeChildren();
    }

    /* renamed from: placeSelf--gyyYBs */
    private final void m1894placeSelfgyyYBs(long j) {
        if (IntOffset.m2532equalsimpl0(mo1892getPositionnOccac(), j)) {
            return;
        }
        m1897setPositiongyyYBs(j);
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLayoutNode().getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
        if (lookaheadPassDelegate$ui_release != null) {
            lookaheadPassDelegate$ui_release.notifyChildrenUsingCoordinatesWhilePlacing();
        }
        invalidateAlignmentLinesFromPositionChange(this.coordinator);
    }

    /* renamed from: placeSelfApparentToRealOffset--gyyYBs$ui_release */
    public final void m1895placeSelfApparentToRealOffsetgyyYBs$ui_release(long j) {
        long m1822getApparentToRealOffsetnOccac = m1822getApparentToRealOffsetnOccac();
        m1894placeSelfgyyYBs(IntOffsetKt.IntOffset(IntOffset.m2533getXimpl(j) + IntOffset.m2533getXimpl(m1822getApparentToRealOffsetnOccac), IntOffset.m2534getYimpl(j) + IntOffset.m2534getYimpl(m1822getApparentToRealOffsetnOccac)));
    }

    protected void placeChildren() {
        getMeasureResult$ui_release().placeChildren();
    }

    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        return this.coordinator.getParentData();
    }

    public int minIntrinsicWidth(int i) {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        C8632dsu.d(wrapped$ui_release);
        LookaheadDelegate lookaheadDelegate = wrapped$ui_release.getLookaheadDelegate();
        C8632dsu.d(lookaheadDelegate);
        return lookaheadDelegate.minIntrinsicWidth(i);
    }

    public int maxIntrinsicWidth(int i) {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        C8632dsu.d(wrapped$ui_release);
        LookaheadDelegate lookaheadDelegate = wrapped$ui_release.getLookaheadDelegate();
        C8632dsu.d(lookaheadDelegate);
        return lookaheadDelegate.maxIntrinsicWidth(i);
    }

    public int minIntrinsicHeight(int i) {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        C8632dsu.d(wrapped$ui_release);
        LookaheadDelegate lookaheadDelegate = wrapped$ui_release.getLookaheadDelegate();
        C8632dsu.d(lookaheadDelegate);
        return lookaheadDelegate.minIntrinsicHeight(i);
    }

    public int maxIntrinsicHeight(int i) {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        C8632dsu.d(wrapped$ui_release);
        LookaheadDelegate lookaheadDelegate = wrapped$ui_release.getLookaheadDelegate();
        C8632dsu.d(lookaheadDelegate);
        return lookaheadDelegate.maxIntrinsicHeight(i);
    }

    /* renamed from: positionIn-Bjo55l4$ui_release */
    public final long m1896positionInBjo55l4$ui_release(LookaheadDelegate lookaheadDelegate) {
        long m2538getZeronOccac = IntOffset.Companion.m2538getZeronOccac();
        LookaheadDelegate lookaheadDelegate2 = this;
        while (!C8632dsu.c(lookaheadDelegate2, lookaheadDelegate)) {
            long mo1892getPositionnOccac = lookaheadDelegate2.mo1892getPositionnOccac();
            m2538getZeronOccac = IntOffsetKt.IntOffset(IntOffset.m2533getXimpl(m2538getZeronOccac) + IntOffset.m2533getXimpl(mo1892getPositionnOccac), IntOffset.m2534getYimpl(m2538getZeronOccac) + IntOffset.m2534getYimpl(mo1892getPositionnOccac));
            NodeCoordinator wrappedBy$ui_release = lookaheadDelegate2.coordinator.getWrappedBy$ui_release();
            C8632dsu.d(wrappedBy$ui_release);
            lookaheadDelegate2 = wrappedBy$ui_release.getLookaheadDelegate();
            C8632dsu.d(lookaheadDelegate2);
        }
        return m2538getZeronOccac;
    }
}
