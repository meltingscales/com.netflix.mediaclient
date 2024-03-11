package androidx.lifecycle;

import java.util.ArrayDeque;
import java.util.Queue;
import o.C8632dsu;
import o.C8752dxf;
import o.dqZ;
import o.dxN;

/* loaded from: classes2.dex */
public final class DispatchQueue {
    private boolean finished;
    private boolean isDraining;
    private boolean paused = true;
    private final Queue<Runnable> queue = new ArrayDeque();

    public final boolean canRun() {
        return this.finished || !this.paused;
    }

    public final void pause() {
        this.paused = true;
    }

    public final void resume() {
        if (this.paused) {
            if (!(!this.finished)) {
                throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
            }
            this.paused = false;
            drainQueue();
        }
    }

    public final void finish() {
        this.finished = true;
        drainQueue();
    }

    public final void drainQueue() {
        if (this.isDraining) {
            return;
        }
        try {
            this.isDraining = true;
            while ((!this.queue.isEmpty()) && canRun()) {
                Runnable poll = this.queue.poll();
                if (poll != null) {
                    poll.run();
                }
            }
        } finally {
            this.isDraining = false;
        }
    }

    public final void dispatchAndEnqueue(dqZ dqz, final Runnable runnable) {
        C8632dsu.c((Object) dqz, "");
        C8632dsu.c((Object) runnable, "");
        dxN c = C8752dxf.d().c();
        if (c.isDispatchNeeded(dqz) || canRun()) {
            c.dispatch(dqz, new Runnable() { // from class: androidx.lifecycle.DispatchQueue$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    DispatchQueue.dispatchAndEnqueue$lambda$2$lambda$1(DispatchQueue.this, runnable);
                }
            });
        } else {
            enqueue(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatchAndEnqueue$lambda$2$lambda$1(DispatchQueue dispatchQueue, Runnable runnable) {
        C8632dsu.c((Object) dispatchQueue, "");
        C8632dsu.c((Object) runnable, "");
        dispatchQueue.enqueue(runnable);
    }

    private final void enqueue(Runnable runnable) {
        if (!this.queue.offer(runnable)) {
            throw new IllegalStateException("cannot enqueue any more runnables".toString());
        }
        drainQueue();
    }
}
