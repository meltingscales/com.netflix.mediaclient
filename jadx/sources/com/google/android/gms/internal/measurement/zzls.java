package com.google.android.gms.internal.measurement;

/* loaded from: classes5.dex */
public final class zzls implements zzlp {
    private static final zzcl<Boolean> zza;
    private static final zzcl<Boolean> zzb;

    @Override // com.google.android.gms.internal.measurement.zzlp
    public final boolean zza() {
        return zza.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzlp
    public final boolean zzb() {
        return zzb.zzc().booleanValue();
    }

    static {
        zzcr zzcrVar = new zzcr(zzcm.zza("com.google.android.gms.measurement"));
        zza = zzcrVar.zza("measurement.personalized_ads_signals_collection_enabled", true);
        zzb = zzcrVar.zza("measurement.personalized_ads_property_translation_enabled", true);
    }
}
