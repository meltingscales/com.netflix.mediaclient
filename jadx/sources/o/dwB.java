package o;

/* loaded from: classes5.dex */
public final class dwB {
    public static final <T> C8741dwv<T> b(InterfaceC8585dra<? super T> interfaceC8585dra) {
        if (!(interfaceC8585dra instanceof C7655dAl)) {
            return new C8741dwv<>(interfaceC8585dra, 1);
        }
        C8741dwv<T> d = ((C7655dAl) interfaceC8585dra).d();
        if (d != null) {
            if (!d.g()) {
                d = null;
            }
            if (d != null) {
                return d;
            }
        }
        return new C8741dwv<>(interfaceC8585dra, 2);
    }

    public static final void d(InterfaceC8743dwx<?> interfaceC8743dwx, InterfaceC8760dxn interfaceC8760dxn) {
        interfaceC8743dwx.a(new C8757dxk(interfaceC8760dxn));
    }
}
