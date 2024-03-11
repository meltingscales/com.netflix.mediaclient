package com.google.android.gms.internal.cast;

/* loaded from: classes2.dex */
public final class zznp extends zzpt {
    private static final zznp zzb;
    private int zze;
    private String zzf = "";
    private zzqb zzg = zzpt.zzw();
    private zzqb zzh = zzpt.zzw();
    private boolean zzi;

    static {
        zznp zznpVar = new zznp();
        zzb = zznpVar;
        zzpt.zzA(zznp.class, zznpVar);
    }

    private zznp() {
    }

    @Override // com.google.android.gms.internal.cast.zzpt
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return zzpt.zzz(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001", new Object[]{"zze", "zzf", "zzg", zzmh.class, "zzh", zzls.class, "zzi"});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzno(null);
            } else {
                return new zznp();
            }
        }
        return (byte) 1;
    }
}
