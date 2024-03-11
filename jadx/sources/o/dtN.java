package o;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class dtN<T> implements dtM<T> {
    private final int a;
    private final dtQ<T> d;

    /* JADX WARN: Multi-variable type inference failed */
    public dtN(dtQ<? extends T> dtq, int i) {
        C8632dsu.c((Object) dtq, "");
        this.d = dtq;
        this.a = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // o.dtM
    public dtQ<T> a(int i) {
        int i2 = this.a + i;
        return i2 < 0 ? new dtN(this, i) : new dtN(this.d, i2);
    }

    /* loaded from: classes5.dex */
    public static final class c implements Iterator<T>, dsK {
        private final Iterator<T> b;
        private int c;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        c(dtN<T> dtn) {
            this.b = ((dtN) dtn).d.iterator();
            this.c = ((dtN) dtn).a;
        }

        private final void e() {
            while (this.c > 0 && this.b.hasNext()) {
                this.b.next();
                this.c--;
            }
        }

        @Override // java.util.Iterator
        public T next() {
            e();
            return this.b.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            e();
            return this.b.hasNext();
        }
    }

    @Override // o.dtQ
    public Iterator<T> iterator() {
        return new c(this);
    }
}
