package com.google.android.gms.internal.cast;

/* loaded from: classes5.dex */
public final class zzmf extends zzpt {
    private static final zzmf zzb;
    private int zze;
    private int zzf;

    static {
        zzmf zzmfVar = new zzmf();
        zzb = zzmfVar;
        zzpt.zzA(zzmf.class, zzmfVar);
    }

    private zzmf() {
    }

    @Override // com.google.android.gms.internal.cast.zzpt
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return zzpt.zzz(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zze", "zzf", zzhn.zza()});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzme(null);
            } else {
                return new zzmf();
            }
        }
        return (byte) 1;
    }
}
