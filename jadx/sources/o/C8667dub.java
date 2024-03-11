package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.dub  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8667dub<T> implements dtQ<T> {
    private final dtQ<T> c;
    private final drM<T, Boolean> e;

    /* JADX WARN: Multi-variable type inference failed */
    public C8667dub(dtQ<? extends T> dtq, drM<? super T, Boolean> drm) {
        C8632dsu.c((Object) dtq, "");
        C8632dsu.c((Object) drm, "");
        this.c = dtq;
        this.e = drm;
    }

    /* renamed from: o.dub$c */
    /* loaded from: classes6.dex */
    public static final class c implements Iterator<T>, dsK {
        private T a;
        private int b = -1;
        final /* synthetic */ C8667dub<T> d;
        private final Iterator<T> e;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        c(C8667dub<T> c8667dub) {
            this.d = c8667dub;
            this.e = ((C8667dub) c8667dub).c.iterator();
        }

        private final void c() {
            if (this.e.hasNext()) {
                T next = this.e.next();
                if (((Boolean) ((C8667dub) this.d).e.invoke(next)).booleanValue()) {
                    this.b = 1;
                    this.a = next;
                    return;
                }
            }
            this.b = 0;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.b == -1) {
                c();
            }
            if (this.b != 0) {
                T t = this.a;
                this.a = null;
                this.b = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.b == -1) {
                c();
            }
            return this.b == 1;
        }
    }

    @Override // o.dtQ
    public Iterator<T> iterator() {
        return new c(this);
    }
}
