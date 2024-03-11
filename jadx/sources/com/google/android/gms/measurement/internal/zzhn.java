package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzhn implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ zzhb zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhn(zzhb zzhbVar, AtomicReference atomicReference) {
        this.zzb = zzhbVar;
        this.zza = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza) {
            this.zza.set(this.zzb.zzt().zzg(this.zzb.zzg().zzab()));
            this.zza.notify();
        }
    }
}
