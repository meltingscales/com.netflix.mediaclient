package androidx.compose.runtime.snapshots;

import kotlin.KotlinNothingValueException;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class NestedReadonlySnapshot extends Snapshot {
    private final Snapshot parent;
    private final drM<Object, dpR> readObserver;

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
    public void notifyObjectsInitialized$runtime_release() {
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public /* bridge */ /* synthetic */ Snapshot takeNestedSnapshot(drM drm) {
        return takeNestedSnapshot((drM<Object, dpR>) drm);
    }

    public NestedReadonlySnapshot(int i, SnapshotIdSet snapshotIdSet, final drM<Object, dpR> drm, Snapshot snapshot) {
        super(i, snapshotIdSet, null);
        this.parent = snapshot;
        snapshot.mo1046nestedActivated$runtime_release(this);
        if (drm != null) {
            final drM<Object, dpR> readObserver$runtime_release = snapshot.getReadObserver$runtime_release();
            if (readObserver$runtime_release != null) {
                drm = new drM<Object, dpR>() { // from class: androidx.compose.runtime.snapshots.NestedReadonlySnapshot$readObserver$1$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* bridge */ /* synthetic */ dpR invoke(Object obj) {
                        invoke2(obj);
                        return dpR.c;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(Object obj) {
                        drm.invoke(obj);
                        readObserver$runtime_release.invoke(obj);
                    }
                };
            }
        } else {
            drm = snapshot.getReadObserver$runtime_release();
        }
        this.readObserver = drm;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public NestedReadonlySnapshot takeNestedSnapshot(drM<Object, dpR> drm) {
        return new NestedReadonlySnapshot(getId(), getInvalid$runtime_release(), drm, this.parent);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed$runtime_release()) {
            return;
        }
        if (getId() != this.parent.getId()) {
            closeAndReleasePinning$runtime_release();
        }
        this.parent.mo1047nestedDeactivated$runtime_release(this);
        super.dispose();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: recordModified$runtime_release */
    public Void mo1048recordModified$runtime_release(StateObject stateObject) {
        SnapshotKt.reportReadonlySnapshotWrite();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedDeactivated$runtime_release */
    public Void mo1047nestedDeactivated$runtime_release(Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedActivated$runtime_release */
    public Void mo1046nestedActivated$runtime_release(Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }
}
