package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.AtomicInt;
import androidx.compose.runtime.SnapshotThreadLocal;
import androidx.compose.runtime.WeakReference;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import o.C8569dql;
import o.C8632dsu;
import o.dpR;
import o.drM;
import o.drX;

/* loaded from: classes.dex */
public final class SnapshotKt {
    private static List<? extends drX<? super Set<? extends Object>, ? super Snapshot, dpR>> applyObservers;
    private static final AtomicReference<GlobalSnapshot> currentGlobalSnapshot;
    private static final SnapshotWeakSet<StateObject> extraStateObjects;
    private static List<? extends drM<Object, dpR>> globalWriteObservers;
    private static int nextSnapshotId;
    private static SnapshotIdSet openSnapshots;
    private static AtomicInt pendingApplyObserverCount;
    private static final SnapshotDoubleIndexHeap pinningTable;
    private static final Snapshot snapshotInitializer;
    private static final drM<SnapshotIdSet, dpR> emptyLambda = new drM<SnapshotIdSet, dpR>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$emptyLambda$1
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(SnapshotIdSet snapshotIdSet) {
        }

        @Override // o.drM
        public /* bridge */ /* synthetic */ dpR invoke(SnapshotIdSet snapshotIdSet) {
            invoke2(snapshotIdSet);
            return dpR.c;
        }
    };
    private static final SnapshotThreadLocal<Snapshot> threadSnapshot = new SnapshotThreadLocal<>();
    private static final Object lock = new Object();

    public static final Object getLock() {
        return lock;
    }

    public static final Snapshot getSnapshotInitializer() {
        return snapshotInitializer;
    }

    public static final int trackPinning(int i, SnapshotIdSet snapshotIdSet) {
        int add;
        int lowest = snapshotIdSet.lowest(i);
        synchronized (getLock()) {
            add = pinningTable.add(lowest);
        }
        return add;
    }

    public static final void releasePinningLocked(int i) {
        pinningTable.remove(i);
    }

    public static final Snapshot currentSnapshot() {
        Snapshot snapshot = threadSnapshot.get();
        return snapshot == null ? currentGlobalSnapshot.get() : snapshot;
    }

    static {
        List<? extends drX<? super Set<? extends Object>, ? super Snapshot, dpR>> i;
        List<? extends drM<Object, dpR>> i2;
        SnapshotIdSet.Companion companion = SnapshotIdSet.Companion;
        openSnapshots = companion.getEMPTY();
        nextSnapshotId = 1;
        pinningTable = new SnapshotDoubleIndexHeap();
        extraStateObjects = new SnapshotWeakSet<>();
        i = C8569dql.i();
        applyObservers = i;
        i2 = C8569dql.i();
        globalWriteObservers = i2;
        int i3 = nextSnapshotId;
        nextSnapshotId = i3 + 1;
        GlobalSnapshot globalSnapshot = new GlobalSnapshot(i3, companion.getEMPTY());
        openSnapshots = openSnapshots.set(globalSnapshot.getId());
        AtomicReference<GlobalSnapshot> atomicReference = new AtomicReference<>(globalSnapshot);
        currentGlobalSnapshot = atomicReference;
        snapshotInitializer = atomicReference.get();
        pendingApplyObserverCount = new AtomicInt(0);
    }

    public static /* synthetic */ Snapshot createTransparentSnapshotWithNoParentReadObserver$default(Snapshot snapshot, drM drm, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            drm = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return createTransparentSnapshotWithNoParentReadObserver(snapshot, drm, z);
    }

    public static final Snapshot createTransparentSnapshotWithNoParentReadObserver(Snapshot snapshot, drM<Object, dpR> drm, boolean z) {
        boolean z2 = snapshot instanceof MutableSnapshot;
        if (z2 || snapshot == null) {
            return new TransparentObserverMutableSnapshot(z2 ? (MutableSnapshot) snapshot : null, drm, null, false, z);
        }
        return new TransparentObserverSnapshot(snapshot, drm, false, z);
    }

    public static /* synthetic */ drM mergedReadObserver$default(drM drm, drM drm2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return mergedReadObserver(drm, drm2, z);
    }

    public static final drM<Object, dpR> mergedReadObserver(final drM<Object, dpR> drm, final drM<Object, dpR> drm2, boolean z) {
        if (!z) {
            drm2 = null;
        }
        if (drm == null || drm2 == null || C8632dsu.c(drm, drm2)) {
            return drm == null ? drm2 : drm;
        }
        return new drM<Object, dpR>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$mergedReadObserver$1
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
                drm2.invoke(obj);
            }
        };
    }

    public static final drM<Object, dpR> mergedWriteObserver(final drM<Object, dpR> drm, final drM<Object, dpR> drm2) {
        if (drm == null || drm2 == null || C8632dsu.c(drm, drm2)) {
            return drm == null ? drm2 : drm;
        }
        return new drM<Object, dpR>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$mergedWriteObserver$1
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
                drm2.invoke(obj);
            }
        };
    }

    public static final <T> T takeNewGlobalSnapshot(Snapshot snapshot, drM<? super SnapshotIdSet, ? extends T> drm) {
        T invoke = drm.invoke(openSnapshots.clear(snapshot.getId()));
        synchronized (getLock()) {
            int i = nextSnapshotId;
            nextSnapshotId = i + 1;
            openSnapshots = openSnapshots.clear(snapshot.getId());
            currentGlobalSnapshot.set(new GlobalSnapshot(i, openSnapshots));
            snapshot.dispose();
            openSnapshots = openSnapshots.set(i);
            dpR dpr = dpR.c;
        }
        return invoke;
    }

    public static final <T> T advanceGlobalSnapshot(drM<? super SnapshotIdSet, ? extends T> drm) {
        GlobalSnapshot globalSnapshot;
        IdentityArraySet<StateObject> modified$runtime_release;
        T t;
        Snapshot snapshot = snapshotInitializer;
        C8632dsu.d(snapshot);
        GlobalSnapshot globalSnapshot2 = (GlobalSnapshot) snapshot;
        synchronized (getLock()) {
            globalSnapshot = currentGlobalSnapshot.get();
            modified$runtime_release = globalSnapshot.getModified$runtime_release();
            if (modified$runtime_release != null) {
                pendingApplyObserverCount.add(1);
            }
            t = (T) takeNewGlobalSnapshot(globalSnapshot, drm);
        }
        if (modified$runtime_release != null) {
            try {
                List<? extends drX<? super Set<? extends Object>, ? super Snapshot, dpR>> list = applyObservers;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).invoke(modified$runtime_release, globalSnapshot);
                }
            } finally {
                pendingApplyObserverCount.add(-1);
            }
        }
        synchronized (getLock()) {
            checkAndOverwriteUnusedRecordsLocked();
            if (modified$runtime_release != null) {
                Object[] values = modified$runtime_release.getValues();
                int size2 = modified$runtime_release.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Object obj = values[i2];
                    C8632dsu.d(obj);
                    processForUnusedRecordsLocked((StateObject) obj);
                }
                dpR dpr = dpR.c;
            }
        }
        return t;
    }

    public static final void advanceGlobalSnapshot() {
        advanceGlobalSnapshot(new drM<SnapshotIdSet, dpR>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$advanceGlobalSnapshot$3
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(SnapshotIdSet snapshotIdSet) {
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(SnapshotIdSet snapshotIdSet) {
                invoke2(snapshotIdSet);
                return dpR.c;
            }
        });
    }

    public static final <T extends Snapshot> T takeNewSnapshot(final drM<? super SnapshotIdSet, ? extends T> drm) {
        return (T) advanceGlobalSnapshot(new drM<SnapshotIdSet, T>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$takeNewSnapshot$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Incorrect return type in method signature: (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)TT; */
            @Override // o.drM
            public final Snapshot invoke(SnapshotIdSet snapshotIdSet) {
                SnapshotIdSet snapshotIdSet2;
                Snapshot snapshot = (Snapshot) drm.invoke(snapshotIdSet);
                synchronized (SnapshotKt.getLock()) {
                    snapshotIdSet2 = SnapshotKt.openSnapshots;
                    SnapshotKt.openSnapshots = snapshotIdSet2.set(snapshot.getId());
                    dpR dpr = dpR.c;
                }
                return snapshot;
            }
        });
    }

    public static final void validateOpen(Snapshot snapshot) {
        int lowestOrDefault;
        if (openSnapshots.get(snapshot.getId())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Snapshot is not open: id=");
        sb.append(snapshot.getId());
        sb.append(", disposed=");
        sb.append(snapshot.getDisposed$runtime_release());
        sb.append(", applied=");
        MutableSnapshot mutableSnapshot = snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null;
        sb.append(mutableSnapshot != null ? Boolean.valueOf(mutableSnapshot.getApplied$runtime_release()) : "read-only");
        sb.append(", lowestPin=");
        synchronized (getLock()) {
            lowestOrDefault = pinningTable.lowestOrDefault(-1);
        }
        sb.append(lowestOrDefault);
        throw new IllegalStateException(sb.toString().toString());
    }

    private static final boolean valid(int i, int i2, SnapshotIdSet snapshotIdSet) {
        return (i2 == 0 || i2 > i || snapshotIdSet.get(i2)) ? false : true;
    }

    private static final boolean valid(StateRecord stateRecord, int i, SnapshotIdSet snapshotIdSet) {
        return valid(i, stateRecord.getSnapshotId$runtime_release(), snapshotIdSet);
    }

    public static final <T extends StateRecord> T readable(T t, int i, SnapshotIdSet snapshotIdSet) {
        T t2 = null;
        while (t != null) {
            if (valid(t, i, snapshotIdSet) && (t2 == null || t2.getSnapshotId$runtime_release() < t.getSnapshotId$runtime_release())) {
                t2 = t;
            }
            t = (T) t.getNext$runtime_release();
        }
        if (t2 != null) {
            return t2;
        }
        return null;
    }

    public static final <T extends StateRecord> T readable(T t, StateObject stateObject) {
        T t2;
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot current = companion.getCurrent();
        drM<Object, dpR> readObserver$runtime_release = current.getReadObserver$runtime_release();
        if (readObserver$runtime_release != null) {
            readObserver$runtime_release.invoke(stateObject);
        }
        T t3 = (T) readable(t, current.getId(), current.getInvalid$runtime_release());
        if (t3 == null) {
            synchronized (getLock()) {
                Snapshot current2 = companion.getCurrent();
                StateRecord firstStateRecord = stateObject.getFirstStateRecord();
                C8632dsu.d(firstStateRecord);
                t2 = (T) readable(firstStateRecord, current2.getId(), current2.getInvalid$runtime_release());
                if (t2 == null) {
                    readError();
                    throw new KotlinNothingValueException();
                }
            }
            return t2;
        }
        return t3;
    }

    public static final Void readError() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    private static final StateRecord usedLocked(StateObject stateObject) {
        int lowestOrDefault = pinningTable.lowestOrDefault(nextSnapshotId);
        SnapshotIdSet empty = SnapshotIdSet.Companion.getEMPTY();
        StateRecord stateRecord = null;
        for (StateRecord firstStateRecord = stateObject.getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext$runtime_release()) {
            if (firstStateRecord.getSnapshotId$runtime_release() == 0) {
                return firstStateRecord;
            }
            if (valid(firstStateRecord, lowestOrDefault - 1, empty)) {
                if (stateRecord != null) {
                    return firstStateRecord.getSnapshotId$runtime_release() < stateRecord.getSnapshotId$runtime_release() ? firstStateRecord : stateRecord;
                }
                stateRecord = firstStateRecord;
            }
        }
        return null;
    }

    private static final boolean overwriteUnusedRecordsLocked(StateObject stateObject) {
        StateRecord stateRecord;
        int lowestOrDefault = pinningTable.lowestOrDefault(nextSnapshotId);
        StateRecord stateRecord2 = null;
        StateRecord stateRecord3 = null;
        int i = 0;
        for (StateRecord firstStateRecord = stateObject.getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext$runtime_release()) {
            int snapshotId$runtime_release = firstStateRecord.getSnapshotId$runtime_release();
            if (snapshotId$runtime_release != 0) {
                if (snapshotId$runtime_release >= lowestOrDefault) {
                    i++;
                } else if (stateRecord2 == null) {
                    i++;
                    stateRecord2 = firstStateRecord;
                } else {
                    if (firstStateRecord.getSnapshotId$runtime_release() < stateRecord2.getSnapshotId$runtime_release()) {
                        stateRecord = firstStateRecord;
                    } else {
                        stateRecord = stateRecord2;
                        stateRecord2 = firstStateRecord;
                    }
                    if (stateRecord3 == null) {
                        stateRecord3 = stateObject.getFirstStateRecord();
                        StateRecord stateRecord4 = stateRecord3;
                        while (true) {
                            if (stateRecord3 == null) {
                                stateRecord3 = stateRecord4;
                                break;
                            } else if (stateRecord3.getSnapshotId$runtime_release() >= lowestOrDefault) {
                                break;
                            } else {
                                if (stateRecord4.getSnapshotId$runtime_release() < stateRecord3.getSnapshotId$runtime_release()) {
                                    stateRecord4 = stateRecord3;
                                }
                                stateRecord3 = stateRecord3.getNext$runtime_release();
                            }
                        }
                    }
                    stateRecord.setSnapshotId$runtime_release(0);
                    stateRecord.assign(stateRecord3);
                }
            }
        }
        return i > 1;
    }

    public static final void processForUnusedRecordsLocked(StateObject stateObject) {
        if (overwriteUnusedRecordsLocked(stateObject)) {
            extraStateObjects.add(stateObject);
        }
    }

    public static final <T extends StateRecord> T writableRecord(T t, StateObject stateObject, Snapshot snapshot) {
        if (snapshot.getReadOnly()) {
            snapshot.mo1048recordModified$runtime_release(stateObject);
        }
        T t2 = (T) readable(t, snapshot.getId(), snapshot.getInvalid$runtime_release());
        if (t2 == null) {
            readError();
            throw new KotlinNothingValueException();
        } else if (t2.getSnapshotId$runtime_release() == snapshot.getId()) {
            return t2;
        } else {
            T t3 = (T) newWritableRecord(t2, stateObject, snapshot);
            snapshot.mo1048recordModified$runtime_release(stateObject);
            return t3;
        }
    }

    public static final <T extends StateRecord> T overwritableRecord(T t, StateObject stateObject, Snapshot snapshot, T t2) {
        T t3;
        if (snapshot.getReadOnly()) {
            snapshot.mo1048recordModified$runtime_release(stateObject);
        }
        int id = snapshot.getId();
        if (t2.getSnapshotId$runtime_release() == id) {
            return t2;
        }
        synchronized (getLock()) {
            t3 = (T) newOverwritableRecordLocked(t, stateObject);
        }
        t3.setSnapshotId$runtime_release(id);
        snapshot.mo1048recordModified$runtime_release(stateObject);
        return t3;
    }

    private static final <T extends StateRecord> T newWritableRecordLocked(T t, StateObject stateObject, Snapshot snapshot) {
        T t2 = (T) newOverwritableRecordLocked(t, stateObject);
        t2.assign(t);
        t2.setSnapshotId$runtime_release(snapshot.getId());
        return t2;
    }

    public static final <T extends StateRecord> T newOverwritableRecordLocked(T t, StateObject stateObject) {
        T t2 = (T) usedLocked(stateObject);
        if (t2 != null) {
            t2.setSnapshotId$runtime_release(Integer.MAX_VALUE);
            return t2;
        }
        T t3 = (T) t.create();
        t3.setSnapshotId$runtime_release(Integer.MAX_VALUE);
        t3.setNext$runtime_release(stateObject.getFirstStateRecord());
        C8632dsu.d(t3);
        stateObject.prependStateRecord(t3);
        C8632dsu.d(t3);
        return t3;
    }

    public static final void notifyWrite(Snapshot snapshot, StateObject stateObject) {
        snapshot.setWriteCount$runtime_release(snapshot.getWriteCount$runtime_release() + 1);
        drM<Object, dpR> writeObserver$runtime_release = snapshot.getWriteObserver$runtime_release();
        if (writeObserver$runtime_release != null) {
            writeObserver$runtime_release.invoke(stateObject);
        }
    }

    public static final Map<StateRecord, StateRecord> optimisticMerges(MutableSnapshot mutableSnapshot, MutableSnapshot mutableSnapshot2, SnapshotIdSet snapshotIdSet) {
        StateRecord readable;
        IdentityArraySet<StateObject> modified$runtime_release = mutableSnapshot2.getModified$runtime_release();
        int id = mutableSnapshot.getId();
        if (modified$runtime_release == null) {
            return null;
        }
        SnapshotIdSet or = mutableSnapshot2.getInvalid$runtime_release().set(mutableSnapshot2.getId()).or(mutableSnapshot2.getPreviousIds$runtime_release());
        Object[] values = modified$runtime_release.getValues();
        int size = modified$runtime_release.size();
        HashMap hashMap = null;
        for (int i = 0; i < size; i++) {
            Object obj = values[i];
            C8632dsu.d(obj);
            StateObject stateObject = (StateObject) obj;
            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
            StateRecord readable2 = readable(firstStateRecord, id, snapshotIdSet);
            if (readable2 != null && (readable = readable(firstStateRecord, id, or)) != null && !C8632dsu.c(readable2, readable)) {
                StateRecord readable3 = readable(firstStateRecord, mutableSnapshot2.getId(), mutableSnapshot2.getInvalid$runtime_release());
                if (readable3 == null) {
                    readError();
                    throw new KotlinNothingValueException();
                }
                StateRecord mergeRecords = stateObject.mergeRecords(readable, readable2, readable3);
                if (mergeRecords == null) {
                    return null;
                }
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                hashMap.put(readable2, mergeRecords);
            }
        }
        return hashMap;
    }

    public static final Void reportReadonlySnapshotWrite() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    public static final <T extends StateRecord> T current(T t, Snapshot snapshot) {
        T t2 = (T) readable(t, snapshot.getId(), snapshot.getInvalid$runtime_release());
        if (t2 != null) {
            return t2;
        }
        readError();
        throw new KotlinNothingValueException();
    }

    public static final <T extends StateRecord> T current(T t) {
        T t2;
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot current = companion.getCurrent();
        T t3 = (T) readable(t, current.getId(), current.getInvalid$runtime_release());
        if (t3 == null) {
            synchronized (getLock()) {
                Snapshot current2 = companion.getCurrent();
                t2 = (T) readable(t, current2.getId(), current2.getInvalid$runtime_release());
            }
            if (t2 != null) {
                return t2;
            }
            readError();
            throw new KotlinNothingValueException();
        }
        return t3;
    }

    public static final SnapshotIdSet addRange(SnapshotIdSet snapshotIdSet, int i, int i2) {
        while (i < i2) {
            snapshotIdSet = snapshotIdSet.set(i);
            i++;
        }
        return snapshotIdSet;
    }

    public static final void checkAndOverwriteUnusedRecordsLocked() {
        StateObject stateObject;
        SnapshotWeakSet<StateObject> snapshotWeakSet = extraStateObjects;
        int size$runtime_release = snapshotWeakSet.getSize$runtime_release();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= size$runtime_release) {
                break;
            }
            WeakReference<StateObject> weakReference = snapshotWeakSet.getValues$runtime_release()[i];
            if ((weakReference != null ? weakReference.get() : null) != null && !(!overwriteUnusedRecordsLocked(stateObject))) {
                if (i2 != i) {
                    snapshotWeakSet.getValues$runtime_release()[i2] = weakReference;
                    snapshotWeakSet.getHashes$runtime_release()[i2] = snapshotWeakSet.getHashes$runtime_release()[i];
                }
                i2++;
            }
            i++;
        }
        for (int i3 = i2; i3 < size$runtime_release; i3++) {
            snapshotWeakSet.getValues$runtime_release()[i3] = null;
            snapshotWeakSet.getHashes$runtime_release()[i3] = 0;
        }
        if (i2 != size$runtime_release) {
            snapshotWeakSet.setSize$runtime_release(i2);
        }
    }

    public static final <T extends StateRecord> T newWritableRecord(T t, StateObject stateObject, Snapshot snapshot) {
        T t2;
        synchronized (getLock()) {
            t2 = (T) newWritableRecordLocked(t, stateObject, snapshot);
        }
        return t2;
    }
}
