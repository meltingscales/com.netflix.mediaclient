package com.google.android.gms.internal.measurement;

/* loaded from: classes5.dex */
public final class zziz implements zzja {
    private static final zzcl<Boolean> zza;
    private static final zzcl<Long> zzb;

    @Override // com.google.android.gms.internal.measurement.zzja
    public final boolean zza() {
        return zza.zzc().booleanValue();
    }

    static {
        zzcr zzcrVar = new zzcr(zzcm.zza("com.google.android.gms.measurement"));
        zza = zzcrVar.zza("measurement.app_launch.event_ordering_fix", false);
        zzb = zzcrVar.zza("measurement.id.app_launch.event_ordering_fix", 0L);
    }
}
