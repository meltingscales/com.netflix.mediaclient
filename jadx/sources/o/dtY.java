package o;

import java.util.Iterator;
import o.C8632dsu;
import o.dtQ;

/* loaded from: classes.dex */
public class dtY extends dtZ {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class e<T> implements dtQ<T> {
        final /* synthetic */ Iterator c;

        @Override // o.dtQ
        public Iterator<T> iterator() {
            return this.c;
        }

        public e(Iterator it) {
            this.c = it;
        }
    }

    public static <T> dtQ<T> b(Iterator<? extends T> it) {
        dtQ<T> n;
        C8632dsu.c((Object) it, "");
        n = n(new e(it));
        return n;
    }

    public static <T> dtQ<T> b(T... tArr) {
        dtQ<T> s;
        dtQ<T> d;
        C8632dsu.c((Object) tArr, "");
        if (tArr.length == 0) {
            d = d();
            return d;
        }
        s = C8563dqf.s(tArr);
        return s;
    }

    public static <T> dtQ<T> d() {
        return dtO.e;
    }

    public static <T> dtQ<T> l(dtQ<? extends dtQ<? extends T>> dtq) {
        C8632dsu.c((Object) dtq, "");
        return a((dtQ) dtq, (drM) new drM<dtQ<? extends T>, Iterator<? extends T>>() { // from class: kotlin.sequences.SequencesKt__SequencesKt$flatten$1
            @Override // o.drM
            /* renamed from: b */
            public final Iterator<T> invoke(dtQ<? extends T> dtq2) {
                C8632dsu.c((Object) dtq2, "");
                return (Iterator<? extends T>) dtq2.iterator();
            }
        });
    }

    private static final <T, R> dtQ<R> a(dtQ<? extends T> dtq, drM<? super T, ? extends Iterator<? extends R>> drm) {
        if (dtq instanceof C8669dud) {
            return ((C8669dud) dtq).b(drm);
        }
        return new dtR(dtq, new drM<T, T>() { // from class: kotlin.sequences.SequencesKt__SequencesKt$flatten$3
            @Override // o.drM
            public final T invoke(T t) {
                return t;
            }
        }, drm);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> dtQ<T> n(dtQ<? extends T> dtq) {
        C8632dsu.c((Object) dtq, "");
        return dtq instanceof dtI ? dtq : new dtI(dtq);
    }

    public static <T> dtQ<T> a(final T t, drM<? super T, ? extends T> drm) {
        C8632dsu.c((Object) drm, "");
        if (t == null) {
            return dtO.e;
        }
        return new dtS(new drO<T>() { // from class: kotlin.sequences.SequencesKt__SequencesKt$generateSequence$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            public final T invoke() {
                return t;
            }
        }, drm);
    }

    public static <T> dtQ<T> d(drO<? extends T> dro, drM<? super T, ? extends T> drm) {
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) drm, "");
        return new dtS(dro, drm);
    }
}
