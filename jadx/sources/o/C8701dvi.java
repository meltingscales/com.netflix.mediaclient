package o;

import java.util.NoSuchElementException;

/* renamed from: o.dvi  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8701dvi<E> extends AbstractC8693dva<E> {
    private int a;
    private Object[] c;
    private boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public C8701dvi(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        C8632dsu.c((Object) objArr, "");
        this.a = i3;
        Object[] objArr2 = new Object[i3];
        this.c = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.d = r5;
        objArr2[0] = objArr;
        b(i - r5, 1);
    }

    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final void c(Object[] objArr, int i, int i2, int i3) {
        C8632dsu.c((Object) objArr, "");
        c(i);
        b(i2);
        this.a = i3;
        if (this.c.length < i3) {
            this.c = new Object[i3];
        }
        this.c[0] = objArr;
        ?? r0 = i == i2 ? 1 : 0;
        this.d = r0;
        b(i - r0, 1);
    }

    private final void b(int i, int i2) {
        int i3 = (this.a - i2) * 5;
        while (i2 < this.a) {
            Object[] objArr = this.c;
            Object[] objArr2 = objArr[i2 - 1];
            if (objArr2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            objArr[i2] = objArr2[C8705dvm.b(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    private final void a(int i) {
        int i2 = 0;
        while (C8705dvm.b(e(), i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            b(e(), ((this.a - 1) - (i2 / 5)) + 1);
        }
    }

    private final E a() {
        int e = e();
        Object obj = this.c[this.a - 1];
        if (obj != null) {
            return (E) ((Object[]) obj)[e & 31];
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<E of kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
    }

    @Override // o.AbstractC8693dva, java.util.ListIterator, java.util.Iterator
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E a = a();
        c(e() + 1);
        if (e() == d()) {
            this.d = true;
            return a;
        }
        a(0);
        return a;
    }

    @Override // java.util.ListIterator
    public E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        c(e() - 1);
        if (this.d) {
            this.d = false;
            return a();
        }
        a(31);
        return a();
    }
}
