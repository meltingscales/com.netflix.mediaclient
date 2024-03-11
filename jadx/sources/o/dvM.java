package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import o.C8632dsu;
import o.duY;
import o.dvI;

/* loaded from: classes5.dex */
public final class dvM<K, V> extends AbstractC8559dqb<K, V> implements duY.d<K, V> {
    private dvP<K, V> a;
    private Object b;
    private Object c;
    private final C8707dvo<K, dvI<V>> e;

    public final Object b() {
        return this.c;
    }

    public final C8707dvo<K, dvI<V>> d() {
        return this.e;
    }

    public dvM(dvP<K, V> dvp) {
        C8632dsu.c((Object) dvp, "");
        this.a = dvp;
        this.c = dvp.c();
        this.b = this.a.i();
        this.e = this.a.b().a();
    }

    @Override // o.AbstractC8559dqb
    public int getSize() {
        return this.e.size();
    }

    @Override // o.duY.d
    public duY<K, V> c() {
        dvP<K, V> dvp;
        C8710dvr<K, dvI<V>> c = this.e.c();
        if (c == this.a.b()) {
            C8725dwf.d(this.c == this.a.c());
            C8725dwf.d(this.b == this.a.i());
            dvp = this.a;
        } else {
            dvp = new dvP<>(this.c, this.b, c);
        }
        this.a = dvp;
        return dvp;
    }

    @Override // o.AbstractC8559dqb
    public Set<Map.Entry<K, V>> getEntries() {
        return new dvN(this);
    }

    @Override // o.AbstractC8559dqb
    public Set<K> getKeys() {
        return new dvT(this);
    }

    @Override // o.AbstractC8559dqb
    public Collection<V> getValues() {
        return new dvS(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.e.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        dvI<V> dvi = this.e.get(obj);
        if (dvi == null) {
            return null;
        }
        return dvi.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        dvI<V> dvi = this.e.get(k);
        if (dvi != null) {
            if (dvi.c() == v) {
                return v;
            }
            this.e.put(k, dvi.e(v));
            return dvi.c();
        } else if (isEmpty()) {
            this.c = k;
            this.b = k;
            this.e.put(k, new dvI<>(v));
            return null;
        } else {
            Object obj = this.b;
            dvI<V> dvi2 = this.e.get(obj);
            C8632dsu.d(dvi2);
            dvI<V> dvi3 = dvi2;
            C8725dwf.d(!dvi3.a());
            this.e.put(obj, dvi3.c(k));
            this.e.put(k, new dvI<>(v, obj));
            this.b = k;
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        dvI<V> remove = this.e.remove(obj);
        if (remove == null) {
            return null;
        }
        if (remove.d()) {
            dvI<V> dvi = this.e.get(remove.e());
            C8632dsu.d(dvi);
            this.e.put(remove.e(), dvi.c(remove.b()));
        } else {
            this.c = remove.b();
        }
        if (remove.a()) {
            dvI<V> dvi2 = this.e.get(remove.b());
            C8632dsu.d(dvi2);
            this.e.put(remove.b(), dvi2.a(remove.e()));
        } else {
            this.b = remove.e();
        }
        return remove.c();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        dvI<V> dvi = this.e.get(obj);
        if (dvi != null && C8632dsu.c(dvi.c(), obj2)) {
            remove(obj);
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.e.clear();
        C8723dwd c8723dwd = C8723dwd.b;
        this.c = c8723dwd;
        this.b = c8723dwd;
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
            if (map instanceof dvP) {
                return this.e.e().c((dvG<K, dvI<V>>) ((dvP) obj).b().d(), new drX<dvI<V>, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder$equals$1
                    @Override // o.drX
                    /* renamed from: b */
                    public final Boolean invoke(dvI<V> dvi, dvI<? extends Object> dvi2) {
                        C8632dsu.c((Object) dvi, "");
                        C8632dsu.c((Object) dvi2, "");
                        return Boolean.valueOf(C8632dsu.c(dvi.c(), dvi2.c()));
                    }
                });
            }
            if (map instanceof dvM) {
                return this.e.e().c((dvG<K, dvI<V>>) ((dvM) obj).e.e(), new drX<dvI<V>, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder$equals$2
                    @Override // o.drX
                    /* renamed from: d */
                    public final Boolean invoke(dvI<V> dvi, dvI<? extends Object> dvi2) {
                        C8632dsu.c((Object) dvi, "");
                        C8632dsu.c((Object) dvi2, "");
                        return Boolean.valueOf(C8632dsu.c(dvi.c(), dvi2.c()));
                    }
                });
            }
            if (map instanceof C8710dvr) {
                return this.e.e().c(((C8710dvr) obj).d(), new drX<dvI<V>, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder$equals$3
                    @Override // o.drX
                    /* renamed from: d */
                    public final Boolean invoke(dvI<V> dvi, Object obj2) {
                        C8632dsu.c((Object) dvi, "");
                        return Boolean.valueOf(C8632dsu.c(dvi.c(), obj2));
                    }
                });
            }
            if (map instanceof C8707dvo) {
                return this.e.e().c(((C8707dvo) obj).e(), new drX<dvI<V>, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder$equals$4
                    @Override // o.drX
                    /* renamed from: d */
                    public final Boolean invoke(dvI<V> dvi, Object obj2) {
                        C8632dsu.c((Object) dvi, "");
                        return Boolean.valueOf(C8632dsu.c(dvi.c(), obj2));
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
