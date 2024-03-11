package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class NodeChain {
    private MutableVector<Modifier.Element> buffer;
    private Differ cachedDiffer;
    private MutableVector<Modifier.Element> current;
    private Modifier.Node head;
    private final InnerNodeCoordinator innerCoordinator;
    private final LayoutNode layoutNode;
    private Logger logger;
    private NodeCoordinator outerCoordinator;
    private final Modifier.Node tail;

    /* loaded from: classes.dex */
    public interface Logger {
        void linearDiffAborted(int i, Modifier.Element element, Modifier.Element element2, Modifier.Node node);

        void nodeInserted(int i, int i2, Modifier.Element element, Modifier.Node node, Modifier.Node node2);

        void nodeRemoved(int i, Modifier.Element element, Modifier.Node node);

        void nodeReused(int i, int i2, Modifier.Element element, Modifier.Element element2, Modifier.Node node);

        void nodeUpdated(int i, int i2, Modifier.Element element, Modifier.Element element2, Modifier.Node node);
    }

    public final Modifier.Node getHead$ui_release() {
        return this.head;
    }

    public final InnerNodeCoordinator getInnerCoordinator$ui_release() {
        return this.innerCoordinator;
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final NodeCoordinator getOuterCoordinator$ui_release() {
        return this.outerCoordinator;
    }

    public final Modifier.Node getTail$ui_release() {
        return this.tail;
    }

    public NodeChain(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
        InnerNodeCoordinator innerNodeCoordinator = new InnerNodeCoordinator(layoutNode);
        this.innerCoordinator = innerNodeCoordinator;
        this.outerCoordinator = innerNodeCoordinator;
        TailModifierNode tail = innerNodeCoordinator.getTail();
        this.tail = tail;
        this.head = tail;
    }

    public final int getAggregateChildKindSet() {
        return this.head.getAggregateChildKindSet$ui_release();
    }

    private final Modifier.Node padChain() {
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$1;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$12;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$13;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$14;
        Modifier.Node node = this.head;
        nodeChainKt$SentinelHead$1 = NodeChainKt.SentinelHead;
        if (node == nodeChainKt$SentinelHead$1) {
            throw new IllegalStateException("padChain called on already padded chain".toString());
        }
        Modifier.Node node2 = this.head;
        nodeChainKt$SentinelHead$12 = NodeChainKt.SentinelHead;
        node2.setParent$ui_release(nodeChainKt$SentinelHead$12);
        nodeChainKt$SentinelHead$13 = NodeChainKt.SentinelHead;
        nodeChainKt$SentinelHead$13.setChild$ui_release(node2);
        nodeChainKt$SentinelHead$14 = NodeChainKt.SentinelHead;
        return nodeChainKt$SentinelHead$14;
    }

    private final Modifier.Node trimChain(Modifier.Node node) {
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$1;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$12;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$13;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$14;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$15;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$16;
        nodeChainKt$SentinelHead$1 = NodeChainKt.SentinelHead;
        if (node != nodeChainKt$SentinelHead$1) {
            throw new IllegalStateException("trimChain called on already trimmed chain".toString());
        }
        nodeChainKt$SentinelHead$12 = NodeChainKt.SentinelHead;
        Modifier.Node child$ui_release = nodeChainKt$SentinelHead$12.getChild$ui_release();
        if (child$ui_release == null) {
            child$ui_release = this.tail;
        }
        child$ui_release.setParent$ui_release(null);
        nodeChainKt$SentinelHead$13 = NodeChainKt.SentinelHead;
        nodeChainKt$SentinelHead$13.setChild$ui_release(null);
        nodeChainKt$SentinelHead$14 = NodeChainKt.SentinelHead;
        nodeChainKt$SentinelHead$14.setAggregateChildKindSet$ui_release(-1);
        nodeChainKt$SentinelHead$15 = NodeChainKt.SentinelHead;
        nodeChainKt$SentinelHead$15.updateCoordinator$ui_release(null);
        nodeChainKt$SentinelHead$16 = NodeChainKt.SentinelHead;
        if (child$ui_release != nodeChainKt$SentinelHead$16) {
            return child$ui_release;
        }
        throw new IllegalStateException("trimChain did not update the head".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0092, code lost:
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0093, code lost:
        if (r2 >= r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0095, code lost:
        if (r8 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0097, code lost:
        if (r5 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0099, code lost:
        structuralUpdate(r2, r8, r9, r5, r18.layoutNode.isAttached());
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x00b6, code lost:
        throw new java.lang.IllegalStateException("structuralUpdate requires a non-null tail".toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x00c0, code lost:
        throw new java.lang.IllegalStateException("expected prior modifier list to be non-empty".toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void updateFrom$ui_release(androidx.compose.ui.Modifier r19) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.NodeChain.updateFrom$ui_release(androidx.compose.ui.Modifier):void");
    }

    public final void syncCoordinators() {
        LayoutModifierNodeCoordinator layoutModifierNodeCoordinator;
        NodeCoordinator nodeCoordinator = this.innerCoordinator;
        for (Modifier.Node parent$ui_release = this.tail.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            LayoutModifierNode asLayoutModifierNode = DelegatableNodeKt.asLayoutModifierNode(parent$ui_release);
            if (asLayoutModifierNode != null) {
                if (parent$ui_release.getCoordinator$ui_release() != null) {
                    NodeCoordinator coordinator$ui_release = parent$ui_release.getCoordinator$ui_release();
                    C8632dsu.d(coordinator$ui_release);
                    layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) coordinator$ui_release;
                    LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.getLayoutModifierNode();
                    layoutModifierNodeCoordinator.setLayoutModifierNode$ui_release(asLayoutModifierNode);
                    if (layoutModifierNode != parent$ui_release) {
                        layoutModifierNodeCoordinator.onLayoutModifierNodeChanged();
                    }
                } else {
                    layoutModifierNodeCoordinator = new LayoutModifierNodeCoordinator(this.layoutNode, asLayoutModifierNode);
                    parent$ui_release.updateCoordinator$ui_release(layoutModifierNodeCoordinator);
                }
                nodeCoordinator.setWrappedBy$ui_release(layoutModifierNodeCoordinator);
                layoutModifierNodeCoordinator.setWrapped$ui_release(nodeCoordinator);
                nodeCoordinator = layoutModifierNodeCoordinator;
            } else {
                parent$ui_release.updateCoordinator$ui_release(nodeCoordinator);
            }
        }
        LayoutNode parent$ui_release2 = this.layoutNode.getParent$ui_release();
        nodeCoordinator.setWrappedBy$ui_release(parent$ui_release2 != null ? parent$ui_release2.getInnerCoordinator$ui_release() : null);
        this.outerCoordinator = nodeCoordinator;
    }

    private final void syncAggregateChildKindSet() {
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$1;
        int i = 0;
        for (Modifier.Node parent$ui_release = this.tail.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            nodeChainKt$SentinelHead$1 = NodeChainKt.SentinelHead;
            if (parent$ui_release == nodeChainKt$SentinelHead$1) {
                return;
            }
            i |= parent$ui_release.getKindSet$ui_release();
            parent$ui_release.setAggregateChildKindSet$ui_release(i);
        }
    }

    private final Differ getDiffer(Modifier.Node node, int i, MutableVector<Modifier.Element> mutableVector, MutableVector<Modifier.Element> mutableVector2, boolean z) {
        Differ differ = this.cachedDiffer;
        if (differ == null) {
            Differ differ2 = new Differ(node, i, mutableVector, mutableVector2, z);
            this.cachedDiffer = differ2;
            return differ2;
        }
        differ.setNode(node);
        differ.setOffset(i);
        differ.setBefore(mutableVector);
        differ.setAfter(mutableVector2);
        differ.setShouldAttachOnInsert(z);
        return differ;
    }

    public final void propagateCoordinator(Modifier.Node node, NodeCoordinator nodeCoordinator) {
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$1;
        for (Modifier.Node parent$ui_release = node.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            nodeChainKt$SentinelHead$1 = NodeChainKt.SentinelHead;
            if (parent$ui_release == nodeChainKt$SentinelHead$1) {
                LayoutNode parent$ui_release2 = this.layoutNode.getParent$ui_release();
                nodeCoordinator.setWrappedBy$ui_release(parent$ui_release2 != null ? parent$ui_release2.getInnerCoordinator$ui_release() : null);
                this.outerCoordinator = nodeCoordinator;
                return;
            } else if ((NodeKind.m1935constructorimpl(2) & parent$ui_release.getKindSet$ui_release()) != 0) {
                return;
            } else {
                parent$ui_release.updateCoordinator$ui_release(nodeCoordinator);
            }
        }
    }

    /* loaded from: classes.dex */
    public final class Differ implements DiffCallback {
        private MutableVector<Modifier.Element> after;
        private MutableVector<Modifier.Element> before;
        private Modifier.Node node;
        private int offset;
        private boolean shouldAttachOnInsert;

        public final void setAfter(MutableVector<Modifier.Element> mutableVector) {
            this.after = mutableVector;
        }

        public final void setBefore(MutableVector<Modifier.Element> mutableVector) {
            this.before = mutableVector;
        }

        public final void setNode(Modifier.Node node) {
            this.node = node;
        }

        public final void setOffset(int i) {
            this.offset = i;
        }

        public final void setShouldAttachOnInsert(boolean z) {
            this.shouldAttachOnInsert = z;
        }

        public Differ(Modifier.Node node, int i, MutableVector<Modifier.Element> mutableVector, MutableVector<Modifier.Element> mutableVector2, boolean z) {
            NodeChain.this = r1;
            this.node = node;
            this.offset = i;
            this.before = mutableVector;
            this.after = mutableVector2;
            this.shouldAttachOnInsert = z;
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public void remove(int i, int i2) {
            Modifier.Node child$ui_release = this.node.getChild$ui_release();
            C8632dsu.d(child$ui_release);
            Logger logger = NodeChain.this.logger;
            if (logger != null) {
                logger.nodeRemoved(i2, this.before.getContent()[this.offset + i2], child$ui_release);
            }
            if ((NodeKind.m1935constructorimpl(2) & child$ui_release.getKindSet$ui_release()) != 0) {
                NodeCoordinator coordinator$ui_release = child$ui_release.getCoordinator$ui_release();
                C8632dsu.d(coordinator$ui_release);
                NodeCoordinator wrappedBy$ui_release = coordinator$ui_release.getWrappedBy$ui_release();
                NodeCoordinator wrapped$ui_release = coordinator$ui_release.getWrapped$ui_release();
                C8632dsu.d(wrapped$ui_release);
                if (wrappedBy$ui_release != null) {
                    wrappedBy$ui_release.setWrapped$ui_release(wrapped$ui_release);
                }
                wrapped$ui_release.setWrappedBy$ui_release(wrappedBy$ui_release);
                NodeChain.this.propagateCoordinator(this.node, wrapped$ui_release);
            }
            this.node = NodeChain.this.detachAndRemoveNode(child$ui_release);
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public void same(int i, int i2) {
            Modifier.Node child$ui_release = this.node.getChild$ui_release();
            C8632dsu.d(child$ui_release);
            this.node = child$ui_release;
            Modifier.Element element = this.before.getContent()[this.offset + i];
            Modifier.Element element2 = this.after.getContent()[this.offset + i2];
            if (!C8632dsu.c(element, element2)) {
                NodeChain.this.updateNode(element, element2, this.node);
                Logger logger = NodeChain.this.logger;
                if (logger != null) {
                    int i3 = this.offset;
                    logger.nodeUpdated(i3 + i, i3 + i2, element, element2, this.node);
                    return;
                }
                return;
            }
            Logger logger2 = NodeChain.this.logger;
            if (logger2 != null) {
                int i4 = this.offset;
                logger2.nodeReused(i4 + i, i4 + i2, element, element2, this.node);
            }
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public boolean areItemsTheSame(int i, int i2) {
            return NodeChainKt.actionForModifiers(this.before.getContent()[this.offset + i], this.after.getContent()[this.offset + i2]) != 0;
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public void insert(int i) {
            int i2 = this.offset + i;
            Modifier.Node node = this.node;
            this.node = NodeChain.this.createAndInsertNodeAsChild(this.after.getContent()[i2], node);
            Logger logger = NodeChain.this.logger;
            if (logger != null) {
                logger.nodeInserted(i2, i2, this.after.getContent()[i2], node, this.node);
            }
            if (this.shouldAttachOnInsert) {
                Modifier.Node child$ui_release = this.node.getChild$ui_release();
                C8632dsu.d(child$ui_release);
                NodeCoordinator coordinator$ui_release = child$ui_release.getCoordinator$ui_release();
                C8632dsu.d(coordinator$ui_release);
                LayoutModifierNode asLayoutModifierNode = DelegatableNodeKt.asLayoutModifierNode(this.node);
                if (asLayoutModifierNode != null) {
                    LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = new LayoutModifierNodeCoordinator(NodeChain.this.getLayoutNode(), asLayoutModifierNode);
                    this.node.updateCoordinator$ui_release(layoutModifierNodeCoordinator);
                    NodeChain.this.propagateCoordinator(this.node, layoutModifierNodeCoordinator);
                    layoutModifierNodeCoordinator.setWrappedBy$ui_release(coordinator$ui_release.getWrappedBy$ui_release());
                    layoutModifierNodeCoordinator.setWrapped$ui_release(coordinator$ui_release);
                    coordinator$ui_release.setWrappedBy$ui_release(layoutModifierNodeCoordinator);
                } else {
                    this.node.updateCoordinator$ui_release(coordinator$ui_release);
                }
                this.node.markAsAttached$ui_release();
                this.node.runAttachLifecycle$ui_release();
                NodeKindKt.autoInvalidateInsertedNode(this.node);
                return;
            }
            this.node.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
        }
    }

    private final void structuralUpdate(int i, MutableVector<Modifier.Element> mutableVector, MutableVector<Modifier.Element> mutableVector2, Modifier.Node node, boolean z) {
        MyersDiffKt.executeDiff(mutableVector.getSize() - i, mutableVector2.getSize() - i, getDiffer(node, i, mutableVector, mutableVector2, z));
        syncAggregateChildKindSet();
    }

    public final Modifier.Node detachAndRemoveNode(Modifier.Node node) {
        if (node.isAttached()) {
            NodeKindKt.autoInvalidateRemovedNode(node);
            node.runDetachLifecycle$ui_release();
            node.markAsDetached$ui_release();
        }
        return removeNode(node);
    }

    private final Modifier.Node removeNode(Modifier.Node node) {
        Modifier.Node child$ui_release = node.getChild$ui_release();
        Modifier.Node parent$ui_release = node.getParent$ui_release();
        if (child$ui_release != null) {
            child$ui_release.setParent$ui_release(parent$ui_release);
            node.setChild$ui_release(null);
        }
        if (parent$ui_release != null) {
            parent$ui_release.setChild$ui_release(child$ui_release);
            node.setParent$ui_release(null);
        }
        C8632dsu.d(parent$ui_release);
        return parent$ui_release;
    }

    public final Modifier.Node createAndInsertNodeAsChild(Modifier.Element element, Modifier.Node node) {
        Modifier.Node backwardsCompatNode;
        if (element instanceof ModifierNodeElement) {
            backwardsCompatNode = ((ModifierNodeElement) element).create();
            backwardsCompatNode.setKindSet$ui_release(NodeKindKt.calculateNodeKindSetFromIncludingDelegates(backwardsCompatNode));
        } else {
            backwardsCompatNode = new BackwardsCompatNode(element);
        }
        if (!(!backwardsCompatNode.isAttached())) {
            throw new IllegalStateException("A ModifierNodeElement cannot return an already attached node from create() ".toString());
        }
        backwardsCompatNode.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
        return insertChild(backwardsCompatNode, node);
    }

    private final Modifier.Node insertChild(Modifier.Node node, Modifier.Node node2) {
        Modifier.Node child$ui_release = node2.getChild$ui_release();
        if (child$ui_release != null) {
            child$ui_release.setParent$ui_release(node);
            node.setChild$ui_release(child$ui_release);
        }
        node2.setChild$ui_release(node);
        node.setParent$ui_release(node2);
        return node;
    }

    public final void updateNode(Modifier.Element element, Modifier.Element element2, Modifier.Node node) {
        if ((element instanceof ModifierNodeElement) && (element2 instanceof ModifierNodeElement)) {
            NodeChainKt.updateUnsafe((ModifierNodeElement) element2, node);
            if (node.isAttached()) {
                NodeKindKt.autoInvalidateUpdatedNode(node);
            } else {
                node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
            }
        } else if (node instanceof BackwardsCompatNode) {
            ((BackwardsCompatNode) node).setElement(element2);
            if (node.isAttached()) {
                NodeKindKt.autoInvalidateUpdatedNode(node);
            } else {
                node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
            }
        } else {
            throw new IllegalStateException("Unknown Modifier.Node type".toString());
        }
    }

    /* renamed from: has-H91voCI$ui_release */
    public final boolean m1905hasH91voCI$ui_release(int i) {
        return (i & getAggregateChildKindSet()) != 0;
    }

    public final boolean has$ui_release(int i) {
        return (i & getAggregateChildKindSet()) != 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (this.head == this.tail) {
            sb.append("]");
        } else {
            Modifier.Node head$ui_release = getHead$ui_release();
            while (true) {
                if (head$ui_release == null || head$ui_release == getTail$ui_release()) {
                    break;
                }
                sb.append(String.valueOf(head$ui_release));
                if (head$ui_release.getChild$ui_release() == this.tail) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                head$ui_release = head$ui_release.getChild$ui_release();
            }
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }

    public final void resetState$ui_release() {
        int size;
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if (tail$ui_release.isAttached()) {
                tail$ui_release.reset$ui_release();
            }
        }
        MutableVector<Modifier.Element> mutableVector = this.current;
        if (mutableVector == null || (size = mutableVector.getSize()) <= 0) {
            runDetachLifecycle$ui_release();
            markAsDetached$ui_release();
        }
        Modifier.Element[] content = mutableVector.getContent();
        int i = 0;
        do {
            Modifier.Element element = content[i];
            if (element instanceof SuspendPointerInputElement) {
                mutableVector.set(i, new ForceUpdateElement((ModifierNodeElement) element));
            }
            i++;
        } while (i < size);
        runDetachLifecycle$ui_release();
        markAsDetached$ui_release();
    }

    public final void markAsAttached() {
        for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            head$ui_release.markAsAttached$ui_release();
        }
    }

    public final void runAttachLifecycle() {
        for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            head$ui_release.runAttachLifecycle$ui_release();
            if (head$ui_release.getInsertedNodeAwaitingAttachForInvalidation$ui_release()) {
                NodeKindKt.autoInvalidateInsertedNode(head$ui_release);
            }
            if (head$ui_release.getUpdatedNodeAwaitingAttachForInvalidation$ui_release()) {
                NodeKindKt.autoInvalidateUpdatedNode(head$ui_release);
            }
            head$ui_release.setInsertedNodeAwaitingAttachForInvalidation$ui_release(false);
            head$ui_release.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(false);
        }
    }

    public final void markAsDetached$ui_release() {
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if (tail$ui_release.isAttached()) {
                tail$ui_release.markAsDetached$ui_release();
            }
        }
    }

    public final void runDetachLifecycle$ui_release() {
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if (tail$ui_release.isAttached()) {
                tail$ui_release.runDetachLifecycle$ui_release();
            }
        }
    }
}
