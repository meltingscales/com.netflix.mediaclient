package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public final class SlotReader {
    private boolean closed;
    private int currentEnd;
    private int currentGroup;
    private int currentSlot;
    private int currentSlotEnd;
    private int emptyCount;
    private final int[] groups;
    private final int groupsSize;
    private int parent;
    private final Object[] slots;
    private final int slotsSize;
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;
    private final SlotTable table;

    public final void beginEmpty() {
        this.emptyCount++;
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final int getCurrentEnd() {
        return this.currentEnd;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final int getGroupEnd() {
        return this.currentEnd;
    }

    public final boolean getInEmpty() {
        return this.emptyCount > 0;
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getSize() {
        return this.groupsSize;
    }

    public final SlotTable getTable$runtime_release() {
        return this.table;
    }

    public SlotReader(SlotTable slotTable) {
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        int groupsSize = slotTable.getGroupsSize();
        this.groupsSize = groupsSize;
        this.slots = slotTable.getSlots();
        this.slotsSize = slotTable.getSlotsSize();
        this.currentEnd = groupsSize;
        this.parent = -1;
    }

    public final int parent(int i) {
        int parentAnchor;
        parentAnchor = SlotTableKt.parentAnchor(this.groups, i);
        return parentAnchor;
    }

    public final boolean isNode() {
        boolean isNode;
        isNode = SlotTableKt.isNode(this.groups, this.currentGroup);
        return isNode;
    }

    public final boolean isNode(int i) {
        boolean isNode;
        isNode = SlotTableKt.isNode(this.groups, i);
        return isNode;
    }

    public final int nodeCount(int i) {
        int nodeCount;
        nodeCount = SlotTableKt.nodeCount(this.groups, i);
        return nodeCount;
    }

    public final Object node(int i) {
        boolean isNode;
        isNode = SlotTableKt.isNode(this.groups, i);
        if (isNode) {
            return node(this.groups, i);
        }
        return null;
    }

    public final boolean isGroupEnd() {
        return getInEmpty() || this.currentGroup == this.currentEnd;
    }

    public final int getGroupSize() {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.groups, this.currentGroup);
        return groupSize;
    }

    public final int groupSize(int i) {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.groups, i);
        return groupSize;
    }

    public final int getGroupKey() {
        int key;
        int i = this.currentGroup;
        if (i < this.currentEnd) {
            key = SlotTableKt.key(this.groups, i);
            return key;
        }
        return 0;
    }

    public final int groupKey(int i) {
        int key;
        key = SlotTableKt.key(this.groups, i);
        return key;
    }

    public final int getGroupSlotIndex() {
        int slotAnchor;
        int i = this.currentSlot;
        slotAnchor = SlotTableKt.slotAnchor(this.groups, this.parent);
        return i - slotAnchor;
    }

    public final boolean hasObjectKey(int i) {
        boolean hasObjectKey;
        hasObjectKey = SlotTableKt.hasObjectKey(this.groups, i);
        return hasObjectKey;
    }

    public final Object getGroupObjectKey() {
        int i = this.currentGroup;
        if (i < this.currentEnd) {
            return objectKey(this.groups, i);
        }
        return null;
    }

    public final Object groupObjectKey(int i) {
        return objectKey(this.groups, i);
    }

    public final Object getGroupAux() {
        int i = this.currentGroup;
        if (i < this.currentEnd) {
            return aux(this.groups, i);
        }
        return 0;
    }

    public final Object groupAux(int i) {
        return aux(this.groups, i);
    }

    public final boolean hasMark(int i) {
        boolean hasMark;
        hasMark = SlotTableKt.hasMark(this.groups, i);
        return hasMark;
    }

    public final boolean containsMark(int i) {
        boolean containsMark;
        containsMark = SlotTableKt.containsMark(this.groups, i);
        return containsMark;
    }

    public final int getParentNodes() {
        int nodeCount;
        int i = this.parent;
        if (i >= 0) {
            nodeCount = SlotTableKt.nodeCount(this.groups, i);
            return nodeCount;
        }
        return 0;
    }

    public final Object groupGet(int i) {
        return groupGet(this.currentGroup, i);
    }

    public final Object groupGet(int i, int i2) {
        int slotAnchor;
        slotAnchor = SlotTableKt.slotAnchor(this.groups, i);
        int i3 = i + 1;
        int i4 = slotAnchor + i2;
        return i4 < (i3 < this.groupsSize ? SlotTableKt.dataAnchor(this.groups, i3) : this.slotsSize) ? this.slots[i4] : Composer.Companion.getEmpty();
    }

    public final Object next() {
        int i;
        if (this.emptyCount > 0 || (i = this.currentSlot) >= this.currentSlotEnd) {
            return Composer.Companion.getEmpty();
        }
        Object[] objArr = this.slots;
        this.currentSlot = i + 1;
        return objArr[i];
    }

    public final void endEmpty() {
        int i = this.emptyCount;
        if (i <= 0) {
            throw new IllegalArgumentException("Unbalanced begin/end empty".toString());
        }
        this.emptyCount = i - 1;
    }

    public final void close() {
        this.closed = true;
        this.table.close$runtime_release(this, this.sourceInformationMap);
    }

    public final void startGroup() {
        int parentAnchor;
        int groupSize;
        int slotAnchor;
        GroupSourceInformation groupSourceInformation;
        if (this.emptyCount <= 0) {
            int i = this.parent;
            int i2 = this.currentGroup;
            parentAnchor = SlotTableKt.parentAnchor(this.groups, i2);
            if (parentAnchor == i) {
                HashMap<Anchor, GroupSourceInformation> hashMap = this.sourceInformationMap;
                if (hashMap != null && (groupSourceInformation = hashMap.get(anchor(i))) != null) {
                    groupSourceInformation.reportGroup(this.table, i2);
                }
                this.parent = i2;
                groupSize = SlotTableKt.groupSize(this.groups, i2);
                this.currentEnd = groupSize + i2;
                int i3 = i2 + 1;
                this.currentGroup = i3;
                slotAnchor = SlotTableKt.slotAnchor(this.groups, i2);
                this.currentSlot = slotAnchor;
                this.currentSlotEnd = i2 >= this.groupsSize + (-1) ? this.slotsSize : SlotTableKt.dataAnchor(this.groups, i3);
                return;
            }
            throw new IllegalArgumentException("Invalid slot table detected".toString());
        }
    }

    public final void startNode() {
        boolean isNode;
        if (this.emptyCount <= 0) {
            isNode = SlotTableKt.isNode(this.groups, this.currentGroup);
            if (!isNode) {
                throw new IllegalArgumentException("Expected a node group".toString());
            }
            startGroup();
        }
    }

    public final int skipGroup() {
        boolean isNode;
        int groupSize;
        if (this.emptyCount == 0) {
            isNode = SlotTableKt.isNode(this.groups, this.currentGroup);
            int nodeCount = isNode ? 1 : SlotTableKt.nodeCount(this.groups, this.currentGroup);
            int i = this.currentGroup;
            groupSize = SlotTableKt.groupSize(this.groups, i);
            this.currentGroup = i + groupSize;
            return nodeCount;
        }
        ComposerKt.composeRuntimeError("Cannot skip while in an empty region".toString());
        throw new KotlinNothingValueException();
    }

    public final void reposition(int i) {
        int groupSize;
        if (this.emptyCount == 0) {
            this.currentGroup = i;
            int parentAnchor = i < this.groupsSize ? SlotTableKt.parentAnchor(this.groups, i) : -1;
            this.parent = parentAnchor;
            if (parentAnchor < 0) {
                this.currentEnd = this.groupsSize;
            } else {
                groupSize = SlotTableKt.groupSize(this.groups, parentAnchor);
                this.currentEnd = parentAnchor + groupSize;
            }
            this.currentSlot = 0;
            this.currentSlotEnd = 0;
            return;
        }
        ComposerKt.composeRuntimeError("Cannot reposition while in an empty region".toString());
        throw new KotlinNothingValueException();
    }

    public final void restoreParent(int i) {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.groups, i);
        int i2 = groupSize + i;
        int i3 = this.currentGroup;
        if (i3 >= i && i3 <= i2) {
            this.parent = i;
            this.currentEnd = i2;
            this.currentSlot = 0;
            this.currentSlotEnd = 0;
            return;
        }
        ComposerKt.composeRuntimeError(("Index " + i + " is not a parent of " + i3).toString());
        throw new KotlinNothingValueException();
    }

    public final void endGroup() {
        int parentAnchor;
        int groupSize;
        int i;
        if (this.emptyCount == 0) {
            if (this.currentGroup == this.currentEnd) {
                parentAnchor = SlotTableKt.parentAnchor(this.groups, this.parent);
                this.parent = parentAnchor;
                if (parentAnchor < 0) {
                    i = this.groupsSize;
                } else {
                    groupSize = SlotTableKt.groupSize(this.groups, parentAnchor);
                    i = parentAnchor + groupSize;
                }
                this.currentEnd = i;
                return;
            }
            ComposerKt.composeRuntimeError("endGroup() not called at the end of a group".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final List<KeyInfo> extractKeys() {
        int key;
        boolean isNode;
        int nodeCount;
        int i;
        int groupSize;
        ArrayList arrayList = new ArrayList();
        if (this.emptyCount > 0) {
            return arrayList;
        }
        int i2 = this.currentGroup;
        int i3 = 0;
        while (i2 < this.currentEnd) {
            key = SlotTableKt.key(this.groups, i2);
            Object objectKey = objectKey(this.groups, i2);
            isNode = SlotTableKt.isNode(this.groups, i2);
            if (isNode) {
                i = 1;
            } else {
                nodeCount = SlotTableKt.nodeCount(this.groups, i2);
                i = nodeCount;
            }
            arrayList.add(new KeyInfo(key, objectKey, i2, i, i3));
            groupSize = SlotTableKt.groupSize(this.groups, i2);
            i2 += groupSize;
            i3++;
        }
        return arrayList;
    }

    public String toString() {
        return "SlotReader(current=" + this.currentGroup + ", key=" + getGroupKey() + ", parent=" + this.parent + ", end=" + this.currentEnd + ')';
    }

    public final Anchor anchor(int i) {
        int search;
        ArrayList<Anchor> anchors$runtime_release = this.table.getAnchors$runtime_release();
        search = SlotTableKt.search(anchors$runtime_release, i, this.groupsSize);
        if (search < 0) {
            Anchor anchor = new Anchor(i);
            anchors$runtime_release.add(-(search + 1), anchor);
            return anchor;
        }
        return anchors$runtime_release.get(search);
    }

    private final Object node(int[] iArr, int i) {
        boolean isNode;
        int nodeIndex;
        isNode = SlotTableKt.isNode(iArr, i);
        if (isNode) {
            Object[] objArr = this.slots;
            nodeIndex = SlotTableKt.nodeIndex(iArr, i);
            return objArr[nodeIndex];
        }
        return Composer.Companion.getEmpty();
    }

    private final Object aux(int[] iArr, int i) {
        boolean hasAux;
        int auxIndex;
        hasAux = SlotTableKt.hasAux(iArr, i);
        if (hasAux) {
            Object[] objArr = this.slots;
            auxIndex = SlotTableKt.auxIndex(iArr, i);
            return objArr[auxIndex];
        }
        return Composer.Companion.getEmpty();
    }

    private final Object objectKey(int[] iArr, int i) {
        boolean hasObjectKey;
        int objectKeyIndex;
        hasObjectKey = SlotTableKt.hasObjectKey(iArr, i);
        if (hasObjectKey) {
            Object[] objArr = this.slots;
            objectKeyIndex = SlotTableKt.objectKeyIndex(iArr, i);
            return objArr[objectKeyIndex];
        }
        return null;
    }

    public final void skipToGroupEnd() {
        if (this.emptyCount == 0) {
            this.currentGroup = this.currentEnd;
        } else {
            ComposerKt.composeRuntimeError("Cannot skip the enclosing group while in an empty region".toString());
            throw new KotlinNothingValueException();
        }
    }
}
