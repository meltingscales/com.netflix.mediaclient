package o;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* renamed from: o.dve  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8697dve<T> extends AbstractC8693dva<T> implements ListIterator<T>, dsR {
    private int b;
    private C8701dvi<? extends T> c;
    private final C8699dvg<T> d;
    private int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8697dve(C8699dvg<T> c8699dvg, int i) {
        super(i, c8699dvg.size());
        C8632dsu.c((Object) c8699dvg, "");
        this.d = c8699dvg;
        this.e = c8699dvg.e();
        this.b = -1;
        i();
    }

    @Override // java.util.ListIterator
    public T previous() {
        a();
        c();
        this.b = e() - 1;
        C8701dvi<? extends T> c8701dvi = this.c;
        if (c8701dvi == null) {
            Object[] b = this.d.b();
            c(e() - 1);
            return (T) b[e()];
        } else if (e() > c8701dvi.d()) {
            Object[] b2 = this.d.b();
            c(e() - 1);
            return (T) b2[e() - c8701dvi.d()];
        } else {
            c(e() - 1);
            return c8701dvi.previous();
        }
    }

    @Override // o.AbstractC8693dva, java.util.ListIterator, java.util.Iterator
    public T next() {
        a();
        b();
        this.b = e();
        C8701dvi<? extends T> c8701dvi = this.c;
        if (c8701dvi == null) {
            Object[] b = this.d.b();
            int e = e();
            c(e + 1);
            return (T) b[e];
        } else if (c8701dvi.hasNext()) {
            c(e() + 1);
            return c8701dvi.next();
        } else {
            Object[] b2 = this.d.b();
            int e2 = e();
            c(e2 + 1);
            return (T) b2[e2 - c8701dvi.d()];
        }
    }

    private final void f() {
        b(this.d.size());
        this.e = this.d.e();
        this.b = -1;
        i();
    }

    private final void i() {
        int i;
        Object[] c = this.d.c();
        if (c == null) {
            this.c = null;
            return;
        }
        int a = C8705dvm.a(this.d.size());
        i = C8657dts.i(e(), a);
        int a2 = (this.d.a() / 5) + 1;
        C8701dvi<? extends T> c8701dvi = this.c;
        if (c8701dvi == null) {
            this.c = new C8701dvi<>(c, i, a, a2);
            return;
        }
        C8632dsu.d(c8701dvi);
        c8701dvi.c(c, i, a, a2);
    }

    @Override // o.AbstractC8693dva, java.util.ListIterator
    public void add(T t) {
        a();
        this.d.add(e(), t);
        c(e() + 1);
        f();
    }

    @Override // o.AbstractC8693dva, java.util.ListIterator, java.util.Iterator
    public void remove() {
        a();
        g();
        this.d.remove(this.b);
        if (this.b < e()) {
            c(this.b);
        }
        f();
    }

    @Override // o.AbstractC8693dva, java.util.ListIterator
    public void set(T t) {
        a();
        g();
        this.d.set(this.b, t);
        this.e = this.d.e();
        i();
    }

    private final void a() {
        if (this.e != this.d.e()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void g() {
        if (this.b == -1) {
            throw new IllegalStateException();
        }
    }
}
