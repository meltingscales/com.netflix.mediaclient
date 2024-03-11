package com.google.android.gms.internal.cast;

/* loaded from: classes5.dex */
public final class zzkw extends zzpt {
    private static final zzkw zzb;
    private int zze;
    private int zzf;
    private double zzg;
    private double zzh;
    private double zzi;
    private double zzj;

    static {
        zzkw zzkwVar = new zzkw();
        zzb = zzkwVar;
        zzpt.zzA(zzkw.class, zzkwVar);
    }

    private zzkw() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.zzpt
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return zzpt.zzz(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002က\u0001\u0003က\u0002\u0004က\u0003\u0005က\u0004", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzkv(null);
            } else {
                return new zzkw();
            }
        }
        return (byte) 1;
    }
}
