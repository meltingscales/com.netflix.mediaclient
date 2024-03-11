package com.google.android.gms.internal.cast;

/* loaded from: classes5.dex */
public final class zzob extends zzpt {
    private static final zzob zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private zzqb zzh = zzpt.zzw();
    private zzqb zzi = zzpt.zzw();
    private int zzj;

    static {
        zzob zzobVar = new zzob();
        zzb = zzobVar;
        zzpt.zzA(zzob.class, zzobVar);
    }

    private zzob() {
    }

    @Override // com.google.android.gms.internal.cast.zzpt
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return zzpt.zzz(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003\u001b\u0004\u001b\u0005ဌ\u0002", new Object[]{"zze", "zzf", zzjy.zza(), "zzg", zzkb.zza(), "zzh", zzls.class, "zzi", zzls.class, "zzj", zzhb.zza()});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzoa(null);
            } else {
                return new zzob();
            }
        }
        return (byte) 1;
    }
}
