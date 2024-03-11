package kotlin.comparisons;

import java.util.Comparator;
import o.drM;

/* loaded from: classes.dex */
public final class ComparisonsKt__ComparisonsKt$thenByDescending$1<T> implements Comparator {
    final /* synthetic */ drM<T, Comparable<?>> a;
    final /* synthetic */ Comparator<T> c;

    /* JADX WARN: Multi-variable type inference failed */
    public ComparisonsKt__ComparisonsKt$thenByDescending$1(Comparator<T> comparator, drM<? super T, ? extends Comparable<?>> drm) {
        this.c = comparator;
        this.a = drm;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int compareValues;
        int compare = this.c.compare(t, t2);
        if (compare != 0) {
            return compare;
        }
        drM<T, Comparable<?>> drm = this.a;
        compareValues = ComparisonsKt__ComparisonsKt.compareValues(drm.invoke(t2), drm.invoke(t));
        return compareValues;
    }
}
