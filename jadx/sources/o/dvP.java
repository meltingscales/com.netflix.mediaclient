package o;

import java.util.Map;
import java.util.Set;
import o.C8632dsu;
import o.duY;
import o.dvI;

/* loaded from: classes5.dex */
public final class dvP<K, V> extends dpX<K, V> implements duY<K, V> {
    private static final dvP b;
    public static final d c = new d(null);
    private final Object a;
    private final C8710dvr<K, dvI<V>> d;
    private final Object e;

    public final C8710dvr<K, dvI<V>> b() {
        return this.d;
    }

    public final Object c() {
        return this.a;
    }

    public final Object i() {
        return this.e;
    }

    public dvP(Object obj, Object obj2, C8710dvr<K, dvI<V>> c8710dvr) {
        C8632dsu.c((Object) c8710dvr, "");
        this.a = obj;
        this.e = obj2;
        this.d = c8710dvr;
    }

    @Override // o.dpX
    public int getSize() {
        return this.d.size();
    }

    @Override // o.dpX
    /* renamed from: e */
    public duV<K> getKeys() {
        return new C8720dwa(this);
    }

    @Override // o.dpX
    /* renamed from: g */
    public duR<V> getValues() {
        return new C8724dwe(this);
    }

    private final duV<Map.Entry<K, V>> h() {
        return new dvZ(this);
    }

    @Override // o.dpX
    public final Set<Map.Entry<K, V>> getEntries() {
        return h();
    }

    @Override // o.dpX, java.util.Map
    public boolean containsKey(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // o.dpX, java.util.Map
    public V get(Object obj) {
        dvI<V> dvi = this.d.get(obj);
        if (dvi == null) {
            return null;
        }
        return dvi.c();
    }

    @Override // o.duY
    public duY.d<K, V> a() {
        return new dvM(this);
    }

    @Override // o.dpX, java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            if (map instanceof dvP) {
                return this.d.d().c((dvG<K, dvI<V>>) ((dvP) obj).d.d(), new drX<dvI<V>, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap$equals$1
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
                return this.d.d().c((dvG<K, dvI<V>>) ((dvM) obj).d().e(), new drX<dvI<V>, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap$equals$2
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
                return this.d.d().c(((C8710dvr) obj).d(), new drX<dvI<V>, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap$equals$3
                    @Override // o.drX
                    /* renamed from: a */
                    public final Boolean invoke(dvI<V> dvi, Object obj2) {
                        C8632dsu.c((Object) dvi, "");
                        return Boolean.valueOf(C8632dsu.c(dvi.c(), obj2));
                    }
                });
            }
            if (map instanceof C8707dvo) {
                return this.d.d().c(((C8707dvo) obj).e(), new drX<dvI<V>, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap$equals$4
                    @Override // o.drX
                    /* renamed from: b */
                    public final Boolean invoke(dvI<V> dvi, Object obj2) {
                        C8632dsu.c((Object) dvi, "");
                        return Boolean.valueOf(C8632dsu.c(dvi.c(), obj2));
                    }
                });
            }
            return super.equals(obj);
        }
        return false;
    }

    @Override // o.dpX, java.util.Map
    public int hashCode() {
        return super.hashCode();
    }

    /* loaded from: classes5.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final <K, V> dvP<K, V> a() {
            return dvP.b;
        }
    }

    static {
        C8723dwd c8723dwd = C8723dwd.b;
        b = new dvP(c8723dwd, c8723dwd, C8710dvr.e.e());
    }

    @Override // o.duY
    public duY<K, V> b(Map<? extends K, ? extends V> map) {
        C8632dsu.c((Object) map, "");
        duY.d<K, V> a = a();
        a.putAll(map);
        return a.c();
    }
}
