package o;

import java.util.concurrent.CancellationException;
import o.dqZ;

/* loaded from: classes5.dex */
public interface dxD extends dqZ.b {
    public static final c b = c.b;

    Object a_(InterfaceC8585dra<? super dpR> interfaceC8585dra);

    dwE c(dwI dwi);

    InterfaceC8760dxn c(boolean z, boolean z2, drM<? super Throwable, dpR> drm);

    boolean cu_();

    dtQ<dxD> cv_();

    InterfaceC8760dxn e(drM<? super Throwable, dpR> drm);

    void e(CancellationException cancellationException);

    boolean g();

    CancellationException i();

    dxD j();

    boolean k();

    boolean o();

    /* loaded from: classes5.dex */
    public static final class b {
        public static <E extends dqZ.b> E a(dxD dxd, dqZ.d<E> dVar) {
            return (E) dqZ.b.e.b(dxd, dVar);
        }

        public static dqZ c(dxD dxd, dqZ dqz) {
            return dqZ.b.e.d(dxd, dqz);
        }

        public static <R> R d(dxD dxd, R r, drX<? super R, ? super dqZ.b, ? extends R> drx) {
            return (R) dqZ.b.e.d(dxd, r, drx);
        }

        public static dqZ d(dxD dxd, dqZ.d<?> dVar) {
            return dqZ.b.e.a(dxd, dVar);
        }

        public static /* synthetic */ void b(dxD dxd, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            dxd.e(cancellationException);
        }

        public static /* synthetic */ InterfaceC8760dxn b(dxD dxd, boolean z, boolean z2, drM drm, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = true;
                }
                return dxd.c(z, z2, drm);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }
    }

    /* loaded from: classes5.dex */
    public static final class c implements dqZ.d<dxD> {
        static final /* synthetic */ c b = new c();

        private c() {
        }
    }
}
