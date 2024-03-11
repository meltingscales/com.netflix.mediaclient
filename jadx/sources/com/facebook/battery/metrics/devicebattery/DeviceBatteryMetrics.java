package com.facebook.battery.metrics.devicebattery;

import com.facebook.battery.metrics.core.SystemMetrics;

/* loaded from: classes2.dex */
public class DeviceBatteryMetrics extends SystemMetrics<DeviceBatteryMetrics> {
    public float batteryLevelPct;
    public long batteryRealtimeMs;
    public long chargingRealtimeMs;

    @Override // com.facebook.battery.metrics.core.SystemMetrics
    public DeviceBatteryMetrics set(DeviceBatteryMetrics deviceBatteryMetrics) {
        this.batteryLevelPct = deviceBatteryMetrics.batteryLevelPct;
        this.batteryRealtimeMs = deviceBatteryMetrics.batteryRealtimeMs;
        this.chargingRealtimeMs = deviceBatteryMetrics.chargingRealtimeMs;
        return this;
    }

    @Override // com.facebook.battery.metrics.core.SystemMetrics
    public DeviceBatteryMetrics diff(DeviceBatteryMetrics deviceBatteryMetrics, DeviceBatteryMetrics deviceBatteryMetrics2) {
        if (deviceBatteryMetrics2 == null) {
            deviceBatteryMetrics2 = new DeviceBatteryMetrics();
        }
        if (deviceBatteryMetrics == null) {
            deviceBatteryMetrics2.set(this);
        } else {
            deviceBatteryMetrics2.batteryLevelPct = this.batteryLevelPct - deviceBatteryMetrics.batteryLevelPct;
            deviceBatteryMetrics2.batteryRealtimeMs = this.batteryRealtimeMs - deviceBatteryMetrics.batteryRealtimeMs;
            deviceBatteryMetrics2.chargingRealtimeMs = this.chargingRealtimeMs - deviceBatteryMetrics.chargingRealtimeMs;
        }
        return deviceBatteryMetrics2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeviceBatteryMetrics deviceBatteryMetrics = (DeviceBatteryMetrics) obj;
        return this.batteryLevelPct == deviceBatteryMetrics.batteryLevelPct && this.batteryRealtimeMs == deviceBatteryMetrics.batteryRealtimeMs && this.chargingRealtimeMs == deviceBatteryMetrics.chargingRealtimeMs;
    }

    public int hashCode() {
        float f = this.batteryLevelPct;
        int floatToIntBits = f != 0.0f ? Float.floatToIntBits(f) : 0;
        long j = this.batteryRealtimeMs;
        long j2 = this.chargingRealtimeMs;
        return (((floatToIntBits * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2));
    }

    public String toString() {
        return "DeviceBatteryMetrics{batteryLevelPct=" + this.batteryLevelPct + ", batteryRealtimeMs=" + this.batteryRealtimeMs + ", chargingRealtimeMs=" + this.chargingRealtimeMs + '}';
    }
}
