package o;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class dpZ<T> implements Collection<T>, dsK {
    private final boolean a;
    private final T[] b;

    @Override // java.util.Collection
    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        C8632dsu.c((Object) tArr, "");
        return (T[]) C8628dsq.c(this, tArr);
    }

    public dpZ(T[] tArr, boolean z) {
        C8632dsu.c((Object) tArr, "");
        this.b = tArr;
        this.a = z;
    }

    @Override // java.util.Collection
    public final int size() {
        return a();
    }

    public int a() {
        return this.b.length;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.b.length == 0;
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        boolean i;
        i = C8563dqf.i(this.b, obj);
        return i;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        C8632dsu.c((Object) collection, "");
        Collection<? extends Object> collection2 = collection;
        if (!collection2.isEmpty()) {
            Iterator<T> it = collection2.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return C8621dsj.b(this.b);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return C8566dqi.d(this.b, this.a);
    }
}
