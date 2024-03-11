package com.google.android.gms.internal.cast;

/* loaded from: classes5.dex */
public final class zzly extends zzpt {
    private static final zzly zzb;
    private int zze;
    private boolean zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private zzmv zzj;
    private int zzk;

    static {
        zzly zzlyVar = new zzly();
        zzb = zzlyVar;
        zzpt.zzA(zzly.class, zzlyVar);
    }

    private zzly() {
    }

    @Override // com.google.android.gms.internal.cast.zzpt
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return zzpt.zzz(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဉ\u0004\u0006ဌ\u0005", new Object[]{"zze", "zzf", "zzg", zzhb.zza(), "zzh", zzhh.zza(), "zzi", zzfu.zza(), "zzj", "zzk", zzhe.zza()});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzlx(null);
            } else {
                return new zzly();
            }
        }
        return (byte) 1;
    }
}
