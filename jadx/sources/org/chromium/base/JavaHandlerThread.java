package org.chromium.base;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.lang.Thread;
import org.chromium.base.annotations.CalledByNative;

/* loaded from: classes6.dex */
public class JavaHandlerThread {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final HandlerThread mThread;
    private Throwable mUnhandledException;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public interface Natives {
        void initializeThread(long j, long j2);

        void onLooperStopped(long j);
    }

    @CalledByNative
    private Throwable getUncaughtExceptionIfAny() {
        return this.mUnhandledException;
    }

    public JavaHandlerThread(String str, int i) {
        this.mThread = new HandlerThread(str, i);
    }

    @CalledByNative
    private static JavaHandlerThread create(String str, int i) {
        return new JavaHandlerThread(str, i);
    }

    public Looper getLooper() {
        return this.mThread.getLooper();
    }

    public void maybeStart() {
        if (hasStarted()) {
            return;
        }
        this.mThread.start();
    }

    @CalledByNative
    private void startAndInitialize(final long j, final long j2) {
        maybeStart();
        new Handler(this.mThread.getLooper()).post(new Runnable() { // from class: org.chromium.base.JavaHandlerThread.1
            @Override // java.lang.Runnable
            public void run() {
                JavaHandlerThreadJni.get().initializeThread(j, j2);
            }
        });
    }

    @CalledByNative
    private void quitThreadSafely(final long j) {
        new Handler(this.mThread.getLooper()).post(new Runnable() { // from class: org.chromium.base.JavaHandlerThread.2
            @Override // java.lang.Runnable
            public void run() {
                JavaHandlerThread.this.mThread.quit();
                JavaHandlerThreadJni.get().onLooperStopped(j);
            }
        });
        this.mThread.getLooper().quitSafely();
    }

    @CalledByNative
    private void joinThread() {
        boolean z = false;
        while (!z) {
            try {
                this.mThread.join();
                z = true;
            } catch (InterruptedException unused) {
            }
        }
    }

    private boolean hasStarted() {
        return this.mThread.getState() != Thread.State.NEW;
    }

    @CalledByNative
    private boolean isAlive() {
        return this.mThread.isAlive();
    }

    @CalledByNative
    private void listenForUncaughtExceptionsForTesting() {
        this.mThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: org.chromium.base.JavaHandlerThread.3
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                JavaHandlerThread.this.mUnhandledException = th;
            }
        });
    }
}
