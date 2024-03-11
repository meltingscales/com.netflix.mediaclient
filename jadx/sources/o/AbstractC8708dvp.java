package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.dvp  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC8708dvp<K, V, T> implements Iterator<T>, dsK {
    private int b;
    private boolean c;
    private final dvC<K, V, T>[] d;

    /* JADX INFO: Access modifiers changed from: protected */
    public final dvC<K, V, T>[] c() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d(int i) {
        this.b = i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.c;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public AbstractC8708dvp(dvG<K, V> dvg, dvC<K, V, T>[] dvcArr) {
        C8632dsu.c((Object) dvg, "");
        C8632dsu.c((Object) dvcArr, "");
        this.d = dvcArr;
        this.c = true;
        dvcArr[0].b(dvg.e(), dvg.b() * 2);
        this.b = 0;
        e();
    }

    private final int c(int i) {
        if (this.d[i].d()) {
            return i;
        }
        if (this.d[i].j()) {
            dvG<? extends K, ? extends V> e = this.d[i].e();
            if (i == 6) {
                this.d[i + 1].b(e.e(), e.e().length);
            } else {
                this.d[i + 1].b(e.e(), e.b() * 2);
            }
            return c(i + 1);
        }
        return -1;
    }

    private final void e() {
        if (this.d[this.b].d()) {
            return;
        }
        int i = this.b;
        if (i >= 0) {
            while (true) {
                int i2 = i - 1;
                int c = c(i);
                if (c == -1 && this.d[i].j()) {
                    this.d[i].h();
                    c = c(i);
                }
                if (c != -1) {
                    this.b = c;
                    return;
                }
                if (i > 0) {
                    this.d[i2].h();
                }
                this.d[i].b(dvG.a.b().e(), 0);
                if (i2 < 0) {
                    break;
                }
                i = i2;
            }
        }
        this.c = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final K b() {
        d();
        return this.d[this.b].c();
    }

    @Override // java.util.Iterator
    public T next() {
        d();
        T next = this.d[this.b].next();
        e();
        return next;
    }

    private final void d() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }
}
