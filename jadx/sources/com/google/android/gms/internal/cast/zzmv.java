package com.google.android.gms.internal.cast;

/* loaded from: classes5.dex */
public final class zzmv extends zzpt {
    private static final zzmv zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private int zzj;
    private int zzk;

    static {
        zzmv zzmvVar = new zzmv();
        zzb = zzmvVar;
        zzpt.zzA(zzmv.class, zzmvVar);
    }

    private zzmv() {
    }

    @Override // com.google.android.gms.internal.cast.zzpt
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return zzpt.zzz(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဌ\u0004\u0006ဆ\u0005", new Object[]{"zze", "zzf", "zzg", zzif.zza(), "zzh", "zzi", "zzj", zzgs.zza(), "zzk"});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzmu(null);
            } else {
                return new zzmv();
            }
        }
        return (byte) 1;
    }
}
