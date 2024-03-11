package kotlin.coroutines.jvm.internal;

import o.C8632dsu;
import o.InterfaceC8585dra;
import o.InterfaceC8633dsv;
import o.dsA;

/* loaded from: classes5.dex */
public abstract class RestrictedSuspendLambda extends RestrictedContinuationImpl implements InterfaceC8633dsv<Object> {
    private final int arity;

    @Override // o.InterfaceC8633dsv
    public int getArity() {
        return this.arity;
    }

    public RestrictedSuspendLambda(int i, InterfaceC8585dra<Object> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.arity = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public String toString() {
        if (getCompletion() == null) {
            String d = dsA.d(this);
            C8632dsu.a(d, "");
            return d;
        }
        return super.toString();
    }
}
