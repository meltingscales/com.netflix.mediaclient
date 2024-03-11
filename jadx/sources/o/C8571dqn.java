package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.dqn  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8571dqn extends C8575dqr {
    public static <T> boolean b(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C8632dsu.c((Object) collection, "");
        C8632dsu.c((Object) iterable, "");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.add((T) it.next())) {
                z = true;
            }
        }
        return z;
    }

    public static <T> boolean b(Collection<? super T> collection, dtQ<? extends T> dtq) {
        C8632dsu.c((Object) collection, "");
        C8632dsu.c((Object) dtq, "");
        Iterator<? extends T> it = dtq.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.add((T) it.next())) {
                z = true;
            }
        }
        return z;
    }

    public static <T> boolean e(Collection<? super T> collection, T[] tArr) {
        List p;
        C8632dsu.c((Object) collection, "");
        C8632dsu.c((Object) tArr, "");
        p = C8564dqg.p(tArr);
        return collection.addAll(p);
    }

    public static <T> Collection<T> z(Iterable<? extends T> iterable) {
        List U;
        C8632dsu.c((Object) iterable, "");
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        U = C8576dqs.U(iterable);
        return U;
    }

    public static <T> boolean f(Collection<? super T> collection, Iterable<? extends T> iterable) {
        Collection<?> z;
        C8632dsu.c((Object) collection, "");
        C8632dsu.c((Object) iterable, "");
        z = z(iterable);
        return collection.removeAll(z);
    }

    public static <T> boolean j(Collection<? super T> collection, Iterable<? extends T> iterable) {
        Collection<?> z;
        C8632dsu.c((Object) collection, "");
        C8632dsu.c((Object) iterable, "");
        z = z(iterable);
        return collection.retainAll(z);
    }

    public static <T> boolean e(Iterable<? extends T> iterable, drM<? super T, Boolean> drm) {
        C8632dsu.c((Object) iterable, "");
        C8632dsu.c((Object) drm, "");
        return c((Iterable) iterable, (drM) drm, true);
    }

    private static final <T> boolean c(Iterable<? extends T> iterable, drM<? super T, Boolean> drm, boolean z) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (drm.invoke((T) it.next()).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static <T> T r(List<T> list) {
        C8632dsu.c((Object) list, "");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static <T> T p(List<T> list) {
        C8632dsu.c((Object) list, "");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static <T> T v(List<T> list) {
        int t;
        C8632dsu.c((Object) list, "");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        t = C8569dql.t(list);
        return list.remove(t);
    }

    public static <T> boolean a(List<T> list, drM<? super T, Boolean> drm) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) drm, "");
        return a(list, drm, true);
    }

    private static final <T> boolean a(List<T> list, drM<? super T, Boolean> drm, boolean z) {
        int t;
        int t2;
        if (!(list instanceof RandomAccess)) {
            C8632dsu.d(list);
            return c(dsH.c(list), drm, z);
        }
        t = C8569dql.t(list);
        dqB it = new C8654dtp(0, t).iterator();
        int i = 0;
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            T t3 = list.get(nextInt);
            if (drm.invoke(t3).booleanValue() != z) {
                if (i != nextInt) {
                    list.set(i, t3);
                }
                i++;
            }
        }
        if (i >= list.size()) {
            return false;
        }
        t2 = C8569dql.t(list);
        if (i > t2) {
            return true;
        }
        while (true) {
            list.remove(t2);
            if (t2 == i) {
                return true;
            }
            t2--;
        }
    }
}
