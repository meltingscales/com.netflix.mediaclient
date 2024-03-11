package com.facebook.battery.reporter.wakelock;

import com.facebook.battery.metrics.wakelock.WakeLockMetrics;
import com.facebook.battery.reporter.core.SystemMetricsReporter;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class WakeLockMetricsReporter implements SystemMetricsReporter<WakeLockMetrics> {
    private boolean mShouldReportAttribution = true;

    @Override // com.facebook.battery.reporter.core.SystemMetricsReporter
    public void reportTo(WakeLockMetrics wakeLockMetrics, SystemMetricsReporter.Event event) {
        JSONObject attributionToJSONObject;
        long j = wakeLockMetrics.heldTimeMs;
        if (j != 0) {
            event.add("wakelock_held_time_ms", j);
        }
        long j2 = wakeLockMetrics.acquiredCount;
        if (j2 != 0) {
            event.add("wakelock_acquired_count", j2);
        }
        if (!this.mShouldReportAttribution || (attributionToJSONObject = wakeLockMetrics.attributionToJSONObject()) == null) {
            return;
        }
        event.add("wakelock_tag_time_ms", attributionToJSONObject.toString());
    }
}
