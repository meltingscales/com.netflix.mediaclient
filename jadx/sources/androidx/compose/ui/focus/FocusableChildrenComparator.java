package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import java.util.Comparator;
import o.C8632dsu;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FocusableChildrenComparator implements Comparator<FocusTargetNode> {
    public static final FocusableChildrenComparator INSTANCE = new FocusableChildrenComparator();

    private FocusableChildrenComparator() {
    }

    @Override // java.util.Comparator
    public int compare(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        if (focusTargetNode != null) {
            if (focusTargetNode2 == null) {
                throw new IllegalArgumentException("compare requires non-null focus targets".toString());
            }
            int i = 0;
            if (!FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode) || !FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2)) {
                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode)) {
                    return -1;
                }
                return FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2) ? 1 : 0;
            }
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
            LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(focusTargetNode2);
            if (C8632dsu.c(requireLayoutNode, requireLayoutNode2)) {
                return 0;
            }
            MutableVector<LayoutNode> pathFromRoot = pathFromRoot(requireLayoutNode);
            MutableVector<LayoutNode> pathFromRoot2 = pathFromRoot(requireLayoutNode2);
            int min = Math.min(pathFromRoot.getSize() - 1, pathFromRoot2.getSize() - 1);
            if (min >= 0) {
                while (C8632dsu.c(pathFromRoot.getContent()[i], pathFromRoot2.getContent()[i])) {
                    if (i != min) {
                        i++;
                    }
                }
                return C8632dsu.d(pathFromRoot.getContent()[i].getPlaceOrder$ui_release(), pathFromRoot2.getContent()[i].getPlaceOrder$ui_release());
            }
            throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.".toString());
        }
        throw new IllegalArgumentException("compare requires non-null focus targets".toString());
    }

    private final MutableVector<LayoutNode> pathFromRoot(LayoutNode layoutNode) {
        MutableVector<LayoutNode> mutableVector = new MutableVector<>(new LayoutNode[16], 0);
        while (layoutNode != null) {
            mutableVector.add(0, layoutNode);
            layoutNode = layoutNode.getParent$ui_release();
        }
        return mutableVector;
    }
}
