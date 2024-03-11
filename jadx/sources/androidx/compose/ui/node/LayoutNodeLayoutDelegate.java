package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import java.util.Map;
import o.C8632dsu;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes.dex */
public final class LayoutNodeLayoutDelegate {
    private int childrenAccessingCoordinatesDuringPlacement;
    private boolean coordinatesAccessedDuringModifierPlacement;
    private boolean coordinatesAccessedDuringPlacement;
    private boolean detachedFromParentLookaheadPass;
    private final LayoutNode layoutNode;
    private boolean layoutPending;
    private boolean layoutPendingForAlignment;
    private boolean lookaheadLayoutPending;
    private boolean lookaheadLayoutPendingForAlignment;
    private boolean lookaheadMeasurePending;
    private LookaheadPassDelegate lookaheadPassDelegate;
    private boolean measurePending;
    private int nextChildLookaheadPlaceOrder;
    private int nextChildPlaceOrder;
    private LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.Idle;
    private final MeasurePassDelegate measurePassDelegate = new MeasurePassDelegate();
    private long performMeasureConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    private final drO<dpR> performMeasureBlock = new drO<dpR>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$performMeasureBlock$1
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
            long j;
            NodeCoordinator outerCoordinator = LayoutNodeLayoutDelegate.this.getOuterCoordinator();
            j = LayoutNodeLayoutDelegate.this.performMeasureConstraints;
            outerCoordinator.mo1803measureBRTryo0(j);
        }
    };

    public final AlignmentLinesOwner getAlignmentLinesOwner$ui_release() {
        return this.measurePassDelegate;
    }

    public final int getChildrenAccessingCoordinatesDuringPlacement() {
        return this.childrenAccessingCoordinatesDuringPlacement;
    }

    public final boolean getCoordinatesAccessedDuringModifierPlacement() {
        return this.coordinatesAccessedDuringModifierPlacement;
    }

    public final boolean getCoordinatesAccessedDuringPlacement() {
        return this.coordinatesAccessedDuringPlacement;
    }

    public final boolean getDetachedFromParentLookaheadPass$ui_release() {
        return this.detachedFromParentLookaheadPass;
    }

    public final boolean getLayoutPending$ui_release() {
        return this.layoutPending;
    }

    public final LayoutNode.LayoutState getLayoutState$ui_release() {
        return this.layoutState;
    }

    public final AlignmentLinesOwner getLookaheadAlignmentLinesOwner$ui_release() {
        return this.lookaheadPassDelegate;
    }

    public final boolean getLookaheadLayoutPending$ui_release() {
        return this.lookaheadLayoutPending;
    }

    public final boolean getLookaheadMeasurePending$ui_release() {
        return this.lookaheadMeasurePending;
    }

    public final LookaheadPassDelegate getLookaheadPassDelegate$ui_release() {
        return this.lookaheadPassDelegate;
    }

    public final MeasurePassDelegate getMeasurePassDelegate$ui_release() {
        return this.measurePassDelegate;
    }

    public final boolean getMeasurePending$ui_release() {
        return this.measurePending;
    }

    public final void markLayoutPending$ui_release() {
        this.layoutPending = true;
        this.layoutPendingForAlignment = true;
    }

    public final void markLookaheadLayoutPending$ui_release() {
        this.lookaheadLayoutPending = true;
        this.lookaheadLayoutPendingForAlignment = true;
    }

    public final void markLookaheadMeasurePending$ui_release() {
        this.lookaheadMeasurePending = true;
    }

    public final void markMeasurePending$ui_release() {
        this.measurePending = true;
    }

    public LayoutNodeLayoutDelegate(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
    }

    public final NodeCoordinator getOuterCoordinator() {
        return this.layoutNode.getNodes$ui_release().getOuterCoordinator$ui_release();
    }

    /* renamed from: getLastConstraints-DWUhwKw  reason: not valid java name */
    public final Constraints m1885getLastConstraintsDWUhwKw() {
        return this.measurePassDelegate.m1890getLastConstraintsDWUhwKw();
    }

    /* renamed from: getLastLookaheadConstraints-DWUhwKw  reason: not valid java name */
    public final Constraints m1886getLastLookaheadConstraintsDWUhwKw() {
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            return lookaheadPassDelegate.m1887getLastConstraintsDWUhwKw();
        }
        return null;
    }

    public final int getHeight$ui_release() {
        return this.measurePassDelegate.getHeight();
    }

    public final int getWidth$ui_release() {
        return this.measurePassDelegate.getWidth();
    }

    public final void setCoordinatesAccessedDuringPlacement(boolean z) {
        if (this.coordinatesAccessedDuringPlacement != z) {
            this.coordinatesAccessedDuringPlacement = z;
            if (z && !this.coordinatesAccessedDuringModifierPlacement) {
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else if (z || this.coordinatesAccessedDuringModifierPlacement) {
            } else {
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void setCoordinatesAccessedDuringModifierPlacement(boolean z) {
        if (this.coordinatesAccessedDuringModifierPlacement != z) {
            this.coordinatesAccessedDuringModifierPlacement = z;
            if (z && !this.coordinatesAccessedDuringPlacement) {
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else if (z || this.coordinatesAccessedDuringPlacement) {
            } else {
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void setChildrenAccessingCoordinatesDuringPlacement(int i) {
        int i2 = this.childrenAccessingCoordinatesDuringPlacement;
        this.childrenAccessingCoordinatesDuringPlacement = i;
        if ((i2 == 0) != (i == 0)) {
            LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
            LayoutNodeLayoutDelegate layoutDelegate$ui_release = parent$ui_release != null ? parent$ui_release.getLayoutDelegate$ui_release() : null;
            if (layoutDelegate$ui_release != null) {
                if (i == 0) {
                    layoutDelegate$ui_release.setChildrenAccessingCoordinatesDuringPlacement(layoutDelegate$ui_release.childrenAccessingCoordinatesDuringPlacement - 1);
                } else {
                    layoutDelegate$ui_release.setChildrenAccessingCoordinatesDuringPlacement(layoutDelegate$ui_release.childrenAccessingCoordinatesDuringPlacement + 1);
                }
            }
        }
    }

    public final void onCoordinatesUsed() {
        LayoutNode.LayoutState layoutState$ui_release = this.layoutNode.getLayoutState$ui_release();
        if (layoutState$ui_release == LayoutNode.LayoutState.LayingOut || layoutState$ui_release == LayoutNode.LayoutState.LookaheadLayingOut) {
            if (this.measurePassDelegate.getLayingOutChildren()) {
                setCoordinatesAccessedDuringPlacement(true);
            } else {
                setCoordinatesAccessedDuringModifierPlacement(true);
            }
        }
        if (layoutState$ui_release == LayoutNode.LayoutState.LookaheadLayingOut) {
            LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
            if (lookaheadPassDelegate != null && lookaheadPassDelegate.getLayingOutChildren()) {
                setCoordinatesAccessedDuringPlacement(true);
            } else {
                setCoordinatesAccessedDuringModifierPlacement(true);
            }
        }
    }

    /* loaded from: classes.dex */
    public final class MeasurePassDelegate extends Placeable implements AlignmentLinesOwner {
        private final MutableVector<MeasurePassDelegate> _childDelegates;
        private final AlignmentLines alignmentLines;
        private boolean childDelegatesDirty;
        private boolean duringAlignmentLinesQuery;
        private boolean isPlaced;
        private boolean isPlacedByParent;
        private drM<? super GraphicsLayerScope, dpR> lastLayerBlock;
        private long lastPosition;
        private float lastZIndex;
        private boolean layingOutChildren;
        private final drO<dpR> layoutChildrenBlock;
        private boolean measuredOnce;
        private boolean onNodePlacedCalled;
        private Object parentData;
        private boolean parentDataDirty;
        private final drO<dpR> placeOuterCoordinatorBlock;
        private drM<? super GraphicsLayerScope, dpR> placeOuterCoordinatorLayerBlock;
        private long placeOuterCoordinatorPosition;
        private float placeOuterCoordinatorZIndex;
        private boolean placedOnce;
        private boolean relayoutWithoutParentInProgress;
        private float zIndex;
        private int previousPlaceOrder = Integer.MAX_VALUE;
        private int placeOrder = Integer.MAX_VALUE;
        private LayoutNode.UsageByParent measuredByParent = LayoutNode.UsageByParent.NotUsed;

        /* loaded from: classes.dex */
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[LayoutNode.LayoutState.values().length];
                try {
                    iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
                try {
                    iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public AlignmentLines getAlignmentLines() {
            return this.alignmentLines;
        }

        public final boolean getLayingOutChildren() {
            return this.layingOutChildren;
        }

        public final LayoutNode.UsageByParent getMeasuredByParent$ui_release() {
            return this.measuredByParent;
        }

        @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
        public Object getParentData() {
            return this.parentData;
        }

        public final int getPlaceOrder$ui_release() {
            return this.placeOrder;
        }

        public final float getZIndex$ui_release() {
            return this.zIndex;
        }

        public final void invalidateParentData() {
            this.parentDataDirty = true;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public boolean isPlaced() {
            return this.isPlaced;
        }

        public final boolean isPlacedByParent() {
            return this.isPlacedByParent;
        }

        public final void setChildDelegatesDirty$ui_release(boolean z) {
            this.childDelegatesDirty = z;
        }

        public final void setMeasuredByParent$ui_release(LayoutNode.UsageByParent usageByParent) {
            this.measuredByParent = usageByParent;
        }

        public void setPlaced$ui_release(boolean z) {
            this.isPlaced = z;
        }

        public MeasurePassDelegate() {
            IntOffset.Companion companion = IntOffset.Companion;
            this.lastPosition = companion.m2538getZeronOccac();
            this.parentDataDirty = true;
            this.alignmentLines = new LayoutNodeAlignmentLines(this);
            this._childDelegates = new MutableVector<>(new MeasurePassDelegate[16], 0);
            this.childDelegatesDirty = true;
            this.layoutChildrenBlock = new drO<dpR>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildrenBlock$1
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
                    LayoutNodeLayoutDelegate.MeasurePassDelegate.this.clearPlaceOrder();
                    LayoutNodeLayoutDelegate.MeasurePassDelegate.this.forEachChildAlignmentLinesOwner(new drM<AlignmentLinesOwner, dpR>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildrenBlock$1.1
                        @Override // o.drM
                        public /* bridge */ /* synthetic */ dpR invoke(AlignmentLinesOwner alignmentLinesOwner) {
                            invoke2(alignmentLinesOwner);
                            return dpR.c;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(AlignmentLinesOwner alignmentLinesOwner) {
                            alignmentLinesOwner.getAlignmentLines().setUsedDuringParentLayout$ui_release(false);
                        }
                    });
                    LayoutNodeLayoutDelegate.MeasurePassDelegate.this.getInnerCoordinator().getMeasureResult$ui_release().placeChildren();
                    LayoutNodeLayoutDelegate.MeasurePassDelegate.this.checkChildrenPlaceOrderForUpdates();
                    LayoutNodeLayoutDelegate.MeasurePassDelegate.this.forEachChildAlignmentLinesOwner(new drM<AlignmentLinesOwner, dpR>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildrenBlock$1.2
                        @Override // o.drM
                        public /* bridge */ /* synthetic */ dpR invoke(AlignmentLinesOwner alignmentLinesOwner) {
                            invoke2(alignmentLinesOwner);
                            return dpR.c;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(AlignmentLinesOwner alignmentLinesOwner) {
                            alignmentLinesOwner.getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(alignmentLinesOwner.getAlignmentLines().getUsedDuringParentLayout$ui_release());
                        }
                    });
                }
            };
            this.placeOuterCoordinatorPosition = companion.m2538getZeronOccac();
            this.placeOuterCoordinatorBlock = new drO<dpR>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$placeOuterCoordinatorBlock$1
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
                    Placeable.PlacementScope placementScope;
                    drM<? super GraphicsLayerScope, dpR> drm;
                    long j;
                    float f;
                    long j2;
                    float f2;
                    NodeCoordinator wrappedBy$ui_release = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getWrappedBy$ui_release();
                    if (wrappedBy$ui_release == null || (placementScope = wrappedBy$ui_release.getPlacementScope()) == null) {
                        placementScope = LayoutNodeKt.requireOwner(LayoutNodeLayoutDelegate.this.layoutNode).getPlacementScope();
                    }
                    Placeable.PlacementScope placementScope2 = placementScope;
                    LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate = this;
                    LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
                    drm = measurePassDelegate.placeOuterCoordinatorLayerBlock;
                    if (drm == null) {
                        NodeCoordinator outerCoordinator = layoutNodeLayoutDelegate.getOuterCoordinator();
                        j2 = measurePassDelegate.placeOuterCoordinatorPosition;
                        f2 = measurePassDelegate.placeOuterCoordinatorZIndex;
                        placementScope2.m1831place70tqf50(outerCoordinator, j2, f2);
                        return;
                    }
                    NodeCoordinator outerCoordinator2 = layoutNodeLayoutDelegate.getOuterCoordinator();
                    j = measurePassDelegate.placeOuterCoordinatorPosition;
                    f = measurePassDelegate.placeOuterCoordinatorZIndex;
                    placementScope2.m1834placeWithLayeraW9wM(outerCoordinator2, j, f, drm);
                }
            };
        }

        /* renamed from: getLastConstraints-DWUhwKw  reason: not valid java name */
        public final Constraints m1890getLastConstraintsDWUhwKw() {
            if (this.measuredOnce) {
                return Constraints.m2461boximpl(m1824getMeasurementConstraintsmsEJaDk());
            }
            return null;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public NodeCoordinator getInnerCoordinator() {
            return LayoutNodeLayoutDelegate.this.layoutNode.getInnerCoordinator$ui_release();
        }

        public final List<MeasurePassDelegate> getChildDelegates$ui_release() {
            LayoutNodeLayoutDelegate.this.layoutNode.updateChildrenIfDirty$ui_release();
            if (this.childDelegatesDirty) {
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
                MutableVector<MeasurePassDelegate> mutableVector = this._childDelegates;
                MutableVector<LayoutNode> mutableVector2 = layoutNode.get_children$ui_release();
                int size = mutableVector2.getSize();
                if (size > 0) {
                    LayoutNode[] content = mutableVector2.getContent();
                    int i = 0;
                    do {
                        LayoutNode layoutNode2 = content[i];
                        if (mutableVector.getSize() <= i) {
                            mutableVector.add(layoutNode2.getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release());
                        } else {
                            mutableVector.set(i, layoutNode2.getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release());
                        }
                        i++;
                    } while (i < size);
                    mutableVector.removeRange(layoutNode.getChildren$ui_release().size(), mutableVector.getSize());
                    this.childDelegatesDirty = false;
                    return this._childDelegates.asMutableList();
                }
                mutableVector.removeRange(layoutNode.getChildren$ui_release().size(), mutableVector.getSize());
                this.childDelegatesDirty = false;
                return this._childDelegates.asMutableList();
            }
            return this._childDelegates.asMutableList();
        }

        public final void markDetachedFromParentLookaheadPass$ui_release() {
            LayoutNodeLayoutDelegate.this.detachedFromParentLookaheadPass = true;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void layoutChildren() {
            this.layingOutChildren = true;
            getAlignmentLines().recalculateQueryOwner();
            if (LayoutNodeLayoutDelegate.this.getLayoutPending$ui_release()) {
                onBeforeLayoutChildren();
            }
            if (LayoutNodeLayoutDelegate.this.layoutPendingForAlignment || (!this.duringAlignmentLinesQuery && !getInnerCoordinator().isPlacingForAlignment$ui_release() && LayoutNodeLayoutDelegate.this.getLayoutPending$ui_release())) {
                LayoutNodeLayoutDelegate.this.layoutPending = false;
                LayoutNode.LayoutState layoutState$ui_release = LayoutNodeLayoutDelegate.this.getLayoutState$ui_release();
                LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.LayingOut;
                LayoutNodeLayoutDelegate.this.setCoordinatesAccessedDuringPlacement(false);
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
                LayoutNodeKt.requireOwner(layoutNode).getSnapshotObserver().observeLayoutSnapshotReads$ui_release(layoutNode, false, this.layoutChildrenBlock);
                LayoutNodeLayoutDelegate.this.layoutState = layoutState$ui_release;
                if (getInnerCoordinator().isPlacingForAlignment$ui_release() && LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringPlacement()) {
                    requestLayout();
                }
                LayoutNodeLayoutDelegate.this.layoutPendingForAlignment = false;
            }
            if (getAlignmentLines().getUsedDuringParentLayout$ui_release()) {
                getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(true);
            }
            if (getAlignmentLines().getDirty$ui_release() && getAlignmentLines().getRequired$ui_release()) {
                getAlignmentLines().recalculate();
            }
            this.layingOutChildren = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkChildrenPlaceOrderForUpdates() {
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    LayoutNode layoutNode2 = content[i];
                    if (layoutNode2.getMeasurePassDelegate$ui_release().previousPlaceOrder != layoutNode2.getPlaceOrder$ui_release()) {
                        layoutNode.onZSortedChildrenInvalidated$ui_release();
                        layoutNode.invalidateLayer$ui_release();
                        if (layoutNode2.getPlaceOrder$ui_release() == Integer.MAX_VALUE) {
                            layoutNode2.getMeasurePassDelegate$ui_release().markSubtreeAsNotPlaced();
                        }
                    }
                    i++;
                } while (i < size);
            }
        }

        private final void markSubtreeAsNotPlaced() {
            if (isPlaced()) {
                int i = 0;
                setPlaced$ui_release(false);
                MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
                int size = mutableVector.getSize();
                if (size > 0) {
                    LayoutNode[] content = mutableVector.getContent();
                    do {
                        content[i].getMeasurePassDelegate$ui_release().markSubtreeAsNotPlaced();
                        i++;
                    } while (i < size);
                }
            }
        }

        private final void markNodeAndSubtreeAsPlaced() {
            boolean isPlaced = isPlaced();
            setPlaced$ui_release(true);
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            int i = 0;
            if (!isPlaced) {
                if (layoutNode.getMeasurePending$ui_release()) {
                    LayoutNode.requestRemeasure$ui_release$default(layoutNode, true, false, 2, null);
                } else if (layoutNode.getLookaheadMeasurePending$ui_release()) {
                    LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNode, true, false, 2, null);
                }
            }
            NodeCoordinator wrapped$ui_release = layoutNode.getInnerCoordinator$ui_release().getWrapped$ui_release();
            for (NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release(); !C8632dsu.c(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
                if (outerCoordinator$ui_release.getLastLayerDrawingWasSkipped$ui_release()) {
                    outerCoordinator$ui_release.invalidateLayer();
                }
            }
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                do {
                    LayoutNode layoutNode2 = content[i];
                    if (layoutNode2.getPlaceOrder$ui_release() != Integer.MAX_VALUE) {
                        layoutNode2.getMeasurePassDelegate$ui_release().markNodeAndSubtreeAsPlaced();
                        layoutNode.rescheduleRemeasureOrRelayout$ui_release(layoutNode2);
                    }
                    i++;
                } while (i < size);
            }
        }

        public final void onNodePlaced$ui_release() {
            this.onNodePlacedCalled = true;
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            float zIndex = getInnerCoordinator().getZIndex();
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release();
            NodeCoordinator innerCoordinator$ui_release = layoutNode.getInnerCoordinator$ui_release();
            while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
                C8632dsu.d(outerCoordinator$ui_release);
                LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui_release;
                zIndex += layoutModifierNodeCoordinator.getZIndex();
                outerCoordinator$ui_release = layoutModifierNodeCoordinator.getWrapped$ui_release();
            }
            if (zIndex != this.zIndex) {
                this.zIndex = zIndex;
                if (parent$ui_release != null) {
                    parent$ui_release.onZSortedChildrenInvalidated$ui_release();
                }
                if (parent$ui_release != null) {
                    parent$ui_release.invalidateLayer$ui_release();
                }
            }
            if (!isPlaced()) {
                if (parent$ui_release != null) {
                    parent$ui_release.invalidateLayer$ui_release();
                }
                markNodeAndSubtreeAsPlaced();
                if (this.relayoutWithoutParentInProgress && parent$ui_release != null) {
                    LayoutNode.requestRelayout$ui_release$default(parent$ui_release, false, 1, null);
                }
            }
            if (parent$ui_release == null) {
                this.placeOrder = 0;
            } else if (!this.relayoutWithoutParentInProgress && parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.LayingOut) {
                if (this.placeOrder == Integer.MAX_VALUE) {
                    this.placeOrder = parent$ui_release.getLayoutDelegate$ui_release().nextChildPlaceOrder;
                    parent$ui_release.getLayoutDelegate$ui_release().nextChildPlaceOrder++;
                } else {
                    throw new IllegalStateException("Place was called on a node which was placed already".toString());
                }
            }
            layoutChildren();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void clearPlaceOrder() {
            LayoutNodeLayoutDelegate.this.nextChildPlaceOrder = 0;
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    MeasurePassDelegate measurePassDelegate$ui_release = content[i].getMeasurePassDelegate$ui_release();
                    measurePassDelegate$ui_release.previousPlaceOrder = measurePassDelegate$ui_release.placeOrder;
                    measurePassDelegate$ui_release.placeOrder = Integer.MAX_VALUE;
                    measurePassDelegate$ui_release.isPlacedByParent = false;
                    if (measurePassDelegate$ui_release.measuredByParent == LayoutNode.UsageByParent.InLayoutBlock) {
                        measurePassDelegate$ui_release.measuredByParent = LayoutNode.UsageByParent.NotUsed;
                    }
                    i++;
                } while (i < size);
            }
        }

        @Override // androidx.compose.ui.layout.Measurable
        /* renamed from: measure-BRTryo0 */
        public Placeable mo1803measureBRTryo0(long j) {
            LayoutNode.UsageByParent intrinsicsUsageByParent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent$ui_release();
            LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
            if (intrinsicsUsageByParent$ui_release == usageByParent) {
                LayoutNodeLayoutDelegate.this.layoutNode.clearSubtreeIntrinsicsUsage$ui_release();
            }
            if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(LayoutNodeLayoutDelegate.this.layoutNode)) {
                LookaheadPassDelegate lookaheadPassDelegate$ui_release = LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate$ui_release();
                C8632dsu.d(lookaheadPassDelegate$ui_release);
                lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(usageByParent);
                lookaheadPassDelegate$ui_release.mo1803measureBRTryo0(j);
            }
            trackMeasurementByParent(LayoutNodeLayoutDelegate.this.layoutNode);
            m1891remeasureBRTryo0(j);
            return this;
        }

        /* renamed from: remeasure-BRTryo0  reason: not valid java name */
        public final boolean m1891remeasureBRTryo0(long j) {
            boolean z = true;
            if (!LayoutNodeLayoutDelegate.this.layoutNode.isDeactivated()) {
                Owner requireOwner = LayoutNodeKt.requireOwner(LayoutNodeLayoutDelegate.this.layoutNode);
                LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
                LayoutNodeLayoutDelegate.this.layoutNode.setCanMultiMeasure$ui_release(LayoutNodeLayoutDelegate.this.layoutNode.getCanMultiMeasure$ui_release() || (parent$ui_release != null && parent$ui_release.getCanMultiMeasure$ui_release()));
                if (!LayoutNodeLayoutDelegate.this.layoutNode.getMeasurePending$ui_release() && Constraints.m2466equalsimpl0(m1824getMeasurementConstraintsmsEJaDk(), j)) {
                    Owner.forceMeasureTheSubtree$default(requireOwner, LayoutNodeLayoutDelegate.this.layoutNode, false, 2, null);
                    LayoutNodeLayoutDelegate.this.layoutNode.resetSubtreeIntrinsicsUsage$ui_release();
                    return false;
                }
                getAlignmentLines().setUsedByModifierMeasurement$ui_release(false);
                forEachChildAlignmentLinesOwner(new drM<AlignmentLinesOwner, dpR>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$remeasure$2
                    @Override // o.drM
                    public /* bridge */ /* synthetic */ dpR invoke(AlignmentLinesOwner alignmentLinesOwner) {
                        invoke2(alignmentLinesOwner);
                        return dpR.c;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(AlignmentLinesOwner alignmentLinesOwner) {
                        alignmentLinesOwner.getAlignmentLines().setUsedDuringParentMeasurement$ui_release(false);
                    }
                });
                this.measuredOnce = true;
                long mo1809getSizeYbymL2g = LayoutNodeLayoutDelegate.this.getOuterCoordinator().mo1809getSizeYbymL2g();
                m1826setMeasurementConstraintsBRTryo0(j);
                LayoutNodeLayoutDelegate.this.m1884performMeasureBRTryo0(j);
                if (IntSize.m2545equalsimpl0(LayoutNodeLayoutDelegate.this.getOuterCoordinator().mo1809getSizeYbymL2g(), mo1809getSizeYbymL2g) && LayoutNodeLayoutDelegate.this.getOuterCoordinator().getWidth() == getWidth() && LayoutNodeLayoutDelegate.this.getOuterCoordinator().getHeight() == getHeight()) {
                    z = false;
                }
                m1825setMeasuredSizeozmzZPI(IntSizeKt.IntSize(LayoutNodeLayoutDelegate.this.getOuterCoordinator().getWidth(), LayoutNodeLayoutDelegate.this.getOuterCoordinator().getHeight()));
                return z;
            }
            throw new IllegalArgumentException("measure is called on a deactivated node".toString());
        }

        private final void trackMeasurementByParent(LayoutNode layoutNode) {
            LayoutNode.UsageByParent usageByParent;
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            if (parent$ui_release != null) {
                if (this.measuredByParent != LayoutNode.UsageByParent.NotUsed && !layoutNode.getCanMultiMeasure$ui_release()) {
                    throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()".toString());
                }
                int i = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
                if (i == 1) {
                    usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                } else if (i == 2) {
                    usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                } else {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + parent$ui_release.getLayoutState$ui_release());
                }
                this.measuredByParent = usageByParent;
                return;
            }
            this.measuredByParent = LayoutNode.UsageByParent.NotUsed;
        }

        @Override // androidx.compose.ui.layout.Placeable
        public int getMeasuredWidth() {
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().getMeasuredWidth();
        }

        @Override // androidx.compose.ui.layout.Placeable
        public int getMeasuredHeight() {
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().getMeasuredHeight();
        }

        @Override // androidx.compose.ui.layout.Measured
        public int get(AlignmentLine alignmentLine) {
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if ((parent$ui_release != null ? parent$ui_release.getLayoutState$ui_release() : null) != LayoutNode.LayoutState.Measuring) {
                LayoutNode parent$ui_release2 = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
                if ((parent$ui_release2 != null ? parent$ui_release2.getLayoutState$ui_release() : null) == LayoutNode.LayoutState.LayingOut) {
                    getAlignmentLines().setUsedDuringParentLayout$ui_release(true);
                }
            } else {
                getAlignmentLines().setUsedDuringParentMeasurement$ui_release(true);
            }
            this.duringAlignmentLinesQuery = true;
            int i = LayoutNodeLayoutDelegate.this.getOuterCoordinator().get(alignmentLine);
            this.duringAlignmentLinesQuery = false;
            return i;
        }

        @Override // androidx.compose.ui.layout.Placeable
        /* renamed from: placeAt-f8xVGno */
        public void mo1804placeAtf8xVGno(long j, float f, drM<? super GraphicsLayerScope, dpR> drm) {
            Placeable.PlacementScope placementScope;
            this.isPlacedByParent = true;
            if (!IntOffset.m2532equalsimpl0(j, this.lastPosition)) {
                if (LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringModifierPlacement() || LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringPlacement()) {
                    LayoutNodeLayoutDelegate.this.layoutPending = true;
                }
                notifyChildrenUsingCoordinatesWhilePlacing();
            }
            boolean z = false;
            if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(LayoutNodeLayoutDelegate.this.layoutNode)) {
                NodeCoordinator wrappedBy$ui_release = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getWrappedBy$ui_release();
                if (wrappedBy$ui_release == null || (placementScope = wrappedBy$ui_release.getPlacementScope()) == null) {
                    placementScope = LayoutNodeKt.requireOwner(LayoutNodeLayoutDelegate.this.layoutNode).getPlacementScope();
                }
                Placeable.PlacementScope placementScope2 = placementScope;
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
                LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNodeLayoutDelegate.getLookaheadPassDelegate$ui_release();
                C8632dsu.d(lookaheadPassDelegate$ui_release);
                LayoutNode parent$ui_release = layoutNodeLayoutDelegate.layoutNode.getParent$ui_release();
                if (parent$ui_release != null) {
                    parent$ui_release.getLayoutDelegate$ui_release().nextChildLookaheadPlaceOrder = 0;
                }
                lookaheadPassDelegate$ui_release.setPlaceOrder$ui_release(Integer.MAX_VALUE);
                Placeable.PlacementScope.place$default(placementScope2, lookaheadPassDelegate$ui_release, IntOffset.m2533getXimpl(j), IntOffset.m2534getYimpl(j), 0.0f, 4, null);
            }
            LookaheadPassDelegate lookaheadPassDelegate$ui_release2 = LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate$ui_release();
            if (lookaheadPassDelegate$ui_release2 != null && !lookaheadPassDelegate$ui_release2.getPlacedOnce$ui_release()) {
                z = true;
            }
            if (!(true ^ z)) {
                throw new IllegalArgumentException("Error: Placement happened before lookahead.".toString());
            }
            m1889placeOuterCoordinatorf8xVGno(j, f, drm);
        }

        /* renamed from: placeOuterCoordinator-f8xVGno  reason: not valid java name */
        private final void m1889placeOuterCoordinatorf8xVGno(long j, float f, drM<? super GraphicsLayerScope, dpR> drm) {
            if (!LayoutNodeLayoutDelegate.this.layoutNode.isDeactivated()) {
                LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.LayingOut;
                this.lastPosition = j;
                this.lastZIndex = f;
                this.lastLayerBlock = drm;
                this.placedOnce = true;
                this.onNodePlacedCalled = false;
                Owner requireOwner = LayoutNodeKt.requireOwner(LayoutNodeLayoutDelegate.this.layoutNode);
                if (!LayoutNodeLayoutDelegate.this.getLayoutPending$ui_release() && isPlaced()) {
                    LayoutNodeLayoutDelegate.this.getOuterCoordinator().m1927placeSelfApparentToRealOffsetf8xVGno(j, f, drm);
                    onNodePlaced$ui_release();
                } else {
                    getAlignmentLines().setUsedByModifierLayout$ui_release(false);
                    LayoutNodeLayoutDelegate.this.setCoordinatesAccessedDuringModifierPlacement(false);
                    this.placeOuterCoordinatorLayerBlock = drm;
                    this.placeOuterCoordinatorPosition = j;
                    this.placeOuterCoordinatorZIndex = f;
                    requireOwner.getSnapshotObserver().observeLayoutModifierSnapshotReads$ui_release(LayoutNodeLayoutDelegate.this.layoutNode, false, this.placeOuterCoordinatorBlock);
                    this.placeOuterCoordinatorLayerBlock = null;
                }
                LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.Idle;
                return;
            }
            throw new IllegalArgumentException("place is called on a deactivated node".toString());
        }

        public final void replace() {
            LayoutNode parent$ui_release;
            try {
                this.relayoutWithoutParentInProgress = true;
                if (!this.placedOnce) {
                    throw new IllegalStateException("replace called on unplaced item".toString());
                }
                boolean isPlaced = isPlaced();
                m1889placeOuterCoordinatorf8xVGno(this.lastPosition, this.lastZIndex, this.lastLayerBlock);
                if (isPlaced && !this.onNodePlacedCalled && (parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release()) != null) {
                    LayoutNode.requestRelayout$ui_release$default(parent$ui_release, false, 1, null);
                }
            } finally {
                this.relayoutWithoutParentInProgress = false;
            }
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i) {
            onIntrinsicsQueried();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().minIntrinsicWidth(i);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i) {
            onIntrinsicsQueried();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().maxIntrinsicWidth(i);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i) {
            onIntrinsicsQueried();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().minIntrinsicHeight(i);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i) {
            onIntrinsicsQueried();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().maxIntrinsicHeight(i);
        }

        private final void onIntrinsicsQueried() {
            LayoutNode.UsageByParent usageByParent;
            LayoutNode.requestRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, false, 3, null);
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (parent$ui_release == null || LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent$ui_release() != LayoutNode.UsageByParent.NotUsed) {
                return;
            }
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            int i = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
            if (i == 1) {
                usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
            } else if (i == 2) {
                usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
            } else {
                usageByParent = parent$ui_release.getIntrinsicsUsageByParent$ui_release();
            }
            layoutNode.setIntrinsicsUsageByParent$ui_release(usageByParent);
        }

        public final boolean updateParentData() {
            if (!(getParentData() == null && LayoutNodeLayoutDelegate.this.getOuterCoordinator().getParentData() == null) && this.parentDataDirty) {
                this.parentDataDirty = false;
                this.parentData = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getParentData();
                return true;
            }
            return false;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public Map<AlignmentLine, Integer> calculateAlignmentLines() {
            if (!this.duringAlignmentLinesQuery) {
                if (LayoutNodeLayoutDelegate.this.getLayoutState$ui_release() == LayoutNode.LayoutState.Measuring) {
                    getAlignmentLines().setUsedByModifierMeasurement$ui_release(true);
                    if (getAlignmentLines().getDirty$ui_release()) {
                        LayoutNodeLayoutDelegate.this.markLayoutPending$ui_release();
                    }
                } else {
                    getAlignmentLines().setUsedByModifierLayout$ui_release(true);
                }
            }
            getInnerCoordinator().setPlacingForAlignment$ui_release(true);
            layoutChildren();
            getInnerCoordinator().setPlacingForAlignment$ui_release(false);
            return getAlignmentLines().getLastCalculation();
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public AlignmentLinesOwner getParentAlignmentLinesOwner() {
            LayoutNodeLayoutDelegate layoutDelegate$ui_release;
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (parent$ui_release == null || (layoutDelegate$ui_release = parent$ui_release.getLayoutDelegate$ui_release()) == null) {
                return null;
            }
            return layoutDelegate$ui_release.getAlignmentLinesOwner$ui_release();
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void forEachChildAlignmentLinesOwner(drM<? super AlignmentLinesOwner, dpR> drm) {
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    drm.invoke(content[i].getLayoutDelegate$ui_release().getAlignmentLinesOwner$ui_release());
                    i++;
                } while (i < size);
            }
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void requestLayout() {
            LayoutNode.requestRelayout$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, 1, null);
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void requestMeasure() {
            LayoutNode.requestRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, false, 3, null);
        }

        public final void notifyChildrenUsingCoordinatesWhilePlacing() {
            MutableVector<LayoutNode> mutableVector;
            int size;
            if (LayoutNodeLayoutDelegate.this.getChildrenAccessingCoordinatesDuringPlacement() <= 0 || (size = (mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release()).getSize()) <= 0) {
                return;
            }
            LayoutNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode = content[i];
                LayoutNodeLayoutDelegate layoutDelegate$ui_release = layoutNode.getLayoutDelegate$ui_release();
                if ((layoutDelegate$ui_release.getCoordinatesAccessedDuringPlacement() || layoutDelegate$ui_release.getCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate$ui_release.getLayoutPending$ui_release()) {
                    LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
                }
                layoutDelegate$ui_release.getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
                i++;
            } while (i < size);
        }

        private final void onBeforeLayoutChildren() {
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    LayoutNode layoutNode2 = content[i];
                    if (layoutNode2.getMeasurePending$ui_release() && layoutNode2.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock && LayoutNode.m1868remeasure_Sx5XlM$ui_release$default(layoutNode2, null, 1, null)) {
                        LayoutNode.requestRemeasure$ui_release$default(layoutNodeLayoutDelegate.layoutNode, false, false, 3, null);
                    }
                    i++;
                } while (i < size);
            }
        }

        public final void invalidateIntrinsicsParent(boolean z) {
            LayoutNode parent$ui_release;
            LayoutNode parent$ui_release2 = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            LayoutNode.UsageByParent intrinsicsUsageByParent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent$ui_release();
            if (parent$ui_release2 == null || intrinsicsUsageByParent$ui_release == LayoutNode.UsageByParent.NotUsed) {
                return;
            }
            while (parent$ui_release2.getIntrinsicsUsageByParent$ui_release() == intrinsicsUsageByParent$ui_release && (parent$ui_release = parent$ui_release2.getParent$ui_release()) != null) {
                parent$ui_release2 = parent$ui_release;
            }
            int i = WhenMappings.$EnumSwitchMapping$1[intrinsicsUsageByParent$ui_release.ordinal()];
            if (i == 1) {
                LayoutNode.requestRemeasure$ui_release$default(parent$ui_release2, z, false, 2, null);
            } else if (i == 2) {
                parent$ui_release2.requestRelayout$ui_release(z);
            } else {
                throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
            }
        }

        public final void onNodeDetached() {
            this.placeOrder = Integer.MAX_VALUE;
            this.previousPlaceOrder = Integer.MAX_VALUE;
            setPlaced$ui_release(false);
        }
    }

    /* loaded from: classes.dex */
    public final class LookaheadPassDelegate extends Placeable implements AlignmentLinesOwner {
        private boolean duringAlignmentLinesQuery;
        private boolean isPlaced;
        private drM<? super GraphicsLayerScope, dpR> lastLayerBlock;
        private float lastZIndex;
        private boolean layingOutChildren;
        private Constraints lookaheadConstraints;
        private boolean measuredOnce;
        private boolean onNodePlacedCalled;
        private boolean placedOnce;
        private boolean relayoutWithoutParentInProgress;
        private int previousPlaceOrder = Integer.MAX_VALUE;
        private int placeOrder = Integer.MAX_VALUE;
        private LayoutNode.UsageByParent measuredByParent = LayoutNode.UsageByParent.NotUsed;
        private long lastPosition = IntOffset.Companion.m2538getZeronOccac();
        private final AlignmentLines alignmentLines = new LookaheadAlignmentLines(this);
        private final MutableVector<LookaheadPassDelegate> _childDelegates = new MutableVector<>(new LookaheadPassDelegate[16], 0);
        private boolean childDelegatesDirty = true;
        private boolean parentDataDirty = true;
        private Object parentData = getMeasurePassDelegate$ui_release().getParentData();

        /* loaded from: classes.dex */
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[LayoutNode.LayoutState.values().length];
                try {
                    iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
                try {
                    iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public AlignmentLines getAlignmentLines() {
            return this.alignmentLines;
        }

        /* renamed from: getLastConstraints-DWUhwKw  reason: not valid java name */
        public final Constraints m1887getLastConstraintsDWUhwKw() {
            return this.lookaheadConstraints;
        }

        public final boolean getLayingOutChildren() {
            return this.layingOutChildren;
        }

        public final LayoutNode.UsageByParent getMeasuredByParent$ui_release() {
            return this.measuredByParent;
        }

        @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
        public Object getParentData() {
            return this.parentData;
        }

        public final boolean getPlacedOnce$ui_release() {
            return this.placedOnce;
        }

        public final void invalidateParentData() {
            this.parentDataDirty = true;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public boolean isPlaced() {
            return this.isPlaced;
        }

        public final void setChildDelegatesDirty$ui_release(boolean z) {
            this.childDelegatesDirty = z;
        }

        public final void setMeasuredByParent$ui_release(LayoutNode.UsageByParent usageByParent) {
            this.measuredByParent = usageByParent;
        }

        public final void setPlaceOrder$ui_release(int i) {
            this.placeOrder = i;
        }

        public void setPlaced(boolean z) {
            this.isPlaced = z;
        }

        public LookaheadPassDelegate() {
        }

        public final MeasurePassDelegate getMeasurePassDelegate$ui_release() {
            return LayoutNodeLayoutDelegate.this.getMeasurePassDelegate$ui_release();
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public NodeCoordinator getInnerCoordinator() {
            return LayoutNodeLayoutDelegate.this.layoutNode.getInnerCoordinator$ui_release();
        }

        public final List<LookaheadPassDelegate> getChildDelegates$ui_release() {
            LayoutNodeLayoutDelegate.this.layoutNode.getChildren$ui_release();
            if (this.childDelegatesDirty) {
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
                MutableVector<LookaheadPassDelegate> mutableVector = this._childDelegates;
                MutableVector<LayoutNode> mutableVector2 = layoutNode.get_children$ui_release();
                int size = mutableVector2.getSize();
                if (size > 0) {
                    LayoutNode[] content = mutableVector2.getContent();
                    int i = 0;
                    do {
                        LayoutNode layoutNode2 = content[i];
                        if (mutableVector.getSize() <= i) {
                            LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode2.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                            C8632dsu.d(lookaheadPassDelegate$ui_release);
                            mutableVector.add(lookaheadPassDelegate$ui_release);
                        } else {
                            LookaheadPassDelegate lookaheadPassDelegate$ui_release2 = layoutNode2.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                            C8632dsu.d(lookaheadPassDelegate$ui_release2);
                            mutableVector.set(i, lookaheadPassDelegate$ui_release2);
                        }
                        i++;
                    } while (i < size);
                    mutableVector.removeRange(layoutNode.getChildren$ui_release().size(), mutableVector.getSize());
                    this.childDelegatesDirty = false;
                    return this._childDelegates.asMutableList();
                }
                mutableVector.removeRange(layoutNode.getChildren$ui_release().size(), mutableVector.getSize());
                this.childDelegatesDirty = false;
                return this._childDelegates.asMutableList();
            }
            return this._childDelegates.asMutableList();
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void layoutChildren() {
            this.layingOutChildren = true;
            getAlignmentLines().recalculateQueryOwner();
            if (LayoutNodeLayoutDelegate.this.getLookaheadLayoutPending$ui_release()) {
                onBeforeLayoutChildren();
            }
            final LookaheadDelegate lookaheadDelegate = getInnerCoordinator().getLookaheadDelegate();
            C8632dsu.d(lookaheadDelegate);
            if (LayoutNodeLayoutDelegate.this.lookaheadLayoutPendingForAlignment || (!this.duringAlignmentLinesQuery && !lookaheadDelegate.isPlacingForAlignment$ui_release() && LayoutNodeLayoutDelegate.this.getLookaheadLayoutPending$ui_release())) {
                LayoutNodeLayoutDelegate.this.lookaheadLayoutPending = false;
                LayoutNode.LayoutState layoutState$ui_release = LayoutNodeLayoutDelegate.this.getLayoutState$ui_release();
                LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.LookaheadLayingOut;
                Owner requireOwner = LayoutNodeKt.requireOwner(LayoutNodeLayoutDelegate.this.layoutNode);
                LayoutNodeLayoutDelegate.this.setCoordinatesAccessedDuringPlacement(false);
                OwnerSnapshotObserver snapshotObserver = requireOwner.getSnapshotObserver();
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
                final LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
                OwnerSnapshotObserver.observeLayoutSnapshotReads$ui_release$default(snapshotObserver, layoutNode, false, new drO<dpR>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1
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
                        LayoutNodeLayoutDelegate.LookaheadPassDelegate.this.clearPlaceOrder();
                        LayoutNodeLayoutDelegate.LookaheadPassDelegate.this.forEachChildAlignmentLinesOwner(new drM<AlignmentLinesOwner, dpR>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1.1
                            @Override // o.drM
                            public /* bridge */ /* synthetic */ dpR invoke(AlignmentLinesOwner alignmentLinesOwner) {
                                invoke2(alignmentLinesOwner);
                                return dpR.c;
                            }

                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                            public final void invoke2(AlignmentLinesOwner alignmentLinesOwner) {
                                alignmentLinesOwner.getAlignmentLines().setUsedDuringParentLayout$ui_release(false);
                            }
                        });
                        LookaheadDelegate lookaheadDelegate2 = LayoutNodeLayoutDelegate.LookaheadPassDelegate.this.getInnerCoordinator().getLookaheadDelegate();
                        if (lookaheadDelegate2 != null) {
                            boolean isPlacingForAlignment$ui_release = lookaheadDelegate2.isPlacingForAlignment$ui_release();
                            List<LayoutNode> children$ui_release = layoutNodeLayoutDelegate.layoutNode.getChildren$ui_release();
                            int size = children$ui_release.size();
                            for (int i = 0; i < size; i++) {
                                LookaheadDelegate lookaheadDelegate3 = children$ui_release.get(i).getOuterCoordinator$ui_release().getLookaheadDelegate();
                                if (lookaheadDelegate3 != null) {
                                    lookaheadDelegate3.setPlacingForAlignment$ui_release(isPlacingForAlignment$ui_release);
                                }
                            }
                        }
                        lookaheadDelegate.getMeasureResult$ui_release().placeChildren();
                        LookaheadDelegate lookaheadDelegate4 = LayoutNodeLayoutDelegate.LookaheadPassDelegate.this.getInnerCoordinator().getLookaheadDelegate();
                        if (lookaheadDelegate4 != null) {
                            lookaheadDelegate4.isPlacingForAlignment$ui_release();
                            List<LayoutNode> children$ui_release2 = layoutNodeLayoutDelegate.layoutNode.getChildren$ui_release();
                            int size2 = children$ui_release2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                LookaheadDelegate lookaheadDelegate5 = children$ui_release2.get(i2).getOuterCoordinator$ui_release().getLookaheadDelegate();
                                if (lookaheadDelegate5 != null) {
                                    lookaheadDelegate5.setPlacingForAlignment$ui_release(false);
                                }
                            }
                        }
                        LayoutNodeLayoutDelegate.LookaheadPassDelegate.this.checkChildrenPlaceOrderForUpdates();
                        LayoutNodeLayoutDelegate.LookaheadPassDelegate.this.forEachChildAlignmentLinesOwner(new drM<AlignmentLinesOwner, dpR>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1.4
                            @Override // o.drM
                            public /* bridge */ /* synthetic */ dpR invoke(AlignmentLinesOwner alignmentLinesOwner) {
                                invoke2(alignmentLinesOwner);
                                return dpR.c;
                            }

                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                            public final void invoke2(AlignmentLinesOwner alignmentLinesOwner) {
                                alignmentLinesOwner.getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(alignmentLinesOwner.getAlignmentLines().getUsedDuringParentLayout$ui_release());
                            }
                        });
                    }
                }, 2, null);
                LayoutNodeLayoutDelegate.this.layoutState = layoutState$ui_release;
                if (LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringPlacement() && lookaheadDelegate.isPlacingForAlignment$ui_release()) {
                    requestLayout();
                }
                LayoutNodeLayoutDelegate.this.lookaheadLayoutPendingForAlignment = false;
            }
            if (getAlignmentLines().getUsedDuringParentLayout$ui_release()) {
                getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(true);
            }
            if (getAlignmentLines().getDirty$ui_release() && getAlignmentLines().getRequired$ui_release()) {
                getAlignmentLines().recalculate();
            }
            this.layingOutChildren = false;
        }

        private final void markSubtreeAsNotPlaced() {
            if (isPlaced()) {
                int i = 0;
                setPlaced(false);
                MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
                int size = mutableVector.getSize();
                if (size > 0) {
                    LayoutNode[] content = mutableVector.getContent();
                    do {
                        LookaheadPassDelegate lookaheadPassDelegate$ui_release = content[i].getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                        C8632dsu.d(lookaheadPassDelegate$ui_release);
                        lookaheadPassDelegate$ui_release.markSubtreeAsNotPlaced();
                        i++;
                    } while (i < size);
                }
            }
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public Map<AlignmentLine, Integer> calculateAlignmentLines() {
            if (!this.duringAlignmentLinesQuery) {
                if (LayoutNodeLayoutDelegate.this.getLayoutState$ui_release() == LayoutNode.LayoutState.LookaheadMeasuring) {
                    getAlignmentLines().setUsedByModifierMeasurement$ui_release(true);
                    if (getAlignmentLines().getDirty$ui_release()) {
                        LayoutNodeLayoutDelegate.this.markLookaheadLayoutPending$ui_release();
                    }
                } else {
                    getAlignmentLines().setUsedByModifierLayout$ui_release(true);
                }
            }
            LookaheadDelegate lookaheadDelegate = getInnerCoordinator().getLookaheadDelegate();
            if (lookaheadDelegate != null) {
                lookaheadDelegate.setPlacingForAlignment$ui_release(true);
            }
            layoutChildren();
            LookaheadDelegate lookaheadDelegate2 = getInnerCoordinator().getLookaheadDelegate();
            if (lookaheadDelegate2 != null) {
                lookaheadDelegate2.setPlacingForAlignment$ui_release(false);
            }
            return getAlignmentLines().getLastCalculation();
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public AlignmentLinesOwner getParentAlignmentLinesOwner() {
            LayoutNodeLayoutDelegate layoutDelegate$ui_release;
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (parent$ui_release == null || (layoutDelegate$ui_release = parent$ui_release.getLayoutDelegate$ui_release()) == null) {
                return null;
            }
            return layoutDelegate$ui_release.getLookaheadAlignmentLinesOwner$ui_release();
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void forEachChildAlignmentLinesOwner(drM<? super AlignmentLinesOwner, dpR> drm) {
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = content[i].getLayoutDelegate$ui_release().getLookaheadAlignmentLinesOwner$ui_release();
                    C8632dsu.d(lookaheadAlignmentLinesOwner$ui_release);
                    drm.invoke(lookaheadAlignmentLinesOwner$ui_release);
                    i++;
                } while (i < size);
            }
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void requestLayout() {
            LayoutNode.requestLookaheadRelayout$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, 1, null);
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void requestMeasure() {
            LayoutNode.requestLookaheadRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, false, 3, null);
        }

        public final void notifyChildrenUsingCoordinatesWhilePlacing() {
            MutableVector<LayoutNode> mutableVector;
            int size;
            if (LayoutNodeLayoutDelegate.this.getChildrenAccessingCoordinatesDuringPlacement() <= 0 || (size = (mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release()).getSize()) <= 0) {
                return;
            }
            LayoutNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode = content[i];
                LayoutNodeLayoutDelegate layoutDelegate$ui_release = layoutNode.getLayoutDelegate$ui_release();
                if ((layoutDelegate$ui_release.getCoordinatesAccessedDuringPlacement() || layoutDelegate$ui_release.getCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate$ui_release.getLayoutPending$ui_release()) {
                    LayoutNode.requestLookaheadRelayout$ui_release$default(layoutNode, false, 1, null);
                }
                LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutDelegate$ui_release.getLookaheadPassDelegate$ui_release();
                if (lookaheadPassDelegate$ui_release != null) {
                    lookaheadPassDelegate$ui_release.notifyChildrenUsingCoordinatesWhilePlacing();
                }
                i++;
            } while (i < size);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
            if ((r0 != null ? r0.getLayoutState$ui_release() : null) == androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut) goto L17;
         */
        @Override // androidx.compose.ui.layout.Measurable
        /* renamed from: measure-BRTryo0 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.compose.ui.layout.Placeable mo1803measureBRTryo0(long r4) {
            /*
                r3 = this;
                androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this
                androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.access$getLayoutNode$p(r0)
                androidx.compose.ui.node.LayoutNode r0 = r0.getParent$ui_release()
                r1 = 0
                if (r0 == 0) goto L12
                androidx.compose.ui.node.LayoutNode$LayoutState r0 = r0.getLayoutState$ui_release()
                goto L13
            L12:
                r0 = r1
            L13:
                androidx.compose.ui.node.LayoutNode$LayoutState r2 = androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadMeasuring
                if (r0 == r2) goto L2b
                androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this
                androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.access$getLayoutNode$p(r0)
                androidx.compose.ui.node.LayoutNode r0 = r0.getParent$ui_release()
                if (r0 == 0) goto L27
                androidx.compose.ui.node.LayoutNode$LayoutState r1 = r0.getLayoutState$ui_release()
            L27:
                androidx.compose.ui.node.LayoutNode$LayoutState r0 = androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut
                if (r1 != r0) goto L31
            L2b:
                androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this
                r1 = 0
                androidx.compose.ui.node.LayoutNodeLayoutDelegate.access$setDetachedFromParentLookaheadPass$p(r0, r1)
            L31:
                androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this
                androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.access$getLayoutNode$p(r0)
                r3.trackLookaheadMeasurementByParent(r0)
                androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this
                androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.access$getLayoutNode$p(r0)
                androidx.compose.ui.node.LayoutNode$UsageByParent r0 = r0.getIntrinsicsUsageByParent$ui_release()
                androidx.compose.ui.node.LayoutNode$UsageByParent r1 = androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed
                if (r0 != r1) goto L51
                androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this
                androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.access$getLayoutNode$p(r0)
                r0.clearSubtreeIntrinsicsUsage$ui_release()
            L51:
                r3.m1888remeasureBRTryo0(r4)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.mo1803measureBRTryo0(long):androidx.compose.ui.layout.Placeable");
        }

        private final void trackLookaheadMeasurementByParent(LayoutNode layoutNode) {
            LayoutNode.UsageByParent usageByParent;
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            if (parent$ui_release != null) {
                if (this.measuredByParent != LayoutNode.UsageByParent.NotUsed && !layoutNode.getCanMultiMeasure$ui_release()) {
                    throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()".toString());
                }
                int i = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
                if (i == 1 || i == 2) {
                    usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                } else if (i == 3 || i == 4) {
                    usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                } else {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + parent$ui_release.getLayoutState$ui_release());
                }
                this.measuredByParent = usageByParent;
                return;
            }
            this.measuredByParent = LayoutNode.UsageByParent.NotUsed;
        }

        /* renamed from: remeasure-BRTryo0  reason: not valid java name */
        public final boolean m1888remeasureBRTryo0(long j) {
            long IntSize;
            Constraints constraints;
            if (!LayoutNodeLayoutDelegate.this.layoutNode.isDeactivated()) {
                LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
                LayoutNodeLayoutDelegate.this.layoutNode.setCanMultiMeasure$ui_release(LayoutNodeLayoutDelegate.this.layoutNode.getCanMultiMeasure$ui_release() || (parent$ui_release != null && parent$ui_release.getCanMultiMeasure$ui_release()));
                if (!LayoutNodeLayoutDelegate.this.layoutNode.getLookaheadMeasurePending$ui_release() && (constraints = this.lookaheadConstraints) != null && Constraints.m2466equalsimpl0(constraints.m2478unboximpl(), j)) {
                    Owner owner$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getOwner$ui_release();
                    if (owner$ui_release != null) {
                        owner$ui_release.forceMeasureTheSubtree(LayoutNodeLayoutDelegate.this.layoutNode, true);
                    }
                    LayoutNodeLayoutDelegate.this.layoutNode.resetSubtreeIntrinsicsUsage$ui_release();
                    return false;
                }
                this.lookaheadConstraints = Constraints.m2461boximpl(j);
                m1826setMeasurementConstraintsBRTryo0(j);
                getAlignmentLines().setUsedByModifierMeasurement$ui_release(false);
                forEachChildAlignmentLinesOwner(new drM<AlignmentLinesOwner, dpR>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$remeasure$2
                    @Override // o.drM
                    public /* bridge */ /* synthetic */ dpR invoke(AlignmentLinesOwner alignmentLinesOwner) {
                        invoke2(alignmentLinesOwner);
                        return dpR.c;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(AlignmentLinesOwner alignmentLinesOwner) {
                        alignmentLinesOwner.getAlignmentLines().setUsedDuringParentMeasurement$ui_release(false);
                    }
                });
                if (this.measuredOnce) {
                    IntSize = m1823getMeasuredSizeYbymL2g();
                } else {
                    IntSize = IntSizeKt.IntSize(Integer.MIN_VALUE, Integer.MIN_VALUE);
                }
                this.measuredOnce = true;
                LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
                if (lookaheadDelegate != null) {
                    LayoutNodeLayoutDelegate.this.m1883performLookaheadMeasureBRTryo0(j);
                    m1825setMeasuredSizeozmzZPI(IntSizeKt.IntSize(lookaheadDelegate.getWidth(), lookaheadDelegate.getHeight()));
                    return (IntSize.m2547getWidthimpl(IntSize) == lookaheadDelegate.getWidth() && IntSize.m2546getHeightimpl(IntSize) == lookaheadDelegate.getHeight()) ? false : true;
                }
                throw new IllegalStateException("Lookahead result from lookaheadRemeasure cannot be null".toString());
            }
            throw new IllegalArgumentException("measure is called on a deactivated node".toString());
        }

        @Override // androidx.compose.ui.layout.Placeable
        /* renamed from: placeAt-f8xVGno */
        public void mo1804placeAtf8xVGno(final long j, float f, drM<? super GraphicsLayerScope, dpR> drm) {
            if (!LayoutNodeLayoutDelegate.this.layoutNode.isDeactivated()) {
                LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.LookaheadLayingOut;
                this.placedOnce = true;
                this.onNodePlacedCalled = false;
                if (!IntOffset.m2532equalsimpl0(j, this.lastPosition)) {
                    if (LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringModifierPlacement() || LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringPlacement()) {
                        LayoutNodeLayoutDelegate.this.lookaheadLayoutPending = true;
                    }
                    notifyChildrenUsingCoordinatesWhilePlacing();
                }
                final Owner requireOwner = LayoutNodeKt.requireOwner(LayoutNodeLayoutDelegate.this.layoutNode);
                if (!LayoutNodeLayoutDelegate.this.getLookaheadLayoutPending$ui_release() && isPlaced()) {
                    LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
                    C8632dsu.d(lookaheadDelegate);
                    lookaheadDelegate.m1895placeSelfApparentToRealOffsetgyyYBs$ui_release(j);
                    onNodePlaced$ui_release();
                } else {
                    LayoutNodeLayoutDelegate.this.setCoordinatesAccessedDuringModifierPlacement(false);
                    getAlignmentLines().setUsedByModifierLayout$ui_release(false);
                    OwnerSnapshotObserver snapshotObserver = requireOwner.getSnapshotObserver();
                    LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
                    final LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
                    OwnerSnapshotObserver.observeLayoutModifierSnapshotReads$ui_release$default(snapshotObserver, layoutNode, false, new drO<dpR>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$placeAt$2
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
                            LookaheadDelegate lookaheadDelegate2;
                            Placeable.PlacementScope placementScope;
                            if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(LayoutNodeLayoutDelegate.this.layoutNode)) {
                                NodeCoordinator wrappedBy$ui_release = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getWrappedBy$ui_release();
                                if (wrappedBy$ui_release != null) {
                                    placementScope = wrappedBy$ui_release.getPlacementScope();
                                }
                                placementScope = null;
                            } else {
                                NodeCoordinator wrappedBy$ui_release2 = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getWrappedBy$ui_release();
                                if (wrappedBy$ui_release2 != null && (lookaheadDelegate2 = wrappedBy$ui_release2.getLookaheadDelegate()) != null) {
                                    placementScope = lookaheadDelegate2.getPlacementScope();
                                }
                                placementScope = null;
                            }
                            if (placementScope == null) {
                                placementScope = requireOwner.getPlacementScope();
                            }
                            Placeable.PlacementScope placementScope2 = placementScope;
                            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = LayoutNodeLayoutDelegate.this;
                            long j2 = j;
                            LookaheadDelegate lookaheadDelegate3 = layoutNodeLayoutDelegate2.getOuterCoordinator().getLookaheadDelegate();
                            C8632dsu.d(lookaheadDelegate3);
                            Placeable.PlacementScope.m1827place70tqf50$default(placementScope2, lookaheadDelegate3, j2, 0.0f, 2, null);
                        }
                    }, 2, null);
                }
                this.lastPosition = j;
                this.lastZIndex = f;
                this.lastLayerBlock = drm;
                LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.Idle;
                return;
            }
            throw new IllegalArgumentException("place is called on a deactivated node".toString());
        }

        @Override // androidx.compose.ui.layout.Placeable
        public int getMeasuredWidth() {
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            C8632dsu.d(lookaheadDelegate);
            return lookaheadDelegate.getMeasuredWidth();
        }

        @Override // androidx.compose.ui.layout.Placeable
        public int getMeasuredHeight() {
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            C8632dsu.d(lookaheadDelegate);
            return lookaheadDelegate.getMeasuredHeight();
        }

        @Override // androidx.compose.ui.layout.Measured
        public int get(AlignmentLine alignmentLine) {
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if ((parent$ui_release != null ? parent$ui_release.getLayoutState$ui_release() : null) != LayoutNode.LayoutState.LookaheadMeasuring) {
                LayoutNode parent$ui_release2 = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
                if ((parent$ui_release2 != null ? parent$ui_release2.getLayoutState$ui_release() : null) == LayoutNode.LayoutState.LookaheadLayingOut) {
                    getAlignmentLines().setUsedDuringParentLayout$ui_release(true);
                }
            } else {
                getAlignmentLines().setUsedDuringParentMeasurement$ui_release(true);
            }
            this.duringAlignmentLinesQuery = true;
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            C8632dsu.d(lookaheadDelegate);
            int i = lookaheadDelegate.get(alignmentLine);
            this.duringAlignmentLinesQuery = false;
            return i;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i) {
            onIntrinsicsQueried();
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            C8632dsu.d(lookaheadDelegate);
            return lookaheadDelegate.minIntrinsicWidth(i);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i) {
            onIntrinsicsQueried();
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            C8632dsu.d(lookaheadDelegate);
            return lookaheadDelegate.maxIntrinsicWidth(i);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i) {
            onIntrinsicsQueried();
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            C8632dsu.d(lookaheadDelegate);
            return lookaheadDelegate.minIntrinsicHeight(i);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i) {
            onIntrinsicsQueried();
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            C8632dsu.d(lookaheadDelegate);
            return lookaheadDelegate.maxIntrinsicHeight(i);
        }

        private final void onIntrinsicsQueried() {
            LayoutNode.UsageByParent usageByParent;
            LayoutNode.requestLookaheadRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, false, 3, null);
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (parent$ui_release == null || LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent$ui_release() != LayoutNode.UsageByParent.NotUsed) {
                return;
            }
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            int i = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
            if (i == 2) {
                usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
            } else if (i == 3) {
                usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
            } else {
                usageByParent = parent$ui_release.getIntrinsicsUsageByParent$ui_release();
            }
            layoutNode.setIntrinsicsUsageByParent$ui_release(usageByParent);
        }

        public final void invalidateIntrinsicsParent(boolean z) {
            LayoutNode parent$ui_release;
            LayoutNode parent$ui_release2 = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            LayoutNode.UsageByParent intrinsicsUsageByParent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent$ui_release();
            if (parent$ui_release2 == null || intrinsicsUsageByParent$ui_release == LayoutNode.UsageByParent.NotUsed) {
                return;
            }
            while (parent$ui_release2.getIntrinsicsUsageByParent$ui_release() == intrinsicsUsageByParent$ui_release && (parent$ui_release = parent$ui_release2.getParent$ui_release()) != null) {
                parent$ui_release2 = parent$ui_release;
            }
            int i = WhenMappings.$EnumSwitchMapping$1[intrinsicsUsageByParent$ui_release.ordinal()];
            if (i == 1) {
                if (parent$ui_release2.getLookaheadRoot$ui_release() != null) {
                    LayoutNode.requestLookaheadRemeasure$ui_release$default(parent$ui_release2, z, false, 2, null);
                } else {
                    LayoutNode.requestRemeasure$ui_release$default(parent$ui_release2, z, false, 2, null);
                }
            } else if (i == 2) {
                if (parent$ui_release2.getLookaheadRoot$ui_release() != null) {
                    parent$ui_release2.requestLookaheadRelayout$ui_release(z);
                } else {
                    parent$ui_release2.requestRelayout$ui_release(z);
                }
            } else {
                throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
            }
        }

        public final boolean updateParentData() {
            if (getParentData() == null) {
                LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
                C8632dsu.d(lookaheadDelegate);
                if (lookaheadDelegate.getParentData() == null) {
                    return false;
                }
            }
            if (this.parentDataDirty) {
                this.parentDataDirty = false;
                LookaheadDelegate lookaheadDelegate2 = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
                C8632dsu.d(lookaheadDelegate2);
                this.parentData = lookaheadDelegate2.getParentData();
                return true;
            }
            return false;
        }

        public final void onNodePlaced$ui_release() {
            this.onNodePlacedCalled = true;
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (!isPlaced()) {
                markNodeAndSubtreeAsPlaced();
                if (this.relayoutWithoutParentInProgress && parent$ui_release != null) {
                    LayoutNode.requestLookaheadRelayout$ui_release$default(parent$ui_release, false, 1, null);
                }
            }
            if (parent$ui_release == null) {
                this.placeOrder = 0;
            } else if (!this.relayoutWithoutParentInProgress && (parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.LayingOut || parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.LookaheadLayingOut)) {
                if (this.placeOrder == Integer.MAX_VALUE) {
                    this.placeOrder = parent$ui_release.getLayoutDelegate$ui_release().nextChildLookaheadPlaceOrder;
                    parent$ui_release.getLayoutDelegate$ui_release().nextChildLookaheadPlaceOrder++;
                } else {
                    throw new IllegalStateException("Place was called on a node which was placed already".toString());
                }
            }
            layoutChildren();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void clearPlaceOrder() {
            int i = 0;
            LayoutNodeLayoutDelegate.this.nextChildLookaheadPlaceOrder = 0;
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                do {
                    LookaheadPassDelegate lookaheadPassDelegate$ui_release = content[i].getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                    C8632dsu.d(lookaheadPassDelegate$ui_release);
                    lookaheadPassDelegate$ui_release.previousPlaceOrder = lookaheadPassDelegate$ui_release.placeOrder;
                    lookaheadPassDelegate$ui_release.placeOrder = Integer.MAX_VALUE;
                    if (lookaheadPassDelegate$ui_release.measuredByParent == LayoutNode.UsageByParent.InLayoutBlock) {
                        lookaheadPassDelegate$ui_release.measuredByParent = LayoutNode.UsageByParent.NotUsed;
                    }
                    i++;
                } while (i < size);
            }
        }

        private final void markNodeAndSubtreeAsPlaced() {
            boolean isPlaced = isPlaced();
            setPlaced(true);
            int i = 0;
            if (!isPlaced && LayoutNodeLayoutDelegate.this.getLookaheadMeasurePending$ui_release()) {
                LayoutNode.requestLookaheadRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, true, false, 2, null);
            }
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                do {
                    LayoutNode layoutNode = content[i];
                    if (layoutNode.getPlaceOrder$ui_release() != Integer.MAX_VALUE) {
                        LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode.getLookaheadPassDelegate$ui_release();
                        C8632dsu.d(lookaheadPassDelegate$ui_release);
                        lookaheadPassDelegate$ui_release.markNodeAndSubtreeAsPlaced();
                        layoutNode.rescheduleRemeasureOrRelayout$ui_release(layoutNode);
                    }
                    i++;
                } while (i < size);
            }
        }

        private final void onBeforeLayoutChildren() {
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    LayoutNode layoutNode2 = content[i];
                    if (layoutNode2.getLookaheadMeasurePending$ui_release() && layoutNode2.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
                        LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode2.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                        C8632dsu.d(lookaheadPassDelegate$ui_release);
                        Constraints m1886getLastLookaheadConstraintsDWUhwKw = layoutNode2.getLayoutDelegate$ui_release().m1886getLastLookaheadConstraintsDWUhwKw();
                        C8632dsu.d(m1886getLastLookaheadConstraintsDWUhwKw);
                        if (lookaheadPassDelegate$ui_release.m1888remeasureBRTryo0(m1886getLastLookaheadConstraintsDWUhwKw.m2478unboximpl())) {
                            LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNodeLayoutDelegate.layoutNode, false, false, 3, null);
                        }
                    }
                    i++;
                } while (i < size);
            }
        }

        public final void replace() {
            LayoutNode parent$ui_release;
            try {
                this.relayoutWithoutParentInProgress = true;
                if (!this.placedOnce) {
                    throw new IllegalStateException("replace() called on item that was not placed".toString());
                }
                this.onNodePlacedCalled = false;
                boolean isPlaced = isPlaced();
                mo1804placeAtf8xVGno(this.lastPosition, 0.0f, null);
                if (isPlaced && !this.onNodePlacedCalled && (parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release()) != null) {
                    LayoutNode.requestLookaheadRelayout$ui_release$default(parent$ui_release, false, 1, null);
                }
            } finally {
                this.relayoutWithoutParentInProgress = false;
            }
        }

        public final void onNodeDetached() {
            this.placeOrder = Integer.MAX_VALUE;
            this.previousPlaceOrder = Integer.MAX_VALUE;
            setPlaced(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkChildrenPlaceOrderForUpdates() {
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    LookaheadPassDelegate lookaheadPassDelegate$ui_release = content[i].getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                    C8632dsu.d(lookaheadPassDelegate$ui_release);
                    int i2 = lookaheadPassDelegate$ui_release.previousPlaceOrder;
                    int i3 = lookaheadPassDelegate$ui_release.placeOrder;
                    if (i2 != i3 && i3 == Integer.MAX_VALUE) {
                        lookaheadPassDelegate$ui_release.markSubtreeAsNotPlaced();
                    }
                    i++;
                } while (i < size);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performMeasure-BRTryo0  reason: not valid java name */
    public final void m1884performMeasureBRTryo0(long j) {
        LayoutNode.LayoutState layoutState = this.layoutState;
        LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.Idle;
        if (layoutState != layoutState2) {
            throw new IllegalStateException("layout state is not idle before measure starts".toString());
        }
        LayoutNode.LayoutState layoutState3 = LayoutNode.LayoutState.Measuring;
        this.layoutState = layoutState3;
        this.measurePending = false;
        this.performMeasureConstraints = j;
        LayoutNodeKt.requireOwner(this.layoutNode).getSnapshotObserver().observeMeasureSnapshotReads$ui_release(this.layoutNode, false, this.performMeasureBlock);
        if (this.layoutState == layoutState3) {
            markLayoutPending$ui_release();
            this.layoutState = layoutState2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performLookaheadMeasure-BRTryo0  reason: not valid java name */
    public final void m1883performLookaheadMeasureBRTryo0(final long j) {
        this.layoutState = LayoutNode.LayoutState.LookaheadMeasuring;
        this.lookaheadMeasurePending = false;
        OwnerSnapshotObserver.observeMeasureSnapshotReads$ui_release$default(LayoutNodeKt.requireOwner(this.layoutNode).getSnapshotObserver(), this.layoutNode, false, new drO<dpR>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$performLookaheadMeasure$1
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
                LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
                C8632dsu.d(lookaheadDelegate);
                lookaheadDelegate.mo1803measureBRTryo0(j);
            }
        }, 2, null);
        markLookaheadLayoutPending$ui_release();
        if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(this.layoutNode)) {
            markLayoutPending$ui_release();
        } else {
            markMeasurePending$ui_release();
        }
        this.layoutState = LayoutNode.LayoutState.Idle;
    }

    public final void ensureLookaheadDelegateCreated$ui_release() {
        if (this.lookaheadPassDelegate == null) {
            this.lookaheadPassDelegate = new LookaheadPassDelegate();
        }
    }

    public final void updateParentData() {
        LayoutNode parent$ui_release;
        if (this.measurePassDelegate.updateParentData() && (parent$ui_release = this.layoutNode.getParent$ui_release()) != null) {
            LayoutNode.requestRemeasure$ui_release$default(parent$ui_release, false, false, 3, null);
        }
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate == null || !lookaheadPassDelegate.updateParentData()) {
            return;
        }
        if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(this.layoutNode)) {
            LayoutNode parent$ui_release2 = this.layoutNode.getParent$ui_release();
            if (parent$ui_release2 != null) {
                LayoutNode.requestRemeasure$ui_release$default(parent$ui_release2, false, false, 3, null);
                return;
            }
            return;
        }
        LayoutNode parent$ui_release3 = this.layoutNode.getParent$ui_release();
        if (parent$ui_release3 != null) {
            LayoutNode.requestLookaheadRemeasure$ui_release$default(parent$ui_release3, false, false, 3, null);
        }
    }

    public final void invalidateParentData() {
        this.measurePassDelegate.invalidateParentData();
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.invalidateParentData();
        }
    }

    public final void resetAlignmentLines() {
        AlignmentLines alignmentLines;
        this.measurePassDelegate.getAlignmentLines().reset$ui_release();
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate == null || (alignmentLines = lookaheadPassDelegate.getAlignmentLines()) == null) {
            return;
        }
        alignmentLines.reset$ui_release();
    }

    public final void markChildrenDirty() {
        this.measurePassDelegate.setChildDelegatesDirty$ui_release(true);
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.setChildDelegatesDirty$ui_release(true);
        }
    }
}
