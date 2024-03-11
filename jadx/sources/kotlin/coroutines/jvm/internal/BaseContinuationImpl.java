package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.Result;
import o.C8556dpz;
import o.C8586drb;
import o.C8592drh;
import o.C8593dri;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.InterfaceC8594drj;
import o.dpR;

/* loaded from: classes.dex */
public abstract class BaseContinuationImpl implements InterfaceC8585dra<Object>, InterfaceC8594drj, Serializable {
    private final InterfaceC8585dra<Object> completion;

    public final InterfaceC8585dra<Object> getCompletion() {
        return this.completion;
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    public BaseContinuationImpl(InterfaceC8585dra<Object> interfaceC8585dra) {
        this.completion = interfaceC8585dra;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC8585dra
    public final void resumeWith(Object obj) {
        Object invokeSuspend;
        Object e;
        InterfaceC8585dra interfaceC8585dra = this;
        while (true) {
            C8592drh.e(interfaceC8585dra);
            BaseContinuationImpl baseContinuationImpl = (BaseContinuationImpl) interfaceC8585dra;
            InterfaceC8585dra interfaceC8585dra2 = baseContinuationImpl.completion;
            C8632dsu.d(interfaceC8585dra2);
            try {
                invokeSuspend = baseContinuationImpl.invokeSuspend(obj);
                e = C8586drb.e();
            } catch (Throwable th) {
                Result.c cVar = Result.e;
                obj = Result.e(C8556dpz.a(th));
            }
            if (invokeSuspend == e) {
                return;
            }
            Result.c cVar2 = Result.e;
            obj = Result.e(invokeSuspend);
            baseContinuationImpl.releaseIntercepted();
            if (!(interfaceC8585dra2 instanceof BaseContinuationImpl)) {
                interfaceC8585dra2.resumeWith(obj);
                return;
            }
            interfaceC8585dra = interfaceC8585dra2;
        }
    }

    public InterfaceC8585dra<dpR> create(InterfaceC8585dra<?> interfaceC8585dra) {
        C8632dsu.c((Object) interfaceC8585dra, "");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        C8632dsu.c((Object) interfaceC8585dra, "");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    @Override // o.InterfaceC8594drj
    public InterfaceC8594drj getCallerFrame() {
        InterfaceC8585dra<Object> interfaceC8585dra = this.completion;
        if (interfaceC8585dra instanceof InterfaceC8594drj) {
            return (InterfaceC8594drj) interfaceC8585dra;
        }
        return null;
    }

    public StackTraceElement getStackTraceElement() {
        return C8593dri.b(this);
    }
}
