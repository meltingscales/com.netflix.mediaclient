package com.google.android.gms.internal.measurement;

/* loaded from: classes5.dex */
public final class zzks implements zzcz<zzkr> {
    private static zzks zza = new zzks();
    private final zzcz<zzkr> zzb;

    public static boolean zzb() {
        return ((zzkr) zza.zza()).zza();
    }

    public static boolean zzc() {
        return ((zzkr) zza.zza()).zzb();
    }

    private zzks(zzcz<zzkr> zzczVar) {
        this.zzb = zzdc.zza((zzcz) zzczVar);
    }

    public zzks() {
        this(zzdc.zza(new zzku()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ zzkr zza() {
        return this.zzb.zza();
    }
}
