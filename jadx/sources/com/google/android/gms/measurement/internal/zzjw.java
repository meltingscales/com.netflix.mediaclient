package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzkt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzjw {
    @VisibleForTesting
    private long zza;
    @VisibleForTesting
    private long zzb;
    private final zzaf zzc;
    private final /* synthetic */ zzjo zzd;

    public zzjw(zzjo zzjoVar) {
        this.zzd = zzjoVar;
        this.zzc = new zzjv(this, zzjoVar.zzx);
        long elapsedRealtime = zzjoVar.zzm().elapsedRealtime();
        this.zza = elapsedRealtime;
        this.zzb = elapsedRealtime;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(long j) {
        this.zzd.zzd();
        this.zzc.zzc();
        this.zza = j;
        this.zzb = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(long j) {
        this.zzc.zzc();
        if (this.zza != 0) {
            this.zzd.zzs().zzr.zza(this.zzd.zzs().zzr.zza() + (j - this.zza));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        this.zzc.zzc();
        this.zza = 0L;
        this.zzb = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc() {
        this.zzd.zzd();
        zza(false, false);
        this.zzd.zze().zza(this.zzd.zzm().elapsedRealtime());
    }

    public final boolean zza(boolean z, boolean z2) {
        this.zzd.zzd();
        this.zzd.zzw();
        long elapsedRealtime = this.zzd.zzm().elapsedRealtime();
        if (!zzkt.zzb() || !this.zzd.zzt().zza(zzap.zzcm) || this.zzd.zzx.zzab()) {
            this.zzd.zzs().zzq.zza(this.zzd.zzm().currentTimeMillis());
        }
        long j = elapsedRealtime - this.zza;
        if (!z && j < 1000) {
            this.zzd.zzr().zzx().zza("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j));
            return false;
        }
        this.zzd.zzs().zzr.zza(j);
        this.zzd.zzr().zzx().zza("Recording user engagement, ms", Long.valueOf(j));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j);
        zzii.zza(this.zzd.zzi().zzab(), bundle, true);
        if (this.zzd.zzt().zze(this.zzd.zzg().zzab(), zzap.zzay)) {
            if (this.zzd.zzt().zza(zzap.zzaz)) {
                if (!z2) {
                    zzb();
                }
            } else if (z2) {
                bundle.putLong("_fr", 1L);
            } else {
                zzb();
            }
        }
        if (!this.zzd.zzt().zza(zzap.zzaz) || !z2) {
            this.zzd.zzf().zza("auto", "_e", bundle);
        }
        this.zza = elapsedRealtime;
        this.zzc.zzc();
        this.zzc.zza(Math.max(0L, 3600000 - this.zzd.zzs().zzr.zza()));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final long zzb() {
        long elapsedRealtime = this.zzd.zzm().elapsedRealtime();
        long j = this.zzb;
        this.zzb = elapsedRealtime;
        return elapsedRealtime - j;
    }
}
