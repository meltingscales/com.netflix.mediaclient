package o;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import o.AbstractC8763dxq;

/* loaded from: classes5.dex */
public final class dwV extends AbstractC8763dxq implements Runnable {
    private static volatile Thread _thread;
    public static final dwV b;
    private static volatile int debugStatus;
    private static final long e;

    private final boolean l() {
        return debugStatus == 4;
    }

    private final boolean o() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    private dwV() {
    }

    static {
        Long l;
        dwV dwv = new dwV();
        b = dwv;
        AbstractC8765dxs.e(dwv, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        e = timeUnit.toNanos(l.longValue());
    }

    @Override // o.AbstractC8762dxp
    protected Thread b() {
        Thread thread = _thread;
        return thread == null ? k() : thread;
    }

    @Override // o.AbstractC8763dxq
    public void b(Runnable runnable) {
        if (l()) {
            s();
        }
        super.b(runnable);
    }

    @Override // o.AbstractC8762dxp
    protected void e(long j, AbstractC8763dxq.e eVar) {
        s();
    }

    private final void s() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // o.AbstractC8763dxq, o.AbstractC8765dxs
    public void a() {
        debugStatus = 4;
        super.a();
    }

    @Override // o.AbstractC8763dxq, o.InterfaceC8748dxb
    public InterfaceC8760dxn e(long j, Runnable runnable, dqZ dqz) {
        return d(j, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        dpR dpr;
        boolean e2;
        C8776dyc.a.d(this);
        AbstractC8727dwh b2 = C8735dwp.b();
        if (b2 != null) {
            b2.b();
        }
        try {
            if (!q()) {
                if (e2) {
                    return;
                }
                return;
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long j2 = j();
                if (j2 == Long.MAX_VALUE) {
                    AbstractC8727dwh b3 = C8735dwp.b();
                    long d = b3 != null ? b3.d() : System.nanoTime();
                    if (j == Long.MAX_VALUE) {
                        j = e + d;
                    }
                    long j3 = j - d;
                    if (j3 <= 0) {
                        _thread = null;
                        m();
                        AbstractC8727dwh b4 = C8735dwp.b();
                        if (b4 != null) {
                            b4.e();
                        }
                        if (e()) {
                            return;
                        }
                        b();
                        return;
                    }
                    j2 = C8657dts.d(j2, j3);
                } else {
                    j = Long.MAX_VALUE;
                }
                if (j2 > 0) {
                    if (o()) {
                        _thread = null;
                        m();
                        AbstractC8727dwh b5 = C8735dwp.b();
                        if (b5 != null) {
                            b5.e();
                        }
                        if (e()) {
                            return;
                        }
                        b();
                        return;
                    }
                    AbstractC8727dwh b6 = C8735dwp.b();
                    if (b6 != null) {
                        b6.b(this, j2);
                        dpr = dpR.c;
                    } else {
                        dpr = null;
                    }
                    if (dpr == null) {
                        LockSupport.parkNanos(this, j2);
                    }
                }
            }
        } finally {
            _thread = null;
            m();
            AbstractC8727dwh b7 = C8735dwp.b();
            if (b7 != null) {
                b7.e();
            }
            if (!e()) {
                b();
            }
        }
    }

    private final Thread k() {
        Thread thread;
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    private final boolean q() {
        synchronized (this) {
            if (o()) {
                return false;
            }
            debugStatus = 1;
            C8632dsu.d(this);
            notifyAll();
            return true;
        }
    }

    private final void m() {
        synchronized (this) {
            if (o()) {
                debugStatus = 3;
                h();
                C8632dsu.d(this);
                notifyAll();
            }
        }
    }
}
