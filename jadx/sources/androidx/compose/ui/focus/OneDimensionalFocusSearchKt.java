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
import kotlin.NoWhenBranchMatchedException;
import o.C8632dsu;
import o.C8654dtp;
import o.drM;

/* loaded from: classes.dex */
public final class OneDimensionalFocusSearchKt {

    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: oneDimensionalFocusSearch--OM-vw8  reason: not valid java name */
    public static final boolean m1107oneDimensionalFocusSearchOMvw8(FocusTargetNode focusTargetNode, int i, drM<? super FocusTargetNode, Boolean> drm) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m1078equalsimpl0(i, companion.m1086getNextdhqQ8s())) {
            return forwardFocusSearch(focusTargetNode, drm);
        }
        if (FocusDirection.m1078equalsimpl0(i, companion.m1087getPreviousdhqQ8s())) {
            return backwardFocusSearch(focusTargetNode, drm);
        }
        throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
    }

    private static final boolean forwardFocusSearch(FocusTargetNode focusTargetNode, drM<? super FocusTargetNode, Boolean> drm) {
        int i = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i == 1) {
            FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
            if (activeChild != null) {
                return forwardFocusSearch(activeChild, drm) || m1106generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, FocusDirection.Companion.m1086getNextdhqQ8s(), drm);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        } else if (i == 2 || i == 3) {
            return pickChildForForwardSearch(focusTargetNode, drm);
        } else {
            if (i == 4) {
                if (focusTargetNode.fetchFocusProperties$ui_release().getCanFocus()) {
                    return drm.invoke(focusTargetNode).booleanValue();
                }
                return pickChildForForwardSearch(focusTargetNode, drm);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    private static final boolean backwardFocusSearch(FocusTargetNode focusTargetNode, drM<? super FocusTargetNode, Boolean> drm) {
        FocusStateImpl focusState = focusTargetNode.getFocusState();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[focusState.ordinal()];
        if (i == 1) {
            FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
            if (activeChild == null) {
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
            int i2 = iArr[activeChild.getFocusState().ordinal()];
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    return m1106generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, FocusDirection.Companion.m1087getPreviousdhqQ8s(), drm);
                }
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            } else if (backwardFocusSearch(activeChild, drm) || m1106generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, FocusDirection.Companion.m1087getPreviousdhqQ8s(), drm)) {
                return true;
            } else {
                if (activeChild.fetchFocusProperties$ui_release().getCanFocus() && drm.invoke(activeChild).booleanValue()) {
                    return true;
                }
            }
        } else if (i == 2 || i == 3) {
            return pickChildForBackwardSearch(focusTargetNode, drm);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (pickChildForBackwardSearch(focusTargetNode, drm)) {
                return true;
            }
            if (focusTargetNode.fetchFocusProperties$ui_release().getCanFocus() && drm.invoke(focusTargetNode).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: generateAndSearchChildren-4C6V_qg  reason: not valid java name */
    private static final boolean m1106generateAndSearchChildren4C6V_qg(final FocusTargetNode focusTargetNode, final FocusTargetNode focusTargetNode2, final int i, final drM<? super FocusTargetNode, Boolean> drm) {
        if (m1108searchChildren4C6V_qg(focusTargetNode, focusTargetNode2, i, drm)) {
            return true;
        }
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.m1074searchBeyondBoundsOMvw8(focusTargetNode, i, new drM<BeyondBoundsLayout.BeyondBoundsScope, Boolean>() { // from class: androidx.compose.ui.focus.OneDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public final Boolean invoke(BeyondBoundsLayout.BeyondBoundsScope beyondBoundsScope) {
                boolean m1108searchChildren4C6V_qg;
                m1108searchChildren4C6V_qg = OneDimensionalFocusSearchKt.m1108searchChildren4C6V_qg(FocusTargetNode.this, focusTargetNode2, i, drm);
                Boolean valueOf = Boolean.valueOf(m1108searchChildren4C6V_qg);
                if (valueOf.booleanValue() || !beyondBoundsScope.getHasMoreContent()) {
                    return valueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: searchChildren-4C6V_qg  reason: not valid java name */
    public static final boolean m1108searchChildren4C6V_qg(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, drM<? super FocusTargetNode, Boolean> drm) {
        if (focusTargetNode.getFocusState() != FocusStateImpl.ActiveParent) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
        }
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        int m1935constructorimpl = NodeKind.m1935constructorimpl(1024);
        if (!focusTargetNode.getNode().isAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = focusTargetNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetNode.getNode());
        } else {
            mutableVector2.add(child$ui_release);
        }
        while (mutableVector2.isNotEmpty()) {
            Modifier.Node node = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui_release() & m1935constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    } else if ((node.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                mutableVector.add((FocusTargetNode) node);
                            } else if ((node.getKindSet$ui_release() & m1935constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node = delegate$ui_release;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector3.add(node);
                                                node = null;
                                            }
                                            mutableVector3.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            node = DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        node = node.getChild$ui_release();
                    }
                }
            }
        }
        mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (!FocusDirection.m1078equalsimpl0(i, companion.m1086getNextdhqQ8s())) {
            if (!FocusDirection.m1078equalsimpl0(i, companion.m1087getPreviousdhqQ8s())) {
                throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
            }
            C8654dtp c8654dtp = new C8654dtp(0, mutableVector.getSize() - 1);
            int d = c8654dtp.d();
            int e = c8654dtp.e();
            if (d <= e) {
                boolean z = false;
                while (true) {
                    if (z) {
                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) mutableVector.getContent()[e];
                        if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode3) && backwardFocusSearch(focusTargetNode3, drm)) {
                            return true;
                        }
                    }
                    if (C8632dsu.c(mutableVector.getContent()[e], focusTargetNode2)) {
                        z = true;
                    }
                    if (e == d) {
                        break;
                    }
                    e--;
                }
            }
        } else {
            C8654dtp c8654dtp2 = new C8654dtp(0, mutableVector.getSize() - 1);
            int d2 = c8654dtp2.d();
            int e2 = c8654dtp2.e();
            if (d2 <= e2) {
                boolean z2 = false;
                while (true) {
                    if (z2) {
                        FocusTargetNode focusTargetNode4 = (FocusTargetNode) mutableVector.getContent()[d2];
                        if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode4) && forwardFocusSearch(focusTargetNode4, drm)) {
                            return true;
                        }
                    }
                    if (C8632dsu.c(mutableVector.getContent()[d2], focusTargetNode2)) {
                        z2 = true;
                    }
                    if (d2 == e2) {
                        break;
                    }
                    d2++;
                }
            }
        }
        if (FocusDirection.m1078equalsimpl0(i, FocusDirection.Companion.m1086getNextdhqQ8s()) || !focusTargetNode.fetchFocusProperties$ui_release().getCanFocus() || isRoot(focusTargetNode)) {
            return false;
        }
        return drm.invoke(focusTargetNode).booleanValue();
    }

    private static final boolean pickChildForForwardSearch(FocusTargetNode focusTargetNode, drM<? super FocusTargetNode, Boolean> drm) {
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        int m1935constructorimpl = NodeKind.m1935constructorimpl(1024);
        if (!focusTargetNode.getNode().isAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = focusTargetNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetNode.getNode());
        } else {
            mutableVector2.add(child$ui_release);
        }
        while (mutableVector2.isNotEmpty()) {
            Modifier.Node node = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui_release() & m1935constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    } else if ((node.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                mutableVector.add((FocusTargetNode) node);
                            } else if ((node.getKindSet$ui_release() & m1935constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            node = delegate$ui_release;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector3.add(node);
                                                node = null;
                                            }
                                            mutableVector3.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            node = DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        node = node.getChild$ui_release();
                    }
                }
            }
        }
        mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) content[i2];
                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2) && forwardFocusSearch(focusTargetNode2, drm)) {
                    return true;
                }
                i2++;
            } while (i2 < size);
            return false;
        }
        return false;
    }

    private static final boolean pickChildForBackwardSearch(FocusTargetNode focusTargetNode, drM<? super FocusTargetNode, Boolean> drm) {
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        int m1935constructorimpl = NodeKind.m1935constructorimpl(1024);
        if (!focusTargetNode.getNode().isAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = focusTargetNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetNode.getNode());
        } else {
            mutableVector2.add(child$ui_release);
        }
        while (mutableVector2.isNotEmpty()) {
            Modifier.Node node = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui_release() & m1935constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    } else if ((node.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                mutableVector.add((FocusTargetNode) node);
                            } else if ((node.getKindSet$ui_release() & m1935constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            node = delegate$ui_release;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector3.add(node);
                                                node = null;
                                            }
                                            mutableVector3.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            node = DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        node = node.getChild$ui_release();
                    }
                }
            }
        }
        mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
        int size = mutableVector.getSize();
        if (size > 0) {
            int i2 = size - 1;
            Object[] content = mutableVector.getContent();
            do {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) content[i2];
                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2) && backwardFocusSearch(focusTargetNode2, drm)) {
                    return true;
                }
                i2--;
            } while (i2 >= 0);
            return false;
        }
        return false;
    }

    private static final boolean isRoot(FocusTargetNode focusTargetNode) {
        Modifier.Node node;
        NodeChain nodes$ui_release;
        int m1935constructorimpl = NodeKind.m1935constructorimpl(1024);
        if (!focusTargetNode.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        loop0: while (true) {
            node = null;
            if (requireLayoutNode == null) {
                break;
            }
            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m1935constructorimpl) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                        Modifier.Node node2 = parent$ui_release;
                        MutableVector mutableVector = null;
                        while (node2 != null) {
                            if (node2 instanceof FocusTargetNode) {
                                node = node2;
                                break loop0;
                            }
                            if ((node2.getKindSet$ui_release() & m1935constructorimpl) != 0 && (node2 instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node2).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            node2 = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node2 != null) {
                                                mutableVector.add(node2);
                                                node2 = null;
                                            }
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            node2 = DelegatableNodeKt.pop(mutableVector);
                        }
                        continue;
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            parent$ui_release = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
        return node == null;
    }
}
