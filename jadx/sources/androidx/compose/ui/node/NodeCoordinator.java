package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.MutableRectKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Ref;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes.dex */
public abstract class NodeCoordinator extends LookaheadCapablePlaceable implements Measurable, LayoutCoordinates, OwnerScope {
    private MeasureResult _measureResult;
    private MutableRect _rectCache;
    private boolean isClipping;
    private boolean lastLayerDrawingWasSkipped;
    private OwnedLayer layer;
    private drM<? super GraphicsLayerScope, dpR> layerBlock;
    private LayerPositionalProperties layerPositionalProperties;
    private final LayoutNode layoutNode;
    private Map<AlignmentLine, Integer> oldAlignmentLines;
    private boolean released;
    private NodeCoordinator wrapped;
    private NodeCoordinator wrappedBy;
    private float zIndex;
    public static final Companion Companion = new Companion(null);
    private static final drM<NodeCoordinator, dpR> onCommitAffectingLayerParams = new drM<NodeCoordinator, dpR>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayerParams$1
        @Override // o.drM
        public /* bridge */ /* synthetic */ dpR invoke(NodeCoordinator nodeCoordinator) {
            invoke2(nodeCoordinator);
            return dpR.c;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(NodeCoordinator nodeCoordinator) {
            LayerPositionalProperties layerPositionalProperties;
            LayerPositionalProperties layerPositionalProperties2;
            LayerPositionalProperties layerPositionalProperties3;
            if (nodeCoordinator.isValidOwnerScope()) {
                layerPositionalProperties = nodeCoordinator.layerPositionalProperties;
                if (layerPositionalProperties == null) {
                    NodeCoordinator.updateLayerParameters$default(nodeCoordinator, false, 1, null);
                    return;
                }
                layerPositionalProperties2 = NodeCoordinator.tmpLayerPositionalProperties;
                layerPositionalProperties2.copyFrom(layerPositionalProperties);
                NodeCoordinator.updateLayerParameters$default(nodeCoordinator, false, 1, null);
                layerPositionalProperties3 = NodeCoordinator.tmpLayerPositionalProperties;
                if (layerPositionalProperties3.hasSameValuesAs(layerPositionalProperties)) {
                    return;
                }
                LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
                LayoutNodeLayoutDelegate layoutDelegate$ui_release = layoutNode.getLayoutDelegate$ui_release();
                if (layoutDelegate$ui_release.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
                    if (layoutDelegate$ui_release.getCoordinatesAccessedDuringModifierPlacement() || layoutDelegate$ui_release.getCoordinatesAccessedDuringPlacement()) {
                        LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
                    }
                    layoutDelegate$ui_release.getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
                }
                Owner owner$ui_release = layoutNode.getOwner$ui_release();
                if (owner$ui_release != null) {
                    owner$ui_release.requestOnPositionedCallback(layoutNode);
                }
            }
        }
    };
    private static final drM<NodeCoordinator, dpR> onCommitAffectingLayer = new drM<NodeCoordinator, dpR>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayer$1
        @Override // o.drM
        public /* bridge */ /* synthetic */ dpR invoke(NodeCoordinator nodeCoordinator) {
            invoke2(nodeCoordinator);
            return dpR.c;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(NodeCoordinator nodeCoordinator) {
            OwnedLayer layer = nodeCoordinator.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
        }
    };
    private static final ReusableGraphicsLayerScope graphicsLayerScope = new ReusableGraphicsLayerScope();
    private static final LayerPositionalProperties tmpLayerPositionalProperties = new LayerPositionalProperties();
    private static final float[] tmpMatrix = Matrix.m1370constructorimpl$default(null, 1, null);
    private static final HitTestSource PointerInputSource = new HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$PointerInputSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(LayoutNode layoutNode) {
            return true;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: childHitTest-YqVAtuI  reason: not valid java name */
        public void mo1931childHitTestYqVAtuI(LayoutNode layoutNode, long j, HitTestResult hitTestResult, boolean z, boolean z2) {
            layoutNode.m1869hitTestM_7yMNQ$ui_release(j, hitTestResult, z, z2);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: entityType-OLwlOKw  reason: not valid java name */
        public int mo1932entityTypeOLwlOKw() {
            return NodeKind.m1935constructorimpl(16);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(Modifier.Node node) {
            int m1935constructorimpl = NodeKind.m1935constructorimpl(16);
            MutableVector mutableVector = null;
            while (node != null) {
                if (node instanceof PointerInputModifierNode) {
                    if (((PointerInputModifierNode) node).interceptOutOfBoundsChildEvents()) {
                        return true;
                    }
                } else if ((node.getKindSet$ui_release() & m1935constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                    int i = 0;
                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                        if ((delegate$ui_release.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                            i++;
                            if (i == 1) {
                                node = delegate$ui_release;
                            } else {
                                if (mutableVector == null) {
                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node != null) {
                                    mutableVector.add(node);
                                    node = null;
                                }
                                mutableVector.add(delegate$ui_release);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                node = DelegatableNodeKt.pop(mutableVector);
            }
            return false;
        }
    };
    private static final HitTestSource SemanticsSource = new HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$SemanticsSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(Modifier.Node node) {
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(LayoutNode layoutNode) {
            SemanticsConfiguration collapsedSemantics$ui_release = layoutNode.getCollapsedSemantics$ui_release();
            return !(collapsedSemantics$ui_release != null && collapsedSemantics$ui_release.isClearingSemantics());
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: childHitTest-YqVAtuI */
        public void mo1931childHitTestYqVAtuI(LayoutNode layoutNode, long j, HitTestResult hitTestResult, boolean z, boolean z2) {
            layoutNode.m1870hitTestSemanticsM_7yMNQ$ui_release(j, hitTestResult, z, z2);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: entityType-OLwlOKw */
        public int mo1932entityTypeOLwlOKw() {
            return NodeKind.m1935constructorimpl(8);
        }
    };
    private Density layerDensity = getLayoutNode().getDensity();
    private LayoutDirection layerLayoutDirection = getLayoutNode().getLayoutDirection();
    private float lastLayerAlpha = 0.8f;
    private long position = IntOffset.Companion.m2538getZeronOccac();
    private final drM<Canvas, dpR> drawBlock = new drM<Canvas, dpR>() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$1
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(1);
        }

        @Override // o.drM
        public /* bridge */ /* synthetic */ dpR invoke(Canvas canvas) {
            invoke2(canvas);
            return dpR.c;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(final Canvas canvas) {
            OwnerSnapshotObserver snapshotObserver;
            drM drm;
            if (NodeCoordinator.this.getLayoutNode().isPlaced()) {
                snapshotObserver = NodeCoordinator.this.getSnapshotObserver();
                NodeCoordinator nodeCoordinator = NodeCoordinator.this;
                drm = NodeCoordinator.onCommitAffectingLayer;
                final NodeCoordinator nodeCoordinator2 = NodeCoordinator.this;
                snapshotObserver.observeReads$ui_release(nodeCoordinator, drm, new drO<dpR>() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // o.drO
                    public /* bridge */ /* synthetic */ dpR invoke() {
                        invoke2();
                        return dpR.c;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        NodeCoordinator.this.drawContainedDrawModifiers(canvas);
                    }
                });
                NodeCoordinator.this.lastLayerDrawingWasSkipped = false;
                return;
            }
            NodeCoordinator.this.lastLayerDrawingWasSkipped = true;
        }
    };
    private final drO<dpR> invalidateParentLayer = new drO<dpR>() { // from class: androidx.compose.ui.node.NodeCoordinator$invalidateParentLayer$1
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(0);
        }

        @Override // o.drO
        public /* bridge */ /* synthetic */ dpR invoke() {
            invoke2();
            return dpR.c;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            NodeCoordinator wrappedBy$ui_release = NodeCoordinator.this.getWrappedBy$ui_release();
            if (wrappedBy$ui_release != null) {
                wrappedBy$ui_release.invalidateLayer();
            }
        }
    };

    /* loaded from: classes.dex */
    public interface HitTestSource {
        /* renamed from: childHitTest-YqVAtuI */
        void mo1931childHitTestYqVAtuI(LayoutNode layoutNode, long j, HitTestResult hitTestResult, boolean z, boolean z2);

        /* renamed from: entityType-OLwlOKw */
        int mo1932entityTypeOLwlOKw();

        boolean interceptOutOfBoundsChildEvents(Modifier.Node node);

        boolean shouldHitTestChildren(LayoutNode layoutNode);
    }

    public abstract void ensureLookaheadDelegateCreated();

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getChild() {
        return this.wrapped;
    }

    public LayoutCoordinates getCoordinates() {
        return this;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    public final boolean getLastLayerDrawingWasSkipped$ui_release() {
        return this.lastLayerDrawingWasSkipped;
    }

    public final OwnedLayer getLayer() {
        return this.layer;
    }

    public LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public abstract LookaheadDelegate getLookaheadDelegate();

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* renamed from: getPosition-nOcc-ac */
    public long mo1892getPositionnOccac() {
        return this.position;
    }

    public abstract Modifier.Node getTail();

    public final NodeCoordinator getWrapped$ui_release() {
        return this.wrapped;
    }

    public final NodeCoordinator getWrappedBy$ui_release() {
        return this.wrappedBy;
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    protected abstract void setLookaheadDelegate(LookaheadDelegate lookaheadDelegate);

    /* renamed from: setPosition--gyyYBs  reason: not valid java name */
    protected void m1928setPositiongyyYBs(long j) {
        this.position = j;
    }

    public final void setWrapped$ui_release(NodeCoordinator nodeCoordinator) {
        this.wrapped = nodeCoordinator;
    }

    public final void setWrappedBy$ui_release(NodeCoordinator nodeCoordinator) {
        this.wrappedBy = nodeCoordinator;
    }

    public NodeCoordinator(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return getLayoutNode().getLayoutDirection();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return getLayoutNode().getDensity().getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return getLayoutNode().getDensity().getFontScale();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node headNode(boolean z) {
        Modifier.Node tail;
        if (getLayoutNode().getOuterCoordinator$ui_release() == this) {
            return getLayoutNode().getNodes$ui_release().getHead$ui_release();
        }
        if (z) {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (nodeCoordinator != null && (tail = nodeCoordinator.getTail()) != null) {
                return tail.getChild$ui_release();
            }
        } else {
            NodeCoordinator nodeCoordinator2 = this.wrappedBy;
            if (nodeCoordinator2 != null) {
                return nodeCoordinator2.getTail();
            }
        }
        return null;
    }

    /* renamed from: hasNode-H91voCI  reason: not valid java name */
    private final boolean m1911hasNodeH91voCI(int i) {
        Modifier.Node headNode = headNode(NodeKindKt.m1940getIncludeSelfInTraversalH91voCI(i));
        return headNode != null && DelegatableNodeKt.m1852has64DMado(headNode, i);
    }

    /* renamed from: head-H91voCI  reason: not valid java name */
    public final Modifier.Node m1924headH91voCI(int i) {
        boolean m1940getIncludeSelfInTraversalH91voCI = NodeKindKt.m1940getIncludeSelfInTraversalH91voCI(i);
        Modifier.Node tail = getTail();
        if (!m1940getIncludeSelfInTraversalH91voCI && (tail = tail.getParent$ui_release()) == null) {
            return null;
        }
        for (Modifier.Node headNode = headNode(m1940getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui_release() & i) != 0; headNode = headNode.getChild$ui_release()) {
            if ((headNode.getKindSet$ui_release() & i) != 0) {
                return headNode;
            }
            if (headNode == tail) {
                return null;
            }
        }
        return null;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: getSize-YbymL2g */
    public final long mo1809getSizeYbymL2g() {
        return m1823getMeasuredSizeYbymL2g();
    }

    public final boolean isTransparent() {
        if (this.layer == null || this.lastLayerAlpha > 0.0f) {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (nodeCoordinator != null) {
                return nodeCoordinator.isTransparent();
            }
            return false;
        }
        return true;
    }

    public AlignmentLinesOwner getAlignmentLinesOwner() {
        return getLayoutNode().getLayoutDelegate$ui_release().getAlignmentLinesOwner$ui_release();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void replace$ui_release() {
        mo1804placeAtf8xVGno(mo1892getPositionnOccac(), this.zIndex, this.layerBlock);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return getTail().isAttached();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public MeasureResult getMeasureResult$ui_release() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier".toString());
    }

    public void setMeasureResult$ui_release(MeasureResult measureResult) {
        MeasureResult measureResult2 = this._measureResult;
        if (measureResult != measureResult2) {
            this._measureResult = measureResult;
            if (measureResult2 == null || measureResult.getWidth() != measureResult2.getWidth() || measureResult.getHeight() != measureResult2.getHeight()) {
                onMeasureResultChanged(measureResult.getWidth(), measureResult.getHeight());
            }
            Map<AlignmentLine, Integer> map = this.oldAlignmentLines;
            if (((map == null || map.isEmpty()) && !(!measureResult.getAlignmentLines().isEmpty())) || C8632dsu.c(measureResult.getAlignmentLines(), this.oldAlignmentLines)) {
                return;
            }
            getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            Map map2 = this.oldAlignmentLines;
            if (map2 == null) {
                map2 = new LinkedHashMap();
                this.oldAlignmentLines = map2;
            }
            map2.clear();
            map2.putAll(measureResult.getAlignmentLines());
        }
    }

    protected void onMeasureResultChanged(int i, int i2) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo1945resizeozmzZPI(IntSizeKt.IntSize(i, i2));
        } else {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (nodeCoordinator != null) {
                nodeCoordinator.invalidateLayer();
            }
        }
        m1825setMeasuredSizeozmzZPI(IntSizeKt.IntSize(i, i2));
        updateLayerParameters(false);
        int m1935constructorimpl = NodeKind.m1935constructorimpl(4);
        boolean m1940getIncludeSelfInTraversalH91voCI = NodeKindKt.m1940getIncludeSelfInTraversalH91voCI(m1935constructorimpl);
        Modifier.Node tail = getTail();
        if (m1940getIncludeSelfInTraversalH91voCI || (tail = tail.getParent$ui_release()) != null) {
            for (Modifier.Node headNode = headNode(m1940getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui_release() & m1935constructorimpl) != 0; headNode = headNode.getChild$ui_release()) {
                if ((headNode.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                    Modifier.Node node = headNode;
                    MutableVector mutableVector = null;
                    while (node != null) {
                        if (node instanceof DrawModifierNode) {
                            ((DrawModifierNode) node).onMeasureResultChanged();
                        } else if ((node.getKindSet$ui_release() & m1935constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                            int i3 = 0;
                            for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                if ((delegate$ui_release.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        node = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (node != null) {
                                            mutableVector.add(node);
                                            node = null;
                                        }
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                            }
                            if (i3 == 1) {
                            }
                        }
                        node = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if (headNode == tail) {
                    break;
                }
            }
        }
        Owner owner$ui_release = getLayoutNode().getOwner$ui_release();
        if (owner$ui_release != null) {
            owner$ui_release.onLayoutChange(getLayoutNode());
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Object] */
    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        if (getLayoutNode().getNodes$ui_release().m1905hasH91voCI$ui_release(NodeKind.m1935constructorimpl(64))) {
            getTail();
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            for (Modifier.Node tail$ui_release = getLayoutNode().getNodes$ui_release().getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
                if ((NodeKind.m1935constructorimpl(64) & tail$ui_release.getKindSet$ui_release()) != 0) {
                    int m1935constructorimpl = NodeKind.m1935constructorimpl(64);
                    MutableVector mutableVector = null;
                    Modifier.Node node = tail$ui_release;
                    while (node != null) {
                        if (node instanceof ParentDataModifierNode) {
                            objectRef.d = ((ParentDataModifierNode) node).modifyParentData(getLayoutNode().getDensity(), objectRef.d);
                        } else if ((node.getKindSet$ui_release() & m1935constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                            int i = 0;
                            for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                if ((delegate$ui_release.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        node = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (node != null) {
                                            mutableVector.add(node);
                                            node = null;
                                        }
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        node = DelegatableNodeKt.pop(mutableVector);
                    }
                }
            }
            return objectRef.d;
        }
        return null;
    }

    public final void onCoordinatesUsed$ui_release() {
        getLayoutNode().getLayoutDelegate$ui_release().onCoordinatesUsed();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates getParentLayoutCoordinates() {
        if (!isAttached()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        }
        onCoordinatesUsed$ui_release();
        return getLayoutNode().getOuterCoordinator$ui_release().wrappedBy;
    }

    protected final MutableRect getRectCache() {
        MutableRect mutableRect = this._rectCache;
        if (mutableRect == null) {
            MutableRect mutableRect2 = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
            this._rectCache = mutableRect2;
            return mutableRect2;
        }
        return mutableRect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OwnerSnapshotObserver getSnapshotObserver() {
        return LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver();
    }

    /* renamed from: getLastMeasurementConstraints-msEJaDk$ui_release  reason: not valid java name */
    public final long m1922getLastMeasurementConstraintsmsEJaDk$ui_release() {
        return m1824getMeasurementConstraintsmsEJaDk();
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo1804placeAtf8xVGno(long j, float f, drM<? super GraphicsLayerScope, dpR> drm) {
        m1915placeSelff8xVGno(j, f, drm);
    }

    /* renamed from: placeSelf-f8xVGno  reason: not valid java name */
    private final void m1915placeSelff8xVGno(long j, float f, drM<? super GraphicsLayerScope, dpR> drm) {
        updateLayerBlock$default(this, drm, false, 2, null);
        if (!IntOffset.m2532equalsimpl0(mo1892getPositionnOccac(), j)) {
            m1928setPositiongyyYBs(j);
            getLayoutNode().getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.mo1944movegyyYBs(j);
            } else {
                NodeCoordinator nodeCoordinator = this.wrappedBy;
                if (nodeCoordinator != null) {
                    nodeCoordinator.invalidateLayer();
                }
            }
            invalidateAlignmentLinesFromPositionChange(this);
            Owner owner$ui_release = getLayoutNode().getOwner$ui_release();
            if (owner$ui_release != null) {
                owner$ui_release.onLayoutChange(getLayoutNode());
            }
        }
        this.zIndex = f;
    }

    /* renamed from: placeSelfApparentToRealOffset-f8xVGno  reason: not valid java name */
    public final void m1927placeSelfApparentToRealOffsetf8xVGno(long j, float f, drM<? super GraphicsLayerScope, dpR> drm) {
        long m1822getApparentToRealOffsetnOccac = m1822getApparentToRealOffsetnOccac();
        m1915placeSelff8xVGno(IntOffsetKt.IntOffset(IntOffset.m2533getXimpl(j) + IntOffset.m2533getXimpl(m1822getApparentToRealOffsetnOccac), IntOffset.m2534getYimpl(j) + IntOffset.m2534getYimpl(m1822getApparentToRealOffsetnOccac)), f, drm);
    }

    public final void draw(Canvas canvas) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.drawLayer(canvas);
            return;
        }
        float m2533getXimpl = IntOffset.m2533getXimpl(mo1892getPositionnOccac());
        float m2534getYimpl = IntOffset.m2534getYimpl(mo1892getPositionnOccac());
        canvas.translate(m2533getXimpl, m2534getYimpl);
        drawContainedDrawModifiers(canvas);
        canvas.translate(-m2533getXimpl, -m2534getYimpl);
    }

    public void performDraw(Canvas canvas) {
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.draw(canvas);
        }
    }

    public static /* synthetic */ void updateLayerBlock$default(NodeCoordinator nodeCoordinator, drM drm, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        nodeCoordinator.updateLayerBlock(drm, z);
    }

    public final void updateLayerBlock(drM<? super GraphicsLayerScope, dpR> drm, boolean z) {
        Owner owner$ui_release;
        LayoutNode layoutNode = getLayoutNode();
        boolean z2 = (!z && this.layerBlock == drm && C8632dsu.c(this.layerDensity, layoutNode.getDensity()) && this.layerLayoutDirection == layoutNode.getLayoutDirection()) ? false : true;
        this.layerBlock = drm;
        this.layerDensity = layoutNode.getDensity();
        this.layerLayoutDirection = layoutNode.getLayoutDirection();
        if (!layoutNode.isAttached() || drm == null) {
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.destroy();
                layoutNode.setInnerLayerCoordinatorIsDirty$ui_release(true);
                this.invalidateParentLayer.invoke();
                if (isAttached() && (owner$ui_release = layoutNode.getOwner$ui_release()) != null) {
                    owner$ui_release.onLayoutChange(layoutNode);
                }
            }
            this.layer = null;
            this.lastLayerDrawingWasSkipped = false;
        } else if (this.layer != null) {
            if (z2) {
                updateLayerParameters$default(this, false, 1, null);
            }
        } else {
            OwnedLayer createLayer = LayoutNodeKt.requireOwner(layoutNode).createLayer(this.drawBlock, this.invalidateParentLayer);
            createLayer.mo1945resizeozmzZPI(m1823getMeasuredSizeYbymL2g());
            createLayer.mo1944movegyyYBs(mo1892getPositionnOccac());
            this.layer = createLayer;
            updateLayerParameters$default(this, false, 1, null);
            layoutNode.setInnerLayerCoordinatorIsDirty$ui_release(true);
            this.invalidateParentLayer.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void updateLayerParameters$default(NodeCoordinator nodeCoordinator, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        nodeCoordinator.updateLayerParameters(z);
    }

    private final void updateLayerParameters(boolean z) {
        Owner owner$ui_release;
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer == null) {
            if (this.layerBlock != null) {
                throw new IllegalStateException("null layer with a non-null layerBlock".toString());
            }
            return;
        }
        final drM<? super GraphicsLayerScope, dpR> drm = this.layerBlock;
        if (drm == null) {
            throw new IllegalStateException("updateLayerParameters requires a non-null layerBlock".toString());
        }
        ReusableGraphicsLayerScope reusableGraphicsLayerScope = graphicsLayerScope;
        reusableGraphicsLayerScope.reset();
        reusableGraphicsLayerScope.setGraphicsDensity$ui_release(getLayoutNode().getDensity());
        reusableGraphicsLayerScope.m1429setSizeuvyYCjk(IntSizeKt.m2553toSizeozmzZPI(mo1809getSizeYbymL2g()));
        getSnapshotObserver().observeReads$ui_release(this, onCommitAffectingLayerParams, new drO<dpR>() { // from class: androidx.compose.ui.node.NodeCoordinator$updateLayerParameters$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // o.drO
            public /* bridge */ /* synthetic */ dpR invoke() {
                invoke2();
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ReusableGraphicsLayerScope reusableGraphicsLayerScope2;
                drM<GraphicsLayerScope, dpR> drm2 = drm;
                reusableGraphicsLayerScope2 = NodeCoordinator.graphicsLayerScope;
                drm2.invoke(reusableGraphicsLayerScope2);
            }
        });
        LayerPositionalProperties layerPositionalProperties = this.layerPositionalProperties;
        if (layerPositionalProperties == null) {
            layerPositionalProperties = new LayerPositionalProperties();
            this.layerPositionalProperties = layerPositionalProperties;
        }
        layerPositionalProperties.copyFrom(reusableGraphicsLayerScope);
        ownedLayer.updateLayerProperties(reusableGraphicsLayerScope, getLayoutNode().getLayoutDirection(), getLayoutNode().getDensity());
        this.isClipping = reusableGraphicsLayerScope.getClip();
        this.lastLayerAlpha = reusableGraphicsLayerScope.getAlpha();
        if (!z || (owner$ui_release = getLayoutNode().getOwner$ui_release()) == null) {
            return;
        }
        owner$ui_release.onLayoutChange(getLayoutNode());
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return (this.layer == null || this.released || !getLayoutNode().isAttached()) ? false : true;
    }

    /* renamed from: getMinimumTouchTargetSize-NH-jbRc  reason: not valid java name */
    public final long m1923getMinimumTouchTargetSizeNHjbRc() {
        return this.layerDensity.mo194toSizeXkaWNTQ(getLayoutNode().getViewConfiguration().mo1873getMinimumTouchTargetSizeMYxV2XQ());
    }

    /* renamed from: hitTest-YqVAtuI  reason: not valid java name */
    public final void m1925hitTestYqVAtuI(HitTestSource hitTestSource, long j, HitTestResult hitTestResult, boolean z, boolean z2) {
        Modifier.Node m1924headH91voCI = m1924headH91voCI(hitTestSource.mo1932entityTypeOLwlOKw());
        if (!m1930withinLayerBoundsk4lQ0M(j)) {
            if (z) {
                float m1920distanceInMinimumTouchTargettz77jQw = m1920distanceInMinimumTouchTargettz77jQw(j, m1923getMinimumTouchTargetSizeNHjbRc());
                if (Float.isInfinite(m1920distanceInMinimumTouchTargettz77jQw) || Float.isNaN(m1920distanceInMinimumTouchTargettz77jQw) || !hitTestResult.isHitInMinimumTouchTargetBetter(m1920distanceInMinimumTouchTargettz77jQw, false)) {
                    return;
                }
                m1913hitNearJHbHoSQ(m1924headH91voCI, hitTestSource, j, hitTestResult, z, false, m1920distanceInMinimumTouchTargettz77jQw);
            }
        } else if (m1924headH91voCI == null) {
            mo1863hitTestChildYqVAtuI(hitTestSource, j, hitTestResult, z, z2);
        } else if (m1926isPointerInBoundsk4lQ0M(j)) {
            m1912hit1hIXUjU(m1924headH91voCI, hitTestSource, j, hitTestResult, z, z2);
        } else {
            float m1920distanceInMinimumTouchTargettz77jQw2 = !z ? Float.POSITIVE_INFINITY : m1920distanceInMinimumTouchTargettz77jQw(j, m1923getMinimumTouchTargetSizeNHjbRc());
            if (!Float.isInfinite(m1920distanceInMinimumTouchTargettz77jQw2) && !Float.isNaN(m1920distanceInMinimumTouchTargettz77jQw2)) {
                if (hitTestResult.isHitInMinimumTouchTargetBetter(m1920distanceInMinimumTouchTargettz77jQw2, z2)) {
                    m1913hitNearJHbHoSQ(m1924headH91voCI, hitTestSource, j, hitTestResult, z, z2, m1920distanceInMinimumTouchTargettz77jQw2);
                    return;
                }
            }
            m1916speculativeHitJHbHoSQ(m1924headH91voCI, hitTestSource, j, hitTestResult, z, z2, m1920distanceInMinimumTouchTargettz77jQw2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hit-1hIXUjU  reason: not valid java name */
    public final void m1912hit1hIXUjU(final Modifier.Node node, final HitTestSource hitTestSource, final long j, final HitTestResult hitTestResult, final boolean z, final boolean z2) {
        if (node == null) {
            mo1863hitTestChildYqVAtuI(hitTestSource, j, hitTestResult, z, z2);
        } else {
            hitTestResult.hit(node, z2, new drO<dpR>() { // from class: androidx.compose.ui.node.NodeCoordinator$hit$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                public /* bridge */ /* synthetic */ dpR invoke() {
                    invoke2();
                    return dpR.c;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Modifier.Node m1934nextUntilhw7D004;
                    NodeCoordinator nodeCoordinator = NodeCoordinator.this;
                    m1934nextUntilhw7D004 = NodeCoordinatorKt.m1934nextUntilhw7D004(node, hitTestSource.mo1932entityTypeOLwlOKw(), NodeKind.m1935constructorimpl(2));
                    nodeCoordinator.m1912hit1hIXUjU(m1934nextUntilhw7D004, hitTestSource, j, hitTestResult, z, z2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hitNear-JHbHoSQ  reason: not valid java name */
    public final void m1913hitNearJHbHoSQ(final Modifier.Node node, final HitTestSource hitTestSource, final long j, final HitTestResult hitTestResult, final boolean z, final boolean z2, final float f) {
        if (node == null) {
            mo1863hitTestChildYqVAtuI(hitTestSource, j, hitTestResult, z, z2);
        } else {
            hitTestResult.hitInMinimumTouchTarget(node, f, z2, new drO<dpR>() { // from class: androidx.compose.ui.node.NodeCoordinator$hitNear$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                public /* bridge */ /* synthetic */ dpR invoke() {
                    invoke2();
                    return dpR.c;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Modifier.Node m1934nextUntilhw7D004;
                    NodeCoordinator nodeCoordinator = NodeCoordinator.this;
                    m1934nextUntilhw7D004 = NodeCoordinatorKt.m1934nextUntilhw7D004(node, hitTestSource.mo1932entityTypeOLwlOKw(), NodeKind.m1935constructorimpl(2));
                    nodeCoordinator.m1913hitNearJHbHoSQ(m1934nextUntilhw7D004, hitTestSource, j, hitTestResult, z, z2, f);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: speculativeHit-JHbHoSQ  reason: not valid java name */
    public final void m1916speculativeHitJHbHoSQ(final Modifier.Node node, final HitTestSource hitTestSource, final long j, final HitTestResult hitTestResult, final boolean z, final boolean z2, final float f) {
        if (node == null) {
            mo1863hitTestChildYqVAtuI(hitTestSource, j, hitTestResult, z, z2);
        } else if (hitTestSource.interceptOutOfBoundsChildEvents(node)) {
            hitTestResult.speculativeHit(node, f, z2, new drO<dpR>() { // from class: androidx.compose.ui.node.NodeCoordinator$speculativeHit$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                public /* bridge */ /* synthetic */ dpR invoke() {
                    invoke2();
                    return dpR.c;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Modifier.Node m1934nextUntilhw7D004;
                    NodeCoordinator nodeCoordinator = NodeCoordinator.this;
                    m1934nextUntilhw7D004 = NodeCoordinatorKt.m1934nextUntilhw7D004(node, hitTestSource.mo1932entityTypeOLwlOKw(), NodeKind.m1935constructorimpl(2));
                    nodeCoordinator.m1916speculativeHitJHbHoSQ(m1934nextUntilhw7D004, hitTestSource, j, hitTestResult, z, z2, f);
                }
            });
        } else {
            m1916speculativeHitJHbHoSQ(NodeCoordinatorKt.m1933access$nextUntilhw7D004(node, hitTestSource.mo1932entityTypeOLwlOKw(), NodeKind.m1935constructorimpl(2)), hitTestSource, j, hitTestResult, z, z2, f);
        }
    }

    /* renamed from: hitTestChild-YqVAtuI */
    public void mo1863hitTestChildYqVAtuI(HitTestSource hitTestSource, long j, HitTestResult hitTestResult, boolean z, boolean z2) {
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.m1925hitTestYqVAtuI(hitTestSource, nodeCoordinator.m1921fromParentPositionMKHz9U(j), hitTestResult, z, z2);
        }
    }

    public final Rect touchBoundsInRoot() {
        if (!isAttached()) {
            return Rect.Companion.getZero();
        }
        LayoutCoordinates findRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        MutableRect rectCache = getRectCache();
        long m1919calculateMinimumTouchTargetPaddingE7KxVPU = m1919calculateMinimumTouchTargetPaddingE7KxVPU(m1923getMinimumTouchTargetSizeNHjbRc());
        rectCache.setLeft(-Size.m1176getWidthimpl(m1919calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setTop(-Size.m1174getHeightimpl(m1919calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setRight(getMeasuredWidth() + Size.m1176getWidthimpl(m1919calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setBottom(getMeasuredHeight() + Size.m1174getHeightimpl(m1919calculateMinimumTouchTargetPaddingE7KxVPU));
        NodeCoordinator nodeCoordinator = this;
        while (nodeCoordinator != findRootCoordinates) {
            nodeCoordinator.rectInParent$ui_release(rectCache, false, true);
            if (rectCache.isEmpty()) {
                return Rect.Companion.getZero();
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            C8632dsu.d(nodeCoordinator);
        }
        return MutableRectKt.toRect(rectCache);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: windowToLocal-MK-Hz9U */
    public long mo1814windowToLocalMKHz9U(long j) {
        if (!isAttached()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        }
        LayoutCoordinates findRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        return mo1810localPositionOfR5De75A(findRootCoordinates, Offset.m1141minusMKHz9U(LayoutNodeKt.requireOwner(getLayoutNode()).mo1947calculateLocalPositionMKHz9U(j), LayoutCoordinatesKt.positionInRoot(findRootCoordinates)));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToWindow-MK-Hz9U */
    public long mo1812localToWindowMKHz9U(long j) {
        return LayoutNodeKt.requireOwner(getLayoutNode()).mo1948calculatePositionInWindowMKHz9U(mo1811localToRootMKHz9U(j));
    }

    private final NodeCoordinator toCoordinator(LayoutCoordinates layoutCoordinates) {
        NodeCoordinator coordinator;
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates = layoutCoordinates instanceof LookaheadLayoutCoordinates ? (LookaheadLayoutCoordinates) layoutCoordinates : null;
        if (lookaheadLayoutCoordinates == null || (coordinator = lookaheadLayoutCoordinates.getCoordinator()) == null) {
            C8632dsu.d(layoutCoordinates);
            return (NodeCoordinator) layoutCoordinates;
        }
        return coordinator;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-R5De75A */
    public long mo1810localPositionOfR5De75A(LayoutCoordinates layoutCoordinates, long j) {
        if (layoutCoordinates instanceof LookaheadLayoutCoordinates) {
            return Offset.m1145unaryMinusF1C5BW0(layoutCoordinates.mo1810localPositionOfR5De75A(this, Offset.m1145unaryMinusF1C5BW0(j)));
        }
        NodeCoordinator coordinator = toCoordinator(layoutCoordinates);
        coordinator.onCoordinatesUsed$ui_release();
        NodeCoordinator findCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        while (coordinator != findCommonAncestor$ui_release) {
            j = coordinator.m1929toParentPositionMKHz9U(j);
            coordinator = coordinator.wrappedBy;
            C8632dsu.d(coordinator);
        }
        return m1910ancestorToLocalR5De75A(findCommonAncestor$ui_release, j);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: transformFrom-EL8BTi8 */
    public void mo1813transformFromEL8BTi8(LayoutCoordinates layoutCoordinates, float[] fArr) {
        NodeCoordinator coordinator = toCoordinator(layoutCoordinates);
        coordinator.onCoordinatesUsed$ui_release();
        NodeCoordinator findCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        Matrix.m1375resetimpl(fArr);
        coordinator.m1918transformToAncestorEL8BTi8(findCommonAncestor$ui_release, fArr);
        m1917transformFromAncestorEL8BTi8(findCommonAncestor$ui_release, fArr);
    }

    /* renamed from: transformToAncestor-EL8BTi8  reason: not valid java name */
    private final void m1918transformToAncestorEL8BTi8(NodeCoordinator nodeCoordinator, float[] fArr) {
        NodeCoordinator nodeCoordinator2 = this;
        while (!C8632dsu.c(nodeCoordinator2, nodeCoordinator)) {
            OwnedLayer ownedLayer = nodeCoordinator2.layer;
            if (ownedLayer != null) {
                ownedLayer.mo1946transform58bKbWc(fArr);
            }
            long mo1892getPositionnOccac = nodeCoordinator2.mo1892getPositionnOccac();
            if (!IntOffset.m2532equalsimpl0(mo1892getPositionnOccac, IntOffset.Companion.m2538getZeronOccac())) {
                float[] fArr2 = tmpMatrix;
                Matrix.m1375resetimpl(fArr2);
                Matrix.m1381translateimpl$default(fArr2, IntOffset.m2533getXimpl(mo1892getPositionnOccac), IntOffset.m2534getYimpl(mo1892getPositionnOccac), 0.0f, 4, null);
                Matrix.m1378timesAssign58bKbWc(fArr, fArr2);
            }
            nodeCoordinator2 = nodeCoordinator2.wrappedBy;
            C8632dsu.d(nodeCoordinator2);
        }
    }

    /* renamed from: transformFromAncestor-EL8BTi8  reason: not valid java name */
    private final void m1917transformFromAncestorEL8BTi8(NodeCoordinator nodeCoordinator, float[] fArr) {
        if (C8632dsu.c(nodeCoordinator, this)) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        C8632dsu.d(nodeCoordinator2);
        nodeCoordinator2.m1917transformFromAncestorEL8BTi8(nodeCoordinator, fArr);
        if (!IntOffset.m2532equalsimpl0(mo1892getPositionnOccac(), IntOffset.Companion.m2538getZeronOccac())) {
            float[] fArr2 = tmpMatrix;
            Matrix.m1375resetimpl(fArr2);
            Matrix.m1381translateimpl$default(fArr2, -IntOffset.m2533getXimpl(mo1892getPositionnOccac()), -IntOffset.m2534getYimpl(mo1892getPositionnOccac()), 0.0f, 4, null);
            Matrix.m1378timesAssign58bKbWc(fArr, fArr2);
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo1941inverseTransform58bKbWc(fArr);
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Rect localBoundingBoxOf(LayoutCoordinates layoutCoordinates, boolean z) {
        if (!isAttached()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        }
        if (!layoutCoordinates.isAttached()) {
            throw new IllegalStateException(("LayoutCoordinates " + layoutCoordinates + " is not attached!").toString());
        }
        NodeCoordinator coordinator = toCoordinator(layoutCoordinates);
        coordinator.onCoordinatesUsed$ui_release();
        NodeCoordinator findCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        MutableRect rectCache = getRectCache();
        rectCache.setLeft(0.0f);
        rectCache.setTop(0.0f);
        rectCache.setRight(IntSize.m2547getWidthimpl(layoutCoordinates.mo1809getSizeYbymL2g()));
        rectCache.setBottom(IntSize.m2546getHeightimpl(layoutCoordinates.mo1809getSizeYbymL2g()));
        while (coordinator != findCommonAncestor$ui_release) {
            rectInParent$ui_release$default(coordinator, rectCache, z, false, 4, null);
            if (rectCache.isEmpty()) {
                return Rect.Companion.getZero();
            }
            coordinator = coordinator.wrappedBy;
            C8632dsu.d(coordinator);
        }
        ancestorToLocal(findCommonAncestor$ui_release, rectCache, z);
        return MutableRectKt.toRect(rectCache);
    }

    /* renamed from: ancestorToLocal-R5De75A  reason: not valid java name */
    private final long m1910ancestorToLocalR5De75A(NodeCoordinator nodeCoordinator, long j) {
        if (nodeCoordinator == this) {
            return j;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        if (nodeCoordinator2 == null || C8632dsu.c(nodeCoordinator, nodeCoordinator2)) {
            return m1921fromParentPositionMKHz9U(j);
        }
        return m1921fromParentPositionMKHz9U(nodeCoordinator2.m1910ancestorToLocalR5De75A(nodeCoordinator, j));
    }

    private final void ancestorToLocal(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z) {
        if (nodeCoordinator == this) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        if (nodeCoordinator2 != null) {
            nodeCoordinator2.ancestorToLocal(nodeCoordinator, mutableRect, z);
        }
        fromParentRect(mutableRect, z);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToRoot-MK-Hz9U */
    public long mo1811localToRootMKHz9U(long j) {
        if (!isAttached()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        }
        onCoordinatesUsed$ui_release();
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrappedBy) {
            j = nodeCoordinator.m1929toParentPositionMKHz9U(j);
        }
        return j;
    }

    /* renamed from: toParentPosition-MK-Hz9U  reason: not valid java name */
    public long m1929toParentPositionMKHz9U(long j) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            j = ownedLayer.mo1943mapOffset8S9VItk(j, false);
        }
        return IntOffsetKt.m2540plusNvtHpc(j, mo1892getPositionnOccac());
    }

    /* renamed from: fromParentPosition-MK-Hz9U  reason: not valid java name */
    public long m1921fromParentPositionMKHz9U(long j) {
        long m2539minusNvtHpc = IntOffsetKt.m2539minusNvtHpc(j, mo1892getPositionnOccac());
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer != null ? ownedLayer.mo1943mapOffset8S9VItk(m2539minusNvtHpc, true) : m2539minusNvtHpc;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void drawBorder(Canvas canvas, Paint paint) {
        canvas.drawRect(new Rect(0.5f, 0.5f, IntSize.m2547getWidthimpl(m1823getMeasuredSizeYbymL2g()) - 0.5f, IntSize.m2546getHeightimpl(m1823getMeasuredSizeYbymL2g()) - 0.5f), paint);
    }

    public final void onLayoutNodeAttach() {
        updateLayerBlock(this.layerBlock, true);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    public final void onRelease() {
        this.released = true;
        this.invalidateParentLayer.invoke();
        if (this.layer != null) {
            updateLayerBlock$default(this, null, false, 2, null);
        }
    }

    public static /* synthetic */ void rectInParent$ui_release$default(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        nodeCoordinator.rectInParent$ui_release(mutableRect, z, z2);
    }

    public final void rectInParent$ui_release(MutableRect mutableRect, boolean z, boolean z2) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            if (this.isClipping) {
                if (z2) {
                    long m1923getMinimumTouchTargetSizeNHjbRc = m1923getMinimumTouchTargetSizeNHjbRc();
                    float m1176getWidthimpl = Size.m1176getWidthimpl(m1923getMinimumTouchTargetSizeNHjbRc) / 2.0f;
                    float m1174getHeightimpl = Size.m1174getHeightimpl(m1923getMinimumTouchTargetSizeNHjbRc) / 2.0f;
                    mutableRect.intersect(-m1176getWidthimpl, -m1174getHeightimpl, IntSize.m2547getWidthimpl(mo1809getSizeYbymL2g()) + m1176getWidthimpl, IntSize.m2546getHeightimpl(mo1809getSizeYbymL2g()) + m1174getHeightimpl);
                } else if (z) {
                    mutableRect.intersect(0.0f, 0.0f, IntSize.m2547getWidthimpl(mo1809getSizeYbymL2g()), IntSize.m2546getHeightimpl(mo1809getSizeYbymL2g()));
                }
                if (mutableRect.isEmpty()) {
                    return;
                }
            }
            ownedLayer.mapBounds(mutableRect, false);
        }
        float m2533getXimpl = IntOffset.m2533getXimpl(mo1892getPositionnOccac());
        mutableRect.setLeft(mutableRect.getLeft() + m2533getXimpl);
        mutableRect.setRight(mutableRect.getRight() + m2533getXimpl);
        float m2534getYimpl = IntOffset.m2534getYimpl(mo1892getPositionnOccac());
        mutableRect.setTop(mutableRect.getTop() + m2534getYimpl);
        mutableRect.setBottom(mutableRect.getBottom() + m2534getYimpl);
    }

    private final void fromParentRect(MutableRect mutableRect, boolean z) {
        float m2533getXimpl = IntOffset.m2533getXimpl(mo1892getPositionnOccac());
        mutableRect.setLeft(mutableRect.getLeft() - m2533getXimpl);
        mutableRect.setRight(mutableRect.getRight() - m2533getXimpl);
        float m2534getYimpl = IntOffset.m2534getYimpl(mo1892getPositionnOccac());
        mutableRect.setTop(mutableRect.getTop() - m2534getYimpl);
        mutableRect.setBottom(mutableRect.getBottom() - m2534getYimpl);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mapBounds(mutableRect, true);
            if (this.isClipping && z) {
                mutableRect.intersect(0.0f, 0.0f, IntSize.m2547getWidthimpl(mo1809getSizeYbymL2g()), IntSize.m2546getHeightimpl(mo1809getSizeYbymL2g()));
                mutableRect.isEmpty();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: withinLayerBounds-k-4lQ0M  reason: not valid java name */
    public final boolean m1930withinLayerBoundsk4lQ0M(long j) {
        if (OffsetKt.m1150isFinitek4lQ0M(j)) {
            OwnedLayer ownedLayer = this.layer;
            return ownedLayer == null || !this.isClipping || ownedLayer.mo1942isInLayerk4lQ0M(j);
        }
        return false;
    }

    /* renamed from: isPointerInBounds-k-4lQ0M  reason: not valid java name */
    protected final boolean m1926isPointerInBoundsk4lQ0M(long j) {
        float m1137getXimpl = Offset.m1137getXimpl(j);
        float m1138getYimpl = Offset.m1138getYimpl(j);
        return m1137getXimpl >= 0.0f && m1138getYimpl >= 0.0f && m1137getXimpl < ((float) getMeasuredWidth()) && m1138getYimpl < ((float) getMeasuredHeight());
    }

    public void invalidateLayer() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.invalidateLayer();
        }
    }

    public void onLayoutModifierNodeChanged() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    public final NodeCoordinator findCommonAncestor$ui_release(NodeCoordinator nodeCoordinator) {
        LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
        LayoutNode layoutNode2 = getLayoutNode();
        if (layoutNode == layoutNode2) {
            Modifier.Node tail = nodeCoordinator.getTail();
            Modifier.Node tail2 = getTail();
            int m1935constructorimpl = NodeKind.m1935constructorimpl(2);
            if (!tail2.getNode().isAttached()) {
                throw new IllegalStateException("visitLocalAncestors called on an unattached node".toString());
            }
            for (Modifier.Node parent$ui_release = tail2.getNode().getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
                if ((parent$ui_release.getKindSet$ui_release() & m1935constructorimpl) != 0 && parent$ui_release == tail) {
                    return nodeCoordinator;
                }
            }
            return this;
        }
        while (layoutNode.getDepth$ui_release() > layoutNode2.getDepth$ui_release()) {
            layoutNode = layoutNode.getParent$ui_release();
            C8632dsu.d(layoutNode);
        }
        while (layoutNode2.getDepth$ui_release() > layoutNode.getDepth$ui_release()) {
            layoutNode2 = layoutNode2.getParent$ui_release();
            C8632dsu.d(layoutNode2);
        }
        while (layoutNode != layoutNode2) {
            layoutNode = layoutNode.getParent$ui_release();
            layoutNode2 = layoutNode2.getParent$ui_release();
            if (layoutNode != null) {
                if (layoutNode2 == null) {
                }
            }
            throw new IllegalArgumentException("layouts are not part of the same hierarchy");
        }
        return layoutNode2 == getLayoutNode() ? this : layoutNode == nodeCoordinator.getLayoutNode() ? nodeCoordinator : layoutNode.getInnerCoordinator$ui_release();
    }

    /* renamed from: offsetFromEdge-MK-Hz9U  reason: not valid java name */
    private final long m1914offsetFromEdgeMKHz9U(long j) {
        float m1137getXimpl = Offset.m1137getXimpl(j);
        float max = Math.max(0.0f, m1137getXimpl < 0.0f ? -m1137getXimpl : m1137getXimpl - getMeasuredWidth());
        float m1138getYimpl = Offset.m1138getYimpl(j);
        return OffsetKt.Offset(max, Math.max(0.0f, m1138getYimpl < 0.0f ? -m1138getYimpl : m1138getYimpl - getMeasuredHeight()));
    }

    /* renamed from: calculateMinimumTouchTargetPadding-E7KxVPU  reason: not valid java name */
    protected final long m1919calculateMinimumTouchTargetPaddingE7KxVPU(long j) {
        return SizeKt.Size(Math.max(0.0f, (Size.m1176getWidthimpl(j) - getMeasuredWidth()) / 2.0f), Math.max(0.0f, (Size.m1174getHeightimpl(j) - getMeasuredHeight()) / 2.0f));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: distanceInMinimumTouchTarget-tz77jQw  reason: not valid java name */
    public final float m1920distanceInMinimumTouchTargettz77jQw(long j, long j2) {
        if (getMeasuredWidth() < Size.m1176getWidthimpl(j2) || getMeasuredHeight() < Size.m1174getHeightimpl(j2)) {
            long m1919calculateMinimumTouchTargetPaddingE7KxVPU = m1919calculateMinimumTouchTargetPaddingE7KxVPU(j2);
            float m1176getWidthimpl = Size.m1176getWidthimpl(m1919calculateMinimumTouchTargetPaddingE7KxVPU);
            float m1174getHeightimpl = Size.m1174getHeightimpl(m1919calculateMinimumTouchTargetPaddingE7KxVPU);
            long m1914offsetFromEdgeMKHz9U = m1914offsetFromEdgeMKHz9U(j);
            if ((m1176getWidthimpl > 0.0f || m1174getHeightimpl > 0.0f) && Offset.m1137getXimpl(m1914offsetFromEdgeMKHz9U) <= m1176getWidthimpl && Offset.m1138getYimpl(m1914offsetFromEdgeMKHz9U) <= m1174getHeightimpl) {
                return Offset.m1136getDistanceSquaredimpl(m1914offsetFromEdgeMKHz9U);
            }
            return Float.POSITIVE_INFINITY;
        }
        return Float.POSITIVE_INFINITY;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final HitTestSource getPointerInputSource() {
            return NodeCoordinator.PointerInputSource;
        }

        public final HitTestSource getSemanticsSource() {
            return NodeCoordinator.SemanticsSource;
        }
    }

    public final void onMeasured() {
        Modifier.Node parent$ui_release;
        if (m1911hasNodeH91voCI(NodeKind.m1935constructorimpl(128))) {
            Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
            try {
                Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                int m1935constructorimpl = NodeKind.m1935constructorimpl(128);
                boolean m1940getIncludeSelfInTraversalH91voCI = NodeKindKt.m1940getIncludeSelfInTraversalH91voCI(m1935constructorimpl);
                if (m1940getIncludeSelfInTraversalH91voCI) {
                    parent$ui_release = getTail();
                } else {
                    parent$ui_release = getTail().getParent$ui_release();
                    if (parent$ui_release == null) {
                        dpR dpr = dpR.c;
                        createNonObservableSnapshot.restoreCurrent(makeCurrent);
                    }
                }
                for (Modifier.Node headNode = headNode(m1940getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui_release() & m1935constructorimpl) != 0; headNode = headNode.getChild$ui_release()) {
                    if ((headNode.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                        Modifier.Node node = headNode;
                        MutableVector mutableVector = null;
                        while (node != null) {
                            if (node instanceof LayoutAwareModifierNode) {
                                ((LayoutAwareModifierNode) node).mo160onRemeasuredozmzZPI(m1823getMeasuredSizeYbymL2g());
                            } else if ((node.getKindSet$ui_release() & m1935constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            node = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector.add(node);
                                                node = null;
                                            }
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            node = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    if (headNode == parent$ui_release) {
                        break;
                    }
                }
                dpR dpr2 = dpR.c;
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
            } finally {
                createNonObservableSnapshot.dispose();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void drawContainedDrawModifiers(Canvas canvas) {
        Modifier.Node m1924headH91voCI = m1924headH91voCI(NodeKind.m1935constructorimpl(4));
        if (m1924headH91voCI == null) {
            performDraw(canvas);
        } else {
            getLayoutNode().getMDrawScope$ui_release().m1879drawx_KDEd0$ui_release(canvas, IntSizeKt.m2553toSizeozmzZPI(mo1809getSizeYbymL2g()), this, m1924headH91voCI);
        }
    }

    public final void onPlaced() {
        int m1935constructorimpl = NodeKind.m1935constructorimpl(128);
        boolean m1940getIncludeSelfInTraversalH91voCI = NodeKindKt.m1940getIncludeSelfInTraversalH91voCI(m1935constructorimpl);
        Modifier.Node tail = getTail();
        if (!m1940getIncludeSelfInTraversalH91voCI && (tail = tail.getParent$ui_release()) == null) {
            return;
        }
        for (Modifier.Node headNode = headNode(m1940getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui_release() & m1935constructorimpl) != 0; headNode = headNode.getChild$ui_release()) {
            if ((headNode.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                Modifier.Node node = headNode;
                MutableVector mutableVector = null;
                while (node != null) {
                    if (node instanceof LayoutAwareModifierNode) {
                        ((LayoutAwareModifierNode) node).onPlaced(this);
                    } else if ((node.getKindSet$ui_release() & m1935constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                        int i = 0;
                        for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                            if ((delegate$ui_release.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                                i++;
                                if (i == 1) {
                                    node = delegate$ui_release;
                                } else {
                                    if (mutableVector == null) {
                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (node != null) {
                                        mutableVector.add(node);
                                        node = null;
                                    }
                                    mutableVector.add(delegate$ui_release);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    node = DelegatableNodeKt.pop(mutableVector);
                }
            }
            if (headNode == tail) {
                return;
            }
        }
    }

    public final boolean shouldSharePointerInputWithSiblings() {
        Modifier.Node headNode = headNode(NodeKindKt.m1940getIncludeSelfInTraversalH91voCI(NodeKind.m1935constructorimpl(16)));
        if (headNode != null && headNode.isAttached()) {
            int m1935constructorimpl = NodeKind.m1935constructorimpl(16);
            if (!headNode.getNode().isAttached()) {
                throw new IllegalStateException("visitLocalDescendants called on an unattached node".toString());
            }
            Modifier.Node node = headNode.getNode();
            if ((node.getAggregateChildKindSet$ui_release() & m1935constructorimpl) != 0) {
                for (Modifier.Node child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                    if ((child$ui_release.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                        Modifier.Node node2 = child$ui_release;
                        MutableVector mutableVector = null;
                        while (node2 != null) {
                            if (node2 instanceof PointerInputModifierNode) {
                                if (((PointerInputModifierNode) node2).sharePointerInputWithSiblings()) {
                                    return true;
                                }
                            } else if ((node2.getKindSet$ui_release() & m1935constructorimpl) != 0 && (node2 instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node2).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            node2 = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node2 != null) {
                                                mutableVector.add(node2);
                                                node2 = null;
                                            }
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            node2 = DelegatableNodeKt.pop(mutableVector);
                        }
                        continue;
                    }
                }
            }
        }
        return false;
    }
}
