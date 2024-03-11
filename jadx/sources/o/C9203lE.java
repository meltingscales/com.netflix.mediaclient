package o;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import o.AbstractC9286mi;

/* renamed from: o.lE  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9203lE extends C9185kn {
    private final ScheduledThreadPoolExecutor b;
    private final InterfaceC9200lB d;
    private final AtomicBoolean e;

    public /* synthetic */ C9203lE(C9258mG c9258mG, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, int i, C8627dsp c8627dsp) {
        this(c9258mG, (i & 2) != 0 ? new ScheduledThreadPoolExecutor(1) : scheduledThreadPoolExecutor);
    }

    public C9203lE(C9258mG c9258mG, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.b = scheduledThreadPoolExecutor;
        this.e = new AtomicBoolean(true);
        this.d = c9258mG.m();
        long k = c9258mG.k();
        if (k > 0) {
            scheduledThreadPoolExecutor.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
            try {
                scheduledThreadPoolExecutor.schedule(new Runnable() { // from class: o.lD
                    @Override // java.lang.Runnable
                    public final void run() {
                        C9203lE.d(C9203lE.this);
                    }
                }, k, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                this.d.e("Failed to schedule timer for LaunchCrashTracker", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C9203lE c9203lE) {
        c9203lE.d();
    }

    public final void d() {
        this.b.shutdown();
        this.e.set(false);
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            AbstractC9286mi.t tVar = new AbstractC9286mi.t(false);
            for (InterfaceC9263mL interfaceC9263mL : getObservers$bugsnag_android_core_release()) {
                interfaceC9263mL.onStateChange(tVar);
            }
        }
        this.d.b("App launch period marked as complete");
    }

    public final boolean b() {
        return this.e.get();
    }
}
