package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import o.C8632dsu;
import o.dpR;

/* loaded from: classes.dex */
public class SnapshotMutableIntStateImpl extends StateObjectImpl implements MutableIntState, SnapshotMutableState<Integer> {
    private IntStateStateRecord next;

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.next;
    }

    public SnapshotMutableIntStateImpl(int i) {
        this.next = new IntStateStateRecord(i);
    }

    @Override // androidx.compose.runtime.MutableIntState, androidx.compose.runtime.IntState
    public int getIntValue() {
        return ((IntStateStateRecord) SnapshotKt.readable(this.next, this)).getValue();
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    public SnapshotMutationPolicy<Integer> getPolicy() {
        return SnapshotStateKt.structuralEqualityPolicy();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.MutableState
    public Integer component1() {
        return Integer.valueOf(getIntValue());
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord) {
        C8632dsu.d(stateRecord);
        this.next = (IntStateStateRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        C8632dsu.d(stateRecord2);
        C8632dsu.d(stateRecord3);
        if (((IntStateStateRecord) stateRecord2).getValue() == ((IntStateStateRecord) stateRecord3).getValue()) {
            return stateRecord2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class IntStateStateRecord extends StateRecord {
        private int value;

        public final int getValue() {
            return this.value;
        }

        public final void setValue(int i) {
            this.value = i;
        }

        public IntStateStateRecord(int i) {
            this.value = i;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord stateRecord) {
            C8632dsu.d(stateRecord);
            this.value = ((IntStateStateRecord) stateRecord).value;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return new IntStateStateRecord(this.value);
        }
    }

    @Override // androidx.compose.runtime.MutableIntState
    public void setIntValue(int i) {
        Snapshot current;
        IntStateStateRecord intStateStateRecord = (IntStateStateRecord) SnapshotKt.current(this.next);
        if (intStateStateRecord.getValue() != i) {
            IntStateStateRecord intStateStateRecord2 = this.next;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                ((IntStateStateRecord) SnapshotKt.overwritableRecord(intStateStateRecord2, this, current, intStateStateRecord)).setValue(i);
                dpR dpr = dpR.c;
            }
            SnapshotKt.notifyWrite(current, this);
        }
    }

    public String toString() {
        return "MutableIntState(value=" + ((IntStateStateRecord) SnapshotKt.current(this.next)).getValue() + ")@" + hashCode();
    }
}
