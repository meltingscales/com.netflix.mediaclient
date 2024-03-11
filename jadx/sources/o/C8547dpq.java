package o;

import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.dpq  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8547dpq<T, R> extends AbstractC8550dpt<T, R> implements InterfaceC8585dra<R> {
    private Object a;
    private InterfaceC8585dra<Object> c;
    private InterfaceC8612dsa<? super AbstractC8550dpt<?, ?>, Object, ? super InterfaceC8585dra<Object>, ? extends Object> d;
    private Object e;

    @Override // o.InterfaceC8585dra
    public void resumeWith(Object obj) {
        this.c = null;
        this.a = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8547dpq(InterfaceC8612dsa<? super AbstractC8550dpt<T, R>, ? super T, ? super InterfaceC8585dra<? super R>, ? extends Object> interfaceC8612dsa, T t) {
        super(null);
        Object obj;
        C8632dsu.c((Object) interfaceC8612dsa, "");
        this.d = interfaceC8612dsa;
        this.e = t;
        C8632dsu.d(this);
        this.c = this;
        obj = C8546dpp.e;
        this.a = obj;
    }

    @Override // o.InterfaceC8585dra
    public dqZ getContext() {
        return EmptyCoroutineContext.e;
    }

    @Override // o.AbstractC8550dpt
    public Object a(T t, InterfaceC8585dra<? super R> interfaceC8585dra) {
        Object e;
        Object e2;
        C8632dsu.d(interfaceC8585dra);
        this.c = interfaceC8585dra;
        this.e = t;
        e = C8586drb.e();
        e2 = C8586drb.e();
        if (e == e2) {
            C8592drh.c(interfaceC8585dra);
        }
        return e;
    }

    public final R e() {
        Object obj;
        Object obj2;
        Object e;
        while (true) {
            R r = (R) this.a;
            InterfaceC8585dra<Object> interfaceC8585dra = this.c;
            if (interfaceC8585dra == null) {
                C8556dpz.d(r);
                return r;
            }
            obj = C8546dpp.e;
            if (Result.a(obj, r)) {
                try {
                    InterfaceC8612dsa<? super AbstractC8550dpt<?, ?>, Object, ? super InterfaceC8585dra<Object>, ? extends Object> interfaceC8612dsa = this.d;
                    Object obj3 = this.e;
                    Object a = !(interfaceC8612dsa instanceof BaseContinuationImpl) ? C8590drf.a(interfaceC8612dsa, this, obj3, interfaceC8585dra) : ((InterfaceC8612dsa) dsH.a(interfaceC8612dsa, 3)).invoke(this, obj3, interfaceC8585dra);
                    e = C8586drb.e();
                    if (a != e) {
                        Result.c cVar = Result.e;
                        interfaceC8585dra.resumeWith(Result.e(a));
                    }
                } catch (Throwable th) {
                    Result.c cVar2 = Result.e;
                    interfaceC8585dra.resumeWith(Result.e(C8556dpz.a(th)));
                }
            } else {
                obj2 = C8546dpp.e;
                this.a = obj2;
                interfaceC8585dra.resumeWith(r);
            }
        }
    }
}
