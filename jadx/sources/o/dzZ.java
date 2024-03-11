package o;

/* loaded from: classes5.dex */
public final class dzZ<T> implements dyQ<T> {
    private final dyI<T> c;

    /* JADX WARN: Multi-variable type inference failed */
    public dzZ(dyI<? super T> dyi) {
        this.c = dyi;
    }

    @Override // o.dyQ
    public Object emit(T t, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object a = this.c.a(t, interfaceC8585dra);
        e = C8586drb.e();
        return a == e ? a : dpR.c;
    }
}
