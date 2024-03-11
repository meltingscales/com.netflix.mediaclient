package com.google.android.gms.cast.internal;

/* loaded from: classes2.dex */
final class zzr implements Runnable {
    final /* synthetic */ zzw zza;
    final /* synthetic */ int zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzr(zzv zzvVar, zzw zzwVar, int i) {
        this.zza = zzwVar;
        this.zzb = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzw.zzu(this.zza).onApplicationDisconnected(this.zzb);
    }
}
