package com.facebook.battery.reporter.time;

import com.facebook.battery.metrics.time.TimeMetrics;
import com.facebook.battery.reporter.core.SystemMetricsReporter;

/* loaded from: classes2.dex */
public class TimeMetricsReporter implements SystemMetricsReporter<TimeMetrics> {
    @Override // com.facebook.battery.reporter.core.SystemMetricsReporter
    public void reportTo(TimeMetrics timeMetrics, SystemMetricsReporter.Event event) {
        long j = timeMetrics.realtimeMs;
        if (j != 0) {
            event.add("realtime_ms", j);
        }
        long j2 = timeMetrics.uptimeMs;
        if (j2 != 0) {
            event.add("uptime_ms", j2);
        }
    }
}
