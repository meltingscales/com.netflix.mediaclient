package o;

import com.bugsnag.android.internal.TaskType;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: o.mx  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9301mx {
    private final ExecutorService a;
    private final ExecutorService b;
    private final ExecutorService c;
    private final ExecutorService d;
    private final ExecutorService e;

    /* renamed from: o.mx$b */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TaskType.valuesCustom().length];
            iArr[TaskType.ERROR_REQUEST.ordinal()] = 1;
            iArr[TaskType.SESSION_REQUEST.ordinal()] = 2;
            iArr[TaskType.IO.ordinal()] = 3;
            iArr[TaskType.INTERNAL_REPORT.ordinal()] = 4;
            iArr[TaskType.DEFAULT.ordinal()] = 5;
            a = iArr;
        }
    }

    public C9301mx() {
        this(null, null, null, null, null, 31, null);
    }

    public C9301mx(ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3, ExecutorService executorService4, ExecutorService executorService5) {
        this.a = executorService;
        this.b = executorService2;
        this.c = executorService3;
        this.e = executorService4;
        this.d = executorService5;
    }

    public /* synthetic */ C9301mx(ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3, ExecutorService executorService4, ExecutorService executorService5, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? C9298mu.e("Bugsnag Error thread", TaskType.ERROR_REQUEST, true) : executorService, (i & 2) != 0 ? C9298mu.e("Bugsnag Session thread", TaskType.SESSION_REQUEST, true) : executorService2, (i & 4) != 0 ? C9298mu.e("Bugsnag IO thread", TaskType.IO, true) : executorService3, (i & 8) != 0 ? C9298mu.e("Bugsnag Internal Report thread", TaskType.INTERNAL_REPORT, false) : executorService4, (i & 16) != 0 ? C9298mu.e("Bugsnag Default thread", TaskType.DEFAULT, false) : executorService5);
    }

    public final Future<?> e(TaskType taskType, Runnable runnable) {
        return c(taskType, Executors.callable(runnable));
    }

    public final <T> Future<T> c(TaskType taskType, Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        int i = b.a[taskType.ordinal()];
        if (i == 1) {
            this.a.execute(futureTask);
        } else if (i == 2) {
            this.b.execute(futureTask);
        } else if (i == 3) {
            this.c.execute(futureTask);
        } else if (i == 4) {
            this.e.execute(futureTask);
        } else if (i == 5) {
            this.d.execute(futureTask);
        }
        return new d(futureTask, taskType);
    }

    public final void b() {
        this.e.shutdownNow();
        this.d.shutdownNow();
        this.a.shutdown();
        this.b.shutdown();
        this.c.shutdown();
        e(this.a);
        e(this.b);
        e(this.c);
    }

    private final void e(ExecutorService executorService) {
        try {
            executorService.awaitTermination(1500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.mx$d */
    /* loaded from: classes2.dex */
    public static final class d<V> implements Future<V> {
        private final TaskType b;
        private final FutureTask<V> d;

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            return this.d.cancel(z);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.d.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.d.isDone();
        }

        public d(FutureTask<V> futureTask, TaskType taskType) {
            this.d = futureTask;
            this.b = taskType;
        }

        @Override // java.util.concurrent.Future
        public V get() {
            e();
            return this.d.get();
        }

        @Override // java.util.concurrent.Future
        public V get(long j, TimeUnit timeUnit) {
            e();
            return this.d.get(j, timeUnit);
        }

        private final void e() {
            if (this.d.isDone() || C9298mu.a(Thread.currentThread()) != this.b) {
                return;
            }
            this.d.run();
        }
    }
}
