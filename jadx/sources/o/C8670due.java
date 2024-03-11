package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.sequences.SequencesKt___SequencesKt$flatMap$2;

/* renamed from: o.due */
/* loaded from: classes.dex */
public class C8670due extends C8668duc {

    /* renamed from: o.due$b */
    /* loaded from: classes.dex */
    public static final class b<T> implements Iterable<T>, dsK {
        final /* synthetic */ dtQ c;

        public b(dtQ dtq) {
            this.c = dtq;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.c.iterator();
        }
    }

    public static <T> boolean c(dtQ<? extends T> dtq, T t) {
        C8632dsu.c((Object) dtq, "");
        return b(dtq, t) >= 0;
    }

    public static <T> T a(dtQ<? extends T> dtq, final int i) {
        C8632dsu.c((Object) dtq, "");
        return (T) d(dtq, i, new drM<Integer, T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$elementAt$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final T b(int i2) {
                throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + i + '.');
            }

            @Override // o.drM
            public /* synthetic */ Object invoke(Integer num) {
                return b(num.intValue());
            }
        });
    }

    public static final <T> T d(dtQ<? extends T> dtq, int i, drM<? super Integer, ? extends T> drm) {
        C8632dsu.c((Object) dtq, "");
        C8632dsu.c((Object) drm, "");
        if (i < 0) {
            return drm.invoke(Integer.valueOf(i));
        }
        int i2 = 0;
        for (T t : dtq) {
            if (i == i2) {
                return t;
            }
            i2++;
        }
        return drm.invoke(Integer.valueOf(i));
    }

    public static <T> T s(dtQ<? extends T> dtq) {
        C8632dsu.c((Object) dtq, "");
        Iterator<? extends T> it = dtq.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static final <T> int b(dtQ<? extends T> dtq, T t) {
        C8632dsu.c((Object) dtq, "");
        int i = 0;
        for (T t2 : dtq) {
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

    public static <T> T r(dtQ<? extends T> dtq) {
        C8632dsu.c((Object) dtq, "");
        Iterator<? extends T> it = dtq.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> dtQ<T> c(dtQ<? extends T> dtq, int i) {
        C8632dsu.c((Object) dtq, "");
        if (i >= 0) {
            return i == 0 ? dtq : dtq instanceof dtM ? ((dtM) dtq).a(i) : new dtN(dtq, i);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    public static <T> dtQ<T> f(dtQ<? extends T> dtq, drM<? super T, Boolean> drm) {
        C8632dsu.c((Object) dtq, "");
        C8632dsu.c((Object) drm, "");
        return new dtT(dtq, true, drm);
    }

    public static <T> dtQ<T> l(dtQ<? extends T> dtq, drM<? super T, Boolean> drm) {
        C8632dsu.c((Object) dtq, "");
        C8632dsu.c((Object) drm, "");
        return new dtT(dtq, false, drm);
    }

    public static <T> dtQ<T> p(dtQ<? extends T> dtq) {
        dtQ<T> l;
        C8632dsu.c((Object) dtq, "");
        l = l(dtq, new drM<T, Boolean>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$filterNotNull$1
            @Override // o.drM
            /* renamed from: d */
            public final Boolean invoke(T t) {
                return Boolean.valueOf(t == null);
            }
        });
        C8632dsu.d(l);
        return l;
    }

    public static <T> dtQ<T> s(dtQ<? extends T> dtq, drM<? super T, Boolean> drm) {
        C8632dsu.c((Object) dtq, "");
        C8632dsu.c((Object) drm, "");
        return new C8667dub(dtq, drm);
    }

    /* renamed from: o.due$a */
    /* loaded from: classes.dex */
    public static final class a<T> implements dtQ<T> {
        final /* synthetic */ Comparator<? super T> a;
        final /* synthetic */ dtQ<T> b;

        /* JADX WARN: Multi-variable type inference failed */
        a(dtQ<? extends T> dtq, Comparator<? super T> comparator) {
            this.b = dtq;
            this.a = comparator;
        }

        @Override // o.dtQ
        public Iterator<T> iterator() {
            List t;
            t = C8670due.t(this.b);
            C8575dqr.c(t, this.a);
            return t.iterator();
        }
    }

    public static <T> dtQ<T> b(dtQ<? extends T> dtq, Comparator<? super T> comparator) {
        C8632dsu.c((Object) dtq, "");
        C8632dsu.c((Object) comparator, "");
        return new a(dtq, comparator);
    }

    public static final <T, C extends Collection<? super T>> C c(dtQ<? extends T> dtq, C c) {
        C8632dsu.c((Object) dtq, "");
        C8632dsu.c((Object) c, "");
        for (T t : dtq) {
            c.add(t);
        }
        return c;
    }

    public static <T> List<T> q(dtQ<? extends T> dtq) {
        List<T> e;
        List<T> i;
        C8632dsu.c((Object) dtq, "");
        Iterator<? extends T> it = dtq.iterator();
        if (!it.hasNext()) {
            i = C8569dql.i();
            return i;
        }
        T next = it.next();
        if (!it.hasNext()) {
            e = C8566dqi.e(next);
            return e;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static <T> List<T> t(dtQ<? extends T> dtq) {
        C8632dsu.c((Object) dtq, "");
        return (List) c((dtQ) dtq, new ArrayList());
    }

    public static <T, R> dtQ<R> n(dtQ<? extends T> dtq, drM<? super T, ? extends dtQ<? extends R>> drm) {
        C8632dsu.c((Object) dtq, "");
        C8632dsu.c((Object) drm, "");
        return new dtR(dtq, drm, SequencesKt___SequencesKt$flatMap$2.b);
    }

    public static <T, R> dtQ<R> k(dtQ<? extends T> dtq, drM<? super T, ? extends R> drm) {
        C8632dsu.c((Object) dtq, "");
        C8632dsu.c((Object) drm, "");
        return new C8669dud(dtq, drm);
    }

    public static <T, R> dtQ<R> m(dtQ<? extends T> dtq, drM<? super T, ? extends R> drm) {
        dtQ<R> p;
        C8632dsu.c((Object) dtq, "");
        C8632dsu.c((Object) drm, "");
        p = p(new C8669dud(dtq, drm));
        return p;
    }

    public static <T, K> dtQ<T> g(dtQ<? extends T> dtq, drM<? super T, ? extends K> drm) {
        C8632dsu.c((Object) dtq, "");
        C8632dsu.c((Object) drm, "");
        return new dtP(dtq, drm);
    }

    public static <T> boolean m(dtQ<? extends T> dtq) {
        C8632dsu.c((Object) dtq, "");
        return dtq.iterator().hasNext();
    }

    public static <T> int k(dtQ<? extends T> dtq) {
        C8632dsu.c((Object) dtq, "");
        Iterator<? extends T> it = dtq.iterator();
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

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T d(dtQ<? extends T> dtq, Comparator<? super T> comparator) {
        C8632dsu.c((Object) dtq, "");
        C8632dsu.c((Object) comparator, "");
        Iterator<? extends T> it = dtq.iterator();
        if (it.hasNext()) {
            Object obj = (T) it.next();
            while (it.hasNext()) {
                T next = it.next();
                if (comparator.compare(obj, next) < 0) {
                    obj = next;
                }
            }
            return (T) obj;
        }
        return null;
    }

    public static <T> dtQ<T> o(dtQ<? extends T> dtq, final drM<? super T, dpR> drm) {
        dtQ<T> k;
        C8632dsu.c((Object) dtq, "");
        C8632dsu.c((Object) drm, "");
        k = k(dtq, new drM<T, T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$onEach$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public final T invoke(T t) {
                drm.invoke(t);
                return t;
            }
        });
        return k;
    }

    public static <T> dtQ<T> e(dtQ<? extends T> dtq, T t) {
        dtQ b2;
        dtQ b3;
        dtQ<T> l;
        C8632dsu.c((Object) dtq, "");
        b2 = dtY.b(t);
        b3 = dtY.b(dtq, b2);
        l = dtY.l(b3);
        return l;
    }

    public static <T> dtQ<T> e(dtQ<? extends T> dtq, dtQ<? extends T> dtq2) {
        dtQ b2;
        dtQ<T> l;
        C8632dsu.c((Object) dtq, "");
        C8632dsu.c((Object) dtq2, "");
        b2 = dtY.b(dtq, dtq2);
        l = dtY.l(b2);
        return l;
    }

    public static final <T, A extends Appendable> A a(dtQ<? extends T> dtq, A a2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, drM<? super T, ? extends CharSequence> drm) {
        C8632dsu.c((Object) dtq, "");
        C8632dsu.c((Object) a2, "");
        C8632dsu.c((Object) charSequence, "");
        C8632dsu.c((Object) charSequence2, "");
        C8632dsu.c((Object) charSequence3, "");
        C8632dsu.c((Object) charSequence4, "");
        a2.append(charSequence2);
        int i2 = 0;
        for (T t : dtq) {
            i2++;
            if (i2 > 1) {
                a2.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C8683dur.b(a2, t, drm);
        }
        if (i >= 0 && i2 > i) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    public static /* synthetic */ String d(dtQ dtq, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, drM drm, int i2, Object obj) {
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
        return e(dtq, charSequence, str, str2, i3, charSequence5, drm);
    }

    public static final <T> String e(dtQ<? extends T> dtq, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, drM<? super T, ? extends CharSequence> drm) {
        C8632dsu.c((Object) dtq, "");
        C8632dsu.c((Object) charSequence, "");
        C8632dsu.c((Object) charSequence2, "");
        C8632dsu.c((Object) charSequence3, "");
        C8632dsu.c((Object) charSequence4, "");
        String sb = ((StringBuilder) a(dtq, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, drm)).toString();
        C8632dsu.a(sb, "");
        return sb;
    }

    public static <T> Iterable<T> o(dtQ<? extends T> dtq) {
        C8632dsu.c((Object) dtq, "");
        return new b(dtq);
    }
}
