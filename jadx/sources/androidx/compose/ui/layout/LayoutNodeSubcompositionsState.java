package androidx.compose.ui.layout;

import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ReusableComposition;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.platform.Wrapper_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import com.netflix.model.leafs.ArtworkColors;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.C8569dql;
import o.C8571dqn;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;
import o.drM;
import o.drX;

/* loaded from: classes.dex */
public final class LayoutNodeSubcompositionsState implements ComposeNodeLifecycleCallback {
    private CompositionContext compositionContext;
    private int currentIndex;
    private int currentPostLookaheadIndex;
    private int precomposedCount;
    private int reusableCount;
    private final LayoutNode root;
    private SubcomposeSlotReusePolicy slotReusePolicy;
    private final HashMap<LayoutNode, NodeState> nodeToNodeState = new HashMap<>();
    private final HashMap<Object, LayoutNode> slotIdToNode = new HashMap<>();
    private final Scope scope = new Scope();
    private final PostLookaheadMeasureScopeImpl postLookaheadMeasureScope = new PostLookaheadMeasureScopeImpl();
    private final HashMap<Object, LayoutNode> precomposeMap = new HashMap<>();
    private final SubcomposeSlotReusePolicy.SlotIdsSet reusableSlotIdsSet = new SubcomposeSlotReusePolicy.SlotIdsSet(null, 1, null);
    private final Map<Object, SubcomposeLayoutState.PrecomposedSlotHandle> postLookaheadPrecomposeSlotHandleMap = new LinkedHashMap();
    private final MutableVector<Object> postLookaheadComposedSlotIds = new MutableVector<>(new Object[16], 0);
    private final String NoIntrinsicsMessage = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    public final void setCompositionContext(CompositionContext compositionContext) {
        this.compositionContext = compositionContext;
    }

    public LayoutNodeSubcompositionsState(LayoutNode layoutNode, SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        this.root = layoutNode;
        this.slotReusePolicy = subcomposeSlotReusePolicy;
    }

    public final void setSlotReusePolicy(SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        if (this.slotReusePolicy != subcomposeSlotReusePolicy) {
            this.slotReusePolicy = subcomposeSlotReusePolicy;
            markActiveNodesAsReused(false);
            LayoutNode.requestRemeasure$ui_release$default(this.root, false, false, 3, null);
        }
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        markActiveNodesAsReused(false);
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        markActiveNodesAsReused(true);
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        disposeCurrentNodes();
    }

