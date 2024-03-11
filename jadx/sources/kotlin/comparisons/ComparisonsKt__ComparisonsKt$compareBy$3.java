package kotlin.comparisons;

import java.util.Comparator;
import o.drM;

/* loaded from: classes.dex */
public final class ComparisonsKt__ComparisonsKt$compareBy$3<T> implements Comparator {
    final /* synthetic */ Comparator<? super K> a;
    final /* synthetic */ drM<T, K> c;

    /* JADX WARN: Multi-variable type inference failed */
    public ComparisonsKt__ComparisonsKt$compareBy$3(Comparator<? super K> comparator, drM<? super T, ? extends K> drm) {
        this.a = comparator;
        this.c = drm;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        Comparator<? super K> comparator = this.a;
        drM<T, K> drm = this.c;
        return comparator.compare(drm.invoke(t), drm.invoke(t2));
    }
}
