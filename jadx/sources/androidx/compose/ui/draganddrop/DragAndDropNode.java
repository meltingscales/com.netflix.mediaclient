package androidx.compose.ui.draganddrop;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import kotlin.jvm.internal.Ref;
import o.C8627dsp;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class DragAndDropNode extends Modifier.Node implements TraversableNode, DragAndDropModifierNode {
    private DragAndDropModifierNode lastChildDragAndDropModifierNode;
    private final drM<DragAndDropEvent, DragAndDropTarget> onDragAndDropStart;
    private DragAndDropTarget thisDragAndDropTarget;
    private final Object traverseKey = Companion.DragAndDropTraversableKey.INSTANCE;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Override // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.thisDragAndDropTarget = null;
        this.lastChildDragAndDropModifierNode = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropNode(drM<? super DragAndDropEvent, ? extends DragAndDropTarget> drm) {
        this.onDragAndDropStart = drm;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        /* loaded from: classes.dex */
        static final class DragAndDropTraversableKey {
            public static final DragAndDropTraversableKey INSTANCE = new DragAndDropTraversableKey();

            private DragAndDropTraversableKey() {
            }
        }

        private Companion() {
        }
    }

    public boolean acceptDragAndDropTransfer(final DragAndDropEvent dragAndDropEvent) {
        if (isAttached()) {
            if (this.thisDragAndDropTarget != null) {
                throw new IllegalStateException("DragAndDropTarget self reference must be null at the start of a drag and drop session".toString());
            }
            this.thisDragAndDropTarget = this.onDragAndDropStart.invoke(dragAndDropEvent);
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            TraversableNodeKt.traverseChildren(this, new drM<DragAndDropNode, Boolean>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$acceptDragAndDropTransfer$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public final Boolean invoke(DragAndDropNode dragAndDropNode) {
                    Ref.BooleanRef booleanRef2 = Ref.BooleanRef.this;
                    boolean z = booleanRef2.a;
                    boolean acceptDragAndDropTransfer = dragAndDropNode.acceptDragAndDropTransfer(dragAndDropEvent);
                    DragAndDropNode dragAndDropNode2 = this;
                    if (acceptDragAndDropTransfer) {
                        DelegatableNodeKt.requireOwner(dragAndDropNode2).getDragAndDropManager().registerNodeInterest(dragAndDropNode);
                    }
                    dpR dpr = dpR.c;
                    booleanRef2.a = z | acceptDragAndDropTransfer;
                    return Boolean.TRUE;
                }
            });
            return booleanRef.a || this.thisDragAndDropTarget != null;
        }
        return false;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onStarted(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.onStarted(dragAndDropEvent);
            return;
        }
        DragAndDropModifierNode dragAndDropModifierNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropModifierNode != null) {
            dragAndDropModifierNode.onStarted(dragAndDropEvent);
        }
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onEntered(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.onEntered(dragAndDropEvent);
            return;
        }
        DragAndDropModifierNode dragAndDropModifierNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropModifierNode != null) {
            dragAndDropModifierNode.onEntered(dragAndDropEvent);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMoved(final androidx.compose.ui.draganddrop.DragAndDropEvent r5) {
        /*
            r4 = this;
            androidx.compose.ui.draganddrop.DragAndDropModifierNode r0 = r4.lastChildDragAndDropModifierNode
            if (r0 == 0) goto L11
            long r1 = androidx.compose.ui.draganddrop.DragAndDrop_androidKt.getPositionInRoot(r5)
            boolean r1 = androidx.compose.ui.draganddrop.DragAndDropNodeKt.m1064access$containsUv8p0NA(r0, r1)
            r2 = 1
            if (r1 != r2) goto L11
            r1 = r0
            goto L30
        L11:
            androidx.compose.ui.Modifier$Node r1 = r4.getNode()
            boolean r1 = r1.isAttached()
            if (r1 != 0) goto L1d
            r1 = 0
            goto L30
        L1d:
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            androidx.compose.ui.draganddrop.DragAndDropNode$Companion$DragAndDropTraversableKey r2 = androidx.compose.ui.draganddrop.DragAndDropNode.Companion.DragAndDropTraversableKey.INSTANCE
            androidx.compose.ui.draganddrop.DragAndDropNode$onMoved$$inlined$firstChildOrNull$1 r3 = new androidx.compose.ui.draganddrop.DragAndDropNode$onMoved$$inlined$firstChildOrNull$1
            r3.<init>()
            androidx.compose.ui.node.TraversableNodeKt.traverseDescendants(r4, r2, r3)
            T r1 = r1.d
            androidx.compose.ui.draganddrop.DragAndDropModifierNode r1 = (androidx.compose.ui.draganddrop.DragAndDropModifierNode) r1
        L30:
            if (r1 == 0) goto L3f
            if (r0 != 0) goto L3f
            androidx.compose.ui.draganddrop.DragAndDropTarget r0 = r4.thisDragAndDropTarget
            if (r0 == 0) goto L3b
            r0.onExited(r5)
        L3b:
            androidx.compose.ui.draganddrop.DragAndDropNodeKt.access$dispatchEntered(r1, r5)
            goto L6c
        L3f:
            if (r1 != 0) goto L4e
            if (r0 == 0) goto L4e
            r0.onExited(r5)
            androidx.compose.ui.draganddrop.DragAndDropTarget r0 = r4.thisDragAndDropTarget
            if (r0 == 0) goto L6c
            androidx.compose.ui.draganddrop.DragAndDropNodeKt.access$dispatchEntered(r0, r5)
            goto L6c
        L4e:
            boolean r2 = o.C8632dsu.c(r1, r0)
            if (r2 != 0) goto L5f
            if (r0 == 0) goto L59
            r0.onExited(r5)
        L59:
            if (r1 == 0) goto L6c
            androidx.compose.ui.draganddrop.DragAndDropNodeKt.access$dispatchEntered(r1, r5)
            goto L6c
        L5f:
            if (r1 == 0) goto L65
            r1.onMoved(r5)
            goto L6c
        L65:
            androidx.compose.ui.draganddrop.DragAndDropTarget r0 = r4.thisDragAndDropTarget
            if (r0 == 0) goto L6c
            r0.onMoved(r5)
        L6c:
            r4.lastChildDragAndDropModifierNode = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.draganddrop.DragAndDropNode.onMoved(androidx.compose.ui.draganddrop.DragAndDropEvent):void");
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onExited(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.onExited(dragAndDropEvent);
        }
        DragAndDropModifierNode dragAndDropModifierNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropModifierNode != null) {
            dragAndDropModifierNode.onExited(dragAndDropEvent);
        }
        this.lastChildDragAndDropModifierNode = null;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public boolean onDrop(DragAndDropEvent dragAndDropEvent) {
        DragAndDropModifierNode dragAndDropModifierNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropModifierNode == null) {
            DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
            if (dragAndDropTarget != null) {
                return dragAndDropTarget.onDrop(dragAndDropEvent);
            }
            return false;
        }
        return dragAndDropModifierNode.onDrop(dragAndDropEvent);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onEnded(final DragAndDropEvent dragAndDropEvent) {
        if (getNode().isAttached()) {
            TraversableNodeKt.traverseChildren(this, new drM<DragAndDropNode, Boolean>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$onEnded$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                public final Boolean invoke(DragAndDropNode dragAndDropNode) {
                    dragAndDropNode.onEnded(DragAndDropEvent.this);
                    return Boolean.TRUE;
                }
            });
            DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
            if (dragAndDropTarget != null) {
                dragAndDropTarget.onEnded(dragAndDropEvent);
            }
            this.thisDragAndDropTarget = null;
            this.lastChildDragAndDropModifierNode = null;
        }
    }
}
