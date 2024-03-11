package com.google.android.gms.internal.measurement;

/* loaded from: classes5.dex */
public final class zzko implements zzkl {
    private static final zzcl<Boolean> zza;
    private static final zzcl<Long> zzb;

    @Override // com.google.android.gms.internal.measurement.zzkl
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzkl
    public final boolean zzb() {
        return zza.zzc().booleanValue();
    }

    static {
        zzcr zzcrVar = new zzcr(zzcm.zza("com.google.android.gms.measurement"));
        zza = zzcrVar.zza("measurement.service.fix_gmp_version", false);
        zzb = zzcrVar.zza("measurement.id.service.fix_gmp_version", 0L);
    }
}
