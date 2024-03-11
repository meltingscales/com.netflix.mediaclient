package kotlin.collections.builders;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import o.C8564dqg;
import o.C8566dqi;
import o.C8627dsp;
import o.C8632dsu;
import o.dpT;
import o.dpW;
import o.dqV;
import o.dsR;

/* loaded from: classes.dex */
public final class ListBuilder<E> extends dpW<E> implements List<E>, RandomAccess, Serializable {
    private static final ListBuilder a;
    private static final d c = new d(null);
    private E[] b;
    private final ListBuilder<E> d;
    private boolean e;
    private int f;
    private int i;
    private final ListBuilder<E> j;

    private final void d() {
        ((AbstractList) this).modCount++;
    }

    /* loaded from: classes5.dex */
    static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }

    private ListBuilder(E[] eArr, int i, int i2, boolean z, ListBuilder<E> listBuilder, ListBuilder<E> listBuilder2) {
        this.b = eArr;
        this.i = i;
        this.f = i2;
        this.e = z;
        this.d = listBuilder;
        this.j = listBuilder2;
        if (listBuilder != null) {
            ((AbstractList) this).modCount = ((AbstractList) listBuilder).modCount;
        }
    }

    static {
        ListBuilder listBuilder = new ListBuilder(0);
        listBuilder.e = true;
        a = listBuilder;
    }

    public ListBuilder() {
        this(10);
    }

    public ListBuilder(int i) {
        this(dqV.e(i), 0, 0, false, null, null);
    }

    public final List<E> a() {
        if (this.d != null) {
            throw new IllegalStateException();
        }
        b();
        this.e = true;
        return this.f > 0 ? this : a;
    }

    private final Object writeReplace() {
        if (e()) {
            return new SerializedCollection(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // o.dpW
    public int getSize() {
        c();
        return this.f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        c();
        return this.f == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        c();
        dpT.Companion.c(i, this.f);
        return this.b[this.i + i];
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        b();
        c();
        dpT.Companion.c(i, this.f);
        E[] eArr = this.b;
        int i2 = this.i + i;
        E e2 = eArr[i2];
        eArr[i2] = e;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        c();
        for (int i = 0; i < this.f; i++) {
            if (C8632dsu.c(this.b[this.i + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        c();
        for (int i = this.f - 1; i >= 0; i--) {
            if (C8632dsu.c(this.b[this.i + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i) {
        c();
        dpT.Companion.b(i, this.f);
        return new a(this, i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        b();
        c();
        d(this.i + this.f, e);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        b();
        c();
        dpT.Companion.b(i, this.f);
        d(this.i + i, e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        C8632dsu.c((Object) collection, "");
        b();
        c();
        int size = collection.size();
        e(this.i + this.f, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        C8632dsu.c((Object) collection, "");
        b();
        c();
        dpT.Companion.b(i, this.f);
        int size = collection.size();
        e(this.i + i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        b();
        c();
        a(this.i, this.f);
    }

    @Override // o.dpW
    public E removeAt(int i) {
        b();
        c();
        dpT.Companion.c(i, this.f);
        return e(this.i + i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        b();
        c();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        return indexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> collection) {
        C8632dsu.c((Object) collection, "");
        b();
        c();
        return d(this.i, this.f, collection, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> collection) {
        C8632dsu.c((Object) collection, "");
        b();
        c();
        return d(this.i, this.f, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<E> subList(int i, int i2) {
        dpT.Companion.c(i, i2, this.f);
        E[] eArr = this.b;
        int i3 = this.i;
        boolean z = this.e;
        ListBuilder<E> listBuilder = this.j;
        return new ListBuilder(eArr, i3 + i, i2 - i, z, this, listBuilder == null ? this : listBuilder);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        Object[] a2;
        C8632dsu.c((Object) tArr, "");
        c();
        int length = tArr.length;
        int i = this.f;
        if (length < i) {
            E[] eArr = this.b;
            int i2 = this.i;
            T[] tArr2 = (T[]) Arrays.copyOfRange(eArr, i2, i + i2, tArr.getClass());
            C8632dsu.a(tArr2, "");
            return tArr2;
        }
        E[] eArr2 = this.b;
        int i3 = this.i;
        C8564dqg.d(eArr2, tArr, 0, i3, i + i3);
        a2 = C8566dqi.a(this.f, tArr);
        return (T[]) a2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        Object[] d2;
        c();
        E[] eArr = this.b;
        int i = this.i;
        d2 = C8564dqg.d(eArr, i, this.f + i);
        return d2;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        c();
        return obj == this || ((obj instanceof List) && c((List) obj));
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int a2;
        c();
        a2 = dqV.a(this.b, this.i, this.f);
        return a2;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String d2;
        c();
        d2 = dqV.d((Object[]) this.b, this.i, this.f, (Collection) this);
        return d2;
    }

    private final void c() {
        ListBuilder<E> listBuilder = this.j;
        if (listBuilder != null && ((AbstractList) listBuilder).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void b() {
        if (e()) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean e() {
        ListBuilder<E> listBuilder;
        return this.e || ((listBuilder = this.j) != null && listBuilder.e);
    }

    private final void b(int i) {
        a(this.f + i);
    }

    private final void a(int i) {
        if (i < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.b;
        if (i > eArr.length) {
            this.b = (E[]) dqV.b(this.b, dpT.Companion.d(eArr.length, i));
        }
    }

    private final boolean c(List<?> list) {
        boolean a2;
        a2 = dqV.a(this.b, this.i, this.f, list);
        return a2;
    }

    private final void e(int i, int i2) {
        b(i2);
        E[] eArr = this.b;
        C8564dqg.d(eArr, eArr, i + i2, i, this.i + this.f);
        this.f += i2;
    }

    private final void d(int i, E e) {
        d();
        ListBuilder<E> listBuilder = this.d;
        if (listBuilder != null) {
            listBuilder.d(i, e);
            this.b = this.d.b;
            this.f++;
            return;
        }
        e(i, 1);
        this.b[i] = e;
    }

    private final void e(int i, Collection<? extends E> collection, int i2) {
        d();
        ListBuilder<E> listBuilder = this.d;
        if (listBuilder != null) {
            listBuilder.e(i, collection, i2);
            this.b = this.d.b;
            this.f += i2;
            return;
        }
        e(i, i2);
        Iterator<? extends E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.b[i + i3] = it.next();
        }
    }

    private final E e(int i) {
        d();
        ListBuilder<E> listBuilder = this.d;
        if (listBuilder != null) {
            this.f--;
            return listBuilder.e(i);
        }
        E[] eArr = this.b;
        E e = eArr[i];
        C8564dqg.d(eArr, eArr, i, i + 1, this.i + this.f);
        dqV.d(this.b, (this.i + this.f) - 1);
        this.f--;
        return e;
    }

    private final void a(int i, int i2) {
        if (i2 > 0) {
            d();
        }
        ListBuilder<E> listBuilder = this.d;
        if (listBuilder != null) {
            listBuilder.a(i, i2);
        } else {
            E[] eArr = this.b;
            C8564dqg.d(eArr, eArr, i, i + i2, this.f);
            E[] eArr2 = this.b;
            int i3 = this.f;
            dqV.d(eArr2, i3 - i2, i3);
        }
        this.f -= i2;
    }

    private final int d(int i, int i2, Collection<? extends E> collection, boolean z) {
        int i3;
        ListBuilder<E> listBuilder = this.d;
        if (listBuilder != null) {
            i3 = listBuilder.d(i, i2, collection, z);
        } else {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                int i6 = i + i4;
                if (collection.contains(this.b[i6]) == z) {
                    E[] eArr = this.b;
                    i4++;
                    eArr[i5 + i] = eArr[i6];
                    i5++;
                } else {
                    i4++;
                }
            }
            int i7 = i2 - i5;
            E[] eArr2 = this.b;
            C8564dqg.d(eArr2, eArr2, i5 + i, i2 + i, this.f);
            E[] eArr3 = this.b;
            int i8 = this.f;
            dqV.d(eArr3, i8 - i7, i8);
            i3 = i7;
        }
        if (i3 > 0) {
            d();
        }
        this.f -= i3;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a<E> implements ListIterator<E>, dsR {
        private int a;
        private int b;
        private final ListBuilder<E> c;
        private int d;

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.b > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.b;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.b - 1;
        }

        public a(ListBuilder<E> listBuilder, int i) {
            C8632dsu.c((Object) listBuilder, "");
            this.c = listBuilder;
            this.b = i;
            this.d = -1;
            this.a = ((AbstractList) listBuilder).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.b < ((ListBuilder) this.c).f;
        }

        @Override // java.util.ListIterator
        public E previous() {
            a();
            int i = this.b;
            if (i > 0) {
                int i2 = i - 1;
                this.b = i2;
                this.d = i2;
                return (E) ((ListBuilder) this.c).b[((ListBuilder) this.c).i + this.d];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            a();
            if (this.b < ((ListBuilder) this.c).f) {
                int i = this.b;
                this.b = i + 1;
                this.d = i;
                return (E) ((ListBuilder) this.c).b[((ListBuilder) this.c).i + this.d];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public void set(E e) {
            a();
            int i = this.d;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            }
            this.c.set(i, e);
        }

        @Override // java.util.ListIterator
        public void add(E e) {
            a();
            ListBuilder<E> listBuilder = this.c;
            int i = this.b;
            this.b = i + 1;
            listBuilder.add(i, e);
            this.d = -1;
            this.a = ((AbstractList) this.c).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            a();
            int i = this.d;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
            }
            this.c.remove(i);
            this.b = this.d;
            this.d = -1;
            this.a = ((AbstractList) this.c).modCount;
        }

        private final void a() {
            if (((AbstractList) this.c).modCount != this.a) {
                throw new ConcurrentModificationException();
            }
        }
    }
}
