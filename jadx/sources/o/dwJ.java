package o;

/* loaded from: classes5.dex */
final class dwJ<T> extends dxM implements dwF<T> {
    @Override // o.dxM
    public boolean cx_() {
        return true;
    }

    public dwJ(dxD dxd) {
        super(true);
        a(dxd);
    }

    @Override // o.dwZ
    public T e() {
        return (T) cw_();
    }

    @Override // o.dwZ
    public Object b(InterfaceC8585dra<? super T> interfaceC8585dra) {
        Object d = d((InterfaceC8585dra<Object>) interfaceC8585dra);
        C8586drb.e();
        return d;
    }

    @Override // o.dwF
    public boolean a(T t) {
        return j(t);
    }

    @Override // o.dwF
    public boolean a(Throwable th) {
        return j(new dwO(th, false, 2, null));
    }
}
