package com.google.android.gms.internal.measurement;

/* loaded from: classes5.dex */
public final class zzjr implements zzjs {
    private static final zzcl<Boolean> zza;
    private static final zzcl<Long> zzb;

    @Override // com.google.android.gms.internal.measurement.zzjs
    public final boolean zza() {
        return zza.zzc().booleanValue();
    }

    static {
        zzcr zzcrVar = new zzcr(zzcm.zza("com.google.android.gms.measurement"));
        zza = zzcrVar.zza("measurement.upload_dsid_enabled", true);
        zzb = zzcrVar.zza("measurement.id.upload_dsid_enabled", 0L);
    }
}
