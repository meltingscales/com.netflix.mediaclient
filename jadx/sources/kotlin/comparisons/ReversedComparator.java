package kotlin.comparisons;

import java.util.Comparator;
import o.C8632dsu;

/* loaded from: classes6.dex */
final class ReversedComparator<T> implements Comparator<T> {
    private final Comparator<T> a;

    public final Comparator<T> getComparator() {
        return this.a;
    }

    @Override // java.util.Comparator
    public final Comparator<T> reversed() {
        return this.a;
    }

    public ReversedComparator(Comparator<T> comparator) {
        C8632dsu.c((Object) comparator, "");
        this.a = comparator;
    }

    @Override // java.util.Comparator
    public int compare(T t, T t2) {
        return this.a.compare(t2, t);
    }
}
