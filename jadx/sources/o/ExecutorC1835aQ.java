package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: o.aQ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class ExecutorC1835aQ implements Executor {
    final Handler d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExecutorC1835aQ(Handler handler) {
        this.d = handler;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (Looper.myLooper() == this.d.getLooper()) {
            runnable.run();
        } else {
            this.d.post(runnable);
        }
    }
}
