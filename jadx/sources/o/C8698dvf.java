package o;

import java.util.ListIterator;

/* renamed from: o.dvf  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8698dvf<E> extends AbstractC8694dvb<E> {
    private final Object[] a;
    private final int b;
    private final int c;
    private final Object[] d;

    @Override // o.dpQ
    public int getSize() {
        return this.c;
    }

    public C8698dvf(Object[] objArr, Object[] objArr2, int i, int i2) {
        int i3;
        C8632dsu.c((Object) objArr, "");
        C8632dsu.c((Object) objArr2, "");
        this.a = objArr;
        this.d = objArr2;
        this.c = i;
        this.b = i2;
        if (size() <= 32) {
            throw new IllegalArgumentException(C8632dsu.d("Trie-based persistent vector should have at least 33 elements, got ", Integer.valueOf(size())).toString());
        }
        int size = size() - C8705dvm.a(size());
        i3 = C8657dts.i(objArr2.length, 32);
        C8725dwf.d(size <= i3);
    }

    private final int a() {
        return C8705dvm.a(size());
    }

    @Override // o.duT
    /* renamed from: d */
    public C8699dvg<E> e() {
        return new C8699dvg<>(this, this.a, this.d, this.b);
    }

    @Override // o.dpT, java.util.List
    public ListIterator<E> listIterator(int i) {
        C8728dwi.c(i, size());
        return new C8696dvd(this.a, this.d, i, size(), (this.b / 5) + 1);
    }

    private final Object[] b(int i) {
        if (a() <= i) {
            return this.d;
        }
        Object[] objArr = this.a;
        for (int i2 = this.b; i2 > 0; i2 -= 5) {
            Object[] objArr2 = objArr[C8705dvm.b(i, i2)];
            if (objArr2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            objArr = objArr2;
        }
        return objArr;
    }

    @Override // o.dpT, java.util.List
    public E get(int i) {
        C8728dwi.b(i, size());
        return (E) b(i)[i & 31];
    }
}
