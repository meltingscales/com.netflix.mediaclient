package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.unit.Constraints;
import kotlin.NoWhenBranchMatchedException;
import o.C8632dsu;
import o.dpR;
import o.drO;

/* loaded from: classes.dex */
public final class MeasureAndLayoutDelegate {
    private final LayoutTreeConsistencyChecker consistencyChecker;
    private boolean duringMeasureLayout;
    private long measureIteration;
    private final MutableVector<Owner.OnLayoutCompletedListener> onLayoutCompletedListeners;
    private final OnPositionedDispatcher onPositionedDispatcher;
    private final MutableVector<PostponedRequest> postponedMeasureRequests;
    private final DepthSortedSetsForDifferentPasses relayoutNodes;
    private final LayoutNode root;
    private Constraints rootConstraints;

    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
                iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LayoutNode.LayoutState.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MeasureAndLayoutDelegate(LayoutNode layoutNode) {
        this.root = layoutNode;
        Owner.Companion companion = Owner.Companion;
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = new DepthSortedSetsForDifferentPasses(companion.getEnableExtraAssertions());
        this.relayoutNodes = depthSortedSetsForDifferentPasses;
        this.onPositionedDispatcher = new OnPositionedDispatcher();
        this.onLayoutCompletedListeners = new MutableVector<>(new Owner.OnLayoutCompletedListener[16], 0);
        this.measureIteration = 1L;
        MutableVector<PostponedRequest> mutableVector = new MutableVector<>(new PostponedRequest[16], 0);
        this.postponedMeasureRequests = mutableVector;
        this.consistencyChecker = companion.getEnableExtraAssertions() ? new LayoutTreeConsistencyChecker(layoutNode, depthSortedSetsForDifferentPasses, mutableVector.asMutableList()) : null;
    }

    public final boolean getHasPendingMeasureOrLayout() {
        return this.relayoutNodes.isNotEmpty();
    }

    public final boolean getHasPendingOnPositionedCallbacks() {
        return this.onPositionedDispatcher.isNotEmpty();
    }

    /* renamed from: updateRootConstraints-BRTryo0 */
    public final void m1901updateRootConstraintsBRTryo0(long j) {
        Constraints constraints = this.rootConstraints;
        if (constraints != null && Constraints.m2466equalsimpl0(constraints.m2478unboximpl(), j)) {
            return;
        }
        if (!(!this.duringMeasureLayout)) {
            throw new IllegalArgumentException("updateRootConstraints called while measuring".toString());
        }
        this.rootConstraints = Constraints.m2461boximpl(j);
        if (this.root.getLookaheadRoot$ui_release() != null) {
            this.root.markLookaheadMeasurePending$ui_release();
        }
        this.root.markMeasurePending$ui_release();
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.relayoutNodes;
        LayoutNode layoutNode = this.root;
        depthSortedSetsForDifferentPasses.add(layoutNode, layoutNode.getLookaheadRoot$ui_release() != null);
    }

