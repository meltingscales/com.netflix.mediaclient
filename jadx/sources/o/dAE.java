package o;

/* loaded from: classes5.dex */
public class dAE<T> extends AbstractC8730dwk<T> implements InterfaceC8594drj {
    public final InterfaceC8585dra<T> e;

    @Override // o.dxM
    public final boolean d() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dAE(dqZ dqz, InterfaceC8585dra<? super T> interfaceC8585dra) {
        super(dqz, true, true);
        this.e = interfaceC8585dra;
    }

    @Override // o.InterfaceC8594drj
    public final InterfaceC8594drj getCallerFrame() {
        InterfaceC8585dra<T> interfaceC8585dra = this.e;
        if (interfaceC8585dra instanceof InterfaceC8594drj) {
            return (InterfaceC8594drj) interfaceC8585dra;
        }
        return null;
    }

    @Override // o.dxM
    public void b(Object obj) {
        InterfaceC8585dra b;
        b = C8590drf.b(this.e);
        C7653dAj.c(b, dwN.e(obj, this.e), null, 2, null);
    }

    @Override // o.AbstractC8730dwk
    public void a_(Object obj) {
        InterfaceC8585dra<T> interfaceC8585dra = this.e;
        interfaceC8585dra.resumeWith(dwN.e(obj, interfaceC8585dra));
    }
}
