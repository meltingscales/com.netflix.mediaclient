package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public final class dtR<T, R, E> implements dtQ<E> {
    private final dtQ<T> b;
    private final drM<R, Iterator<E>> c;
    private final drM<T, R> d;

    /* JADX WARN: Multi-variable type inference failed */
    public dtR(dtQ<? extends T> dtq, drM<? super T, ? extends R> drm, drM<? super R, ? extends Iterator<? extends E>> drm2) {
        C8632dsu.c((Object) dtq, "");
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) drm2, "");
        this.b = dtq;
        this.d = drm;
        this.c = drm2;
    }

    /* loaded from: classes5.dex */
    public static final class a implements Iterator<E>, dsK {
        private Iterator<? extends E> a;
        final /* synthetic */ dtR<T, R, E> b;
        private final Iterator<T> c;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        a(dtR<T, R, E> dtr) {
            this.b = dtr;
            this.c = ((dtR) dtr).b.iterator();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!e()) {
                throw new NoSuchElementException();
            }
            Iterator<? extends E> it = this.a;
            C8632dsu.d(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return e();
        }

        private final boolean e() {
            Iterator<? extends E> it = this.a;
            if (it != null && !it.hasNext()) {
                this.a = null;
            }
            while (this.a == null) {
                if (!this.c.hasNext()) {
                    return false;
                }
                Iterator<? extends E> it2 = (Iterator) ((dtR) this.b).c.invoke(((dtR) this.b).d.invoke(this.c.next()));
                if (it2.hasNext()) {
                    this.a = it2;
                    return true;
                }
            }
            return true;
        }
    }

    @Override // o.dtQ
    public Iterator<E> iterator() {
        return new a(this);
    }
}
