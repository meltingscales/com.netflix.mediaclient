package com.google.android.gms.internal.measurement;

/* loaded from: classes5.dex */
public final class zzle implements zzcz<zzld> {
    private static zzle zza = new zzle();
    private final zzcz<zzld> zzb;

    public static boolean zzb() {
        return ((zzld) zza.zza()).zza();
    }

    public static boolean zzc() {
        return ((zzld) zza.zza()).zzb();
    }

    private zzle(zzcz<zzld> zzczVar) {
        this.zzb = zzdc.zza((zzcz) zzczVar);
    }

    public zzle() {
        this(zzdc.zza(new zzlg()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ zzld zza() {
        return this.zzb.zza();
    }
}
