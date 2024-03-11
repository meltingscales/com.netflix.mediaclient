package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o.C8632dsu;
import o.dpX;

/* loaded from: classes5.dex */
public abstract class dpX<K, V> implements Map<K, V>, dsK {
    public static final c Companion = new c(null);
    private volatile Set<? extends K> _keys;
    private volatile Collection<? extends V> _values;

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract Set getEntries();

    @Override // java.util.Map
    public V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public final int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return getValues();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return implFindEntry(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set<Map.Entry<K, V>> entrySet = entrySet();
        if (!(entrySet instanceof Collection) || !entrySet.isEmpty()) {
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                if (C8632dsu.c(((Map.Entry) it.next()).getValue(), obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean containsEntry$kotlin_stdlib(Map.Entry<?, ?> entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        C8632dsu.d(this);
        V v = get(key);
        if (C8632dsu.c(value, v)) {
            if (v == null) {
                C8632dsu.d(this);
                return containsKey(key);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            Set<Map.Entry<K, V>> entrySet = map.entrySet();
            if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
                return true;
            }
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                if (!containsEntry$kotlin_stdlib((Map.Entry) it.next())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object obj) {
        Map.Entry<K, V> implFindEntry = implFindEntry(obj);
        if (implFindEntry != null) {
            return implFindEntry.getValue();
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public int getSize() {
        return entrySet().size();
    }

    /* loaded from: classes5.dex */
    public static final class a extends AbstractC8558dqa<K> {
        final /* synthetic */ dpX<K, V> c;

        /* JADX WARN: Multi-variable type inference failed */
        a(dpX<K, ? extends V> dpx) {
            this.c = dpx;
        }

        @Override // o.dpQ, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return this.c.containsKey(obj);
        }

        /* loaded from: classes5.dex */
        public static final class b implements Iterator<K>, dsK {
            final /* synthetic */ Iterator<Map.Entry<K, V>> d;

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            /* JADX WARN: Multi-variable type inference failed */
            b(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.d = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.d.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                return this.d.next().getKey();
            }
        }

        @Override // o.AbstractC8558dqa, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new b(this.c.entrySet().iterator());
        }

        @Override // o.dpQ
        public int getSize() {
            return this.c.size();
        }
    }

    public Set<K> getKeys() {
        if (this._keys == null) {
            this._keys = new a(this);
        }
        Set set = (Set<? extends K>) this._keys;
        C8632dsu.d(set);
        return set;
    }

    public String toString() {
        String d;
        d = C8576dqs.d(entrySet(), ", ", "{", "}", 0, null, new drM<Map.Entry<? extends K, ? extends V>, CharSequence>(this) { // from class: kotlin.collections.AbstractMap$toString$1
            final /* synthetic */ dpX<K, V> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.b = this;
            }

            @Override // o.drM
            /* renamed from: e */
            public final CharSequence invoke(Map.Entry<? extends K, ? extends V> entry) {
                String dpx;
                C8632dsu.c((Object) entry, "");
                dpx = this.b.toString((Map.Entry) entry);
                return dpx;
            }
        }, 24, null);
        return d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String toString(Map.Entry<? extends K, ? extends V> entry) {
        return toString(entry.getKey()) + '=' + toString(entry.getValue());
    }

    private final String toString(Object obj) {
        return obj == this ? "(this Map)" : String.valueOf(obj);
    }

    /* loaded from: classes5.dex */
    public static final class b extends dpQ<V> {
        final /* synthetic */ dpX<K, V> e;

        /* JADX WARN: Multi-variable type inference failed */
        b(dpX<K, ? extends V> dpx) {
            this.e = dpx;
        }

        @Override // o.dpQ, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return this.e.containsValue(obj);
        }

        /* renamed from: o.dpX$b$b  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0124b implements Iterator<V>, dsK {
            final /* synthetic */ Iterator<Map.Entry<K, V>> b;

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            /* JADX WARN: Multi-variable type inference failed */
            C0124b(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.b.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                return this.b.next().getValue();
            }
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new C0124b(this.e.entrySet().iterator());
        }

        @Override // o.dpQ
        public int getSize() {
            return this.e.size();
        }
    }

    public Collection<V> getValues() {
        if (this._values == null) {
            this._values = new b(this);
        }
        Collection collection = (Collection<? extends V>) this._values;
        C8632dsu.d(collection);
        return collection;
    }

    private final Map.Entry<K, V> implFindEntry(K k) {
        Object obj;
        Iterator<T> it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C8632dsu.c(((Map.Entry) obj).getKey(), k)) {
                break;
            }
        }
        return (Map.Entry) obj;
    }

    /* loaded from: classes5.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }
}
