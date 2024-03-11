package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.State;

/* loaded from: classes5.dex */
public abstract class dpU<T> implements Iterator<T>, dsK {
    private T a;
    private State e = State.e;

    /* loaded from: classes5.dex */
    public final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    protected abstract void b();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        State state = this.e;
        if (state == State.c) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i = a.a[state.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return d();
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.e = State.e;
        return this.a;
    }

    private final boolean d() {
        this.e = State.c;
        b();
        return this.e == State.d;
    }

    public final void b(T t) {
        this.a = t;
        this.e = State.d;
    }

    public final void e() {
        this.e = State.b;
    }
}
