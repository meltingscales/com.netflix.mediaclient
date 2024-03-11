package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Pair;
import kotlin.random.Random;

/* renamed from: o.dqs */
/* loaded from: classes.dex */
public class C8576dqs extends C8580dqw {

    /* renamed from: o.dqs$d */
    /* loaded from: classes.dex */
    public static final class d<T> implements dtQ<T> {
        final /* synthetic */ Iterable d;

        public d(Iterable iterable) {
            this.d = iterable;
        }

        @Override // o.dtQ
        public Iterator<T> iterator() {
            return this.d.iterator();
        }
    }

    public static <T> boolean b(Iterable<? extends T> iterable, T t) {
        C8632dsu.c((Object) iterable, "");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t);
        }
        return e(iterable, t) >= 0;
    }

    public static final <T> T h(Iterable<? extends T> iterable, final int i) {
        C8632dsu.c((Object) iterable, "");
        if (iterable instanceof List) {
            return (T) ((List) iterable).get(i);
        }
        return (T) c(iterable, i, new drM<Integer, T>() { // from class: kotlin.collections.CollectionsKt___CollectionsKt$elementAt$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final T d(int i2) {
                throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + i + '.');
            }

            @Override // o.drM
            public /* synthetic */ Object invoke(Integer num) {
                return d(num.intValue());
            }
        });
    }

    public static final <T> T c(Iterable<? extends T> iterable, int i, drM<? super Integer, ? extends T> drm) {
        int t;
        C8632dsu.c((Object) iterable, "");
        C8632dsu.c((Object) drm, "");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (i >= 0) {
                t = C8569dql.t(list);
                if (i <= t) {
                    return (T) list.get(i);
                }
            }
            return drm.invoke(Integer.valueOf(i));
        } else if (i < 0) {
            return drm.invoke(Integer.valueOf(i));
        } else {
            int i2 = 0;
            for (T t2 : iterable) {
                if (i == i2) {
                    return t2;
                }
                i2++;
            }
            return drm.invoke(Integer.valueOf(i));
        }
    }

    public static <T> T E(Iterable<? extends T> iterable) {
        Object y;
        C8632dsu.c((Object) iterable, "");
        if (iterable instanceof List) {
            y = y((List) iterable);
            return (T) y;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return it.next();
    }

    public static <T> T y(List<? extends T> list) {
        C8632dsu.c((Object) list, "");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static <T> T H(Iterable<? extends T> iterable) {
        C8632dsu.c((Object) iterable, "");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static <T> T x(List<? extends T> list) {
        C8632dsu.c((Object) list, "");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static <T> T f(List<? extends T> list, int i) {
        int t;
        C8632dsu.c((Object) list, "");
        if (i >= 0) {
            t = C8569dql.t(list);
            if (i <= t) {
                return list.get(i);
            }
        }
        return null;
    }

    public static final <T> int e(Iterable<? extends T> iterable, T t) {
        C8632dsu.c((Object) iterable, "");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i = 0;
        for (T t2 : iterable) {
            if (i < 0) {
                C8569dql.h();
            }
            if (C8632dsu.c(t, t2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static <T> int a(List<? extends T> list, T t) {
        C8632dsu.c((Object) list, "");
        return list.indexOf(t);
    }

    public static <T> T I(Iterable<? extends T> iterable) {
        Object B;
        C8632dsu.c((Object) iterable, "");
        if (iterable instanceof List) {
            B = B((List<? extends Object>) iterable);
            return (T) B;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static <T> T B(List<? extends T> list) {
        int t;
        C8632dsu.c((Object) list, "");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        t = C8569dql.t(list);
        return list.get(t);
    }

    public static <T> T D(List<? extends T> list) {
        C8632dsu.c((Object) list, "");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static <T> T a(Collection<? extends T> collection, Random random) {
        C8632dsu.c((Object) collection, "");
        C8632dsu.c((Object) random, "");
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return (T) h(collection, random.e(collection.size()));
    }

    public static <T> T K(Iterable<? extends T> iterable) {
        Object C;
        C8632dsu.c((Object) iterable, "");
        if (iterable instanceof List) {
            C = C((List<? extends Object>) iterable);
            return (T) C;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static <T> T C(List<? extends T> list) {
        C8632dsu.c((Object) list, "");
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return list.get(0);
            }
            throw new IllegalArgumentException("List has more than one element.");
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T S(Iterable<? extends T> iterable) {
        C8632dsu.c((Object) iterable, "");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return (T) list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (it.hasNext()) {
                return null;
            }
            return next;
        }
        return null;
    }

    public static <T> T z(List<? extends T> list) {
        C8632dsu.c((Object) list, "");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static <T> List<T> i(Iterable<? extends T> iterable, int i) {
        ArrayList arrayList;
        Object I;
        List<T> e;
        List<T> i2;
        List<T> U;
        C8632dsu.c((Object) iterable, "");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            U = U(iterable);
            return U;
        } else {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i;
                if (size <= 0) {
                    i2 = C8569dql.i();
                    return i2;
                } else if (size == 1) {
                    I = I(iterable);
                    e = C8566dqi.e(I);
                    return e;
                } else {
                    arrayList = new ArrayList(size);
                    if (iterable instanceof List) {
                        if (iterable instanceof RandomAccess) {
                            int size2 = collection.size();
                            while (i < size2) {
                                arrayList.add(((List) iterable).get(i));
                                i++;
                            }
                        } else {
                            ListIterator listIterator = ((List) iterable).listIterator(i);
                            while (listIterator.hasNext()) {
                                arrayList.add(listIterator.next());
                            }
                        }
                        return arrayList;
                    }
                }
            } else {
                arrayList = new ArrayList();
            }
            int i3 = 0;
            for (T t : iterable) {
                if (i3 >= i) {
                    arrayList.add(t);
                } else {
                    i3++;
                }
            }
            return C8569dql.q(arrayList);
        }
    }

    public static <T> List<T> h(List<? extends T> list, int i) {
        int b;
        List<T> j;
        C8632dsu.c((Object) list, "");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        b = C8657dts.b(list.size() - i, 0);
        j = j((Iterable) list, b);
        return j;
    }

    public static <T> List<T> G(Iterable<? extends T> iterable) {
        C8632dsu.c((Object) iterable, "");
        return (List) a(iterable, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C a(Iterable<? extends T> iterable, C c) {
        C8632dsu.c((Object) iterable, "");
        C8632dsu.c((Object) c, "");
        for (T t : iterable) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    public static <T> List<T> j(Iterable<? extends T> iterable, int i) {
        Object E;
        List<T> e;
        List<T> U;
        List<T> i2;
        C8632dsu.c((Object) iterable, "");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            i2 = C8569dql.i();
            return i2;
        } else {
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    U = U(iterable);
                    return U;
                } else if (i == 1) {
                    E = E(iterable);
                    e = C8566dqi.e(E);
                    return e;
                }
            }
            ArrayList arrayList = new ArrayList(i);
            int i3 = 0;
            for (T t : iterable) {
                arrayList.add(t);
                i3++;
                if (i3 == i) {
                    break;
                }
            }
            return C8569dql.q(arrayList);
        }
    }

    public static <T> List<T> j(List<? extends T> list, int i) {
        Object B;
        List<T> e;
        List<T> U;
        List<T> i2;
        C8632dsu.c((Object) list, "");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            i2 = C8569dql.i();
            return i2;
        } else {
            int size = list.size();
            if (i >= size) {
                U = U(list);
                return U;
            } else if (i == 1) {
                B = B((List<? extends Object>) list);
                e = C8566dqi.e(B);
                return e;
            } else {
                ArrayList arrayList = new ArrayList(i);
                if (list instanceof RandomAccess) {
                    for (int i3 = size - i; i3 < size; i3++) {
                        arrayList.add(list.get(i3));
                    }
                } else {
                    ListIterator<? extends T> listIterator = list.listIterator(size - i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        }
    }

    public static <T> List<T> N(Iterable<? extends T> iterable) {
        List<T> U;
        C8632dsu.c((Object) iterable, "");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            U = U(iterable);
            return U;
        }
        List<T> T = T(iterable);
        C8580dqw.u((List) T);
        return T;
    }

    public static <T extends Comparable<? super T>> List<T> P(Iterable<? extends T> iterable) {
        List<T> p;
        List<T> U;
        C8632dsu.c((Object) iterable, "");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                U = U(iterable);
                return U;
            }
            Object[] array = collection.toArray(new Comparable[0]);
            C8564dqg.r((Comparable[]) array);
            p = C8564dqg.p(array);
            return p;
        }
        List<T> T = T(iterable);
        C8575dqr.s(T);
        return T;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> c(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        List<T> p;
        List<T> U;
        C8632dsu.c((Object) iterable, "");
        C8632dsu.c((Object) comparator, "");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                U = U(iterable);
                return U;
            }
            Object[] array = collection.toArray(new Object[0]);
            C8564dqg.b(array, comparator);
            p = C8564dqg.p(array);
            return p;
        }
        List<T> T = T(iterable);
        C8575dqr.c(T, comparator);
        return T;
    }

    public static boolean[] j(Collection<Boolean> collection) {
        C8632dsu.c((Object) collection, "");
        boolean[] zArr = new boolean[collection.size()];
        int i = 0;
        for (Boolean bool : collection) {
            zArr[i] = bool.booleanValue();
            i++;
        }
        return zArr;
    }

    public static byte[] i(Collection<Byte> collection) {
        C8632dsu.c((Object) collection, "");
        byte[] bArr = new byte[collection.size()];
        int i = 0;
        for (Byte b : collection) {
            bArr[i] = b.byteValue();
            i++;
        }
        return bArr;
    }

    public static float[] o(Collection<Float> collection) {
        C8632dsu.c((Object) collection, "");
        float[] fArr = new float[collection.size()];
        int i = 0;
        for (Float f : collection) {
            fArr[i] = f.floatValue();
            i++;
        }
        return fArr;
    }

    public static int[] m(Collection<Integer> collection) {
        C8632dsu.c((Object) collection, "");
        int[] iArr = new int[collection.size()];
        int i = 0;
        for (Integer num : collection) {
            iArr[i] = num.intValue();
            i++;
        }
        return iArr;
    }

    public static long[] k(Collection<Long> collection) {
        C8632dsu.c((Object) collection, "");
        long[] jArr = new long[collection.size()];
        int i = 0;
        for (Long l : collection) {
            jArr[i] = l.longValue();
            i++;
        }
        return jArr;
    }

    public static final <T, C extends Collection<? super T>> C e(Iterable<? extends T> iterable, C c) {
        C8632dsu.c((Object) iterable, "");
        C8632dsu.c((Object) c, "");
        for (T t : iterable) {
            c.add(t);
        }
        return c;
    }

    public static <T> HashSet<T> O(Iterable<? extends T> iterable) {
        int d2;
        int e;
        C8632dsu.c((Object) iterable, "");
        d2 = C8572dqo.d(iterable, 12);
        e = dqD.e(d2);
        return (HashSet) e((Iterable) iterable, new HashSet(e));
    }

    public static <T> List<T> U(Iterable<? extends T> iterable) {
        List<T> i;
        List<T> e;
        List<T> n;
        C8632dsu.c((Object) iterable, "");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                i = C8569dql.i();
                return i;
            } else if (size == 1) {
                e = C8566dqi.e(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
                return e;
            } else {
                n = n(collection);
                return n;
            }
        }
        return C8569dql.q(T(iterable));
    }

    public static final <T> List<T> T(Iterable<? extends T> iterable) {
        List<T> n;
        C8632dsu.c((Object) iterable, "");
        if (iterable instanceof Collection) {
            n = n((Collection) iterable);
            return n;
        }
        return (List) e((Iterable) iterable, new ArrayList());
    }

    public static <T> List<T> n(Collection<? extends T> collection) {
        C8632dsu.c((Object) collection, "");
        return new ArrayList(collection);
    }

    public static <T> Set<T> W(Iterable<? extends T> iterable) {
        Set<T> e;
        Set<T> a;
        int e2;
        C8632dsu.c((Object) iterable, "");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                e = dqN.e();
                return e;
            } else if (size == 1) {
                a = dqP.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
                return a;
            } else {
                e2 = dqD.e(collection.size());
                return (Set) e((Iterable) iterable, new LinkedHashSet(e2));
            }
        }
        return dqN.d((Set) e((Iterable) iterable, new LinkedHashSet()));
    }

    public static <T> Iterable<C8578dqu<T>> X(final Iterable<? extends T> iterable) {
        C8632dsu.c((Object) iterable, "");
        return new C8582dqy(new drO<Iterator<? extends T>>() { // from class: kotlin.collections.CollectionsKt___CollectionsKt$withIndex$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final Iterator<T> invoke() {
                return iterable.iterator();
            }
        });
    }

    public static <T> List<T> D(Iterable<? extends T> iterable) {
        Set V;
        List<T> U;
        C8632dsu.c((Object) iterable, "");
        V = V(iterable);
        U = U(V);
        return U;
    }

    public static <T> Set<T> j(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        Set<T> V;
        C8632dsu.c((Object) iterable, "");
        C8632dsu.c((Object) iterable2, "");
        V = V(iterable);
        C8571dqn.j(V, iterable2);
        return V;
    }

    public static <T> Set<T> i(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        Set<T> V;
        C8632dsu.c((Object) iterable, "");
        C8632dsu.c((Object) iterable2, "");
        V = V(iterable);
        C8571dqn.f(V, iterable2);
        return V;
    }

    public static <T> Set<T> V(Iterable<? extends T> iterable) {
        C8632dsu.c((Object) iterable, "");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) e((Iterable) iterable, new LinkedHashSet());
    }

    public static <T> int B(Iterable<? extends T> iterable) {
        C8632dsu.c((Object) iterable, "");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                C8569dql.f();
            }
        }
        return i;
    }

    public static Float L(Iterable<Float> iterable) {
        C8632dsu.c((Object) iterable, "");
        Iterator<Float> it = iterable.iterator();
        if (it.hasNext()) {
            float floatValue = it.next().floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, it.next().floatValue());
            }
            return Float.valueOf(floatValue);
        }
        return null;
    }

    public static <T extends Comparable<? super T>> T F(Iterable<? extends T> iterable) {
        C8632dsu.c((Object) iterable, "");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) < 0) {
                    next = next2;
                }
            }
            return next;
        }
        return null;
    }

    public static Float M(Iterable<Float> iterable) {
        C8632dsu.c((Object) iterable, "");
        Iterator<Float> it = iterable.iterator();
        if (it.hasNext()) {
            float floatValue = it.next().floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, it.next().floatValue());
            }
            return Float.valueOf(floatValue);
        }
        return null;
    }

    public static <T extends Comparable<? super T>> T J(Iterable<? extends T> iterable) {
        C8632dsu.c((Object) iterable, "");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) > 0) {
                    next = next2;
                }
            }
            return next;
        }
        return null;
    }

    public static <T> List<List<T>> f(Iterable<? extends T> iterable, int i) {
        C8632dsu.c((Object) iterable, "");
        return c(iterable, i, i, true);
    }

    public static <T> List<T> c(Iterable<? extends T> iterable, T t) {
        int d2;
        C8632dsu.c((Object) iterable, "");
        d2 = C8572dqo.d(iterable, 10);
        ArrayList arrayList = new ArrayList(d2);
        boolean z = false;
        for (T t2 : iterable) {
            boolean z2 = true;
            if (!z && C8632dsu.c(t2, t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(t2);
            }
        }
        return arrayList;
    }

    public static <T> List<T> g(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        Collection z;
        List<T> U;
        C8632dsu.c((Object) iterable, "");
        C8632dsu.c((Object) iterable2, "");
        z = C8571dqn.z(iterable2);
        if (z.isEmpty()) {
            U = U(iterable);
            return U;
        }
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (!z.contains(t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static <T> List<T> b(Collection<? extends T> collection, T t) {
        C8632dsu.c((Object) collection, "");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    public static <T> List<T> f(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        List<T> g;
        C8632dsu.c((Object) iterable, "");
        C8632dsu.c((Object) iterable2, "");
        if (iterable instanceof Collection) {
            g = g((Collection) iterable, (Iterable) iterable2);
            return g;
        }
        ArrayList arrayList = new ArrayList();
        C8571dqn.b(arrayList, iterable);
        C8571dqn.b(arrayList, iterable2);
        return arrayList;
    }

    public static <T> List<T> g(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        C8632dsu.c((Object) collection, "");
        C8632dsu.c((Object) iterable, "");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        C8571dqn.b(arrayList2, iterable);
        return arrayList2;
    }

    public static final <T> List<List<T>> c(Iterable<? extends T> iterable, int i, int i2, boolean z) {
        int i3;
        C8632dsu.c((Object) iterable, "");
        dqQ.d(i, i2);
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            List list = (List) iterable;
            int size = list.size();
            ArrayList arrayList = new ArrayList((size / i2) + (size % i2 == 0 ? 0 : 1));
            int i4 = 0;
            while (i4 >= 0 && i4 < size) {
                i3 = C8657dts.i(i, size - i4);
                if (i3 < i && !z) {
                    break;
                }
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i5 = 0; i5 < i3; i5++) {
                    arrayList2.add(list.get(i5 + i4));
                }
                arrayList.add(arrayList2);
                i4 += i2;
            }
            return arrayList;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator d2 = dqQ.d(iterable.iterator(), i, i2, z, false);
        while (d2.hasNext()) {
            arrayList3.add((List) d2.next());
        }
        return arrayList3;
    }

    public static final <T, A extends Appendable> A e(Iterable<? extends T> iterable, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, drM<? super T, ? extends CharSequence> drm) {
        C8632dsu.c((Object) iterable, "");
        C8632dsu.c((Object) a, "");
        C8632dsu.c((Object) charSequence, "");
        C8632dsu.c((Object) charSequence2, "");
        C8632dsu.c((Object) charSequence3, "");
        C8632dsu.c((Object) charSequence4, "");
        a.append(charSequence2);
        int i2 = 0;
        for (T t : iterable) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C8683dur.b(a, t, drm);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static /* synthetic */ String d(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, drM drm, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i2 & 2) != 0 ? "" : charSequence2;
        String str2 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i2 & 32) != 0) {
            drm = null;
        }
        return d(iterable, charSequence, str, str2, i3, charSequence5, drm);
    }

    public static final <T> String d(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, drM<? super T, ? extends CharSequence> drm) {
        C8632dsu.c((Object) iterable, "");
        C8632dsu.c((Object) charSequence, "");
        C8632dsu.c((Object) charSequence2, "");
        C8632dsu.c((Object) charSequence3, "");
        C8632dsu.c((Object) charSequence4, "");
        String sb = ((StringBuilder) e(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, drm)).toString();
        C8632dsu.a(sb, "");
        return sb;
    }

    public static <T> dtQ<T> C(Iterable<? extends T> iterable) {
        C8632dsu.c((Object) iterable, "");
        return new d(iterable);
    }

    public static long R(Iterable<Long> iterable) {
        C8632dsu.c((Object) iterable, "");
        long j = 0;
        for (Long l : iterable) {
            j += l.longValue();
        }
        return j;
    }

    public static float Q(Iterable<Float> iterable) {
        C8632dsu.c((Object) iterable, "");
        float f = 0.0f;
        for (Float f2 : iterable) {
            f += f2.floatValue();
        }
        return f;
    }

    public static <T, R> List<Pair<T, R>> h(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        int d2;
        int d3;
        C8632dsu.c((Object) iterable, "");
        C8632dsu.c((Object) iterable2, "");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        d2 = C8572dqo.d(iterable, 10);
        d3 = C8572dqo.d(iterable2, 10);
        ArrayList arrayList = new ArrayList(Math.min(d2, d3));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(dpD.a(it.next(), it2.next()));
        }
        return arrayList;
    }
}
