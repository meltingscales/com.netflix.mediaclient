package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import o.C8632dsu;
import o.duY;
import o.dvI;

/* renamed from: o.dvo  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8707dvo<K, V> extends AbstractC8559dqb<K, V> implements duY.d<K, V> {
    private C8729dwj a;
    private V b;
    private int c;
    private C8710dvr<K, V> d;
    private dvG<K, V> e;
    private int g;

    public final int a() {
        return this.c;
    }

    public void a(int i) {
        this.g = i;
        this.c++;
    }

    public final void b(int i) {
        this.c = i;
    }

    public final C8729dwj d() {
        return this.a;
    }

    public final void d(V v) {
        this.b = v;
    }

    public final dvG<K, V> e() {
        return this.e;
    }

    @Override // o.AbstractC8559dqb
    public int getSize() {
        return this.g;
    }

    public C8707dvo(C8710dvr<K, V> c8710dvr) {
        C8632dsu.c((Object) c8710dvr, "");
        this.d = c8710dvr;
        this.a = new C8729dwj();
        this.e = this.d.d();
        this.g = this.d.size();
    }

    @Override // o.duY.d
    /* renamed from: b */
    public C8710dvr<K, V> c() {
        C8710dvr<K, V> c8710dvr;
        if (this.e == this.d.d()) {
            c8710dvr = this.d;
        } else {
            this.a = new C8729dwj();
            c8710dvr = new C8710dvr<>(this.e, size());
        }
        this.d = c8710dvr;
        return c8710dvr;
    }

    @Override // o.AbstractC8559dqb
    public Set<Map.Entry<K, V>> getEntries() {
        return new C8711dvs(this);
    }

    @Override // o.AbstractC8559dqb
    public Set<K> getKeys() {
        return new C8712dvt(this);
    }

    @Override // o.AbstractC8559dqb
    public Collection<V> getValues() {
        return new C8714dvv(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.e.d(obj == null ? 0 : obj.hashCode(), (int) obj, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        return this.e.e(obj == null ? 0 : obj.hashCode(), (int) obj, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        this.b = null;
        this.e = this.e.b(k == null ? 0 : k.hashCode(), k, v, 0, this);
        return this.b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        C8632dsu.c((Object) map, "");
        C8710dvr<K, V> c8710dvr = map instanceof C8710dvr ? (C8710dvr) map : null;
        if (c8710dvr == null) {
            C8707dvo c8707dvo = map instanceof C8707dvo ? (C8707dvo) map : null;
            c8710dvr = c8707dvo == null ? null : c8707dvo.c();
        }
        if (c8710dvr != null) {
            C8722dwc c8722dwc = new C8722dwc(0, 1, null);
            int size = size();
            this.e = this.e.b(c8710dvr.d(), 0, c8722dwc, this);
            int size2 = (c8710dvr.size() + size) - c8722dwc.d();
            if (size != size2) {
                a(size2);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        this.b = null;
        dvG d = this.e.d(obj == null ? 0 : obj.hashCode(), obj, 0, this);
        if (d == null) {
            d = dvG.a.b();
        }
        this.e = d;
        return this.b;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        dvG c = this.e.c(obj == null ? 0 : obj.hashCode(), obj, obj2, 0, this);
        if (c == null) {
            c = dvG.a.b();
        }
        this.e = c;
        return size != size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.e = dvG.a.b();
        a(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map<?, ?> map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            if (map instanceof C8710dvr) {
                return this.e.c(((C8710dvr) obj).d(), new drX<V, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder$equals$1
                    @Override // o.drX
                    /* renamed from: a */
                    public final Boolean invoke(V v, Object obj2) {
                        return Boolean.valueOf(C8632dsu.c(v, obj2));
                    }
                });
            }
            if (map instanceof C8707dvo) {
                return this.e.c((dvG<K, V>) ((C8707dvo) obj).e, new drX<V, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder$equals$2
                    @Override // o.drX
                    /* renamed from: e */
                    public final Boolean invoke(V v, Object obj2) {
                        return Boolean.valueOf(C8632dsu.c(v, obj2));
                    }
                });
            }
            if (map instanceof dvP) {
                return this.e.c((dvG<K, dvI<V>>) ((dvP) obj).b().d(), new drX<V, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder$equals$3
                    @Override // o.drX
                    /* renamed from: a */
                    public final Boolean invoke(V v, dvI<? extends Object> dvi) {
                        C8632dsu.c((Object) dvi, "");
                        return Boolean.valueOf(C8632dsu.c(v, dvi.c()));
                    }
                });
            }
            if (map instanceof dvM) {
                return this.e.c((dvG<K, dvI<V>>) ((dvM) obj).d().e, new drX<V, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder$equals$4
                    @Override // o.drX
                    /* renamed from: d */
                    public final Boolean invoke(V v, dvI<? extends Object> dvi) {
                        C8632dsu.c((Object) dvi, "");
                        return Boolean.valueOf(C8632dsu.c(v, dvi.c()));
                    }
                });
            }
            return C8726dwg.c.e(this, map);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return C8726dwg.c.e(this);
    }
}
