package o;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.dwl  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8731dwl<T> extends AbstractC8730dwk<T> {
    private final AbstractC8765dxs c;
    private final Thread d;

    @Override // o.dxM
    protected boolean d() {
        return true;
    }

    public C8731dwl(dqZ dqz, Thread thread, AbstractC8765dxs abstractC8765dxs) {
        super(dqz, true, true);
        this.d = thread;
        this.c = abstractC8765dxs;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.dxM
    public void b(Object obj) {
        dpR dpr;
        if (C8632dsu.c(Thread.currentThread(), this.d)) {
            return;
        }
        Thread thread = this.d;
        AbstractC8727dwh b = C8735dwp.b();
        if (b != null) {
            b.d(thread);
            dpr = dpR.c;
        } else {
            dpr = null;
        }
        if (dpr == null) {
            LockSupport.unpark(thread);
        }
    }

    public final T e() {
        dpR dpr;
        AbstractC8727dwh b = C8735dwp.b();
        if (b != null) {
            b.b();
        }
        try {
            AbstractC8765dxs abstractC8765dxs = this.c;
            if (abstractC8765dxs != null) {
                AbstractC8765dxs.e(abstractC8765dxs, false, 1, null);
            }
            while (!Thread.interrupted()) {
                AbstractC8765dxs abstractC8765dxs2 = this.c;
                long j = abstractC8765dxs2 != null ? abstractC8765dxs2.j() : Long.MAX_VALUE;
                if (!k()) {
                    AbstractC8727dwh b2 = C8735dwp.b();
                    if (b2 != null) {
                        b2.b(this, j);
                        dpr = dpR.c;
                    } else {
                        dpr = null;
                    }
                    if (dpr == null) {
                        LockSupport.parkNanos(this, j);
                    }
                } else {
                    AbstractC8765dxs abstractC8765dxs3 = this.c;
                    if (abstractC8765dxs3 != null) {
                        AbstractC8765dxs.c(abstractC8765dxs3, false, 1, null);
                    }
                    T t = (T) dxJ.d(cy_());
                    dwO dwo = t instanceof dwO ? (dwO) t : null;
                    if (dwo == null) {
                        return t;
                    }
                    throw dwo.a;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            a_((Throwable) interruptedException);
            throw interruptedException;
        } finally {
            AbstractC8727dwh b3 = C8735dwp.b();
            if (b3 != null) {
                b3.e();
            }
        }
    }
}
