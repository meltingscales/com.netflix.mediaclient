package kotlin.coroutines.jvm.internal;

import o.C8595drk;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.dqY;
import o.dqZ;

/* loaded from: classes.dex */
public abstract class ContinuationImpl extends BaseContinuationImpl {
    private final dqZ _context;
    private transient InterfaceC8585dra<Object> intercepted;

    public ContinuationImpl(InterfaceC8585dra<Object> interfaceC8585dra, dqZ dqz) {
        super(interfaceC8585dra);
        this._context = dqz;
    }

    public ContinuationImpl(InterfaceC8585dra<Object> interfaceC8585dra) {
        this(interfaceC8585dra, interfaceC8585dra != null ? interfaceC8585dra.getContext() : null);
    }

    @Override // o.InterfaceC8585dra
    public dqZ getContext() {
        dqZ dqz = this._context;
        C8632dsu.d(dqz);
        return dqz;
    }

    public final InterfaceC8585dra<Object> intercepted() {
        InterfaceC8585dra<Object> interfaceC8585dra = this.intercepted;
        if (interfaceC8585dra == null) {
            dqY dqy = (dqY) getContext().get(dqY.d);
            if (dqy == null || (interfaceC8585dra = dqy.interceptContinuation(this)) == null) {
                interfaceC8585dra = this;
            }
            this.intercepted = interfaceC8585dra;
        }
        return interfaceC8585dra;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        InterfaceC8585dra<?> interfaceC8585dra = this.intercepted;
        if (interfaceC8585dra != null && interfaceC8585dra != this) {
            dqZ.b bVar = getContext().get(dqY.d);
            C8632dsu.d(bVar);
            ((dqY) bVar).releaseInterceptedContinuation(interfaceC8585dra);
        }
        this.intercepted = C8595drk.e;
    }
}
