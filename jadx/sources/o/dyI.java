package o;

/* loaded from: classes5.dex */
public interface dyI<E> {
    Object a(E e2, InterfaceC8585dra<? super dpR> interfaceC8585dra);

    boolean b(Throwable th);

    Object d(E e2);

    void d(drM<? super Throwable, dpR> drm);

    boolean n();

    /* loaded from: classes5.dex */
    public static final class e {
        public static /* synthetic */ boolean a(dyI dyi, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return dyi.b(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }
    }
}
