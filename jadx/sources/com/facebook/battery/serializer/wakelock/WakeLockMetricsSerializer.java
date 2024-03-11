package com.facebook.battery.serializer.wakelock;

import com.facebook.battery.metrics.wakelock.WakeLockMetrics;
import com.facebook.battery.serializer.core.SystemMetricsSerializer;
import java.io.DataInput;
import java.io.DataOutput;

/* loaded from: classes2.dex */
public class WakeLockMetricsSerializer extends SystemMetricsSerializer<WakeLockMetrics> {
    @Override // com.facebook.battery.serializer.core.SystemMetricsSerializer
    public void serializeContents(WakeLockMetrics wakeLockMetrics, DataOutput dataOutput) {
        dataOutput.writeLong(wakeLockMetrics.heldTimeMs);
        dataOutput.writeLong(wakeLockMetrics.acquiredCount);
        dataOutput.writeBoolean(wakeLockMetrics.isAttributionEnabled);
        if (wakeLockMetrics.isAttributionEnabled) {
            int size = wakeLockMetrics.tagTimeMs.size();
            dataOutput.writeInt(size);
            for (int i = 0; i < size; i++) {
                String keyAt = wakeLockMetrics.tagTimeMs.keyAt(i);
                long longValue = wakeLockMetrics.tagTimeMs.valueAt(i).longValue();
                dataOutput.writeInt(keyAt.length());
                dataOutput.writeChars(keyAt);
                dataOutput.writeLong(longValue);
            }
        }
    }

    @Override // com.facebook.battery.serializer.core.SystemMetricsSerializer
    public boolean deserializeContents(WakeLockMetrics wakeLockMetrics, DataInput dataInput) {
        wakeLockMetrics.tagTimeMs.clear();
        wakeLockMetrics.heldTimeMs = dataInput.readLong();
        wakeLockMetrics.acquiredCount = dataInput.readLong();
        boolean readBoolean = dataInput.readBoolean();
        wakeLockMetrics.isAttributionEnabled = readBoolean;
        if (readBoolean) {
            int readInt = dataInput.readInt();
            for (int i = 0; i < readInt; i++) {
                int readInt2 = dataInput.readInt();
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < readInt2; i2++) {
                    sb.append(dataInput.readChar());
                }
                wakeLockMetrics.tagTimeMs.put(sb.toString(), Long.valueOf(dataInput.readLong()));
            }
            return true;
        }
        return true;
    }
}
