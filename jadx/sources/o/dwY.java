package o;

import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public final class dwY {
    public static final dwU e(dwU dwu, dqZ dqz) {
        return new C7654dAk(dwu.getCoroutineContext().plus(dqz));
    }

    public static final dwU a() {
        return new C7654dAk(dxZ.d(null, 1, null).plus(C8752dxf.d()));
    }

    public static final boolean b(dwU dwu) {
        dxD dxd = (dxD) dwu.getCoroutineContext().get(dxD.b);
        if (dxd != null) {
            return dxd.cu_();
        }
        return true;
    }

    public static final <R> Object b(drX<? super dwU, ? super InterfaceC8585dra<? super R>, ? extends Object> drx, InterfaceC8585dra<? super R> interfaceC8585dra) {
        Object e;
        dAE dae = new dAE(interfaceC8585dra.getContext(), interfaceC8585dra);
        Object b = dAV.b(dae, dae, drx);
        e = C8586drb.e();
        if (b == e) {
            C8592drh.c(interfaceC8585dra);
        }
        return b;
    }

    public static final dwU c(dqZ dqz) {
        if (dqz.get(dxD.b) == null) {
            dqz = dqz.plus(dxG.a(null, 1, null));
        }
        return new C7654dAk(dqz);
    }

    public static /* synthetic */ void d(dwU dwu, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        a(dwu, cancellationException);
    }

    public static final void a(dwU dwu, CancellationException cancellationException) {
        dxD dxd = (dxD) dwu.getCoroutineContext().get(dxD.b);
        if (dxd == null) {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + dwu).toString());
        }
        dxd.e(cancellationException);
    }

    public static /* synthetic */ void a(dwU dwu, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        d(dwu, str, th);
    }

    public static final void d(dwU dwu, String str, Throwable th) {
        a(dwu, C8768dxv.e(str, th));
    }

    public static final void c(dwU dwu) {
        dxG.d(dwu.getCoroutineContext());
    }
}
