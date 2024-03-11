package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import o.C8632dsu;
import o.drM;

/* loaded from: classes.dex */
public final class BeyondBoundsLayoutKt {
    /* renamed from: searchBeyondBounds--OM-vw8  reason: not valid java name */
    public static final <T> T m1074searchBeyondBoundsOMvw8(FocusTargetNode focusTargetNode, int i, drM<? super BeyondBoundsLayout.BeyondBoundsScope, ? extends T> drm) {
        FocusTargetNode focusTargetNode2;
        BeyondBoundsLayout beyondBoundsLayoutParent;
        int m1789getBeforehoxUOeE;
        NodeChain nodes$ui_release;
        int m1935constructorimpl = NodeKind.m1935constructorimpl(1024);
        if (!focusTargetNode.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        loop0: while (true) {
            if (requireLayoutNode == null) {
                focusTargetNode2 = null;
                break;
            }
            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m1935constructorimpl) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                        focusTargetNode2 = parent$ui_release;
                        MutableVector mutableVector = null;
                        while (focusTargetNode2 != null) {
                            if (focusTargetNode2 instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((focusTargetNode2.getKindSet$ui_release() & m1935constructorimpl) != 0 && (focusTargetNode2 instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) focusTargetNode2).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            focusTargetNode2 = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (focusTargetNode2 != null) {
                                                mutableVector.add(focusTargetNode2);
                                                focusTargetNode2 = null;
                                            }
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            focusTargetNode2 = DelegatableNodeKt.pop(mutableVector);
                        }
                        continue;
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            parent$ui_release = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
        FocusTargetNode focusTargetNode3 = focusTargetNode2;
        if ((focusTargetNode3 == null || !C8632dsu.c(focusTargetNode3.getBeyondBoundsLayoutParent(), focusTargetNode.getBeyondBoundsLayoutParent())) && (beyondBoundsLayoutParent = focusTargetNode.getBeyondBoundsLayoutParent()) != null) {
            FocusDirection.Companion companion = FocusDirection.Companion;
            if (FocusDirection.m1078equalsimpl0(i, companion.m1089getUpdhqQ8s())) {
                m1789getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m1787getAbovehoxUOeE();
            } else if (FocusDirection.m1078equalsimpl0(i, companion.m1082getDowndhqQ8s())) {
                m1789getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m1790getBelowhoxUOeE();
            } else if (FocusDirection.m1078equalsimpl0(i, companion.m1085getLeftdhqQ8s())) {
                m1789getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m1791getLefthoxUOeE();
            } else if (FocusDirection.m1078equalsimpl0(i, companion.m1088getRightdhqQ8s())) {
                m1789getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m1792getRighthoxUOeE();
            } else if (FocusDirection.m1078equalsimpl0(i, companion.m1086getNextdhqQ8s())) {
                m1789getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m1788getAfterhoxUOeE();
            } else if (!FocusDirection.m1078equalsimpl0(i, companion.m1087getPreviousdhqQ8s())) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
            } else {
                m1789getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m1789getBeforehoxUOeE();
            }
            return (T) beyondBoundsLayoutParent.mo372layouto7g1Pn8(m1789getBeforehoxUOeE, drm);
        }
        return null;
    }
}
