package o;

import java.util.concurrent.CancellationException;
import o.dxD;

/* loaded from: classes5.dex */
public final /* synthetic */ class dxK {
    public static /* synthetic */ dwG c(dxD dxd, int i, Object obj) {
        if ((i & 1) != 0) {
            dxd = null;
        }
        return dxG.a(dxd);
    }

    public static final dwG e(dxD dxd) {
        return new dxF(dxd);
    }

    public static final InterfaceC8760dxn a(dxD dxd, InterfaceC8760dxn interfaceC8760dxn) {
        return dxd.e(new C8758dxl(interfaceC8760dxn));
    }

    public static final Object b(dxD dxd, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        dxD.b.b(dxd, null, 1, null);
        Object a_ = dxd.a_(interfaceC8585dra);
        e = C8586drb.e();
        return a_ == e ? a_ : dpR.c;
    }

    public static final boolean b(dqZ dqz) {
        dxD dxd = (dxD) dqz.get(dxD.b);
        if (dxd != null) {
            return dxd.cu_();
        }
        return true;
    }

    public static /* synthetic */ void b(dqZ dqz, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        dxG.c(dqz, cancellationException);
    }

    public static final void a(dqZ dqz, CancellationException cancellationException) {
        dxD dxd = (dxD) dqz.get(dxD.b);
        if (dxd != null) {
            dxd.e(cancellationException);
        }
    }

    public static final void c(dxD dxd) {
        if (!dxd.cu_()) {
            throw dxd.i();
        }
    }

    public static final void e(dqZ dqz) {
        dxD dxd = (dxD) dqz.get(dxD.b);
        if (dxd != null) {
            dxG.b(dxd);
        }
    }

    public static final void b(dxD dxd, String str, Throwable th) {
        dxd.e(C8768dxv.e(str, th));
    }

    public static /* synthetic */ void e(dxD dxd, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        dxG.d(dxd, str, th);
    }

    public static final dxD a(dqZ dqz) {
        dxD dxd = (dxD) dqz.get(dxD.b);
        if (dxd != null) {
            return dxd;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + dqz).toString());
    }
}
