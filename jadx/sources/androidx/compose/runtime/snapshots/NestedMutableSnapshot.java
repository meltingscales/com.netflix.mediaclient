package androidx.compose.runtime.snapshots;

import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class NestedMutableSnapshot extends MutableSnapshot {
    private boolean deactivated;
    private final MutableSnapshot parent;

    public NestedMutableSnapshot(int i, SnapshotIdSet snapshotIdSet, drM<Object, dpR> drm, drM<Object, dpR> drm2, MutableSnapshot mutableSnapshot) {
        super(i, snapshotIdSet, drm, drm2);
        this.parent = mutableSnapshot;
        mutableSnapshot.mo1046nestedActivated$runtime_release(this);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed$runtime_release()) {
            return;
        }
        super.dispose();
        deactivate();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0074 A[Catch: all -> 0x00bb, TryCatch #0 {, blocks: (B:13:0x002e, B:15:0x0033, B:18:0x003a, B:22:0x0054, B:24:0x005c, B:27:0x006c, B:29:0x0074, B:30:0x0079, B:25:0x0060, B:26:0x0069), top: B:39:0x002e }] */
    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.compose.runtime.snapshots.SnapshotApplyResult apply() {
        /*
            r7 = this;
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r7.parent
            boolean r0 = r0.getApplied$runtime_release()
            if (r0 != 0) goto Lbe
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r7.parent
            boolean r0 = r0.getDisposed$runtime_release()
            if (r0 == 0) goto L12
            goto Lbe
        L12:
            androidx.compose.runtime.collection.IdentityArraySet r0 = r7.getModified$runtime_release()
            int r1 = r7.getId()
            r2 = 0
            if (r0 == 0) goto L28
            androidx.compose.runtime.snapshots.MutableSnapshot r3 = r7.parent
            androidx.compose.runtime.snapshots.SnapshotIdSet r4 = r3.getInvalid$runtime_release()
            java.util.Map r3 = androidx.compose.runtime.snapshots.SnapshotKt.access$optimisticMerges(r3, r7, r4)
            goto L29
        L28:
            r3 = r2
        L29:
            java.lang.Object r4 = androidx.compose.runtime.snapshots.SnapshotKt.getLock()
            monitor-enter(r4)
            androidx.compose.runtime.snapshots.SnapshotKt.access$validateOpen(r7)     // Catch: java.lang.Throwable -> Lbb
            if (r0 == 0) goto L69
            int r5 = r0.size()     // Catch: java.lang.Throwable -> Lbb
            if (r5 != 0) goto L3a
            goto L69
        L3a:
            androidx.compose.runtime.snapshots.MutableSnapshot r5 = r7.parent     // Catch: java.lang.Throwable -> Lbb
            int r5 = r5.getId()     // Catch: java.lang.Throwable -> Lbb
            androidx.compose.runtime.snapshots.MutableSnapshot r6 = r7.parent     // Catch: java.lang.Throwable -> Lbb
            androidx.compose.runtime.snapshots.SnapshotIdSet r6 = r6.getInvalid$runtime_release()     // Catch: java.lang.Throwable -> Lbb
            androidx.compose.runtime.snapshots.SnapshotApplyResult r3 = r7.innerApplyLocked$runtime_release(r5, r3, r6)     // Catch: java.lang.Throwable -> Lbb
            androidx.compose.runtime.snapshots.SnapshotApplyResult$Success r5 = androidx.compose.runtime.snapshots.SnapshotApplyResult.Success.INSTANCE     // Catch: java.lang.Throwable -> Lbb
            boolean r5 = o.C8632dsu.c(r3, r5)     // Catch: java.lang.Throwable -> Lbb
            if (r5 != 0) goto L54
            monitor-exit(r4)
            return r3
        L54:
            androidx.compose.runtime.snapshots.MutableSnapshot r3 = r7.parent     // Catch: java.lang.Throwable -> Lbb
            androidx.compose.runtime.collection.IdentityArraySet r3 = r3.getModified$runtime_release()     // Catch: java.lang.Throwable -> Lbb
            if (r3 == 0) goto L60
            r3.addAll(r0)     // Catch: java.lang.Throwable -> Lbb
            goto L6c
        L60:
            androidx.compose.runtime.snapshots.MutableSnapshot r3 = r7.parent     // Catch: java.lang.Throwable -> Lbb
            r3.setModified(r0)     // Catch: java.lang.Throwable -> Lbb
            r7.setModified(r2)     // Catch: java.lang.Throwable -> Lbb
            goto L6c
        L69:
            r7.closeAndReleasePinning$runtime_release()     // Catch: java.lang.Throwable -> Lbb
        L6c:
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r7.parent     // Catch: java.lang.Throwable -> Lbb
            int r0 = r0.getId()     // Catch: java.lang.Throwable -> Lbb
            if (r0 >= r1) goto L79
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r7.parent     // Catch: java.lang.Throwable -> Lbb
            r0.advance$runtime_release()     // Catch: java.lang.Throwable -> Lbb
        L79:
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r7.parent     // Catch: java.lang.Throwable -> Lbb
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r0.getInvalid$runtime_release()     // Catch: java.lang.Throwable -> Lbb
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r2.clear(r1)     // Catch: java.lang.Throwable -> Lbb
            androidx.compose.runtime.snapshots.SnapshotIdSet r3 = r7.getPreviousIds$runtime_release()     // Catch: java.lang.Throwable -> Lbb
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r2.andNot(r3)     // Catch: java.lang.Throwable -> Lbb
            r0.setInvalid$runtime_release(r2)     // Catch: java.lang.Throwable -> Lbb
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r7.parent     // Catch: java.lang.Throwable -> Lbb
            r0.recordPrevious$runtime_release(r1)     // Catch: java.lang.Throwable -> Lbb
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r7.parent     // Catch: java.lang.Throwable -> Lbb
            int r1 = r7.takeoverPinnedSnapshot$runtime_release()     // Catch: java.lang.Throwable -> Lbb
            r0.recordPreviousPinnedSnapshot$runtime_release(r1)     // Catch: java.lang.Throwable -> Lbb
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r7.parent     // Catch: java.lang.Throwable -> Lbb
            androidx.compose.runtime.snapshots.SnapshotIdSet r1 = r7.getPreviousIds$runtime_release()     // Catch: java.lang.Throwable -> Lbb
            r0.recordPreviousList$runtime_release(r1)     // Catch: java.lang.Throwable -> Lbb
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r7.parent     // Catch: java.lang.Throwable -> Lbb
            int[] r1 = r7.getPreviousPinnedSnapshots$runtime_release()     // Catch: java.lang.Throwable -> Lbb
            r0.recordPreviousPinnedSnapshots$runtime_release(r1)     // Catch: java.lang.Throwable -> Lbb
            o.dpR r0 = o.dpR.c     // Catch: java.lang.Throwable -> Lbb
            monitor-exit(r4)
            r0 = 1
            r7.setApplied$runtime_release(r0)
            r7.deactivate()
            androidx.compose.runtime.snapshots.SnapshotApplyResult$Success r0 = androidx.compose.runtime.snapshots.SnapshotApplyResult.Success.INSTANCE
            return r0
        Lbb:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        Lbe:
            androidx.compose.runtime.snapshots.SnapshotApplyResult$Failure r0 = new androidx.compose.runtime.snapshots.SnapshotApplyResult$Failure
            r0.<init>(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.NestedMutableSnapshot.apply():androidx.compose.runtime.snapshots.SnapshotApplyResult");
    }

    private final void deactivate() {
        if (this.deactivated) {
            return;
        }
        this.deactivated = true;
        this.parent.mo1047nestedDeactivated$runtime_release(this);
    }
}
