package androidx.compose.runtime;

import java.util.ArrayList;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class GroupSourceInformation {
    private boolean closed;
    private ArrayList<Object> groups;
    private final int key;

    public final ArrayList<Object> getGroups() {
        return this.groups;
    }

    public final int getKey() {
        return this.key;
    }

    public final void reportGroup(SlotWriter slotWriter, int i) {
        openInformation().add(slotWriter.anchor(i));
    }

    public final void reportGroup(SlotTable slotTable, int i) {
        openInformation().add(slotTable.anchor(i));
    }

    public final void addGroupAfter(SlotWriter slotWriter, int i, int i2) {
        Anchor tryAnchor$runtime_release;
        ArrayList<Object> arrayList = this.groups;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.groups = arrayList;
        }
        int i3 = 0;
        if (i >= 0 && (tryAnchor$runtime_release = slotWriter.tryAnchor$runtime_release(i)) != null) {
            int size = arrayList.size();
            while (true) {
                if (i3 >= size) {
                    i3 = -1;
                    break;
                }
                Object obj = arrayList.get(i3);
                if (C8632dsu.c(obj, tryAnchor$runtime_release) || ((obj instanceof GroupSourceInformation) && ((GroupSourceInformation) obj).hasAnchor(tryAnchor$runtime_release))) {
                    break;
                }
                i3++;
            }
        }
        arrayList.add(i3, slotWriter.anchor(i2));
    }

    private final void add(Object obj) {
        ArrayList<Object> arrayList = this.groups;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.groups = arrayList;
        arrayList.add(obj);
    }

    public final boolean removeAnchor(Anchor anchor) {
        ArrayList<Object> arrayList = this.groups;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = arrayList.get(size);
                if (obj instanceof Anchor) {
                    if (C8632dsu.c(obj, anchor)) {
                        arrayList.remove(size);
                    }
                } else if ((obj instanceof GroupSourceInformation) && !((GroupSourceInformation) obj).removeAnchor(anchor)) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.isEmpty()) {
                this.groups = null;
                return false;
            }
        }
        return true;
    }

    private final GroupSourceInformation openInformation() {
        Object obj;
        GroupSourceInformation openInformation;
        ArrayList<Object> arrayList = this.groups;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                obj = arrayList.get(size);
                if ((obj instanceof GroupSourceInformation) && !((GroupSourceInformation) obj).closed) {
                    break;
                }
            }
        }
        obj = null;
        GroupSourceInformation groupSourceInformation = obj instanceof GroupSourceInformation ? (GroupSourceInformation) obj : null;
        return (groupSourceInformation == null || (openInformation = groupSourceInformation.openInformation()) == null) ? this : openInformation;
    }

    private final boolean hasAnchor(Anchor anchor) {
        ArrayList<Object> arrayList = this.groups;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj = arrayList.get(i);
                if (C8632dsu.c(obj, anchor) || ((obj instanceof GroupSourceInformation) && ((GroupSourceInformation) obj).hasAnchor(anchor))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
