package com.google.android.gms.internal.cast;

/* loaded from: classes5.dex */
public final class zzkr extends zzpt {
    private static final zzpz zzb = new zzkp();
    private static final zzkr zze;
    private int zzf;
    private String zzg = "";
    private String zzh = "";
    private zzpy zzi = zzpt.zzu();

    static {
        zzkr zzkrVar = new zzkr();
        zze = zzkrVar;
        zzpt.zzA(zzkr.class, zzkrVar);
    }

    private zzkr() {
    }

    @Override // com.google.android.gms.internal.cast.zzpt
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return zzpt.zzz(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001e", new Object[]{"zzf", "zzg", "zzh", "zzi", zzkk.zzc()});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zze;
                }
                return new zzkq(null);
            } else {
                return new zzkr();
            }
        }
        return (byte) 1;
    }
}
