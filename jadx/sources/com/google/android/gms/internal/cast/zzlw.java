package com.google.android.gms.internal.cast;

/* loaded from: classes5.dex */
public final class zzlw extends zzpt {
    private static final zzlw zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private zzqb zzi = zzpt.zzw();

    static {
        zzlw zzlwVar = new zzlw();
        zzb = zzlwVar;
        zzpt.zzA(zzlw.class, zzlwVar);
    }

    private zzlw() {
    }

    @Override // com.google.android.gms.internal.cast.zzpt
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return zzpt.zzz(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzlv.class});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzlt(null);
            } else {
                return new zzlw();
            }
        }
        return (byte) 1;
    }
}
