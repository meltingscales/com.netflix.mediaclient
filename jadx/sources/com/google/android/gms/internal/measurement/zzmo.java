package com.google.android.gms.internal.measurement;

/* loaded from: classes5.dex */
public final class zzmo implements zzcz<zzmn> {
    private static zzmo zza = new zzmo();
    private final zzcz<zzmn> zzb;

    public static boolean zzb() {
        return ((zzmn) zza.zza()).zza();
    }

    public static boolean zzc() {
        return ((zzmn) zza.zza()).zzb();
    }

    public static boolean zzd() {
        return ((zzmn) zza.zza()).zzc();
    }

    private zzmo(zzcz<zzmn> zzczVar) {
        this.zzb = zzdc.zza((zzcz) zzczVar);
    }

    public zzmo() {
        this(zzdc.zza(new zzmq()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ zzmn zza() {
        return this.zzb.zza();
    }
}
