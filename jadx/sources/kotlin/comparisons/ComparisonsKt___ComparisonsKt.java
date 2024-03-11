package kotlin.comparisons;

import java.util.Comparator;
import o.C8632dsu;

/* loaded from: classes.dex */
class ComparisonsKt___ComparisonsKt extends ComparisonsKt___ComparisonsJvmKt {
    public static final <T> T maxOf(T t, T t2, T t3, Comparator<? super T> comparator) {
        C8632dsu.c((Object) comparator, "");
        return (T) maxOf(t, maxOf(t2, t3, comparator), comparator);
    }

    public static final <T> T maxOf(T t, T t2, Comparator<? super T> comparator) {
        C8632dsu.c((Object) comparator, "");
        return comparator.compare(t, t2) >= 0 ? t : t2;
    }

    public static final <T> T maxOf(T t, T[] tArr, Comparator<? super T> comparator) {
        C8632dsu.c((Object) tArr, "");
        C8632dsu.c((Object) comparator, "");
        for (T t2 : tArr) {
            if (comparator.compare(t, t2) < 0) {
                t = t2;
            }
        }
        return t;
    }

    public static final <T> T minOf(T t, T t2, T t3, Comparator<? super T> comparator) {
        C8632dsu.c((Object) comparator, "");
        return (T) minOf(t, minOf(t2, t3, comparator), comparator);
    }

    public static final <T> T minOf(T t, T t2, Comparator<? super T> comparator) {
        C8632dsu.c((Object) comparator, "");
        return comparator.compare(t, t2) <= 0 ? t : t2;
    }

    public static final <T> T minOf(T t, T[] tArr, Comparator<? super T> comparator) {
        C8632dsu.c((Object) tArr, "");
        C8632dsu.c((Object) comparator, "");
        for (T t2 : tArr) {
            if (comparator.compare(t, t2) > 0) {
                t = t2;
            }
        }
        return t;
    }
}
