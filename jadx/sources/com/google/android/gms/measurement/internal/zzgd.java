package com.google.android.gms.measurement.internal;

/* loaded from: classes5.dex */
final class zzgd implements Runnable {
    private final /* synthetic */ zzv zza;
    private final /* synthetic */ zzgb zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgd(zzgb zzgbVar, zzv zzvVar) {
        this.zzb = zzgbVar;
        this.zza = zzvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzke zzkeVar;
        zzke zzkeVar2;
        zzke zzkeVar3;
        zzkeVar = this.zzb.zza;
        zzkeVar.zzo();
        if (this.zza.zzc.zza() == null) {
            zzkeVar3 = this.zzb.zza;
            zzkeVar3.zzb(this.zza);
            return;
        }
        zzkeVar2 = this.zzb.zza;
        zzkeVar2.zza(this.zza);
    }
}
