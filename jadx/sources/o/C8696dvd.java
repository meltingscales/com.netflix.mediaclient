package o;

/* renamed from: o.dvd  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8696dvd<T> extends AbstractC8693dva<T> {
    private final T[] a;
    private final C8701dvi<T> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8696dvd(Object[] objArr, T[] tArr, int i, int i2, int i3) {
        super(i, i2);
        int i4;
        C8632dsu.c((Object) objArr, "");
        C8632dsu.c((Object) tArr, "");
        this.a = tArr;
        int a = C8705dvm.a(i2);
        i4 = C8657dts.i(i, a);
        this.d = new C8701dvi<>(objArr, i4, a, i3);
    }

    @Override // o.AbstractC8693dva, java.util.ListIterator, java.util.Iterator
    public T next() {
        b();
        if (this.d.hasNext()) {
            c(e() + 1);
            return this.d.next();
        }
        T[] tArr = this.a;
        int e = e();
        c(e + 1);
        return tArr[e - this.d.d()];
    }

    @Override // java.util.ListIterator
    public T previous() {
        c();
        if (e() > this.d.d()) {
            T[] tArr = this.a;
            c(e() - 1);
            return tArr[e() - this.d.d()];
        }
        c(e() - 1);
        return this.d.previous();
    }
}
