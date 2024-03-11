package com.facebook.battery.metrics.cpu;

import android.util.SparseIntArray;
import com.facebook.battery.metrics.core.SystemMetrics;
import com.facebook.battery.metrics.core.SystemMetricsLogger;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class CpuFrequencyMetrics extends SystemMetrics<CpuFrequencyMetrics> {
    public final SparseIntArray[] timeInStateS;

    public CpuFrequencyMetrics() {
        int totalCores = CpuFrequencyMetricsCollector.getTotalCores();
        this.timeInStateS = new SparseIntArray[totalCores];
        for (int i = 0; i < totalCores; i++) {
            this.timeInStateS[i] = new SparseIntArray(0);
        }
    }

    @Override // com.facebook.battery.metrics.core.SystemMetrics
    public CpuFrequencyMetrics diff(CpuFrequencyMetrics cpuFrequencyMetrics, CpuFrequencyMetrics cpuFrequencyMetrics2) {
        if (cpuFrequencyMetrics2 == null) {
            cpuFrequencyMetrics2 = new CpuFrequencyMetrics();
        }
        if (cpuFrequencyMetrics != null) {
            int i = 0;
            while (true) {
                SparseIntArray[] sparseIntArrayArr = this.timeInStateS;
                if (i >= sparseIntArrayArr.length) {
                    break;
                }
                SparseIntArray sparseIntArray = sparseIntArrayArr[i];
                SparseIntArray sparseIntArray2 = cpuFrequencyMetrics.timeInStateS[i];
                SparseIntArray sparseIntArray3 = cpuFrequencyMetrics2.timeInStateS[i];
                int size = sparseIntArray.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        int keyAt = sparseIntArray.keyAt(i2);
                        int valueAt = sparseIntArray.valueAt(i2) - sparseIntArray2.get(keyAt, 0);
                        if (valueAt >= 0) {
                            sparseIntArray3.put(keyAt, valueAt);
                            i2++;
                        } else {
                            copyArrayInto(sparseIntArray, sparseIntArray3);
                            break;
                        }
                    }
                }
                i++;
            }
        } else {
            cpuFrequencyMetrics2.set(this);
        }
        return cpuFrequencyMetrics2;
    }

    @Override // com.facebook.battery.metrics.core.SystemMetrics
    public CpuFrequencyMetrics set(CpuFrequencyMetrics cpuFrequencyMetrics) {
        int i = 0;
        while (true) {
            SparseIntArray[] sparseIntArrayArr = this.timeInStateS;
            if (i >= sparseIntArrayArr.length) {
                return this;
            }
            copyArrayInto(cpuFrequencyMetrics.timeInStateS[i], sparseIntArrayArr[i]);
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CpuFrequencyMetrics cpuFrequencyMetrics = (CpuFrequencyMetrics) obj;
        SparseIntArray[] sparseIntArrayArr = this.timeInStateS;
        if (sparseIntArrayArr.length != cpuFrequencyMetrics.timeInStateS.length) {
            return false;
        }
        int length = sparseIntArrayArr.length;
        for (int i = 0; i < length; i++) {
            if (!sparseIntArrayEquals(this.timeInStateS[i], cpuFrequencyMetrics.timeInStateS[i])) {
                return false;
            }
        }
        return true;
    }

    private static void copyArrayInto(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2) {
        sparseIntArray2.clear();
        for (int i = 0; i < sparseIntArray.size(); i++) {
            sparseIntArray2.append(sparseIntArray.keyAt(i), sparseIntArray.valueAt(i));
        }
    }

    public static boolean sparseIntArrayEquals(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2) {
        if (sparseIntArray == sparseIntArray2) {
            return true;
        }
        int size = sparseIntArray.size();
        if (size != sparseIntArray2.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (sparseIntArray.keyAt(i) != sparseIntArray2.keyAt(i) || sparseIntArray.valueAt(i) != sparseIntArray2.valueAt(i)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            SparseIntArray[] sparseIntArrayArr = this.timeInStateS;
            if (i >= sparseIntArrayArr.length) {
                return i2;
            }
            SparseIntArray sparseIntArray = sparseIntArrayArr[i];
            int size = sparseIntArray.size();
            for (int i3 = 0; i3 < size; i3++) {
                i2 += sparseIntArray.keyAt(i3) ^ sparseIntArray.valueAt(i3);
            }
            i++;
        }
    }

    public String toString() {
        return "CpuFrequencyMetrics{timeInStateS=" + Arrays.toString(this.timeInStateS) + '}';
    }

    public JSONObject toJSONObject() {
        SparseIntArray[] sparseIntArrayArr = this.timeInStateS;
        if (sparseIntArrayArr.length == 0) {
            return null;
        }
        boolean[] zArr = new boolean[sparseIntArrayArr.length];
        JSONObject jSONObject = new JSONObject();
        int length = this.timeInStateS.length;
        for (int i = 0; i < length; i++) {
            SparseIntArray sparseIntArray = this.timeInStateS[i];
            if (sparseIntArray.size() != 0 && !zArr[i]) {
                int i2 = 1 << i;
                for (int i3 = i + 1; i3 < length; i3++) {
                    if (sparseIntArrayEquals(sparseIntArray, this.timeInStateS[i3])) {
                        i2 |= 1 << i3;
                        zArr[i3] = true;
                    }
                }
                try {
                    jSONObject.put(Integer.toHexString(i2), convert(sparseIntArray));
                } catch (JSONException e) {
                    SystemMetricsLogger.wtf("CpuFrequencyMetricsReporter", "Unable to store event", e);
                }
            }
        }
        return jSONObject;
    }

    private static JSONObject convert(SparseIntArray sparseIntArray) {
        JSONObject jSONObject = new JSONObject();
        int size = sparseIntArray.size();
        for (int i = 0; i < size; i++) {
            jSONObject.put(Integer.toString(sparseIntArray.keyAt(i)), sparseIntArray.valueAt(i));
        }
        return jSONObject;
    }
}
