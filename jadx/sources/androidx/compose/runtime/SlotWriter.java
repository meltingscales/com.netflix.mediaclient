package androidx.compose.runtime;

import androidx.compose.runtime.Composer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C8564dqg;
import o.C8569dql;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class SlotWriter {
    private ArrayList<Anchor> anchors;
    private boolean closed;
    private int currentGroup;
    private int currentGroupEnd;
    private int currentSlot;
    private int currentSlotEnd;
    private int groupGapLen;
    private int groupGapStart;
    private int[] groups;
    private int insertCount;
    private int nodeCount;
    private PrioritySet pendingRecalculateMarks;
    private Object[] slots;
    private int slotsGapLen;
    private int slotsGapOwner;
    private int slotsGapStart;
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;
    private final SlotTable table;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final IntStack startStack = new IntStack();
    private final IntStack endStack = new IntStack();
    private final IntStack nodeCountStack = new IntStack();
    private int parent = -1;

    private final int dataAnchorToDataIndex(int i, int i2, int i3) {
        return i < 0 ? (i3 - i2) + i + 1 : i;
    }

    public final int dataIndexToDataAddress(int i) {
        return i < this.slotsGapStart ? i : i + this.slotsGapLen;
    }

    public final int dataIndexToDataAnchor(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public final int groupIndexToAddress(int i) {
        return i < this.groupGapStart ? i : i + this.groupGapLen;
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final int getCurrentGroupEnd() {
        return this.currentGroupEnd;
    }

    public final int getParent() {
        return this.parent;
    }

    public final SlotTable getTable$runtime_release() {
        return this.table;
    }

    public final boolean indexInParent(int i) {
        int i2 = this.parent;
        return (i > i2 && i < this.currentGroupEnd) || (i2 == 0 && i == 0);
    }

    public SlotWriter(SlotTable slotTable) {
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        this.slots = slotTable.getSlots();
        this.anchors = slotTable.getAnchors$runtime_release();
        this.sourceInformationMap = slotTable.getSourceInformationMap$runtime_release();
        this.groupGapStart = slotTable.getGroupsSize();
        this.groupGapLen = (this.groups.length / 5) - slotTable.getGroupsSize();
        this.slotsGapStart = slotTable.getSlotsSize();
        this.slotsGapLen = this.slots.length - slotTable.getSlotsSize();
        this.slotsGapOwner = slotTable.getGroupsSize();
        this.currentGroupEnd = slotTable.getGroupsSize();
    }

    public static final /* synthetic */ int access$dataIndex(SlotWriter slotWriter, int[] iArr, int i) {
        return slotWriter.dataIndex(iArr, i);
    }

    public static final /* synthetic */ int access$dataIndexToDataAddress(SlotWriter slotWriter, int i) {
        return slotWriter.dataIndexToDataAddress(i);
    }

    public static final /* synthetic */ int[] access$getGroups$p(SlotWriter slotWriter) {
        return slotWriter.groups;
    }

    public static final /* synthetic */ Object[] access$getSlots$p(SlotWriter slotWriter) {
        return slotWriter.slots;
    }

    public static final /* synthetic */ int access$groupIndexToAddress(SlotWriter slotWriter, int i) {
        return slotWriter.groupIndexToAddress(i);
    }

    public static final /* synthetic */ int access$slotIndex(SlotWriter slotWriter, int[] iArr, int i) {
        return slotWriter.slotIndex(iArr, i);
    }

    public final boolean isNode() {
        boolean isNode;
        int i = this.currentGroup;
        if (i < this.currentGroupEnd) {
            isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress(i));
            if (isNode) {
                return true;
            }
        }
        return false;
    }

    public final boolean isNode(int i) {
        boolean isNode;
        isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress(i));
        return isNode;
    }

    public final int nodeCount(int i) {
        int nodeCount;
        nodeCount = SlotTableKt.nodeCount(this.groups, groupIndexToAddress(i));
        return nodeCount;
    }

    public final int groupKey(int i) {
        int key;
        key = SlotTableKt.key(this.groups, groupIndexToAddress(i));
        return key;
    }

    public final Object groupObjectKey(int i) {
        boolean hasObjectKey;
        int objectKeyIndex;
        int groupIndexToAddress = groupIndexToAddress(i);
        hasObjectKey = SlotTableKt.hasObjectKey(this.groups, groupIndexToAddress);
        if (hasObjectKey) {
            Object[] objArr = this.slots;
            objectKeyIndex = SlotTableKt.objectKeyIndex(this.groups, groupIndexToAddress);
            return objArr[objectKeyIndex];
        }
        return null;
    }

    public final int groupSize(int i) {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i));
        return groupSize;
    }

    public final Object groupAux(int i) {
        boolean hasAux;
        int groupIndexToAddress = groupIndexToAddress(i);
        hasAux = SlotTableKt.hasAux(this.groups, groupIndexToAddress);
        return hasAux ? this.slots[auxIndex(this.groups, groupIndexToAddress)] : Composer.Companion.getEmpty();
    }

    public final boolean indexInCurrentGroup(int i) {
        return indexInGroup(i, this.currentGroup);
    }

    public final boolean indexInGroup(int i, int i2) {
        int capacity;
        int groupSize;
        if (i2 == this.parent) {
            capacity = this.currentGroupEnd;
        } else {
            if (i2 > this.startStack.peekOr(0)) {
                groupSize = groupSize(i2);
            } else {
                int indexOf = this.startStack.indexOf(i2);
                if (indexOf < 0) {
                    groupSize = groupSize(i2);
                } else {
                    capacity = (getCapacity() - this.groupGapLen) - this.endStack.peek(indexOf);
                }
            }
            capacity = groupSize + i2;
        }
        return i > i2 && i < capacity;
    }

    public final Object node(int i) {
        boolean isNode;
        int groupIndexToAddress = groupIndexToAddress(i);
        isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress);
        if (isNode) {
            return this.slots[dataIndexToDataAddress(nodeIndex(this.groups, groupIndexToAddress))];
        }
        return null;
    }

    public final Object node(Anchor anchor) {
        return node(anchor.toIndexFor(this));
    }

    public final int parent(int i) {
        return parent(this.groups, i);
    }

    public final void close() {
        this.closed = true;
        if (this.startStack.isEmpty()) {
            moveGroupGapTo(getSize$runtime_release());
            moveSlotGapTo(this.slots.length - this.slotsGapLen, this.groupGapStart);
            clearSlotGap();
            recalculateMarks();
        }
        this.table.close$runtime_release(this, this.groups, this.groupGapStart, this.slots, this.slotsGapStart, this.anchors, this.sourceInformationMap);
    }

    public final void reset() {
        if (this.insertCount == 0) {
            recalculateMarks();
            this.currentGroup = 0;
            this.currentGroupEnd = getCapacity() - this.groupGapLen;
            this.currentSlot = 0;
            this.currentSlotEnd = 0;
            this.nodeCount = 0;
            return;
        }
        ComposerKt.composeRuntimeError("Cannot reset when inserting".toString());
        throw new KotlinNothingValueException();
    }

    public final Object update(Object obj) {
        Object skip = skip();
        set(obj);
        return skip;
    }

    public final void updateAux(Object obj) {
        boolean hasAux;
        int groupIndexToAddress = groupIndexToAddress(this.currentGroup);
        hasAux = SlotTableKt.hasAux(this.groups, groupIndexToAddress);
        if (hasAux) {
            this.slots[dataIndexToDataAddress(auxIndex(this.groups, groupIndexToAddress))] = obj;
        } else {
            ComposerKt.composeRuntimeError("Updating the data of a group that was not created with a data slot".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final void updateNode(Object obj) {
        updateNodeOfGroup(this.currentGroup, obj);
    }

    public final void updateNode(Anchor anchor, Object obj) {
        updateNodeOfGroup(anchor.toIndexFor(this), obj);
    }

    public final void set(Object obj) {
        int i = this.currentSlot;
        if (i <= this.currentSlotEnd) {
            this.slots[dataIndexToDataAddress(i - 1)] = obj;
        } else {
            ComposerKt.composeRuntimeError("Writing to an invalid slot".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final Object set(int i, Object obj) {
        return set(this.currentGroup, i, obj);
    }

    public final Object set(int i, int i2, Object obj) {
        int slotIndex = slotIndex(this.groups, groupIndexToAddress(i));
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(i + 1));
        int i3 = slotIndex + i2;
        if (i3 < slotIndex || i3 >= dataIndex) {
            ComposerKt.composeRuntimeError(("Write to an invalid slot index " + i2 + " for group " + i).toString());
            throw new KotlinNothingValueException();
        }
        int dataIndexToDataAddress = dataIndexToDataAddress(i3);
        Object[] objArr = this.slots;
        Object obj2 = objArr[dataIndexToDataAddress];
        objArr[dataIndexToDataAddress] = obj;
        return obj2;
    }

    public final Object skip() {
        if (this.insertCount > 0) {
            insertSlots(1, this.parent);
        }
        Object[] objArr = this.slots;
        int i = this.currentSlot;
        this.currentSlot = i + 1;
        return objArr[dataIndexToDataAddress(i)];
    }

    public final Object slot(Anchor anchor, int i) {
        return slot(anchorIndex(anchor), i);
    }

    public final Object slot(int i, int i2) {
        int slotIndex = slotIndex(this.groups, groupIndexToAddress(i));
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(i + 1));
        int i3 = i2 + slotIndex;
        if (slotIndex > i3 || i3 >= dataIndex) {
            return Composer.Companion.getEmpty();
        }
        return this.slots[dataIndexToDataAddress(i3)];
    }

    public final void advanceBy(int i) {
        if (i < 0) {
            ComposerKt.composeRuntimeError("Cannot seek backwards".toString());
            throw new KotlinNothingValueException();
        } else if (this.insertCount > 0) {
            throw new IllegalStateException("Cannot call seek() while inserting".toString());
        } else {
            if (i == 0) {
                return;
            }
            int i2 = this.currentGroup + i;
            if (i2 < this.parent || i2 > this.currentGroupEnd) {
                ComposerKt.composeRuntimeError(("Cannot seek outside the current group (" + this.parent + '-' + this.currentGroupEnd + ')').toString());
                throw new KotlinNothingValueException();
            }
            this.currentGroup = i2;
            int dataIndex = dataIndex(this.groups, groupIndexToAddress(i2));
            this.currentSlot = dataIndex;
            this.currentSlotEnd = dataIndex;
        }
    }

    public final void skipToGroupEnd() {
        int i = this.currentGroupEnd;
        this.currentGroup = i;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(i));
    }

    public final void beginInsert() {
        int i = this.insertCount;
        this.insertCount = i + 1;
        if (i == 0) {
            saveCurrentGroupEnd();
        }
    }

    public final void endInsert() {
        int i = this.insertCount;
        if (i <= 0) {
            throw new IllegalStateException("Unbalanced begin/end insert".toString());
        }
        int i2 = i - 1;
        this.insertCount = i2;
        if (i2 == 0) {
            if (this.nodeCountStack.getSize() == this.startStack.getSize()) {
                restoreCurrentGroupEnd();
            } else {
                ComposerKt.composeRuntimeError("startGroup/endGroup mismatch while inserting".toString());
                throw new KotlinNothingValueException();
            }
        }
    }

    public final void startGroup() {
        if (this.insertCount == 0) {
            Composer.Companion companion = Composer.Companion;
            startGroup(0, companion.getEmpty(), false, companion.getEmpty());
            return;
        }
        ComposerKt.composeRuntimeError("Key must be supplied when inserting".toString());
        throw new KotlinNothingValueException();
    }

    public final void startGroup(int i, Object obj) {
        startGroup(i, obj, false, Composer.Companion.getEmpty());
    }

    public final void startNode(int i, Object obj) {
        startGroup(i, obj, true, Composer.Companion.getEmpty());
    }

    public final void startData(int i, Object obj, Object obj2) {
        startGroup(i, obj, false, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void startGroup(int i, Object obj, boolean z, Object obj2) {
        int nodeCount;
        int groupSize;
        int i2;
        GroupSourceInformation sourceInformationOf;
        int i3 = this.parent;
        byte b = this.insertCount > 0 ? (byte) 1 : (byte) 0;
        this.nodeCountStack.push(this.nodeCount);
        if (b != 0) {
            insertGroups(1);
            int i4 = this.currentGroup;
            int groupIndexToAddress = groupIndexToAddress(i4);
            Composer.Companion companion = Composer.Companion;
            int i5 = obj != companion.getEmpty() ? 1 : 0;
            int i6 = (z || obj2 == companion.getEmpty()) ? 0 : 1;
            SlotTableKt.initGroup(this.groups, groupIndexToAddress, i, z, i5, i6, this.parent, this.currentSlot);
            this.currentSlotEnd = this.currentSlot;
            int i7 = (z ? 1 : 0) + i5 + i6;
            if (i7 > 0) {
                insertSlots(i7, i4);
                Object[] objArr = this.slots;
                int i8 = this.currentSlot;
                if (z) {
                    objArr[i8] = obj2;
                    i8++;
                }
                if (i5 != 0) {
                    objArr[i8] = obj;
                    i8++;
                }
                if (i6 != 0) {
                    objArr[i8] = obj2;
                    i8++;
                }
                this.currentSlot = i8;
            }
            this.nodeCount = 0;
            i2 = i4 + 1;
            this.parent = i4;
            this.currentGroup = i2;
            if (i3 >= 0 && (sourceInformationOf = sourceInformationOf(i3)) != null) {
                sourceInformationOf.reportGroup(this, i4);
            }
        } else {
            this.startStack.push(i3);
            saveCurrentGroupEnd();
            int i9 = this.currentGroup;
            int groupIndexToAddress2 = groupIndexToAddress(i9);
            if (!C8632dsu.c(obj2, Composer.Companion.getEmpty())) {
                if (z) {
                    updateNode(obj2);
                } else {
                    updateAux(obj2);
                }
            }
            this.currentSlot = slotIndex(this.groups, groupIndexToAddress2);
            this.currentSlotEnd = dataIndex(this.groups, groupIndexToAddress(this.currentGroup + 1));
            nodeCount = SlotTableKt.nodeCount(this.groups, groupIndexToAddress2);
            this.nodeCount = nodeCount;
            this.parent = i9;
            this.currentGroup = i9 + 1;
            groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress2);
            i2 = i9 + groupSize;
        }
        this.currentGroupEnd = i2;
    }

    public final int endGroup() {
        boolean isNode;
        int groupSize;
        int nodeCount;
        boolean isNode2;
        int nodeCount2;
        int groupSize2;
        boolean z = this.insertCount > 0;
        int i = this.currentGroup;
        int i2 = this.currentGroupEnd;
        int i3 = this.parent;
        int groupIndexToAddress = groupIndexToAddress(i3);
        int i4 = this.nodeCount;
        int i5 = i - i3;
        isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress);
        if (z) {
            SlotTableKt.updateGroupSize(this.groups, groupIndexToAddress, i5);
            SlotTableKt.updateNodeCount(this.groups, groupIndexToAddress, i4);
            this.nodeCount = this.nodeCountStack.pop() + (isNode ? 1 : i4);
            this.parent = parent(this.groups, i3);
        } else if (i == i2) {
            groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress);
            nodeCount = SlotTableKt.nodeCount(this.groups, groupIndexToAddress);
            SlotTableKt.updateGroupSize(this.groups, groupIndexToAddress, i5);
            SlotTableKt.updateNodeCount(this.groups, groupIndexToAddress, i4);
            int pop = this.startStack.pop();
            restoreCurrentGroupEnd();
            this.parent = pop;
            int parent = parent(this.groups, i3);
            int pop2 = this.nodeCountStack.pop();
            this.nodeCount = pop2;
            if (parent == pop) {
                this.nodeCount = pop2 + (isNode ? 0 : i4 - nodeCount);
            } else {
                int i6 = i5 - groupSize;
                int i7 = isNode ? 0 : i4 - nodeCount;
                if (i6 != 0 || i7 != 0) {
                    while (parent != 0 && parent != pop && (i7 != 0 || i6 != 0)) {
                        int groupIndexToAddress2 = groupIndexToAddress(parent);
                        if (i6 != 0) {
                            groupSize2 = SlotTableKt.groupSize(this.groups, groupIndexToAddress2);
                            SlotTableKt.updateGroupSize(this.groups, groupIndexToAddress2, groupSize2 + i6);
                        }
                        if (i7 != 0) {
                            int[] iArr = this.groups;
                            nodeCount2 = SlotTableKt.nodeCount(iArr, groupIndexToAddress2);
                            SlotTableKt.updateNodeCount(iArr, groupIndexToAddress2, nodeCount2 + i7);
                        }
                        isNode2 = SlotTableKt.isNode(this.groups, groupIndexToAddress2);
                        if (isNode2) {
                            i7 = 0;
                        }
                        parent = parent(this.groups, parent);
                    }
                }
                this.nodeCount += i7;
            }
        } else {
            ComposerKt.composeRuntimeError("Expected to be at the end of a group".toString());
            throw new KotlinNothingValueException();
        }
        return i4;
    }

    public final void ensureStarted(int i) {
        if (this.insertCount > 0) {
            ComposerKt.composeRuntimeError("Cannot call ensureStarted() while inserting".toString());
            throw new KotlinNothingValueException();
        }
        int i2 = this.parent;
        if (i2 != i) {
            if (i < i2 || i >= this.currentGroupEnd) {
                ComposerKt.composeRuntimeError(("Started group at " + i + " must be a subgroup of the group at " + i2).toString());
                throw new KotlinNothingValueException();
            }
            int i3 = this.currentGroup;
            int i4 = this.currentSlot;
            int i5 = this.currentSlotEnd;
            this.currentGroup = i;
            startGroup();
            this.currentGroup = i3;
            this.currentSlot = i4;
            this.currentSlotEnd = i5;
        }
    }

    public final void ensureStarted(Anchor anchor) {
        ensureStarted(anchor.toIndexFor(this));
    }

    public final int skipGroup() {
        int groupSize;
        boolean isNode;
        int nodeCount;
        int groupIndexToAddress = groupIndexToAddress(this.currentGroup);
        int i = this.currentGroup;
        groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress);
        int i2 = i + groupSize;
        this.currentGroup = i2;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(i2));
        isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress);
        if (isNode) {
            return 1;
        }
        nodeCount = SlotTableKt.nodeCount(this.groups, groupIndexToAddress);
        return nodeCount;
    }

    public final boolean removeGroup() {
        Anchor tryAnchor$runtime_release;
        if (this.insertCount == 0) {
            int i = this.currentGroup;
            int i2 = this.currentSlot;
            int skipGroup = skipGroup();
            GroupSourceInformation sourceInformationOf = sourceInformationOf(this.parent);
            if (sourceInformationOf != null && (tryAnchor$runtime_release = tryAnchor$runtime_release(i)) != null) {
                sourceInformationOf.removeAnchor(tryAnchor$runtime_release);
            }
            PrioritySet prioritySet = this.pendingRecalculateMarks;
            if (prioritySet != null) {
                while (prioritySet.isNotEmpty() && prioritySet.peek() >= i) {
                    prioritySet.takeMax();
                }
            }
            boolean removeGroups = removeGroups(i, this.currentGroup - i);
            removeSlots(i2, this.currentSlot - i2, i - 1);
            this.currentGroup = i;
            this.currentSlot = i2;
            this.nodeCount -= skipGroup;
            return removeGroups;
        }
        ComposerKt.composeRuntimeError("Cannot remove group while inserting".toString());
        throw new KotlinNothingValueException();
    }

    public final Iterator<Object> groupSlots() {
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int[] iArr = this.groups;
        int i = this.currentGroup;
        return new SlotWriter$groupSlots$1(dataIndex, dataIndex(iArr, groupIndexToAddress(i + groupSize(i))), this);
    }

    public final void moveGroup(int i) {
        int groupSize;
        int i2;
        int groupSize2;
        if (this.insertCount != 0) {
            ComposerKt.composeRuntimeError("Cannot move a group while inserting".toString());
            throw new KotlinNothingValueException();
        } else if (i < 0) {
            ComposerKt.composeRuntimeError("Parameter offset is out of bounds".toString());
            throw new KotlinNothingValueException();
        } else if (i != 0) {
            int i3 = this.currentGroup;
            int i4 = this.parent;
            int i5 = this.currentGroupEnd;
            int i6 = i3;
            for (int i7 = i; i7 > 0; i7--) {
                groupSize2 = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i6));
                i6 += groupSize2;
                if (i6 > i5) {
                    ComposerKt.composeRuntimeError("Parameter offset is out of bounds".toString());
                    throw new KotlinNothingValueException();
                }
            }
            groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i6));
            int i8 = this.currentSlot;
            int dataIndex = dataIndex(this.groups, groupIndexToAddress(i6));
            int i9 = i6 + groupSize;
            int dataIndex2 = dataIndex(this.groups, groupIndexToAddress(i9));
            int i10 = dataIndex2 - dataIndex;
            int i11 = 0;
            insertSlots(i10, Math.max(this.currentGroup - 1, 0));
            insertGroups(groupSize);
            int[] iArr = this.groups;
            int groupIndexToAddress = groupIndexToAddress(i9) * 5;
            C8564dqg.c(iArr, iArr, groupIndexToAddress(i3) * 5, groupIndexToAddress, (groupSize * 5) + groupIndexToAddress);
            if (i10 > 0) {
                Object[] objArr = this.slots;
                C8564dqg.d(objArr, objArr, i8, dataIndexToDataAddress(dataIndex + i10), dataIndexToDataAddress(dataIndex2 + i10));
            }
            int i12 = dataIndex + i10;
            int i13 = i12 - i8;
            int i14 = this.slotsGapStart;
            int i15 = this.slotsGapLen;
            int length = this.slots.length;
            int i16 = this.slotsGapOwner;
            int i17 = i3;
            while (i17 < i3 + groupSize) {
                int groupIndexToAddress2 = groupIndexToAddress(i17);
                int dataIndex3 = dataIndex(iArr, groupIndexToAddress2);
                if (i16 < groupIndexToAddress2) {
                    i2 = i14;
                } else {
                    i11 = i14;
                    i2 = i11;
                }
                updateDataIndex(iArr, groupIndexToAddress2, dataIndexToDataAnchor(dataIndex3 - i13, i11, i15, length));
                i17++;
                i14 = i2;
                i11 = 0;
            }
            moveAnchors(i9, i3, groupSize);
            if (!removeGroups(i9, groupSize)) {
                fixParentAnchorsFor(i4, this.currentGroupEnd, i3);
                if (i10 > 0) {
                    removeSlots(i12, i10, i9 - 1);
                    return;
                }
                return;
            }
            ComposerKt.composeRuntimeError("Unexpectedly removed anchors".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        static /* synthetic */ List moveGroup$default(Companion companion, SlotWriter slotWriter, int i, SlotWriter slotWriter2, boolean z, boolean z2, boolean z3, int i2, Object obj) {
            if ((i2 & 32) != 0) {
                z3 = true;
            }
            return companion.moveGroup(slotWriter, i, slotWriter2, z, z2, z3);
        }

        public final List<Anchor> moveGroup(SlotWriter slotWriter, int i, SlotWriter slotWriter2, boolean z, boolean z2, boolean z3) {
            boolean z4;
            int locationOf;
            int locationOf2;
            List<Anchor> i2;
            ArrayList arrayList;
            boolean isNode;
            int groupSize;
            HashMap hashMap;
            int locationOf3;
            int i3;
            int parentAnchor;
            int groupSize2 = slotWriter.groupSize(i);
            int i4 = i + groupSize2;
            int dataIndex = slotWriter.dataIndex(i);
            int dataIndex2 = slotWriter.dataIndex(i4);
            int i5 = dataIndex2 - dataIndex;
            boolean containsAnyGroupMarks = slotWriter.containsAnyGroupMarks(i);
            slotWriter2.insertGroups(groupSize2);
            slotWriter2.insertSlots(i5, slotWriter2.getCurrentGroup());
            if (slotWriter.groupGapStart < i4) {
                slotWriter.moveGroupGapTo(i4);
            }
            if (slotWriter.slotsGapStart < dataIndex2) {
                slotWriter.moveSlotGapTo(dataIndex2, i4);
            }
            int[] iArr = slotWriter2.groups;
            int currentGroup = slotWriter2.getCurrentGroup();
            C8564dqg.c(slotWriter.groups, iArr, currentGroup * 5, i * 5, i4 * 5);
            Object[] objArr = slotWriter2.slots;
            int i6 = slotWriter2.currentSlot;
            C8564dqg.d(slotWriter.slots, objArr, i6, dataIndex, dataIndex2);
            int parent = slotWriter2.getParent();
            SlotTableKt.updateParentAnchor(iArr, currentGroup, parent);
            int i7 = currentGroup - i;
            int i8 = currentGroup + groupSize2;
            int dataIndex3 = i6 - slotWriter2.dataIndex(iArr, currentGroup);
            int i9 = slotWriter2.slotsGapOwner;
            int i10 = slotWriter2.slotsGapLen;
            int length = objArr.length;
            int i11 = i9;
            int i12 = currentGroup;
            while (true) {
                z4 = false;
                if (i12 >= i8) {
                    break;
                }
                if (i12 != currentGroup) {
                    parentAnchor = SlotTableKt.parentAnchor(iArr, i12);
                    i3 = i8;
                    SlotTableKt.updateParentAnchor(iArr, i12, parentAnchor + i7);
                } else {
                    i3 = i8;
                }
                int i13 = currentGroup;
                SlotTableKt.updateDataAnchor(iArr, i12, slotWriter2.dataIndexToDataAnchor(slotWriter2.dataIndex(iArr, i12) + dataIndex3, i11 >= i12 ? slotWriter2.slotsGapStart : 0, i10, length));
                if (i12 == i11) {
                    i11++;
                }
                i12++;
                currentGroup = i13;
                i8 = i3;
            }
            int i14 = currentGroup;
            int i15 = i8;
            slotWriter2.slotsGapOwner = i11;
            locationOf = SlotTableKt.locationOf(slotWriter.anchors, i, slotWriter.getSize$runtime_release());
            locationOf2 = SlotTableKt.locationOf(slotWriter.anchors, i4, slotWriter.getSize$runtime_release());
            if (locationOf < locationOf2) {
                ArrayList arrayList2 = slotWriter.anchors;
                ArrayList arrayList3 = new ArrayList(locationOf2 - locationOf);
                for (int i16 = locationOf; i16 < locationOf2; i16++) {
                    Anchor anchor = (Anchor) arrayList2.get(i16);
                    anchor.setLocation$runtime_release(anchor.getLocation$runtime_release() + i7);
                    arrayList3.add(anchor);
                }
                locationOf3 = SlotTableKt.locationOf(slotWriter2.anchors, slotWriter2.getCurrentGroup(), slotWriter2.getSize$runtime_release());
                slotWriter2.anchors.addAll(locationOf3, arrayList3);
                arrayList2.subList(locationOf, locationOf2).clear();
                arrayList = arrayList3;
            } else {
                i2 = C8569dql.i();
                arrayList = i2;
            }
            if ((!arrayList.isEmpty()) && (hashMap = slotWriter.sourceInformationMap) != null) {
                HashMap hashMap2 = slotWriter2.sourceInformationMap;
                int size = arrayList.size();
                for (int i17 = 0; i17 < size; i17++) {
                    Anchor anchor2 = arrayList.get(i17);
                    GroupSourceInformation groupSourceInformation = (GroupSourceInformation) hashMap.get(anchor2);
                    if (groupSourceInformation != null) {
                        hashMap.remove(anchor2);
                        if (hashMap2 == null) {
                            Companion companion = SlotWriter.Companion;
                            hashMap2 = new HashMap();
                            slotWriter2.sourceInformationMap = hashMap2;
                        }
                        hashMap2.put(anchor2, groupSourceInformation);
                    }
                }
                if (hashMap.isEmpty()) {
                    slotWriter.sourceInformationMap = null;
                }
            }
            int parent2 = slotWriter2.getParent();
            GroupSourceInformation sourceInformationOf = slotWriter2.sourceInformationOf(parent);
            if (sourceInformationOf != null) {
                int i18 = parent2 + 1;
                int currentGroup2 = slotWriter2.getCurrentGroup();
                int i19 = -1;
                while (i18 < currentGroup2) {
                    groupSize = SlotTableKt.groupSize(slotWriter2.groups, i18);
                    int i20 = groupSize + i18;
                    i19 = i18;
                    i18 = i20;
                }
                sourceInformationOf.addGroupAfter(slotWriter2, i19, currentGroup2);
            }
            int parent3 = slotWriter.parent(i);
            if (z3) {
                if (!z) {
                    z4 = slotWriter.removeGroups(i, groupSize2);
                    slotWriter.removeSlots(dataIndex, i5, i - 1);
                } else {
                    boolean z5 = parent3 >= 0;
                    if (z5) {
                        slotWriter.startGroup();
                        slotWriter.advanceBy(parent3 - slotWriter.getCurrentGroup());
                        slotWriter.startGroup();
                    }
                    slotWriter.advanceBy(i - slotWriter.getCurrentGroup());
                    boolean removeGroup = slotWriter.removeGroup();
                    if (z5) {
                        slotWriter.skipToGroupEnd();
                        slotWriter.endGroup();
                        slotWriter.skipToGroupEnd();
                        slotWriter.endGroup();
                    }
                    z4 = removeGroup;
                }
            }
            if (!z4) {
                int i21 = slotWriter2.nodeCount;
                isNode = SlotTableKt.isNode(iArr, i14);
                slotWriter2.nodeCount = i21 + (isNode ? 1 : SlotTableKt.nodeCount(iArr, i14));
                if (z2) {
                    slotWriter2.currentGroup = i15;
                    slotWriter2.currentSlot = i6 + i5;
                }
                if (containsAnyGroupMarks) {
                    slotWriter2.updateContainsMark(parent);
                }
                return arrayList;
            }
            ComposerKt.composeRuntimeError("Unexpectedly removed anchors".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final List<Anchor> moveTo(Anchor anchor, int i, SlotWriter slotWriter) {
        int groupSize;
        boolean isNode;
        int nodeCount;
        ComposerKt.runtimeCheck(slotWriter.insertCount > 0);
        ComposerKt.runtimeCheck(this.insertCount == 0);
        ComposerKt.runtimeCheck(anchor.getValid());
        int anchorIndex = anchorIndex(anchor) + i;
        int i2 = this.currentGroup;
        ComposerKt.runtimeCheck(i2 <= anchorIndex && anchorIndex < this.currentGroupEnd);
        int parent = parent(anchorIndex);
        int groupSize2 = groupSize(anchorIndex);
        int nodeCount2 = isNode(anchorIndex) ? 1 : nodeCount(anchorIndex);
        List<Anchor> moveGroup$default = Companion.moveGroup$default(Companion, this, anchorIndex, slotWriter, false, false, false, 32, null);
        updateContainsMark(parent);
        boolean z = nodeCount2 > 0;
        while (parent >= i2) {
            int groupIndexToAddress = groupIndexToAddress(parent);
            int[] iArr = this.groups;
            groupSize = SlotTableKt.groupSize(iArr, groupIndexToAddress);
            SlotTableKt.updateGroupSize(iArr, groupIndexToAddress, groupSize - groupSize2);
            if (z) {
                isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress);
                if (isNode) {
                    z = false;
                } else {
                    int[] iArr2 = this.groups;
                    nodeCount = SlotTableKt.nodeCount(iArr2, groupIndexToAddress);
                    SlotTableKt.updateNodeCount(iArr2, groupIndexToAddress, nodeCount - nodeCount2);
                }
            }
            parent = parent(parent);
        }
        if (z) {
            ComposerKt.runtimeCheck(this.nodeCount >= nodeCount2);
            this.nodeCount -= nodeCount2;
        }
        return moveGroup$default;
    }

    public final List<Anchor> moveFrom(SlotTable slotTable, int i, boolean z) {
        int groupSize;
        ComposerKt.runtimeCheck(this.insertCount > 0);
        if (i == 0 && this.currentGroup == 0 && this.table.getGroupsSize() == 0) {
            groupSize = SlotTableKt.groupSize(slotTable.getGroups(), i);
            if (groupSize == slotTable.getGroupsSize()) {
                int[] iArr = this.groups;
                Object[] objArr = this.slots;
                ArrayList<Anchor> arrayList = this.anchors;
                HashMap<Anchor, GroupSourceInformation> hashMap = this.sourceInformationMap;
                int[] groups = slotTable.getGroups();
                int groupsSize = slotTable.getGroupsSize();
                Object[] slots = slotTable.getSlots();
                int slotsSize = slotTable.getSlotsSize();
                HashMap<Anchor, GroupSourceInformation> sourceInformationMap$runtime_release = slotTable.getSourceInformationMap$runtime_release();
                this.groups = groups;
                this.slots = slots;
                this.anchors = slotTable.getAnchors$runtime_release();
                this.groupGapStart = groupsSize;
                this.groupGapLen = (groups.length / 5) - groupsSize;
                this.slotsGapStart = slotsSize;
                this.slotsGapLen = slots.length - slotsSize;
                this.slotsGapOwner = groupsSize;
                this.sourceInformationMap = sourceInformationMap$runtime_release;
                slotTable.setTo$runtime_release(iArr, 0, objArr, 0, arrayList, hashMap);
                return this.anchors;
            }
        }
        SlotWriter openWriter = slotTable.openWriter();
        try {
            return Companion.moveGroup(openWriter, i, this, true, true, z);
        } finally {
            openWriter.close();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x000c, code lost:
        if (groupSize(r12.currentGroup + r13) == 1) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<androidx.compose.runtime.Anchor> moveIntoGroupFrom(int r13, androidx.compose.runtime.SlotTable r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.insertCount
            if (r0 > 0) goto Lf
            int r0 = r12.currentGroup
            int r0 = r0 + r13
            int r0 = r12.groupSize(r0)
            r1 = 1
            if (r0 != r1) goto Lf
            goto L10
        Lf:
            r1 = 0
        L10:
            androidx.compose.runtime.ComposerKt.runtimeCheck(r1)
            int r0 = r12.currentGroup
            int r1 = r12.currentSlot
            int r2 = r12.currentSlotEnd
            r12.advanceBy(r13)
            r12.startGroup()
            r12.beginInsert()
            androidx.compose.runtime.SlotWriter r13 = r14.openWriter()
            androidx.compose.runtime.SlotWriter$Companion r3 = androidx.compose.runtime.SlotWriter.Companion     // Catch: java.lang.Throwable -> L45
            r7 = 0
            r8 = 1
            r9 = 0
            r10 = 32
            r11 = 0
            r4 = r13
            r5 = r15
            r6 = r12
            java.util.List r14 = androidx.compose.runtime.SlotWriter.Companion.moveGroup$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L45
            r13.close()
            r12.endInsert()
            r12.endGroup()
            r12.currentGroup = r0
            r12.currentSlot = r1
            r12.currentSlotEnd = r2
            return r14
        L45:
            r14 = move-exception
            r13.close()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SlotWriter.moveIntoGroupFrom(int, androidx.compose.runtime.SlotTable, int):java.util.List");
    }

    public final Anchor anchor(int i) {
        int search;
        ArrayList<Anchor> arrayList = this.anchors;
        search = SlotTableKt.search(arrayList, i, getSize$runtime_release());
        if (search < 0) {
            if (i > this.groupGapStart) {
                i = -(getSize$runtime_release() - i);
            }
            Anchor anchor = new Anchor(i);
            arrayList.add(-(search + 1), anchor);
            return anchor;
        }
        return arrayList.get(search);
    }

    public static /* synthetic */ void markGroup$default(SlotWriter slotWriter, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = slotWriter.parent;
        }
        slotWriter.markGroup(i);
    }

    public final void markGroup(int i) {
        boolean hasMark;
        boolean containsMark;
        int groupIndexToAddress = groupIndexToAddress(i);
        hasMark = SlotTableKt.hasMark(this.groups, groupIndexToAddress);
        if (hasMark) {
            return;
        }
        SlotTableKt.updateMark(this.groups, groupIndexToAddress, true);
        containsMark = SlotTableKt.containsMark(this.groups, groupIndexToAddress);
        if (containsMark) {
            return;
        }
        updateContainsMark(parent(i));
    }

    private final boolean containsGroupMark(int i) {
        boolean containsMark;
        if (i >= 0) {
            containsMark = SlotTableKt.containsMark(this.groups, groupIndexToAddress(i));
            if (containsMark) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAnyGroupMarks(int i) {
        boolean containsAnyMark;
        if (i >= 0) {
            containsAnyMark = SlotTableKt.containsAnyMark(this.groups, groupIndexToAddress(i));
            if (containsAnyMark) {
                return true;
            }
        }
        return false;
    }

    private final void recalculateMarks() {
        PrioritySet prioritySet = this.pendingRecalculateMarks;
        if (prioritySet != null) {
            while (prioritySet.isNotEmpty()) {
                updateContainsMarkNow(prioritySet.takeMax(), prioritySet);
            }
        }
    }

    public final void updateContainsMark(int i) {
        if (i >= 0) {
            PrioritySet prioritySet = this.pendingRecalculateMarks;
            if (prioritySet == null) {
                prioritySet = new PrioritySet(null, 1, null);
                this.pendingRecalculateMarks = prioritySet;
            }
            prioritySet.add(i);
        }
    }

    private final void updateContainsMarkNow(int i, PrioritySet prioritySet) {
        boolean containsMark;
        int groupIndexToAddress = groupIndexToAddress(i);
        boolean childContainsAnyMarks = childContainsAnyMarks(i);
        containsMark = SlotTableKt.containsMark(this.groups, groupIndexToAddress);
        if (containsMark != childContainsAnyMarks) {
            SlotTableKt.updateContainsMark(this.groups, groupIndexToAddress, childContainsAnyMarks);
            int parent = parent(i);
            if (parent >= 0) {
                prioritySet.add(parent);
            }
        }
    }

    private final boolean childContainsAnyMarks(int i) {
        boolean containsAnyMark;
        int i2 = i + 1;
        int groupSize = groupSize(i);
        while (i2 < i + groupSize) {
            containsAnyMark = SlotTableKt.containsAnyMark(this.groups, groupIndexToAddress(i2));
            if (containsAnyMark) {
                return true;
            }
            i2 += groupSize(i2);
        }
        return false;
    }

    public final int anchorIndex(Anchor anchor) {
        int location$runtime_release = anchor.getLocation$runtime_release();
        return location$runtime_release < 0 ? location$runtime_release + getSize$runtime_release() : location$runtime_release;
    }

    public String toString() {
        return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + getSize$runtime_release() + " gap=" + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + ')';
    }

    private final void saveCurrentGroupEnd() {
        this.endStack.push((getCapacity() - this.groupGapLen) - this.currentGroupEnd);
    }

    private final int restoreCurrentGroupEnd() {
        int capacity = (getCapacity() - this.groupGapLen) - this.endStack.pop();
        this.currentGroupEnd = capacity;
        return capacity;
    }

    private final void fixParentAnchorsFor(int i, int i2, int i3) {
        int groupSize;
        int parentIndexToAnchor = parentIndexToAnchor(i, this.groupGapStart);
        while (i3 < i2) {
            SlotTableKt.updateParentAnchor(this.groups, groupIndexToAddress(i3), parentIndexToAnchor);
            groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i3));
            int i4 = groupSize + i3;
            fixParentAnchorsFor(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    public final void moveGroupGapTo(int i) {
        int parentAnchor;
        int i2 = this.groupGapLen;
        int i3 = this.groupGapStart;
        if (i3 != i) {
            if (!this.anchors.isEmpty()) {
                updateAnchors(i3, i);
            }
            if (i2 > 0) {
                int[] iArr = this.groups;
                int i4 = i * 5;
                int i5 = i2 * 5;
                int i6 = i3 * 5;
                if (i < i3) {
                    C8564dqg.c(iArr, iArr, i5 + i4, i4, i6);
                } else {
                    C8564dqg.c(iArr, iArr, i6, i6 + i5, i4 + i5);
                }
            }
            if (i < i3) {
                i3 = i + i2;
            }
            int capacity = getCapacity();
            ComposerKt.runtimeCheck(i3 < capacity);
            while (i3 < capacity) {
                parentAnchor = SlotTableKt.parentAnchor(this.groups, i3);
                int parentIndexToAnchor = parentIndexToAnchor(parentAnchorToIndex(parentAnchor), i);
                if (parentIndexToAnchor != parentAnchor) {
                    SlotTableKt.updateParentAnchor(this.groups, i3, parentIndexToAnchor);
                }
                i3++;
                if (i3 == i) {
                    i3 += i2;
                }
            }
        }
        this.groupGapStart = i;
    }

    public final void moveSlotGapTo(int i, int i2) {
        int dataAnchor;
        int dataAnchor2;
        int i3 = this.slotsGapLen;
        int i4 = this.slotsGapStart;
        int i5 = this.slotsGapOwner;
        if (i4 != i) {
            Object[] objArr = this.slots;
            if (i < i4) {
                C8564dqg.d(objArr, objArr, i + i3, i, i4);
            } else {
                C8564dqg.d(objArr, objArr, i4, i4 + i3, i + i3);
            }
        }
        int min = Math.min(i2 + 1, getSize$runtime_release());
        if (i5 != min) {
            int length = this.slots.length - i3;
            if (min < i5) {
                int groupIndexToAddress = groupIndexToAddress(min);
                int groupIndexToAddress2 = groupIndexToAddress(i5);
                int i6 = this.groupGapStart;
                while (groupIndexToAddress < groupIndexToAddress2) {
                    dataAnchor2 = SlotTableKt.dataAnchor(this.groups, groupIndexToAddress);
                    if (dataAnchor2 >= 0) {
                        SlotTableKt.updateDataAnchor(this.groups, groupIndexToAddress, -((length - dataAnchor2) + 1));
                        groupIndexToAddress++;
                        if (groupIndexToAddress == i6) {
                            groupIndexToAddress += this.groupGapLen;
                        }
                    } else {
                        ComposerKt.composeRuntimeError("Unexpected anchor value, expected a positive anchor".toString());
                        throw new KotlinNothingValueException();
                    }
                }
            } else {
                int groupIndexToAddress3 = groupIndexToAddress(i5);
                int groupIndexToAddress4 = groupIndexToAddress(min);
                while (groupIndexToAddress3 < groupIndexToAddress4) {
                    dataAnchor = SlotTableKt.dataAnchor(this.groups, groupIndexToAddress3);
                    if (dataAnchor < 0) {
                        SlotTableKt.updateDataAnchor(this.groups, groupIndexToAddress3, dataAnchor + length + 1);
                        groupIndexToAddress3++;
                        if (groupIndexToAddress3 == this.groupGapStart) {
                            groupIndexToAddress3 += this.groupGapLen;
                        }
                    } else {
                        ComposerKt.composeRuntimeError("Unexpected anchor value, expected a negative anchor".toString());
                        throw new KotlinNothingValueException();
                    }
                }
            }
            this.slotsGapOwner = min;
        }
        this.slotsGapStart = i;
    }

    private final void clearSlotGap() {
        int i = this.slotsGapStart;
        C8564dqg.d(this.slots, null, i, this.slotsGapLen + i);
    }

    public final void insertGroups(int i) {
        if (i > 0) {
            int i2 = this.currentGroup;
            moveGroupGapTo(i2);
            int i3 = this.groupGapStart;
            int i4 = this.groupGapLen;
            int[] iArr = this.groups;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i6 = max - i5;
                C8564dqg.c(iArr, iArr2, 0, 0, i3 * 5);
                C8564dqg.c(iArr, iArr2, (i3 + i6) * 5, (i4 + i3) * 5, length * 5);
                this.groups = iArr2;
                i4 = i6;
            }
            int i7 = this.currentGroupEnd;
            if (i7 >= i3) {
                this.currentGroupEnd = i7 + i;
            }
            int i8 = i3 + i;
            this.groupGapStart = i8;
            this.groupGapLen = i4 - i;
            int dataIndexToDataAnchor = dataIndexToDataAnchor(i5 > 0 ? dataIndex(i2 + i) : 0, this.slotsGapOwner >= i3 ? this.slotsGapStart : 0, this.slotsGapLen, this.slots.length);
            for (int i9 = i3; i9 < i8; i9++) {
                SlotTableKt.updateDataAnchor(this.groups, i9, dataIndexToDataAnchor);
            }
            int i10 = this.slotsGapOwner;
            if (i10 >= i3) {
                this.slotsGapOwner = i10 + i;
            }
        }
    }

    public final void insertSlots(int i, int i2) {
        if (i > 0) {
            moveSlotGapTo(this.currentSlot, i2);
            int i3 = this.slotsGapStart;
            int i4 = this.slotsGapLen;
            if (i4 < i) {
                Object[] objArr = this.slots;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                C8564dqg.d(objArr, objArr2, 0, 0, i3);
                C8564dqg.d(objArr, objArr2, i3 + i7, i4 + i3, length);
                this.slots = objArr2;
                i4 = i7;
            }
            int i8 = this.currentSlotEnd;
            if (i8 >= i3) {
                this.currentSlotEnd = i8 + i;
            }
            this.slotsGapStart = i3 + i;
            this.slotsGapLen = i4 - i;
        }
    }

    public final boolean removeGroups(int i, int i2) {
        if (i2 > 0) {
            ArrayList<Anchor> arrayList = this.anchors;
            moveGroupGapTo(i);
            r0 = arrayList.isEmpty() ^ true ? removeAnchors(i, i2, this.sourceInformationMap) : false;
            this.groupGapStart = i;
            this.groupGapLen += i2;
            int i3 = this.slotsGapOwner;
            if (i3 > i) {
                this.slotsGapOwner = Math.max(i, i3 - i2);
            }
            int i4 = this.currentGroupEnd;
            if (i4 >= this.groupGapStart) {
                this.currentGroupEnd = i4 - i2;
            }
            int i5 = this.parent;
            if (containsGroupMark(i5)) {
                updateContainsMark(i5);
            }
        }
        return r0;
    }

    public final GroupSourceInformation sourceInformationOf(int i) {
        Anchor tryAnchor$runtime_release;
        HashMap<Anchor, GroupSourceInformation> hashMap = this.sourceInformationMap;
        if (hashMap == null || (tryAnchor$runtime_release = tryAnchor$runtime_release(i)) == null) {
            return null;
        }
        return hashMap.get(tryAnchor$runtime_release);
    }

    public final Anchor tryAnchor$runtime_release(int i) {
        Anchor find;
        if (i < 0 || i >= getSize$runtime_release()) {
            return null;
        }
        find = SlotTableKt.find(this.anchors, i, getSize$runtime_release());
        return find;
    }

    public final void removeSlots(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.slotsGapLen;
            int i5 = i + i2;
            moveSlotGapTo(i5, i3);
            this.slotsGapStart = i;
            this.slotsGapLen = i4 + i2;
            C8564dqg.d(this.slots, null, i, i5);
            int i6 = this.currentSlotEnd;
            if (i6 >= i) {
                this.currentSlotEnd = i6 - i2;
            }
        }
    }

    private final void updateNodeOfGroup(int i, Object obj) {
        boolean isNode;
        int groupIndexToAddress = groupIndexToAddress(i);
        int[] iArr = this.groups;
        if (groupIndexToAddress < iArr.length) {
            isNode = SlotTableKt.isNode(iArr, groupIndexToAddress);
            if (isNode) {
                this.slots[dataIndexToDataAddress(nodeIndex(this.groups, groupIndexToAddress))] = obj;
                return;
            }
        }
        ComposerKt.composeRuntimeError(("Updating the node of a group at " + i + " that was not created with as a node group").toString());
        throw new KotlinNothingValueException();
    }

    private final void updateAnchors(int i, int i2) {
        int locationOf;
        Anchor anchor;
        int location$runtime_release;
        int locationOf2;
        Anchor anchor2;
        int location$runtime_release2;
        int i3;
        int capacity = getCapacity() - this.groupGapLen;
        if (i < i2) {
            for (locationOf2 = SlotTableKt.locationOf(this.anchors, i, capacity); locationOf2 < this.anchors.size() && (location$runtime_release2 = (anchor2 = this.anchors.get(locationOf2)).getLocation$runtime_release()) < 0 && (i3 = location$runtime_release2 + capacity) < i2; locationOf2++) {
                anchor2.setLocation$runtime_release(i3);
            }
            return;
        }
        for (locationOf = SlotTableKt.locationOf(this.anchors, i2, capacity); locationOf < this.anchors.size() && (location$runtime_release = (anchor = this.anchors.get(locationOf)).getLocation$runtime_release()) >= 0; locationOf++) {
            anchor.setLocation$runtime_release(-(capacity - location$runtime_release));
        }
    }

    private final boolean removeAnchors(int i, int i2, HashMap<Anchor, GroupSourceInformation> hashMap) {
        int locationOf;
        int i3 = i2 + i;
        locationOf = SlotTableKt.locationOf(this.anchors, i3, getCapacity() - this.groupGapLen);
        if (locationOf >= this.anchors.size()) {
            locationOf--;
        }
        int i4 = locationOf + 1;
        int i5 = 0;
        while (locationOf >= 0) {
            Anchor anchor = this.anchors.get(locationOf);
            int anchorIndex = anchorIndex(anchor);
            if (anchorIndex < i) {
                break;
            }
            if (anchorIndex < i3) {
                anchor.setLocation$runtime_release(Integer.MIN_VALUE);
                if (hashMap != null) {
                    hashMap.remove(anchor);
                }
                if (i5 == 0) {
                    i5 = locationOf + 1;
                }
                i4 = locationOf;
            }
            locationOf--;
        }
        boolean z = i4 < i5;
        if (z) {
            this.anchors.subList(i4, i5).clear();
        }
        return z;
    }

    private final void moveAnchors(int i, int i2, int i3) {
        int locationOf;
        int locationOf2;
        Anchor anchor;
        int anchorIndex;
        int size$runtime_release = getSize$runtime_release();
        locationOf = SlotTableKt.locationOf(this.anchors, i, size$runtime_release);
        ArrayList arrayList = new ArrayList();
        if (locationOf >= 0) {
            while (locationOf < this.anchors.size() && (anchorIndex = anchorIndex((anchor = this.anchors.get(locationOf)))) >= i && anchorIndex < i3 + i) {
                arrayList.add(anchor);
                this.anchors.remove(locationOf);
            }
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Anchor anchor2 = (Anchor) arrayList.get(i4);
            int anchorIndex2 = anchorIndex(anchor2) + (i2 - i);
            if (anchorIndex2 >= this.groupGapStart) {
                anchor2.setLocation$runtime_release(-(size$runtime_release - anchorIndex2));
            } else {
                anchor2.setLocation$runtime_release(anchorIndex2);
            }
            locationOf2 = SlotTableKt.locationOf(this.anchors, anchorIndex2, size$runtime_release);
            this.anchors.add(locationOf2, anchor2);
        }
    }

    public final int getSize$runtime_release() {
        return getCapacity() - this.groupGapLen;
    }

    private final int getCapacity() {
        return this.groups.length / 5;
    }

    private final int parent(int[] iArr, int i) {
        int parentAnchor;
        parentAnchor = SlotTableKt.parentAnchor(iArr, groupIndexToAddress(i));
        return parentAnchorToIndex(parentAnchor);
    }

    public final int dataIndex(int i) {
        return dataIndex(this.groups, groupIndexToAddress(i));
    }

    public final int dataIndex(int[] iArr, int i) {
        int dataAnchor;
        if (i >= getCapacity()) {
            return this.slots.length - this.slotsGapLen;
        }
        dataAnchor = SlotTableKt.dataAnchor(iArr, i);
        return dataAnchorToDataIndex(dataAnchor, this.slotsGapLen, this.slots.length);
    }

    public final int slotIndex(int[] iArr, int i) {
        int slotAnchor;
        if (i >= getCapacity()) {
            return this.slots.length - this.slotsGapLen;
        }
        slotAnchor = SlotTableKt.slotAnchor(iArr, i);
        return dataAnchorToDataIndex(slotAnchor, this.slotsGapLen, this.slots.length);
    }

    private final void updateDataIndex(int[] iArr, int i, int i2) {
        SlotTableKt.updateDataAnchor(iArr, i, dataIndexToDataAnchor(i2, this.slotsGapStart, this.slotsGapLen, this.slots.length));
    }

    private final int nodeIndex(int[] iArr, int i) {
        return dataIndex(iArr, i);
    }

    private final int auxIndex(int[] iArr, int i) {
        int groupInfo;
        int countOneBits;
        int dataIndex = dataIndex(iArr, i);
        groupInfo = SlotTableKt.groupInfo(iArr, i);
        countOneBits = SlotTableKt.countOneBits(groupInfo >> 29);
        return dataIndex + countOneBits;
    }

    private final int parentIndexToAnchor(int i, int i2) {
        return i < i2 ? i : -((getSize$runtime_release() - i) + 2);
    }

    private final int parentAnchorToIndex(int i) {
        return i > -2 ? i : getSize$runtime_release() + i + 2;
    }
}
