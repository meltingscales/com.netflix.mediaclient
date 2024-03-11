package com.facebook.battery.reporter.cpu;

import com.facebook.battery.metrics.cpu.CpuFrequencyMetrics;
import com.facebook.battery.reporter.core.SystemMetricsReporter;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class CpuFrequencyMetricsReporter implements SystemMetricsReporter<CpuFrequencyMetrics> {
    @Override // com.facebook.battery.reporter.core.SystemMetricsReporter
    public void reportTo(CpuFrequencyMetrics cpuFrequencyMetrics, SystemMetricsReporter.Event event) {
        JSONObject jSONObject = cpuFrequencyMetrics.toJSONObject();
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        event.add("cpu_time_in_state_s", jSONObject.toString());
    }
}
