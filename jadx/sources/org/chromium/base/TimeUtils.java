package org.chromium.base;

import android.os.SystemClock;

/* loaded from: classes5.dex */
public class TimeUtils {
    static FakeClock sFakeClock;

    /* loaded from: classes5.dex */
    interface FakeClock {
        long elapsedRealtimeNanos();
    }

    public static long elapsedRealtimeMillis() {
        FakeClock fakeClock = sFakeClock;
        if (fakeClock != null) {
            return fakeClock.elapsedRealtimeNanos() / 1000000;
        }
        return SystemClock.elapsedRealtime();
    }
}
