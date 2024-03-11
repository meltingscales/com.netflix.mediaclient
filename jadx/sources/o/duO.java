package o;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import o.duT;
import o.duY;

/* loaded from: classes5.dex */
public final class duO {
    public static final <E> duT<E> a(duT<? extends E> dut, Iterable<? extends E> iterable) {
        C8632dsu.c((Object) dut, "");
        C8632dsu.c((Object) iterable, "");
        if (iterable instanceof Collection) {
            return (duT<? extends E>) dut.c((Collection) iterable);
        }
        duT.e<? extends E> e = dut.e();
        C8571dqn.b(e, iterable);
        return (duT<? extends E>) e.d();
    }

    public static final <E> duT<E> b(E... eArr) {
        List p;
        C8632dsu.c((Object) eArr, "");
        duT d = C8705dvm.d();
        p = C8564dqg.p(eArr);
        return d.c(p);
    }

    public static final <E> duT<E> e() {
        return C8705dvm.d();
    }

    public static final <K, V> duY<K, V> a() {
        return dvP.c.a();
    }

    public static final <T> duS<T> a(Iterable<? extends T> iterable) {
        C8632dsu.c((Object) iterable, "");
        duS<T> dus = iterable instanceof duS ? (duS) iterable : null;
        return dus == null ? b(iterable) : dus;
    }

    public static final <T> duS<T> c(dtQ<? extends T> dtq) {
        C8632dsu.c((Object) dtq, "");
        return b(dtq);
    }

    public static final <T> duT<T> b(Iterable<? extends T> iterable) {
        C8632dsu.c((Object) iterable, "");
        duT<T> dut = iterable instanceof duT ? (duT) iterable : null;
        if (dut == null) {
            duT.e eVar = iterable instanceof duT.e ? (duT.e) iterable : null;
            duT<T> d = eVar != null ? eVar.d() : null;
            return d == null ? a(e(), iterable) : d;
        }
        return dut;
    }

    public static final <T> duT<T> b(dtQ<? extends T> dtq) {
        C8632dsu.c((Object) dtq, "");
        return a(e(), dtq);
    }

    public static final <K, V> duU<K, V> e(Map<K, ? extends V> map) {
        C8632dsu.c((Object) map, "");
        duU<K, V> duu = map instanceof duU ? (duU) map : null;
        if (duu == null) {
            duY.d dVar = map instanceof duY.d ? (duY.d) map : null;
            duY<K, V> c = dVar != null ? dVar.c() : null;
            return c == null ? a().b(map) : c;
        }
        return duu;
    }

    public static final <E> duT<E> a(duT<? extends E> dut, dtQ<? extends E> dtq) {
        C8632dsu.c((Object) dut, "");
        C8632dsu.c((Object) dtq, "");
        duT.e<? extends E> e = dut.e();
        C8571dqn.b(e, dtq);
        return (duT<? extends E>) e.d();
    }
}
