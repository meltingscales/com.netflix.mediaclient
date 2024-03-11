package o;

import com.bugsnag.android.internal.TaskType;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: o.mu  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9298mu {
    public static final TaskType a(Thread thread) {
        C9269mR c9269mR = thread instanceof C9269mR ? (C9269mR) thread : null;
        if (c9269mR == null) {
            return null;
        }
        return c9269mR.e();
    }

    public static final ExecutorService e(final String str, final TaskType taskType, boolean z) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(128);
        ThreadFactory threadFactory = new ThreadFactory() { // from class: o.mv
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread a;
                a = C9298mu.a(str, taskType, runnable);
                return a;
            }
        };
        return new ThreadPoolExecutor(z ? 1 : 0, 1, 30L, TimeUnit.SECONDS, linkedBlockingQueue, threadFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread a(String str, TaskType taskType, Runnable runnable) {
        return new C9269mR(runnable, str, taskType);
    }
}
