package com.facebook.battery.serializer.time;

import com.facebook.battery.metrics.time.TimeMetrics;
import com.facebook.battery.serializer.core.SystemMetricsSerializer;
import java.io.DataInput;
import java.io.DataOutput;

/* loaded from: classes2.dex */
public class TimeMetricsSerializer extends SystemMetricsSerializer<TimeMetrics> {
    @Override // com.facebook.battery.serializer.core.SystemMetricsSerializer
    public void serializeContents(TimeMetrics timeMetrics, DataOutput dataOutput) {
        dataOutput.writeLong(timeMetrics.realtimeMs);
        dataOutput.writeLong(timeMetrics.uptimeMs);
    }

    @Override // com.facebook.battery.serializer.core.SystemMetricsSerializer
    public boolean deserializeContents(TimeMetrics timeMetrics, DataInput dataInput) {
        timeMetrics.realtimeMs = dataInput.readLong();
        timeMetrics.uptimeMs = dataInput.readLong();
        return true;
    }
}
