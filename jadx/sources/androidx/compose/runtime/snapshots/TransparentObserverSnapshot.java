package androidx.compose.runtime.snapshots;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class TransparentObserverSnapshot extends Snapshot {
    private final boolean mergeParentObservers;
    private final boolean ownsPreviousSnapshot;
    private final Snapshot previousSnapshot;
    private final drM<Object, dpR> readObserver;
    private final Snapshot root;
    private final drM<Object, dpR> writeObserver;

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public drM<Object, dpR> getReadObserver$runtime_release() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public drM<Object, dpR> getWriteObserver$runtime_release() {
        return this.writeObserver;
    }

    public TransparentObserverSnapshot(Snapshot snapshot, drM<Object, dpR> drm, boolean z, boolean z2) {
        super(0, SnapshotIdSet.Companion.getEMPTY(), null);
        AtomicReference atomicReference;
        drM<Object, dpR> readObserver$runtime_release;
        drM<Object, dpR> mergedReadObserver;
        this.previousSnapshot = snapshot;
        this.mergeParentObservers = z;
        this.ownsPreviousSnapshot = z2;
        if (snapshot == null || (readObserver$runtime_release = snapshot.getReadObserver$runtime_release()) == null) {
            atomicReference = SnapshotKt.currentGlobalSnapshot;
            readObserver$runtime_release = ((GlobalSnapshot) atomicReference.get()).getReadObserver$runtime_release();
        }
        mergedReadObserver = SnapshotKt.mergedReadObserver(drm, readObserver$runtime_release, z);
        this.readObserver = mergedReadObserver;
        this.root = this;
    }

    private final Snapshot getCurrentSnapshot() {
        AtomicReference atomicReference;
        Snapshot snapshot = this.previousSnapshot;
        if (snapshot == null) {
            atomicReference = SnapshotKt.currentGlobalSnapshot;
            return (Snapshot) atomicReference.get();
        }
        return snapshot;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        Snapshot snapshot;
        setDisposed$runtime_release(true);
        if (!this.ownsPreviousSnapshot || (snapshot = this.previousSnapshot) == null) {
            return;
        }
        snapshot.dispose();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public int getId() {
        return getCurrentSnapshot().getId();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setId$runtime_release(int i) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public SnapshotIdSet getInvalid$runtime_release() {
        return getCurrentSnapshot().getInvalid$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setInvalid$runtime_release(SnapshotIdSet snapshotIdSet) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return getCurrentSnapshot().getReadOnly();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: recordModified$runtime_release */
    public void mo1048recordModified$runtime_release(StateObject stateObject) {
        getCurrentSnapshot().mo1048recordModified$runtime_release(stateObject);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(drM<Object, dpR> drm) {
        Snapshot createTransparentSnapshotWithNoParentReadObserver;
        drM<Object, dpR> mergedReadObserver$default = SnapshotKt.mergedReadObserver$default(drm, getReadObserver$runtime_release(), false, 4, null);
        if (!this.mergeParentObservers) {
            createTransparentSnapshotWithNoParentReadObserver = SnapshotKt.createTransparentSnapshotWithNoParentReadObserver(getCurrentSnapshot().takeNestedSnapshot(null), mergedReadObserver$default, true);
            return createTransparentSnapshotWithNoParentReadObserver;
        }
        return getCurrentSnapshot().takeNestedSnapshot(mergedReadObserver$default);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        getCurrentSnapshot().notifyObjectsInitialized$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedActivated$runtime_release */
    public Void mo1046nestedActivated$runtime_release(Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedDeactivated$runtime_release */
    public Void mo1047nestedDeactivated$runtime_release(Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }
}
