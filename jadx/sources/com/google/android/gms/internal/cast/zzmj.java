package com.google.android.gms.internal.cast;

/* loaded from: classes5.dex */
public final class zzmj extends zzpt {
    private static final zzmj zzb;
    private int zze;
    private zzqb zzf = zzpt.zzw();
    private boolean zzg;
    private boolean zzh;

    static {
        zzmj zzmjVar = new zzmj();
        zzb = zzmjVar;
        zzpt.zzA(zzmj.class, zzmjVar);
    }

    private zzmj() {
    }

    @Override // com.google.android.gms.internal.cast.zzpt
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return zzpt.zzz(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000\u0003ဇ\u0001", new Object[]{"zze", "zzf", zzmb.class, "zzg", "zzh"});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzmi(null);
            } else {
                return new zzmj();
            }
        }
        return (byte) 1;
    }
}
