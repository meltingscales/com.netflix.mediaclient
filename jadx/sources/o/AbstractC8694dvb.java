package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import o.duT;

/* renamed from: o.dvb  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC8694dvb<E> extends dpT<E> implements duT<E> {
    @Override // o.dpT, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
    /* renamed from: e */
    public duS<E> subList(int i, int i2) {
        return duT.c.e(this, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.dpQ, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // o.dpQ, java.util.Collection, java.util.List
    public boolean containsAll(Collection<? extends Object> collection) {
        C8632dsu.c((Object) collection, "");
        Collection<? extends Object> collection2 = collection;
        if (!collection2.isEmpty()) {
            for (Object obj : collection2) {
                if (!contains(obj)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // o.dpT, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // o.dpT, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // o.duT
    public duT<E> c(Collection<? extends E> collection) {
        C8632dsu.c((Object) collection, "");
        duT.e<E> e = e();
        e.addAll(collection);
        return e.d();
    }
}
