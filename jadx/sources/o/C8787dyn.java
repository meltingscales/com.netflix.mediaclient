package o;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineStart;

/* renamed from: o.dyn  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8787dyn {
    public static /* synthetic */ dyI d(dwU dwu, dqZ dqz, int i, CoroutineStart coroutineStart, drM drm, drX drx, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            dqz = EmptyCoroutineContext.e;
        }
        dqZ dqz2 = dqz;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        if ((i2 & 8) != 0) {
            drm = null;
        }
        return c(dwu, dqz2, i3, coroutineStart2, drm, drx);
    }

    public static final <E> dyI<E> c(dwU dwu, dqZ dqz, int i, CoroutineStart coroutineStart, drM<? super Throwable, dpR> drm, drX<? super InterfaceC8791dyr<E>, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        C8790dyq c8790dyq;
        dqZ a = dwP.a(dwu, dqz);
        InterfaceC8792dys e = C8799dyz.e(i, null, null, 6, null);
        if (coroutineStart.a()) {
            c8790dyq = new dyF(a, e, drx);
        } else {
            c8790dyq = new C8790dyq(a, e, true);
        }
        if (drm != null) {
            ((dxM) c8790dyq).e(drm);
        }
        ((AbstractC8730dwk) c8790dyq).e(coroutineStart, (CoroutineStart) c8790dyq, (drX<? super CoroutineStart, ? super InterfaceC8585dra<? super T>, ? extends Object>) drx);
        return c8790dyq;
    }
}
