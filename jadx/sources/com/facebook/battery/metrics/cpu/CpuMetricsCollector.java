package com.facebook.battery.metrics.cpu;

import android.os.StrictMode;
import com.facebook.battery.metrics.core.SystemMetricsCollector;
import com.facebook.battery.metrics.core.SystemMetricsLogger;
import com.facebook.battery.metrics.core.Utilities;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes2.dex */
public class CpuMetricsCollector extends SystemMetricsCollector<CpuMetrics> {
    private final ThreadLocal<CpuMetrics> mLastSnapshot = new ThreadLocal<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class Initializer {
        static final long CLOCK_TICKS_PER_SECOND = Sysconf.getScClkTck(100);
    }

    @Override // com.facebook.battery.metrics.core.SystemMetricsCollector
    public boolean getSnapshot(CpuMetrics cpuMetrics) {
        Utilities.checkNotNull(cpuMetrics, "Null value passed to getSnapshot!");
        String readProcFile = readProcFile();
        String[] split = readProcFile != null ? readProcFile.split(" ", 18) : null;
        if (split != null && split.length >= 17) {
            try {
                cpuMetrics.userTimeS = readFieldAsS(split[13]);
                cpuMetrics.systemTimeS = readFieldAsS(split[14]);
                cpuMetrics.childUserTimeS = readFieldAsS(split[15]);
                cpuMetrics.childSystemTimeS = readFieldAsS(split[16]);
                if (this.mLastSnapshot.get() == null) {
                    this.mLastSnapshot.set(new CpuMetrics());
                }
                CpuMetrics cpuMetrics2 = this.mLastSnapshot.get();
                if (Double.compare(cpuMetrics.userTimeS, cpuMetrics2.userTimeS) < 0 || Double.compare(cpuMetrics.systemTimeS, cpuMetrics2.systemTimeS) < 0 || Double.compare(cpuMetrics.childUserTimeS, cpuMetrics2.childUserTimeS) < 0 || Double.compare(cpuMetrics.childSystemTimeS, cpuMetrics2.childSystemTimeS) < 0) {
                    SystemMetricsLogger.wtf("CpuMetricsCollector", "Cpu Time Decreased from " + cpuMetrics2.toString() + " to " + cpuMetrics.toString());
                    return false;
                }
                cpuMetrics2.set(cpuMetrics);
                return true;
            } catch (NumberFormatException e) {
                SystemMetricsLogger.wtf("CpuMetricsCollector", "Unable to parse CPU time field", e);
            }
        }
        return false;
    }

    @Override // com.facebook.battery.metrics.core.SystemMetricsCollector
    public CpuMetrics createMetrics() {
        return new CpuMetrics();
    }

    protected String readProcFile() {
        RandomAccessFile randomAccessFile;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        RandomAccessFile randomAccessFile2 = null;
        try {
            randomAccessFile = new RandomAccessFile("/proc/self/stat", "r");
        } catch (IOException unused) {
            randomAccessFile = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            String readLine = randomAccessFile.readLine();
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return readLine;
        } catch (IOException unused3) {
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException unused4) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return null;
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (IOException unused5) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    private static double readFieldAsS(String str) {
        return (Long.parseLong(str) * 1.0d) / getClockTicksPerSecond();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long getClockTicksPerSecond() {
        return Initializer.CLOCK_TICKS_PER_SECOND;
    }
}
