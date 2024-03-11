package com.google.android.gms.internal.recaptcha;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class zzaq implements zzan {
    private static final boolean zza = zzb();

    private static boolean zzb() {
        try {
            SystemClock.elapsedRealtimeNanos();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