    public final List<Measurable> subcompose(Object obj, drX<? super Composer, ? super Integer, dpR> drx) {
        Object f;
        makeSureStateIsConsistent();
        LayoutNode.LayoutState layoutState$ui_release = this.root.getLayoutState$ui_release();
        LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.Measuring;
        if (layoutState$ui_release != layoutState && layoutState$ui_release != LayoutNode.LayoutState.LayingOut && layoutState$ui_release != LayoutNode.LayoutState.LookaheadMeasuring && layoutState$ui_release != LayoutNode.LayoutState.LookaheadLayingOut) {
            throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks".toString());
        }
        HashMap<Object, LayoutNode> hashMap = this.slotIdToNode;
        LayoutNode layoutNode = hashMap.get(obj);
        if (layoutNode == null) {
            layoutNode = this.precomposeMap.remove(obj);
            if (layoutNode != null) {
                int i = this.precomposedCount;
                if (i <= 0) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                this.precomposedCount = i - 1;
            } else {
                layoutNode = takeNodeFromReusables(obj);
                if (layoutNode == null) {
                    layoutNode = createNodeAt(this.currentIndex);
                }
            }
            hashMap.put(obj, layoutNode);
        }
        LayoutNode layoutNode2 = layoutNode;
        f = C8576dqs.f((List<? extends Object>) this.root.getFoldedChildren$ui_release(), this.currentIndex);
        if (f != layoutNode2) {
            int indexOf = this.root.getFoldedChildren$ui_release().indexOf(layoutNode2);
            int i2 = this.currentIndex;
            if (indexOf < i2) {
                throw new IllegalArgumentException(("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
            } else if (i2 != indexOf) {
                move$default(this, indexOf, i2, 0, 4, null);
            }
        }
        this.currentIndex++;
        subcompose(layoutNode2, obj, drx);
        if (layoutState$ui_release == layoutState || layoutState$ui_release == LayoutNode.LayoutState.LayingOut) {
            return layoutNode2.getChildMeasurables$ui_release();
        }
        return layoutNode2.getChildLookaheadMeasurables$ui_release();
    }

    private final void subcompose(LayoutNode layoutNode, final NodeState nodeState) {
        Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            LayoutNode layoutNode2 = this.root;
            layoutNode2.ignoreRemeasureRequests = true;
            final drX<Composer, Integer, dpR> content = nodeState.getContent();
            ReusableComposition composition = nodeState.getComposition();
            CompositionContext compositionContext = this.compositionContext;
            if (compositionContext != null) {
                nodeState.setComposition(subcomposeInto(composition, layoutNode, nodeState.getForceReuse(), compositionContext, ComposableLambdaKt.composableLambdaInstance(-1750409193, true, new drX<Composer, Integer, dpR>() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$subcompose$3$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // o.drX
                    public /* synthetic */ dpR invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return dpR.c;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 11) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1750409193, i, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:477)");
                        }
                        boolean active = LayoutNodeSubcompositionsState.NodeState.this.getActive();
                        drX<Composer, Integer, dpR> drx = content;
                        composer.startReusableGroup(207, Boolean.valueOf(active));
                        boolean changed = composer.changed(active);
                        if (active) {
                            drx.invoke(composer, 0);
                        } else {
                            composer.deactivateToEndGroup(changed);
                        }
                        composer.endReusableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                })));
                nodeState.setForceReuse(false);
                layoutNode2.ignoreRemeasureRequests = false;
                dpR dpr = dpR.c;
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                return;
            }
            throw new IllegalStateException("parent composition reference not set".toString());
        } finally {
            createNonObservableSnapshot.dispose();
        }
    }

    private final ReusableComposition subcomposeInto(ReusableComposition reusableComposition, LayoutNode layoutNode, boolean z, CompositionContext compositionContext, drX<? super Composer, ? super Integer, dpR> drx) {
        if (reusableComposition == null || reusableComposition.isDisposed()) {
            reusableComposition = Wrapper_androidKt.createSubcomposition(layoutNode, compositionContext);
        }
        if (!z) {
            reusableComposition.setContent(drx);
        } else {
            reusableComposition.setContentWithReuse(drx);
        }
        return reusableComposition;
    }

    private final Object getSlotIdAtIndex(int i) {
        NodeState nodeState = this.nodeToNodeState.get(this.root.getFoldedChildren$ui_release().get(i));
        C8632dsu.d(nodeState);
        return nodeState.getSlotId();
    }

    public final void disposeOrReuseStartingFromIndex(int i) {
        this.reusableCount = 0;
        int size = (this.root.getFoldedChildren$ui_release().size() - this.precomposedCount) - 1;
        if (i <= size) {
            this.reusableSlotIdsSet.clear();
            if (i <= size) {
                int i2 = i;
                while (true) {
                    this.reusableSlotIdsSet.add(getSlotIdAtIndex(i2));
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
            this.slotReusePolicy.getSlotsToRetain(this.reusableSlotIdsSet);
            Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
            try {
                Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                boolean z = false;
                while (size >= i) {
                    LayoutNode layoutNode = this.root.getFoldedChildren$ui_release().get(size);
                    NodeState nodeState = this.nodeToNodeState.get(layoutNode);
                    C8632dsu.d(nodeState);
                    NodeState nodeState2 = nodeState;
                    Object slotId = nodeState2.getSlotId();
                    if (!this.reusableSlotIdsSet.contains(slotId)) {
                        LayoutNode layoutNode2 = this.root;
                        layoutNode2.ignoreRemeasureRequests = true;
                        this.nodeToNodeState.remove(layoutNode);
                        ReusableComposition composition = nodeState2.getComposition();
                        if (composition != null) {
                            composition.dispose();
                        }
                        this.root.removeAt$ui_release(size, 1);
                        layoutNode2.ignoreRemeasureRequests = false;
                    } else {
                        this.reusableCount++;
                        if (nodeState2.getActive()) {
                            resetLayoutState(layoutNode);
                            nodeState2.setActive(false);
                            z = true;
                        }
                    }
                    this.slotIdToNode.remove(slotId);
                    size--;
                }
                dpR dpr = dpR.c;
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                if (z) {
                    Snapshot.Companion.sendApplyNotifications();
                }
            } finally {
                createNonObservableSnapshot.dispose();
            }
        }
        makeSureStateIsConsistent();
    }

    private final void markActiveNodesAsReused(boolean z) {
        MutableState<Boolean> mutableStateOf$default;
        this.precomposedCount = 0;
        this.precomposeMap.clear();
        int size = this.root.getFoldedChildren$ui_release().size();
        if (this.reusableCount != size) {
            this.reusableCount = size;
            Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
            try {
                Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                for (int i = 0; i < size; i++) {
                    LayoutNode layoutNode = this.root.getFoldedChildren$ui_release().get(i);
                    NodeState nodeState = this.nodeToNodeState.get(layoutNode);
                    if (nodeState != null && nodeState.getActive()) {
                        resetLayoutState(layoutNode);
                        if (z) {
                            ReusableComposition composition = nodeState.getComposition();
                            if (composition != null) {
                                composition.deactivate();
                            }
                            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            nodeState.setActiveState(mutableStateOf$default);
                        } else {
                            nodeState.setActive(false);
                        }
                        nodeState.setSlotId(SubcomposeLayoutKt.access$getReusedSlotId$p());
                    }
                }
                dpR dpr = dpR.c;
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                createNonObservableSnapshot.dispose();
                this.slotIdToNode.clear();
            } catch (Throwable th) {
                createNonObservableSnapshot.dispose();
                throw th;
            }
        }
        makeSureStateIsConsistent();
    }

    public final void makeSureStateIsConsistent() {
        int size = this.root.getFoldedChildren$ui_release().size();
        if (this.nodeToNodeState.size() != size) {
            throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + this.nodeToNodeState.size() + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        } else if ((size - this.reusableCount) - this.precomposedCount < 0) {
            throw new IllegalArgumentException(("Incorrect state. Total children " + size + ". Reusable children " + this.reusableCount + ". Precomposed children " + this.precomposedCount).toString());
        } else if (this.precomposeMap.size() == this.precomposedCount) {
        } else {
            throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.precomposedCount + ". Map size " + this.precomposeMap.size()).toString());
        }
    }

    private final void resetLayoutState(LayoutNode layoutNode) {
        LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate$ui_release = layoutNode.getMeasurePassDelegate$ui_release();
        LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
        measurePassDelegate$ui_release.setMeasuredByParent$ui_release(usageByParent);
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode.getLookaheadPassDelegate$ui_release();
        if (lookaheadPassDelegate$ui_release != null) {
            lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(usageByParent);
        }
    }

    private final LayoutNode takeNodeFromReusables(Object obj) {
        int i;
        MutableState<Boolean> mutableStateOf$default;
        if (this.reusableCount == 0) {
            return null;
        }
        int size = this.root.getFoldedChildren$ui_release().size() - this.precomposedCount;
        int i2 = size - this.reusableCount;
        int i3 = size - 1;
        int i4 = i3;
        while (true) {
            if (i4 < i2) {
                i = -1;
                break;
            } else if (C8632dsu.c(getSlotIdAtIndex(i4), obj)) {
                i = i4;
                break;
            } else {
                i4--;
            }
        }
        if (i == -1) {
            while (i3 >= i2) {
                NodeState nodeState = this.nodeToNodeState.get(this.root.getFoldedChildren$ui_release().get(i3));
                C8632dsu.d(nodeState);
                NodeState nodeState2 = nodeState;
                if (nodeState2.getSlotId() == SubcomposeLayoutKt.access$getReusedSlotId$p() || this.slotReusePolicy.areCompatible(obj, nodeState2.getSlotId())) {
                    nodeState2.setSlotId(obj);
                    i4 = i3;
                    i = i4;
                    break;
                }
                i3--;
            }
            i4 = i3;
        }
        if (i == -1) {
            return null;
        }
        if (i4 != i2) {
            move(i4, i2, 1);
        }
        this.reusableCount--;
        LayoutNode layoutNode = this.root.getFoldedChildren$ui_release().get(i2);
        NodeState nodeState3 = this.nodeToNodeState.get(layoutNode);
        C8632dsu.d(nodeState3);
        NodeState nodeState4 = nodeState3;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        nodeState4.setActiveState(mutableStateOf$default);
        nodeState4.setForceReuse(true);
        nodeState4.setForceRecompose(true);
        return layoutNode;
    }

    public final MeasurePolicy createMeasurePolicy(final drX<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> drx) {
        final String str = this.NoIntrinsicsMessage;
        return new LayoutNode.NoIntrinsicsMeasurePolicy(str) { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo9measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                final int i;
                LayoutNodeSubcompositionsState.PostLookaheadMeasureScopeImpl postLookaheadMeasureScopeImpl;
                final int i2;
                LayoutNodeSubcompositionsState.this.scope.setLayoutDirection(measureScope.getLayoutDirection());
                LayoutNodeSubcompositionsState.this.scope.setDensity(measureScope.getDensity());
                LayoutNodeSubcompositionsState.this.scope.setFontScale(measureScope.getFontScale());
                if (measureScope.isLookingAhead() || LayoutNodeSubcompositionsState.this.root.getLookaheadRoot$ui_release() == null) {
                    LayoutNodeSubcompositionsState.this.currentIndex = 0;
                    final MeasureResult invoke = drx.invoke(LayoutNodeSubcompositionsState.this.scope, Constraints.m2461boximpl(j));
                    i = LayoutNodeSubcompositionsState.this.currentIndex;
                    final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
                    return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$2
                        @Override // androidx.compose.ui.layout.MeasureResult
                        public Map<AlignmentLine, Integer> getAlignmentLines() {
                            return invoke.getAlignmentLines();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public int getHeight() {
                            return invoke.getHeight();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public int getWidth() {
                            return invoke.getWidth();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public void placeChildren() {
                            int i3;
                            layoutNodeSubcompositionsState.currentIndex = i;
                            invoke.placeChildren();
                            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = layoutNodeSubcompositionsState;
                            i3 = layoutNodeSubcompositionsState2.currentIndex;
                            layoutNodeSubcompositionsState2.disposeOrReuseStartingFromIndex(i3);
                        }
                    };
                }
                LayoutNodeSubcompositionsState.this.currentPostLookaheadIndex = 0;
                drX<SubcomposeMeasureScope, Constraints, MeasureResult> drx2 = drx;
                postLookaheadMeasureScopeImpl = LayoutNodeSubcompositionsState.this.postLookaheadMeasureScope;
                final MeasureResult invoke2 = drx2.invoke(postLookaheadMeasureScopeImpl, Constraints.m2461boximpl(j));
                i2 = LayoutNodeSubcompositionsState.this.currentPostLookaheadIndex;
                final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = LayoutNodeSubcompositionsState.this;
                return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$1
                    @Override // androidx.compose.ui.layout.MeasureResult
                    public Map<AlignmentLine, Integer> getAlignmentLines() {
                        return invoke2.getAlignmentLines();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getHeight() {
                        return invoke2.getHeight();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getWidth() {
                        return invoke2.getWidth();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public void placeChildren() {
                        layoutNodeSubcompositionsState2.currentPostLookaheadIndex = i2;
                        invoke2.placeChildren();
                        layoutNodeSubcompositionsState2.disposeUnusedSlotsInPostLookahead();
                    }
                };
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disposeUnusedSlotsInPostLookahead() {
        C8571dqn.e(this.postLookaheadPrecomposeSlotHandleMap.entrySet(), new drM<Map.Entry<Object, SubcomposeLayoutState.PrecomposedSlotHandle>, Boolean>() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$disposeUnusedSlotsInPostLookahead$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public final Boolean invoke(Map.Entry<Object, SubcomposeLayoutState.PrecomposedSlotHandle> entry) {
                MutableVector mutableVector;
                boolean z;
                int i;
                Object key = entry.getKey();
                SubcomposeLayoutState.PrecomposedSlotHandle value = entry.getValue();
                mutableVector = LayoutNodeSubcompositionsState.this.postLookaheadComposedSlotIds;
                int indexOf = mutableVector.indexOf(key);
                if (indexOf >= 0) {
                    i = LayoutNodeSubcompositionsState.this.currentPostLookaheadIndex;
                    if (indexOf < i) {
                        z = false;
                        return Boolean.valueOf(z);
                    }
                }
                value.dispose();
                z = true;
                return Boolean.valueOf(z);
            }
        });
    }

    public final SubcomposeLayoutState.PrecomposedSlotHandle precompose(final Object obj, drX<? super Composer, ? super Integer, dpR> drx) {
        if (!this.root.isAttached()) {
            return new SubcomposeLayoutState.PrecomposedSlotHandle() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$precompose$1
                @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
                public void dispose() {
                }
            };
        }
        makeSureStateIsConsistent();
        if (!this.slotIdToNode.containsKey(obj)) {
            this.postLookaheadPrecomposeSlotHandleMap.remove(obj);
            HashMap<Object, LayoutNode> hashMap = this.precomposeMap;
            LayoutNode layoutNode = hashMap.get(obj);
            if (layoutNode == null) {
                layoutNode = takeNodeFromReusables(obj);
                if (layoutNode != null) {
                    move(this.root.getFoldedChildren$ui_release().indexOf(layoutNode), this.root.getFoldedChildren$ui_release().size(), 1);
                    this.precomposedCount++;
                } else {
                    layoutNode = createNodeAt(this.root.getFoldedChildren$ui_release().size());
                    this.precomposedCount++;
                }
                hashMap.put(obj, layoutNode);
            }
            subcompose(layoutNode, obj, drx);
        }
        return new SubcomposeLayoutState.PrecomposedSlotHandle() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$precompose$2
            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public void dispose() {
                HashMap hashMap2;
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                LayoutNodeSubcompositionsState.this.makeSureStateIsConsistent();
                hashMap2 = LayoutNodeSubcompositionsState.this.precomposeMap;
                LayoutNode layoutNode2 = (LayoutNode) hashMap2.remove(obj);
                if (layoutNode2 != null) {
                    i = LayoutNodeSubcompositionsState.this.precomposedCount;
                    if (i > 0) {
                        int indexOf = LayoutNodeSubcompositionsState.this.root.getFoldedChildren$ui_release().indexOf(layoutNode2);
                        int size = LayoutNodeSubcompositionsState.this.root.getFoldedChildren$ui_release().size();
                        i2 = LayoutNodeSubcompositionsState.this.precomposedCount;
                        if (indexOf >= size - i2) {
                            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
                            i3 = layoutNodeSubcompositionsState.reusableCount;
                            layoutNodeSubcompositionsState.reusableCount = i3 + 1;
                            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = LayoutNodeSubcompositionsState.this;
                            i4 = layoutNodeSubcompositionsState2.precomposedCount;
                            layoutNodeSubcompositionsState2.precomposedCount = i4 - 1;
                            int size2 = LayoutNodeSubcompositionsState.this.root.getFoldedChildren$ui_release().size();
                            i5 = LayoutNodeSubcompositionsState.this.precomposedCount;
                            int i7 = size2 - i5;
                            i6 = LayoutNodeSubcompositionsState.this.reusableCount;
                            int i8 = i7 - i6;
                            LayoutNodeSubcompositionsState.this.move(indexOf, i8, 1);
                            LayoutNodeSubcompositionsState.this.disposeOrReuseStartingFromIndex(i8);
                            return;
                        }
                        throw new IllegalStateException("Item is not in pre-composed item range".toString());
                    }
                    throw new IllegalStateException("No pre-composed items to dispose".toString());
                }
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public int getPlaceablesCount() {
                HashMap hashMap2;
                List<LayoutNode> children$ui_release;
                hashMap2 = LayoutNodeSubcompositionsState.this.precomposeMap;
                LayoutNode layoutNode2 = (LayoutNode) hashMap2.get(obj);
                if (layoutNode2 == null || (children$ui_release = layoutNode2.getChildren$ui_release()) == null) {
                    return 0;
                }
                return children$ui_release.size();
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            /* renamed from: premeasure-0kLqBqw  reason: not valid java name */
            public void mo1817premeasure0kLqBqw(int i, long j) {
                HashMap hashMap2;
                hashMap2 = LayoutNodeSubcompositionsState.this.precomposeMap;
                LayoutNode layoutNode2 = (LayoutNode) hashMap2.get(obj);
                if (layoutNode2 == null || !layoutNode2.isAttached()) {
                    return;
                }
                int size = layoutNode2.getChildren$ui_release().size();
                if (i < 0 || i >= size) {
                    throw new IndexOutOfBoundsException("Index (" + i + ") is out of bound of [0, " + size + ')');
                } else if (!layoutNode2.isPlaced()) {
                    LayoutNode layoutNode3 = LayoutNodeSubcompositionsState.this.root;
                    layoutNode3.ignoreRemeasureRequests = true;
                    LayoutNodeKt.requireOwner(layoutNode2).mo1949measureAndLayout0kLqBqw(layoutNode2.getChildren$ui_release().get(i), j);
                    layoutNode3.ignoreRemeasureRequests = false;
                } else {
                    throw new IllegalArgumentException("Pre-measure called on node that is not placed".toString());
                }
            }
        };
    }

    public final void forceRecomposeChildren() {
        if (this.reusableCount != this.root.getFoldedChildren$ui_release().size()) {
            for (Map.Entry<LayoutNode, NodeState> entry : this.nodeToNodeState.entrySet()) {
                entry.getValue().setForceRecompose(true);
            }
            if (this.root.getMeasurePending$ui_release()) {
                return;
            }
            LayoutNode.requestRemeasure$ui_release$default(this.root, false, false, 3, null);
        }
    }

    private final LayoutNode createNodeAt(int i) {
        LayoutNode layoutNode = new LayoutNode(true, 0, 2, null);
        LayoutNode layoutNode2 = this.root;
        layoutNode2.ignoreRemeasureRequests = true;
        this.root.insertAt$ui_release(i, layoutNode);
        layoutNode2.ignoreRemeasureRequests = false;
        return layoutNode;
    }

    static /* synthetic */ void move$default(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        layoutNodeSubcompositionsState.move(i, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class NodeState {
        private MutableState<Boolean> activeState;
        private ReusableComposition composition;
        private drX<? super Composer, ? super Integer, dpR> content;
        private boolean forceRecompose;
        private boolean forceReuse;
        private Object slotId;

        public final ReusableComposition getComposition() {
            return this.composition;
        }

        public final drX<Composer, Integer, dpR> getContent() {
            return this.content;
        }

        public final boolean getForceRecompose() {
            return this.forceRecompose;
        }

        public final boolean getForceReuse() {
            return this.forceReuse;
        }

        public final Object getSlotId() {
            return this.slotId;
        }

        public final void setActiveState(MutableState<Boolean> mutableState) {
            this.activeState = mutableState;
        }

        public final void setComposition(ReusableComposition reusableComposition) {
            this.composition = reusableComposition;
        }

        public final void setContent(drX<? super Composer, ? super Integer, dpR> drx) {
            this.content = drx;
        }

        public final void setForceRecompose(boolean z) {
            this.forceRecompose = z;
        }

        public final void setForceReuse(boolean z) {
            this.forceReuse = z;
        }

        public final void setSlotId(Object obj) {
            this.slotId = obj;
        }

        public NodeState(Object obj, drX<? super Composer, ? super Integer, dpR> drx, ReusableComposition reusableComposition) {
            MutableState<Boolean> mutableStateOf$default;
            this.slotId = obj;
            this.content = drx;
            this.composition = reusableComposition;
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            this.activeState = mutableStateOf$default;
        }

        public /* synthetic */ NodeState(Object obj, drX drx, ReusableComposition reusableComposition, int i, C8627dsp c8627dsp) {
            this(obj, drx, (i & 4) != 0 ? null : reusableComposition);
        }

        public final boolean getActive() {
            return this.activeState.getValue().booleanValue();
        }

        public final void setActive(boolean z) {
            this.activeState.setValue(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class Scope implements SubcomposeMeasureScope {
        private float density;
        private float fontScale;
        private LayoutDirection layoutDirection = LayoutDirection.Rtl;

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.density;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return this.fontScale;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        public void setDensity(float f) {
            this.density = f;
        }

        public void setFontScale(float f) {
            this.fontScale = f;
        }

        public void setLayoutDirection(LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        public Scope() {
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public boolean isLookingAhead() {
            return LayoutNodeSubcompositionsState.this.root.getLayoutState$ui_release() == LayoutNode.LayoutState.LookaheadLayingOut || LayoutNodeSubcompositionsState.this.root.getLayoutState$ui_release() == LayoutNode.LayoutState.LookaheadMeasuring;
        }

        @Override // androidx.compose.ui.layout.SubcomposeMeasureScope
        public List<Measurable> subcompose(Object obj, drX<? super Composer, ? super Integer, dpR> drx) {
            return LayoutNodeSubcompositionsState.this.subcompose(obj, drx);
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public MeasureResult layout(final int i, final int i2, final Map<AlignmentLine, Integer> map, final drM<? super Placeable.PlacementScope, dpR> drm) {
            if ((i & ArtworkColors.DEFAULT_BACKGROUND_COLOR) == 0 && ((-16777216) & i2) == 0) {
                final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
                return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$Scope$layout$1
                    @Override // androidx.compose.ui.layout.MeasureResult
                    public Map<AlignmentLine, Integer> getAlignmentLines() {
                        return map;
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getHeight() {
                        return i2;
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getWidth() {
                        return i;
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public void placeChildren() {
                        LookaheadDelegate lookaheadDelegate;
                        if (!this.isLookingAhead() || (lookaheadDelegate = layoutNodeSubcompositionsState.root.getInnerCoordinator$ui_release().getLookaheadDelegate()) == null) {
                            drm.invoke(layoutNodeSubcompositionsState.root.getInnerCoordinator$ui_release().getPlacementScope());
                        } else {
                            drm.invoke(lookaheadDelegate.getPlacementScope());
                        }
                    }
                };
            }
            throw new IllegalStateException(("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.").toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class PostLookaheadMeasureScopeImpl implements SubcomposeMeasureScope {
        private final /* synthetic */ Scope $$delegate_0;

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.$$delegate_0.getDensity();
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return this.$$delegate_0.getFontScale();
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public LayoutDirection getLayoutDirection() {
            return this.$$delegate_0.getLayoutDirection();
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public boolean isLookingAhead() {
            return this.$$delegate_0.isLookingAhead();
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public MeasureResult layout(int i, int i2, Map<AlignmentLine, Integer> map, drM<? super Placeable.PlacementScope, dpR> drm) {
            return this.$$delegate_0.layout(i, i2, map, drm);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx--R2X_6o */
        public int mo186roundToPxR2X_6o(long j) {
            return this.$$delegate_0.mo186roundToPxR2X_6o(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx-0680j_4 */
        public int mo187roundToPx0680j_4(float f) {
            return this.$$delegate_0.mo187roundToPx0680j_4(f);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toDp-GaN1DYA */
        public float mo188toDpGaN1DYA(long j) {
            return this.$$delegate_0.mo188toDpGaN1DYA(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public float mo189toDpu2uoSUM(float f) {
            return this.$$delegate_0.mo189toDpu2uoSUM(f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public float mo190toDpu2uoSUM(int i) {
            return this.$$delegate_0.mo190toDpu2uoSUM(i);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDpSize-k-rfVVM */
        public long mo191toDpSizekrfVVM(long j) {
            return this.$$delegate_0.mo191toDpSizekrfVVM(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx--R2X_6o */
        public float mo192toPxR2X_6o(long j) {
            return this.$$delegate_0.mo192toPxR2X_6o(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx-0680j_4 */
        public float mo193toPx0680j_4(float f) {
            return this.$$delegate_0.mo193toPx0680j_4(f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSize-XkaWNTQ */
        public long mo194toSizeXkaWNTQ(long j) {
            return this.$$delegate_0.mo194toSizeXkaWNTQ(j);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toSp-0xMU5do */
        public long mo195toSp0xMU5do(float f) {
            return this.$$delegate_0.mo195toSp0xMU5do(f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public long mo196toSpkPz2Gy4(float f) {
            return this.$$delegate_0.mo196toSpkPz2Gy4(f);
        }

        public PostLookaheadMeasureScopeImpl() {
            this.$$delegate_0 = LayoutNodeSubcompositionsState.this.scope;
        }

        @Override // androidx.compose.ui.layout.SubcomposeMeasureScope
        public List<Measurable> subcompose(Object obj, drX<? super Composer, ? super Integer, dpR> drx) {
            LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.slotIdToNode.get(obj);
            List<Measurable> childMeasurables$ui_release = layoutNode != null ? layoutNode.getChildMeasurables$ui_release() : null;
            return childMeasurables$ui_release != null ? childMeasurables$ui_release : LayoutNodeSubcompositionsState.this.postLookaheadSubcompose(obj, drx);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Measurable> postLookaheadSubcompose(Object obj, drX<? super Composer, ? super Integer, dpR> drx) {
        List<Measurable> i;
        if (this.postLookaheadComposedSlotIds.getSize() < this.currentPostLookaheadIndex) {
            throw new IllegalArgumentException("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.".toString());
        }
        int size = this.postLookaheadComposedSlotIds.getSize();
        int i2 = this.currentPostLookaheadIndex;
        if (size == i2) {
            this.postLookaheadComposedSlotIds.add(obj);
        } else {
            this.postLookaheadComposedSlotIds.set(i2, obj);
        }
        this.currentPostLookaheadIndex++;
        if (!this.precomposeMap.containsKey(obj)) {
            this.postLookaheadPrecomposeSlotHandleMap.put(obj, precompose(obj, drx));
            if (this.root.getLayoutState$ui_release() == LayoutNode.LayoutState.LayingOut) {
                this.root.requestLookaheadRelayout$ui_release(true);
            } else {
                LayoutNode.requestLookaheadRemeasure$ui_release$default(this.root, true, false, 2, null);
            }
        }
        LayoutNode layoutNode = this.precomposeMap.get(obj);
        if (layoutNode != null) {
            List<LayoutNodeLayoutDelegate.MeasurePassDelegate> childDelegates$ui_release = layoutNode.getMeasurePassDelegate$ui_release().getChildDelegates$ui_release();
            int size2 = childDelegates$ui_release.size();
            for (int i3 = 0; i3 < size2; i3++) {
                childDelegates$ui_release.get(i3).markDetachedFromParentLookaheadPass$ui_release();
            }
            return childDelegates$ui_release;
        }
        i = C8569dql.i();
        return i;
    }

    private final void subcompose(LayoutNode layoutNode, Object obj, drX<? super Composer, ? super Integer, dpR> drx) {
        HashMap<LayoutNode, NodeState> hashMap = this.nodeToNodeState;
        NodeState nodeState = hashMap.get(layoutNode);
        if (nodeState == null) {
            nodeState = new NodeState(obj, ComposableSingletons$SubcomposeLayoutKt.INSTANCE.m1793getLambda1$ui_release(), null, 4, null);
            hashMap.put(layoutNode, nodeState);
        }
        NodeState nodeState2 = nodeState;
        ReusableComposition composition = nodeState2.getComposition();
        boolean hasInvalidations = composition != null ? composition.getHasInvalidations() : true;
        if (nodeState2.getContent() != drx || hasInvalidations || nodeState2.getForceRecompose()) {
            nodeState2.setContent(drx);
            subcompose(layoutNode, nodeState2);
            nodeState2.setForceRecompose(false);
        }
    }

    private final void disposeCurrentNodes() {
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        for (NodeState nodeState : this.nodeToNodeState.values()) {
            ReusableComposition composition = nodeState.getComposition();
            if (composition != null) {
                composition.dispose();
            }
        }
        this.root.removeAll$ui_release();
        layoutNode.ignoreRemeasureRequests = false;
        this.nodeToNodeState.clear();
        this.slotIdToNode.clear();
        this.precomposedCount = 0;
        this.reusableCount = 0;
        this.precomposeMap.clear();
        makeSureStateIsConsistent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void move(int i, int i2, int i3) {
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        this.root.move$ui_release(i, i2, i3);
        layoutNode.ignoreRemeasureRequests = false;
    }
}
