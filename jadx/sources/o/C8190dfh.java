package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: o.dfh  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8190dfh<K, V> implements InterfaceC8195dfm<K, V> {
    private LinkedHashMap<K, Collection<V>> b;

    public C8190dfh() {
        this.b = new LinkedHashMap<>();
    }

    public C8190dfh(int i) {
        this.b = new LinkedHashMap<>(i);
    }

    @Override // o.InterfaceC8195dfm
    public Collection<V> c(K k) {
        return this.b.get(k);
    }

    @Override // java.util.Map
    public void clear() {
        this.b.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        for (K k : this.b.keySet()) {
            Collection<V> collection = this.b.get(k);
            if (collection != null && collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<K, Collection<V>> entry : this.b.entrySet()) {
            for (V v : entry.getValue()) {
                linkedHashSet.add(new e(entry.getKey(), v));
            }
        }
        return linkedHashSet;
    }

    @Override // java.util.Map
    public V get(Object obj) {
        Collection<V> collection = this.b.get(obj);
        if (collection == null || collection.size() < 1) {
            return null;
        }
        ArrayList arrayList = (ArrayList) collection;
        return (V) arrayList.get(arrayList.size() - 1);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return this.b.keySet();
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        Collection<V> collection = this.b.get(k);
        if (collection == null) {
            collection = new ArrayList<>();
            this.b.put(k, collection);
        }
        collection.add(v);
        return v;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        if (map instanceof InterfaceC8195dfm) {
            InterfaceC8195dfm interfaceC8195dfm = (InterfaceC8195dfm) map;
            for (K k : map.keySet()) {
                Collection<V> c = interfaceC8195dfm.c(k);
                Collection<V> collection = this.b.get(k);
                if (collection != null) {
                    collection.addAll(c);
                } else {
                    this.b.put(k, c);
                }
            }
            return;
        }
        for (K k2 : map.keySet()) {
            put(k2, map.get(k2));
        }
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        Collection<V> remove = this.b.remove(obj);
        if (remove == null || remove.size() < 1) {
            return null;
        }
        ArrayList arrayList = (ArrayList) remove;
        return (V) arrayList.get(arrayList.size() - 1);
    }

    @Override // java.util.Map
    public int size() {
        return this.b.size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<K, Collection<V>> entry : this.b.entrySet()) {
            for (V v : entry.getValue()) {
                arrayList.add(v);
            }
        }
        return arrayList;
    }

    /* renamed from: o.dfh$e */
    /* loaded from: classes5.dex */
    static class e<K, V> implements Map.Entry<K, V> {
        private K a;
        private V d;

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.d;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            this.d = v;
            return v;
        }

        public e(K k, V v) {
            this.a = k;
            this.d = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            K k = this.a;
            if (k == null ? eVar.a == null : k.equals(eVar.a)) {
                V v = this.d;
                V v2 = eVar.d;
                return v != null ? v.equals(v2) : v2 == null;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.a;
            int hashCode = k != null ? k.hashCode() : 0;
            V v = this.d;
            return (hashCode * 31) + (v != null ? v.hashCode() : 0);
        }
    }
}
