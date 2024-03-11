package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import o.C8632dsu;
import o.dpR;

/* loaded from: classes.dex */
public class SnapshotMutableStateImpl<T> extends StateObjectImpl implements SnapshotMutableState<T> {
    private StateStateRecord<T> next;
    private final SnapshotMutationPolicy<T> policy;

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.next;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    public SnapshotMutationPolicy<T> getPolicy() {
        return this.policy;
    }

    public SnapshotMutableStateImpl(T t, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        this.policy = snapshotMutationPolicy;
        this.next = new StateStateRecord<>(t);
    }

    @Override // androidx.compose.runtime.MutableState, androidx.compose.runtime.State
    public T getValue() {
        return (T) ((StateStateRecord) SnapshotKt.readable(this.next, this)).getValue();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord) {
        C8632dsu.d(stateRecord);
        this.next = (StateStateRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        C8632dsu.d(stateRecord);
        StateStateRecord stateStateRecord = (StateStateRecord) stateRecord;
        C8632dsu.d(stateRecord2);
        StateStateRecord stateStateRecord2 = (StateStateRecord) stateRecord2;
        C8632dsu.d(stateRecord3);
        StateStateRecord stateStateRecord3 = (StateStateRecord) stateRecord3;
        if (getPolicy().equivalent((T) stateStateRecord2.getValue(), (T) stateStateRecord3.getValue())) {
            return stateRecord2;
        }
        T merge = getPolicy().merge((T) stateStateRecord.getValue(), (T) stateStateRecord2.getValue(), (T) stateStateRecord3.getValue());
        if (merge != null) {
            StateRecord create = stateStateRecord3.create();
            C8632dsu.d(create);
            ((StateStateRecord) create).setValue(merge);
            return create;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class StateStateRecord<T> extends StateRecord {
        private T value;

        public final T getValue() {
            return this.value;
        }

        public final void setValue(T t) {
            this.value = t;
        }

        public StateStateRecord(T t) {
            this.value = t;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord stateRecord) {
            C8632dsu.d(stateRecord);
            this.value = ((StateStateRecord) stateRecord).value;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return new StateStateRecord(this.value);
        }
    }

    @Override // androidx.compose.runtime.MutableState
    public T component1() {
        return getValue();
    }

    @Override // androidx.compose.runtime.MutableState
    public void setValue(T t) {
        Snapshot current;
        StateStateRecord stateStateRecord = (StateStateRecord) SnapshotKt.current(this.next);
        if (getPolicy().equivalent((T) stateStateRecord.getValue(), t)) {
            return;
        }
        StateStateRecord<T> stateStateRecord2 = this.next;
        SnapshotKt.getSnapshotInitializer();
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.Companion.getCurrent();
            ((StateStateRecord) SnapshotKt.overwritableRecord(stateStateRecord2, this, current, stateStateRecord)).setValue(t);
            dpR dpr = dpR.c;
        }
        SnapshotKt.notifyWrite(current, this);
    }

    public String toString() {
        return "MutableState(value=" + ((StateStateRecord) SnapshotKt.current(this.next)).getValue() + ")@" + hashCode();
    }
}
