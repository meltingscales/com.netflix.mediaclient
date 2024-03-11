package o;

import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public interface dyJ<E> {
    Object c(InterfaceC8585dra<? super E> interfaceC8585dra);

    InterfaceC8798dyy<E> ct_();

    Object e(InterfaceC8585dra<? super C8797dyx<? extends E>> interfaceC8585dra);

    void e(CancellationException cancellationException);

    dBB<E> f();

    dBB<C8797dyx<E>> h();

    Object s();

    /* loaded from: classes5.dex */
    public static final class d {
        public static /* synthetic */ void e(dyJ dyj, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            dyj.e(cancellationException);
        }
    }
}
