package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.EmptyCoroutineContext;
import o.InterfaceC8585dra;
import o.dqZ;

/* loaded from: classes5.dex */
public abstract class RestrictedContinuationImpl extends BaseContinuationImpl {
    public RestrictedContinuationImpl(InterfaceC8585dra<Object> interfaceC8585dra) {
        super(interfaceC8585dra);
        if (interfaceC8585dra != null && interfaceC8585dra.getContext() != EmptyCoroutineContext.e) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // o.InterfaceC8585dra
    public dqZ getContext() {
        return EmptyCoroutineContext.e;
    }
}
