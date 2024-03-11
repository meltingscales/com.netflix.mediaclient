package androidx.collection;

import java.util.Iterator;
import o.C8632dsu;

/* loaded from: classes5.dex */
public final class SparseArrayKt {
    public static final <T> Iterator<T> valueIterator(SparseArrayCompat<T> sparseArrayCompat) {
        C8632dsu.c((Object) sparseArrayCompat, "");
        return new SparseArrayKt$valueIterator$1(sparseArrayCompat);
    }
}
