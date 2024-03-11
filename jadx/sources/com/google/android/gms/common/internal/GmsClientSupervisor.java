package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class GmsClientSupervisor {
    static HandlerThread zza = null;
    private static final Object zzb = new Object();
    private static zzs zzc = null;
    private static Executor zzd = null;
    private static boolean zze = false;

    public static int getDefaultBindFlags() {
        return 4225;
    }

    public static GmsClientSupervisor getInstance(Context context) {
        Looper mainLooper;
        synchronized (zzb) {
            if (zzc == null) {
                Context applicationContext = context.getApplicationContext();
                if (zze) {
                    mainLooper = getOrStartHandlerThread().getLooper();
                } else {
                    mainLooper = context.getMainLooper();
                }
                zzc = new zzs(applicationContext, mainLooper, zzd);
            }
        }
        return zzc;
    }

    public static HandlerThread getOrStartHandlerThread() {
        synchronized (zzb) {
            HandlerThread handlerThread = zza;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            zza = handlerThread2;
            handlerThread2.start();
            return zza;
        }
    }

    protected abstract void zza(zzo zzoVar, ServiceConnection serviceConnection, String str);

    public final void zzb(String str, String str2, int i, ServiceConnection serviceConnection, String str3, boolean z) {
        zza(new zzo(str, str2, 4225, z), serviceConnection, str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean zzc(zzo zzoVar, ServiceConnection serviceConnection, String str, Executor executor);
}
