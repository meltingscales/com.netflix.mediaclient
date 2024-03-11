package org.chromium.base;

import java.lang.Thread;
import org.chromium.base.annotations.CalledByNative;

/* loaded from: classes6.dex */
public class JavaExceptionReporter implements Thread.UncaughtExceptionHandler {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final boolean mCrashAfterReport;
    private boolean mHandlingException;
    private final Thread.UncaughtExceptionHandler mParent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public interface Natives {
        void reportJavaException(boolean z, Throwable th);

        void reportJavaStackTrace(String str);
    }

    private JavaExceptionReporter(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, boolean z) {
        this.mParent = uncaughtExceptionHandler;
        this.mCrashAfterReport = z;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (!this.mHandlingException) {
            this.mHandlingException = true;
            JavaExceptionReporterJni.get().reportJavaException(this.mCrashAfterReport, th);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.mParent;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    public static void reportStackTrace(String str) {
        JavaExceptionReporterJni.get().reportJavaStackTrace(PiiElider.sanitizeStacktrace(str));
    }

    public static void reportException(Throwable th) {
        JavaExceptionReporterJni.get().reportJavaException(false, th);
    }

    @CalledByNative
    private static void installHandler(boolean z) {
        Thread.setDefaultUncaughtExceptionHandler(new JavaExceptionReporter(Thread.getDefaultUncaughtExceptionHandler(), z));
    }
}
