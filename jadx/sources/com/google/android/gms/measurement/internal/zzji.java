package com.google.android.gms.measurement.internal;

/* loaded from: classes5.dex */
final class zzji implements Runnable {
    private final /* synthetic */ zzjb zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzji(zzjb zzjbVar) {
        this.zza = zzjbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzij.zza(this.zza.zza, (zzeo) null);
        this.zza.zza.zzal();
    }
}