    public static /* synthetic */ boolean requestLookaheadRemeasure$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate.requestLookaheadRemeasure(layoutNode, z);
    }

    public final boolean requestLookaheadRemeasure(LayoutNode layoutNode, boolean z) {
        LayoutNode parent$ui_release;
        LayoutNode parent$ui_release2;
        if (layoutNode.getLookaheadRoot$ui_release() != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
            if (i != 1) {
                if (i == 2 || i == 3 || i == 4) {
                    this.postponedMeasureRequests.add(new PostponedRequest(layoutNode, true, z));
                    LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                    if (layoutTreeConsistencyChecker != null) {
                        layoutTreeConsistencyChecker.assertConsistent();
                        return false;
                    }
                    return false;
                } else if (i == 5) {
                    if (!layoutNode.getLookaheadMeasurePending$ui_release() || z) {
                        layoutNode.markLookaheadMeasurePending$ui_release();
                        layoutNode.markMeasurePending$ui_release();
                        if (layoutNode.isDeactivated()) {
                            return false;
                        }
                        if ((C8632dsu.c(layoutNode.isPlacedInLookahead(), Boolean.TRUE) || getCanAffectParentInLookahead(layoutNode)) && ((parent$ui_release = layoutNode.getParent$ui_release()) == null || !parent$ui_release.getLookaheadMeasurePending$ui_release())) {
                            this.relayoutNodes.add(layoutNode, true);
                        } else if ((layoutNode.isPlaced() || getCanAffectParent(layoutNode)) && ((parent$ui_release2 = layoutNode.getParent$ui_release()) == null || !parent$ui_release2.getMeasurePending$ui_release())) {
                            this.relayoutNodes.add(layoutNode, false);
                        }
                        return !this.duringMeasureLayout;
                    }
                    return false;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return false;
        }
        throw new IllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope".toString());
    }

    public static /* synthetic */ boolean requestRemeasure$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate.requestRemeasure(layoutNode, z);
    }

    public final boolean requestRemeasure(LayoutNode layoutNode, boolean z) {
        LayoutNode parent$ui_release;
        int i = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i == 1 || i == 2) {
            return false;
        }
        if (i == 3 || i == 4) {
            this.postponedMeasureRequests.add(new PostponedRequest(layoutNode, false, z));
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.assertConsistent();
                return false;
            }
            return false;
        } else if (i == 5) {
            if (!layoutNode.getMeasurePending$ui_release() || z) {
                layoutNode.markMeasurePending$ui_release();
                if (layoutNode.isDeactivated()) {
                    return false;
                }
                if ((layoutNode.isPlaced() || getCanAffectParent(layoutNode)) && ((parent$ui_release = layoutNode.getParent$ui_release()) == null || !parent$ui_release.getMeasurePending$ui_release())) {
                    this.relayoutNodes.add(layoutNode, false);
                }
                return !this.duringMeasureLayout;
            }
            return false;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static /* synthetic */ boolean requestLookaheadRelayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate.requestLookaheadRelayout(layoutNode, z);
    }

    public final boolean requestLookaheadRelayout(LayoutNode layoutNode, boolean z) {
        int i = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            if ((layoutNode.getLookaheadMeasurePending$ui_release() || layoutNode.getLookaheadLayoutPending$ui_release()) && !z) {
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                    return false;
                }
                return false;
            }
            layoutNode.markLookaheadLayoutPending$ui_release();
            layoutNode.markLayoutPending$ui_release();
            if (layoutNode.isDeactivated()) {
                return false;
            }
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            if (C8632dsu.c(layoutNode.isPlacedInLookahead(), Boolean.TRUE) && ((parent$ui_release == null || !parent$ui_release.getLookaheadMeasurePending$ui_release()) && (parent$ui_release == null || !parent$ui_release.getLookaheadLayoutPending$ui_release()))) {
                this.relayoutNodes.add(layoutNode, true);
            } else if (layoutNode.isPlaced() && ((parent$ui_release == null || !parent$ui_release.getLayoutPending$ui_release()) && (parent$ui_release == null || !parent$ui_release.getMeasurePending$ui_release()))) {
                this.relayoutNodes.add(layoutNode, false);
            }
            return !this.duringMeasureLayout;
        }
        LayoutTreeConsistencyChecker layoutTreeConsistencyChecker2 = this.consistencyChecker;
        if (layoutTreeConsistencyChecker2 != null) {
            layoutTreeConsistencyChecker2.assertConsistent();
            return false;
        }
        return false;
    }

    public static /* synthetic */ boolean requestRelayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate.requestRelayout(layoutNode, z);
    }

    public final boolean requestRelayout(LayoutNode layoutNode, boolean z) {
        LayoutNode parent$ui_release;
        int i = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.assertConsistent();
                return false;
            }
            return false;
        } else if (i == 5) {
            if (!z && layoutNode.isPlaced() == layoutNode.isPlacedByParent() && (layoutNode.getMeasurePending$ui_release() || layoutNode.getLayoutPending$ui_release())) {
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker2 = this.consistencyChecker;
                if (layoutTreeConsistencyChecker2 != null) {
                    layoutTreeConsistencyChecker2.assertConsistent();
                    return false;
                }
                return false;
            }
            layoutNode.markLayoutPending$ui_release();
            if (layoutNode.isDeactivated()) {
                return false;
            }
            if (layoutNode.isPlacedByParent() && (((parent$ui_release = layoutNode.getParent$ui_release()) == null || !parent$ui_release.getLayoutPending$ui_release()) && (parent$ui_release == null || !parent$ui_release.getMeasurePending$ui_release()))) {
                this.relayoutNodes.add(layoutNode, false);
            }
            return !this.duringMeasureLayout;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void requestOnPositionedCallback(LayoutNode layoutNode) {
        this.onPositionedDispatcher.onNodePositioned(layoutNode);
    }

    /* renamed from: doLookaheadRemeasure-sdFAvZA */
    private final boolean m1898doLookaheadRemeasuresdFAvZA(LayoutNode layoutNode, Constraints constraints) {
        boolean m1867lookaheadRemeasure_Sx5XlM$ui_release$default;
        if (layoutNode.getLookaheadRoot$ui_release() == null) {
            return false;
        }
        if (constraints != null) {
            m1867lookaheadRemeasure_Sx5XlM$ui_release$default = layoutNode.m1871lookaheadRemeasure_Sx5XlM$ui_release(constraints);
        } else {
            m1867lookaheadRemeasure_Sx5XlM$ui_release$default = LayoutNode.m1867lookaheadRemeasure_Sx5XlM$ui_release$default(layoutNode, null, 1, null);
        }
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (m1867lookaheadRemeasure_Sx5XlM$ui_release$default && parent$ui_release != null) {
            if (parent$ui_release.getLookaheadRoot$ui_release() == null) {
                requestRemeasure$default(this, parent$ui_release, false, 2, null);
            } else if (layoutNode.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
                requestLookaheadRemeasure$default(this, parent$ui_release, false, 2, null);
            } else if (layoutNode.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InLayoutBlock) {
                requestLookaheadRelayout$default(this, parent$ui_release, false, 2, null);
            }
        }
        return m1867lookaheadRemeasure_Sx5XlM$ui_release$default;
    }

    /* renamed from: doRemeasure-sdFAvZA */
    private final boolean m1899doRemeasuresdFAvZA(LayoutNode layoutNode, Constraints constraints) {
        boolean m1868remeasure_Sx5XlM$ui_release$default;
        if (constraints != null) {
            m1868remeasure_Sx5XlM$ui_release$default = layoutNode.m1872remeasure_Sx5XlM$ui_release(constraints);
        } else {
            m1868remeasure_Sx5XlM$ui_release$default = LayoutNode.m1868remeasure_Sx5XlM$ui_release$default(layoutNode, null, 1, null);
        }
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (m1868remeasure_Sx5XlM$ui_release$default && parent$ui_release != null) {
            if (layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
                requestRemeasure$default(this, parent$ui_release, false, 2, null);
            } else if (layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InLayoutBlock) {
                requestRelayout$default(this, parent$ui_release, false, 2, null);
            }
        }
        return m1868remeasure_Sx5XlM$ui_release$default;
    }

    public final void measureOnly() {
        if (this.relayoutNodes.isNotEmpty()) {
            if (!this.root.isAttached()) {
                throw new IllegalArgumentException("performMeasureAndLayout called with unattached root".toString());
            }
            if (!this.root.isPlaced()) {
                throw new IllegalArgumentException("performMeasureAndLayout called with unplaced root".toString());
            }
            if (!(!this.duringMeasureLayout)) {
                throw new IllegalArgumentException("performMeasureAndLayout called during measure layout".toString());
            }
            if (this.rootConstraints != null) {
                this.duringMeasureLayout = true;
                try {
                    if (!this.relayoutNodes.isEmpty(true)) {
                        if (this.root.getLookaheadRoot$ui_release() != null) {
                            remeasureOnly(this.root, true);
                        } else {
                            remeasureLookaheadRootsInSubtree(this.root);
                        }
                    }
                    remeasureOnly(this.root, false);
                    this.duringMeasureLayout = false;
                    LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                    if (layoutTreeConsistencyChecker != null) {
                        layoutTreeConsistencyChecker.assertConsistent();
                    }
                } catch (Throwable th) {
                    this.duringMeasureLayout = false;
                    throw th;
                }
            }
        }
    }

    /* renamed from: measureAndLayout-0kLqBqw */
    public final void m1900measureAndLayout0kLqBqw(LayoutNode layoutNode, long j) {
        if (layoutNode.isDeactivated()) {
            return;
        }
        if (!(!C8632dsu.c(layoutNode, this.root))) {
            throw new IllegalArgumentException("measureAndLayout called on root".toString());
        }
        if (!this.root.isAttached()) {
            throw new IllegalArgumentException("performMeasureAndLayout called with unattached root".toString());
        }
        if (!this.root.isPlaced()) {
            throw new IllegalArgumentException("performMeasureAndLayout called with unplaced root".toString());
        }
        if (!this.duringMeasureLayout) {
            if (this.rootConstraints != null) {
                this.duringMeasureLayout = true;
                try {
                    this.relayoutNodes.remove(layoutNode);
                    boolean m1898doLookaheadRemeasuresdFAvZA = m1898doLookaheadRemeasuresdFAvZA(layoutNode, Constraints.m2461boximpl(j));
                    m1899doRemeasuresdFAvZA(layoutNode, Constraints.m2461boximpl(j));
                    if ((m1898doLookaheadRemeasuresdFAvZA || layoutNode.getLookaheadLayoutPending$ui_release()) && C8632dsu.c(layoutNode.isPlacedInLookahead(), Boolean.TRUE)) {
                        layoutNode.lookaheadReplace$ui_release();
                    }
                    if (layoutNode.getLayoutPending$ui_release() && layoutNode.isPlaced()) {
                        layoutNode.replace$ui_release();
                        this.onPositionedDispatcher.onNodePositioned(layoutNode);
                    }
                    this.duringMeasureLayout = false;
                    LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                    if (layoutTreeConsistencyChecker != null) {
                        layoutTreeConsistencyChecker.assertConsistent();
                    }
                } catch (Throwable th) {
                    this.duringMeasureLayout = false;
                    throw th;
                }
            }
            callOnLayoutCompletedListeners();
            return;
        }
        throw new IllegalArgumentException("performMeasureAndLayout called during measure layout".toString());
    }

    static /* synthetic */ boolean remeasureAndRelayoutIfNeeded$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        return measureAndLayoutDelegate.remeasureAndRelayoutIfNeeded(layoutNode, z, z2);
    }

    private final boolean remeasureAndRelayoutIfNeeded(LayoutNode layoutNode, boolean z, boolean z2) {
        Constraints constraints;
        boolean m1898doLookaheadRemeasuresdFAvZA;
        boolean m1899doRemeasuresdFAvZA;
        LayoutNode parent$ui_release;
        int i = 0;
        if (layoutNode.isDeactivated()) {
            return false;
        }
        if (layoutNode.isPlaced() || layoutNode.isPlacedByParent() || getCanAffectParent(layoutNode) || C8632dsu.c(layoutNode.isPlacedInLookahead(), Boolean.TRUE) || getCanAffectParentInLookahead(layoutNode) || layoutNode.getAlignmentLinesRequired$ui_release()) {
            if (layoutNode.getLookaheadMeasurePending$ui_release() || layoutNode.getMeasurePending$ui_release()) {
                if (layoutNode == this.root) {
                    constraints = this.rootConstraints;
                    C8632dsu.d(constraints);
                } else {
                    constraints = null;
                }
                m1898doLookaheadRemeasuresdFAvZA = (layoutNode.getLookaheadMeasurePending$ui_release() && z) ? m1898doLookaheadRemeasuresdFAvZA(layoutNode, constraints) : false;
                m1899doRemeasuresdFAvZA = m1899doRemeasuresdFAvZA(layoutNode, constraints);
            } else {
                m1899doRemeasuresdFAvZA = false;
                m1898doLookaheadRemeasuresdFAvZA = false;
            }
            if (z2) {
                if ((m1898doLookaheadRemeasuresdFAvZA || layoutNode.getLookaheadLayoutPending$ui_release()) && C8632dsu.c(layoutNode.isPlacedInLookahead(), Boolean.TRUE) && z) {
                    layoutNode.lookaheadReplace$ui_release();
                }
                if (layoutNode.getLayoutPending$ui_release() && (layoutNode == this.root || ((parent$ui_release = layoutNode.getParent$ui_release()) != null && parent$ui_release.isPlaced() && layoutNode.isPlacedByParent()))) {
                    if (layoutNode == this.root) {
                        layoutNode.place$ui_release(0, 0);
                    } else {
                        layoutNode.replace$ui_release();
                    }
                    this.onPositionedDispatcher.onNodePositioned(layoutNode);
                    LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                    if (layoutTreeConsistencyChecker != null) {
                        layoutTreeConsistencyChecker.assertConsistent();
                    }
                }
            }
            if (this.postponedMeasureRequests.isNotEmpty()) {
                MutableVector<PostponedRequest> mutableVector = this.postponedMeasureRequests;
                int size = mutableVector.getSize();
                if (size <= 0) {
                    this.postponedMeasureRequests.clear();
                } else {
                    PostponedRequest[] content = mutableVector.getContent();
                    do {
                        PostponedRequest postponedRequest = content[i];
                        if (postponedRequest.getNode().isAttached()) {
                            if (!postponedRequest.isLookahead()) {
                                requestRemeasure(postponedRequest.getNode(), postponedRequest.isForced());
                            } else {
                                requestLookaheadRemeasure(postponedRequest.getNode(), postponedRequest.isForced());
                            }
                        }
                        i++;
                    } while (i < size);
                    this.postponedMeasureRequests.clear();
                }
            }
            return m1899doRemeasuresdFAvZA;
        }
        return false;
    }

    private final void remeasureOnly(LayoutNode layoutNode, boolean z) {
        Constraints constraints;
        if (layoutNode == this.root) {
            constraints = this.rootConstraints;
            C8632dsu.d(constraints);
        } else {
            constraints = null;
        }
        if (z) {
            m1898doLookaheadRemeasuresdFAvZA(layoutNode, constraints);
        } else {
            m1899doRemeasuresdFAvZA(layoutNode, constraints);
        }
    }

    public final void forceMeasureTheSubtree(LayoutNode layoutNode, boolean z) {
        if (this.relayoutNodes.isEmpty(z)) {
            return;
        }
        if (!this.duringMeasureLayout) {
            throw new IllegalStateException("forceMeasureTheSubtree should be executed during the measureAndLayout pass".toString());
        }
        if (!(!measurePending(layoutNode, z))) {
            throw new IllegalArgumentException("node not yet measured".toString());
        }
        forceMeasureTheSubtreeInternal(layoutNode, z);
    }

    private final void onlyRemeasureIfScheduled(LayoutNode layoutNode, boolean z) {
        if (measurePending(layoutNode, z) && this.relayoutNodes.contains(layoutNode, z)) {
            remeasureAndRelayoutIfNeeded(layoutNode, z, false);
        }
    }

    public static /* synthetic */ void dispatchOnPositionedCallbacks$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z);
    }

    public final void dispatchOnPositionedCallbacks(boolean z) {
        if (z) {
            this.onPositionedDispatcher.onRootNodePositioned(this.root);
        }
        this.onPositionedDispatcher.dispatch();
    }

    public final void onNodeDetached(LayoutNode layoutNode) {
        this.relayoutNodes.remove(layoutNode);
    }

    private final boolean getMeasureAffectsParent(LayoutNode layoutNode) {
        return layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock || layoutNode.getLayoutDelegate$ui_release().getAlignmentLinesOwner$ui_release().getAlignmentLines().getRequired$ui_release();
    }

    private final boolean getCanAffectParent(LayoutNode layoutNode) {
        return layoutNode.getMeasurePending$ui_release() && getMeasureAffectsParent(layoutNode);
    }

    private final boolean getCanAffectParentInLookahead(LayoutNode layoutNode) {
        return layoutNode.getLookaheadMeasurePending$ui_release() && getMeasureAffectsParentLookahead(layoutNode);
    }

    private final boolean getMeasureAffectsParentLookahead(LayoutNode layoutNode) {
        AlignmentLines alignmentLines;
        if (layoutNode.getMeasuredByParentInLookahead$ui_release() != LayoutNode.UsageByParent.InMeasureBlock) {
            AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = layoutNode.getLayoutDelegate$ui_release().getLookaheadAlignmentLinesOwner$ui_release();
            return (lookaheadAlignmentLinesOwner$ui_release == null || (alignmentLines = lookaheadAlignmentLinesOwner$ui_release.getAlignmentLines()) == null || !alignmentLines.getRequired$ui_release()) ? false : true;
        }
        return true;
    }

    private final boolean measurePending(LayoutNode layoutNode, boolean z) {
        return z ? layoutNode.getLookaheadMeasurePending$ui_release() : layoutNode.getMeasurePending$ui_release();
    }

    /* loaded from: classes.dex */
    public static final class PostponedRequest {
        private final boolean isForced;
        private final boolean isLookahead;
        private final LayoutNode node;

        public final LayoutNode getNode() {
            return this.node;
        }

        public final boolean isForced() {
            return this.isForced;
        }

        public final boolean isLookahead() {
            return this.isLookahead;
        }

        public PostponedRequest(LayoutNode layoutNode, boolean z, boolean z2) {
            this.node = layoutNode;
            this.isLookahead = z;
            this.isForced = z2;
        }
    }

    public final boolean measureAndLayout(drO<dpR> dro) {
        boolean z;
        DepthSortedSet depthSortedSet;
        if (!this.root.isAttached()) {
            throw new IllegalArgumentException("performMeasureAndLayout called with unattached root".toString());
        }
        if (this.root.isPlaced()) {
            if (!this.duringMeasureLayout) {
                boolean z2 = false;
                if (this.rootConstraints != null) {
                    this.duringMeasureLayout = true;
                    try {
                        if (this.relayoutNodes.isNotEmpty()) {
                            DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.relayoutNodes;
                            z = false;
                            while (depthSortedSetsForDifferentPasses.isNotEmpty()) {
                                depthSortedSet = depthSortedSetsForDifferentPasses.lookaheadSet;
                                boolean z3 = !depthSortedSet.isEmpty();
                                LayoutNode pop = (z3 ? depthSortedSetsForDifferentPasses.lookaheadSet : depthSortedSetsForDifferentPasses.set).pop();
                                boolean remeasureAndRelayoutIfNeeded$default = remeasureAndRelayoutIfNeeded$default(this, pop, z3, false, 4, null);
                                if (pop == this.root && remeasureAndRelayoutIfNeeded$default) {
                                    z = true;
                                }
                            }
                            if (dro != null) {
                                dro.invoke();
                            }
                        } else {
                            z = false;
                        }
                        this.duringMeasureLayout = false;
                        LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                        if (layoutTreeConsistencyChecker != null) {
                            layoutTreeConsistencyChecker.assertConsistent();
                        }
                        z2 = z;
                    } catch (Throwable th) {
                        this.duringMeasureLayout = false;
                        throw th;
                    }
                }
                callOnLayoutCompletedListeners();
                return z2;
            }
            throw new IllegalArgumentException("performMeasureAndLayout called during measure layout".toString());
        }
        throw new IllegalArgumentException("performMeasureAndLayout called with unplaced root".toString());
    }

    private final void remeasureLookaheadRootsInSubtree(LayoutNode layoutNode) {
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode2 = content[i];
                if (getMeasureAffectsParent(layoutNode2)) {
                    if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(layoutNode2)) {
                        remeasureOnly(layoutNode2, true);
                    } else {
                        remeasureLookaheadRootsInSubtree(layoutNode2);
                    }
                }
                i++;
            } while (i < size);
        }
    }

    public final void registerOnLayoutCompletedListener(Owner.OnLayoutCompletedListener onLayoutCompletedListener) {
        this.onLayoutCompletedListeners.add(onLayoutCompletedListener);
    }

    private final void callOnLayoutCompletedListeners() {
        MutableVector<Owner.OnLayoutCompletedListener> mutableVector = this.onLayoutCompletedListeners;
        int size = mutableVector.getSize();
        if (size <= 0) {
            this.onLayoutCompletedListeners.clear();
        }
        Owner.OnLayoutCompletedListener[] content = mutableVector.getContent();
        int i = 0;
        do {
            content[i].onLayoutComplete();
            i++;
        } while (i < size);
        this.onLayoutCompletedListeners.clear();
    }

    private final void forceMeasureTheSubtreeInternal(LayoutNode layoutNode, boolean z) {
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size <= 0) {
            onlyRemeasureIfScheduled(layoutNode, z);
        }
        LayoutNode[] content = mutableVector.getContent();
        int i = 0;
        do {
            LayoutNode layoutNode2 = content[i];
            if ((!z && getMeasureAffectsParent(layoutNode2)) || (z && getMeasureAffectsParentLookahead(layoutNode2))) {
                if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(layoutNode2) && !z) {
                    if (layoutNode2.getLookaheadMeasurePending$ui_release() && this.relayoutNodes.contains(layoutNode2, true)) {
                        remeasureAndRelayoutIfNeeded(layoutNode2, true, false);
                    } else {
                        forceMeasureTheSubtree(layoutNode2, true);
                    }
                }
                onlyRemeasureIfScheduled(layoutNode2, z);
                if (!measurePending(layoutNode2, z)) {
                    forceMeasureTheSubtreeInternal(layoutNode2, z);
                }
            }
            i++;
        } while (i < size);
        onlyRemeasureIfScheduled(layoutNode, z);
    }
}
