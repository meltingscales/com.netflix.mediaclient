package com.google.android.gms.measurement.internal;

/* loaded from: classes5.dex */
final class zzjq implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zzjo zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjq(zzjo zzjoVar, long j) {
        this.zzb = zzjoVar;
        this.zza = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
    }
}
