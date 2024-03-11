package androidx.compose.ui.platform;

import android.graphics.Region;
import android.view.View;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.C8576dqs;
import o.C8632dsu;
import o.drM;
import o.dsT;

/* loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt {
    private static final Rect DefaultFakeNodeBounds = new Rect(0.0f, 0.0f, 10.0f, 10.0f);
    private static boolean DisableContentCapture;

    public static final boolean getDisableContentCapture() {
        return DisableContentCapture;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutNode findClosestParentNode(LayoutNode layoutNode, drM<? super LayoutNode, Boolean> drm) {
        for (LayoutNode parent$ui_release = layoutNode.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if (drm.invoke(parent$ui_release).booleanValue()) {
                return parent$ui_release;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean enabled(SemanticsNode semanticsNode) {
        return SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), SemanticsProperties.INSTANCE.getDisabled()) == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isImportantForAccessibility(SemanticsNode semanticsNode) {
        return semanticsNode.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants() || semanticsNode.getUnmergedConfig$ui_release().containsImportantForAccessibility$ui_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isVisible(SemanticsNode semanticsNode) {
        return (semanticsNode.isTransparent$ui_release() || semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getInvisibleToUser())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean propertiesDeleted(SemanticsNode semanticsNode, SemanticsConfiguration semanticsConfiguration) {
        Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> it = semanticsConfiguration.iterator();
        while (it.hasNext()) {
            if (!semanticsNode.getConfig().contains(it.next().getKey())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasPaneTitle(SemanticsNode semanticsNode) {
        return semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getPaneTitle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getInfoContentDescriptionOrNull(SemanticsNode semanticsNode) {
        Object x;
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getContentDescription());
        if (list != null) {
            x = C8576dqs.x(list);
            return (String) x;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getTextForTranslation(SemanticsNode semanticsNode) {
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getText());
        if (list != null) {
            return ListUtilsKt.fastJoinToString$default(list, "\n", null, null, 0, null, null, 62, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean accessibilityEquals(AccessibilityAction<?> accessibilityAction, Object obj) {
        if (accessibilityAction == obj) {
            return true;
        }
        if (obj instanceof AccessibilityAction) {
            AccessibilityAction accessibilityAction2 = (AccessibilityAction) obj;
            if (C8632dsu.c((Object) accessibilityAction.getLabel(), (Object) accessibilityAction2.getLabel())) {
                if (accessibilityAction.getAction() != null || accessibilityAction2.getAction() == null) {
                    return accessibilityAction.getAction() == null || accessibilityAction2.getAction() != null;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<Integer, SemanticsNodeWithAdjustedBounds> getAllUncoveredSemanticsNodesToMap(SemanticsOwner semanticsOwner) {
        int e;
        int e2;
        int e3;
        int e4;
        SemanticsNode unmergedRootSemanticsNode = semanticsOwner.getUnmergedRootSemanticsNode();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (unmergedRootSemanticsNode.getLayoutNode$ui_release().isPlaced() && unmergedRootSemanticsNode.getLayoutNode$ui_release().isAttached()) {
            Rect boundsInRoot = unmergedRootSemanticsNode.getBoundsInRoot();
            e = dsT.e(boundsInRoot.getLeft());
            e2 = dsT.e(boundsInRoot.getTop());
            e3 = dsT.e(boundsInRoot.getRight());
            e4 = dsT.e(boundsInRoot.getBottom());
            getAllUncoveredSemanticsNodesToMap$findAllSemanticNodesRecursive(new Region(e, e2, e3, e4), unmergedRootSemanticsNode, linkedHashMap, unmergedRootSemanticsNode, new Region());
        }
        return linkedHashMap;
    }

    private static final void getAllUncoveredSemanticsNodesToMap$findAllSemanticNodesRecursive(Region region, SemanticsNode semanticsNode, Map<Integer, SemanticsNodeWithAdjustedBounds> map, SemanticsNode semanticsNode2, Region region2) {
        int e;
        int e2;
        int e3;
        int e4;
        int e5;
        int e6;
        int e7;
        int e8;
        LayoutInfo layoutInfo;
        boolean z = (semanticsNode2.getLayoutNode$ui_release().isPlaced() && semanticsNode2.getLayoutNode$ui_release().isAttached()) ? false : true;
        if (!region.isEmpty() || semanticsNode2.getId() == semanticsNode.getId()) {
            if (!z || semanticsNode2.isFake$ui_release()) {
                Rect touchBoundsInRoot = semanticsNode2.getTouchBoundsInRoot();
                e = dsT.e(touchBoundsInRoot.getLeft());
                e2 = dsT.e(touchBoundsInRoot.getTop());
                e3 = dsT.e(touchBoundsInRoot.getRight());
                e4 = dsT.e(touchBoundsInRoot.getBottom());
                region2.set(e, e2, e3, e4);
                int id = semanticsNode2.getId() == semanticsNode.getId() ? -1 : semanticsNode2.getId();
                if (region2.op(region, Region.Op.INTERSECT)) {
                    map.put(Integer.valueOf(id), new SemanticsNodeWithAdjustedBounds(semanticsNode2, region2.getBounds()));
                    List<SemanticsNode> replacedChildren$ui_release = semanticsNode2.getReplacedChildren$ui_release();
                    for (int size = replacedChildren$ui_release.size() - 1; -1 < size; size--) {
                        getAllUncoveredSemanticsNodesToMap$findAllSemanticNodesRecursive(region, semanticsNode, map, replacedChildren$ui_release.get(size), region2);
                    }
                    if (isImportantForAccessibility(semanticsNode2)) {
                        region.op(e, e2, e3, e4, Region.Op.DIFFERENCE);
                    }
                } else if (!semanticsNode2.isFake$ui_release()) {
                    if (id == -1) {
                        map.put(Integer.valueOf(id), new SemanticsNodeWithAdjustedBounds(semanticsNode2, region2.getBounds()));
                    }
                } else {
                    SemanticsNode parent = semanticsNode2.getParent();
                    Rect boundsInRoot = (parent == null || (layoutInfo = parent.getLayoutInfo()) == null || !layoutInfo.isPlaced()) ? DefaultFakeNodeBounds : parent.getBoundsInRoot();
                    e5 = dsT.e(boundsInRoot.getLeft());
                    e6 = dsT.e(boundsInRoot.getTop());
                    e7 = dsT.e(boundsInRoot.getRight());
                    e8 = dsT.e(boundsInRoot.getBottom());
                    map.put(Integer.valueOf(id), new SemanticsNodeWithAdjustedBounds(semanticsNode2, new android.graphics.Rect(e5, e6, e7, e8)));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScrollObservationScope findById(List<ScrollObservationScope> list, int i) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).getSemanticsNodeId() == i) {
                return list.get(i2);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLegacyClassName-V4PA4sw  reason: not valid java name */
    public static final String m1978toLegacyClassNameV4PA4sw(int i) {
        Role.Companion companion = Role.Companion;
        if (Role.m2032equalsimpl0(i, companion.m2036getButtono7Vup1c())) {
            return "android.widget.Button";
        }
        if (Role.m2032equalsimpl0(i, companion.m2037getCheckboxo7Vup1c())) {
            return "android.widget.CheckBox";
        }
        if (Role.m2032equalsimpl0(i, companion.m2040getRadioButtono7Vup1c())) {
            return "android.widget.RadioButton";
        }
        if (Role.m2032equalsimpl0(i, companion.m2039getImageo7Vup1c())) {
            return "android.widget.ImageView";
        }
        if (Role.m2032equalsimpl0(i, companion.m2038getDropdownListo7Vup1c())) {
            return "android.widget.Spinner";
        }
        return null;
    }

    public static final View semanticsIdToView(AndroidViewsHandler androidViewsHandler, int i) {
        Object obj;
        Iterator<T> it = androidViewsHandler.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((LayoutNode) ((Map.Entry) obj).getKey()).getSemanticsId() == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (AndroidViewHolder) entry.getValue();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isAncestorOf(LayoutNode layoutNode, LayoutNode layoutNode2) {
        LayoutNode parent$ui_release = layoutNode2.getParent$ui_release();
        if (parent$ui_release == null) {
            return false;
        }
        return C8632dsu.c(parent$ui_release, layoutNode) || isAncestorOf(layoutNode, parent$ui_release);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean excludeLineAndPageGranularities(SemanticsNode semanticsNode) {
        SemanticsConfiguration collapsedSemantics$ui_release;
        if (!semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getSetText()) || C8632dsu.c(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getFocused()), Boolean.TRUE)) {
            LayoutNode findClosestParentNode = findClosestParentNode(semanticsNode.getLayoutNode$ui_release(), new drM<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1
                /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
                    if (r3.contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetText()) != false) goto L7;
                 */
                @Override // o.drM
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Boolean invoke(androidx.compose.ui.node.LayoutNode r3) {
                    /*
                        r2 = this;
                        androidx.compose.ui.semantics.SemanticsConfiguration r3 = r3.getCollapsedSemantics$ui_release()
                        if (r3 == 0) goto L1a
                        boolean r0 = r3.isMergingSemanticsOfDescendants()
                        r1 = 1
                        if (r0 != r1) goto L1a
                        androidx.compose.ui.semantics.SemanticsActions r0 = androidx.compose.ui.semantics.SemanticsActions.INSTANCE
                        androidx.compose.ui.semantics.SemanticsPropertyKey r0 = r0.getSetText()
                        boolean r3 = r3.contains(r0)
                        if (r3 == 0) goto L1a
                        goto L1b
                    L1a:
                        r1 = 0
                    L1b:
                        java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
                        return r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1.invoke(androidx.compose.ui.node.LayoutNode):java.lang.Boolean");
                }
            });
            return findClosestParentNode != null && ((collapsedSemantics$ui_release = findClosestParentNode.getCollapsedSemantics$ui_release()) == null || !C8632dsu.c(SemanticsConfigurationKt.getOrNull(collapsedSemantics$ui_release, SemanticsProperties.INSTANCE.getFocused()), Boolean.TRUE));
        }
        return true;
    }
}
