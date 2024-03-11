package com.google.android.gms.internal.cast;

/* loaded from: classes5.dex */
public final class zznh extends zzpt {
    private static final zznh zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zznh zznhVar = new zznh();
        zzb = zznhVar;
        zzpt.zzA(zznh.class, zznhVar);
    }

    private zznh() {
    }

    @Override // com.google.android.gms.internal.cast.zzpt
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return zzpt.zzz(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", zzio.zza(), "zzh"});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzng(null);
            } else {
                return new zznh();
            }
        }
        return (byte) 1;
    }
}
