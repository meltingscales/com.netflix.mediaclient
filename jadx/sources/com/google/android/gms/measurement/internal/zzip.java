package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzip implements Runnable {
    private final /* synthetic */ zzm zza;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzn zzb;
    private final /* synthetic */ zzij zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzip(zzij zzijVar, zzm zzmVar, com.google.android.gms.internal.measurement.zzn zznVar) {
        this.zzc = zzijVar;
        this.zza = zzmVar;
        this.zzb = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeo zzeoVar;
        try {
            zzeoVar = this.zzc.zzb;
            if (zzeoVar == null) {
                this.zzc.zzr().zzf().zza("Failed to get app instance id");
                return;
            }
            String zzc = zzeoVar.zzc(this.zza);
            if (zzc != null) {
                this.zzc.zzf().zza(zzc);
                this.zzc.zzs().zzj.zza(zzc);
            }
            this.zzc.zzaj();
            this.zzc.zzp().zza(this.zzb, zzc);
        } catch (RemoteException e) {
            this.zzc.zzr().zzf().zza("Failed to get app instance id", e);
        } finally {
            this.zzc.zzp().zza(this.zzb, (String) null);
        }
    }
}
