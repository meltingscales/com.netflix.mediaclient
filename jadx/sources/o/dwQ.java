package o;

import o.dqY;
import o.dqZ;
import o.dwQ;

/* loaded from: classes.dex */
public abstract class dwQ extends dqT implements dqY {
    public static final b Key = new b(null);

    public abstract void dispatch(dqZ dqz, Runnable runnable);

    public boolean isDispatchNeeded(dqZ dqz) {
        return true;
    }

    @Override // o.dqT, o.dqZ.b, o.dqZ
    public <E extends dqZ.b> E get(dqZ.d<E> dVar) {
        return (E) dqY.e.c(this, dVar);
    }

    @Override // o.dqT, o.dqZ
    public dqZ minusKey(dqZ.d<?> dVar) {
        return dqY.e.e(this, dVar);
    }

    public dwQ() {
        super(dqY.d);
    }

    /* loaded from: classes5.dex */
    public static final class b extends dqX<dqY, dwQ> {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super(dqY.d, new drM<dqZ.b, dwQ>() { // from class: kotlinx.coroutines.CoroutineDispatcher$Key$1
                @Override // o.drM
                /* renamed from: b */
                public final dwQ invoke(dqZ.b bVar) {
                    if (bVar instanceof dwQ) {
                        return (dwQ) bVar;
                    }
                    return null;
                }
            });
        }
    }

    public dwQ limitedParallelism(int i) {
        C7661dAr.b(i);
        return new C7660dAq(this, i);
    }

    public void dispatchYield(dqZ dqz, Runnable runnable) {
        dispatch(dqz, runnable);
    }

    @Override // o.dqY
    public final <T> InterfaceC8585dra<T> interceptContinuation(InterfaceC8585dra<? super T> interfaceC8585dra) {
        return new C7655dAl(this, interfaceC8585dra);
    }

    @Override // o.dqY
    public final void releaseInterceptedContinuation(InterfaceC8585dra<?> interfaceC8585dra) {
        C8632dsu.d(interfaceC8585dra);
        ((C7655dAl) interfaceC8585dra).c();
    }

    public String toString() {
        return dwW.c(this) + '@' + dwW.a(this);
    }
}
