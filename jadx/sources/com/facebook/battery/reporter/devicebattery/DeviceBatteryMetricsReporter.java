package com.facebook.battery.reporter.devicebattery;

import com.facebook.battery.metrics.devicebattery.DeviceBatteryMetrics;
import com.facebook.battery.reporter.core.SystemMetricsReporter;

/* loaded from: classes2.dex */
public class DeviceBatteryMetricsReporter implements SystemMetricsReporter<DeviceBatteryMetrics> {
    @Override // com.facebook.battery.reporter.core.SystemMetricsReporter
    public void reportTo(DeviceBatteryMetrics deviceBatteryMetrics, SystemMetricsReporter.Event event) {
        event.add("battery_pct", deviceBatteryMetrics.batteryLevelPct);
        event.add("battery_realtime_ms", deviceBatteryMetrics.batteryRealtimeMs);
        event.add("charging_realtime_ms", deviceBatteryMetrics.chargingRealtimeMs);
    }
}
