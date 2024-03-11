package o;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class dqJ<T> extends dpW<T> {
    private final List<T> c;

    public dqJ(List<T> list) {
        C8632dsu.c((Object) list, "");
        this.c = list;
    }

    @Override // o.dpW
    public int getSize() {
        return this.c.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i) {
        int b;
        List<T> list = this.c;
        b = C8579dqv.b(this, i);
        return list.get(b);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.c.clear();
    }

    @Override // o.dpW
    public T removeAt(int i) {
        int b;
        List<T> list = this.c;
        b = C8579dqv.b(this, i);
        return list.remove(b);
    }

    @Override // java.util.AbstractList, java.util.List
    public T set(int i, T t) {
        int b;
        List<T> list = this.c;
        b = C8579dqv.b(this, i);
        return list.set(b, t);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, T t) {
        int a;
        List<T> list = this.c;
        a = C8579dqv.a(this, i);
        list.add(a, t);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    /* loaded from: classes.dex */
    public static final class d implements ListIterator<T>, dsR {
        final /* synthetic */ dqJ<T> b;
        private final ListIterator<T> e;

        d(dqJ<T> dqj, int i) {
            int a;
            this.b = dqj;
            List list = ((dqJ) dqj).c;
            a = C8579dqv.a(dqj, i);
            this.e = list.listIterator(a);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.e.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.e.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            return this.e.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            int d;
            d = C8579dqv.d((List<?>) this.b, this.e.previousIndex());
            return d;
        }

        @Override // java.util.ListIterator
        public T previous() {
            return this.e.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            int d;
            d = C8579dqv.d((List<?>) this.b, this.e.nextIndex());
            return d;
        }

        @Override // java.util.ListIterator
        public void add(T t) {
            this.e.add(t);
            this.e.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.e.remove();
        }

        @Override // java.util.ListIterator
        public void set(T t) {
            this.e.set(t);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<T> listIterator(int i) {
        return new d(this, i);
    }
}
