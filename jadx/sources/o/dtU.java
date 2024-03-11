package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class dtU<T> extends dtW<T> implements Iterator<T>, InterfaceC8585dra<dpR>, dsK {
    private InterfaceC8585dra<? super dpR> b;
    private T c;
    private int d;
    private Iterator<? extends T> e;

    public final void d(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        this.b = interfaceC8585dra;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i = this.d;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw e();
                }
                Iterator<? extends T> it = this.e;
                C8632dsu.d(it);
                if (it.hasNext()) {
                    this.d = 2;
                    return true;
                }
                this.e = null;
            }
            this.d = 5;
            InterfaceC8585dra<? super dpR> interfaceC8585dra = this.b;
            C8632dsu.d(interfaceC8585dra);
            this.b = null;
            Result.c cVar = Result.e;
            interfaceC8585dra.resumeWith(Result.e(dpR.c));
        }
    }

    @Override // java.util.Iterator
    public T next() {
        int i = this.d;
        if (i == 0 || i == 1) {
            return d();
        }
        if (i == 2) {
            this.d = 1;
            Iterator<? extends T> it = this.e;
            C8632dsu.d(it);
            return it.next();
        } else if (i == 3) {
            this.d = 0;
            T t = this.c;
            this.c = null;
            return t;
        } else {
            throw e();
        }
    }

    private final T d() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    private final Throwable e() {
        int i = this.d;
        if (i != 4) {
            if (i == 5) {
                return new IllegalStateException("Iterator has failed.");
            }
            return new IllegalStateException("Unexpected state of the iterator: " + this.d);
        }
        return new NoSuchElementException();
    }

    @Override // o.dtW
    public Object d(T t, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object e2;
        Object e3;
        this.c = t;
        this.d = 3;
        this.b = interfaceC8585dra;
        e = C8586drb.e();
        e2 = C8586drb.e();
        if (e == e2) {
            C8592drh.c(interfaceC8585dra);
        }
        e3 = C8586drb.e();
        return e == e3 ? e : dpR.c;
    }

    @Override // o.dtW
    public Object d(Iterator<? extends T> it, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object e2;
        Object e3;
        if (it.hasNext()) {
            this.e = it;
            this.d = 2;
            this.b = interfaceC8585dra;
            e = C8586drb.e();
            e2 = C8586drb.e();
            if (e == e2) {
                C8592drh.c(interfaceC8585dra);
            }
            e3 = C8586drb.e();
            return e == e3 ? e : dpR.c;
        }
        return dpR.c;
    }

    @Override // o.InterfaceC8585dra
    public void resumeWith(Object obj) {
        C8556dpz.d(obj);
        this.d = 4;
    }

    @Override // o.InterfaceC8585dra
    public dqZ getContext() {
        return EmptyCoroutineContext.e;
    }
}
