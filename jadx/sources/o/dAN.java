package o;

import kotlin.coroutines.EmptyCoroutineContext;
import o.dqZ;
import o.dxX;

/* loaded from: classes6.dex */
public final class dAN<T> implements dxX<T> {
    private final ThreadLocal<T> a;
    private final dqZ.d<?> b;
    private final T e;

    @Override // o.dqZ.b
    public dqZ.d<?> getKey() {
        return this.b;
    }

    public dAN(T t, ThreadLocal<T> threadLocal) {
        this.e = t;
        this.a = threadLocal;
        this.b = new dAM(threadLocal);
    }

    @Override // o.dqZ
    public <R> R fold(R r, drX<? super R, ? super dqZ.b, ? extends R> drx) {
        return (R) dxX.b.d(this, r, drx);
    }

    @Override // o.dqZ
    public dqZ plus(dqZ dqz) {
        return dxX.b.c(this, dqz);
    }

    @Override // o.dxX
    public T d(dqZ dqz) {
        T t = this.a.get();
        this.a.set(this.e);
        return t;
    }

    @Override // o.dxX
    public void b(dqZ dqz, T t) {
        this.a.set(t);
    }

    @Override // o.dqZ
    public dqZ minusKey(dqZ.d<?> dVar) {
        return C8632dsu.c(getKey(), dVar) ? EmptyCoroutineContext.e : this;
    }

    @Override // o.dqZ.b, o.dqZ
    public <E extends dqZ.b> E get(dqZ.d<E> dVar) {
        if (C8632dsu.c(getKey(), dVar)) {
            C8632dsu.d(this);
            return this;
        }
        return null;
    }

    public String toString() {
        return "ThreadLocal(value=" + this.e + ", threadLocal = " + this.a + ')';
    }
}
