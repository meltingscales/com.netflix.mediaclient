package kotlinx.coroutines.flow.internal;

import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C7646dAc;
import o.C8586drb;
import o.C8592drh;
import o.C8632dsu;
import o.C8681dup;
import o.InterfaceC8585dra;
import o.InterfaceC8594drj;
import o.InterfaceC8612dsa;
import o.dpR;
import o.dqZ;
import o.drX;
import o.dxG;
import o.dyQ;
import o.dzQ;
import o.dzV;
import o.dzX;

/* loaded from: classes5.dex */
public final class SafeCollector<T> extends ContinuationImpl implements dyQ<T> {
    private dqZ a;
    private InterfaceC8585dra<? super dpR> b;
    public final dqZ c;
    public final int d;
    public final dyQ<T> e;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SafeCollector(dyQ<? super T> dyq, dqZ dqz) {
        super(dzV.b, EmptyCoroutineContext.e);
        this.e = dyq;
        this.c = dqz;
        this.d = ((Number) dqz.fold(0, new drX<Integer, dqZ.b, Integer>() { // from class: kotlinx.coroutines.flow.internal.SafeCollector$collectContextSize$1
            public final Integer d(int i, dqZ.b bVar) {
                return Integer.valueOf(i + 1);
            }

            @Override // o.drX
            public /* synthetic */ Integer invoke(Integer num, dqZ.b bVar) {
                return d(num.intValue(), bVar);
            }
        })).intValue();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, o.InterfaceC8594drj
    public InterfaceC8594drj getCallerFrame() {
        InterfaceC8585dra<? super dpR> interfaceC8585dra = this.b;
        if (interfaceC8585dra instanceof InterfaceC8594drj) {
            return (InterfaceC8594drj) interfaceC8585dra;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, o.InterfaceC8585dra
    public dqZ getContext() {
        dqZ dqz = this.a;
        return dqz == null ? EmptyCoroutineContext.e : dqz;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public Object invokeSuspend(Object obj) {
        Object e;
        Throwable d = Result.d(obj);
        if (d != null) {
            this.a = new dzQ(d, getContext());
        }
        InterfaceC8585dra<? super dpR> interfaceC8585dra = this.b;
        if (interfaceC8585dra != null) {
            interfaceC8585dra.resumeWith(obj);
        }
        e = C8586drb.e();
        return e;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }

    @Override // o.dyQ
    public Object emit(T t, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object e2;
        try {
            Object d = d(interfaceC8585dra, t);
            e = C8586drb.e();
            if (d == e) {
                C8592drh.c(interfaceC8585dra);
            }
            e2 = C8586drb.e();
            return d == e2 ? d : dpR.c;
        } catch (Throwable th) {
            this.a = new dzQ(th, interfaceC8585dra.getContext());
            throw th;
        }
    }

    private final Object d(InterfaceC8585dra<? super dpR> interfaceC8585dra, T t) {
        Object e;
        dqZ context = interfaceC8585dra.getContext();
        dxG.d(context);
        dqZ dqz = this.a;
        if (dqz != context) {
            c(context, dqz, t);
            this.a = context;
        }
        this.b = interfaceC8585dra;
        InterfaceC8612dsa b = dzX.b();
        dyQ<T> dyq = this.e;
        C8632dsu.d(dyq);
        C8632dsu.d(this);
        Object invoke = b.invoke(dyq, t, this);
        e = C8586drb.e();
        if (!C8632dsu.c(invoke, e)) {
            this.b = null;
        }
        return invoke;
    }

    private final void c(dqZ dqz, dqZ dqz2, T t) {
        if (dqz2 instanceof dzQ) {
            b((dzQ) dqz2, t);
        }
        C7646dAc.b(this, dqz);
    }

    private final void b(dzQ dzq, Object obj) {
        String h;
        h = C8681dup.h("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + dzq.a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(h.toString());
    }
}
