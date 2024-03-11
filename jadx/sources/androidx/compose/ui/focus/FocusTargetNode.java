package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import kotlin.jvm.internal.Ref;
import o.C8632dsu;
import o.dpR;
import o.drO;

/* loaded from: classes.dex */
public final class FocusTargetNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, FocusTargetModifierNode, ObserverModifierNode, ModifierLocalModifierNode {
    private FocusStateImpl committedFocusState = FocusStateImpl.Inactive;
    private boolean isProcessingCustomEnter;
    private boolean isProcessingCustomExit;

    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FocusStateImpl getFocusState() {
        FocusStateImpl uncommittedFocusState;
        FocusTransactionManager access$getFocusTransactionManager = FocusTargetNodeKt.access$getFocusTransactionManager(this);
        return (access$getFocusTransactionManager == null || (uncommittedFocusState = access$getFocusTransactionManager.getUncommittedFocusState(this)) == null) ? this.committedFocusState : uncommittedFocusState;
    }

    public void setFocusState(FocusStateImpl focusStateImpl) {
        FocusTargetNodeKt.requireTransactionManager(this).setUncommittedFocusState(this, focusStateImpl);
    }

    public final BeyondBoundsLayout getBeyondBoundsLayoutParent() {
        return (BeyondBoundsLayout) getCurrent(androidx.compose.ui.layout.BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout());
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        FocusStateImpl focusState = getFocusState();
        invalidateFocus$ui_release();
        if (focusState != getFocusState()) {
            FocusEventModifierNodeKt.refreshFocusEventNodes(this);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        boolean z;
        int i = WhenMappings.$EnumSwitchMapping$0[getFocusState().ordinal()];
        if (i == 1 || i == 2) {
            DelegatableNodeKt.requireOwner(this).getFocusOwner().clearFocus(true);
        } else if (i != 3) {
            if (i != 4) {
                return;
            }
            scheduleInvalidationForFocusEvents$ui_release();
        } else {
            scheduleInvalidationForFocusEvents$ui_release();
            FocusTransactionManager requireTransactionManager = FocusTargetNodeKt.requireTransactionManager(this);
            try {
                z = requireTransactionManager.ongoingTransaction;
                if (z) {
                    requireTransactionManager.cancelTransaction();
                }
                requireTransactionManager.beginTransaction();
                setFocusState(FocusStateImpl.Inactive);
                dpR dpr = dpR.c;
            } finally {
                requireTransactionManager.commitTransaction();
            }
        }
    }

    public final FocusProperties fetchFocusProperties$ui_release() {
        NodeChain nodes$ui_release;
        FocusPropertiesImpl focusPropertiesImpl = new FocusPropertiesImpl();
        int m1935constructorimpl = NodeKind.m1935constructorimpl(2048);
        int m1935constructorimpl2 = NodeKind.m1935constructorimpl(1024);
        Modifier.Node node = getNode();
        int i = m1935constructorimpl | m1935constructorimpl2;
        if (!getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node node2 = getNode();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
        loop0: while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui_release() & i) != 0) {
                        if (node2 != node && (node2.getKindSet$ui_release() & m1935constructorimpl2) != 0) {
                            break loop0;
                        } else if ((node2.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                            Modifier.Node node3 = node2;
                            MutableVector mutableVector = null;
                            while (node3 != null) {
                                if (node3 instanceof FocusPropertiesModifierNode) {
                                    ((FocusPropertiesModifierNode) node3).applyFocusProperties(focusPropertiesImpl);
                                } else if ((node3.getKindSet$ui_release() & m1935constructorimpl) != 0 && (node3 instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) node3).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                node3 = delegate$ui_release;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (node3 != null) {
                                                    mutableVector.add(node3);
                                                    node3 = null;
                                                }
                                                mutableVector.add(delegate$ui_release);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                node3 = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                    }
                    node2 = node2.getParent$ui_release();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            node2 = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
        return focusPropertiesImpl;
    }

    public final void commitFocusState$ui_release() {
        FocusStateImpl uncommittedFocusState = FocusTargetNodeKt.requireTransactionManager(this).getUncommittedFocusState(this);
        if (uncommittedFocusState == null) {
            throw new IllegalStateException("committing a node that was not updated in the current transaction".toString());
        }
        this.committedFocusState = uncommittedFocusState;
    }

    public final void invalidateFocus$ui_release() {
        FocusProperties focusProperties;
        int i = WhenMappings.$EnumSwitchMapping$0[getFocusState().ordinal()];
        if (i == 1 || i == 2) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ObserverModifierNodeKt.observeReads(this, new drO<dpR>() { // from class: androidx.compose.ui.focus.FocusTargetNode$invalidateFocus$1
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

                /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.focus.FocusProperties, T] */
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    objectRef.d = this.fetchFocusProperties$ui_release();
                }
            });
            T t = objectRef.d;
            if (t == 0) {
                C8632dsu.d("");
                focusProperties = null;
            } else {
                focusProperties = (FocusProperties) t;
            }
            if (focusProperties.getCanFocus()) {
                return;
            }
            DelegatableNodeKt.requireOwner(this).getFocusOwner().clearFocus(true);
        }
    }

    public final void scheduleInvalidationForFocusEvents$ui_release() {
        NodeChain nodes$ui_release;
        Modifier.Node node = getNode();
        int m1935constructorimpl = NodeKind.m1935constructorimpl(4096);
        MutableVector mutableVector = null;
        while (node != null) {
            if (node instanceof FocusEventModifierNode) {
                FocusEventModifierNodeKt.invalidateFocusEvent((FocusEventModifierNode) node);
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
        int m1935constructorimpl2 = NodeKind.m1935constructorimpl(4096) | NodeKind.m1935constructorimpl(1024);
        if (!getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node parent$ui_release = getNode().getParent$ui_release();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m1935constructorimpl2) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & m1935constructorimpl2) != 0 && (NodeKind.m1935constructorimpl(1024) & parent$ui_release.getKindSet$ui_release()) == 0 && parent$ui_release.isAttached()) {
                        int m1935constructorimpl3 = NodeKind.m1935constructorimpl(4096);
                        MutableVector mutableVector2 = null;
                        Modifier.Node node2 = parent$ui_release;
                        while (node2 != null) {
                            if (node2 instanceof FocusEventModifierNode) {
                                FocusEventModifierNodeKt.invalidateFocusEvent((FocusEventModifierNode) node2);
                            } else if ((node2.getKindSet$ui_release() & m1935constructorimpl3) != 0 && (node2 instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) node2).getDelegate$ui_release(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild$ui_release()) {
                                    if ((delegate$ui_release2.getKindSet$ui_release() & m1935constructorimpl3) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node2 = delegate$ui_release2;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node2 != null) {
                                                mutableVector2.add(node2);
                                                node2 = null;
                                            }
                                            mutableVector2.add(delegate$ui_release2);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            node2 = DelegatableNodeKt.pop(mutableVector2);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            parent$ui_release = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
    }

    /* loaded from: classes.dex */
    public static final class FocusTargetElement extends ModifierNodeElement<FocusTargetNode> {
        public static final FocusTargetElement INSTANCE = new FocusTargetElement();

        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            return 1739042953;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(FocusTargetNode focusTargetNode) {
        }

        private FocusTargetElement() {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public FocusTargetNode create() {
            return new FocusTargetNode();
        }
    }
}
