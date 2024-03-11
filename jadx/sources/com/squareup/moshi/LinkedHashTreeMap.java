package com.squareup.moshi;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes5.dex */
public final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    private static final Comparator<Comparable> i = new Comparator<Comparable>() { // from class: com.squareup.moshi.LinkedHashTreeMap.3
        @Override // java.util.Comparator
        /* renamed from: c */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };
    int a;
    int b;
    final g<K, V> c;
    g<K, V>[] d;
    final Comparator<? super K> e;
    private LinkedHashTreeMap<K, V>.c f;
    int g;
    private LinkedHashTreeMap<K, V>.d h;

    private static int d(int i2) {
        int i3 = i2 ^ ((i2 >>> 20) ^ (i2 >>> 12));
        return (i3 ^ (i3 >>> 7)) ^ (i3 >>> 4);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.b;
    }

    public LinkedHashTreeMap() {
        this(null);
    }

    LinkedHashTreeMap(Comparator<? super K> comparator) {
        this.b = 0;
        this.a = 0;
        this.e = comparator == null ? i : comparator;
        this.c = new g<>();
        this.d = new g[16];
        this.g = 12;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        g<K, V> d2 = d(obj);
        if (d2 != null) {
            return d2.f;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        g<K, V> a2 = a((LinkedHashTreeMap<K, V>) k, true);
        V v2 = a2.f;
        a2.f = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.d, (Object) null);
        this.b = 0;
        this.a++;
        g<K, V> gVar = this.c;
        g<K, V> gVar2 = gVar.a;
        while (gVar2 != gVar) {
            g<K, V> gVar3 = gVar2.a;
            gVar2.j = null;
            gVar2.a = null;
            gVar2 = gVar3;
        }
        gVar.j = gVar;
        gVar.a = gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g<K, V> a2 = a(obj);
        if (a2 != null) {
            return a2.f;
        }
        return null;
    }

    g<K, V> a(K k, boolean z) {
        int i2;
        g<K, V> gVar;
        Comparator<? super K> comparator = this.e;
        g<K, V>[] gVarArr = this.d;
        int d2 = d(k.hashCode());
        int length = (gVarArr.length - 1) & d2;
        g<K, V> gVar2 = gVarArr[length];
        if (gVar2 != null) {
            Comparable comparable = comparator == i ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    i2 = comparable.compareTo(gVar2.c);
                } else {
                    i2 = comparator.compare(k, (K) gVar2.c);
                }
                if (i2 == 0) {
                    return gVar2;
                }
                g<K, V> gVar3 = i2 < 0 ? gVar2.e : gVar2.h;
                if (gVar3 == null) {
                    break;
                }
                gVar2 = gVar3;
            }
        } else {
            i2 = 0;
        }
        g<K, V> gVar4 = gVar2;
        int i3 = i2;
        if (z) {
            g<K, V> gVar5 = this.c;
            if (gVar4 == null) {
                if (comparator == i && !(k instanceof Comparable)) {
                    throw new ClassCastException(k.getClass().getName() + " is not Comparable");
                }
                gVar = new g<>(gVar4, k, d2, gVar5, gVar5.j);
                gVarArr[length] = gVar;
            } else {
                gVar = new g<>(gVar4, k, d2, gVar5, gVar5.j);
                if (i3 < 0) {
                    gVar4.e = gVar;
                } else {
                    gVar4.h = gVar;
                }
                e((g) gVar4, true);
            }
            int i4 = this.b;
            this.b = i4 + 1;
            if (i4 > this.g) {
                b();
            }
            this.a++;
            return gVar;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    g<K, V> d(Object obj) {
        if (obj != 0) {
            try {
                return a((LinkedHashTreeMap<K, V>) obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    g<K, V> a(Map.Entry<?, ?> entry) {
        g<K, V> d2 = d(entry.getKey());
        if (d2 == null || !e(d2.f, entry.getValue())) {
            return null;
        }
        return d2;
    }

    private boolean e(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    void a(g<K, V> gVar, boolean z) {
        int i2;
        if (z) {
            g<K, V> gVar2 = gVar.j;
            gVar2.a = gVar.a;
            gVar.a.j = gVar2;
            gVar.j = null;
            gVar.a = null;
        }
        g<K, V> gVar3 = gVar.e;
        g<K, V> gVar4 = gVar.h;
        g<K, V> gVar5 = gVar.i;
        int i3 = 0;
        if (gVar3 != null && gVar4 != null) {
            g<K, V> c2 = gVar3.d > gVar4.d ? gVar3.c() : gVar4.a();
            a((g) c2, false);
            g<K, V> gVar6 = gVar.e;
            if (gVar6 != null) {
                i2 = gVar6.d;
                c2.e = gVar6;
                gVar6.i = c2;
                gVar.e = null;
            } else {
                i2 = 0;
            }
            g<K, V> gVar7 = gVar.h;
            if (gVar7 != null) {
                i3 = gVar7.d;
                c2.h = gVar7;
                gVar7.i = c2;
                gVar.h = null;
            }
            c2.d = Math.max(i2, i3) + 1;
            a(gVar, c2);
            return;
        }
        if (gVar3 != null) {
            a(gVar, gVar3);
            gVar.e = null;
        } else if (gVar4 != null) {
            a(gVar, gVar4);
            gVar.h = null;
        } else {
            a(gVar, (g) null);
        }
        e((g) gVar5, false);
        this.b--;
        this.a++;
    }

    g<K, V> a(Object obj) {
        g<K, V> d2 = d(obj);
        if (d2 != null) {
            a((g) d2, true);
        }
        return d2;
    }

    private void a(g<K, V> gVar, g<K, V> gVar2) {
        g<K, V> gVar3 = gVar.i;
        gVar.i = null;
        if (gVar2 != null) {
            gVar2.i = gVar3;
        }
        if (gVar3 != null) {
            if (gVar3.e == gVar) {
                gVar3.e = gVar2;
                return;
            } else {
                gVar3.h = gVar2;
                return;
            }
        }
        int i2 = gVar.b;
        g<K, V>[] gVarArr = this.d;
        gVarArr[i2 & (gVarArr.length - 1)] = gVar2;
    }

    private void e(g<K, V> gVar, boolean z) {
        while (gVar != null) {
            g<K, V> gVar2 = gVar.e;
            g<K, V> gVar3 = gVar.h;
            int i2 = gVar2 != null ? gVar2.d : 0;
            int i3 = gVar3 != null ? gVar3.d : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                g<K, V> gVar4 = gVar3.e;
                g<K, V> gVar5 = gVar3.h;
                int i5 = (gVar4 != null ? gVar4.d : 0) - (gVar5 != null ? gVar5.d : 0);
                if (i5 != -1 && (i5 != 0 || z)) {
                    e(gVar3);
                }
                d((g) gVar);
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                g<K, V> gVar6 = gVar2.e;
                g<K, V> gVar7 = gVar2.h;
                int i6 = (gVar6 != null ? gVar6.d : 0) - (gVar7 != null ? gVar7.d : 0);
                if (i6 != 1 && (i6 != 0 || z)) {
                    d((g) gVar2);
                }
                e(gVar);
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                gVar.d = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                gVar.d = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            gVar = gVar.i;
        }
    }

    private void d(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.e;
        g<K, V> gVar3 = gVar.h;
        g<K, V> gVar4 = gVar3.e;
        g<K, V> gVar5 = gVar3.h;
        gVar.h = gVar4;
        if (gVar4 != null) {
            gVar4.i = gVar;
        }
        a(gVar, gVar3);
        gVar3.e = gVar;
        gVar.i = gVar3;
        int max = Math.max(gVar2 != null ? gVar2.d : 0, gVar4 != null ? gVar4.d : 0) + 1;
        gVar.d = max;
        gVar3.d = Math.max(max, gVar5 != null ? gVar5.d : 0) + 1;
    }

    private void e(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.e;
        g<K, V> gVar3 = gVar.h;
        g<K, V> gVar4 = gVar2.e;
        g<K, V> gVar5 = gVar2.h;
        gVar.e = gVar5;
        if (gVar5 != null) {
            gVar5.i = gVar;
        }
        a(gVar, gVar2);
        gVar2.h = gVar;
        gVar.i = gVar2;
        int max = Math.max(gVar3 != null ? gVar3.d : 0, gVar5 != null ? gVar5.d : 0) + 1;
        gVar.d = max;
        gVar2.d = Math.max(max, gVar4 != null ? gVar4.d : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        LinkedHashTreeMap<K, V>.c cVar = this.f;
        if (cVar != null) {
            return cVar;
        }
        LinkedHashTreeMap<K, V>.c cVar2 = new c();
        this.f = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        LinkedHashTreeMap<K, V>.d dVar = this.h;
        if (dVar != null) {
            return dVar;
        }
        LinkedHashTreeMap<K, V>.d dVar2 = new d();
        this.h = dVar2;
        return dVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class g<K, V> implements Map.Entry<K, V> {
        g<K, V> a;
        final int b;
        final K c;
        int d;
        g<K, V> e;
        V f;
        g<K, V> h;
        g<K, V> i;
        g<K, V> j;

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.c;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.f;
            this.f = v;
            return v2;
        }

        g() {
            this.c = null;
            this.b = -1;
            this.j = this;
            this.a = this;
        }

        g(g<K, V> gVar, K k, int i, g<K, V> gVar2, g<K, V> gVar3) {
            this.i = gVar;
            this.c = k;
            this.b = i;
            this.d = 1;
            this.a = gVar2;
            this.j = gVar3;
            gVar3.a = this;
            gVar2.j = this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k = this.c;
                if (k != null ? k.equals(entry.getKey()) : entry.getKey() == null) {
                    V v = this.f;
                    if (v != null ? v.equals(entry.getValue()) : entry.getValue() == null) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.c;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        public String toString() {
            return this.c + "=" + this.f;
        }

        public g<K, V> a() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.e; gVar2 != null; gVar2 = gVar2.e) {
                gVar = gVar2;
            }
            return gVar;
        }

        public g<K, V> c() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.h; gVar2 != null; gVar2 = gVar2.h) {
                gVar = gVar2;
            }
            return gVar;
        }
    }

    private void b() {
        g<K, V>[] a2 = a((g[]) this.d);
        this.d = a2;
        this.g = (a2.length / 2) + (a2.length / 4);
    }

    static <K, V> g<K, V>[] a(g<K, V>[] gVarArr) {
        int length = gVarArr.length;
        g<K, V>[] gVarArr2 = new g[length * 2];
        a aVar = new a();
        b bVar = new b();
        b bVar2 = new b();
        for (int i2 = 0; i2 < length; i2++) {
            g<K, V> gVar = gVarArr[i2];
            if (gVar != null) {
                aVar.c(gVar);
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    g<K, V> b2 = aVar.b();
                    if (b2 == null) {
                        break;
                    } else if ((b2.b & length) == 0) {
                        i3++;
                    } else {
                        i4++;
                    }
                }
                bVar.a(i3);
                bVar2.a(i4);
                aVar.c(gVar);
                while (true) {
                    g<K, V> b3 = aVar.b();
                    if (b3 == null) {
                        break;
                    } else if ((b3.b & length) == 0) {
                        bVar.b(b3);
                    } else {
                        bVar2.b(b3);
                    }
                }
                gVarArr2[i2] = i3 > 0 ? bVar.d() : null;
                gVarArr2[i2 + length] = i4 > 0 ? bVar2.d() : null;
            }
        }
        return gVarArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class a<K, V> {
        private g<K, V> e;

        a() {
        }

        void c(g<K, V> gVar) {
            g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.i = gVar2;
                gVar2 = gVar;
                gVar = gVar.e;
            }
            this.e = gVar2;
        }

        public g<K, V> b() {
            g<K, V> gVar = this.e;
            if (gVar == null) {
                return null;
            }
            g<K, V> gVar2 = gVar.i;
            gVar.i = null;
            for (g<K, V> gVar3 = gVar.h; gVar3 != null; gVar3 = gVar3.e) {
                gVar3.i = gVar2;
                gVar2 = gVar3;
            }
            this.e = gVar2;
            return gVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b<K, V> {
        private int b;
        private g<K, V> c;
        private int d;
        private int e;

        b() {
        }

        void a(int i) {
            this.b = ((Integer.highestOneBit(i) * 2) - 1) - i;
            this.d = 0;
            this.e = 0;
            this.c = null;
        }

        void b(g<K, V> gVar) {
            gVar.h = null;
            gVar.i = null;
            gVar.e = null;
            gVar.d = 1;
            int i = this.b;
            if (i > 0) {
                int i2 = this.d;
                if ((i2 & 1) == 0) {
                    this.d = i2 + 1;
                    this.b = i - 1;
                    this.e++;
                }
            }
            gVar.i = this.c;
            this.c = gVar;
            int i3 = this.d;
            int i4 = i3 + 1;
            this.d = i4;
            int i5 = this.b;
            if (i5 > 0 && (i4 & 1) == 0) {
                this.d = i3 + 2;
                this.b = i5 - 1;
                this.e++;
            }
            int i6 = 4;
            while (true) {
                int i7 = i6 - 1;
                if ((this.d & i7) != i7) {
                    return;
                }
                int i8 = this.e;
                if (i8 == 0) {
                    g<K, V> gVar2 = this.c;
                    g<K, V> gVar3 = gVar2.i;
                    g<K, V> gVar4 = gVar3.i;
                    gVar3.i = gVar4.i;
                    this.c = gVar3;
                    gVar3.e = gVar4;
                    gVar3.h = gVar2;
                    gVar3.d = gVar2.d + 1;
                    gVar4.i = gVar3;
                    gVar2.i = gVar3;
                } else {
                    if (i8 == 1) {
                        g<K, V> gVar5 = this.c;
                        g<K, V> gVar6 = gVar5.i;
                        this.c = gVar6;
                        gVar6.h = gVar5;
                        gVar6.d = gVar5.d + 1;
                        gVar5.i = gVar6;
                    } else if (i8 != 2) {
                    }
                    this.e = 0;
                }
                i6 *= 2;
            }
        }

        g<K, V> d() {
            g<K, V> gVar = this.c;
            if (gVar.i == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public abstract class e<T> implements Iterator<T> {
        int a;
        g<K, V> d;
        g<K, V> e = null;

        e() {
            this.d = LinkedHashTreeMap.this.c.a;
            this.a = LinkedHashTreeMap.this.a;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d != LinkedHashTreeMap.this.c;
        }

        final g<K, V> a() {
            g<K, V> gVar = this.d;
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            if (gVar == linkedHashTreeMap.c) {
                throw new NoSuchElementException();
            }
            if (linkedHashTreeMap.a != this.a) {
                throw new ConcurrentModificationException();
            }
            this.d = gVar.a;
            this.e = gVar;
            return gVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            g<K, V> gVar = this.e;
            if (gVar == null) {
                throw new IllegalStateException();
            }
            LinkedHashTreeMap.this.a((g) gVar, true);
            this.e = null;
            this.a = LinkedHashTreeMap.this.a;
        }
    }

    /* loaded from: classes5.dex */
    final class c extends AbstractSet<Map.Entry<K, V>> {
        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedHashTreeMap.this.b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new e() { // from class: com.squareup.moshi.LinkedHashTreeMap.c.2
                {
                    LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
                }

                @Override // java.util.Iterator
                /* renamed from: e */
                public Map.Entry<K, V> next() {
                    return a();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedHashTreeMap.this.a((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            g<K, V> a;
            if ((obj instanceof Map.Entry) && (a = LinkedHashTreeMap.this.a((Map.Entry) obj)) != null) {
                LinkedHashTreeMap.this.a((g) a, true);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedHashTreeMap.this.clear();
        }
    }

    /* loaded from: classes5.dex */
    final class d extends AbstractSet<K> {
        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedHashTreeMap.this.b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new e() { // from class: com.squareup.moshi.LinkedHashTreeMap.d.5
                {
                    LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
                }

                @Override // java.util.Iterator
                public K next() {
                    return a().c;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LinkedHashTreeMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return LinkedHashTreeMap.this.a(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedHashTreeMap.this.clear();
        }
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }
}
