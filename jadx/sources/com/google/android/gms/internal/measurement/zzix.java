package com.google.android.gms.internal.measurement;

/* loaded from: classes5.dex */
public final class zzix implements zzcz<zzja> {
    private static zzix zza = new zzix();
    private final zzcz<zzja> zzb;

    public static boolean zzb() {
        return ((zzja) zza.zza()).zza();
    }

    private zzix(zzcz<zzja> zzczVar) {
        this.zzb = zzdc.zza((zzcz) zzczVar);
    }

    public zzix() {
        this(zzdc.zza(new zziz()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ zzja zza() {
        return this.zzb.zza();
    }
}
