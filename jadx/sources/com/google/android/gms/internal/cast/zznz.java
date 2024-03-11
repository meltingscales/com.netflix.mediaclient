package com.google.android.gms.internal.cast;

/* loaded from: classes5.dex */
public final class zznz extends zzpt {
    private static final zznz zzb;
    private int zze;
    private int zzf;
    private zzqb zzg = zzpt.zzw();
    private zzqb zzh = zzpt.zzw();
    private int zzi;

    static {
        zznz zznzVar = new zznz();
        zzb = zznzVar;
        zzpt.zzA(zznz.class, zznzVar);
    }

    private zznz() {
    }

    @Override // com.google.android.gms.internal.cast.zzpt
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return zzpt.zzz(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဌ\u0000\u0002\u001b\u0003\u001b\u0004င\u0001", new Object[]{"zze", "zzf", zzjv.zza(), "zzg", zznd.class, "zzh", zznd.class, "zzi"});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzny(null);
            } else {
                return new zznz();
            }
        }
        return (byte) 1;
    }
}
