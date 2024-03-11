package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import o.dsK;

/* loaded from: classes.dex */
final class GroupIterator implements Iterator<CompositionGroup>, dsK {
    private final int end;
    private int index;
    private final SlotTable table;
    private final int version;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.end;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public GroupIterator(SlotTable slotTable, int i, int i2) {
        this.table = slotTable;
        this.end = i2;
        this.index = i;
        this.version = slotTable.getVersion$runtime_release();
        if (slotTable.getWriter$runtime_release()) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public CompositionGroup next() {
        int groupSize;
        validateRead();
        int i = this.index;
        groupSize = SlotTableKt.groupSize(this.table.getGroups(), i);
        this.index = groupSize + i;
        return new SlotTableGroup(this.table, i, this.version);
    }

    private final void validateRead() {
        if (this.table.getVersion$runtime_release() != this.version) {
            throw new ConcurrentModificationException();
        }
    }
}
