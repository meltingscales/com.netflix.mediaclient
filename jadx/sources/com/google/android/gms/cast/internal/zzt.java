package com.google.android.gms.cast.internal;

/* loaded from: classes2.dex */
final class zzt implements Runnable {
    final /* synthetic */ zzw zza;
    final /* synthetic */ zza zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzt(zzv zzvVar, zzw zzwVar, zza zzaVar) {
        this.zza = zzwVar;
        this.zzb = zzaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzw.zzH(this.zza, this.zzb);
    }
}
