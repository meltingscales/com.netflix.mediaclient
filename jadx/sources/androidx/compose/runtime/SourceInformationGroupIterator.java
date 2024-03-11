package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import o.dsK;

/* loaded from: classes.dex */
final class SourceInformationGroupIterator implements Iterator<CompositionGroup>, dsK {
    private final GroupSourceInformation group;
    private int index;
    private final SlotTable table;
    private final int version;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public SourceInformationGroupIterator(SlotTable slotTable, GroupSourceInformation groupSourceInformation) {
        this.table = slotTable;
        this.group = groupSourceInformation;
        this.version = slotTable.getVersion$runtime_release();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        ArrayList<Object> groups = this.group.getGroups();
        return groups != null && this.index < groups.size();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public CompositionGroup next() {
        Object obj;
        ArrayList<Object> groups = this.group.getGroups();
        if (groups != null) {
            int i = this.index;
            this.index = i + 1;
            obj = groups.get(i);
        } else {
            obj = null;
        }
        if (obj instanceof Anchor) {
            return new SlotTableGroup(this.table, ((Anchor) obj).getLocation$runtime_release(), this.version);
        }
        if (obj instanceof GroupSourceInformation) {
            return new SourceInformationSlotTableGroup(this.table, (GroupSourceInformation) obj);
        }
        ComposerKt.composeRuntimeError("Unexpected group information structure");
        throw new KotlinNothingValueException();
    }
}
