package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzaw {
    private static final long zza = TimeUnit.MINUTES.toMillis(1);
    private static final Object zzb = new Object();
    private static WakeLock zzc;

    public static ComponentName zza(Context context, Intent intent) {
        synchronized (zzb) {
            if (zzc == null) {
                WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                zzc = wakeLock;
                wakeLock.setReferenceCounted(true);
            }
            boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
            zza(intent, true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!booleanExtra) {
                zzc.acquire(zza);
            }
            return startService;
        }
    }

    private static void zza(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    public static void zza(Intent intent) {
        synchronized (zzb) {
            if (zzc != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                zza(intent, false);
                zzc.release();
            }
        }
    }
}
