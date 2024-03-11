package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class dpT<E> extends dpQ<E> implements List<E> {
    public static final b Companion = new b(null);

    @Override // java.util.List
    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract E get(int i);

    @Override // java.util.List
    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new d();
    }

    public ListIterator<E> listIterator() {
        return new c(0);
    }

    public ListIterator<E> listIterator(int i) {
        return new c(i);
    }

    public List<E> subList(int i, int i2) {
        return new a(this, i, i2);
    }

    /* loaded from: classes.dex */
    static final class a<E> extends dpT<E> implements RandomAccess {
        private final int c;
        private int d;
        private final dpT<E> e;

        @Override // o.dpQ
        public int getSize() {
            return this.d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(dpT<? extends E> dpt, int i, int i2) {
            C8632dsu.c((Object) dpt, "");
            this.e = dpt;
            this.c = i;
            dpT.Companion.c(i, i2, dpt.size());
            this.d = i2 - i;
        }

        @Override // o.dpT, java.util.List
        public E get(int i) {
            dpT.Companion.c(i, this.d);
            return this.e.get(this.c + i);
        }
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return Companion.e(this, (Collection) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return Companion.d(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Iterator<E>, dsK {
        private int b;

        protected final int c() {
            return this.b;
        }

        protected final void c(int i) {
            this.b = i;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public d() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b < dpT.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            dpT<E> dpt = dpT.this;
            int i = this.b;
            this.b = i + 1;
            return dpt.get(i);
        }
    }

    /* loaded from: classes.dex */
    class c extends d implements ListIterator {
        @Override // java.util.ListIterator
        public void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public c(int i) {
            super();
            dpT.Companion.b(i, dpT.this.size());
            c(i);
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return c() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return c();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            dpT<E> dpt = dpT.this;
            c(c() - 1);
            return dpt.get(c());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return c() - 1;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        public final int d(int i, int i2) {
            int i3 = i + (i >> 1);
            if (i3 - i2 < 0) {
                i3 = i2;
            }
            return i3 - 2147483639 > 0 ? i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i3;
        }

        private b() {
        }

        public final void c(int i, int i2) {
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        public final void b(int i, int i2) {
            if (i < 0 || i > i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        public final void c(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
            } else if (i <= i2) {
            } else {
                throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
            }
        }

        public final int d(Collection<?> collection) {
            C8632dsu.c((Object) collection, "");
            Iterator<?> it = collection.iterator();
            int i = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i = (i * 31) + (next != null ? next.hashCode() : 0);
            }
            return i;
        }

        public final boolean e(Collection<?> collection, Collection<?> collection2) {
            C8632dsu.c((Object) collection, "");
            C8632dsu.c((Object) collection2, "");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            Iterator<?> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!C8632dsu.c(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }
    }

    public int indexOf(E e) {
        int i = 0;
        for (E e2 : this) {
            if (C8632dsu.c(e2, e)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int lastIndexOf(E e) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C8632dsu.c(listIterator.previous(), e)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }
}
