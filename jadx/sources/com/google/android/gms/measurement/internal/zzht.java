package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzht implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ zzhb zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzht(zzhb zzhbVar, boolean z) {
        this.zzb = zzhbVar;
        this.zza = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zzab = this.zzb.zzx.zzab();
        boolean zzaa = this.zzb.zzx.zzaa();
        this.zzb.zzx.zza(this.zza);
        if (zzaa == this.zza) {
            this.zzb.zzx.zzr().zzx().zza("Default data collection state already set to", Boolean.valueOf(this.zza));
        }
        if (this.zzb.zzx.zzab() == zzab || this.zzb.zzx.zzab() != this.zzb.zzx.zzaa()) {
            this.zzb.zzx.zzr().zzk().zza("Default data collection is different than actual status", Boolean.valueOf(this.zza), Boolean.valueOf(zzab));
        }
        this.zzb.zzam();
    }
}
