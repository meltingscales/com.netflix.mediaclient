package o;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public class dvR<K, V> implements Iterator<dvI<V>>, dsJ {
    private final dvM<K, V> a;
    private int b;
    private int c;
    private Object d;
    private Object e;
    private boolean h;

    public final dvM<K, V> d() {
        return this.a;
    }

    public final Object e() {
        return this.d;
    }

    public dvR(Object obj, dvM<K, V> dvm) {
        C8632dsu.c((Object) dvm, "");
        this.e = obj;
        this.a = dvm;
        this.d = C8723dwd.b;
        this.c = dvm.d().a();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.b < this.a.size();
    }

    @Override // java.util.Iterator
    /* renamed from: b */
    public dvI<V> next() {
        a();
        c();
        this.d = this.e;
        this.h = true;
        this.b++;
        dvI<V> dvi = this.a.d().get(this.e);
        if (dvi == null) {
            throw new ConcurrentModificationException("Hash code of a key (" + this.e + ") has changed after it was added to the persistent map.");
        }
        dvI<V> dvi2 = dvi;
        this.e = dvi2.b();
        return dvi2;
    }

    @Override // java.util.Iterator
    public void remove() {
        i();
        this.a.remove(this.d);
        this.d = null;
        this.h = false;
        this.c = this.a.d().a();
        this.b--;
    }

    private final void c() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void i() {
        if (!this.h) {
            throw new IllegalStateException();
        }
    }

    private final void a() {
        if (this.a.d().a() != this.c) {
            throw new ConcurrentModificationException();
        }
    }
}
