package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Collection;
import java.util.Set;
import o.C8570dqm;
import o.C8627dsp;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes.dex */
public abstract class Snapshot {
    private boolean disposed;
    private int id;
    private SnapshotIdSet invalid;
    private int pinningTrackingHandle;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ Snapshot(int i, SnapshotIdSet snapshotIdSet, C8627dsp c8627dsp) {
        this(i, snapshotIdSet);
    }

    public final boolean getDisposed$runtime_release() {
        return this.disposed;
    }

    public int getId() {
        return this.id;
    }

    public SnapshotIdSet getInvalid$runtime_release() {
        return this.invalid;
    }

    public abstract drM<Object, dpR> getReadObserver$runtime_release();

    public abstract boolean getReadOnly();

    public int getWriteCount$runtime_release() {
        return 0;
    }

    public abstract drM<Object, dpR> getWriteObserver$runtime_release();

    /* renamed from: nestedActivated$runtime_release */
    public abstract void mo1046nestedActivated$runtime_release(Snapshot snapshot);

    /* renamed from: nestedDeactivated$runtime_release */
    public abstract void mo1047nestedDeactivated$runtime_release(Snapshot snapshot);

    public abstract void notifyObjectsInitialized$runtime_release();

    /* renamed from: recordModified$runtime_release */
    public abstract void mo1048recordModified$runtime_release(StateObject stateObject);

    public final void setDisposed$runtime_release(boolean z) {
        this.disposed = z;
    }

    public void setId$runtime_release(int i) {
        this.id = i;
    }

    public void setInvalid$runtime_release(SnapshotIdSet snapshotIdSet) {
        this.invalid = snapshotIdSet;
    }

    public abstract Snapshot takeNestedSnapshot(drM<Object, dpR> drm);

    public final int takeoverPinnedSnapshot$runtime_release() {
        int i = this.pinningTrackingHandle;
        this.pinningTrackingHandle = -1;
        return i;
    }

    private Snapshot(int i, SnapshotIdSet snapshotIdSet) {
        this.invalid = snapshotIdSet;
        this.id = i;
        this.pinningTrackingHandle = i != 0 ? SnapshotKt.trackPinning(i, getInvalid$runtime_release()) : -1;
    }

    public void setWriteCount$runtime_release(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot".toString());
    }

    public Snapshot makeCurrent() {
        Snapshot snapshot = (Snapshot) SnapshotKt.access$getThreadSnapshot$p().get();
        SnapshotKt.access$getThreadSnapshot$p().set(this);
        return snapshot;
    }

    public void restoreCurrent(Snapshot snapshot) {
        SnapshotKt.access$getThreadSnapshot$p().set(snapshot);
    }

    public void closeLocked$runtime_release() {
        SnapshotKt.access$setOpenSnapshots$p(SnapshotKt.access$getOpenSnapshots$p().clear(getId()));
    }

    public void releasePinnedSnapshotsForCloseLocked$runtime_release() {
        releasePinnedSnapshotLocked$runtime_release();
    }

    public final void validateNotDisposed$runtime_release() {
        if (!(!this.disposed)) {
            throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
        }
    }

