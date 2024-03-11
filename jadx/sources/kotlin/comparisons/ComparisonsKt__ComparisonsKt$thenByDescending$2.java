package kotlin.comparisons;

import java.util.Comparator;
import o.drM;

/* loaded from: classes.dex */
public final class ComparisonsKt__ComparisonsKt$thenByDescending$2<T> implements Comparator {
    final /* synthetic */ Comparator<T> a;
    final /* synthetic */ Comparator<? super K> b;
    final /* synthetic */ drM<T, K> e;

    /* JADX WARN: Multi-variable type inference failed */
    public ComparisonsKt__ComparisonsKt$thenByDescending$2(Comparator<T> comparator, Comparator<? super K> comparator2, drM<? super T, ? extends K> drm) {
        this.a = comparator;
        this.b = comparator2;
        this.e = drm;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int compare = this.a.compare(t, t2);
        if (compare != 0) {
            return compare;
        }
        Comparator<? super K> comparator = this.b;
        drM<T, K> drm = this.e;
        return comparator.compare(drm.invoke(t2), drm.invoke(t));
    }
}
