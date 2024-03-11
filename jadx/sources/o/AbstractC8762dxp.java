package o;

import java.util.concurrent.locks.LockSupport;
import o.AbstractC8763dxq;

/* renamed from: o.dxp  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC8762dxp extends AbstractC8765dxs {
    protected abstract Thread b();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n() {
        dpR dpr;
        Thread b = b();
        if (Thread.currentThread() != b) {
            AbstractC8727dwh b2 = C8735dwp.b();
            if (b2 != null) {
                b2.d(b);
                dpr = dpR.c;
            } else {
                dpr = null;
            }
            if (dpr == null) {
                LockSupport.unpark(b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(long j, AbstractC8763dxq.e eVar) {
        dwV.b.a(j, eVar);
    }
}
