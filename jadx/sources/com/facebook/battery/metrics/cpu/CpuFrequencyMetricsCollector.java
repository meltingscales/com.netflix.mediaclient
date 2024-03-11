package com.facebook.battery.metrics.cpu;

import android.util.SparseIntArray;
import com.facebook.battery.metrics.core.SystemMetricsCollector;
import com.facebook.battery.metrics.core.Utilities;
import com.facebook.battery.metrics.cpu.ProcFileReader;
import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes2.dex */
public class CpuFrequencyMetricsCollector extends SystemMetricsCollector<CpuFrequencyMetrics> {
    static int sCoresForTest = -1;
    private ProcFileReader[] mFiles;

    @Override // com.facebook.battery.metrics.core.SystemMetricsCollector
    public boolean getSnapshot(CpuFrequencyMetrics cpuFrequencyMetrics) {
        Utilities.checkNotNull(cpuFrequencyMetrics, "Null value passed to getSnapshot!");
        int totalCores = getTotalCores();
        boolean z = false;
        for (int i = 0; i < totalCores; i++) {
            z |= readCoreStats(cpuFrequencyMetrics.timeInStateS[i], getReader(i));
        }
        return z;
    }

    protected String getPath(int i) {
        return "/sys/devices/system/cpu/cpu" + i + "/cpufreq/stats/time_in_state";
    }

    private ProcFileReader getReader(int i) {
        ProcFileReader procFileReader;
        synchronized (this) {
            if (this.mFiles == null) {
                this.mFiles = new ProcFileReader[getTotalCores()];
            }
            ProcFileReader[] procFileReaderArr = this.mFiles;
            ProcFileReader procFileReader2 = procFileReaderArr[i];
            if (procFileReader2 == null) {
                procFileReaderArr[i] = new ProcFileReader(getPath(i)).start();
            } else {
                procFileReader2.reset();
            }
            procFileReader = this.mFiles[i];
        }
        return procFileReader;
    }

    private boolean readCoreStats(SparseIntArray sparseIntArray, ProcFileReader procFileReader) {
        synchronized (this) {
            sparseIntArray.clear();
            if (procFileReader.isValid()) {
                while (procFileReader.hasNext()) {
                    try {
                        long readNumber = procFileReader.readNumber();
                        procFileReader.skipSpaces();
                        procFileReader.skipLines();
                        sparseIntArray.put((int) readNumber, (int) (procFileReader.readNumber() / CpuMetricsCollector.getClockTicksPerSecond()));
                    } catch (ProcFileReader.ParseException unused) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
    }

    @Override // com.facebook.battery.metrics.core.SystemMetricsCollector
    public CpuFrequencyMetrics createMetrics() {
        return new CpuFrequencyMetrics();
    }

    public static int getTotalCores() {
        return Initializer.CORES;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class Initializer {
        public static final int CORES;

        static {
            int i = CpuFrequencyMetricsCollector.sCoresForTest;
            if (i <= 0 && (i = (int) Sysconf.getScNProcessorsConf(-1L)) < 0) {
                i = getProcessorCountFromProc();
            }
            CORES = i;
        }

        private static int getProcessorCountFromProc() {
            File file = new File("/sys/devices/system/cpu/");
            if (file.exists() && file.isDirectory()) {
                return file.listFiles(new FilenameFilter() { // from class: com.facebook.battery.metrics.cpu.CpuFrequencyMetricsCollector.Initializer.1
                    @Override // java.io.FilenameFilter
                    public boolean accept(File file2, String str) {
                        return str.matches("cpu\\d+");
                    }
                }).length;
            }
            return 0;
        }
    }
}
