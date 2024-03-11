package com.facebook.battery.serializer.devicebattery;

import com.facebook.battery.metrics.devicebattery.DeviceBatteryMetrics;
import com.facebook.battery.serializer.core.SystemMetricsSerializer;
import java.io.DataInput;
import java.io.DataOutput;

/* loaded from: classes2.dex */
public class DeviceBatteryMetricsSerializer extends SystemMetricsSerializer<DeviceBatteryMetrics> {
    @Override // com.facebook.battery.serializer.core.SystemMetricsSerializer
    public void serializeContents(DeviceBatteryMetrics deviceBatteryMetrics, DataOutput dataOutput) {
        dataOutput.writeFloat(deviceBatteryMetrics.batteryLevelPct);
        dataOutput.writeLong(deviceBatteryMetrics.batteryRealtimeMs);
        dataOutput.writeLong(deviceBatteryMetrics.chargingRealtimeMs);
    }

    @Override // com.facebook.battery.serializer.core.SystemMetricsSerializer
    public boolean deserializeContents(DeviceBatteryMetrics deviceBatteryMetrics, DataInput dataInput) {
        deviceBatteryMetrics.batteryLevelPct = dataInput.readFloat();
        deviceBatteryMetrics.batteryRealtimeMs = dataInput.readLong();
        deviceBatteryMetrics.chargingRealtimeMs = dataInput.readLong();
        return true;
    }
}
