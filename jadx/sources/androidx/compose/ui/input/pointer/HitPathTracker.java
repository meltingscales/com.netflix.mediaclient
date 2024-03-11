package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.List;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class HitPathTracker {
    public static final int $stable = MutableVector.$stable;
    private final NodeParent root = new NodeParent();
    private final LayoutCoordinates rootCoordinates;

    public HitPathTracker(LayoutCoordinates layoutCoordinates) {
        this.rootCoordinates = layoutCoordinates;
    }

    /* renamed from: addHitPath-KNwqfcY  reason: not valid java name */
    public final void m1687addHitPathKNwqfcY(long j, List<? extends Modifier.Node> list) {
        Node node;
        NodeParent nodeParent = this.root;
        int size = list.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            Modifier.Node node2 = list.get(i);
            if (z) {
                MutableVector<Node> children = nodeParent.getChildren();
                int size2 = children.getSize();
                if (size2 > 0) {
                    Node[] content = children.getContent();
                    int i2 = 0;
                    do {
                        node = content[i2];
                        if (C8632dsu.c(node.getModifierNode(), node2)) {
                            break;
                        }
                        i2++;
                    } while (i2 < size2);
                    node = null;
                } else {
                    node = null;
                }
                Node node3 = node;
                if (node3 != null) {
                    node3.markIsIn();
                    node3.getPointerIds().m1774add0FcD4WY(j);
                    nodeParent = node3;
                } else {
                    z = false;
                }
            }
            Node node4 = new Node(node2);
            node4.getPointerIds().m1774add0FcD4WY(j);
            nodeParent.getChildren().add(node4);
            nodeParent = node4;
        }
    }

    public final boolean dispatchChanges(InternalPointerEvent internalPointerEvent, boolean z) {
        if (this.root.buildCache(internalPointerEvent.getChanges(), this.rootCoordinates, internalPointerEvent, z)) {
            return this.root.dispatchFinalEventPass(internalPointerEvent) || this.root.dispatchMainEventPass(internalPointerEvent.getChanges(), this.rootCoordinates, internalPointerEvent, z);
        }
        return false;
    }

    public final void processCancel() {
        this.root.dispatchCancel();
        this.root.clear();
    }

    public final void removeDetachedPointerInputFilters() {
        this.root.removeDetachedPointerInputFilters();
    }
}
