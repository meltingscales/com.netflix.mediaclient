package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* loaded from: classes5.dex */
final class zzhx implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ Uri zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ zzhy zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhx(zzhy zzhyVar, boolean z, Uri uri, String str, String str2) {
        this.zze = zzhyVar;
        this.zza = z;
        this.zzb = uri;
        this.zzc = str;
        this.zzd = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zza(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
