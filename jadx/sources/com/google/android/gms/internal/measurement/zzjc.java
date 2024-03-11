package com.google.android.gms.internal.measurement;

/* loaded from: classes5.dex */
public final class zzjc implements zzcz<zzjb> {
    private static zzjc zza = new zzjc();
    private final zzcz<zzjb> zzb;

    public static boolean zzb() {
        return ((zzjb) zza.zza()).zza();
    }

    private zzjc(zzcz<zzjb> zzczVar) {
        this.zzb = zzdc.zza((zzcz) zzczVar);
    }

    public zzjc() {
        this(zzdc.zza(new zzje()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ zzjb zza() {
        return this.zzb.zza();
    }
}
