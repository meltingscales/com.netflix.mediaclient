package androidx.compose.runtime.snapshots;

import kotlin.KotlinNothingValueException;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class ReadonlySnapshot extends Snapshot {
    private final drM<Object, dpR> readObserver;
    private int snapshots;

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public drM<Object, dpR> getReadObserver$runtime_release() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public drM<Object, dpR> getWriteObserver$runtime_release() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedActivated$runtime_release */
    public void mo1046nestedActivated$runtime_release(Snapshot snapshot) {
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
    }

    public ReadonlySnapshot(int i, SnapshotIdSet snapshotIdSet, drM<Object, dpR> drm) {
        super(i, snapshotIdSet, null);
        this.readObserver = drm;
        this.snapshots = 1;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(drM<Object, dpR> drm) {
        SnapshotKt.validateOpen(this);
        return new NestedReadonlySnapshot(getId(), getInvalid$runtime_release(), drm, this);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed$runtime_release()) {
            return;
        }
        mo1047nestedDeactivated$runtime_release(this);
        super.dispose();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedDeactivated$runtime_release */
    public void mo1047nestedDeactivated$runtime_release(Snapshot snapshot) {
        int i = this.snapshots - 1;
        this.snapshots = i;
        if (i == 0) {
            closeAndReleasePinning$runtime_release();
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: recordModified$runtime_release */
    public void mo1048recordModified$runtime_release(StateObject stateObject) {
        SnapshotKt.reportReadonlySnapshotWrite();
        throw new KotlinNothingValueException();
    }
}
