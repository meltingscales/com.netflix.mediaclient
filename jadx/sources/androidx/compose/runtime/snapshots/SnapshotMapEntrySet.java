package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import o.C8572dqo;
import o.C8632dsu;
import o.C8657dts;
import o.dpD;
import o.dpR;
import o.dqD;
import o.dsH;

/* loaded from: classes.dex */
final class SnapshotMapEntrySet<K, V> extends SnapshotMapSet<K, V, Map.Entry<K, V>> {
    @Override // java.util.Set, java.util.Collection
    public /* synthetic */ boolean add(Object obj) {
        return ((Boolean) add((Map.Entry) ((Map.Entry) obj))).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) addAll(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (dsH.k(obj)) {
            return contains((Map.Entry) ((Map.Entry) obj));
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        if (dsH.k(obj)) {
            return remove((Map.Entry) ((Map.Entry) obj));
        }
        return false;
    }

    public SnapshotMapEntrySet(SnapshotStateMap<K, V> snapshotStateMap) {
        super(snapshotStateMap);
    }

    public Void add(Map.Entry<K, V> entry) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Set, java.util.Collection
    public Void addAll(Collection<? extends Map.Entry<K, V>> collection) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new StateMapMutableEntriesIterator(getMap(), ((ImmutableSet) getMap().getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator());
    }

    public boolean remove(Map.Entry<K, V> entry) {
        return getMap().remove(entry.getKey()) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        boolean z;
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            while (it.hasNext()) {
                z = getMap().remove(((Map.Entry) it.next()).getKey()) != null || z;
            }
            return z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        int d;
        int e;
        int b;
        Object obj;
        PersistentMap<K, V> map$runtime_release;
        int modification$runtime_release;
        boolean z;
        Snapshot current;
        Object obj2;
        Collection<? extends Object> collection2 = collection;
        d = C8572dqo.d(collection2, 10);
        e = dqD.e(d);
        b = C8657dts.b(e, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(b);
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair a = dpD.a(entry.getKey(), entry.getValue());
            linkedHashMap.put(a.d(), a.a());
        }
        SnapshotStateMap<K, V> map = getMap();
        boolean z2 = false;
        do {
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = map.getFirstStateRecord();
                C8632dsu.d(firstStateRecord);
                SnapshotStateMap.StateMapStateRecord stateMapStateRecord = (SnapshotStateMap.StateMapStateRecord) SnapshotKt.current((SnapshotStateMap.StateMapStateRecord) firstStateRecord);
                map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                dpR dpr = dpR.c;
            }
            C8632dsu.d(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            Iterator<Map.Entry<K, V>> it2 = map.entrySet().iterator();
            while (true) {
                z = true;
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry<K, V> next = it2.next();
                if (!linkedHashMap.containsKey(next.getKey()) || !C8632dsu.c(linkedHashMap.get(next.getKey()), next.getValue())) {
                    builder.remove(next.getKey());
                    z2 = true;
                }
            }
            dpR dpr2 = dpR.c;
            PersistentMap<K, V> build = builder.build();
            if (C8632dsu.c(build, map$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = map.getFirstStateRecord();
            C8632dsu.d(firstStateRecord2);
            SnapshotStateMap.StateMapStateRecord stateMapStateRecord2 = (SnapshotStateMap.StateMapStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                SnapshotStateMap.StateMapStateRecord stateMapStateRecord3 = (SnapshotStateMap.StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, map, current);
                obj2 = SnapshotStateMapKt.sync;
                synchronized (obj2) {
                    if (stateMapStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateMapStateRecord3.setMap$runtime_release(build);
                        stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification$runtime_release() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, map);
        } while (!z);
        return z2;
    }

    public boolean contains(Map.Entry<K, V> entry) {
        return C8632dsu.c(getMap().get(entry.getKey()), entry.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
            Iterator<T> it = collection2.iterator();
            while (it.hasNext()) {
                if (!contains((Object) ((Map.Entry) it.next()))) {
                    return false;
                }
            }
        }
        return true;
    }
}
