package com.google.android.gms.internal.cast;

/* loaded from: classes5.dex */
public final class zzlq extends zzpt {
    private static final zzlq zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private zzkw zzh;

    static {
        zzlq zzlqVar = new zzlq();
        zzb = zzlqVar;
        zzpt.zzA(zzlq.class, zzlqVar);
    }

    private zzlq() {
    }

    @Override // com.google.android.gms.internal.cast.zzpt
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return zzpt.zzz(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", zzgv.zza(), "zzg", "zzh"});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzlp(null);
            } else {
                return new zzlq();
            }
        }
        return (byte) 1;
    }
}
