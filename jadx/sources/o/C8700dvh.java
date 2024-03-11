package o;

/* renamed from: o.dvh  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8700dvh<E> extends AbstractC8693dva<E> {
    private final E c;

    public C8700dvh(E e, int i) {
        super(i, 1);
        this.c = e;
    }

    @Override // o.AbstractC8693dva, java.util.ListIterator, java.util.Iterator
    public E next() {
        b();
        c(e() + 1);
        return this.c;
    }

    @Override // java.util.ListIterator
    public E previous() {
        c();
        c(e() - 1);
        return this.c;
    }
}
