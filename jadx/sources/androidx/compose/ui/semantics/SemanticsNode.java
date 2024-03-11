package androidx.compose.ui.semantics;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.unit.IntSize;
import java.util.ArrayList;
import java.util.List;
import o.C8569dql;
import o.C8576dqs;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class SemanticsNode {
    private SemanticsNode fakeNodeParent;
    private final int id;
    private boolean isFake;
    private final LayoutNode layoutNode;
    private final boolean mergingEnabled;
    private final Modifier.Node outerSemanticsNode;
    private final SemanticsConfiguration unmergedConfig;

    public final int getId() {
        return this.id;
    }

    public final LayoutInfo getLayoutInfo() {
        return this.layoutNode;
    }

    public final LayoutNode getLayoutNode$ui_release() {
        return this.layoutNode;
    }

    public final SemanticsConfiguration getUnmergedConfig$ui_release() {
        return this.unmergedConfig;
    }

    public final boolean isFake$ui_release() {
        return this.isFake;
    }

    public SemanticsNode(Modifier.Node node, boolean z, LayoutNode layoutNode, SemanticsConfiguration semanticsConfiguration) {
        this.outerSemanticsNode = node;
        this.mergingEnabled = z;
        this.layoutNode = layoutNode;
        this.unmergedConfig = semanticsConfiguration;
        this.id = layoutNode.getSemanticsId();
    }

    public final boolean isUnmergedLeafNode$ui_release() {
        return !this.isFake && getReplacedChildren$ui_release().isEmpty() && SemanticsNodeKt.findClosestParentNode(this.layoutNode, new drM<LayoutNode, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsNode$isUnmergedLeafNode$1
            /* JADX WARN: Code restructure failed: missing block: B:5:0x000b, code lost:
                if (r2.isMergingSemanticsOfDescendants() == true) goto L5;
             */
            @Override // o.drM
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Boolean invoke(androidx.compose.ui.node.LayoutNode r2) {
                /*
                    r1 = this;
                    androidx.compose.ui.semantics.SemanticsConfiguration r2 = r2.getCollapsedSemantics$ui_release()
                    if (r2 == 0) goto Le
                    boolean r2 = r2.isMergingSemanticsOfDescendants()
                    r0 = 1
                    if (r2 != r0) goto Le
                    goto Lf
                Le:
                    r0 = 0
                Lf:
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.semantics.SemanticsNode$isUnmergedLeafNode$1.invoke(androidx.compose.ui.node.LayoutNode):java.lang.Boolean");
            }
        }) == null;
    }

    public final Rect getTouchBoundsInRoot() {
        DelegatableNode delegatableNode;
        if (!this.unmergedConfig.isMergingSemanticsOfDescendants() || (delegatableNode = SemanticsNodeKt.getOuterMergingSemantics(this.layoutNode)) == null) {
            delegatableNode = this.outerSemanticsNode;
        }
        return SemanticsModifierNodeKt.touchBoundsInRoot(delegatableNode.getNode(), SemanticsModifierNodeKt.getUseMinimumTouchTarget(this.unmergedConfig));
    }

    /* renamed from: getSize-YbymL2g  reason: not valid java name */
    public final long m2045getSizeYbymL2g() {
        NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        return findCoordinatorToGetBounds$ui_release != null ? findCoordinatorToGetBounds$ui_release.mo1809getSizeYbymL2g() : IntSize.Companion.m2551getZeroYbymL2g();
    }

    public final Rect getBoundsInRoot() {
        Rect boundsInRoot;
        NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            if (!findCoordinatorToGetBounds$ui_release.isAttached()) {
                findCoordinatorToGetBounds$ui_release = null;
            }
            if (findCoordinatorToGetBounds$ui_release != null && (boundsInRoot = LayoutCoordinatesKt.boundsInRoot(findCoordinatorToGetBounds$ui_release)) != null) {
                return boundsInRoot;
            }
        }
        return Rect.Companion.getZero();
    }

    /* renamed from: getPositionInRoot-F1C5BW0  reason: not valid java name */
    public final long m2044getPositionInRootF1C5BW0() {
        NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            if (!findCoordinatorToGetBounds$ui_release.isAttached()) {
                findCoordinatorToGetBounds$ui_release = null;
            }
            if (findCoordinatorToGetBounds$ui_release != null) {
                return LayoutCoordinatesKt.positionInRoot(findCoordinatorToGetBounds$ui_release);
            }
        }
        return Offset.Companion.m1149getZeroF1C5BW0();
    }

    public final Rect getBoundsInWindow() {
        Rect boundsInWindow;
        NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            if (!findCoordinatorToGetBounds$ui_release.isAttached()) {
                findCoordinatorToGetBounds$ui_release = null;
            }
            if (findCoordinatorToGetBounds$ui_release != null && (boundsInWindow = LayoutCoordinatesKt.boundsInWindow(findCoordinatorToGetBounds$ui_release)) != null) {
                return boundsInWindow;
            }
        }
        return Rect.Companion.getZero();
    }

    public final Rect getBoundsInParent$ui_release() {
        LayoutCoordinates coordinates;
        SemanticsNode parent = getParent();
        if (parent == null) {
            return Rect.Companion.getZero();
        }
        NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            if (!findCoordinatorToGetBounds$ui_release.isAttached()) {
                findCoordinatorToGetBounds$ui_release = null;
            }
            if (findCoordinatorToGetBounds$ui_release != null && (coordinates = findCoordinatorToGetBounds$ui_release.getCoordinates()) != null) {
                return LayoutCoordinates.localBoundingBoxOf$default(DelegatableNodeKt.m1853requireCoordinator64DMado(parent.outerSemanticsNode, NodeKind.m1935constructorimpl(8)), coordinates, false, 2, null);
            }
        }
        return Rect.Companion.getZero();
    }

    public final boolean isTransparent$ui_release() {
        NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            return findCoordinatorToGetBounds$ui_release.isTransparent();
        }
        return false;
    }

    public final SemanticsConfiguration getConfig() {
        if (isMergingSemanticsOfDescendants()) {
            SemanticsConfiguration copy = this.unmergedConfig.copy();
            mergeConfig(copy);
            return copy;
        }
        return this.unmergedConfig;
    }

    private final void mergeConfig(SemanticsConfiguration semanticsConfiguration) {
        if (this.unmergedConfig.isClearingSemantics()) {
            return;
        }
        List unmergedChildren$ui_release$default = unmergedChildren$ui_release$default(this, false, 1, null);
        int size = unmergedChildren$ui_release$default.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode = (SemanticsNode) unmergedChildren$ui_release$default.get(i);
            if (!semanticsNode.isMergingSemanticsOfDescendants()) {
                semanticsConfiguration.mergeChild$ui_release(semanticsNode.unmergedConfig);
                semanticsNode.mergeConfig(semanticsConfiguration);
            }
        }
    }

    private final boolean isMergingSemanticsOfDescendants() {
        return this.mergingEnabled && this.unmergedConfig.isMergingSemanticsOfDescendants();
    }

    public static /* synthetic */ List unmergedChildren$ui_release$default(SemanticsNode semanticsNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return semanticsNode.unmergedChildren$ui_release(z);
    }

    public final List<SemanticsNode> unmergedChildren$ui_release(boolean z) {
        List<SemanticsNode> i;
        if (this.isFake) {
            i = C8569dql.i();
            return i;
        }
        ArrayList arrayList = new ArrayList();
        fillOneLayerOfSemanticsWrappers(this.layoutNode, arrayList);
        if (z) {
            emitFakeNodes(arrayList);
        }
        return arrayList;
    }

    private final void fillOneLayerOfSemanticsWrappers(LayoutNode layoutNode, List<SemanticsNode> list) {
        MutableVector<LayoutNode> zSortedChildren = layoutNode.getZSortedChildren();
        int size = zSortedChildren.getSize();
        if (size > 0) {
            LayoutNode[] content = zSortedChildren.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode2 = content[i];
                if (layoutNode2.isAttached()) {
                    if (layoutNode2.getNodes$ui_release().m1905hasH91voCI$ui_release(NodeKind.m1935constructorimpl(8))) {
                        list.add(SemanticsNodeKt.SemanticsNode(layoutNode2, this.mergingEnabled));
                    } else {
                        fillOneLayerOfSemanticsWrappers(layoutNode2, list);
                    }
                }
                i++;
            } while (i < size);
        }
    }

    public final List<SemanticsNode> getChildren() {
        return getChildren(!this.mergingEnabled, false);
    }

    public final List<SemanticsNode> getReplacedChildren$ui_release() {
        return getChildren(false, true);
    }

    private final List<SemanticsNode> getChildren(boolean z, boolean z2) {
        List<SemanticsNode> i;
        if (!z && this.unmergedConfig.isClearingSemantics()) {
            i = C8569dql.i();
            return i;
        } else if (isMergingSemanticsOfDescendants()) {
            return findOneLayerOfMergingSemanticsNodes$default(this, null, 1, null);
        } else {
            return unmergedChildren$ui_release(z2);
        }
    }

    public final SemanticsNode getParent() {
        SemanticsNode semanticsNode = this.fakeNodeParent;
        if (semanticsNode != null) {
            return semanticsNode;
        }
        LayoutNode findClosestParentNode = this.mergingEnabled ? SemanticsNodeKt.findClosestParentNode(this.layoutNode, new drM<LayoutNode, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsNode$parent$1
            /* JADX WARN: Code restructure failed: missing block: B:5:0x000b, code lost:
                if (r2.isMergingSemanticsOfDescendants() == true) goto L5;
             */
            @Override // o.drM
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Boolean invoke(androidx.compose.ui.node.LayoutNode r2) {
                /*
                    r1 = this;
                    androidx.compose.ui.semantics.SemanticsConfiguration r2 = r2.getCollapsedSemantics$ui_release()
                    if (r2 == 0) goto Le
                    boolean r2 = r2.isMergingSemanticsOfDescendants()
                    r0 = 1
                    if (r2 != r0) goto Le
                    goto Lf
                Le:
                    r0 = 0
                Lf:
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.semantics.SemanticsNode$parent$1.invoke(androidx.compose.ui.node.LayoutNode):java.lang.Boolean");
            }
        }) : null;
        if (findClosestParentNode == null) {
            findClosestParentNode = SemanticsNodeKt.findClosestParentNode(this.layoutNode, new drM<LayoutNode, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsNode$parent$2
                @Override // o.drM
                public final Boolean invoke(LayoutNode layoutNode) {
                    return Boolean.valueOf(layoutNode.getNodes$ui_release().m1905hasH91voCI$ui_release(NodeKind.m1935constructorimpl(8)));
                }
            });
        }
        if (findClosestParentNode == null) {
            return null;
        }
        return SemanticsNodeKt.SemanticsNode(findClosestParentNode, this.mergingEnabled);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List findOneLayerOfMergingSemanticsNodes$default(SemanticsNode semanticsNode, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        return semanticsNode.findOneLayerOfMergingSemanticsNodes(list);
    }

    private final List<SemanticsNode> findOneLayerOfMergingSemanticsNodes(List<SemanticsNode> list) {
        List unmergedChildren$ui_release$default = unmergedChildren$ui_release$default(this, false, 1, null);
        int size = unmergedChildren$ui_release$default.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode = (SemanticsNode) unmergedChildren$ui_release$default.get(i);
            if (semanticsNode.isMergingSemanticsOfDescendants()) {
                list.add(semanticsNode);
            } else if (!semanticsNode.unmergedConfig.isClearingSemantics()) {
                semanticsNode.findOneLayerOfMergingSemanticsNodes(list);
            }
        }
        return list;
    }

    public final NodeCoordinator findCoordinatorToGetBounds$ui_release() {
        if (this.isFake) {
            SemanticsNode parent = getParent();
            if (parent != null) {
                return parent.findCoordinatorToGetBounds$ui_release();
            }
            return null;
        }
        DelegatableNode outerMergingSemantics = SemanticsNodeKt.getOuterMergingSemantics(this.layoutNode);
        if (outerMergingSemantics == null) {
            outerMergingSemantics = this.outerSemanticsNode;
        }
        return DelegatableNodeKt.m1853requireCoordinator64DMado(outerMergingSemantics, NodeKind.m1935constructorimpl(8));
    }

    private final void emitFakeNodes(List<SemanticsNode> list) {
        final Role role;
        final String str;
        Object x;
        role = SemanticsNodeKt.getRole(this);
        if (role != null && this.unmergedConfig.isMergingSemanticsOfDescendants() && (!list.isEmpty())) {
            list.add(m2043fakeSemanticsNodeypyhhiA(role, new drM<SemanticsPropertyReceiver, dpR>() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                public /* bridge */ /* synthetic */ dpR invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return dpR.c;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.m2050setRolekuIjeqM(semanticsPropertyReceiver, Role.this.m2035unboximpl());
                }
            }));
        }
        SemanticsConfiguration semanticsConfiguration = this.unmergedConfig;
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (semanticsConfiguration.contains(semanticsProperties.getContentDescription()) && (!list.isEmpty()) && this.unmergedConfig.isMergingSemanticsOfDescendants()) {
            List list2 = (List) SemanticsConfigurationKt.getOrNull(this.unmergedConfig, semanticsProperties.getContentDescription());
            if (list2 != null) {
                x = C8576dqs.x(list2);
                str = (String) x;
            } else {
                str = null;
            }
            if (str != null) {
                list.add(0, m2043fakeSemanticsNodeypyhhiA(null, new drM<SemanticsPropertyReceiver, dpR>() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* bridge */ /* synthetic */ dpR invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return dpR.c;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                    }
                }));
            }
        }
    }

    /* renamed from: fakeSemanticsNode-ypyhhiA  reason: not valid java name */
    private final SemanticsNode m2043fakeSemanticsNodeypyhhiA(Role role, drM<? super SemanticsPropertyReceiver, dpR> drm) {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.setMergingSemanticsOfDescendants(false);
        semanticsConfiguration.setClearingSemantics(false);
        drm.invoke(semanticsConfiguration);
        SemanticsNode semanticsNode = new SemanticsNode(new SemanticsNode$fakeSemanticsNode$fakeNode$1(drm), false, new LayoutNode(true, role != null ? SemanticsNodeKt.roleFakeNodeId(this) : SemanticsNodeKt.contentDescriptionFakeNodeId(this)), semanticsConfiguration);
        semanticsNode.isFake = true;
        semanticsNode.fakeNodeParent = this;
        return semanticsNode;
    }

    public final SemanticsNode copyWithMergingEnabled$ui_release() {
        return new SemanticsNode(this.outerSemanticsNode, true, this.layoutNode, this.unmergedConfig);
    }
}
