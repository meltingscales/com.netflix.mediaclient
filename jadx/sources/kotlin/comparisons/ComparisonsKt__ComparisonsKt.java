package kotlin.comparisons;

import java.util.Comparator;
import o.C8632dsu;
import o.drM;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ComparisonsKt__ComparisonsKt {
    public static final <T> int compareValuesBy(T t, T t2, drM<? super T, ? extends Comparable<?>>... drmArr) {
        C8632dsu.c((Object) drmArr, "");
        if (drmArr.length <= 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        return d(t, t2, drmArr);
    }

    private static final <T> int d(T t, T t2, drM<? super T, ? extends Comparable<?>>[] drmArr) {
        int compareValues;
        for (drM<? super T, ? extends Comparable<?>> drm : drmArr) {
            compareValues = compareValues(drm.invoke(t), drm.invoke(t2));
            if (compareValues != 0) {
                return compareValues;
            }
        }
        return 0;
    }

    public static <T extends Comparable<?>> int compareValues(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    public static <T> Comparator<T> compareBy(final drM<? super T, ? extends Comparable<?>>... drmArr) {
        C8632dsu.c((Object) drmArr, "");
        if (drmArr.length <= 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int c;
                c = ComparisonsKt__ComparisonsKt.c(drmArr, obj, obj2);
                return c;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(drM[] drmArr, Object obj, Object obj2) {
        C8632dsu.c((Object) drmArr, "");
        return d(obj, obj2, drmArr);
    }

    public static final <T> Comparator<T> then(final Comparator<T> comparator, final Comparator<? super T> comparator2) {
        C8632dsu.c((Object) comparator, "");
        C8632dsu.c((Object) comparator2, "");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int a;
                a = ComparisonsKt__ComparisonsKt.a(comparator, comparator2, obj, obj2);
                return a;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        C8632dsu.c((Object) comparator, "");
        C8632dsu.c((Object) comparator2, "");
        int compare = comparator.compare(obj, obj2);
        return compare != 0 ? compare : comparator2.compare(obj, obj2);
    }

    public static final <T> Comparator<T> thenDescending(final Comparator<T> comparator, final Comparator<? super T> comparator2) {
        C8632dsu.c((Object) comparator, "");
        C8632dsu.c((Object) comparator2, "");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$$ExternalSyntheticLambda2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int c;
                c = ComparisonsKt__ComparisonsKt.c(comparator, comparator2, obj, obj2);
                return c;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        C8632dsu.c((Object) comparator, "");
        C8632dsu.c((Object) comparator2, "");
        int compare = comparator.compare(obj, obj2);
        return compare != 0 ? compare : comparator2.compare(obj2, obj);
    }

    public static final <T> Comparator<T> nullsFirst(final Comparator<? super T> comparator) {
        C8632dsu.c((Object) comparator, "");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$$ExternalSyntheticLambda3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int d;
                d = ComparisonsKt__ComparisonsKt.d(comparator, obj, obj2);
                return d;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(Comparator comparator, Object obj, Object obj2) {
        C8632dsu.c((Object) comparator, "");
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return comparator.compare(obj, obj2);
    }

    public static final <T> Comparator<T> nullsLast(final Comparator<? super T> comparator) {
        C8632dsu.c((Object) comparator, "");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$$ExternalSyntheticLambda4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int a;
                a = ComparisonsKt__ComparisonsKt.a(comparator, obj, obj2);
                return a;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(Comparator comparator, Object obj, Object obj2) {
        C8632dsu.c((Object) comparator, "");
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return comparator.compare(obj, obj2);
    }

    public static <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
        NaturalOrderComparator naturalOrderComparator = NaturalOrderComparator.INSTANCE;
        C8632dsu.d(naturalOrderComparator);
        return naturalOrderComparator;
    }

    public static <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
        ReverseOrderComparator reverseOrderComparator = ReverseOrderComparator.INSTANCE;
        C8632dsu.d(reverseOrderComparator);
        return reverseOrderComparator;
    }

    public static final <T> Comparator<T> reversed(Comparator<T> comparator) {
        C8632dsu.c((Object) comparator, "");
        if (comparator instanceof ReversedComparator) {
            return ((ReversedComparator) comparator).getComparator();
        }
        Comparator<T> comparator2 = NaturalOrderComparator.INSTANCE;
        if (C8632dsu.c(comparator, comparator2)) {
            ReverseOrderComparator reverseOrderComparator = ReverseOrderComparator.INSTANCE;
            C8632dsu.d(reverseOrderComparator);
            return reverseOrderComparator;
        }
        if (C8632dsu.c(comparator, ReverseOrderComparator.INSTANCE)) {
            C8632dsu.d(comparator2);
        } else {
            comparator2 = new ReversedComparator<>(comparator);
        }
        return comparator2;
    }
}
