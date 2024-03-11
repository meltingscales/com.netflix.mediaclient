package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public final class dtT<T> implements dtQ<T> {
    private final dtQ<T> a;
    private final boolean d;
    private final drM<T, Boolean> e;

    /* JADX WARN: Multi-variable type inference failed */
    public dtT(dtQ<? extends T> dtq, boolean z, drM<? super T, Boolean> drm) {
        C8632dsu.c((Object) dtq, "");
        C8632dsu.c((Object) drm, "");
        this.a = dtq;
        this.d = z;
        this.e = drm;
    }

    /* loaded from: classes5.dex */
    public static final class d implements Iterator<T>, dsK {
        private int a = -1;
        final /* synthetic */ dtT<T> b;
        private T d;
        private final Iterator<T> e;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        d(dtT<T> dtt) {
            this.b = dtt;
            this.e = ((dtT) dtt).a.iterator();
        }

        private final void a() {
            int i;
            while (true) {
                if (!this.e.hasNext()) {
                    i = 0;
                    break;
                }
                T next = this.e.next();
                if (((Boolean) ((dtT) this.b).e.invoke(next)).booleanValue() == ((dtT) this.b).d) {
                    this.d = next;
                    i = 1;
                    break;
                }
            }
            this.a = i;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.a == -1) {
                a();
            }
            if (this.a != 0) {
                T t = this.d;
                this.d = null;
                this.a = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.a == -1) {
                a();
            }
            return this.a == 1;
        }
    }

    @Override // o.dtQ
    public Iterator<T> iterator() {
        return new d(this);
    }
}
