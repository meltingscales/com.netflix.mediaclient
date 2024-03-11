package kotlin.comparisons;

import java.util.Comparator;
import o.drX;

/* loaded from: classes.dex */
public final class ComparisonsKt__ComparisonsKt$thenComparator$1<T> implements Comparator {
    final /* synthetic */ Comparator<T> b;
    final /* synthetic */ drX<T, T, Integer> d;

    /* JADX WARN: Multi-variable type inference failed */
    public ComparisonsKt__ComparisonsKt$thenComparator$1(Comparator<T> comparator, drX<? super T, ? super T, Integer> drx) {
        this.b = comparator;
        this.d = drx;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int compare = this.b.compare(t, t2);
        return compare != 0 ? compare : this.d.invoke(t, t2).intValue();
    }
}
