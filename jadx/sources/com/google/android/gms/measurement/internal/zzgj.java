package com.google.android.gms.measurement.internal;

/* loaded from: classes5.dex */
final class zzgj implements Runnable {
    private final /* synthetic */ zzan zza;
    private final /* synthetic */ zzm zzb;
    private final /* synthetic */ zzgb zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgj(zzgb zzgbVar, zzan zzanVar, zzm zzmVar) {
        this.zzc = zzgbVar;
        this.zza = zzanVar;
        this.zzb = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzke zzkeVar;
        zzke zzkeVar2;
        zzan zzb = this.zzc.zzb(this.zza, this.zzb);
        zzkeVar = this.zzc.zza;
        zzkeVar.zzo();
        zzkeVar2 = this.zzc.zza;
        zzkeVar2.zza(zzb, this.zzb);
    }
}
