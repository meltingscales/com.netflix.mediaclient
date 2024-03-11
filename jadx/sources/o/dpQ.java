package o;

import java.util.Collection;
import o.dpQ;

/* loaded from: classes.dex */
public abstract class dpQ<E> implements Collection<E>, dsK {
    @Override // java.util.Collection
    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract int getSize();

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
    public final int size() {
        return getSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.List
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

    @Override // java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    public String toString() {
        String d;
        d = C8576dqs.d(this, ", ", "[", "]", 0, null, new drM<E, CharSequence>(this) { // from class: kotlin.collections.AbstractCollection$toString$1
            final /* synthetic */ dpQ<E> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.c = this;
            }

            @Override // o.drM
            /* renamed from: a */
            public final CharSequence invoke(E e) {
                return e == this.c ? "(this Collection)" : String.valueOf(e);
            }
        }, 24, null);
        return d;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return C8628dsq.a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        C8632dsu.c((Object) tArr, "");
        return (T[]) C8628dsq.c(this, tArr);
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(E e) {
        if (!isEmpty()) {
            for (E e2 : this) {
                if (C8632dsu.c(e2, e)) {
                    return true;
                }
            }
        }
        return false;
    }
}
