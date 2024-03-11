package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Actual_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.TraversableNode;
import o.C8632dsu;
import o.drM;

/* loaded from: classes.dex */
public final class TraversableNodeKt {
    public static final <T extends TraversableNode> void traverseAncestors(T t, drM<? super T, Boolean> drm) {
        NodeChain nodes$ui_release;
        int m1935constructorimpl = NodeKind.m1935constructorimpl(262144);
        if (!t.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node parent$ui_release = t.getNode().getParent$ui_release();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(t);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m1935constructorimpl) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                        Modifier.Node node = parent$ui_release;
                        MutableVector mutableVector = null;
                        while (node != null) {
                            if (node instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) node;
                                if (C8632dsu.c(t.getTraverseKey(), traversableNode.getTraverseKey()) && Actual_jvmKt.areObjectsOfSameType(t, traversableNode) && !drm.invoke(traversableNode).booleanValue()) {
                                    return;
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
                        continue;
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            parent$ui_release = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x002f, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T extends androidx.compose.ui.node.TraversableNode> void traverseChildren(T r11, o.drM<? super T, java.lang.Boolean> r12) {
        /*
            r0 = 262144(0x40000, float:3.67342E-40)
            int r0 = androidx.compose.ui.node.NodeKind.m1935constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r1 = r11.getNode()
            boolean r1 = r1.isAttached()
            if (r1 == 0) goto Lc7
            androidx.compose.runtime.collection.MutableVector r1 = new androidx.compose.runtime.collection.MutableVector
            r2 = 16
            androidx.compose.ui.Modifier$Node[] r3 = new androidx.compose.ui.Modifier.Node[r2]
            r4 = 0
            r1.<init>(r3, r4)
            androidx.compose.ui.Modifier$Node r3 = r11.getNode()
            androidx.compose.ui.Modifier$Node r3 = r3.getChild$ui_release()
            if (r3 != 0) goto L2c
            androidx.compose.ui.Modifier$Node r3 = r11.getNode()
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r3)
            goto L2f
        L2c:
            r1.add(r3)
        L2f:
            boolean r3 = r1.isNotEmpty()
            if (r3 == 0) goto Lc6
            int r3 = r1.getSize()
            r5 = 1
            int r3 = r3 - r5
            java.lang.Object r3 = r1.removeAt(r3)
            androidx.compose.ui.Modifier$Node r3 = (androidx.compose.ui.Modifier.Node) r3
            int r6 = r3.getAggregateChildKindSet$ui_release()
            r6 = r6 & r0
            if (r6 != 0) goto L4c
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r3)
            goto L2f
        L4c:
            if (r3 == 0) goto L2f
            int r6 = r3.getKindSet$ui_release()
            r6 = r6 & r0
            if (r6 == 0) goto Lc1
            r6 = 0
            r7 = r6
        L57:
            if (r3 == 0) goto L2f
            boolean r8 = r3 instanceof androidx.compose.ui.node.TraversableNode
            if (r8 == 0) goto L80
            androidx.compose.ui.node.TraversableNode r3 = (androidx.compose.ui.node.TraversableNode) r3
            java.lang.Object r8 = r11.getTraverseKey()
            java.lang.Object r9 = r3.getTraverseKey()
            boolean r8 = o.C8632dsu.c(r8, r9)
            if (r8 == 0) goto Lbc
            boolean r8 = androidx.compose.ui.Actual_jvmKt.areObjectsOfSameType(r11, r3)
            if (r8 == 0) goto Lbc
            java.lang.Object r3 = r12.invoke(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto Lbc
            return
        L80:
            int r8 = r3.getKindSet$ui_release()
            r8 = r8 & r0
            if (r8 == 0) goto Lbc
            boolean r8 = r3 instanceof androidx.compose.ui.node.DelegatingNode
            if (r8 == 0) goto Lbc
            r8 = r3
            androidx.compose.ui.node.DelegatingNode r8 = (androidx.compose.ui.node.DelegatingNode) r8
            androidx.compose.ui.Modifier$Node r8 = r8.getDelegate$ui_release()
            r9 = r4
        L93:
            if (r8 == 0) goto Lb9
            int r10 = r8.getKindSet$ui_release()
            r10 = r10 & r0
            if (r10 == 0) goto Lb4
            int r9 = r9 + 1
            if (r9 != r5) goto La2
            r3 = r8
            goto Lb4
        La2:
            if (r7 != 0) goto Lab
            androidx.compose.runtime.collection.MutableVector r7 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r10 = new androidx.compose.ui.Modifier.Node[r2]
            r7.<init>(r10, r4)
        Lab:
            if (r3 == 0) goto Lb1
            r7.add(r3)
            r3 = r6
        Lb1:
            r7.add(r8)
        Lb4:
            androidx.compose.ui.Modifier$Node r8 = r8.getChild$ui_release()
            goto L93
        Lb9:
            if (r9 != r5) goto Lbc
            goto L57
        Lbc:
            androidx.compose.ui.Modifier$Node r3 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r7)
            goto L57
        Lc1:
            androidx.compose.ui.Modifier$Node r3 = r3.getChild$ui_release()
            goto L4c
        Lc6:
            return
        Lc7:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "visitChildren called on an unattached node"
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.TraversableNodeKt.traverseChildren(androidx.compose.ui.node.TraversableNode, o.drM):void");
    }

    public static final void traverseDescendants(DelegatableNode delegatableNode, Object obj, drM<? super TraversableNode, ? extends TraversableNode.Companion.TraverseDescendantsAction> drm) {
        TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction;
        int m1935constructorimpl = NodeKind.m1935constructorimpl(262144);
        if (!delegatableNode.getNode().isAttached()) {
            throw new IllegalStateException("visitSubtreeIf called on an unattached node".toString());
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui_release() & m1935constructorimpl) != 0) {
                for (Modifier.Node node2 = node; node2 != null; node2 = node2.getChild$ui_release()) {
                    if ((node2.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                        Modifier.Node node3 = node2;
                        MutableVector mutableVector2 = null;
                        while (node3 != null) {
                            if (node3 instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) node3;
                                if (C8632dsu.c(obj, traversableNode.getTraverseKey())) {
                                    traverseDescendantsAction = drm.invoke(traversableNode);
                                } else {
                                    traverseDescendantsAction = TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                                }
                                if (traverseDescendantsAction == TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal) {
                                    return;
                                }
                                if (traverseDescendantsAction == TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((node3.getKindSet$ui_release() & m1935constructorimpl) != 0 && (node3 instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node3).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            node3 = delegate$ui_release;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node3 != null) {
                                                mutableVector2.add(node3);
                                                node3 = null;
                                            }
                                            mutableVector2.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            node3 = DelegatableNodeKt.pop(mutableVector2);
                        }
                        continue;
                    }
                }
            }
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node);
        }
    }

    public static final <T extends TraversableNode> void traverseDescendants(T t, drM<? super T, ? extends TraversableNode.Companion.TraverseDescendantsAction> drm) {
        TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction;
        int m1935constructorimpl = NodeKind.m1935constructorimpl(262144);
        if (!t.getNode().isAttached()) {
            throw new IllegalStateException("visitSubtreeIf called on an unattached node".toString());
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = t.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, t.getNode());
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui_release() & m1935constructorimpl) != 0) {
                for (Modifier.Node node2 = node; node2 != null; node2 = node2.getChild$ui_release()) {
                    if ((node2.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                        Modifier.Node node3 = node2;
                        MutableVector mutableVector2 = null;
                        while (node3 != null) {
                            if (node3 instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) node3;
                                if (C8632dsu.c(t.getTraverseKey(), traversableNode.getTraverseKey()) && Actual_jvmKt.areObjectsOfSameType(t, traversableNode)) {
                                    traverseDescendantsAction = drm.invoke(traversableNode);
                                } else {
                                    traverseDescendantsAction = TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                                }
                                if (traverseDescendantsAction == TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal) {
                                    return;
                                }
                                if (traverseDescendantsAction == TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((node3.getKindSet$ui_release() & m1935constructorimpl) != 0 && (node3 instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node3).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            node3 = delegate$ui_release;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node3 != null) {
                                                mutableVector2.add(node3);
                                                node3 = null;
                                            }
                                            mutableVector2.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            node3 = DelegatableNodeKt.pop(mutableVector2);
                        }
                        continue;
                    }
                }
            }
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node);
        }
    }
}
