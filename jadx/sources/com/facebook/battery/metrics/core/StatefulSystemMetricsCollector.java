package com.facebook.battery.metrics.core;

import com.facebook.battery.metrics.core.SystemMetrics;
import com.facebook.battery.metrics.core.SystemMetricsCollector;

/* loaded from: classes2.dex */
public class StatefulSystemMetricsCollector<R extends SystemMetrics<R>, S extends SystemMetricsCollector<R>> {
    private final S mCollector;
    private R mCurr;
    private final R mDiff;
    private boolean mIsValid;
    private R mPrev;

    public StatefulSystemMetricsCollector(S s) {
        this(s, s.createMetrics(), s.createMetrics(), s.createMetrics());
        this.mIsValid = s.getSnapshot(this.mPrev) & this.mIsValid;
    }

    public StatefulSystemMetricsCollector(S s, R r, R r2, R r3) {
        this.mIsValid = true;
        this.mCollector = s;
        this.mCurr = r;
        this.mPrev = r2;
        this.mDiff = r3;
    }

    public R getLatestDiffAndReset() {
        if (getLatestDiff() == null) {
            return null;
        }
        R r = this.mPrev;
        this.mPrev = this.mCurr;
        this.mCurr = r;
        return this.mDiff;
    }

    public R getLatestDiff() {
        boolean snapshot = this.mIsValid & this.mCollector.getSnapshot(this.mCurr);
        this.mIsValid = snapshot;
        if (snapshot) {
            this.mCurr.diff(this.mPrev, this.mDiff);
            return this.mDiff;
        }
        return null;
    }
}
