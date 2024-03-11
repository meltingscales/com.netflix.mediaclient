package com.google.android.gms.internal.cast;

/* loaded from: classes5.dex */
public final class zzmb extends zzpt {
    private static final zzpz zzb = new zzlz();
    private static final zzmb zze;
    private int zzf;
    private boolean zzh;
    private zzoe zzi;
    private boolean zzj;
    private String zzg = "";
    private zzpy zzk = zzpt.zzu();

    static {
        zzmb zzmbVar = new zzmb();
        zze = zzmbVar;
        zzpt.zzA(zzmb.class, zzmbVar);
    }

    private zzmb() {
    }

    @Override // com.google.android.gms.internal.cast.zzpt
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return zzpt.zzz(zze, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005,", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzke.zza()});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zze;
                }
                return new zzma(null);
            } else {
                return new zzmb();
            }
        }
        return (byte) 1;
    }
}
