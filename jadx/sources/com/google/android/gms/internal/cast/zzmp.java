package com.google.android.gms.internal.cast;

/* loaded from: classes5.dex */
public final class zzmp extends zzpt {
    private static final zzmp zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private byte zzi = 2;

    static {
        zzmp zzmpVar = new zzmp();
        zzb = zzmpVar;
        zzpt.zzA(zzmp.class, zzmpVar);
    }

    private zzmp() {
    }

    @Override // com.google.android.gms.internal.cast.zzpt
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return zzpt.zzz(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᔌ\u0000\u0002င\u0001\u0003ဌ\u0002", new Object[]{"zze", "zzf", zzhz.zza(), "zzg", "zzh", zzkn.zza()});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        this.zzi = obj == null ? (byte) 0 : (byte) 1;
                        return null;
                    }
                    return zzb;
                }
                return new zzmo(null);
            } else {
                return new zzmp();
            }
        }
        return Byte.valueOf(this.zzi);
    }
}
