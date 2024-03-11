package com.google.android.gms.tflite.dynamite.internal;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.tflite.zzl;

/* loaded from: classes5.dex */
public final class zzk {
    public static final long zza;
    private static final String zzb;
    private final Context zzc;
    private final CustomerInfo zzd;
    private final com.google.android.gms.tflite.dynamite.zzc zze;
    private final int zzf;
    private final boolean zzg;

    static {
        Feature feature = zzl.zza;
        zzb = "com.google.android.gms.".concat(String.valueOf(feature.getName()));
        zza = feature.getVersion();
    }

    private zzk(Context context, CustomerInfo customerInfo, com.google.android.gms.tflite.dynamite.zzc zzcVar, int i, boolean z, boolean z2) {
        this.zzc = context;
        this.zzd = customerInfo;
        this.zze = zzcVar;
        this.zzf = i;
        this.zzg = z;
    }

    public static zzj zza(Context context, long j) {
        zza zzaVar = new zza(DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION);
        DynamiteModule load = DynamiteModule.load(context, zzaVar, zzb);
        int zza2 = zzaVar.zza();
        if (zza2 == 0 || zza2 >= j) {
            return new zzj(load, zza2);
        }
        throw new IllegalStateException(String.format("Dynamite module version %d does not meet minimum requirement of %d", Integer.valueOf(zza2), Long.valueOf(j)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzk zzb(Context context, CustomerInfo customerInfo, boolean z, boolean z2) {
        zzj zza2 = zza(context, z ? 221902000L : zza);
        return new zzk(context, customerInfo, com.google.android.gms.tflite.dynamite.zzb.zza(zza2.zzb("com.google.android.gms.tflite.dynamite.TfLiteDynamiteLoaderImpl")), zza2.zza(), z, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object zzc() {
        if (this.zzf < 221902000) {
            Preconditions.checkState(!this.zzg);
            if (this.zzf < 214812000) {
                long zzd = this.zze.zzd(ObjectWrapper.wrap(this.zzc), this.zzd);
                Context context = this.zzc;
                return new zze(zzd, ObjectWrapper.unwrap(com.google.android.gms.tflite.dynamite.zze.zza(zza(context, zza).zzb("com.google.android.gms.tflite.dynamite.TfLiteLoggerCreator")).zzd(ObjectWrapper.wrap(context), this.zzd)), false);
            }
            return ObjectWrapper.unwrap(this.zze.zze(ObjectWrapper.wrap(this.zzc), this.zzd));
        }
        return ObjectWrapper.unwrap(this.zze.zzf(ObjectWrapper.wrap(this.zzc), new zzc(this.zzd, this.zzg, false)));
    }
}
