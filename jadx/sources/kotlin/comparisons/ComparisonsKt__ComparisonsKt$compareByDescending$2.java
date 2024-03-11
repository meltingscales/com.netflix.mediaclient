package kotlin.comparisons;

import java.util.Comparator;
import o.drM;

/* loaded from: classes.dex */
public final class ComparisonsKt__ComparisonsKt$compareByDescending$2<T> implements Comparator {
    final /* synthetic */ drM<T, K> d;
    final /* synthetic */ Comparator<? super K> e;

    /* JADX WARN: Multi-variable type inference failed */
    public ComparisonsKt__ComparisonsKt$compareByDescending$2(Comparator<? super K> comparator, drM<? super T, ? extends K> drm) {
        this.e = comparator;
        this.d = drm;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        Comparator<? super K> comparator = this.e;
        drM<T, K> drm = this.d;
        return comparator.compare(drm.invoke(t2), drm.invoke(t));
    }
}
