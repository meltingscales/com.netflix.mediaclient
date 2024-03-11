package o;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import o.duT;

/* renamed from: o.dvg  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8699dvg<E> extends dpW<E> implements duT.e<E> {
    private int a;
    private C8729dwj b;
    private Object[] c;
    private Object[] d;
    private int e;
    private Object[] g;
    private Object[] h;
    private duT<? extends E> j;

    private final Object[] c(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.b;
        return objArr;
    }

    private final Object[] g() {
        Object[] objArr = new Object[33];
        objArr[32] = this.b;
        return objArr;
    }

    public final int a() {
        return this.e;
    }

    public final Object[] b() {
        return this.d;
    }

    public final Object[] c() {
        return this.c;
    }

    public final int e() {
        return ((AbstractList) this).modCount;
    }

    @Override // o.dpW
    public int getSize() {
        return this.a;
    }

    public C8699dvg(duT<? extends E> dut, Object[] objArr, Object[] objArr2, int i) {
        C8632dsu.c((Object) dut, "");
        C8632dsu.c((Object) objArr2, "");
        this.j = dut;
        this.h = objArr;
        this.g = objArr2;
        this.e = i;
        this.b = new C8729dwj();
        this.c = this.h;
        this.d = this.g;
        this.a = this.j.size();
    }

    @Override // o.duT.e
    public duT<E> d() {
        duT<? extends E> c8698dvf;
        duT<? extends E> dut;
        if (this.c == this.h && this.d == this.g) {
            dut = this.j;
        } else {
            this.b = new C8729dwj();
            Object[] objArr = this.c;
            this.h = objArr;
            Object[] objArr2 = this.d;
            this.g = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    dut = C8705dvm.d();
                } else {
                    Object[] copyOf = Arrays.copyOf(objArr2, size());
                    C8632dsu.a(copyOf, "");
                    c8698dvf = new C8704dvl<>(copyOf);
                }
            } else {
                C8632dsu.d(objArr);
                c8698dvf = new C8698dvf<>(objArr, this.d, size(), this.e);
            }
            dut = c8698dvf;
        }
        this.j = dut;
        return (duT<E>) dut;
    }

    private final int i() {
        if (size() <= 32) {
            return 0;
        }
        return C8705dvm.a(size());
    }

    private final int d(int i) {
        return i <= 32 ? i : i - C8705dvm.a(i);
    }

    private final int j() {
        return d(size());
    }

    private final boolean b(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.b;
    }

    private final Object[] a(Object[] objArr) {
        int i;
        Object[] e;
        if (objArr == null) {
            return g();
        }
        if (b(objArr)) {
            return objArr;
        }
        Object[] g = g();
        i = C8657dts.i(objArr.length, 32);
        e = C8564dqg.e(objArr, g, 0, 0, i, 6, null);
        return e;
    }

    private final Object[] e(Object[] objArr, int i) {
        Object[] d;
        Object[] d2;
        if (b(objArr)) {
            d2 = C8564dqg.d(objArr, objArr, i, 0, 32 - i);
            return d2;
        }
        d = C8564dqg.d(objArr, g(), i, 0, 32 - i);
        return d;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        ((AbstractList) this).modCount++;
        int j = j();
        if (j < 32) {
            Object[] a = a(this.d);
            a[j] = e;
            this.d = a;
            this.a = size() + 1;
        } else {
            d(this.c, this.d, c(e));
        }
        return true;
    }

    private final void d(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size();
        int i = this.e;
        if ((size >> 5) > (1 << i)) {
            this.c = d(c(objArr), objArr2, this.e + 5);
            this.d = objArr3;
            this.e += 5;
            this.a = size() + 1;
        } else if (objArr == null) {
            this.c = objArr2;
            this.d = objArr3;
            this.a = size() + 1;
        } else {
            this.c = d(objArr, objArr2, i);
            this.d = objArr3;
            this.a = size() + 1;
        }
    }

    private final Object[] d(Object[] objArr, Object[] objArr2, int i) {
        int b = C8705dvm.b(size() - 1, i);
        Object[] a = a(objArr);
        if (i == 5) {
            a[b] = objArr2;
        } else {
            a[b] = d((Object[]) a[b], objArr2, i - 5);
        }
        return a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        C8632dsu.c((Object) collection, "");
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int j = j();
        Iterator<? extends E> it = collection.iterator();
        if (32 - j >= collection.size()) {
            this.d = d(a(this.d), j, it);
            this.a = size() + collection.size();
        } else {
            int size = ((collection.size() + j) - 1) / 32;
            Object[][] objArr = new Object[size];
            objArr[0] = d(a(this.d), j, it);
            for (int i = 1; i < size; i++) {
                objArr[i] = d(g(), 0, it);
            }
            this.c = c(this.c, i(), objArr);
            this.d = d(g(), 0, it);
            this.a = size() + collection.size();
        }
        return true;
    }

    private final Object[] d(Object[] objArr, int i, Iterator<? extends Object> it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    private final Object[] c(Object[] objArr, int i, Object[][] objArr2) {
        Object[] a;
        Iterator<Object[]> b = C8621dsj.b(objArr2);
        int i2 = this.e;
        if ((i >> 5) < (1 << i2)) {
            a = a(objArr, i, i2, b);
        } else {
            a = a(objArr);
        }
        while (b.hasNext()) {
            this.e += 5;
            a = c(a);
            int i3 = this.e;
            a(a, 1 << i3, i3, b);
        }
        return a;
    }

    private final Object[] a(Object[] objArr, int i, int i2, Iterator<Object[]> it) {
        if (it.hasNext()) {
            if (i2 >= 0) {
                if (i2 == 0) {
                    return it.next();
                }
                Object[] a = a(objArr);
                int b = C8705dvm.b(i, i2);
                int i3 = i2 - 5;
                a[b] = a((Object[]) a[b], i, i3, it);
                while (true) {
                    b++;
                    if (b >= 32 || !it.hasNext()) {
                        break;
                    }
                    a[b] = a((Object[]) a[b], 0, i3, it);
                }
                return a;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        C8728dwi.c(i, size());
        if (i == size()) {
            add(e);
            return;
        }
        ((AbstractList) this).modCount++;
        int i2 = i();
        if (i >= i2) {
            a(this.c, i - i2, e);
            return;
        }
        C8695dvc c8695dvc = new C8695dvc(null);
        Object[] objArr = this.c;
        C8632dsu.d(objArr);
        a(b(objArr, this.e, i, e, c8695dvc), 0, c8695dvc.b());
    }

    private final void a(Object[] objArr, int i, E e) {
        int j = j();
        Object[] a = a(this.d);
        if (j < 32) {
            C8564dqg.d(this.d, a, i + 1, i, j);
            a[i] = e;
            this.c = objArr;
            this.d = a;
            this.a = size() + 1;
            return;
        }
        Object[] objArr2 = this.d;
        Object obj = objArr2[31];
        C8564dqg.d(objArr2, a, i + 1, i, 31);
        a[i] = e;
        d(objArr, a, c(obj));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object[] b(java.lang.Object[] r9, int r10, int r11, java.lang.Object r12, o.C8695dvc r13) {
        /*
            r8 = this;
            int r0 = o.C8705dvm.b(r11, r10)
            if (r10 != 0) goto L1a
            r10 = 31
            r11 = r9[r10]
            r13.b(r11)
            java.lang.Object[] r11 = r8.a(r9)
            int r13 = r0 + 1
            java.lang.Object[] r9 = o.C8561dqd.e(r9, r11, r13, r0, r10)
            r9[r0] = r12
            return r9
        L1a:
            java.lang.Object[] r9 = r8.a(r9)
            int r10 = r10 + (-5)
            r1 = r9[r0]
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            if (r1 == 0) goto L5a
            r2 = r1
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r1 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            java.lang.Object[] r11 = r1.b(r2, r3, r4, r5, r6)
            r9[r0] = r11
        L34:
            int r0 = r0 + 1
            r11 = 32
            if (r0 >= r11) goto L59
            r11 = r9[r0]
            if (r11 != 0) goto L3f
            goto L59
        L3f:
            if (r11 == 0) goto L53
            r2 = r11
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r4 = 0
            java.lang.Object r5 = r13.b()
            r1 = r8
            r3 = r10
            r6 = r13
            java.lang.Object[] r11 = r1.b(r2, r3, r4, r5, r6)
            r9[r0] = r11
            goto L34
        L53:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            r9.<init>(r7)
            throw r9
        L59:
            return r9
        L5a:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            r9.<init>(r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8699dvg.b(java.lang.Object[], int, int, java.lang.Object, o.dvc):java.lang.Object[]");
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        Object[] d;
        Object[] d2;
        C8632dsu.c((Object) collection, "");
        C8728dwi.c(i, size());
        if (i == size()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = (((size() - i2) + collection.size()) - 1) / 32;
        if (size == 0) {
            C8725dwf.d(i >= i());
            int i3 = i & 31;
            int size2 = collection.size();
            Object[] objArr = this.d;
            d2 = C8564dqg.d(objArr, a(objArr), (((i + size2) - 1) & 31) + 1, i3, j());
            d(d2, i3, collection.iterator());
            this.d = d2;
            this.a = size() + collection.size();
            return true;
        }
        Object[][] objArr2 = new Object[size];
        int j = j();
        int d3 = d(size() + collection.size());
        if (i >= i()) {
            d = g();
            c(collection, i, this.d, j, objArr2, size, d);
        } else if (d3 > j) {
            int i4 = d3 - j;
            d = e(this.d, i4);
            e(collection, i, i4, objArr2, size, d);
        } else {
            int i5 = j - d3;
            d = C8564dqg.d(this.d, g(), 0, i5, j);
            int i6 = 32 - i5;
            Object[] e = e(this.d, i6);
            int i7 = size - 1;
            objArr2[i7] = e;
            e(collection, i, i6, objArr2, i7, e);
        }
        this.c = c(this.c, i2, objArr2);
        this.d = d;
        this.a = size() + collection.size();
        return true;
    }

    private final void e(Collection<? extends E> collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.c == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        int i4 = i >> 5;
        Object[] a = a(i4, i2, objArr, i3, objArr2);
        int i5 = i3 - (((i() >> 5) - 1) - i4);
        if (i5 < i3) {
            objArr2 = objArr[i5];
            C8632dsu.d(objArr2);
        }
        c(collection, i, a, 32, objArr, i5, objArr2);
    }

    private final Object[] a(int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.c == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        ListIterator<Object[]> e = e(i() >> 5);
        while (e.previousIndex() != i) {
            Object[] previous = e.previous();
            C8564dqg.d(previous, objArr2, 0, 32 - i2, 32);
            objArr2 = e(previous, i2);
            i3--;
            objArr[i3] = objArr2;
        }
        return e.previous();
    }

    private final void c(Collection<? extends E> collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] g;
        if (i3 < 1) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Object[] a = a(objArr);
        objArr2[0] = a;
        int i4 = i & 31;
        int size = ((i + collection.size()) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            C8564dqg.d(a, objArr3, size + 1, i4, i2);
        } else {
            if (i3 == 1) {
                g = a;
            } else {
                g = g();
                i3--;
                objArr2[i3] = g;
            }
            int i6 = i2 - (i5 - 31);
            C8564dqg.d(a, objArr3, 0, i6, i2);
            C8564dqg.d(a, g, size + 1, i4, i6);
            objArr3 = g;
        }
        Iterator<? extends E> it = collection.iterator();
        d(a, i4, it);
        for (int i7 = 1; i7 < i3; i7++) {
            objArr2[i7] = d(g(), 0, it);
        }
        d(objArr3, 0, it);
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        C8728dwi.b(i, size());
        return (E) a(i)[i & 31];
    }

    private final Object[] a(int i) {
        if (i() <= i) {
            return this.d;
        }
        Object[] objArr = this.c;
        C8632dsu.d(objArr);
        for (int i2 = this.e; i2 > 0; i2 -= 5) {
            Object[] objArr2 = objArr[C8705dvm.b(i, i2)];
            if (objArr2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            objArr = objArr2;
        }
        return objArr;
    }

    @Override // o.dpW
    public E removeAt(int i) {
        C8728dwi.b(i, size());
        ((AbstractList) this).modCount++;
        int i2 = i();
        if (i >= i2) {
            return (E) e(this.c, i2, this.e, i - i2);
        }
        C8695dvc c8695dvc = new C8695dvc(this.d[0]);
        Object[] objArr = this.c;
        C8632dsu.d(objArr);
        e(c(objArr, this.e, i, c8695dvc), i2, this.e, 0);
        return (E) c8695dvc.b();
    }

    private final Object e(Object[] objArr, int i, int i2, int i3) {
        Object[] d;
        int size = size() - i;
        C8725dwf.d(i3 < size);
        if (size == 1) {
            Object obj = this.d[0];
            b(objArr, i, i2);
            return obj;
        }
        Object[] objArr2 = this.d;
        Object obj2 = objArr2[i3];
        d = C8564dqg.d(objArr2, a(objArr2), i3, i3 + 1, size);
        d[size - 1] = null;
        this.c = objArr;
        this.d = d;
        this.a = (i + size) - 1;
        this.e = i2;
        return obj2;
    }

    private final Object[] c(Object[] objArr, int i, int i2, C8695dvc c8695dvc) {
        Object[] d;
        int b = C8705dvm.b(i2, i);
        if (i == 0) {
            Object obj = objArr[b];
            d = C8564dqg.d(objArr, a(objArr), b, b + 1, 32);
            d[31] = c8695dvc.b();
            c8695dvc.b(obj);
            return d;
        }
        int b2 = objArr[31] == null ? C8705dvm.b(i() - 1, i) : 31;
        Object[] a = a(objArr);
        int i3 = i - 5;
        int i4 = b + 1;
        if (i4 <= b2) {
            while (true) {
                Object obj2 = a[b2];
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
                a[b2] = c((Object[]) obj2, i3, 0, c8695dvc);
                if (b2 == i4) {
                    break;
                }
                b2--;
            }
        }
        Object obj3 = a[b];
        if (obj3 != null) {
            a[b] = c((Object[]) obj3, i3, i2, c8695dvc);
            return a;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    private final void b(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.c = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.d = objArr;
            this.a = i;
            this.e = i2;
            return;
        }
        C8695dvc c8695dvc = new C8695dvc(null);
        C8632dsu.d(objArr);
        Object[] d = d(objArr, i2, i, c8695dvc);
        C8632dsu.d(d);
        Object b = c8695dvc.b();
        if (b == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        this.d = (Object[]) b;
        this.a = i;
        if (d[1] == null) {
            this.c = (Object[]) d[0];
            i2 -= 5;
        } else {
            this.c = d;
        }
        this.e = i2;
    }

    private final Object[] d(Object[] objArr, int i, int i2, C8695dvc c8695dvc) {
        Object[] d;
        int b = C8705dvm.b(i2 - 1, i);
        if (i == 5) {
            c8695dvc.b(objArr[b]);
            d = null;
        } else {
            Object obj = objArr[b];
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            d = d((Object[]) obj, i - 5, i2, c8695dvc);
        }
        if (d == null && b == 0) {
            return null;
        }
        Object[] a = a(objArr);
        a[b] = d;
        return a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(final Collection<? extends Object> collection) {
        C8632dsu.c((Object) collection, "");
        return a(new drM<E, Boolean>() { // from class: kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder$removeAll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: a */
            public final Boolean invoke(E e) {
                return Boolean.valueOf(collection.contains(e));
            }
        });
    }

    public final boolean a(drM<? super E, Boolean> drm) {
        C8632dsu.c((Object) drm, "");
        boolean d = d(drm);
        if (d) {
            ((AbstractList) this).modCount++;
        }
        return d;
    }

    private final boolean d(drM<? super E, Boolean> drm) {
        Object[] a;
        int j = j();
        C8695dvc c8695dvc = new C8695dvc(null);
        if (this.c == null) {
            return d(drm, j, c8695dvc) != j;
        }
        ListIterator<Object[]> e = e(0);
        int i = 32;
        while (i == 32 && e.hasNext()) {
            i = d(drm, e.next(), 32, c8695dvc);
        }
        if (i == 32) {
            C8725dwf.d(!e.hasNext());
            int d = d(drm, j, c8695dvc);
            if (d == 0) {
                b(this.c, size(), this.e);
            }
            return d != j;
        }
        int previousIndex = e.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = i;
        while (e.hasNext()) {
            i2 = e(drm, e.next(), 32, i2, c8695dvc, arrayList2, arrayList);
            previousIndex = previousIndex;
        }
        int i3 = previousIndex;
        int e2 = e(drm, this.d, j, i2, c8695dvc, arrayList2, arrayList);
        Object b = c8695dvc.b();
        if (b == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        Object[] objArr = (Object[]) b;
        C8564dqg.d(objArr, null, e2, 32);
        if (arrayList.isEmpty()) {
            a = this.c;
            C8632dsu.d(a);
        } else {
            a = a(this.c, i3, this.e, arrayList.iterator());
        }
        int size = i3 + (arrayList.size() << 5);
        this.c = c(a, size);
        this.d = objArr;
        this.a = size + e2;
        return true;
    }

    private final Object[] c(Object[] objArr, int i) {
        if ((i & 31) != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (i == 0) {
            this.e = 0;
            return null;
        }
        int i2 = i - 1;
        while (true) {
            int i3 = this.e;
            if ((i2 >> i3) == 0) {
                this.e = i3 - 5;
                Object[] objArr2 = objArr[0];
                if (objArr2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
                objArr = objArr2;
            } else {
                return c(objArr, i2, i3);
            }
        }
    }

    private final Object[] c(Object[] objArr, int i, int i2) {
        if (i2 >= 0) {
            if (i2 == 0) {
                return objArr;
            }
            int b = C8705dvm.b(i, i2);
            Object obj = objArr[b];
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            Object c = c((Object[]) obj, i, i2 - 5);
            if (b < 31) {
                int i3 = b + 1;
                if (objArr[i3] != null) {
                    if (b(objArr)) {
                        C8564dqg.d(objArr, null, i3, 32);
                    }
                    objArr = C8564dqg.d(objArr, g(), 0, 0, i3);
                }
            }
            if (c != objArr[b]) {
                Object[] a = a(objArr);
                a[b] = c;
                return a;
            }
            return objArr;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final int d(drM<? super E, Boolean> drm, int i, C8695dvc c8695dvc) {
        int d = d(drm, this.d, i, c8695dvc);
        if (d == i) {
            C8725dwf.d(c8695dvc.b() == this.d);
            return i;
        }
        Object b = c8695dvc.b();
        if (b == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        Object[] objArr = (Object[]) b;
        C8564dqg.d(objArr, null, d, i);
        this.d = objArr;
        this.a = size() - (i - d);
        return d;
    }

    private final int d(drM<? super E, Boolean> drm, Object[] objArr, int i, C8695dvc c8695dvc) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (drm.invoke(obj).booleanValue()) {
                if (!z) {
                    objArr2 = a(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        c8695dvc.b(objArr2);
        return i2;
    }

    private final int e(drM<? super E, Boolean> drm, Object[] objArr, int i, int i2, C8695dvc c8695dvc, List<Object[]> list, List<Object[]> list2) {
        Object[] g;
        if (b(objArr)) {
            list.add(objArr);
        }
        Object b = c8695dvc.b();
        if (b == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        Object[] objArr2 = (Object[]) b;
        Object[] objArr3 = objArr2;
        int i3 = 0;
        while (i3 < i) {
            int i4 = i3 + 1;
            Object obj = objArr[i3];
            if (!drm.invoke(obj).booleanValue()) {
                if (i2 == 32) {
                    if (!list.isEmpty()) {
                        g = list.remove(list.size() - 1);
                    } else {
                        g = g();
                    }
                    objArr3 = g;
                    i2 = 0;
                }
                objArr3[i2] = obj;
                i2++;
            }
            i3 = i4;
        }
        c8695dvc.b(objArr3);
        if (objArr2 != c8695dvc.b()) {
            list2.add(objArr2);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        C8728dwi.b(i, size());
        if (i() <= i) {
            Object[] a = a(this.d);
            if (a != this.d) {
                ((AbstractList) this).modCount++;
            }
            int i2 = i & 31;
            E e2 = (E) a[i2];
            a[i2] = e;
            this.d = a;
            return e2;
        }
        C8695dvc c8695dvc = new C8695dvc(null);
        Object[] objArr = this.c;
        C8632dsu.d(objArr);
        this.c = a(objArr, this.e, i, (int) e, c8695dvc);
        return (E) c8695dvc.b();
    }

    private final Object[] a(Object[] objArr, int i, int i2, E e, C8695dvc c8695dvc) {
        int b = C8705dvm.b(i2, i);
        Object[] a = a(objArr);
        if (i == 0) {
            if (a != objArr) {
                ((AbstractList) this).modCount++;
            }
            c8695dvc.b(a[b]);
            a[b] = e;
            return a;
        }
        Object obj = a[b];
        if (obj != null) {
            a[b] = a((Object[]) obj, i - 5, i2, (int) e, c8695dvc);
            return a;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i) {
        C8728dwi.c(i, size());
        return new C8697dve(this, i);
    }

    private final ListIterator<Object[]> e(int i) {
        if (this.c == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        int i2 = i() >> 5;
        C8728dwi.c(i, i2);
        int i3 = this.e;
        if (i3 == 0) {
            Object[] objArr = this.c;
            C8632dsu.d(objArr);
            return new C8700dvh(objArr, i);
        }
        Object[] objArr2 = this.c;
        C8632dsu.d(objArr2);
        return new C8701dvi(objArr2, i, i2, i3 / 5);
    }
}
