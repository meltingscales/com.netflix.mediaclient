package com.google.android.gms.internal.measurement;

/* loaded from: classes5.dex */
public final class zzkb implements zzcz<zzke> {
    private static zzkb zza = new zzkb();
    private final zzcz<zzke> zzb;

    public static boolean zzb() {
        return ((zzke) zza.zza()).zza();
    }

    public static boolean zzc() {
        return ((zzke) zza.zza()).zzb();
    }

    private zzkb(zzcz<zzke> zzczVar) {
        this.zzb = zzdc.zza((zzcz) zzczVar);
    }

    public zzkb() {
        this(zzdc.zza(new zzkd()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ zzke zza() {
        return this.zzb.zza();
    }
}
