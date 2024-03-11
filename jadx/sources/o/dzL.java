package o;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2;
import o.dqY;

/* loaded from: classes5.dex */
public abstract class dzL<S, T> extends dzH<T> {
    public final dyS<S> a;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dzH
    public Object a(dyK<? super T> dyk, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return a(this, dyk, interfaceC8585dra);
    }

    @Override // o.dzH, o.dyS
    public Object collect(dyQ<? super T> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return e(this, dyq, interfaceC8585dra);
    }

    public abstract Object e(dyQ<? super T> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra);

    /* JADX WARN: Multi-variable type inference failed */
    public dzL(dyS<? extends S> dys, dqZ dqz, int i, BufferOverflow bufferOverflow) {
        super(dqz, i, bufferOverflow);
        this.a = dys;
    }

    private final Object d(dyQ<? super T> dyq, dqZ dqz, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object a = dzE.a(dqz, dzE.e(dyq, interfaceC8585dra.getContext()), null, new ChannelFlowOperator$collectWithContextUndispatched$2(this, null), interfaceC8585dra, 4, null);
        e = C8586drb.e();
        return a == e ? a : dpR.c;
    }

    static /* synthetic */ <S, T> Object a(dzL<S, T> dzl, dyK<? super T> dyk, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object e2 = dzl.e(new dzZ(dyk), interfaceC8585dra);
        e = C8586drb.e();
        return e2 == e ? e2 : dpR.c;
    }

    static /* synthetic */ <S, T> Object e(dzL<S, T> dzl, dyQ<? super T> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object e2;
        Object e3;
        if (dzl.c == -3) {
            dqZ context = interfaceC8585dra.getContext();
            dqZ d = dwP.d(context, dzl.b);
            if (C8632dsu.c(d, context)) {
                Object e4 = dzl.e(dyq, interfaceC8585dra);
                e3 = C8586drb.e();
                return e4 == e3 ? e4 : dpR.c;
            }
            dqY.b bVar = dqY.d;
            if (C8632dsu.c(d.get(bVar), context.get(bVar))) {
                Object d2 = dzl.d(dyq, d, interfaceC8585dra);
                e2 = C8586drb.e();
                return d2 == e2 ? d2 : dpR.c;
            }
        }
        Object collect = super.collect(dyq, interfaceC8585dra);
        e = C8586drb.e();
        return collect == e ? collect : dpR.c;
    }

    @Override // o.dzH
    public String toString() {
        return this.a + " -> " + super.toString();
    }
}
