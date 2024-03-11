package com.google.android.gms.internal.cast;

/* loaded from: classes2.dex */
public final class zzle extends zzpt {
    private static final zzle zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        zzle zzleVar = new zzle();
        zzb = zzleVar;
        zzpt.zzA(zzle.class, zzleVar);
    }

    private zzle() {
    }

    @Override // com.google.android.gms.internal.cast.zzpt
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return zzpt.zzz(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဌ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", zzhw.zza(), "zzi"});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzld(null);
            } else {
                return new zzle();
            }
        }
        return (byte) 1;
    }
}
