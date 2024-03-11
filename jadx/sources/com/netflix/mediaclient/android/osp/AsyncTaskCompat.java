package com.netflix.mediaclient.android.osp;

import android.os.Handler;
import android.os.Message;
import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o.C1044Mm;
import o.C8120deQ;

/* loaded from: classes.dex */
public abstract class AsyncTaskCompat<Params, Progress, Result> {
    public static Executor a;
    public static final int b;
    public static final ThreadFactory c;
    public static final BlockingQueue<Runnable> d;
    public static Executor e;
    private static volatile Executor f;
    private static final c g;
    private static final Executor i;
    private static Executor j;
    private final d<Params, Result> l;
    private final FutureTask<Result> n;
    private volatile Status k = Status.PENDING;
    private final AtomicBoolean h = new AtomicBoolean();
    private final AtomicBoolean m = new AtomicBoolean();

    /* loaded from: classes3.dex */
    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    protected abstract Result a(Params... paramsArr);

    protected void a() {
    }

    protected void b(Result result) {
    }

    protected void c() {
    }

    protected void d(Progress... progressArr) {
    }

    static {
        b = C8120deQ.e() ? 8 : 16;
        c = new ThreadFactory() { // from class: com.netflix.mediaclient.android.osp.AsyncTaskCompat.1
            private final AtomicInteger a = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, "AsyncTask #" + this.a.getAndIncrement());
                thread.setPriority(5);
                return thread;
            }
        };
        d = new LinkedBlockingQueue(64);
        ThreadPoolExecutor e2 = e();
        i = e2;
        a = e2;
        j = b();
        e = b();
        g = new c();
        f = e;
    }

    private static ThreadPoolExecutor e() {
        return new ThreadPoolExecutor(4, b, 1L, TimeUnit.SECONDS, d, c, new ThreadPoolExecutor.DiscardOldestPolicy());
    }

    private static ExecutorService b() {
        return Executors.newSingleThreadExecutor();
    }

    public AsyncTaskCompat() {
        d<Params, Result> dVar = new d<Params, Result>() { // from class: com.netflix.mediaclient.android.osp.AsyncTaskCompat.4
            @Override // java.util.concurrent.Callable
            public Result call() {
                AsyncTaskCompat.this.m.set(true);
                Process.setThreadPriority(10);
                AsyncTaskCompat asyncTaskCompat = AsyncTaskCompat.this;
                return (Result) asyncTaskCompat.c(asyncTaskCompat.a((Object[]) this.b));
            }
        };
        this.l = dVar;
        this.n = new FutureTask<Result>(dVar) { // from class: com.netflix.mediaclient.android.osp.AsyncTaskCompat.3
            @Override // java.util.concurrent.FutureTask
            protected void done() {
                try {
                    AsyncTaskCompat.this.d((AsyncTaskCompat) get());
                } catch (InterruptedException e2) {
                    C1044Mm.e("AsyncTask", e2);
                } catch (CancellationException unused) {
                    AsyncTaskCompat.this.d((AsyncTaskCompat) null);
                } catch (ExecutionException e3) {
                    throw new RuntimeException("An error occured while executing doInBackground()", e3.getCause());
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Result result) {
        if (this.m.get()) {
            return;
        }
        c(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Result c(Result result) {
        g.obtainMessage(1, new a(this, result)).sendToTarget();
        return result;
    }

    protected void a(Result result) {
        a();
    }

    public final boolean d() {
        return this.h.get();
    }

    /* renamed from: com.netflix.mediaclient.android.osp.AsyncTaskCompat$2  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            a = iArr;
            try {
                iArr[Status.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Status.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public final AsyncTaskCompat<Params, Progress, Result> d(Executor executor, Params... paramsArr) {
        if (this.k != Status.PENDING) {
            int i2 = AnonymousClass2.a[this.k.ordinal()];
            if (i2 == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (i2 == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.k = Status.RUNNING;
        c();
        this.l.b = paramsArr;
        executor.execute(this.n);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Result result) {
        if (d()) {
            a((AsyncTaskCompat<Params, Progress, Result>) result);
        } else {
            b(result);
        }
        this.k = Status.FINISHED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class c extends Handler {
        private c() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a aVar = (a) message.obj;
            int i = message.what;
            if (i == 1) {
                aVar.a.e(aVar.c[0]);
            } else if (i != 2) {
            } else {
                aVar.a.d((Object[]) aVar.c);
            }
        }
    }

    /* loaded from: classes3.dex */
    static abstract class d<Params, Result> implements Callable<Result> {
        Params[] b;

        private d() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class a<Data> {
        final AsyncTaskCompat a;
        final Data[] c;

        a(AsyncTaskCompat asyncTaskCompat, Data... dataArr) {
            this.a = asyncTaskCompat;
            this.c = dataArr;
        }
    }
}
