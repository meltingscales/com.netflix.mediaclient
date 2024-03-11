package com.google.android.gms.internal.cast;

/* loaded from: classes5.dex */
public final class zznr extends zzpt {
    private static final zznr zzb;
    private int zze;
    private zzkw zzf;

    static {
        zznr zznrVar = new zznr();
        zzb = zznrVar;
        zzpt.zzA(zznr.class, zznrVar);
    }

    private zznr() {
    }

    @Override // com.google.android.gms.internal.cast.zzpt
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return zzpt.zzz(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zznq(null);
            } else {
                return new zznr();
            }
        }
        return (byte) 1;
    }
}
