package androidx.compose.ui.platform.accessibility;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.CollectionItemInfo;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.ArrayList;
import java.util.List;
import o.C8569dql;
import o.C8576dqs;
import o.drO;

/* loaded from: classes.dex */
public final class CollectionInfo_androidKt {
    public static final void setCollectionInfo(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        SemanticsConfiguration config = semanticsNode.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        CollectionInfo collectionInfo = (CollectionInfo) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getCollectionInfo());
        if (collectionInfo != null) {
            accessibilityNodeInfoCompat.setCollectionInfo(toAccessibilityCollectionInfo(collectionInfo));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), semanticsProperties.getSelectableGroup()) != null) {
            List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i = 0; i < size; i++) {
                SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i);
                if (semanticsNode2.getConfig().contains(SemanticsProperties.INSTANCE.getSelected())) {
                    arrayList.add(semanticsNode2);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            boolean calculateIfHorizontallyStacked = calculateIfHorizontallyStacked(arrayList);
            accessibilityNodeInfoCompat.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(calculateIfHorizontallyStacked ? 1 : arrayList.size(), calculateIfHorizontallyStacked ? arrayList.size() : 1, false, 0));
        }
    }

    public static final void setCollectionItemInfo(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        SemanticsConfiguration config = semanticsNode.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        CollectionItemInfo collectionItemInfo = (CollectionItemInfo) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getCollectionItemInfo());
        if (collectionItemInfo != null) {
            accessibilityNodeInfoCompat.setCollectionItemInfo(toAccessibilityCollectionItemInfo(collectionItemInfo, semanticsNode));
        }
        SemanticsNode parent = semanticsNode.getParent();
        if (parent == null || SemanticsConfigurationKt.getOrNull(parent.getConfig(), semanticsProperties.getSelectableGroup()) == null) {
            return;
        }
        CollectionInfo collectionInfo = (CollectionInfo) SemanticsConfigurationKt.getOrNull(parent.getConfig(), semanticsProperties.getCollectionInfo());
        if ((collectionInfo == null || !isLazyCollection(collectionInfo)) && semanticsNode.getConfig().contains(semanticsProperties.getSelected())) {
            ArrayList arrayList = new ArrayList();
            List<SemanticsNode> replacedChildren$ui_release = parent.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i2);
                if (semanticsNode2.getConfig().contains(SemanticsProperties.INSTANCE.getSelected())) {
                    arrayList.add(semanticsNode2);
                    if (semanticsNode2.getLayoutNode$ui_release().getPlaceOrder$ui_release() < semanticsNode.getLayoutNode$ui_release().getPlaceOrder$ui_release()) {
                        i++;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                boolean calculateIfHorizontallyStacked = calculateIfHorizontallyStacked(arrayList);
                AccessibilityNodeInfoCompat.CollectionItemInfoCompat obtain = AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(calculateIfHorizontallyStacked ? 0 : i, 1, calculateIfHorizontallyStacked ? i : 0, 1, false, ((Boolean) semanticsNode.getConfig().getOrElse(SemanticsProperties.INSTANCE.getSelected(), new drO<Boolean>() { // from class: androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt$setCollectionItemInfo$itemInfo$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // o.drO
                    public final Boolean invoke() {
                        return Boolean.FALSE;
                    }
                })).booleanValue());
                if (obtain != null) {
                    accessibilityNodeInfoCompat.setCollectionItemInfo(obtain);
                }
            }
        }
    }

    public static final boolean hasCollectionInfo(SemanticsNode semanticsNode) {
        SemanticsConfiguration config = semanticsNode.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return (SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getCollectionInfo()) == null && SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), semanticsProperties.getSelectableGroup()) == null) ? false : true;
    }

    private static final boolean calculateIfHorizontallyStacked(List<SemanticsNode> list) {
        List i;
        Object y;
        int t;
        long m1146unboximpl;
        Object y2;
        int t2;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() == 0 || list.size() == 1) {
            i = C8569dql.i();
        } else {
            i = new ArrayList();
            SemanticsNode semanticsNode = list.get(0);
            t2 = C8569dql.t(list);
            int i2 = 0;
            while (i2 < t2) {
                i2++;
                SemanticsNode semanticsNode2 = list.get(i2);
                SemanticsNode semanticsNode3 = semanticsNode2;
                SemanticsNode semanticsNode4 = semanticsNode;
                i.add(Offset.m1126boximpl(OffsetKt.Offset(Math.abs(Offset.m1137getXimpl(semanticsNode4.getBoundsInRoot().m1156getCenterF1C5BW0()) - Offset.m1137getXimpl(semanticsNode3.getBoundsInRoot().m1156getCenterF1C5BW0())), Math.abs(Offset.m1138getYimpl(semanticsNode4.getBoundsInRoot().m1156getCenterF1C5BW0()) - Offset.m1138getYimpl(semanticsNode3.getBoundsInRoot().m1156getCenterF1C5BW0())))));
                semanticsNode = semanticsNode2;
            }
        }
        if (i.size() == 1) {
            y2 = C8576dqs.y(i);
            m1146unboximpl = ((Offset) y2).m1146unboximpl();
        } else if (i.isEmpty()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        } else {
            y = C8576dqs.y(i);
            t = C8569dql.t(i);
            if (1 <= t) {
                int i3 = 1;
                while (true) {
                    y = Offset.m1126boximpl(Offset.m1142plusMKHz9U(((Offset) y).m1146unboximpl(), ((Offset) i.get(i3)).m1146unboximpl()));
                    if (i3 == t) {
                        break;
                    }
                    i3++;
                }
            }
            m1146unboximpl = ((Offset) y).m1146unboximpl();
        }
        return Offset.m1128component2impl(m1146unboximpl) < Offset.m1127component1impl(m1146unboximpl);
    }

    private static final boolean isLazyCollection(CollectionInfo collectionInfo) {
        return collectionInfo.getRowCount() < 0 || collectionInfo.getColumnCount() < 0;
    }

    private static final AccessibilityNodeInfoCompat.CollectionInfoCompat toAccessibilityCollectionInfo(CollectionInfo collectionInfo) {
        return AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(collectionInfo.getRowCount(), collectionInfo.getColumnCount(), false, 0);
    }

    private static final AccessibilityNodeInfoCompat.CollectionItemInfoCompat toAccessibilityCollectionItemInfo(CollectionItemInfo collectionItemInfo, SemanticsNode semanticsNode) {
        return AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(collectionItemInfo.getRowIndex(), collectionItemInfo.getRowSpan(), collectionItemInfo.getColumnIndex(), collectionItemInfo.getColumnSpan(), false, ((Boolean) semanticsNode.getConfig().getOrElse(SemanticsProperties.INSTANCE.getSelected(), new drO<Boolean>() { // from class: androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt$toAccessibilityCollectionItemInfo$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final Boolean invoke() {
                return Boolean.FALSE;
            }
        })).booleanValue());
    }
}
