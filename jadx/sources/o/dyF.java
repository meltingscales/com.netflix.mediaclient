package o;

/* loaded from: classes6.dex */
final class dyF<E> extends C8790dyq<E> {
    private InterfaceC8585dra<? super dpR> d;

    public dyF(dqZ dqz, InterfaceC8792dys<E> interfaceC8792dys, drX<? super InterfaceC8791dyr<E>, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        super(dqz, interfaceC8792dys, false);
        InterfaceC8585dra<? super dpR> c;
        c = C8590drf.c(drx, this, this);
        this.d = c;
    }

    @Override // o.dxM
    public void p() {
        dAT.e(this.d, this);
    }

    @Override // o.C8795dyv, o.dyI
    public Object a(E e, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e2;
        o();
        Object a = super.a((dyF<E>) e, interfaceC8585dra);
        e2 = C8586drb.e();
        return a == e2 ? a : dpR.c;
    }

    @Override // o.C8795dyv, o.dyI
    public Object d(E e) {
        o();
        return super.d((dyF<E>) e);
    }

    @Override // o.C8795dyv, o.dyI
    public boolean b(Throwable th) {
        boolean b = super.b(th);
        o();
        return b;
    }
}
