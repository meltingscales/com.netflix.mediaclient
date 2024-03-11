package com.google.android.gms.measurement.internal;

/* loaded from: classes5.dex */
final class zzfp implements Runnable {
    private final /* synthetic */ zzga zza;
    private final /* synthetic */ zzew zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfp(zzfq zzfqVar, zzga zzgaVar, zzew zzewVar) {
        this.zza = zzgaVar;
        this.zzb = zzewVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zza.zzf() == null) {
            this.zzb.zzf().zza("Install Referrer Reporter is null");
            return;
        }
        zzfl zzf = this.zza.zzf();
        zzf.zza.zzad();
        zzf.zza(zzf.zza.zzn().getPackageName());
    }
}
