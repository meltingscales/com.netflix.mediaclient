package o;

import java.util.Iterator;

/* renamed from: o.dud  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8669dud<T, R> implements dtQ<R> {
    private final dtQ<T> c;
    private final drM<T, R> d;

    /* JADX WARN: Multi-variable type inference failed */
    public C8669dud(dtQ<? extends T> dtq, drM<? super T, ? extends R> drm) {
        C8632dsu.c((Object) dtq, "");
        C8632dsu.c((Object) drm, "");
        this.c = dtq;
        this.d = drm;
    }

    /* renamed from: o.dud$b */
    /* loaded from: classes5.dex */
    public static final class b implements Iterator<R>, dsK {
        private final Iterator<T> a;
        final /* synthetic */ C8669dud<T, R> d;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        b(C8669dud<T, R> c8669dud) {
            this.d = c8669dud;
            this.a = ((C8669dud) c8669dud).c.iterator();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) ((C8669dud) this.d).d.invoke(this.a.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a.hasNext();
        }
    }

    @Override // o.dtQ
    public Iterator<R> iterator() {
        return new b(this);
    }

    public final <E> dtQ<E> b(drM<? super R, ? extends Iterator<? extends E>> drm) {
        C8632dsu.c((Object) drm, "");
        return new dtR(this.c, this.d, drm);
    }
}
