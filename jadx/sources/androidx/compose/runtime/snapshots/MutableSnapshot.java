package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.collection.IdentityArraySet;
import java.util.List;
import o.C8564dqg;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public class MutableSnapshot extends Snapshot {
    private boolean applied;
    private List<? extends StateObject> merged;
    private IdentityArraySet<StateObject> modified;
    private SnapshotIdSet previousIds;
    private int[] previousPinnedSnapshots;
    private final drM<Object, dpR> readObserver;
    private int snapshots;
    private int writeCount;
    private final drM<Object, dpR> writeObserver;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int[] EmptyIntArray = new int[0];

    public final boolean getApplied$runtime_release() {
        return this.applied;
    }

    public IdentityArraySet<StateObject> getModified$runtime_release() {
        return this.modified;
    }

    public final SnapshotIdSet getPreviousIds$runtime_release() {
        return this.previousIds;
    }

    public final int[] getPreviousPinnedSnapshots$runtime_release() {
        return this.previousPinnedSnapshots;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public drM<Object, dpR> getReadObserver$runtime_release() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public int getWriteCount$runtime_release() {
        return this.writeCount;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public drM<Object, dpR> getWriteObserver$runtime_release() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedActivated$runtime_release */
    public void mo1046nestedActivated$runtime_release(Snapshot snapshot) {
        this.snapshots++;
    }

    public final void setApplied$runtime_release(boolean z) {
        this.applied = z;
    }

    public void setModified(IdentityArraySet<StateObject> identityArraySet) {
        this.modified = identityArraySet;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setWriteCount$runtime_release(int i) {
        this.writeCount = i;
    }

    public MutableSnapshot(int i, SnapshotIdSet snapshotIdSet, drM<Object, dpR> drm, drM<Object, dpR> drm2) {
        super(i, snapshotIdSet, null);
        this.readObserver = drm;
        this.writeObserver = drm2;
        this.previousIds = SnapshotIdSet.Companion.getEMPTY();
        this.previousPinnedSnapshots = EmptyIntArray;
        this.snapshots = 1;
    }

    public MutableSnapshot takeNestedMutableSnapshot(drM<Object, dpR> drm, drM<Object, dpR> drm2) {
        int i;
        SnapshotIdSet snapshotIdSet;
        drM mergedWriteObserver;
        NestedMutableSnapshot nestedMutableSnapshot;
        int i2;
        SnapshotIdSet snapshotIdSet2;
        validateNotDisposed$runtime_release();
        validateNotAppliedOrPinned();
        recordPrevious$runtime_release(getId());
        synchronized (SnapshotKt.getLock()) {
            i = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = i + 1;
            snapshotIdSet = SnapshotKt.openSnapshots;
            SnapshotKt.openSnapshots = snapshotIdSet.set(i);
            SnapshotIdSet invalid$runtime_release = getInvalid$runtime_release();
            setInvalid$runtime_release(invalid$runtime_release.set(i));
            SnapshotIdSet addRange = SnapshotKt.addRange(invalid$runtime_release, getId() + 1, i);
            drM mergedReadObserver$default = SnapshotKt.mergedReadObserver$default(drm, getReadObserver$runtime_release(), false, 4, null);
            mergedWriteObserver = SnapshotKt.mergedWriteObserver(drm2, getWriteObserver$runtime_release());
            nestedMutableSnapshot = new NestedMutableSnapshot(i, addRange, mergedReadObserver$default, mergedWriteObserver, this);
        }
        if (!getApplied$runtime_release() && !getDisposed$runtime_release()) {
            int id = getId();
            synchronized (SnapshotKt.getLock()) {
                i2 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId = i2 + 1;
                setId$runtime_release(i2);
                snapshotIdSet2 = SnapshotKt.openSnapshots;
                SnapshotKt.openSnapshots = snapshotIdSet2.set(getId());
                dpR dpr = dpR.c;
            }
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), id + 1, getId()));
        }
        return nestedMutableSnapshot;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4 A[LOOP:0: B:33:0x00c2->B:34:0x00c4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0 A[LOOP:1: B:40:0x00de->B:41:0x00e0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.compose.runtime.snapshots.SnapshotApplyResult apply() {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.MutableSnapshot.apply():androidx.compose.runtime.snapshots.SnapshotApplyResult");
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed$runtime_release()) {
            return;
        }
        super.dispose();
        mo1047nestedDeactivated$runtime_release(this);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(drM<Object, dpR> drm) {
        int i;
        SnapshotIdSet snapshotIdSet;
        NestedReadonlySnapshot nestedReadonlySnapshot;
        int i2;
        SnapshotIdSet snapshotIdSet2;
        validateNotDisposed$runtime_release();
        validateNotAppliedOrPinned();
        int id = getId();
        recordPrevious$runtime_release(getId());
        synchronized (SnapshotKt.getLock()) {
            i = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = i + 1;
            snapshotIdSet = SnapshotKt.openSnapshots;
            SnapshotKt.openSnapshots = snapshotIdSet.set(i);
            nestedReadonlySnapshot = new NestedReadonlySnapshot(i, SnapshotKt.addRange(getInvalid$runtime_release(), id + 1, i), drm, this);
        }
        if (!getApplied$runtime_release() && !getDisposed$runtime_release()) {
            int id2 = getId();
            synchronized (SnapshotKt.getLock()) {
                i2 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId = i2 + 1;
                setId$runtime_release(i2);
                snapshotIdSet2 = SnapshotKt.openSnapshots;
                SnapshotKt.openSnapshots = snapshotIdSet2.set(getId());
                dpR dpr = dpR.c;
            }
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), id2 + 1, getId()));
        }
        return nestedReadonlySnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedDeactivated$runtime_release */
    public void mo1047nestedDeactivated$runtime_release(Snapshot snapshot) {
        int i = this.snapshots;
        if (i <= 0) {
            throw new IllegalArgumentException("no pending nested snapshots".toString());
        }
        int i2 = i - 1;
        this.snapshots = i2;
        if (i2 != 0 || this.applied) {
            return;
        }
        abandon();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        if (this.applied || getDisposed$runtime_release()) {
            return;
        }
        advance$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void closeLocked$runtime_release() {
        SnapshotIdSet snapshotIdSet;
        snapshotIdSet = SnapshotKt.openSnapshots;
        SnapshotKt.openSnapshots = snapshotIdSet.clear(getId()).andNot(this.previousIds);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void releasePinnedSnapshotsForCloseLocked$runtime_release() {
        releasePreviouslyPinnedSnapshotsLocked();
        super.releasePinnedSnapshotsForCloseLocked$runtime_release();
    }

    private final void validateNotApplied() {
        if (!(!this.applied)) {
            throw new IllegalStateException("Unsupported operation on a snapshot that has been applied".toString());
        }
    }

    private final void abandon() {
        boolean b;
        IdentityArraySet<StateObject> modified$runtime_release = getModified$runtime_release();
        if (modified$runtime_release != null) {
            validateNotApplied();
            setModified(null);
            int id = getId();
            Object[] values = modified$runtime_release.getValues();
            int size = modified$runtime_release.size();
            for (int i = 0; i < size; i++) {
                Object obj = values[i];
                C8632dsu.d(obj);
                for (StateRecord firstStateRecord = ((StateObject) obj).getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext$runtime_release()) {
                    if (firstStateRecord.getSnapshotId$runtime_release() != id) {
                        b = C8576dqs.b(this.previousIds, Integer.valueOf(firstStateRecord.getSnapshotId$runtime_release()));
                        if (!b) {
                        }
                    }
                    firstStateRecord.setSnapshotId$runtime_release(0);
                }
            }
        }
        closeAndReleasePinning$runtime_release();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0040, code lost:
        r15 = androidx.compose.runtime.snapshots.SnapshotKt.readable(r11, getId(), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.runtime.snapshots.SnapshotApplyResult innerApplyLocked$runtime_release(int r19, java.util.Map<androidx.compose.runtime.snapshots.StateRecord, ? extends androidx.compose.runtime.snapshots.StateRecord> r20, androidx.compose.runtime.snapshots.SnapshotIdSet r21) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.MutableSnapshot.innerApplyLocked$runtime_release(int, java.util.Map, androidx.compose.runtime.snapshots.SnapshotIdSet):androidx.compose.runtime.snapshots.SnapshotApplyResult");
    }

    public final void recordPreviousPinnedSnapshot$runtime_release(int i) {
        int[] c;
        if (i >= 0) {
            c = C8564dqg.c(this.previousPinnedSnapshots, i);
            this.previousPinnedSnapshots = c;
        }
    }

    public final void recordPreviousPinnedSnapshots$runtime_release(int[] iArr) {
        if (iArr.length == 0) {
            return;
        }
        int[] iArr2 = this.previousPinnedSnapshots;
        if (iArr2.length != 0) {
            iArr = C8564dqg.a(iArr2, iArr);
        }
        this.previousPinnedSnapshots = iArr;
    }

    private final void releasePreviouslyPinnedSnapshotsLocked() {
        int length = this.previousPinnedSnapshots.length;
        for (int i = 0; i < length; i++) {
            SnapshotKt.releasePinningLocked(this.previousPinnedSnapshots[i]);
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: recordModified$runtime_release */
    public void mo1048recordModified$runtime_release(StateObject stateObject) {
        IdentityArraySet<StateObject> modified$runtime_release = getModified$runtime_release();
        if (modified$runtime_release == null) {
            modified$runtime_release = new IdentityArraySet<>();
            setModified(modified$runtime_release);
        }
        modified$runtime_release.add(stateObject);
    }

    /* loaded from: classes.dex */
    static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    private final void validateNotAppliedOrPinned() {
        int i;
        if (this.applied) {
            i = ((Snapshot) this).pinningTrackingHandle;
            if (i < 0) {
                throw new IllegalStateException("Unsupported operation on a disposed or applied snapshot".toString());
            }
        }
    }

    public final void advance$runtime_release() {
        int i;
        SnapshotIdSet snapshotIdSet;
        recordPrevious$runtime_release(getId());
        dpR dpr = dpR.c;
        if (getApplied$runtime_release() || getDisposed$runtime_release()) {
            return;
        }
        int id = getId();
        synchronized (SnapshotKt.getLock()) {
            i = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = i + 1;
            setId$runtime_release(i);
            snapshotIdSet = SnapshotKt.openSnapshots;
            SnapshotKt.openSnapshots = snapshotIdSet.set(getId());
        }
        setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), id + 1, getId()));
    }

    public final void recordPrevious$runtime_release(int i) {
        synchronized (SnapshotKt.getLock()) {
            this.previousIds = this.previousIds.set(i);
            dpR dpr = dpR.c;
        }
    }

    public final void recordPreviousList$runtime_release(SnapshotIdSet snapshotIdSet) {
        synchronized (SnapshotKt.getLock()) {
            this.previousIds = this.previousIds.or(snapshotIdSet);
            dpR dpr = dpR.c;
        }
    }
}
