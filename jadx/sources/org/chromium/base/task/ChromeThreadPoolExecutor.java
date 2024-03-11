package org.chromium.base.task;

import android.os.Process;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.base.task.AsyncTask;
import org.chromium.base.task.ChromeThreadPoolExecutor;
import org.chromium.build.BuildConfig;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class ChromeThreadPoolExecutor extends ThreadPoolExecutor {
    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    private static final int MAXIMUM_POOL_SIZE;
    private static final BlockingQueue<Runnable> sPoolWorkQueue;
    private static final ThreadFactory sThreadFactory;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = availableProcessors;
        CORE_POOL_SIZE = Math.max(2, Math.min(availableProcessors - 1, 4));
        MAXIMUM_POOL_SIZE = (availableProcessors * 2) + 1;
        sThreadFactory = new AnonymousClass1();
        sPoolWorkQueue = new ArrayBlockingQueue(128);
    }

    /* renamed from: org.chromium.base.task.ChromeThreadPoolExecutor$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    class AnonymousClass1 implements ThreadFactory {
        private final AtomicInteger mCount = new AtomicInteger(1);

        AnonymousClass1() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(final Runnable runnable) {
            Runnable runnable2 = new Runnable() { // from class: org.chromium.base.task.ChromeThreadPoolExecutor$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ChromeThreadPoolExecutor.AnonymousClass1.lambda$newThread$0(runnable);
                }
            };
            int andIncrement = this.mCount.getAndIncrement();
            return new Thread(runnable2, "CrAsyncTask #" + andIncrement);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$newThread$0(Runnable runnable) {
            Process.setThreadPriority(10);
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChromeThreadPoolExecutor() {
        this(CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, 30L, TimeUnit.SECONDS, sPoolWorkQueue, sThreadFactory);
    }

    ChromeThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory);
        allowCoreThreadTimeOut(true);
    }

    private static String getClassName(Runnable runnable) {
        Class<?> cls = runnable.getClass();
        try {
            if (cls == AsyncTask.NamedFutureTask.class) {
                cls = ((AsyncTask.NamedFutureTask) runnable).getBlamedClass();
            } else if (cls.getEnclosingClass() == android.os.AsyncTask.class) {
                Field declaredField = cls.getDeclaredField("this$0");
                declaredField.setAccessible(true);
                cls = declaredField.get(runnable).getClass();
            }
        } catch (IllegalAccessException e) {
            if (BuildConfig.ENABLE_ASSERTS) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchFieldException e2) {
            if (BuildConfig.ENABLE_ASSERTS) {
                throw new RuntimeException(e2);
            }
        }
        return cls.getName();
    }

    private Map<String, Integer> getNumberOfClassNameOccurrencesInQueue() {
        HashMap hashMap = new HashMap();
        for (Runnable runnable : (Runnable[]) getQueue().toArray(new Runnable[0])) {
            String className = getClassName(runnable);
            hashMap.put(className, Integer.valueOf((hashMap.containsKey(className) ? ((Integer) hashMap.get(className)).intValue() : 0) + 1));
        }
        return hashMap;
    }

    private String findClassNamesWithTooManyRunnables(Map<String, Integer> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().intValue() > 32) {
                sb.append(entry.getKey());
                sb.append(' ');
            }
        }
        return sb.length() == 0 ? "NO CLASSES FOUND" : sb.toString();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (RejectedExecutionException e) {
            String findClassNamesWithTooManyRunnables = findClassNamesWithTooManyRunnables(getNumberOfClassNameOccurrencesInQueue());
            throw new RejectedExecutionException("Prominent classes in AsyncTask: " + findClassNamesWithTooManyRunnables, e);
        }
    }
}
