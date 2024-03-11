package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.Iterator;
import java.util.List;
import o.C8569dql;
import o.dsK;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SourceInformationSlotTableGroup implements CompositionGroup, Iterable<CompositionGroup>, dsK {
    private final Iterable<CompositionGroup> compositionGroups;
    private final Iterable<Object> data;
    private final Object key;
    private final GroupSourceInformation sourceInformation;
    private final SlotTable table;

    public SourceInformationSlotTableGroup(SlotTable slotTable, GroupSourceInformation groupSourceInformation) {
        List i;
        this.table = slotTable;
        this.sourceInformation = groupSourceInformation;
        this.key = Integer.valueOf(groupSourceInformation.getKey());
        i = C8569dql.i();
        this.data = i;
        this.compositionGroups = this;
    }

    @Override // java.lang.Iterable
    public Iterator<CompositionGroup> iterator() {
        return new SourceInformationGroupIterator(this.table, this.sourceInformation);
    }
}
