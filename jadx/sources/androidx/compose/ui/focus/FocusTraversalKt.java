package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;
import o.C8632dsu;
import o.drM;

/* loaded from: classes.dex */
public final class FocusTraversalKt {

    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* renamed from: customFocusSearch--OM-vw8  reason: not valid java name */
    public static final FocusRequester m1103customFocusSearchOMvw8(FocusTargetNode focusTargetNode, int i, LayoutDirection layoutDirection) {
        FocusRequester end;
        FocusRequester focusRequester;
        FocusRequester start;
        FocusProperties fetchFocusProperties$ui_release = focusTargetNode.fetchFocusProperties$ui_release();
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m1078equalsimpl0(i, companion.m1086getNextdhqQ8s())) {
            return fetchFocusProperties$ui_release.getNext();
        }
        if (FocusDirection.m1078equalsimpl0(i, companion.m1087getPreviousdhqQ8s())) {
            return fetchFocusProperties$ui_release.getPrevious();
        }
        if (FocusDirection.m1078equalsimpl0(i, companion.m1089getUpdhqQ8s())) {
            return fetchFocusProperties$ui_release.getUp();
        }
        if (FocusDirection.m1078equalsimpl0(i, companion.m1082getDowndhqQ8s())) {
            return fetchFocusProperties$ui_release.getDown();
        }
        if (FocusDirection.m1078equalsimpl0(i, companion.m1085getLeftdhqQ8s())) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i2 == 1) {
                start = fetchFocusProperties$ui_release.getStart();
            } else if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            } else {
                start = fetchFocusProperties$ui_release.getEnd();
            }
            focusRequester = start != FocusRequester.Companion.getDefault() ? start : null;
            if (focusRequester == null) {
                return fetchFocusProperties$ui_release.getLeft();
            }
        } else if (FocusDirection.m1078equalsimpl0(i, companion.m1088getRightdhqQ8s())) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i3 == 1) {
                end = fetchFocusProperties$ui_release.getEnd();
            } else if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            } else {
                end = fetchFocusProperties$ui_release.getStart();
            }
            focusRequester = end != FocusRequester.Companion.getDefault() ? end : null;
            if (focusRequester == null) {
                return fetchFocusProperties$ui_release.getRight();
            }
        } else if (FocusDirection.m1078equalsimpl0(i, companion.m1083getEnterdhqQ8s())) {
            return fetchFocusProperties$ui_release.getEnter().invoke(FocusDirection.m1075boximpl(i));
        } else {
            if (FocusDirection.m1078equalsimpl0(i, companion.m1084getExitdhqQ8s())) {
                return fetchFocusProperties$ui_release.getExit().invoke(FocusDirection.m1075boximpl(i));
            }
            throw new IllegalStateException("invalid FocusDirection".toString());
        }
        return focusRequester;
    }

    /* renamed from: focusSearch-sMXa3k8  reason: not valid java name */
    public static final boolean m1104focusSearchsMXa3k8(FocusTargetNode focusTargetNode, int i, LayoutDirection layoutDirection, drM<? super FocusTargetNode, Boolean> drm) {
        int m1088getRightdhqQ8s;
        Boolean m1116twoDimensionalFocusSearchOMvw8;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m1078equalsimpl0(i, companion.m1086getNextdhqQ8s()) || FocusDirection.m1078equalsimpl0(i, companion.m1087getPreviousdhqQ8s())) {
            return OneDimensionalFocusSearchKt.m1107oneDimensionalFocusSearchOMvw8(focusTargetNode, i, drm);
        }
        if (FocusDirection.m1078equalsimpl0(i, companion.m1085getLeftdhqQ8s()) || FocusDirection.m1078equalsimpl0(i, companion.m1088getRightdhqQ8s()) || FocusDirection.m1078equalsimpl0(i, companion.m1089getUpdhqQ8s()) || FocusDirection.m1078equalsimpl0(i, companion.m1082getDowndhqQ8s())) {
            Boolean m1116twoDimensionalFocusSearchOMvw82 = TwoDimensionalFocusSearchKt.m1116twoDimensionalFocusSearchOMvw8(focusTargetNode, i, drm);
            if (m1116twoDimensionalFocusSearchOMvw82 != null) {
                return m1116twoDimensionalFocusSearchOMvw82.booleanValue();
            }
        } else if (FocusDirection.m1078equalsimpl0(i, companion.m1083getEnterdhqQ8s())) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i2 == 1) {
                m1088getRightdhqQ8s = companion.m1088getRightdhqQ8s();
            } else if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            } else {
                m1088getRightdhqQ8s = companion.m1085getLeftdhqQ8s();
            }
            FocusTargetNode findActiveFocusNode = findActiveFocusNode(focusTargetNode);
            if (findActiveFocusNode != null && (m1116twoDimensionalFocusSearchOMvw8 = TwoDimensionalFocusSearchKt.m1116twoDimensionalFocusSearchOMvw8(findActiveFocusNode, m1088getRightdhqQ8s, drm)) != null) {
                return m1116twoDimensionalFocusSearchOMvw8.booleanValue();
            }
        } else if (FocusDirection.m1078equalsimpl0(i, companion.m1084getExitdhqQ8s())) {
            FocusTargetNode findActiveFocusNode2 = findActiveFocusNode(focusTargetNode);
            FocusTargetNode findNonDeactivatedParent = findActiveFocusNode2 != null ? findNonDeactivatedParent(findActiveFocusNode2) : null;
            if (findNonDeactivatedParent != null && !C8632dsu.c(findNonDeactivatedParent, focusTargetNode)) {
                return drm.invoke(findNonDeactivatedParent).booleanValue();
            }
        } else {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) FocusDirection.m1080toStringimpl(i))).toString());
        }
        return false;
    }

    public static final Rect focusRect(FocusTargetNode focusTargetNode) {
        Rect localBoundingBoxOf;
        NodeCoordinator coordinator$ui_release = focusTargetNode.getCoordinator$ui_release();
        return (coordinator$ui_release == null || (localBoundingBoxOf = LayoutCoordinatesKt.findRootCoordinates(coordinator$ui_release).localBoundingBoxOf(coordinator$ui_release, false)) == null) ? Rect.Companion.getZero() : localBoundingBoxOf;
    }

    public static final boolean isEligibleForFocusSearch(FocusTargetNode focusTargetNode) {
        LayoutNode layoutNode;
        NodeCoordinator coordinator$ui_release;
        LayoutNode layoutNode2;
        NodeCoordinator coordinator$ui_release2 = focusTargetNode.getCoordinator$ui_release();
        return (coordinator$ui_release2 == null || (layoutNode = coordinator$ui_release2.getLayoutNode()) == null || !layoutNode.isPlaced() || (coordinator$ui_release = focusTargetNode.getCoordinator$ui_release()) == null || (layoutNode2 = coordinator$ui_release.getLayoutNode()) == null || !layoutNode2.isAttached()) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x003b, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.focus.FocusTargetNode getActiveChild(androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            androidx.compose.ui.Modifier$Node r0 = r10.getNode()
            boolean r0 = r0.isAttached()
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = androidx.compose.ui.node.NodeKind.m1935constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r2 = r10.getNode()
            boolean r2 = r2.isAttached()
            if (r2 == 0) goto Ld1
            androidx.compose.runtime.collection.MutableVector r2 = new androidx.compose.runtime.collection.MutableVector
            r3 = 16
            androidx.compose.ui.Modifier$Node[] r4 = new androidx.compose.ui.Modifier.Node[r3]
            r5 = 0
            r2.<init>(r4, r5)
            androidx.compose.ui.Modifier$Node r4 = r10.getNode()
            androidx.compose.ui.Modifier$Node r4 = r4.getChild$ui_release()
            if (r4 != 0) goto L38
            androidx.compose.ui.Modifier$Node r10 = r10.getNode()
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r10)
            goto L3b
        L38:
            r2.add(r4)
        L3b:
            boolean r10 = r2.isNotEmpty()
            if (r10 == 0) goto Ld0
            int r10 = r2.getSize()
            r4 = 1
            int r10 = r10 - r4
            java.lang.Object r10 = r2.removeAt(r10)
            androidx.compose.ui.Modifier$Node r10 = (androidx.compose.ui.Modifier.Node) r10
            int r6 = r10.getAggregateChildKindSet$ui_release()
            r6 = r6 & r0
            if (r6 != 0) goto L58
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r10)
            goto L3b
        L58:
            if (r10 == 0) goto L3b
            int r6 = r10.getKindSet$ui_release()
            r6 = r6 & r0
            if (r6 == 0) goto Lcb
            r6 = r1
        L62:
            if (r10 == 0) goto L3b
            boolean r7 = r10 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r7 == 0) goto L8a
            androidx.compose.ui.focus.FocusTargetNode r10 = (androidx.compose.ui.focus.FocusTargetNode) r10
            androidx.compose.ui.Modifier$Node r7 = r10.getNode()
            boolean r7 = r7.isAttached()
            if (r7 == 0) goto Lc6
            androidx.compose.ui.focus.FocusStateImpl r7 = r10.getFocusState()
            int[] r8 = androidx.compose.ui.focus.FocusTraversalKt.WhenMappings.$EnumSwitchMapping$1
            int r7 = r7.ordinal()
            r7 = r8[r7]
            if (r7 == r4) goto L89
            r8 = 2
            if (r7 == r8) goto L89
            r8 = 3
            if (r7 == r8) goto L89
            goto Lc6
        L89:
            return r10
        L8a:
            int r7 = r10.getKindSet$ui_release()
            r7 = r7 & r0
            if (r7 == 0) goto Lc6
            boolean r7 = r10 instanceof androidx.compose.ui.node.DelegatingNode
            if (r7 == 0) goto Lc6
            r7 = r10
            androidx.compose.ui.node.DelegatingNode r7 = (androidx.compose.ui.node.DelegatingNode) r7
            androidx.compose.ui.Modifier$Node r7 = r7.getDelegate$ui_release()
            r8 = r5
        L9d:
            if (r7 == 0) goto Lc3
            int r9 = r7.getKindSet$ui_release()
            r9 = r9 & r0
            if (r9 == 0) goto Lbe
            int r8 = r8 + 1
            if (r8 != r4) goto Lac
            r10 = r7
            goto Lbe
        Lac:
            if (r6 != 0) goto Lb5
            androidx.compose.runtime.collection.MutableVector r6 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r9 = new androidx.compose.ui.Modifier.Node[r3]
            r6.<init>(r9, r5)
        Lb5:
            if (r10 == 0) goto Lbb
            r6.add(r10)
            r10 = r1
        Lbb:
            r6.add(r7)
        Lbe:
            androidx.compose.ui.Modifier$Node r7 = r7.getChild$ui_release()
            goto L9d
        Lc3:
            if (r8 != r4) goto Lc6
            goto L62
        Lc6:
            androidx.compose.ui.Modifier$Node r10 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r6)
            goto L62
        Lcb:
            androidx.compose.ui.Modifier$Node r10 = r10.getChild$ui_release()
            goto L58
        Ld0:
            return r1
        Ld1:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitChildren called on an unattached node"
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTraversalKt.getActiveChild(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x004f, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.focus.FocusTargetNode findActiveFocusNode(androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            androidx.compose.ui.focus.FocusStateImpl r0 = r10.getFocusState()
            int[] r1 = androidx.compose.ui.focus.FocusTraversalKt.WhenMappings.$EnumSwitchMapping$1
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto Ld7
            r2 = 2
            r3 = 0
            if (r0 == r2) goto L20
            r1 = 3
            if (r0 == r1) goto Ld7
            r10 = 4
            if (r0 != r10) goto L1a
            return r3
        L1a:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L20:
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = androidx.compose.ui.node.NodeKind.m1935constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r2 = r10.getNode()
            boolean r2 = r2.isAttached()
            if (r2 == 0) goto Lcb
            androidx.compose.runtime.collection.MutableVector r2 = new androidx.compose.runtime.collection.MutableVector
            r4 = 16
            androidx.compose.ui.Modifier$Node[] r5 = new androidx.compose.ui.Modifier.Node[r4]
            r6 = 0
            r2.<init>(r5, r6)
            androidx.compose.ui.Modifier$Node r5 = r10.getNode()
            androidx.compose.ui.Modifier$Node r5 = r5.getChild$ui_release()
            if (r5 != 0) goto L4c
            androidx.compose.ui.Modifier$Node r10 = r10.getNode()
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r10)
            goto L4f
        L4c:
            r2.add(r5)
        L4f:
            boolean r10 = r2.isNotEmpty()
            if (r10 == 0) goto Lca
            int r10 = r2.getSize()
            int r10 = r10 - r1
            java.lang.Object r10 = r2.removeAt(r10)
            androidx.compose.ui.Modifier$Node r10 = (androidx.compose.ui.Modifier.Node) r10
            int r5 = r10.getAggregateChildKindSet$ui_release()
            r5 = r5 & r0
            if (r5 != 0) goto L6b
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r10)
            goto L4f
        L6b:
            if (r10 == 0) goto L4f
            int r5 = r10.getKindSet$ui_release()
            r5 = r5 & r0
            if (r5 == 0) goto Lc5
            r5 = r3
        L75:
            if (r10 == 0) goto L4f
            boolean r7 = r10 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r7 == 0) goto L84
            androidx.compose.ui.focus.FocusTargetNode r10 = (androidx.compose.ui.focus.FocusTargetNode) r10
            androidx.compose.ui.focus.FocusTargetNode r10 = findActiveFocusNode(r10)
            if (r10 == 0) goto Lc0
            return r10
        L84:
            int r7 = r10.getKindSet$ui_release()
            r7 = r7 & r0
            if (r7 == 0) goto Lc0
            boolean r7 = r10 instanceof androidx.compose.ui.node.DelegatingNode
            if (r7 == 0) goto Lc0
            r7 = r10
            androidx.compose.ui.node.DelegatingNode r7 = (androidx.compose.ui.node.DelegatingNode) r7
            androidx.compose.ui.Modifier$Node r7 = r7.getDelegate$ui_release()
            r8 = r6
        L97:
            if (r7 == 0) goto Lbd
            int r9 = r7.getKindSet$ui_release()
            r9 = r9 & r0
            if (r9 == 0) goto Lb8
            int r8 = r8 + 1
            if (r8 != r1) goto La6
            r10 = r7
            goto Lb8
        La6:
            if (r5 != 0) goto Laf
            androidx.compose.runtime.collection.MutableVector r5 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r9 = new androidx.compose.ui.Modifier.Node[r4]
            r5.<init>(r9, r6)
        Laf:
            if (r10 == 0) goto Lb5
            r5.add(r10)
            r10 = r3
        Lb5:
            r5.add(r7)
        Lb8:
            androidx.compose.ui.Modifier$Node r7 = r7.getChild$ui_release()
            goto L97
        Lbd:
            if (r8 != r1) goto Lc0
            goto L75
        Lc0:
            androidx.compose.ui.Modifier$Node r10 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r5)
            goto L75
        Lc5:
            androidx.compose.ui.Modifier$Node r10 = r10.getChild$ui_release()
            goto L6b
        Lca:
            return r3
        Lcb:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitChildren called on an unattached node"
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        Ld7:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTraversalKt.findActiveFocusNode(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    private static final FocusTargetNode findNonDeactivatedParent(FocusTargetNode focusTargetNode) {
        NodeChain nodes$ui_release;
        int m1935constructorimpl = NodeKind.m1935constructorimpl(1024);
        if (!focusTargetNode.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m1935constructorimpl) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                        Modifier.Node node = parent$ui_release;
                        MutableVector mutableVector = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
                                if (focusTargetNode2.fetchFocusProperties$ui_release().getCanFocus()) {
                                    return focusTargetNode2;
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
        return null;
    }
}
