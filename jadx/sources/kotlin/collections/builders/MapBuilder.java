package kotlin.collections.builders;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import o.C8564dqg;
import o.C8627dsp;
import o.C8632dsu;
import o.C8654dtp;
import o.C8657dts;
import o.dpT;
import o.dqB;
import o.dqR;
import o.dqS;
import o.dqU;
import o.dqV;
import o.dsJ;
import o.dsP;

/* loaded from: classes.dex */
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, dsP {
    public static final d a = new d(null);
    private static final MapBuilder d;
    private int[] b;
    private dqS<K, V> c;
    private int e;
    private K[] f;
    private int g;
    private dqR<K> h;
    private int i;
    private boolean j;
    private int k;
    private int l;
    private dqU<V> m;
    private V[] n;

    /* renamed from: o  reason: collision with root package name */
    private int[] f13345o;

    private final void s() {
        this.l++;
    }

    public int f() {
        return this.k;
    }

    public final boolean j() {
        return this.j;
    }

    private MapBuilder(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i, int i2) {
        this.f = kArr;
        this.n = vArr;
        this.f13345o = iArr;
        this.b = iArr2;
        this.g = i;
        this.i = i2;
        this.e = a.a(l());
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return g();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return i();
    }

    @Override // java.util.Map
    public final int size() {
        return f();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return h();
    }

    public MapBuilder() {
        this(8);
    }

    public MapBuilder(int i) {
        this(dqV.e(i), null, new int[i], new int[a.d(i)], 2, 0);
    }

    public final Map<K, V> d() {
        c();
        this.j = true;
        if (size() > 0) {
            return this;
        }
        MapBuilder mapBuilder = d;
        C8632dsu.d(mapBuilder);
        return mapBuilder;
    }

    private final Object writeReplace() {
        if (this.j) {
            return new SerializedMap(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return e((MapBuilder<K, V>) obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return c((MapBuilder<K, V>) obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object obj) {
        int e2 = e((MapBuilder<K, V>) obj);
        if (e2 < 0) {
            return null;
        }
        V[] vArr = this.n;
        C8632dsu.d(vArr);
        return vArr[e2];
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        c();
        int d2 = d((MapBuilder<K, V>) k);
        V[] n = n();
        if (d2 < 0) {
            int i = (-d2) - 1;
            V v2 = n[i];
            n[i] = v;
            return v2;
        }
        n[d2] = v;
        return null;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        C8632dsu.c((Object) map, "");
        c();
        c((Collection) map.entrySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V remove(Object obj) {
        int b2 = b((MapBuilder<K, V>) obj);
        if (b2 < 0) {
            return null;
        }
        V[] vArr = this.n;
        C8632dsu.d(vArr);
        V v = vArr[b2];
        dqV.d(vArr, b2);
        return v;
    }

    @Override // java.util.Map
    public void clear() {
        c();
        dqB it = new C8654dtp(0, this.i - 1).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            int[] iArr = this.f13345o;
            int i = iArr[nextInt];
            if (i >= 0) {
                this.b[i] = 0;
                iArr[nextInt] = -1;
            }
        }
        dqV.d(this.f, 0, this.i);
        V[] vArr = this.n;
        if (vArr != null) {
            dqV.d(vArr, 0, this.i);
        }
        this.k = 0;
        this.i = 0;
        s();
    }

    public Set<K> i() {
        dqR<K> dqr = this.h;
        if (dqr == null) {
            dqR<K> dqr2 = new dqR<>(this);
            this.h = dqr2;
            return dqr2;
        }
        return dqr;
    }

    public Collection<V> h() {
        dqU<V> dqu = this.m;
        if (dqu == null) {
            dqU<V> dqu2 = new dqU<>(this);
            this.m = dqu2;
            return dqu2;
        }
        return dqu;
    }

    public Set<Map.Entry<K, V>> g() {
        dqS<K, V> dqs = this.c;
        if (dqs == null) {
            dqS<K, V> dqs2 = new dqS<>(this);
            this.c = dqs2;
            return dqs2;
        }
        return dqs;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Map) && b((Map) obj));
    }

    @Override // java.util.Map
    public int hashCode() {
        e<K, V> a2 = a();
        int i = 0;
        while (a2.hasNext()) {
            i += a2.e();
        }
        return i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        e<K, V> a2 = a();
        int i = 0;
        while (a2.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            a2.b(sb);
            i++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }

    public final int e() {
        return this.f.length;
    }

    private final int l() {
        return this.b.length;
    }

    public final void c() {
        if (this.j) {
            throw new UnsupportedOperationException();
        }
    }

    private final void d(int i) {
        if (g(i)) {
            b(l());
        } else {
            c(this.i + i);
        }
    }

    private final boolean g(int i) {
        int e2 = e();
        int i2 = this.i;
        int i3 = e2 - i2;
        int size = i2 - size();
        return i3 < i && i3 + size >= i && size >= e() / 4;
    }

    private final void c(int i) {
        if (i < 0) {
            throw new OutOfMemoryError();
        }
        if (i > e()) {
            int d2 = dpT.Companion.d(e(), i);
            this.f = (K[]) dqV.b(this.f, d2);
            V[] vArr = this.n;
            this.n = vArr != null ? (V[]) dqV.b(vArr, d2) : null;
            int[] copyOf = Arrays.copyOf(this.f13345o, d2);
            C8632dsu.a(copyOf, "");
            this.f13345o = copyOf;
            int d3 = a.d(d2);
            if (d3 > l()) {
                b(d3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V[] n() {
        V[] vArr = this.n;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) dqV.e(e());
        this.n = vArr2;
        return vArr2;
    }

    private final int j(K k) {
        return ((k != null ? k.hashCode() : 0) * (-1640531527)) >>> this.e;
    }

    private final void m() {
        int i;
        V[] vArr = this.n;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.i;
            if (i2 >= i) {
                break;
            }
            if (this.f13345o[i2] >= 0) {
                K[] kArr = this.f;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                i3++;
            }
            i2++;
        }
        dqV.d(this.f, i3, i);
        if (vArr != null) {
            dqV.d(vArr, i3, this.i);
        }
        this.i = i3;
    }

    private final void b(int i) {
        s();
        if (this.i > size()) {
            m();
        }
        if (i != l()) {
            this.b = new int[i];
            this.e = a.a(i);
        } else {
            C8564dqg.c(this.b, 0, 0, l());
        }
        for (int i2 = 0; i2 < this.i; i2++) {
            if (!e(i2)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    private final boolean e(int i) {
        int j = j((MapBuilder<K, V>) this.f[i]);
        int i2 = this.g;
        while (true) {
            int[] iArr = this.b;
            if (iArr[j] == 0) {
                iArr[j] = i + 1;
                this.f13345o[i] = j;
                return true;
            }
            i2--;
            if (i2 < 0) {
                return false;
            }
            j = j == 0 ? l() - 1 : j - 1;
        }
    }

    private final int e(K k) {
        int j = j((MapBuilder<K, V>) k);
        int i = this.g;
        while (true) {
            int i2 = this.b[j];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (C8632dsu.c(this.f[i3], k)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            j = j == 0 ? l() - 1 : j - 1;
        }
    }

    private final int c(V v) {
        int i = this.i;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f13345o[i] >= 0) {
                V[] vArr = this.n;
                C8632dsu.d(vArr);
                if (C8632dsu.c(vArr[i], v)) {
                    return i;
                }
            }
        }
    }

    public final int d(K k) {
        int i;
        c();
        while (true) {
            int j = j((MapBuilder<K, V>) k);
            i = C8657dts.i(this.g * 2, l() / 2);
            int i2 = 0;
            while (true) {
                int i3 = this.b[j];
                if (i3 <= 0) {
                    if (this.i >= e()) {
                        d(1);
                    } else {
                        int i4 = this.i;
                        int i5 = i4 + 1;
                        this.i = i5;
                        this.f[i4] = k;
                        this.f13345o[i4] = j;
                        this.b[j] = i5;
                        this.k = size() + 1;
                        s();
                        if (i2 > this.g) {
                            this.g = i2;
                        }
                        return i4;
                    }
                } else if (C8632dsu.c(this.f[i3 - 1], k)) {
                    return -i3;
                } else {
                    i2++;
                    if (i2 > i) {
                        b(l() * 2);
                        break;
                    }
                    j = j == 0 ? l() - 1 : j - 1;
                }
            }
        }
    }

    public final int b(K k) {
        c();
        int e2 = e((MapBuilder<K, V>) k);
        if (e2 < 0) {
            return -1;
        }
        h(e2);
        return e2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(int i) {
        dqV.d(this.f, i);
        a(this.f13345o[i]);
        this.f13345o[i] = -1;
        this.k = size() - 1;
        s();
    }

    private final void a(int i) {
        int i2;
        i2 = C8657dts.i(this.g * 2, l() / 2);
        int i3 = i2;
        int i4 = 0;
        int i5 = i;
        do {
            i = i == 0 ? l() - 1 : i - 1;
            i4++;
            if (i4 > this.g) {
                this.b[i5] = 0;
                return;
            }
            int[] iArr = this.b;
            int i6 = iArr[i];
            if (i6 == 0) {
                iArr[i5] = 0;
                return;
            }
            if (i6 < 0) {
                iArr[i5] = -1;
            } else {
                int i7 = i6 - 1;
                if (((j((MapBuilder<K, V>) this.f[i7]) - i) & (l() - 1)) >= i4) {
                    this.b[i5] = i6;
                    this.f13345o[i7] = i5;
                }
                i3--;
            }
            i5 = i;
            i4 = 0;
            i3--;
        } while (i3 >= 0);
        this.b[i5] = -1;
    }

    public final boolean c(Map.Entry<? extends K, ? extends V> entry) {
        C8632dsu.c((Object) entry, "");
        int e2 = e((MapBuilder<K, V>) entry.getKey());
        if (e2 < 0) {
            return false;
        }
        V[] vArr = this.n;
        C8632dsu.d(vArr);
        return C8632dsu.c(vArr[e2], entry.getValue());
    }

    private final boolean b(Map<?, ?> map) {
        return size() == map.size() && d((Collection<?>) map.entrySet());
    }

    public final boolean d(Collection<?> collection) {
        C8632dsu.c((Object) collection, "");
        for (Object obj : collection) {
            if (obj == null) {
                return false;
            }
            try {
                if (!c((Map.Entry) ((Map.Entry) obj))) {
                    return false;
                }
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return true;
    }

    private final boolean d(Map.Entry<? extends K, ? extends V> entry) {
        int d2 = d((MapBuilder<K, V>) entry.getKey());
        V[] n = n();
        if (d2 >= 0) {
            n[d2] = entry.getValue();
            return true;
        }
        int i = (-d2) - 1;
        if (C8632dsu.c(entry.getValue(), n[i])) {
            return false;
        }
        n[i] = entry.getValue();
        return true;
    }

    private final boolean c(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        d(collection.size());
        for (Map.Entry<? extends K, ? extends V> entry : collection) {
            if (d((Map.Entry) entry)) {
                z = true;
            }
        }
        return z;
    }

    public final boolean a(Map.Entry<? extends K, ? extends V> entry) {
        C8632dsu.c((Object) entry, "");
        c();
        int e2 = e((MapBuilder<K, V>) entry.getKey());
        if (e2 < 0) {
            return false;
        }
        V[] vArr = this.n;
        C8632dsu.d(vArr);
        if (C8632dsu.c(vArr[e2], entry.getValue())) {
            h(e2);
            return true;
        }
        return false;
    }

    public final boolean a(V v) {
        c();
        int c2 = c((MapBuilder<K, V>) v);
        if (c2 < 0) {
            return false;
        }
        h(c2);
        return true;
    }

    public final a<K, V> o() {
        return new a<>(this);
    }

    public final f<K, V> k() {
        return new f<>(this);
    }

    public final e<K, V> a() {
        return new e<>(this);
    }

    /* loaded from: classes5.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final MapBuilder b() {
            return MapBuilder.d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int i) {
            int b;
            b = C8657dts.b(i, 1);
            return Integer.highestOneBit(b * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int a(int i) {
            return Integer.numberOfLeadingZeros(i) + 1;
        }
    }

    static {
        MapBuilder mapBuilder = new MapBuilder(0);
        mapBuilder.j = true;
        d = mapBuilder;
    }

    /* loaded from: classes5.dex */
    public static class b<K, V> {
        private int a;
        private int b;
        private final MapBuilder<K, V> c;
        private int d;

        public final int a() {
            return this.d;
        }

        public final int b() {
            return this.b;
        }

        public final void c(int i) {
            this.b = i;
        }

        public final void e(int i) {
            this.d = i;
        }

        public final MapBuilder<K, V> h() {
            return this.c;
        }

        public b(MapBuilder<K, V> mapBuilder) {
            C8632dsu.c((Object) mapBuilder, "");
            this.c = mapBuilder;
            this.b = -1;
            this.a = ((MapBuilder) mapBuilder).l;
            g();
        }

        public final void g() {
            while (this.d < ((MapBuilder) this.c).i) {
                int[] iArr = ((MapBuilder) this.c).f13345o;
                int i = this.d;
                if (iArr[i] >= 0) {
                    return;
                }
                this.d = i + 1;
            }
        }

        public final boolean hasNext() {
            return this.d < ((MapBuilder) this.c).i;
        }

        public final void remove() {
            d();
            if (this.b == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
            }
            this.c.c();
            this.c.h(this.b);
            this.b = -1;
            this.a = ((MapBuilder) this.c).l;
        }

        public final void d() {
            if (((MapBuilder) this.c).l != this.a) {
                throw new ConcurrentModificationException();
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class a<K, V> extends b<K, V> implements Iterator<K>, dsJ {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            C8632dsu.c((Object) mapBuilder, "");
        }

        @Override // java.util.Iterator
        public K next() {
            d();
            if (a() >= ((MapBuilder) h()).i) {
                throw new NoSuchElementException();
            }
            int a = a();
            e(a + 1);
            c(a);
            K k = (K) ((MapBuilder) h()).f[b()];
            g();
            return k;
        }
    }

    /* loaded from: classes5.dex */
    public static final class f<K, V> extends b<K, V> implements Iterator<V>, dsJ {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            C8632dsu.c((Object) mapBuilder, "");
        }

        @Override // java.util.Iterator
        public V next() {
            d();
            if (a() >= ((MapBuilder) h()).i) {
                throw new NoSuchElementException();
            }
            int a = a();
            e(a + 1);
            c(a);
            Object[] objArr = ((MapBuilder) h()).n;
            C8632dsu.d(objArr);
            V v = (V) objArr[b()];
            g();
            return v;
        }
    }

    /* loaded from: classes5.dex */
    public static final class e<K, V> extends b<K, V> implements Iterator<Map.Entry<K, V>>, dsJ {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            C8632dsu.c((Object) mapBuilder, "");
        }

        @Override // java.util.Iterator
        /* renamed from: c */
        public c<K, V> next() {
            d();
            if (a() >= ((MapBuilder) h()).i) {
                throw new NoSuchElementException();
            }
            int a = a();
            e(a + 1);
            c(a);
            c<K, V> cVar = new c<>(h(), b());
            g();
            return cVar;
        }

        public final int e() {
            if (a() >= ((MapBuilder) h()).i) {
                throw new NoSuchElementException();
            }
            int a = a();
            e(a + 1);
            c(a);
            Object obj = ((MapBuilder) h()).f[b()];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = ((MapBuilder) h()).n;
            C8632dsu.d(objArr);
            Object obj2 = objArr[b()];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            g();
            return hashCode ^ hashCode2;
        }

        public final void b(StringBuilder sb) {
            C8632dsu.c((Object) sb, "");
            if (a() >= ((MapBuilder) h()).i) {
                throw new NoSuchElementException();
            }
            int a = a();
            e(a + 1);
            c(a);
            Object obj = ((MapBuilder) h()).f[b()];
            if (obj == h()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = ((MapBuilder) h()).n;
            C8632dsu.d(objArr);
            Object obj2 = objArr[b()];
            if (obj2 == h()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            g();
        }
    }

    /* loaded from: classes5.dex */
    public static final class c<K, V> implements Map.Entry<K, V>, dsP.b {
        private final int a;
        private final MapBuilder<K, V> d;

        public c(MapBuilder<K, V> mapBuilder, int i) {
            C8632dsu.c((Object) mapBuilder, "");
            this.d = mapBuilder;
            this.a = i;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) ((MapBuilder) this.d).f[this.a];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            Object[] objArr = ((MapBuilder) this.d).n;
            C8632dsu.d(objArr);
            return (V) objArr[this.a];
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            this.d.c();
            Object[] n = this.d.n();
            int i = this.a;
            V v2 = (V) n[i];
            n[i] = v;
            return v2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (C8632dsu.c(entry.getKey(), getKey()) && C8632dsu.c(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }
}
