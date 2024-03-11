package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class DelegatableNodeKt {
    public static final boolean isDelegationRoot(DelegatableNode delegatableNode) {
        return delegatableNode.getNode() == delegatableNode;
    }

    public static final void addLayoutNodeChildren(MutableVector<Modifier.Node> mutableVector, Modifier.Node node) {
        MutableVector<LayoutNode> mutableVector2 = requireLayoutNode(node).get_children$ui_release();
        int size = mutableVector2.getSize();
        if (size > 0) {
            int i = size - 1;
            LayoutNode[] content = mutableVector2.getContent();
            do {
                mutableVector.add(content[i].getNodes$ui_release().getHead$ui_release());
                i--;
            } while (i >= 0);
        }
    }

    /* renamed from: has-64DMado */
    public static final boolean m1852has64DMado(DelegatableNode delegatableNode, int i) {
        return (delegatableNode.getNode().getAggregateChildKindSet$ui_release() & i) != 0;
    }

    /* renamed from: requireCoordinator-64DMado */
    public static final NodeCoordinator m1853requireCoordinator64DMado(DelegatableNode delegatableNode, int i) {
        NodeCoordinator coordinator$ui_release = delegatableNode.getNode().getCoordinator$ui_release();
        C8632dsu.d(coordinator$ui_release);
        if (coordinator$ui_release.getTail() == delegatableNode && NodeKindKt.m1940getIncludeSelfInTraversalH91voCI(i)) {
            NodeCoordinator wrapped$ui_release = coordinator$ui_release.getWrapped$ui_release();
            C8632dsu.d(wrapped$ui_release);
            return wrapped$ui_release;
        }
        return coordinator$ui_release;
    }

    public static final LayoutNode requireLayoutNode(DelegatableNode delegatableNode) {
        NodeCoordinator coordinator$ui_release = delegatableNode.getNode().getCoordinator$ui_release();
        if (coordinator$ui_release == null) {
            throw new IllegalStateException("Cannot obtain node coordinator. Is the Modifier.Node attached?".toString());
        }
        return coordinator$ui_release.getLayoutNode();
    }

    public static final Owner requireOwner(DelegatableNode delegatableNode) {
        Owner owner$ui_release = requireLayoutNode(delegatableNode).getOwner$ui_release();
        if (owner$ui_release != null) {
            return owner$ui_release;
        }
        throw new IllegalStateException("This node does not have an owner.".toString());
    }

    public static final Density requireDensity(DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode).getDensity();
    }

    public static final LayoutDirection requireLayoutDirection(DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode).getLayoutDirection();
    }

    public static final Modifier.Node pop(MutableVector<Modifier.Node> mutableVector) {
        if (mutableVector == null || mutableVector.isEmpty()) {
            return null;
        }
        return mutableVector.removeAt(mutableVector.getSize() - 1);
    }

    public static final LayoutModifierNode asLayoutModifierNode(Modifier.Node node) {
        if ((NodeKind.m1935constructorimpl(2) & node.getKindSet$ui_release()) != 0) {
            if (node instanceof LayoutModifierNode) {
                return (LayoutModifierNode) node;
            }
            if (node instanceof DelegatingNode) {
                Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release();
                while (delegate$ui_release != null) {
                    if (delegate$ui_release instanceof LayoutModifierNode) {
                        return (LayoutModifierNode) delegate$ui_release;
                    }
                    if ((delegate$ui_release instanceof DelegatingNode) && (NodeKind.m1935constructorimpl(2) & delegate$ui_release.getKindSet$ui_release()) != 0) {
                        delegate$ui_release = ((DelegatingNode) delegate$ui_release).getDelegate$ui_release();
                    } else {
                        delegate$ui_release = delegate$ui_release.getChild$ui_release();
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
