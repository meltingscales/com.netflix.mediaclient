package o;

import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class dvC<K, V, T> implements Iterator<T>, dsK {
    private Object[] a = dvG.a.b().e();
    private int b;
    private int c;

    /* JADX INFO: Access modifiers changed from: protected */
    public final int a() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(int i) {
        this.b = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object[] b() {
        return this.a;
    }

    public final boolean d() {
        return this.b < this.c;
    }

    public final void e(Object[] objArr, int i, int i2) {
        C8632dsu.c((Object) objArr, "");
        this.a = objArr;
        this.c = i;
        this.b = i2;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b(Object[] objArr, int i) {
        C8632dsu.c((Object) objArr, "");
        e(objArr, i, 0);
    }

    public final K c() {
        C8725dwf.d(d());
        return (K) this.a[this.b];
    }

    public final void i() {
        C8725dwf.d(d());
        this.b += 2;
    }

    public final boolean j() {
        C8725dwf.d(this.b >= this.c);
        return this.b < this.a.length;
    }

    public final dvG<? extends K, ? extends V> e() {
        C8725dwf.d(j());
        Object obj = this.a[this.b];
        if (obj != null) {
            return (dvG) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
    }

    public final void h() {
        C8725dwf.d(j());
        this.b++;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return d();
    }
}
