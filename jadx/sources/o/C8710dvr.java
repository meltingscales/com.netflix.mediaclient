package o;

import java.util.Map;
import java.util.Set;
import o.C8632dsu;
import o.duY;
import o.dvI;

/* renamed from: o.dvr  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8710dvr<K, V> extends dpX<K, V> implements duY<K, V> {
    private final int c;
    private final dvG<K, V> d;
    public static final a e = new a(null);
    private static final C8710dvr a = new C8710dvr(dvG.a.b(), 0);

    public final dvG<K, V> d() {
        return this.d;
    }

    @Override // o.dpX
    public int getSize() {
        return this.c;
    }

    public C8710dvr(dvG<K, V> dvg, int i) {
        C8632dsu.c((Object) dvg, "");
        this.d = dvg;
        this.c = i;
    }

    @Override // o.dpX
    /* renamed from: e */
    public duV<K> getKeys() {
        return new dvA(this);
    }

    @Override // o.dpX
    /* renamed from: j */
    public duR<V> getValues() {
        return new dvF(this);
    }

    private final duV<Map.Entry<K, V>> h() {
        return new C8716dvx(this);
    }

    @Override // o.dpX
    public final Set<Map.Entry<K, V>> getEntries() {
        return h();
    }

    @Override // o.dpX, java.util.Map
    public boolean containsKey(Object obj) {
        return this.d.d(obj == null ? 0 : obj.hashCode(), (int) obj, 0);
    }

    @Override // o.dpX, java.util.Map
    public V get(Object obj) {
        return this.d.e(obj == null ? 0 : obj.hashCode(), (int) obj, 0);
    }

    @Override // o.duY
    /* renamed from: b */
    public C8707dvo<K, V> a() {
        return new C8707dvo<>(this);
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
                return this.d.c((dvG<K, dvI<V>>) ((dvP) obj).b().d, new drX<V, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap$equals$1
                    @Override // o.drX
                    /* renamed from: c */
                    public final Boolean invoke(V v, dvI<? extends Object> dvi) {
                        C8632dsu.c((Object) dvi, "");
                        return Boolean.valueOf(C8632dsu.c(v, dvi.c()));
                    }
                });
            }
            if (map instanceof dvM) {
                return this.d.c((dvG<K, dvI<V>>) ((dvM) obj).d().e(), new drX<V, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap$equals$2
                    @Override // o.drX
                    /* renamed from: d */
                    public final Boolean invoke(V v, dvI<? extends Object> dvi) {
                        C8632dsu.c((Object) dvi, "");
                        return Boolean.valueOf(C8632dsu.c(v, dvi.c()));
                    }
                });
            }
            if (map instanceof C8710dvr) {
                return this.d.c((dvG<K, V>) ((C8710dvr) obj).d, new drX<V, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap$equals$3
                    @Override // o.drX
                    /* renamed from: c */
                    public final Boolean invoke(V v, Object obj2) {
                        return Boolean.valueOf(C8632dsu.c(v, obj2));
                    }
                });
            }
            if (map instanceof C8707dvo) {
                return this.d.c(((C8707dvo) obj).e(), new drX<V, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap$equals$4
                    @Override // o.drX
                    /* renamed from: b */
                    public final Boolean invoke(V v, Object obj2) {
                        return Boolean.valueOf(C8632dsu.c(v, obj2));
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

    /* renamed from: o.dvr$a */
    /* loaded from: classes5.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final <K, V> C8710dvr<K, V> e() {
            return C8710dvr.a;
        }
    }

    @Override // o.duY
    public duY<K, V> b(Map<? extends K, ? extends V> map) {
        C8632dsu.c((Object) map, "");
        duY.d<K, V> a2 = a();
        a2.putAll(map);
        return a2.c();
    }
}
