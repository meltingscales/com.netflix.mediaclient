package kotlin.comparisons;

import java.util.Comparator;
import o.drM;

/* loaded from: classes.dex */
public final class ComparisonsKt__ComparisonsKt$thenBy$1<T> implements Comparator {
    final /* synthetic */ Comparator<T> b;
    final /* synthetic */ drM<T, Comparable<?>> e;

    /* JADX WARN: Multi-variable type inference failed */
    public ComparisonsKt__ComparisonsKt$thenBy$1(Comparator<T> comparator, drM<? super T, ? extends Comparable<?>> drm) {
        this.b = comparator;
        this.e = drm;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int compareValues;
        int compare = this.b.compare(t, t2);
        if (compare != 0) {
            return compare;
        }
        drM<T, Comparable<?>> drm = this.e;
        compareValues = ComparisonsKt__ComparisonsKt.compareValues(drm.invoke(t), drm.invoke(t2));
        return compareValues;
    }
}
