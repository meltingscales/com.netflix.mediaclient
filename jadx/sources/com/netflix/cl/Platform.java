package com.netflix.cl;

import com.netflix.cl.model.LoggingSchema;
import com.netflix.cl.model.LoggingSource;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class Platform {
    private static AtomicLong sEventCounter = new AtomicLong(0);
    private static PlatformImpl sPlatform;

    /* loaded from: classes.dex */
    public interface ErrorReporter {
        void logHandledException(String str);

        void logHandledException(String str, Throwable th);
    }

    /* loaded from: classes.dex */
    public interface LocalLogger {
        void debug(String str);

        void debug(String str, Object... objArr);

        void error(String str);

        void error(String str, Object... objArr);

        boolean isDebug();
    }

    /* loaded from: classes.dex */
    public interface PlatformImpl {
        long getCurrentTimeInMs();

        ErrorReporter getErrorReporter();

        LocalLogger getLocalLogger();

        LoggingSchema getLoggingSchema();

        LoggingSource getLoggingSource();

        String getSchemaVersion();

        void reInit();
    }

    public static PlatformImpl getPlatform() {
        return sPlatform;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setImp(PlatformImpl platformImpl) {
        sPlatform = platformImpl;
    }

    public static long getCurrentTimeInMs() {
        PlatformImpl platformImpl = sPlatform;
        if (platformImpl != null) {
            return platformImpl.getCurrentTimeInMs();
        }
        return System.currentTimeMillis();
    }

    public static long getSequence() {
        return sEventCounter.incrementAndGet();
    }

    public static LocalLogger getLocalLogger() {
        return sPlatform.getLocalLogger();
    }

    public static LoggingSource getLoggingSource() {
        return sPlatform.getLoggingSource();
    }

    public static LoggingSchema getLoggingSchema() {
        return sPlatform.getLoggingSchema();
    }

    public static ErrorReporter getErrorReporter() {
        return sPlatform.getErrorReporter();
    }

    public static void reInit() {
        sPlatform.reInit();
    }

    public static void resetSequence() {
        sEventCounter.set(0L);
    }
}
