package o;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: o.dvn  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8706dvn<K, V, T> extends AbstractC8708dvp<K, V, T> implements Iterator<T>, dsJ {
    private final C8707dvo<K, V> a;
    private boolean c;
    private K d;
    private int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8706dvn(C8707dvo<K, V> c8707dvo, dvC<K, V, T>[] dvcArr) {
        super(c8707dvo.e(), dvcArr);
        C8632dsu.c((Object) c8707dvo, "");
        C8632dsu.c((Object) dvcArr, "");
        this.a = c8707dvo;
        this.e = c8707dvo.a();
    }

    @Override // o.AbstractC8708dvp, java.util.Iterator
    public T next() {
        e();
        this.d = b();
        this.c = true;
        return (T) super.next();
    }

    @Override // o.AbstractC8708dvp, java.util.Iterator
    public void remove() {
        a();
        if (hasNext()) {
            K b = b();
            this.a.remove(this.d);
            d(b == null ? 0 : b.hashCode(), this.a.e(), b, 0);
        } else {
            this.a.remove(this.d);
        }
        this.d = null;
        this.c = false;
        this.e = this.a.a();
    }

    public final void c(K k, V v) {
        if (this.a.containsKey(k)) {
            if (hasNext()) {
                K b = b();
                this.a.put(k, v);
                d(b == null ? 0 : b.hashCode(), this.a.e(), b, 0);
            } else {
                this.a.put(k, v);
            }
            this.e = this.a.a();
        }
    }

    private final void d(int i, dvG<?, ?> dvg, K k, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            c()[i2].e(dvg.e(), dvg.e().length, 0);
            while (!C8632dsu.c(c()[i2].c(), k)) {
                c()[i2].i();
            }
            d(i2);
            return;
        }
        int b = 1 << dvJ.b(i, i3);
        if (dvg.c(b)) {
            c()[i2].e(dvg.e(), dvg.b() * 2, dvg.b(b));
            d(i2);
            return;
        }
        int d = dvg.d(b);
        dvG<?, ?> e = dvg.e(d);
        c()[i2].e(dvg.e(), dvg.b() * 2, d);
        d(i, e, k, i2 + 1);
    }

    private final void a() {
        if (!this.c) {
            throw new IllegalStateException();
        }
    }

    private final void e() {
        if (this.a.a() != this.e) {
            throw new ConcurrentModificationException();
        }
    }
}
