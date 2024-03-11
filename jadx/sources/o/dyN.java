package o;

import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class dyN<T> extends dzH<T> {
    private final drX<dyK<? super T>, InterfaceC8585dra<? super dpR>, Object> e;

    @Override // o.dzH
    public Object a(dyK<? super T> dyk, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return c(this, dyk, interfaceC8585dra);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dyN(drX<? super dyK<? super T>, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, dqZ dqz, int i, BufferOverflow bufferOverflow) {
        super(dqz, i, bufferOverflow);
        this.e = drx;
    }

    @Override // o.dzH
    public dzH<T> d(dqZ dqz, int i, BufferOverflow bufferOverflow) {
        return new dyN(this.e, dqz, i, bufferOverflow);
    }

    static /* synthetic */ <T> Object c(dyN<T> dyn, dyK<? super T> dyk, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object invoke = ((dyN) dyn).e.invoke(dyk, interfaceC8585dra);
        e = C8586drb.e();
        return invoke == e ? invoke : dpR.c;
    }

    @Override // o.dzH
    public String toString() {
        return "block[" + this.e + "] -> " + super.toString();
    }
}
