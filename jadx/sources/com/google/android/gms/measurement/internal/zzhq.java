package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzhq implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ boolean zze;
    private final /* synthetic */ zzhb zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhq(zzhb zzhbVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.zzf = zzhbVar;
        this.zza = atomicReference;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzf.zzx.zzw().zza(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }
}
