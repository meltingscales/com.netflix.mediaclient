package com.facebook.battery.metrics.wakelock;

import androidx.collection.SimpleArrayMap;
import com.facebook.battery.metrics.core.SystemMetrics;
import com.facebook.battery.metrics.core.SystemMetricsLogger;
import com.facebook.battery.metrics.core.Utilities;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class WakeLockMetrics extends SystemMetrics<WakeLockMetrics> {
    public long acquiredCount;
    public long heldTimeMs;
    public boolean isAttributionEnabled;
    public final SimpleArrayMap<String, Long> tagTimeMs;

    public WakeLockMetrics() {
        this(false);
    }

    public WakeLockMetrics(boolean z) {
        this.tagTimeMs = new SimpleArrayMap<>();
        this.isAttributionEnabled = z;
    }

    @Override // com.facebook.battery.metrics.core.SystemMetrics
    public WakeLockMetrics diff(WakeLockMetrics wakeLockMetrics, WakeLockMetrics wakeLockMetrics2) {
        if (wakeLockMetrics2 == null) {
            wakeLockMetrics2 = new WakeLockMetrics(this.isAttributionEnabled);
        }
        if (wakeLockMetrics == null) {
            wakeLockMetrics2.set(this);
        } else {
            wakeLockMetrics2.heldTimeMs = this.heldTimeMs - wakeLockMetrics.heldTimeMs;
            wakeLockMetrics2.acquiredCount = this.acquiredCount - wakeLockMetrics.acquiredCount;
            if (wakeLockMetrics2.isAttributionEnabled) {
                wakeLockMetrics2.tagTimeMs.clear();
                int size = this.tagTimeMs.size();
                for (int i = 0; i < size; i++) {
                    String keyAt = this.tagTimeMs.keyAt(i);
                    Long l = wakeLockMetrics.tagTimeMs.get(keyAt);
                    long longValue = this.tagTimeMs.valueAt(i).longValue() - (l == null ? 0L : l.longValue());
                    if (longValue != 0) {
                        wakeLockMetrics2.tagTimeMs.put(keyAt, Long.valueOf(longValue));
                    }
                }
            }
        }
        return wakeLockMetrics2;
    }

    @Override // com.facebook.battery.metrics.core.SystemMetrics
    public WakeLockMetrics set(WakeLockMetrics wakeLockMetrics) {
        this.heldTimeMs = wakeLockMetrics.heldTimeMs;
        this.acquiredCount = wakeLockMetrics.acquiredCount;
        if (wakeLockMetrics.isAttributionEnabled && this.isAttributionEnabled) {
            this.tagTimeMs.clear();
            this.tagTimeMs.putAll(wakeLockMetrics.tagTimeMs);
        }
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WakeLockMetrics wakeLockMetrics = (WakeLockMetrics) obj;
        if (this.isAttributionEnabled == wakeLockMetrics.isAttributionEnabled && this.heldTimeMs == wakeLockMetrics.heldTimeMs && this.acquiredCount == wakeLockMetrics.acquiredCount) {
            return Utilities.simpleArrayMapEquals(this.tagTimeMs, wakeLockMetrics.tagTimeMs);
        }
        return false;
    }

    public int hashCode() {
        boolean z = this.isAttributionEnabled;
        int hashCode = this.tagTimeMs.hashCode();
        long j = this.heldTimeMs;
        long j2 = this.acquiredCount;
        return ((((((z ? 1 : 0) * 31) + hashCode) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2));
    }

    public String toString() {
        return "WakeLockMetrics{isAttributionEnabled=" + this.isAttributionEnabled + ", tagTimeMs=" + this.tagTimeMs + ", heldTimeMs=" + this.heldTimeMs + ", acquiredCount=" + this.acquiredCount + '}';
    }

    public JSONObject attributionToJSONObject() {
        if (this.isAttributionEnabled) {
            try {
                JSONObject jSONObject = new JSONObject();
                int size = this.tagTimeMs.size();
                for (int i = 0; i < size; i++) {
                    long longValue = this.tagTimeMs.valueAt(i).longValue();
                    if (longValue > 0) {
                        jSONObject.put(this.tagTimeMs.keyAt(i), longValue);
                    }
                }
                return jSONObject;
            } catch (JSONException e) {
                SystemMetricsLogger.wtf("WakeLockMetrics", "Failed to serialize attribution data", e);
                return null;
            }
        }
        return null;
    }
}
