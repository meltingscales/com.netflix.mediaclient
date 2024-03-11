package com.facebook.battery.reporter.cpu;

import com.facebook.battery.metrics.cpu.CpuMetrics;
import com.facebook.battery.reporter.core.SystemMetricsReporter;

/* loaded from: classes2.dex */
public class CpuMetricsReporter implements SystemMetricsReporter<CpuMetrics> {
    @Override // com.facebook.battery.reporter.core.SystemMetricsReporter
    public void reportTo(CpuMetrics cpuMetrics, SystemMetricsReporter.Event event) {
        double d = cpuMetrics.userTimeS;
        if (d != 0.0d) {
            event.add("cpu_user_time_s", d);
        }
        double d2 = cpuMetrics.systemTimeS;
        if (d2 != 0.0d) {
            event.add("cpu_system_time_s", d2);
        }
        double d3 = cpuMetrics.childUserTimeS;
        if (d3 != 0.0d) {
            event.add("child_cpu_user_time_s", d3);
        }
        double d4 = cpuMetrics.childSystemTimeS;
        if (d4 != 0.0d) {
            event.add("child_cpu_system_time_s", d4);
        }
    }
}
