package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.internal.measurement.zzks;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzjp {
    final /* synthetic */ zzjo zza;
    private zzju zzb;
    private final Runnable zzc = new Runnable(this) { // from class: com.google.android.gms.measurement.internal.zzjs
        private final zzjp zza;

        /* JADX INFO: Access modifiers changed from: package-private */
        {
            this.zza = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            zzjp zzjpVar = this.zza;
            zzjpVar.zza.zzq().zza(new Runnable(zzjpVar) { // from class: com.google.android.gms.measurement.internal.zzjr
                private final zzjp zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzjpVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzjp zzjpVar2 = this.zza;
                    zzjpVar2.zza.zzd();
                    zzjpVar2.zza.zzr().zzw().zza("Application backgrounded");
                    zzjpVar2.zza.zzf().zzb("auto", "_ab", new Bundle());
                }
            });
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjp(zzjo zzjoVar) {
        this.zza = zzjoVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        Handler handler;
        Handler handler2;
        this.zza.zzd();
        if (this.zza.zzt().zza(zzap.zzcd)) {
            if (!zzks.zzb() || !this.zza.zzt().zze(this.zza.zzg().zzab(), zzap.zzcq)) {
                handler = this.zza.zzc;
                handler.removeCallbacks(this.zzc);
            } else if (this.zzb != null) {
                handler2 = this.zza.zzc;
                handler2.removeCallbacks(this.zzb);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb() {
        Handler handler;
        Handler handler2;
        if (this.zza.zzt().zza(zzap.zzcd)) {
            if (zzks.zzb() && this.zza.zzt().zze(this.zza.zzg().zzab(), zzap.zzcq)) {
                this.zzb = new zzju(this, this.zza.zzm().currentTimeMillis());
                handler2 = this.zza.zzc;
                handler2.postDelayed(this.zzb, 2000L);
                return;
            }
            handler = this.zza.zzc;
            handler.postDelayed(this.zzc, 2000L);
        }
    }
}
