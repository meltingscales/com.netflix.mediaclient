package o;

import kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1;

/* renamed from: o.dAb  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7645dAb<T> implements dyQ<T> {
    private final dqZ a;
    private final Object c;
    private final drX<T, InterfaceC8585dra<? super dpR>, Object> e;

    public C7645dAb(dyQ<? super T> dyq, dqZ dqz) {
        this.a = dqz;
        this.c = dAO.c(dqz);
        this.e = new UndispatchedContextCollector$emitRef$1(dyq, null);
    }

    @Override // o.dyQ
    public Object emit(T t, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object b = dzE.b(this.a, t, this.c, this.e, interfaceC8585dra);
        e = C8586drb.e();
        return b == e ? b : dpR.c;
    }
}
