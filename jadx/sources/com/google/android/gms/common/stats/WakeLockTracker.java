package com.google.android.gms.common.stats;

import android.content.Context;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public class WakeLockTracker {
    private static final WakeLockTracker zza = new WakeLockTracker();

    public static WakeLockTracker getInstance() {
        return zza;
    }

    public void registerEvent(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list) {
    }

    public void registerEvent(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list, long j) {
    }
}
