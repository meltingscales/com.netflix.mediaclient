package com.google.android.gms.common.stats;

import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;

@Deprecated
/* loaded from: classes2.dex */
public class StatsUtils {
    public static String getEventKey(PowerManager.WakeLock wakeLock, String str) {
        long myPid = Process.myPid();
        long identityHashCode = System.identityHashCode(wakeLock);
        if (true == TextUtils.isEmpty(str)) {
            str = "";
        }
        return String.valueOf(String.valueOf((myPid << 32) | identityHashCode)).concat(String.valueOf(str));
    }
}
