package com.google.android.gms.internal.cast;

/* loaded from: classes2.dex */
public final class zzmh extends zzpt {
    private static final zzmh zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzmh zzmhVar = new zzmh();
        zzb = zzmhVar;
        zzpt.zzA(zzmh.class, zzmhVar);
    }

    private zzmh() {
    }

    @Override // com.google.android.gms.internal.cast.zzpt
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return zzpt.zzz(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", zzhn.zza(), "zzg", "zzh"});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzmg(null);
            } else {
                return new zzmh();
            }
        }
        return (byte) 1;
    }
}
