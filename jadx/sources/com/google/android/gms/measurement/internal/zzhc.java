package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes5.dex */
public final class zzhc {
    final Context zza;
    String zzb;
    String zzc;
    String zzd;
    Boolean zze;
    long zzf;
    com.google.android.gms.internal.measurement.zzv zzg;
    boolean zzh;

    @VisibleForTesting
    public zzhc(Context context, com.google.android.gms.internal.measurement.zzv zzvVar) {
        this.zzh = true;
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.zza = applicationContext;
        if (zzvVar != null) {
            this.zzg = zzvVar;
            this.zzb = zzvVar.zzf;
            this.zzc = zzvVar.zze;
            this.zzd = zzvVar.zzd;
            this.zzh = zzvVar.zzc;
            this.zzf = zzvVar.zzb;
            Bundle bundle = zzvVar.zzg;
            if (bundle != null) {
                this.zze = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
