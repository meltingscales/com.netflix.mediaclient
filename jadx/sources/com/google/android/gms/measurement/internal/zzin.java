package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzin implements Runnable {
    private final /* synthetic */ zzm zza;
    private final /* synthetic */ zzij zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzin(zzij zzijVar, zzm zzmVar) {
        this.zzb = zzijVar;
        this.zza = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeo zzeoVar;
        zzeoVar = this.zzb.zzb;
        if (zzeoVar == null) {
            this.zzb.zzr().zzf().zza("Failed to reset data on the service; null service");
            return;
        }
        try {
            zzeoVar.zzd(this.zza);
        } catch (RemoteException e) {
            this.zzb.zzr().zzf().zza("Failed to reset data on the service", e);
        }
        this.zzb.zzaj();
    }
}
