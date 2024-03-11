package org.chromium.base;

import android.os.Process;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import org.chromium.base.annotations.CalledByNative;

/* loaded from: classes5.dex */
public class EarlyTraceEvent {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String BACKGROUND_STARTUP_TRACING_ENABLED_KEY = "bg_startup_tracing";
    static final int STATE_DISABLED = 0;
    static final int STATE_ENABLED = 1;
    static final int STATE_FINISHED = 2;
    private static final String TRACE_CONFIG_FILENAME = "/data/local/chrome-trace-config.json";
    public static final String TRACE_EARLY_JAVA_IN_CHILD_SWITCH = "trace-early-java-in-child";
    private static final String TRACE_STARTUP_SWITCH = "trace-startup";
    static List<AsyncEvent> sAsyncEvents;
    private static boolean sCachedBackgroundStartupTracingFlag;
    private static volatile boolean sEnabledInChildProcessBeforeCommandLine;
    static List<Event> sEvents;
    static final Object sLock = new Object();
    static volatile int sState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public interface Natives {
        void recordEarlyAsyncBeginEvent(String str, long j, long j2);

        void recordEarlyAsyncEndEvent(String str, long j, long j2);

        void recordEarlyBeginEvent(String str, long j, int i, long j2);

        void recordEarlyEndEvent(String str, long j, int i, long j2);

        void recordEarlyToplevelBeginEvent(String str, long j, int i, long j2);

        void recordEarlyToplevelEndEvent(String str, long j, int i, long j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean enabled() {
        return sState == 1;
    }

    @CalledByNative
    public static boolean getBackgroundStartupTracingFlag() {
        return sCachedBackgroundStartupTracingFlag;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class Event {
        final boolean mIsStart;
        final boolean mIsToplevel;
        final String mName;
        final int mThreadId = Process.myTid();
        final long mTimeNanos = System.nanoTime();
        final long mThreadTimeMillis = SystemClock.currentThreadTimeMillis();

        Event(String str, boolean z, boolean z2) {
            this.mIsStart = z;
            this.mIsToplevel = z2;
            this.mName = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class AsyncEvent {
        final long mId;
        final boolean mIsStart;
        final String mName;
        final long mTimeNanos = System.nanoTime();

        AsyncEvent(String str, long j, boolean z) {
            this.mName = str;
            this.mId = j;
            this.mIsStart = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void maybeEnableInBrowserProcess() {
        /*
            org.chromium.base.ThreadUtils.assertOnUiThread()
            int r0 = org.chromium.base.EarlyTraceEvent.sState
            if (r0 == 0) goto L8
            return
        L8:
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()
            org.chromium.base.CommandLine r1 = org.chromium.base.CommandLine.getInstance()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r2 = "trace-startup"
            boolean r1 = r1.hasSwitch(r2)     // Catch: java.lang.Throwable -> L4a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
            r1 = r2
            goto L29
        L1c:
            java.io.File r1 = new java.io.File     // Catch: java.lang.SecurityException -> L28 java.lang.Throwable -> L4a
            java.lang.String r4 = "/data/local/chrome-trace-config.json"
            r1.<init>(r4)     // Catch: java.lang.SecurityException -> L28 java.lang.Throwable -> L4a
            boolean r1 = r1.exists()     // Catch: java.lang.SecurityException -> L28 java.lang.Throwable -> L4a
            goto L29
        L28:
            r1 = r3
        L29:
            android.content.SharedPreferences r4 = org.chromium.base.ContextUtils.getAppSharedPreferences()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r5 = "bg_startup_tracing"
            boolean r4 = r4.getBoolean(r5, r3)     // Catch: java.lang.Throwable -> L4a
            if (r4 == 0) goto L40
            if (r1 == 0) goto L3d
            setBackgroundStartupTracingFlag(r3)     // Catch: java.lang.Throwable -> L4a
            org.chromium.base.EarlyTraceEvent.sCachedBackgroundStartupTracingFlag = r3     // Catch: java.lang.Throwable -> L4a
            goto L40
        L3d:
            org.chromium.base.EarlyTraceEvent.sCachedBackgroundStartupTracingFlag = r2     // Catch: java.lang.Throwable -> L4a
            goto L41
        L40:
            r2 = r1
        L41:
            android.os.StrictMode.setThreadPolicy(r0)
            if (r2 == 0) goto L49
            enable()
        L49:
            return
        L4a:
            r1 = move-exception
            android.os.StrictMode.setThreadPolicy(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.EarlyTraceEvent.maybeEnableInBrowserProcess():void");
    }

    public static void earlyEnableInChildWithoutCommandLine() {
        sEnabledInChildProcessBeforeCommandLine = true;
        enable();
    }

    public static void onCommandLineAvailableInChildProcess() {
        if (sEnabledInChildProcessBeforeCommandLine) {
            synchronized (sLock) {
                if (!CommandLine.getInstance().hasSwitch(TRACE_EARLY_JAVA_IN_CHILD_SWITCH)) {
                    reset();
                    return;
                }
                if (sState == 0) {
                    enable();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void enable() {
        synchronized (sLock) {
            if (sState != 0) {
                return;
            }
            sEvents = new ArrayList();
            sAsyncEvents = new ArrayList();
            sState = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void disable() {
        synchronized (sLock) {
            if (enabled()) {
                if (!sEvents.isEmpty()) {
                    dumpEvents(sEvents);
                    sEvents.clear();
                }
                if (!sAsyncEvents.isEmpty()) {
                    dumpAsyncEvents(sAsyncEvents);
                    sAsyncEvents.clear();
                }
                sState = 2;
                sEvents = null;
                sAsyncEvents = null;
            }
        }
    }

    static void reset() {
        synchronized (sLock) {
            sState = 0;
            sEvents = null;
            sAsyncEvents = null;
        }
    }

    @CalledByNative
    static void setBackgroundStartupTracingFlag(boolean z) {
        ContextUtils.getAppSharedPreferences().edit().putBoolean(BACKGROUND_STARTUP_TRACING_ENABLED_KEY, z).apply();
    }

    public static void begin(String str, boolean z) {
        if (enabled()) {
            Event event = new Event(str, true, z);
            synchronized (sLock) {
                if (enabled()) {
                    sEvents.add(event);
                }
            }
        }
    }

    public static void end(String str, boolean z) {
        if (enabled()) {
            Event event = new Event(str, false, z);
            synchronized (sLock) {
                if (enabled()) {
                    sEvents.add(event);
                }
            }
        }
    }

    public static void startAsync(String str, long j) {
        if (enabled()) {
            AsyncEvent asyncEvent = new AsyncEvent(str, j, true);
            synchronized (sLock) {
                if (enabled()) {
                    sAsyncEvents.add(asyncEvent);
                }
            }
        }
    }

    public static void finishAsync(String str, long j) {
        if (enabled()) {
            AsyncEvent asyncEvent = new AsyncEvent(str, j, false);
            synchronized (sLock) {
                if (enabled()) {
                    sAsyncEvents.add(asyncEvent);
                }
            }
        }
    }

    static List<Event> getMatchingCompletedEventsForTesting(String str) {
        ArrayList arrayList;
        synchronized (sLock) {
            arrayList = new ArrayList();
            for (Event event : sEvents) {
                if (event.mName.equals(str)) {
                    arrayList.add(event);
                }
            }
        }
        return arrayList;
    }

    private static void dumpEvents(List<Event> list) {
        for (Event event : list) {
            if (event.mIsStart) {
                if (event.mIsToplevel) {
                    EarlyTraceEventJni.get().recordEarlyToplevelBeginEvent(event.mName, event.mTimeNanos, event.mThreadId, event.mThreadTimeMillis);
                } else {
                    EarlyTraceEventJni.get().recordEarlyBeginEvent(event.mName, event.mTimeNanos, event.mThreadId, event.mThreadTimeMillis);
                }
            } else if (event.mIsToplevel) {
                EarlyTraceEventJni.get().recordEarlyToplevelEndEvent(event.mName, event.mTimeNanos, event.mThreadId, event.mThreadTimeMillis);
            } else {
                EarlyTraceEventJni.get().recordEarlyEndEvent(event.mName, event.mTimeNanos, event.mThreadId, event.mThreadTimeMillis);
            }
        }
    }

    private static void dumpAsyncEvents(List<AsyncEvent> list) {
        for (AsyncEvent asyncEvent : list) {
            if (asyncEvent.mIsStart) {
                EarlyTraceEventJni.get().recordEarlyAsyncBeginEvent(asyncEvent.mName, asyncEvent.mId, asyncEvent.mTimeNanos);
            } else {
                EarlyTraceEventJni.get().recordEarlyAsyncEndEvent(asyncEvent.mName, asyncEvent.mId, asyncEvent.mTimeNanos);
            }
        }
    }
}
