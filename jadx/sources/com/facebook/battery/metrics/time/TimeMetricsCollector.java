package com.facebook.battery.metrics.time;

import android.os.SystemClock;
import com.facebook.battery.metrics.core.SystemMetricsCollector;
import com.facebook.battery.metrics.core.Utilities;

/* loaded from: classes2.dex */
public class TimeMetricsCollector extends SystemMetricsCollector<TimeMetrics> {
    @Override // com.facebook.battery.metrics.core.SystemMetricsCollector
    public boolean getSnapshot(TimeMetrics timeMetrics) {
        Utilities.checkNotNull(timeMetrics, "Null value passed to getSnapshot!");
        timeMetrics.realtimeMs = SystemClock.elapsedRealtime();
        timeMetrics.uptimeMs = SystemClock.uptimeMillis();
        return true;
    }

    @Override // com.facebook.battery.metrics.core.SystemMetricsCollector
    public TimeMetrics createMetrics() {
        return new TimeMetrics();
    }
}
