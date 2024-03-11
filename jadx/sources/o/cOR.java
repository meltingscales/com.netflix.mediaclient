package o;

import java.util.Comparator;
import java.util.List;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;

/* loaded from: classes4.dex */
public final class cOR {
    public static final cOR e = new cOR();

    private cOR() {
    }

    public final boolean a(List<C8313dhy> list, List<C8313dhy> list2) {
        List c;
        List c2;
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) list2, "");
        if (list.size() != list2.size()) {
            return false;
        }
        c = C8576dqs.c((Iterable) list, (Comparator) new e());
        c2 = C8576dqs.c((Iterable) list2, (Comparator) new d());
        return C8632dsu.c(c, c2);
    }

    /* loaded from: classes4.dex */
    public static final class d<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(((C8313dhy) t).d(), ((C8313dhy) t2).d());
            return compareValues;
        }
    }

    /* loaded from: classes4.dex */
    public static final class e<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(((C8313dhy) t).d(), ((C8313dhy) t2).d());
            return compareValues;
        }
    }
}
