package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzio implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ zzm zzb;
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ zzij zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzio(zzij zzijVar, AtomicReference atomicReference, zzm zzmVar, boolean z) {
        this.zzd = zzijVar;
        this.zza = atomicReference;
        this.zzb = zzmVar;
        this.zzc = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeo zzeoVar;
        synchronized (this.zza) {
            try {
                zzeoVar = this.zzd.zzb;
            } catch (RemoteException e) {
                this.zzd.zzr().zzf().zza("Failed to get user properties", e);
                this.zza.notify();
            }
            if (zzeoVar == null) {
                this.zzd.zzr().zzf().zza("Failed to get user properties");
                this.zza.notify();
                return;
            }
            this.zza.set(zzeoVar.zza(this.zzb, this.zzc));
            this.zzd.zzaj();
            this.zza.notify();
        }
    }
}
