package androidx.activity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import o.C8632dsu;
import o.dpR;
import o.drO;

/* loaded from: classes.dex */
public final class FullyDrawnReporter {
    private final Executor executor;
    private final Object lock;
    private final List<drO<dpR>> onReportCallbacks;
    private final drO<dpR> reportFullyDrawn;
    private boolean reportPosted;
    private final Runnable reportRunnable;
    private boolean reportedFullyDrawn;
    private int reporterCount;

    public FullyDrawnReporter(Executor executor, drO<dpR> dro) {
        C8632dsu.c((Object) executor, "");
        C8632dsu.c((Object) dro, "");
        this.executor = executor;
        this.reportFullyDrawn = dro;
        this.lock = new Object();
        this.onReportCallbacks = new ArrayList();
        this.reportRunnable = new Runnable() { // from class: androidx.activity.FullyDrawnReporter$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                FullyDrawnReporter.reportRunnable$lambda$2(FullyDrawnReporter.this);
            }
        };
    }

    public final boolean isFullyDrawnReported() {
        boolean z;
        synchronized (this.lock) {
            z = this.reportedFullyDrawn;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportRunnable$lambda$2(FullyDrawnReporter fullyDrawnReporter) {
        C8632dsu.c((Object) fullyDrawnReporter, "");
        synchronized (fullyDrawnReporter.lock) {
            fullyDrawnReporter.reportPosted = false;
            if (fullyDrawnReporter.reporterCount == 0 && !fullyDrawnReporter.reportedFullyDrawn) {
                fullyDrawnReporter.reportFullyDrawn.invoke();
                fullyDrawnReporter.fullyDrawnReported();
            }
            dpR dpr = dpR.c;
        }
    }

    public final void fullyDrawnReported() {
        synchronized (this.lock) {
            this.reportedFullyDrawn = true;
            Iterator<T> it = this.onReportCallbacks.iterator();
            while (it.hasNext()) {
                ((drO) it.next()).invoke();
            }
            this.onReportCallbacks.clear();
            dpR dpr = dpR.c;
        }
    }
}