    public final void releasePinnedSnapshotLocked$runtime_release() {
        int i = this.pinningTrackingHandle;
        if (i >= 0) {
            SnapshotKt.releasePinningLocked(i);
            this.pinningTrackingHandle = -1;
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final Snapshot getCurrent() {
            return SnapshotKt.currentSnapshot();
        }

        public final Snapshot takeSnapshot(drM<Object, dpR> drm) {
            return SnapshotKt.currentSnapshot().takeNestedSnapshot(drm);
        }

        public final MutableSnapshot takeMutableSnapshot(drM<Object, dpR> drm, drM<Object, dpR> drm2) {
            MutableSnapshot takeNestedMutableSnapshot;
            Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
            MutableSnapshot mutableSnapshot = currentSnapshot instanceof MutableSnapshot ? (MutableSnapshot) currentSnapshot : null;
            if (mutableSnapshot == null || (takeNestedMutableSnapshot = mutableSnapshot.takeNestedMutableSnapshot(drm, drm2)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
            }
            return takeNestedMutableSnapshot;
        }

        public final <T> T observe(drM<Object, dpR> drm, drM<Object, dpR> drm2, drO<? extends T> dro) {
            Snapshot transparentObserverMutableSnapshot;
            if (drm != null || drm2 != null) {
                Snapshot snapshot = (Snapshot) SnapshotKt.access$getThreadSnapshot$p().get();
                if (snapshot == null || (snapshot instanceof MutableSnapshot)) {
                    transparentObserverMutableSnapshot = new TransparentObserverMutableSnapshot(snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null, drm, drm2, true, false);
                } else if (drm == null) {
                    return dro.invoke();
                } else {
                    transparentObserverMutableSnapshot = snapshot.takeNestedSnapshot(drm);
                }
                try {
                    Snapshot makeCurrent = transparentObserverMutableSnapshot.makeCurrent();
                    T invoke = dro.invoke();
                    transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                    return invoke;
                } finally {
                    transparentObserverMutableSnapshot.dispose();
                }
            }
            return dro.invoke();
        }

        public final Snapshot createNonObservableSnapshot() {
            return SnapshotKt.createTransparentSnapshotWithNoParentReadObserver$default((Snapshot) SnapshotKt.access$getThreadSnapshot$p().get(), null, false, 6, null);
        }

        public final ObserverHandle registerApplyObserver(final drX<? super Set<? extends Object>, ? super Snapshot, dpR> drx) {
            SnapshotKt.access$advanceGlobalSnapshot(SnapshotKt.access$getEmptyLambda$p());
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.access$setApplyObservers$p(C8570dqm.c((Collection) SnapshotKt.access$getApplyObservers$p(), (Object) drx));
                dpR dpr = dpR.c;
            }
            return new ObserverHandle() { // from class: androidx.compose.runtime.snapshots.Snapshot$Companion$$ExternalSyntheticLambda0
                @Override // androidx.compose.runtime.snapshots.ObserverHandle
                public final void dispose() {
                    Snapshot.Companion.registerApplyObserver$lambda$6(drX.this);
                }
            };
        }

        public final void notifyObjectsInitialized() {
            SnapshotKt.currentSnapshot().notifyObjectsInitialized$runtime_release();
        }

        public final ObserverHandle registerGlobalWriteObserver(final drM<Object, dpR> drm) {
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.access$setGlobalWriteObservers$p(C8570dqm.c((Collection) SnapshotKt.access$getGlobalWriteObservers$p(), (Object) drm));
                dpR dpr = dpR.c;
            }
            SnapshotKt.access$advanceGlobalSnapshot();
            return new ObserverHandle() { // from class: androidx.compose.runtime.snapshots.Snapshot$Companion$$ExternalSyntheticLambda1
                @Override // androidx.compose.runtime.snapshots.ObserverHandle
                public final void dispose() {
                    Snapshot.Companion.registerGlobalWriteObserver$lambda$9(drM.this);
                }
            };
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
            if (r1.isNotEmpty() == true) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void sendApplyNotifications() {
            /*
                r3 = this;
                java.lang.Object r0 = androidx.compose.runtime.snapshots.SnapshotKt.getLock()
                monitor-enter(r0)
                java.util.concurrent.atomic.AtomicReference r1 = androidx.compose.runtime.snapshots.SnapshotKt.access$getCurrentGlobalSnapshot$p()     // Catch: java.lang.Throwable -> L25
                java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L25
                androidx.compose.runtime.snapshots.GlobalSnapshot r1 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r1     // Catch: java.lang.Throwable -> L25
                androidx.compose.runtime.collection.IdentityArraySet r1 = r1.getModified$runtime_release()     // Catch: java.lang.Throwable -> L25
                if (r1 == 0) goto L1d
                boolean r1 = r1.isNotEmpty()     // Catch: java.lang.Throwable -> L25
                r2 = 1
                if (r1 != r2) goto L1d
                goto L1e
            L1d:
                r2 = 0
            L1e:
                monitor-exit(r0)
                if (r2 == 0) goto L24
                androidx.compose.runtime.snapshots.SnapshotKt.access$advanceGlobalSnapshot()
            L24:
                return
            L25:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.Snapshot.Companion.sendApplyNotifications():void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void registerApplyObserver$lambda$6(drX drx) {
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.access$setApplyObservers$p(C8570dqm.d((Iterable) SnapshotKt.access$getApplyObservers$p(), (Object) drx));
                dpR dpr = dpR.c;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void registerGlobalWriteObserver$lambda$9(drM drm) {
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.access$setGlobalWriteObservers$p(C8570dqm.d((Iterable) SnapshotKt.access$getGlobalWriteObservers$p(), (Object) drm));
                dpR dpr = dpR.c;
            }
            SnapshotKt.access$advanceGlobalSnapshot();
        }
    }

    public void dispose() {
        this.disposed = true;
        synchronized (SnapshotKt.getLock()) {
            releasePinnedSnapshotLocked$runtime_release();
            dpR dpr = dpR.c;
        }
    }

    public final void closeAndReleasePinning$runtime_release() {
        synchronized (SnapshotKt.getLock()) {
            closeLocked$runtime_release();
            releasePinnedSnapshotsForCloseLocked$runtime_release();
            dpR dpr = dpR.c;
        }
    }
}
