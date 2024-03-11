package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class dtS<T> implements dtQ<T> {
    private final drM<T, T> b;
    private final drO<T> c;

    /* loaded from: classes5.dex */
    public static final class a implements Iterator<T>, dsK {
        private T a;
        final /* synthetic */ dtS<T> c;
        private int d = -2;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        a(dtS<T> dts) {
            this.c = dts;
        }

        private final void b() {
            T t;
            if (this.d == -2) {
                t = (T) ((dtS) this.c).c.invoke();
            } else {
                drM drm = ((dtS) this.c).b;
                T t2 = this.a;
                C8632dsu.d(t2);
                t = (T) drm.invoke(t2);
            }
            this.a = t;
            this.d = t == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.d < 0) {
                b();
            }
            if (this.d == 0) {
                throw new NoSuchElementException();
            }
            T t = this.a;
            C8632dsu.d(t);
            this.d = -1;
            return t;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.d < 0) {
                b();
            }
            return this.d == 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dtS(drO<? extends T> dro, drM<? super T, ? extends T> drm) {
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) drm, "");
        this.c = dro;
        this.b = drm;
    }

    @Override // o.dtQ
    public Iterator<T> iterator() {
        return new a(this);
    }
}
