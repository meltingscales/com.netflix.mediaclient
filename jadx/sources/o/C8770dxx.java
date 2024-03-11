package o;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: o.dxx  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8770dxx extends AbstractC8766dxt implements InterfaceC8748dxb {
    private final Executor c;

    public Executor b() {
        return this.c;
    }

    public C8770dxx(Executor executor) {
        this.c = executor;
        C7648dAe.e(b());
    }

    @Override // o.dwQ
    public void dispatch(dqZ dqz, Runnable runnable) {
        Runnable runnable2;
        try {
            Executor b = b();
            AbstractC8727dwh b2 = C8735dwp.b();
            if (b2 == null || (runnable2 = b2.e(runnable)) == null) {
                runnable2 = runnable;
            }
            b.execute(runnable2);
        } catch (RejectedExecutionException e) {
            AbstractC8727dwh b3 = C8735dwp.b();
            if (b3 != null) {
                b3.c();
            }
            a(dqz, e);
            C8752dxf.a().dispatch(dqz, runnable);
        }
    }

    @Override // o.InterfaceC8748dxb
    public void b(long j, InterfaceC8743dwx<? super dpR> interfaceC8743dwx) {
        Executor b = b();
        ScheduledExecutorService scheduledExecutorService = b instanceof ScheduledExecutorService ? (ScheduledExecutorService) b : null;
        ScheduledFuture<?> c = scheduledExecutorService != null ? c(scheduledExecutorService, new dxS(this, interfaceC8743dwx), interfaceC8743dwx.getContext(), j) : null;
        if (c != null) {
            dxG.c(interfaceC8743dwx, c);
        } else {
            dwV.b.b(j, interfaceC8743dwx);
        }
    }

    @Override // o.InterfaceC8748dxb
    public InterfaceC8760dxn e(long j, Runnable runnable, dqZ dqz) {
        Executor b = b();
        ScheduledExecutorService scheduledExecutorService = b instanceof ScheduledExecutorService ? (ScheduledExecutorService) b : null;
        ScheduledFuture<?> c = scheduledExecutorService != null ? c(scheduledExecutorService, runnable, dqz, j) : null;
        if (c != null) {
            return new C8759dxm(c);
        }
        return dwV.b.e(j, runnable, dqz);
    }

    private final ScheduledFuture<?> c(ScheduledExecutorService scheduledExecutorService, Runnable runnable, dqZ dqz, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            a(dqz, e);
            return null;
        }
    }

    private final void a(dqZ dqz, RejectedExecutionException rejectedExecutionException) {
        dxG.c(dqz, C8768dxv.e("The task was rejected", rejectedExecutionException));
    }

    @Override // o.AbstractC8766dxt, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor b = b();
        ExecutorService executorService = b instanceof ExecutorService ? (ExecutorService) b : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // o.dwQ
    public String toString() {
        return b().toString();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C8770dxx) && ((C8770dxx) obj).b() == b();
    }

    public int hashCode() {
        return System.identityHashCode(b());
    }
}
