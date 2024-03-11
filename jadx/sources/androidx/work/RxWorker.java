package androidx.work;

import android.content.Context;
import androidx.work.impl.utils.SynchronousExecutor;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public abstract class RxWorker extends ListenableWorker {
    static final Executor INSTANT_EXECUTOR = new SynchronousExecutor();

    public RxWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
}
