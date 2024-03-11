package com.facebook.battery.metrics.core;

import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class SystemMetricsLogger {
    private static final AtomicReference<Delegate> DELEGATE = new AtomicReference<>();

    /* loaded from: classes2.dex */
    public interface Delegate {
        void wtf(String str, String str2, Throwable th);
    }

    public static void wtf(String str, String str2) {
        wtf(str, str2, null);
    }

    public static void wtf(String str, String str2, Throwable th) {
        Delegate delegate = DELEGATE.get();
        if (delegate != null) {
            delegate.wtf(str, str2, th);
        } else {
            Log.e(str, str2, th);
        }
    }
}
