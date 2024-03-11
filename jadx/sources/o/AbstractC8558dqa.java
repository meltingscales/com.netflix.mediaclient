package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: o.dqa  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC8558dqa<E> extends dpQ<E> implements Set<E> {
    public static final c Companion = new c(null);

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            return Companion.d(this, (Set) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Companion.b(this);
    }

    /* renamed from: o.dqa$c */
    /* loaded from: classes5.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final int b(Collection<?> collection) {
            C8632dsu.c((Object) collection, "");
            Iterator<?> it = collection.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                i += next != null ? next.hashCode() : 0;
            }
            return i;
        }

        public final boolean d(Set<?> set, Set<?> set2) {
            C8632dsu.c((Object) set, "");
            C8632dsu.c((Object) set2, "");
            if (set.size() != set2.size()) {
                return false;
            }
            return set.containsAll(set2);
        }
    }
}
