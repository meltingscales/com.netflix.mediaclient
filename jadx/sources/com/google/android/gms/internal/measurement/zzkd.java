package com.google.android.gms.internal.measurement;

/* loaded from: classes5.dex */
public final class zzkd implements zzke {
    private static final zzcl<Boolean> zza = new zzcr(zzcm.zza("com.google.android.gms.measurement")).zza("measurement.client.firebase_feature_rollout.v1.enable", true);

    @Override // com.google.android.gms.internal.measurement.zzke
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final boolean zzb() {
        return zza.zzc().booleanValue();
    }
}
