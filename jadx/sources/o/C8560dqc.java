package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.dqc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8560dqc<E> extends dpW<E> {
    private int b;
    private Object[] c;
    private int d;
    public static final c e = new c(null);
    private static final Object[] a = new Object[0];

    @Override // o.dpW
    public int getSize() {
        return this.b;
    }

    public C8560dqc(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = a;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + i);
        }
        this.c = objArr;
    }

    public C8560dqc() {
        this.c = a;
    }

    private final void e(int i) {
        int b;
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.c;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == a) {
            b = C8657dts.b(i, 10);
            this.c = new Object[b];
            return;
        }
        c(dpT.Companion.d(objArr.length, i));
    }

    private final void c(int i) {
        Object[] objArr = new Object[i];
        Object[] objArr2 = this.c;
        C8564dqg.d(objArr2, objArr, 0, this.d, objArr2.length);
        Object[] objArr3 = this.c;
        int length = objArr3.length;
        int i2 = this.d;
        C8564dqg.d(objArr3, objArr, length - i2, 0, i2);
        this.d = 0;
        this.c = objArr;
    }

    private final int h(int i) {
        Object[] objArr = this.c;
        return i >= objArr.length ? i - objArr.length : i;
    }

    private final int b(int i) {
        return i < 0 ? i + this.c.length : i;
    }

    private final int d(int i) {
        int w;
        w = C8563dqf.w(this.c);
        if (i == w) {
            return 0;
        }
        return i + 1;
    }

    private final int a(int i) {
        int w;
        if (i == 0) {
            w = C8563dqf.w(this.c);
            return w;
        }
        return i - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final E b() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.c[this.d];
    }

    public final E c() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.c[this.d];
    }

    public final E e() {
        int t;
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.c;
        int i = this.d;
        t = C8569dql.t(this);
        return (E) objArr[h(i + t)];
    }

    public final E a() {
        int t;
        if (isEmpty()) {
            return null;
        }
        Object[] objArr = this.c;
        int i = this.d;
        t = C8569dql.t(this);
        return (E) objArr[h(i + t)];
    }

    public final void c(E e2) {
        e(size() + 1);
        int a2 = a(this.d);
        this.d = a2;
        this.c[a2] = e2;
        this.b = size() + 1;
    }

    public final void b(E e2) {
        e(size() + 1);
        this.c[h(this.d + size())] = e2;
        this.b = size() + 1;
    }

    public final E d() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.c;
        int i = this.d;
        E e2 = (E) objArr[i];
        objArr[i] = null;
        this.d = d(i);
        this.b = size() - 1;
        return e2;
    }

    public final E g() {
        if (isEmpty()) {
            return null;
        }
        return d();
    }

    public final E j() {
        int t;
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int i = this.d;
        t = C8569dql.t(this);
        int h = h(i + t);
        Object[] objArr = this.c;
        E e2 = (E) objArr[h];
        objArr[h] = null;
        this.b = size() - 1;
        return e2;
    }

    public final E i() {
        if (isEmpty()) {
            return null;
        }
        return j();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e2) {
        b((C8560dqc<E>) e2);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e2) {
        dpT.Companion.b(i, size());
        if (i == size()) {
            b((C8560dqc<E>) e2);
        } else if (i == 0) {
            c((C8560dqc<E>) e2);
        } else {
            e(size() + 1);
            int h = h(this.d + i);
            if (i < ((size() + 1) >> 1)) {
                int a2 = a(h);
                int a3 = a(this.d);
                int i2 = this.d;
                if (a2 >= i2) {
                    Object[] objArr = this.c;
                    objArr[a3] = objArr[i2];
                    C8564dqg.d(objArr, objArr, i2, i2 + 1, a2 + 1);
                } else {
                    Object[] objArr2 = this.c;
                    C8564dqg.d(objArr2, objArr2, i2 - 1, i2, objArr2.length);
                    Object[] objArr3 = this.c;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    C8564dqg.d(objArr3, objArr3, 0, 1, a2 + 1);
                }
                this.c[a2] = e2;
                this.d = a3;
            } else {
                int h2 = h(this.d + size());
                if (h < h2) {
                    Object[] objArr4 = this.c;
                    C8564dqg.d(objArr4, objArr4, h + 1, h, h2);
                } else {
                    Object[] objArr5 = this.c;
                    C8564dqg.d(objArr5, objArr5, 1, 0, h2);
                    Object[] objArr6 = this.c;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    C8564dqg.d(objArr6, objArr6, h + 1, h, objArr6.length - 1);
                }
                this.c[h] = e2;
            }
            this.b = size() + 1;
        }
    }

    private final void c(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.c.length;
        while (i < length && it.hasNext()) {
            this.c[i] = it.next();
            i++;
        }
        int i2 = this.d;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.c[i3] = it.next();
        }
        this.b = size() + collection.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        C8632dsu.c((Object) collection, "");
        if (collection.isEmpty()) {
            return false;
        }
        e(size() + collection.size());
        c(h(this.d + size()), collection);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        C8632dsu.c((Object) collection, "");
        dpT.Companion.b(i, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        e(size() + collection.size());
        int h = h(this.d + size());
        int h2 = h(this.d + i);
        int size = collection.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.d;
            int i3 = i2 - size;
            if (h2 < i2) {
                Object[] objArr = this.c;
                C8564dqg.d(objArr, objArr, i3, i2, objArr.length);
                if (size >= h2) {
                    Object[] objArr2 = this.c;
                    C8564dqg.d(objArr2, objArr2, objArr2.length - size, 0, h2);
                } else {
                    Object[] objArr3 = this.c;
                    C8564dqg.d(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.c;
                    C8564dqg.d(objArr4, objArr4, 0, size, h2);
                }
            } else if (i3 >= 0) {
                Object[] objArr5 = this.c;
                C8564dqg.d(objArr5, objArr5, i3, i2, h2);
            } else {
                Object[] objArr6 = this.c;
                i3 += objArr6.length;
                int length = objArr6.length - i3;
                if (length >= h2 - i2) {
                    C8564dqg.d(objArr6, objArr6, i3, i2, h2);
                } else {
                    C8564dqg.d(objArr6, objArr6, i3, i2, i2 + length);
                    Object[] objArr7 = this.c;
                    C8564dqg.d(objArr7, objArr7, 0, this.d + length, h2);
                }
            }
            this.d = i3;
            c(b(h2 - size), collection);
        } else {
            int i4 = h2 + size;
            if (h2 < h) {
                int i5 = size + h;
                Object[] objArr8 = this.c;
                if (i5 <= objArr8.length) {
                    C8564dqg.d(objArr8, objArr8, i4, h2, h);
                } else if (i4 >= objArr8.length) {
                    C8564dqg.d(objArr8, objArr8, i4 - objArr8.length, h2, h);
                } else {
                    int length2 = h - (i5 - objArr8.length);
                    C8564dqg.d(objArr8, objArr8, 0, length2, h);
                    Object[] objArr9 = this.c;
                    C8564dqg.d(objArr9, objArr9, i4, h2, length2);
                }
            } else {
                Object[] objArr10 = this.c;
                C8564dqg.d(objArr10, objArr10, size, 0, h);
                Object[] objArr11 = this.c;
                if (i4 >= objArr11.length) {
                    C8564dqg.d(objArr11, objArr11, i4 - objArr11.length, h2, objArr11.length);
                } else {
                    C8564dqg.d(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.c;
                    C8564dqg.d(objArr12, objArr12, i4, h2, objArr12.length - size);
                }
            }
            c(h2, collection);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        dpT.Companion.c(i, size());
        return (E) this.c[h(this.d + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e2) {
        dpT.Companion.c(i, size());
        int h = h(this.d + i);
        Object[] objArr = this.c;
        E e3 = (E) objArr[h];
        objArr[h] = e2;
        return e3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i;
        int h = h(this.d + size());
        int i2 = this.d;
        if (i2 < h) {
            while (i2 < h) {
                if (C8632dsu.c(obj, this.c[i2])) {
                    i = this.d;
                } else {
                    i2++;
                }
            }
            return -1;
        } else if (i2 < h) {
            return -1;
        } else {
            int length = this.c.length;
            while (true) {
                if (i2 >= length) {
                    for (int i3 = 0; i3 < h; i3++) {
                        if (C8632dsu.c(obj, this.c[i3])) {
                            i2 = i3 + this.c.length;
                            i = this.d;
                        }
                    }
                    return -1;
                } else if (C8632dsu.c(obj, this.c[i2])) {
                    i = this.d;
                    break;
                } else {
                    i2++;
                }
            }
        }
        return i2 - i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int w;
        int i;
        int h = h(this.d + size());
        int i2 = this.d;
        if (i2 < h) {
            w = h - 1;
            if (i2 <= w) {
                while (!C8632dsu.c(obj, this.c[w])) {
                    if (w != i2) {
                        w--;
                    }
                }
                i = this.d;
                return w - i;
            }
            return -1;
        }
        if (i2 > h) {
            int i3 = h - 1;
            while (true) {
                if (-1 < i3) {
                    if (C8632dsu.c(obj, this.c[i3])) {
                        w = i3 + this.c.length;
                        i = this.d;
                        break;
                    }
                    i3--;
                } else {
                    w = C8563dqf.w(this.c);
                    int i4 = this.d;
                    if (i4 <= w) {
                        while (!C8632dsu.c(obj, this.c[w])) {
                            if (w != i4) {
                                w--;
                            }
                        }
                        i = this.d;
                    }
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // o.dpW
    public E removeAt(int i) {
        int t;
        int t2;
        dpT.Companion.c(i, size());
        t = C8569dql.t(this);
        if (i == t) {
            return j();
        }
        if (i == 0) {
            return d();
        }
        int h = h(this.d + i);
        E e2 = (E) this.c[h];
        if (i < (size() >> 1)) {
            int i2 = this.d;
            if (h >= i2) {
                Object[] objArr = this.c;
                C8564dqg.d(objArr, objArr, i2 + 1, i2, h);
            } else {
                Object[] objArr2 = this.c;
                C8564dqg.d(objArr2, objArr2, 1, 0, h);
                Object[] objArr3 = this.c;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i3 = this.d;
                C8564dqg.d(objArr3, objArr3, i3 + 1, i3, objArr3.length - 1);
            }
            Object[] objArr4 = this.c;
            int i4 = this.d;
            objArr4[i4] = null;
            this.d = d(i4);
        } else {
            int i5 = this.d;
            t2 = C8569dql.t(this);
            int h2 = h(i5 + t2);
            if (h <= h2) {
                Object[] objArr5 = this.c;
                C8564dqg.d(objArr5, objArr5, h, h + 1, h2 + 1);
            } else {
                Object[] objArr6 = this.c;
                C8564dqg.d(objArr6, objArr6, h, h + 1, objArr6.length);
                Object[] objArr7 = this.c;
                objArr7[objArr7.length - 1] = objArr7[0];
                C8564dqg.d(objArr7, objArr7, 0, 1, h2 + 1);
            }
            this.c[h2] = null;
        }
        this.b = size() - 1;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int h = h(this.d + size());
        int i = this.d;
        if (i < h) {
            C8564dqg.d(this.c, null, i, h);
        } else if (!isEmpty()) {
            Object[] objArr = this.c;
            C8564dqg.d(objArr, null, this.d, objArr.length);
            C8564dqg.d(this.c, null, 0, h);
        }
        this.d = 0;
        this.b = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        Object[] a2;
        C8632dsu.c((Object) tArr, "");
        if (tArr.length < size()) {
            tArr = (T[]) C8565dqh.d(tArr, size());
        }
        int h = h(this.d + size());
        int i = this.d;
        if (i < h) {
            C8564dqg.e(this.c, tArr, 0, i, h, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.c;
            C8564dqg.d(objArr, tArr, 0, this.d, objArr.length);
            Object[] objArr2 = this.c;
            C8564dqg.d(objArr2, tArr, objArr2.length - this.d, 0, h);
        }
        a2 = C8566dqi.a(size(), tArr);
        return (T[]) a2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    /* renamed from: o.dqc$c */
    /* loaded from: classes.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> collection) {
        int h;
        C8632dsu.c((Object) collection, "");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.c.length != 0) {
            int h2 = h(this.d + size());
            int i = this.d;
            if (i < h2) {
                h = i;
                while (i < h2) {
                    Object obj = this.c[i];
                    if (!collection.contains(obj)) {
                        this.c[h] = obj;
                        h++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                C8564dqg.d(this.c, null, h, h2);
            } else {
                int length = this.c.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.c;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (!collection.contains(obj2)) {
                        this.c[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                h = h(i2);
                for (int i3 = 0; i3 < h2; i3++) {
                    Object[] objArr2 = this.c;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (!collection.contains(obj3)) {
                        this.c[h] = obj3;
                        h = d(h);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                this.b = b(h - this.d);
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> collection) {
        int h;
        C8632dsu.c((Object) collection, "");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.c.length != 0) {
            int h2 = h(this.d + size());
            int i = this.d;
            if (i < h2) {
                h = i;
                while (i < h2) {
                    Object obj = this.c[i];
                    if (collection.contains(obj)) {
                        this.c[h] = obj;
                        h++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                C8564dqg.d(this.c, null, h, h2);
            } else {
                int length = this.c.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.c;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.c[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                h = h(i2);
                for (int i3 = 0; i3 < h2; i3++) {
                    Object[] objArr2 = this.c;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.c[h] = obj3;
                        h = d(h);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                this.b = b(h - this.d);
            }
        }
        return z;
    }
}
