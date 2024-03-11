package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzir implements Runnable {
    private final /* synthetic */ zzif zza;
    private final /* synthetic */ zzij zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzir(zzij zzijVar, zzif zzifVar) {
        this.zzb = zzijVar;
        this.zza = zzifVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeo zzeoVar;
        zzeoVar = this.zzb.zzb;
        if (zzeoVar == null) {
            this.zzb.zzr().zzf().zza("Failed to send current screen to service");
            return;
        }
        try {
            zzif zzifVar = this.zza;
            if (zzifVar == null) {
                zzeoVar.zza(0L, (String) null, (String) null, this.zzb.zzn().getPackageName());
            } else {
                zzeoVar.zza(zzifVar.zzc, zzifVar.zza, zzifVar.zzb, this.zzb.zzn().getPackageName());
            }
            this.zzb.zzaj();
        } catch (RemoteException e) {
            this.zzb.zzr().zzf().zza("Failed to send current screen to the service", e);
        }
    }
}
