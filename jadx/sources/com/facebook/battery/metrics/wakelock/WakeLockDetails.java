package com.facebook.battery.metrics.wakelock;

import android.os.PowerManager;
import android.os.SystemClock;
import com.facebook.battery.metrics.core.SystemMetricsLogger;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
class WakeLockDetails {
    private long mAcquireTimeMs;
    private long mHeldTimeMs;
    private boolean mIsHeld;
    private boolean mIsReferenceCounted;
    private long mLastReleasedMs;
    private int mReferences;
    private long mTimeoutTimeMs;
    public final String tag;
    public final WeakReference<PowerManager.WakeLock> wakeLockReference;

    private boolean releaseAtTime(long j) {
        if (this.mIsHeld) {
            if (this.mIsReferenceCounted) {
                int i = this.mReferences - 1;
                this.mReferences = i;
                if (i != 0) {
                    return false;
                }
            }
            this.mLastReleasedMs = j;
            this.mHeldTimeMs += j - this.mAcquireTimeMs;
            this.mTimeoutTimeMs = Long.MAX_VALUE;
            this.mIsHeld = false;
            return true;
        }
        return false;
    }

    public long getLastReleaseTimeMs() {
        return this.mLastReleasedMs;
    }

    public boolean isHeld() {
        return this.mIsHeld;
    }

    public boolean applyAutomaticReleases() {
        return applyTimeouts() || applyFinalize();
    }

    private boolean applyTimeouts() {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.mTimeoutTimeMs;
        if (uptimeMillis >= j) {
            return releaseAtTime(j);
        }
        return false;
    }

    private boolean applyFinalize() {
        if (this.mIsHeld && this.wakeLockReference.get() == null) {
            SystemMetricsLogger.wtf("WakeLockMetricsCollector", "The wakelock " + this.tag + " was garbage collected before being released.");
            return releaseAtTime(SystemClock.uptimeMillis());
        }
        return false;
    }

    public long getHeldTimeMs() {
        return this.mHeldTimeMs + (this.mIsHeld ? SystemClock.uptimeMillis() - this.mAcquireTimeMs : 0L);
    }
}
