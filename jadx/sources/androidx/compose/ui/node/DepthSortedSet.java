package androidx.compose.ui.node;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import o.C8632dsu;
import o.InterfaceC8554dpx;
import o.dpB;
import o.drO;

/* loaded from: classes.dex */
public final class DepthSortedSet {
    private final Comparator<LayoutNode> DepthComparator;
    private final boolean extraAssertions;
    private final InterfaceC8554dpx mapOfOriginalDepth$delegate;
    private final TreeSet<LayoutNode> set;

    public DepthSortedSet(boolean z) {
        InterfaceC8554dpx b;
        this.extraAssertions = z;
        b = dpB.b(LazyThreadSafetyMode.e, new drO<Map<LayoutNode, Integer>>() { // from class: androidx.compose.ui.node.DepthSortedSet$mapOfOriginalDepth$2
            @Override // o.drO
            public final Map<LayoutNode, Integer> invoke() {
                return new LinkedHashMap();
            }
        });
        this.mapOfOriginalDepth$delegate = b;
        Comparator<LayoutNode> comparator = new Comparator<LayoutNode>() { // from class: androidx.compose.ui.node.DepthSortedSet$DepthComparator$1
            @Override // java.util.Comparator
            public int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
                int d = C8632dsu.d(layoutNode.getDepth$ui_release(), layoutNode2.getDepth$ui_release());
                return d != 0 ? d : C8632dsu.d(layoutNode.hashCode(), layoutNode2.hashCode());
            }
        };
        this.DepthComparator = comparator;
        this.set = new TreeSet<>(comparator);
    }

    private final Map<LayoutNode, Integer> getMapOfOriginalDepth() {
        return (Map) this.mapOfOriginalDepth$delegate.getValue();
    }

    public final boolean contains(LayoutNode layoutNode) {
        boolean contains = this.set.contains(layoutNode);
        if (!this.extraAssertions || contains == getMapOfOriginalDepth().containsKey(layoutNode)) {
            return contains;
        }
        throw new IllegalStateException("inconsistency in TreeSet".toString());
    }

    public final void add(LayoutNode layoutNode) {
        if (!layoutNode.isAttached()) {
            throw new IllegalStateException("DepthSortedSet.add called on an unattached node".toString());
        }
        if (this.extraAssertions) {
            Integer num = getMapOfOriginalDepth().get(layoutNode);
            if (num == null) {
                getMapOfOriginalDepth().put(layoutNode, Integer.valueOf(layoutNode.getDepth$ui_release()));
            } else {
                if (num.intValue() != layoutNode.getDepth$ui_release()) {
                    throw new IllegalStateException("invalid node depth".toString());
                }
            }
        }
        this.set.add(layoutNode);
    }

    public final boolean remove(LayoutNode layoutNode) {
        if (!layoutNode.isAttached()) {
            throw new IllegalStateException("DepthSortedSet.remove called on an unattached node".toString());
        }
        boolean remove = this.set.remove(layoutNode);
        if (this.extraAssertions) {
            if (!C8632dsu.c(getMapOfOriginalDepth().remove(layoutNode), remove ? Integer.valueOf(layoutNode.getDepth$ui_release()) : null)) {
                throw new IllegalStateException("invalid node depth".toString());
            }
        }
        return remove;
    }

    public final LayoutNode pop() {
        LayoutNode first = this.set.first();
        remove(first);
        return first;
    }

    public final boolean isEmpty() {
        return this.set.isEmpty();
    }

    public String toString() {
        return this.set.toString();
    }
}
