package kotlin.comparisons;

import java.util.Comparator;
import o.drM;

/* loaded from: classes.dex */
public final class ComparisonsKt__ComparisonsKt$compareByDescending$1<T> implements Comparator {
    final /* synthetic */ drM<T, Comparable<?>> a;

    /* JADX WARN: Multi-variable type inference failed */
    public ComparisonsKt__ComparisonsKt$compareByDescending$1(drM<? super T, ? extends Comparable<?>> drm) {
        this.a = drm;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int compareValues;
        drM<T, Comparable<?>> drm = this.a;
        compareValues = ComparisonsKt__ComparisonsKt.compareValues(drm.invoke(t2), drm.invoke(t));
        return compareValues;
    }
}
