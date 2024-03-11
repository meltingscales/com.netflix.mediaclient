package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class zzaf {
    private static volatile Handler zzb;
    private final zzgt zza;
    private final Runnable zzc;
    private volatile long zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaf(zzgt zzgtVar) {
        Preconditions.checkNotNull(zzgtVar);
        this.zza = zzgtVar;
        this.zzc = new zzai(this, zzgtVar);
    }

    public abstract void zza();

    public final boolean zzb() {
        return this.zzd != 0;
    }

    public final void zza(long j) {
        zzc();
        if (j >= 0) {
            this.zzd = this.zza.zzm().currentTimeMillis();
            if (zzd().postDelayed(this.zzc, j)) {
                return;
            }
            this.zza.zzr().zzf().zza("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc() {
        this.zzd = 0L;
        zzd().removeCallbacks(this.zzc);
    }

    private final Handler zzd() {
        Handler handler;
        if (zzb != null) {
            return zzb;
        }
        synchronized (zzaf.class) {
            if (zzb == null) {
                zzb = new com.google.android.gms.internal.measurement.zzj(this.zza.zzn().getMainLooper());
            }
            handler = zzb;
        }
        return handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ long zza(zzaf zzafVar, long j) {
        zzafVar.zzd = 0L;
        return 0L;
    }
}
