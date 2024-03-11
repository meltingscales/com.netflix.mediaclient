package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.Ig  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0935Ig<T> implements dtQ<T> {
    public /* synthetic */ AbstractC0935Ig(C8627dsp c8627dsp) {
        this();
    }

    private AbstractC0935Ig() {
    }

    public final T d() {
        if (this instanceof C0938Ij) {
            return (T) ((C0938Ij) this).e();
        }
        throw new NoSuchElementException();
    }

    public final AbstractC0935Ig<T> g() {
        if (this instanceof C0938Ij) {
            return ((C0938Ij) this).a();
        }
        return C0932Id.d;
    }

    public final boolean c() {
        return this instanceof C0932Id;
    }

    public final boolean b() {
        return !c();
    }

    /* renamed from: o.Ig$d */
    /* loaded from: classes3.dex */
    public static final class d implements Iterator<T>, dsK {
        private AbstractC0935Ig<? extends T> c;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        d(AbstractC0935Ig<? extends T> abstractC0935Ig) {
            this.c = abstractC0935Ig;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.c instanceof C0938Ij;
        }

        @Override // java.util.Iterator
        public T next() {
            AbstractC0935Ig<? extends T> abstractC0935Ig = this.c;
            if (abstractC0935Ig instanceof C0938Ij) {
                C0938Ij c0938Ij = (C0938Ij) abstractC0935Ig;
                this.c = c0938Ij.a();
                return (T) c0938Ij.e();
            }
            throw new NoSuchElementException();
        }
    }

    @Override // o.dtQ
    public Iterator<T> iterator() {
        return new d(this);
    }
}
