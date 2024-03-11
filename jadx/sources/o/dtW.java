package o;

import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class dtW<T> {
    public abstract Object d(T t, InterfaceC8585dra<? super dpR> interfaceC8585dra);

    public abstract Object d(Iterator<? extends T> it, InterfaceC8585dra<? super dpR> interfaceC8585dra);

    public final Object b(dtQ<? extends T> dtq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object d = d((Iterator) dtq.iterator(), interfaceC8585dra);
        e = C8586drb.e();
        return d == e ? d : dpR.c;
    }
}
