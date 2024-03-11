package com.google.firebase.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzv {
    private static zzv zza;
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    private zzw zzd = new zzw(this);
    private int zze = 1;

    public static zzv zza(Context context) {
        zzv zzvVar;
        synchronized (zzv.class) {
            if (zza == null) {
                zza = new zzv(context, com.google.android.gms.internal.firebase_messaging.zza.zza().zza(1, new NamedThreadFactory("MessengerIpcClient"), com.google.android.gms.internal.firebase_messaging.zzf.zza));
            }
            zzvVar = zza;
        }
        return zzvVar;
    }

    private zzv(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = scheduledExecutorService;
        this.zzb = context.getApplicationContext();
    }

    public final Task<Void> zza(int i, Bundle bundle) {
        return zza(new zzae(zza(), 2, bundle));
    }

    public final Task<Bundle> zzb(int i, Bundle bundle) {
        return zza(new zzaj(zza(), 1, bundle));
    }

    private final <T> Task<T> zza(zzah<T> zzahVar) {
        Task<T> task;
        synchronized (this) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(zzahVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 9);
                sb.append("Queueing ");
                sb.append(valueOf);
                Log.d("MessengerIpcClient", sb.toString());
            }
            if (!this.zzd.zza((zzah<?>) zzahVar)) {
                zzw zzwVar = new zzw(this);
                this.zzd = zzwVar;
                zzwVar.zza((zzah<?>) zzahVar);
            }
            task = zzahVar.zzb.getTask();
        }
        return task;
    }

    private final int zza() {
        int i;
        synchronized (this) {
            i = this.zze;
            this.zze = i + 1;
        }
        return i;
    }
}
