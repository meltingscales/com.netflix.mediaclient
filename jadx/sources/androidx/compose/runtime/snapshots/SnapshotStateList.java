package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import o.C8628dsq;
import o.C8632dsu;
import o.dpR;
import o.drM;
import o.dsI;

/* loaded from: classes.dex */
public final class SnapshotStateList<T> implements StateObject, List<T>, RandomAccess, dsI {
    private StateRecord firstStateRecord = new StateListStateRecord(ExtensionsKt.persistentListOf());

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return C8628dsq.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) C8628dsq.c(this, tArr);
    }

    @Override // java.util.List
    public final T remove(int i) {
        return removeAt(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return getSize();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord) {
        stateRecord.setNext$runtime_release(getFirstStateRecord());
        C8632dsu.d(stateRecord);
        this.firstStateRecord = (StateListStateRecord) stateRecord;
    }

    public final StateListStateRecord<T> getReadable$runtime_release() {
        StateRecord firstStateRecord = getFirstStateRecord();
        C8632dsu.d(firstStateRecord);
        return (StateListStateRecord) SnapshotKt.readable((StateListStateRecord) firstStateRecord, this);
    }

    /* loaded from: classes.dex */
    public static final class StateListStateRecord<T> extends StateRecord {
        private PersistentList<? extends T> list;
        private int modification;
        private int structuralChange;

        public final PersistentList<T> getList$runtime_release() {
            return (PersistentList<? extends T>) this.list;
        }

        public final int getModification$runtime_release() {
            return this.modification;
        }

        public final int getStructuralChange$runtime_release() {
            return this.structuralChange;
        }

        public final void setList$runtime_release(PersistentList<? extends T> persistentList) {
            this.list = persistentList;
        }

        public final void setModification$runtime_release(int i) {
            this.modification = i;
        }

        public final void setStructuralChange$runtime_release(int i) {
            this.structuralChange = i;
        }

        public StateListStateRecord(PersistentList<? extends T> persistentList) {
            this.list = persistentList;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord stateRecord) {
            Object obj;
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                C8632dsu.d(stateRecord);
                this.list = ((StateListStateRecord) stateRecord).list;
                this.modification = ((StateListStateRecord) stateRecord).modification;
                this.structuralChange = ((StateListStateRecord) stateRecord).structuralChange;
                dpR dpr = dpR.c;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return new StateListStateRecord(this.list);
        }
    }

    public int getSize() {
        return getReadable$runtime_release().getList$runtime_release().size();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return getReadable$runtime_release().getList$runtime_release().contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        return getReadable$runtime_release().getList$runtime_release().containsAll(collection);
    }

    @Override // java.util.List
    public T get(int i) {
        return getReadable$runtime_release().getList$runtime_release().get(i);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return getReadable$runtime_release().getList$runtime_release().indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return getReadable$runtime_release().getList$runtime_release().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return getReadable$runtime_release().getList$runtime_release().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return new StateListIterator(this, 0);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i) {
        return new StateListIterator(this, i);
    }

    @Override // java.util.List
    public List<T> subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > size()) {
            throw new IllegalArgumentException("fromIndex or toIndex are out of bounds".toString());
        }
        return new SubList(this, i, i2);
    }

    @Override // java.util.List
    public boolean addAll(final int i, final Collection<? extends T> collection) {
        return mutateBoolean(new drM<List<T>, Boolean>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateList$addAll$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                return invoke((List) ((List) obj));
            }

            public final Boolean invoke(List<T> list) {
                return Boolean.valueOf(list.addAll(i, collection));
            }
        });
    }

    public T removeAt(int i) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        Object obj2;
        boolean z;
        T t = get(i);
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                C8632dsu.d(firstStateRecord);
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                dpR dpr = dpR.c;
            }
            C8632dsu.d(list$runtime_release);
            PersistentList<T> removeAt = list$runtime_release.removeAt(i);
            if (C8632dsu.c(removeAt, list$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            C8632dsu.d(firstStateRecord2);
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj2 = SnapshotStateListKt.sync;
                synchronized (obj2) {
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(removeAt);
                        z = true;
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z);
        return t;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(final Collection<? extends Object> collection) {
        return mutateBoolean(new drM<List<T>, Boolean>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateList$retainAll$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final Boolean invoke(List<T> list) {
                return Boolean.valueOf(list.retainAll(collection));
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                return invoke((List) ((List) obj));
            }
        });
    }

    @Override // java.util.List
    public T set(int i, T t) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        Object obj2;
        boolean z;
        T t2 = get(i);
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                C8632dsu.d(firstStateRecord);
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                dpR dpr = dpR.c;
            }
            C8632dsu.d(list$runtime_release);
            PersistentList<T> persistentList = list$runtime_release.set(i, (int) t);
            if (C8632dsu.c(persistentList, list$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            C8632dsu.d(firstStateRecord2);
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj2 = SnapshotStateListKt.sync;
                synchronized (obj2) {
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(persistentList);
                        z = true;
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z);
        return t2;
    }

    public final int retainAllInRange$runtime_release(Collection<? extends T> collection, int i, int i2) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        Object obj2;
        boolean z;
        int size = size();
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                C8632dsu.d(firstStateRecord);
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                dpR dpr = dpR.c;
            }
            C8632dsu.d(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            builder.subList(i, i2).retainAll(collection);
            PersistentList<T> build = builder.build();
            if (C8632dsu.c(build, list$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            C8632dsu.d(firstStateRecord2);
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj2 = SnapshotStateListKt.sync;
                synchronized (obj2) {
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(build);
                        z = true;
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z);
        return size - size();
    }

    public final int getStructure$runtime_release() {
        StateRecord firstStateRecord = getFirstStateRecord();
        C8632dsu.d(firstStateRecord);
        return ((StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord)).getStructuralChange$runtime_release();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        boolean z;
        Snapshot current;
        Object obj2;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                C8632dsu.d(firstStateRecord);
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                dpR dpr = dpR.c;
            }
            C8632dsu.d(list$runtime_release);
            PersistentList<T> add = list$runtime_release.add((PersistentList<T>) t);
            z = false;
            if (C8632dsu.c(add, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            C8632dsu.d(firstStateRecord2);
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj2 = SnapshotStateListKt.sync;
                synchronized (obj2) {
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(add);
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                        z = true;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List
    public void add(int i, T t) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        Object obj2;
        boolean z;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                C8632dsu.d(firstStateRecord);
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                dpR dpr = dpR.c;
            }
            C8632dsu.d(list$runtime_release);
            PersistentList<T> add = list$runtime_release.add(i, (int) t);
            if (C8632dsu.c(add, list$runtime_release)) {
                return;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            C8632dsu.d(firstStateRecord2);
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj2 = SnapshotStateListKt.sync;
                synchronized (obj2) {
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(add);
                        z = true;
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        boolean z;
        Snapshot current;
        Object obj2;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                C8632dsu.d(firstStateRecord);
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                dpR dpr = dpR.c;
            }
            C8632dsu.d(list$runtime_release);
            PersistentList<T> addAll = list$runtime_release.addAll(collection);
            z = false;
            if (C8632dsu.c(addAll, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            C8632dsu.d(firstStateRecord2);
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj2 = SnapshotStateListKt.sync;
                synchronized (obj2) {
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(addAll);
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                        z = true;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        Snapshot current;
        Object obj;
        StateRecord firstStateRecord = getFirstStateRecord();
        C8632dsu.d(firstStateRecord);
        StateListStateRecord stateListStateRecord = (StateListStateRecord) firstStateRecord;
        SnapshotKt.getSnapshotInitializer();
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.Companion.getCurrent();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord, this, current);
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                stateListStateRecord2.setList$runtime_release(ExtensionsKt.persistentListOf());
                stateListStateRecord2.setModification$runtime_release(stateListStateRecord2.getModification$runtime_release() + 1);
                stateListStateRecord2.setStructuralChange$runtime_release(stateListStateRecord2.getStructuralChange$runtime_release() + 1);
            }
        }
        SnapshotKt.notifyWrite(current, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        Object obj2;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        boolean z;
        Snapshot current;
        Object obj3;
        do {
            obj2 = SnapshotStateListKt.sync;
            synchronized (obj2) {
                StateRecord firstStateRecord = getFirstStateRecord();
                C8632dsu.d(firstStateRecord);
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                dpR dpr = dpR.c;
            }
            C8632dsu.d(list$runtime_release);
            PersistentList<T> remove = list$runtime_release.remove((PersistentList<T>) obj);
            z = false;
            if (C8632dsu.c(remove, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            C8632dsu.d(firstStateRecord2);
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj3 = SnapshotStateListKt.sync;
                synchronized (obj3) {
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(remove);
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                        z = true;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        boolean z;
        Snapshot current;
        Object obj2;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                C8632dsu.d(firstStateRecord);
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                dpR dpr = dpR.c;
            }
            C8632dsu.d(list$runtime_release);
            PersistentList<T> removeAll = list$runtime_release.removeAll((Collection<? extends T>) collection);
            z = false;
            if (C8632dsu.c(removeAll, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            C8632dsu.d(firstStateRecord2);
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj2 = SnapshotStateListKt.sync;
                synchronized (obj2) {
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(removeAll);
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                        z = true;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z);
        return true;
    }

    public final void removeRange(int i, int i2) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        Object obj2;
        boolean z;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                C8632dsu.d(firstStateRecord);
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                dpR dpr = dpR.c;
            }
            C8632dsu.d(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            builder.subList(i, i2).clear();
            PersistentList<T> build = builder.build();
            if (C8632dsu.c(build, list$runtime_release)) {
                return;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            C8632dsu.d(firstStateRecord2);
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj2 = SnapshotStateListKt.sync;
                synchronized (obj2) {
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(build);
                        z = true;
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z);
    }

    private final boolean mutateBoolean(drM<? super List<T>, Boolean> drm) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Boolean invoke;
        Snapshot current;
        Object obj2;
        boolean z;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                C8632dsu.d(firstStateRecord);
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                dpR dpr = dpR.c;
            }
            C8632dsu.d(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            invoke = drm.invoke(builder);
            PersistentList<T> build = builder.build();
            if (C8632dsu.c(build, list$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            C8632dsu.d(firstStateRecord2);
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj2 = SnapshotStateListKt.sync;
                synchronized (obj2) {
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(build);
                        z = true;
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z);
        return invoke.booleanValue();
    }
}
