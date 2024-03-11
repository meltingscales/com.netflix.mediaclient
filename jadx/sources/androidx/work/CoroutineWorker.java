package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.SettableFuture;
import o.C8632dsu;
import o.C8752dxf;
import o.dwG;
import o.dwQ;
import o.dxD;
import o.dxK;

/* loaded from: classes5.dex */
public abstract class CoroutineWorker extends ListenableWorker {
    private final dwQ coroutineContext;
    private final SettableFuture<ListenableWorker.Result> future;
    private final dwG job;

    public final SettableFuture<ListenableWorker.Result> getFuture$work_runtime_ktx_release() {
        return this.future;
    }

    public final dwG getJob$work_runtime_ktx_release() {
        return this.job;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        dwG c;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) workerParameters, "");
        c = dxK.c(null, 1, null);
        this.job = c;
        SettableFuture<ListenableWorker.Result> create = SettableFuture.create();
        C8632dsu.a(create, "");
        this.future = create;
        create.addListener(new Runnable() { // from class: androidx.work.CoroutineWorker.1
            @Override // java.lang.Runnable
            public final void run() {
                if (CoroutineWorker.this.getFuture$work_runtime_ktx_release().isCancelled()) {
                    dxD.b.b(CoroutineWorker.this.getJob$work_runtime_ktx_release(), null, 1, null);
                }
            }
        }, getTaskExecutor().getBackgroundExecutor());
        this.coroutineContext = C8752dxf.b();
    }
}
