package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzkt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzjy {
    final /* synthetic */ zzjo zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjy(zzjo zzjoVar) {
        this.zza = zzjoVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        if (zzkt.zzb() && this.zza.zzt().zza(zzap.zzaw)) {
            this.zza.zzd();
            if (this.zza.zzs().zza(this.zza.zzm().currentTimeMillis())) {
                this.zza.zzs().zzm.zza(true);
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                if (runningAppProcessInfo.importance == 100) {
                    this.zza.zzr().zzx().zza("Detected application was in foreground");
                    zzb(this.zza.zzm().currentTimeMillis(), false);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(long j, boolean z) {
        this.zza.zzd();
        this.zza.zzac();
        if (this.zza.zzs().zza(j)) {
            this.zza.zzs().zzm.zza(true);
            this.zza.zzs().zzr.zza(0L);
        }
        if (z && this.zza.zzt().zza(zzap.zzar)) {
            this.zza.zzs().zzq.zza(j);
        }
        if (this.zza.zzs().zzm.zza()) {
            zzb(j, z);
        }
    }

    @VisibleForTesting
    private final void zzb(long j, boolean z) {
        this.zza.zzd();
        if (zzkt.zzb() && this.zza.zzt().zza(zzap.zzaw)) {
            if (!this.zza.zzx.zzab()) {
                return;
            }
            this.zza.zzs().zzq.zza(j);
        }
        this.zza.zzr().zzx().zza("Session started, time", Long.valueOf(this.zza.zzm().elapsedRealtime()));
        Long valueOf = this.zza.zzt().zza(zzap.zzap) ? Long.valueOf(j / 1000) : null;
        this.zza.zzf().zza("auto", "_sid", valueOf, j);
        this.zza.zzs().zzm.zza(false);
        Bundle bundle = new Bundle();
        if (this.zza.zzt().zza(zzap.zzap)) {
            bundle.putLong("_sid", valueOf.longValue());
        }
        if (this.zza.zzt().zza(zzap.zzce) && z) {
            bundle.putLong("_aib", 1L);
        }
        this.zza.zzf().zza("auto", "_s", j, bundle);
        if (com.google.android.gms.internal.measurement.zzkb.zzb() && this.zza.zzt().zza(zzap.zzcl)) {
            String zza = this.zza.zzs().zzw.zza();
            if (!TextUtils.isEmpty(zza)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", zza);
                this.zza.zzf().zza("auto", "_ssr", j, bundle2);
            }
        }
        if (zzkt.zzb() && this.zza.zzt().zza(zzap.zzaw)) {
            return;
        }
        this.zza.zzs().zzq.zza(j);
    }
}
