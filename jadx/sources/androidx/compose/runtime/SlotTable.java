package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import o.C8632dsu;
import o.dpR;
import o.dsK;

/* loaded from: classes.dex */
public final class SlotTable implements CompositionData, Iterable<CompositionGroup>, dsK {
    private int groupsSize;
    private int readers;
    private int slotsSize;
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;
    private int version;
    private boolean writer;
    private int[] groups = new int[0];
    private Object[] slots = new Object[0];
    private ArrayList<Anchor> anchors = new ArrayList<>();

    public final ArrayList<Anchor> getAnchors$runtime_release() {
        return this.anchors;
    }

    public final int[] getGroups() {
        return this.groups;
    }

    public final int getGroupsSize() {
        return this.groupsSize;
    }

    public final Object[] getSlots() {
        return this.slots;
    }

    public final int getSlotsSize() {
        return this.slotsSize;
    }

    public final HashMap<Anchor, GroupSourceInformation> getSourceInformationMap$runtime_release() {
        return this.sourceInformationMap;
    }

    public final int getVersion$runtime_release() {
        return this.version;
    }

    public final boolean getWriter$runtime_release() {
        return this.writer;
    }

    public boolean isEmpty() {
        return this.groupsSize == 0;
    }

    public final void setTo$runtime_release(int[] iArr, int i, Object[] objArr, int i2, ArrayList<Anchor> arrayList, HashMap<Anchor, GroupSourceInformation> hashMap) {
        this.groups = iArr;
        this.groupsSize = i;
        this.slots = objArr;
        this.slotsSize = i2;
        this.anchors = arrayList;
        this.sourceInformationMap = hashMap;
    }

    public final SlotReader openReader() {
        if (this.writer) {
            throw new IllegalStateException("Cannot read while a writer is pending".toString());
        }
        this.readers++;
        return new SlotReader(this);
    }

    public final SlotWriter openWriter() {
        if (!(!this.writer)) {
            ComposerKt.composeRuntimeError("Cannot start a writer when another writer is pending".toString());
            throw new KotlinNothingValueException();
        } else if (this.readers <= 0) {
            this.writer = true;
            this.version++;
            return new SlotWriter(this);
        } else {
            ComposerKt.composeRuntimeError("Cannot start a writer when a reader is pending".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final Anchor tryAnchor(int i) {
        int i2;
        if (!(!this.writer)) {
            ComposerKt.composeRuntimeError("use active SlotWriter to crate an anchor for location instead".toString());
            throw new KotlinNothingValueException();
        } else if (i < 0 || i >= (i2 = this.groupsSize)) {
            return null;
        } else {
            return SlotTableKt.access$find(this.anchors, i, i2);
        }
    }

    public final int anchorIndex(Anchor anchor) {
        if (!this.writer) {
            if (!anchor.getValid()) {
                throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
            }
            return anchor.getLocation$runtime_release();
        }
        ComposerKt.composeRuntimeError("Use active SlotWriter to determine anchor location instead".toString());
        throw new KotlinNothingValueException();
    }

    public final boolean ownsAnchor(Anchor anchor) {
        int access$search;
        return anchor.getValid() && (access$search = SlotTableKt.access$search(this.anchors, anchor.getLocation$runtime_release(), this.groupsSize)) >= 0 && C8632dsu.c(this.anchors.get(access$search), anchor);
    }

    public final boolean groupContainsAnchor(int i, Anchor anchor) {
        if (!(!this.writer)) {
            ComposerKt.composeRuntimeError("Writer is active".toString());
            throw new KotlinNothingValueException();
        } else if (i >= 0 && i < this.groupsSize) {
            if (ownsAnchor(anchor)) {
                int access$groupSize = SlotTableKt.access$groupSize(this.groups, i);
                int location$runtime_release = anchor.getLocation$runtime_release();
                if (i <= location$runtime_release && location$runtime_release < access$groupSize + i) {
                    return true;
                }
            }
            return false;
        } else {
            ComposerKt.composeRuntimeError("Invalid group index".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final void close$runtime_release(SlotReader slotReader, HashMap<Anchor, GroupSourceInformation> hashMap) {
        int i;
        if (slotReader.getTable$runtime_release() != this || (i = this.readers) <= 0) {
            ComposerKt.composeRuntimeError("Unexpected reader close()".toString());
            throw new KotlinNothingValueException();
        }
        this.readers = i - 1;
        if (hashMap != null) {
            synchronized (this) {
                HashMap<Anchor, GroupSourceInformation> hashMap2 = this.sourceInformationMap;
                if (hashMap2 != null) {
                    hashMap2.putAll(hashMap);
                } else {
                    this.sourceInformationMap = hashMap;
                }
                dpR dpr = dpR.c;
            }
        }
    }

    public final void close$runtime_release(SlotWriter slotWriter, int[] iArr, int i, Object[] objArr, int i2, ArrayList<Anchor> arrayList, HashMap<Anchor, GroupSourceInformation> hashMap) {
        if (slotWriter.getTable$runtime_release() != this || !this.writer) {
            throw new IllegalArgumentException("Unexpected writer close()".toString());
        }
        this.writer = false;
        setTo$runtime_release(iArr, i, objArr, i2, arrayList, hashMap);
    }

    public final boolean containsMark() {
        return this.groupsSize > 0 && SlotTableKt.access$containsMark(this.groups, 0);
    }

    public final GroupSourceInformation sourceInformationOf(int i) {
        Anchor tryAnchor;
        HashMap<Anchor, GroupSourceInformation> hashMap = this.sourceInformationMap;
        if (hashMap == null || (tryAnchor = tryAnchor(i)) == null) {
            return null;
        }
        return hashMap.get(tryAnchor);
    }

    public final Object slot$runtime_release(int i, int i2) {
        int access$slotAnchor = SlotTableKt.access$slotAnchor(this.groups, i);
        int i3 = i + 1;
        return (i2 < 0 || i2 >= (i3 < this.groupsSize ? SlotTableKt.access$dataAnchor(this.groups, i3) : this.slots.length) - access$slotAnchor) ? Composer.Companion.getEmpty() : this.slots[access$slotAnchor + i2];
    }

    @Override // java.lang.Iterable
    public Iterator<CompositionGroup> iterator() {
        return new GroupIterator(this, 0, this.groupsSize);
    }

    public final Anchor anchor(int i) {
        int i2;
        if (!(!this.writer)) {
            ComposerKt.composeRuntimeError("use active SlotWriter to create an anchor location instead".toString());
            throw new KotlinNothingValueException();
        } else if (i < 0 || i >= (i2 = this.groupsSize)) {
            throw new IllegalArgumentException("Parameter index is out of range".toString());
        } else {
            ArrayList<Anchor> arrayList = this.anchors;
            int access$search = SlotTableKt.access$search(arrayList, i, i2);
            if (access$search < 0) {
                Anchor anchor = new Anchor(i);
                arrayList.add(-(access$search + 1), anchor);
                return anchor;
            }
            return arrayList.get(access$search);
        }
    }
}
