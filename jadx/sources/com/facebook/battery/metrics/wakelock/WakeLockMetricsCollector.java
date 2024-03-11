package com.facebook.battery.metrics.wakelock;

import android.os.PowerManager;
import android.os.SystemClock;
import androidx.collection.SimpleArrayMap;
import com.facebook.battery.metrics.core.SystemMetricsCollector;
import com.facebook.battery.metrics.core.Utilities;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class WakeLockMetricsCollector extends SystemMetricsCollector<WakeLockMetrics> {
    private int mActiveWakeLocks;
    private long mTotalWakeLocksAcquired;
    private long mWakeLockAcquireTimeMs;
    private long mWakeLocksHeldTimeMs;
    private final WeakHashMap<PowerManager.WakeLock, WakeLockDetails> mWakeLocks = new WeakHashMap<>();
    private final SimpleArrayMap<String, Long> mPrevWakeLockMs = new SimpleArrayMap<>();
    private final ArrayList<WakeLockDetails> mActiveWakeLockDetails = new ArrayList<>();
    private boolean mIsEnabled = true;

    private void updateWakeLockCounts() {
        synchronized (this) {
            Iterator<WakeLockDetails> it = this.mActiveWakeLockDetails.iterator();
            int i = 0;
            long j = -1;
            while (it.hasNext()) {
                WakeLockDetails next = it.next();
                boolean applyAutomaticReleases = next.applyAutomaticReleases();
                if (next.isHeld()) {
                    i++;
                } else if (applyAutomaticReleases && next.getLastReleaseTimeMs() > j) {
                    j = next.getLastReleaseTimeMs();
                }
                if (next.wakeLockReference.get() == null) {
                    Long l = this.mPrevWakeLockMs.get(next.tag);
                    this.mPrevWakeLockMs.put(next.tag, Long.valueOf((l == null ? 0L : l.longValue()) + next.getHeldTimeMs()));
                    it.remove();
                }
            }
            if (this.mActiveWakeLocks != 0 && i == 0) {
                this.mWakeLocksHeldTimeMs += j - this.mWakeLockAcquireTimeMs;
            }
            this.mActiveWakeLocks = i;
        }
    }

    @Override // com.facebook.battery.metrics.core.SystemMetricsCollector
    public boolean getSnapshot(WakeLockMetrics wakeLockMetrics) {
        synchronized (this) {
            Utilities.checkNotNull(wakeLockMetrics, "Null value passed to getSnapshot!");
            if (this.mIsEnabled) {
                updateWakeLockCounts();
                wakeLockMetrics.acquiredCount = this.mTotalWakeLocksAcquired;
                wakeLockMetrics.heldTimeMs = this.mWakeLocksHeldTimeMs + (this.mActiveWakeLocks > 0 ? SystemClock.uptimeMillis() - this.mWakeLockAcquireTimeMs : 0L);
                if (wakeLockMetrics.isAttributionEnabled) {
                    wakeLockMetrics.tagTimeMs.clear();
                    int size = this.mActiveWakeLockDetails.size();
                    for (int i = 0; i < size; i++) {
                        WakeLockDetails wakeLockDetails = this.mActiveWakeLockDetails.get(i);
                        long heldTimeMs = wakeLockDetails.getHeldTimeMs();
                        String str = wakeLockDetails.tag;
                        Long l = wakeLockMetrics.tagTimeMs.get(str);
                        wakeLockMetrics.tagTimeMs.put(str, Long.valueOf((l == null ? 0L : l.longValue()) + heldTimeMs));
                    }
                    int size2 = this.mPrevWakeLockMs.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        String keyAt = this.mPrevWakeLockMs.keyAt(i2);
                        Long l2 = wakeLockMetrics.tagTimeMs.get(keyAt);
                        wakeLockMetrics.tagTimeMs.put(keyAt, Long.valueOf((l2 == null ? 0L : l2.longValue()) + this.mPrevWakeLockMs.valueAt(i2).longValue()));
                    }
                }
                return true;
            }
            return false;
        }
    }

    @Override // com.facebook.battery.metrics.core.SystemMetricsCollector
    public WakeLockMetrics createMetrics() {
        return new WakeLockMetrics();
    }
}
