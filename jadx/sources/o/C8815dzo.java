package o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.dzo  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8815dzo<T> extends dyO<T> {
    private final drX<dyQ<? super T>, InterfaceC8585dra<? super dpR>, Object> b;

    /* JADX WARN: Multi-variable type inference failed */
    public C8815dzo(drX<? super dyQ<? super T>, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        this.b = drx;
    }

    @Override // o.dyO
    public Object b(dyQ<? super T> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object invoke = this.b.invoke(dyq, interfaceC8585dra);
        e = C8586drb.e();
        return invoke == e ? invoke : dpR.c;
    }
}
