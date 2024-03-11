package androidx.compose.ui.modifier;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.BackwardsCompatNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import java.util.Set;
import o.dpR;
import o.drO;

/* loaded from: classes.dex */
public final class ModifierLocalManager {
    private boolean invalidated;
    private final Owner owner;
    private final MutableVector<BackwardsCompatNode> inserted = new MutableVector<>(new BackwardsCompatNode[16], 0);
    private final MutableVector<ModifierLocal<?>> insertedLocal = new MutableVector<>(new ModifierLocal[16], 0);
    private final MutableVector<LayoutNode> removed = new MutableVector<>(new LayoutNode[16], 0);
    private final MutableVector<ModifierLocal<?>> removedLocal = new MutableVector<>(new ModifierLocal[16], 0);

    public ModifierLocalManager(Owner owner) {
        this.owner = owner;
    }

    public final void invalidate() {
        if (this.invalidated) {
            return;
        }
        this.invalidated = true;
        this.owner.registerOnEndApplyChangesListener(new drO<dpR>() { // from class: androidx.compose.ui.modifier.ModifierLocalManager$invalidate$1
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
                ModifierLocalManager.this.triggerUpdates();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085 A[LOOP:2: B:19:0x007f->B:21:0x0085, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void triggerUpdates() {
        /*
            r8 = this;
            r0 = 0
            r8.invalidated = r0
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> r2 = r8.removed
            int r3 = r2.getSize()
            if (r3 <= 0) goto L40
            java.lang.Object[] r2 = r2.getContent()
            r4 = r0
        L15:
            r5 = r2[r4]
            androidx.compose.ui.node.LayoutNode r5 = (androidx.compose.ui.node.LayoutNode) r5
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.modifier.ModifierLocal<?>> r6 = r8.removedLocal
            java.lang.Object[] r6 = r6.getContent()
            r6 = r6[r4]
            androidx.compose.ui.modifier.ModifierLocal r6 = (androidx.compose.ui.modifier.ModifierLocal) r6
            androidx.compose.ui.node.NodeChain r7 = r5.getNodes$ui_release()
            androidx.compose.ui.Modifier$Node r7 = r7.getHead$ui_release()
            boolean r7 = r7.isAttached()
            if (r7 == 0) goto L3c
            androidx.compose.ui.node.NodeChain r5 = r5.getNodes$ui_release()
            androidx.compose.ui.Modifier$Node r5 = r5.getHead$ui_release()
            r8.invalidateConsumersOfNodeForKey(r5, r6, r1)
        L3c:
            int r4 = r4 + 1
            if (r4 < r3) goto L15
        L40:
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> r2 = r8.removed
            r2.clear()
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.modifier.ModifierLocal<?>> r2 = r8.removedLocal
            r2.clear()
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.BackwardsCompatNode> r2 = r8.inserted
            int r3 = r2.getSize()
            if (r3 <= 0) goto L71
            java.lang.Object[] r2 = r2.getContent()
        L56:
            r4 = r2[r0]
            androidx.compose.ui.node.BackwardsCompatNode r4 = (androidx.compose.ui.node.BackwardsCompatNode) r4
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.modifier.ModifierLocal<?>> r5 = r8.insertedLocal
            java.lang.Object[] r5 = r5.getContent()
            r5 = r5[r0]
            androidx.compose.ui.modifier.ModifierLocal r5 = (androidx.compose.ui.modifier.ModifierLocal) r5
            boolean r6 = r4.isAttached()
            if (r6 == 0) goto L6d
            r8.invalidateConsumersOfNodeForKey(r4, r5, r1)
        L6d:
            int r0 = r0 + 1
            if (r0 < r3) goto L56
        L71:
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.BackwardsCompatNode> r0 = r8.inserted
            r0.clear()
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.modifier.ModifierLocal<?>> r0 = r8.insertedLocal
            r0.clear()
            java.util.Iterator r0 = r1.iterator()
        L7f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8f
            java.lang.Object r1 = r0.next()
            androidx.compose.ui.node.BackwardsCompatNode r1 = (androidx.compose.ui.node.BackwardsCompatNode) r1
            r1.updateModifierLocalConsumer()
            goto L7f
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.modifier.ModifierLocalManager.triggerUpdates():void");
    }

    public final void removedProvider(BackwardsCompatNode backwardsCompatNode, ModifierLocal<?> modifierLocal) {
        this.removed.add(DelegatableNodeKt.requireLayoutNode(backwardsCompatNode));
        this.removedLocal.add(modifierLocal);
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void invalidateConsumersOfNodeForKey(Modifier.Node node, ModifierLocal<?> modifierLocal, Set<BackwardsCompatNode> set) {
        int m1935constructorimpl = NodeKind.m1935constructorimpl(32);
        if (!node.getNode().isAttached()) {
            throw new IllegalStateException("visitSubtreeIf called on an unattached node".toString());
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = node.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node.getNode());
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node node2 = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node2.getAggregateChildKindSet$ui_release() & m1935constructorimpl) != 0) {
                for (Modifier.Node node3 = node2; node3 != null; node3 = node3.getChild$ui_release()) {
                    if ((node3.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                        Modifier.Node node4 = node3;
                        MutableVector mutableVector2 = null;
                        while (node4 != null) {
                            if (node4 instanceof ModifierLocalModifierNode) {
                                ModifierLocalModifierNode modifierLocalModifierNode = (ModifierLocalModifierNode) node4;
                                if (modifierLocalModifierNode instanceof BackwardsCompatNode) {
                                    BackwardsCompatNode backwardsCompatNode = (BackwardsCompatNode) modifierLocalModifierNode;
                                    if ((backwardsCompatNode.getElement() instanceof ModifierLocalConsumer) && backwardsCompatNode.getReadValues().contains(modifierLocal)) {
                                        set.add(modifierLocalModifierNode);
                                    }
                                }
                                if (!(!modifierLocalModifierNode.getProvidedValues().contains$ui_release(modifierLocal))) {
                                    break;
                                }
                            } else if ((node4.getKindSet$ui_release() & m1935constructorimpl) != 0 && (node4 instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node4).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            node4 = delegate$ui_release;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node4 != null) {
                                                mutableVector2.add(node4);
                                                node4 = null;
                                            }
                                            mutableVector2.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            node4 = DelegatableNodeKt.pop(mutableVector2);
                        }
                        continue;
                    }
                }
            }
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node2);
        }
    }

    public final void updatedProvider(BackwardsCompatNode backwardsCompatNode, ModifierLocal<?> modifierLocal) {
        this.inserted.add(backwardsCompatNode);
        this.insertedLocal.add(modifierLocal);
        invalidate();
    }

    public final void insertedProvider(BackwardsCompatNode backwardsCompatNode, ModifierLocal<?> modifierLocal) {
        this.inserted.add(backwardsCompatNode);
        this.insertedLocal.add(modifierLocal);
        invalidate();
    }
}
