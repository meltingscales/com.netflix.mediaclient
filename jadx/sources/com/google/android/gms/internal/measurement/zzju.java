package com.google.android.gms.internal.measurement;

/* loaded from: classes5.dex */
public final class zzju implements zzcz<zzjt> {
    private static zzju zza = new zzju();
    private final zzcz<zzjt> zzb;

    public static boolean zzb() {
        return ((zzjt) zza.zza()).zza();
    }

    public static boolean zzc() {
        return ((zzjt) zza.zza()).zzb();
    }

    private zzju(zzcz<zzjt> zzczVar) {
        this.zzb = zzdc.zza((zzcz) zzczVar);
    }

    public zzju() {
        this(zzdc.zza(new zzjw()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ zzjt zza() {
        return this.zzb.zza();
    }
}
