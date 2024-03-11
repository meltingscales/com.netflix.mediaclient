package kotlin.comparisons;

import java.util.Comparator;
import o.C8632dsu;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class ReverseOrderComparator implements Comparator<Comparable<? super Object>> {
    public static final ReverseOrderComparator INSTANCE = new ReverseOrderComparator();

    private ReverseOrderComparator() {
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Comparable<? super Object> comparable, Comparable<? super Object> comparable2) {
        return compare2((Comparable<Object>) comparable, (Comparable<Object>) comparable2);
    }

    /* renamed from: compare  reason: avoid collision after fix types in other method */
    public int compare2(Comparable<Object> comparable, Comparable<Object> comparable2) {
        C8632dsu.c((Object) comparable, "");
        C8632dsu.c((Object) comparable2, "");
        return comparable2.compareTo(comparable);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return NaturalOrderComparator.INSTANCE;
    }
}
