package com.facebook.battery.metrics.cpu;

import com.facebook.battery.metrics.core.SystemMetrics;

/* loaded from: classes2.dex */
public class CpuMetrics extends SystemMetrics<CpuMetrics> {
    public double childSystemTimeS;
    public double childUserTimeS;
    public double systemTimeS;
    public double userTimeS;

    @Override // com.facebook.battery.metrics.core.SystemMetrics
    public CpuMetrics set(CpuMetrics cpuMetrics) {
        this.userTimeS = cpuMetrics.userTimeS;
        this.systemTimeS = cpuMetrics.systemTimeS;
        this.childUserTimeS = cpuMetrics.childUserTimeS;
        this.childSystemTimeS = cpuMetrics.childSystemTimeS;
        return this;
    }

    @Override // com.facebook.battery.metrics.core.SystemMetrics
    public CpuMetrics diff(CpuMetrics cpuMetrics, CpuMetrics cpuMetrics2) {
        if (cpuMetrics2 == null) {
            cpuMetrics2 = new CpuMetrics();
        }
        if (cpuMetrics == null) {
            cpuMetrics2.set(this);
        } else {
            cpuMetrics2.systemTimeS = this.systemTimeS - cpuMetrics.systemTimeS;
            cpuMetrics2.userTimeS = this.userTimeS - cpuMetrics.userTimeS;
            cpuMetrics2.childSystemTimeS = this.childSystemTimeS - cpuMetrics.childSystemTimeS;
            cpuMetrics2.childUserTimeS = this.childUserTimeS - cpuMetrics.childUserTimeS;
        }
        return cpuMetrics2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CpuMetrics cpuMetrics = (CpuMetrics) obj;
        return Double.compare(cpuMetrics.systemTimeS, this.systemTimeS) == 0 && Double.compare(cpuMetrics.userTimeS, this.userTimeS) == 0 && Double.compare(cpuMetrics.childSystemTimeS, this.childSystemTimeS) == 0 && Double.compare(cpuMetrics.childUserTimeS, this.childUserTimeS) == 0;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.systemTimeS);
        long doubleToLongBits2 = Double.doubleToLongBits(this.userTimeS);
        int i = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = Double.doubleToLongBits(this.childSystemTimeS);
        long doubleToLongBits4 = Double.doubleToLongBits(this.childUserTimeS);
        return (((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + i) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) ((doubleToLongBits4 >>> 32) ^ doubleToLongBits4));
    }

    public String toString() {
        return "CpuMetrics{userTimeS=" + this.userTimeS + ", systemTimeS=" + this.systemTimeS + ", childUserTimeS=" + this.childUserTimeS + ", childSystemTimeS=" + this.childSystemTimeS + '}';
    }
}
