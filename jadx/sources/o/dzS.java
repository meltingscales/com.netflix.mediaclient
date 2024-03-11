package o;

import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class dzS<T> extends dAE<T> {
    public dzS(dqZ dqz, InterfaceC8585dra<? super T> interfaceC8585dra) {
        super(dqz, interfaceC8585dra);
    }

    @Override // o.dxM
    public boolean h(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return c(th);
    }
}
