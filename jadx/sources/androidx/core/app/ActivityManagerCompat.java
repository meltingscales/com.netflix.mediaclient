package androidx.core.app;

import android.app.ActivityManager;

/* loaded from: classes2.dex */
public final class ActivityManagerCompat {
    public static boolean isLowRamDevice(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }
}
