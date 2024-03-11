package com.facebook.battery.serializer.cpu;

import com.facebook.battery.metrics.cpu.CpuMetrics;
import com.facebook.battery.serializer.core.SystemMetricsSerializer;
import java.io.DataInput;
import java.io.DataOutput;

/* loaded from: classes2.dex */
public class CpuMetricsSerializer extends SystemMetricsSerializer<CpuMetrics> {
    @Override // com.facebook.battery.serializer.core.SystemMetricsSerializer
    public void serializeContents(CpuMetrics cpuMetrics, DataOutput dataOutput) {
        dataOutput.writeDouble(cpuMetrics.userTimeS);
        dataOutput.writeDouble(cpuMetrics.systemTimeS);
        dataOutput.writeDouble(cpuMetrics.childUserTimeS);
        dataOutput.writeDouble(cpuMetrics.childSystemTimeS);
    }

    @Override // com.facebook.battery.serializer.core.SystemMetricsSerializer
    public boolean deserializeContents(CpuMetrics cpuMetrics, DataInput dataInput) {
        cpuMetrics.userTimeS = dataInput.readDouble();
        cpuMetrics.systemTimeS = dataInput.readDouble();
        cpuMetrics.childUserTimeS = dataInput.readDouble();
        cpuMetrics.childSystemTimeS = dataInput.readDouble();
        return true;
    }
}
