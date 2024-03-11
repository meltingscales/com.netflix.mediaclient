package com.facebook.battery.serializer.cpu;

import android.util.SparseIntArray;
import com.facebook.battery.metrics.cpu.CpuFrequencyMetrics;
import com.facebook.battery.serializer.core.SystemMetricsSerializer;
import java.io.DataInput;
import java.io.DataOutput;

/* loaded from: classes2.dex */
public class CpuFrequencyMetricsSerializer extends SystemMetricsSerializer<CpuFrequencyMetrics> {
    @Override // com.facebook.battery.serializer.core.SystemMetricsSerializer
    public void serializeContents(CpuFrequencyMetrics cpuFrequencyMetrics, DataOutput dataOutput) {
        SparseIntArray[] sparseIntArrayArr = cpuFrequencyMetrics.timeInStateS;
        int length = sparseIntArrayArr.length;
        dataOutput.writeInt(sparseIntArrayArr.length);
        for (int i = 0; i < length; i++) {
            SparseIntArray sparseIntArray = cpuFrequencyMetrics.timeInStateS[i];
            int size = sparseIntArray.size();
            dataOutput.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                dataOutput.writeInt(sparseIntArray.keyAt(i2));
                dataOutput.writeInt(sparseIntArray.valueAt(i2));
            }
        }
    }

    @Override // com.facebook.battery.serializer.core.SystemMetricsSerializer
    public boolean deserializeContents(CpuFrequencyMetrics cpuFrequencyMetrics, DataInput dataInput) {
        int readInt = dataInput.readInt();
        if (cpuFrequencyMetrics.timeInStateS.length != readInt) {
            return false;
        }
        for (int i = 0; i < readInt; i++) {
            int readInt2 = dataInput.readInt();
            for (int i2 = 0; i2 < readInt2; i2++) {
                cpuFrequencyMetrics.timeInStateS[i].put(dataInput.readInt(), dataInput.readInt());
            }
        }
        return true;
    }
}
