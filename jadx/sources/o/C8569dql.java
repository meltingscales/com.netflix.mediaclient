package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;

/* renamed from: o.dql */
/* loaded from: classes.dex */
public class C8569dql extends C8566dqi {
    public static final <T> Collection<T> g(T[] tArr) {
        C8632dsu.c((Object) tArr, "");
        return new dpZ(tArr, false);
    }

    public static <T> List<T> i() {
        return EmptyList.b;
    }

    public static <T> List<T> j(T... tArr) {
        List<T> i;
        List<T> p;
        C8632dsu.c((Object) tArr, "");
        if (tArr.length > 0) {
            p = C8564dqg.p(tArr);
            return p;
        }
        i = i();
        return i;
    }

    public static <T> List<T> f(T... tArr) {
        C8632dsu.c((Object) tArr, "");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new dpZ(tArr, true));
    }

    public static <T> ArrayList<T> a(T... tArr) {
        C8632dsu.c((Object) tArr, "");
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new dpZ(tArr, true));
    }

    public static <T> List<T> i(T... tArr) {
        List<T> u;
        C8632dsu.c((Object) tArr, "");
        u = C8563dqf.u(tArr);
        return u;
    }

    public static C8654dtp f(Collection<?> collection) {
        C8632dsu.c((Object) collection, "");
        return new C8654dtp(0, collection.size() - 1);
    }

    public static <T> int t(List<? extends T> list) {
        C8632dsu.c((Object) list, "");
        return list.size() - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> q(List<? extends T> list) {
        List<T> i;
        List<T> e;
        C8632dsu.c((Object) list, "");
        int size = list.size();
        if (size == 0) {
            i = i();
            return i;
        } else if (size != 1) {
            return list;
        } else {
            e = C8566dqi.e(list.get(0));
            return e;
        }
    }

    public static /* synthetic */ int b(List list, Comparable comparable, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return e(list, comparable, i, i2);
    }

    public static final <T extends Comparable<? super T>> int e(List<? extends T> list, T t, int i, int i2) {
        int compareValues;
        C8632dsu.c((Object) list, "");
        c(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(list.get(i4), t);
            if (compareValues < 0) {
                i = i4 + 1;
            } else if (compareValues <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    public static /* synthetic */ int a(List list, int i, int i2, drM drm, int i3, Object obj) {
        int e;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = list.size();
        }
        e = e(list, i, i2, drm);
        return e;
    }

    public static <T> int e(List<? extends T> list, int i, int i2, drM<? super T, Integer> drm) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) drm, "");
        c(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int intValue = drm.invoke((T) list.get(i4)).intValue();
            if (intValue < 0) {
                i = i4 + 1;
            } else if (intValue <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    private static final void c(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException("fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
        } else if (i2 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i2 + ") is less than zero.");
        } else if (i3 <= i) {
        } else {
            throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i + ").");
        }
    }

    public static void h() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static void f() {
        throw new ArithmeticException("Count overflow has happened.");
    }
}
